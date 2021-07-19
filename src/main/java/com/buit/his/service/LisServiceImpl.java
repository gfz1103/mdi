package com.buit.his.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.buit.constans.SysXtcsCsmcCts;
import com.buit.his.request.LisRequestCancelReq;
import com.buit.his.request.LisRequestUpdateReq;
import com.buit.his.response.LisResp;
import com.buit.system.service.SysXtcsCacheSer;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


/**
 * 调LIS
 * Created by sg on 2021/3/24.
 */
@DubboService(timeout = 10000)
public class LisServiceImpl implements MdiLisService {

    static final Logger logger = LoggerFactory.getLogger(LisServiceImpl.class);

    @DubboReference
    private SysXtcsCacheSer sysXtcsCacheSer;
    @Autowired
    private RestTemplate restTemplate;
    @Value(value = "${lis.url}")
    private String lisUrl;


    @Override
    public LisResp lisRequestUpdate(LisRequestUpdateReq req) {
        String qyJk = sysXtcsCacheSer.getCsz(Integer.valueOf(req.getRequest_info().getHospital_id()), SysXtcsCsmcCts.QYLISJK);
        LisResp res = new LisResp();
        res.setCode("0");
        if("1".equals(qyJk)){
            MultiValueMap<String, Object> paraMap = new LinkedMultiValueMap<String, Object>();
            String postUrl = lisUrl + "RequestUpdate";
//        String para = "{    \"Request_info\":       {            \"Req_date\":\"2021-03-23\",            \"Gender\":\"男\",            \"Patient_Type\":\"门诊\",            \"Age\":\"22\",            \"Sample_type\":\"血清\",            \"Card_no\":\"4324235243\",            \"Req_doctor\":\"张三\",            \"Patient_id\":\"543635463\",            \"Age_unit\":\"岁\",            \"Patient_name\":\"王润隆\",            \"Bed_no\":\"\",            \"Department\":\"内科\",            \"Diagnostic\":\"个人疾病史\",            \"Hospital_id\":\"2301029999029\",            \"Birthday\":\"1999-09-24 00:00:00\",            \"Ward\":\"内科\",            \"Request_no\":\"41243123\",            \"Identity_card\":\"232302199909241311\",            \"Phone\":\"17603645747\",            \"Emergency\":\"0\"        }    ,    \"Request_Detail\":[        {            \"Item_name\":\"血细胞分析三分类\",            \"Price\":\"5.00\",            \"Item_code\":\"2145325\",            \"Requestdetail_no\":\"1\"        }    ]}";
            try {
                String para = JSONObject.toJSONString(req);
                logger.info("lisRequestUpdate:" + para);
                paraMap.add("JsonStr",para);
                ResponseEntity<String> responseEntity = restTemplate.postForEntity(postUrl, paraMap, String.class);
                String body = responseEntity.getBody();
                Document document =  DocumentHelper.parseText(body);
                Element rootElement = document.getRootElement();
                String ret = rootElement.getText();
                HashMap hashMap = JSON.parseObject(ret, HashMap.class);
                res.setCode(hashMap.get("code").toString());
                res.setMessage(hashMap.get("message").toString());
            } catch (Exception e) {
                res.setCode("-1");
                res.setMessage(e.getMessage());
                return res;
            }
        }
        return res;
    }

    @Override
    public LisResp lisRequestCancel(LisRequestCancelReq req) {
        String qyJk = sysXtcsCacheSer.getCsz(Integer.valueOf(req.getHospital_id()), SysXtcsCsmcCts.QYLISJK);
        LisResp res = new LisResp();
        res.setCode("0");
        if("1".equals(qyJk)){
            MultiValueMap<String, Object> paraMap = new LinkedMultiValueMap<String, Object>();
            String postUrl = lisUrl + "Requestcancel";
            try {
                String para = JSONObject.toJSONString(req);
                logger.info("lisRequestCancel:" + para);
                paraMap.add("JsonStr",para);
                ResponseEntity<String> responseEntity = restTemplate.postForEntity(postUrl, paraMap, String.class);
                String body = responseEntity.getBody();
                Document document = DocumentHelper.parseText(body);
                Element rootElement = document.getRootElement();
                String ret = rootElement.getText();
                HashMap hashMap = JSON.parseObject(ret, HashMap.class);
                res.setCode(hashMap.get("retcode").toString());
                res.setMessage(hashMap.get("retmsg").toString());
            } catch (Exception e) {
                res.setCode("-1");
                res.setMessage(e.getMessage());
                return res;
            }
        }
        return res;
    }



}
