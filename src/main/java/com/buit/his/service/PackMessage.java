package com.buit.his.service;

import com.buit.commons.BaseException;
import com.buit.constans.SysXtcsCsmcCts;
import com.buit.his.dao.PackDao;
import com.buit.his.request.PackMedSendReqXml;
import com.buit.his.request.PackMedSendXml;
import com.buit.his.request.PackMess;
import com.buit.his.ws.pack.PrescriptionService;
import com.buit.his.ws.pack.PrescriptionServiceSoap;
import com.buit.mq.HandlerConsumer;
import com.buit.system.service.SysXtcsCacheSer;
import com.buit.util.XmlUtil;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 包药机
 * Created by sg on 2021/4/15.
 */
@Service
public class PackMessage implements HandlerConsumer<PackMess> {

    static final Logger logger = LoggerFactory.getLogger(PackMessage.class);

    @Autowired
    private PackDao packDao;
    @DubboReference
    private SysXtcsCacheSer sysXtcsCacheSer;
    @Value(value = "${pack.url}")
    private String packUrl;
    @Override
    public void handler(PackMess packMess) throws Exception {
        logger.info("包药jlid:" + packMess.getJlid());
        Map<String, Object> retMap = packDao.queryLxByJlid(packMess.getJlid());
        if(retMap == null){
            throw BaseException.create("ERROR_PACK_0001");
        }
        Integer lx = Integer.valueOf(retMap.get("fyfs").toString());
        Integer jgid = Integer.valueOf(retMap.get("jgid").toString());
        String qyJk = sysXtcsCacheSer.getCsz(jgid, SysXtcsCsmcCts.QYPACKMEDJK);
        if("1".equals(qyJk)){
            if(lx != null && lx == 2){
                long cnt = packDao.queryCountByJlid(packMess.getJlid());
                if(cnt > 0){
                    throw  BaseException.create("ERROR_PACK_0002");
                }
                List<PackMedSendReqXml> list = packDao.queryMedList(packMess.getJlid());
                Map<String, Object> msgHeader = new HashMap<>();
                msgHeader.put("Sender", "HIS");
                msgHeader.put("MsgType", "TAKAZONO_1002");
                msgHeader.put("MsgVersion", "2.0");
                PackMedSendXml reqXml = new PackMedSendXml();
                reqXml.setList(list);
                JAXBContext context = JAXBContext.newInstance(PackMedSendXml.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                marshaller.marshal(reqXml, baos);
                String prescriptionsXml = new String(baos.toByteArray()).replaceAll("<\\?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"\\?>","");
                String bsxml = "<BSXml>" + XmlUtil.map2xml(msgHeader, "MsgHeader").asXML()
                        + prescriptionsXml + "</BSXml>";
                String inputBsXml = bsxml.replaceAll("<\\?xml version=\"1.0\" encoding=\"UTF-8\"\\?>", "");
//                logger.info("包药inputBsXml:" + inputBsXml);
                try{
                    PrescriptionService ws = new PrescriptionService(packUrl);
                    PrescriptionServiceSoap wsSoap = ws.getPrescriptionServiceSoap();
                    String retMsg = wsSoap.recievePrescription(inputBsXml);
                    logger.info("包药retMsg:" + retMsg);
                    Map<String, Object> returnMap = XmlUtil.xml2map(retMsg.substring(retMsg.indexOf("<BSXml>"), retMsg.indexOf("</BSXml>") + 8), false);
                    msgHeader = (Map<String, Object>) returnMap.get("MsgHeader");
                    Boolean status = Boolean.valueOf(String.valueOf(msgHeader.get("Status")));
                    insertLog(packMess, retMsg, status);
                }catch (Exception e){
                    insertLog(packMess, e.getMessage(), false);
                }

            }
        }
    }

    private void insertLog(PackMess packMess, String retMsg, Boolean status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jlid",packMess.getJlid());
        map.put("state",status);
        map.put("message",retMsg);
        packDao.insertPackLog(map);
    }

    @Override
    public void failedCallBack(PackMess packMess, Throwable throwable) {

    }
}
