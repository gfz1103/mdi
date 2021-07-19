package com.buit.his.service;

import com.alibaba.fastjson.JSON;
import com.buit.his.dao.HrpDao;
import com.buit.his.request.HisCubeBzEjkfPush;
import com.buit.his.request.HisEjkf;
import com.buit.his.response.JsonResult;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sg on 2021/5/18.
 */
@DubboService(timeout = 10000)
public class HrpService implements MdiHrpService{

    static final Logger logger = LoggerFactory.getLogger(HrpService.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HrpDao hrpDao;
    @Value(value = "${hrp.url}")
    private String hrpUrl;
    @Value(value = "${hrp.account}")
    private String hrpAccount;
    @Value(value = "${hrp.password}")
    private String hrpPassword;
    @Value(value = "${hrp.ssyydm}")
    private String hrpSsyydm;

    public void hrpRequestData(){
        try {
            HisEjkf hisEjkf = new HisEjkf();
            hisEjkf.setAccount("HIS0001");
            hisEjkf.setPassword("SElTMDAwMQ==");
            hisEjkf.setSsyydm("314001");
            List<HisCubeBzEjkfPush> list = new ArrayList<>();
            HisCubeBzEjkfPush hisCubeBzEjkfPush = new HisCubeBzEjkfPush();
            hisCubeBzEjkfPush.setBrxm("李弟弟");
            hisCubeBzEjkfPush.setBrbh("239");
            hisCubeBzEjkfPush.setHisid(14);
            hisCubeBzEjkfPush.setJgid("310112001");
            hisCubeBzEjkfPush.setJgname("上海蓝生宏德医院");
            hisCubeBzEjkfPush.setLsh("6965");
            hisCubeBzEjkfPush.setSsbq("36");
            hisCubeBzEjkfPush.setSsbqmc("五病区");
            hisCubeBzEjkfPush.setSsks("38");
            hisCubeBzEjkfPush.setSsksmc("内科");
            hisCubeBzEjkfPush.setSylx(1);
            hisCubeBzEjkfPush.setXmbm("509");
            hisCubeBzEjkfPush.setXmdj(new BigDecimal(22));
            hisCubeBzEjkfPush.setXmdw("支");
            hisCubeBzEjkfPush.setXmgg("5ml");
            hisCubeBzEjkfPush.setXmmc("预充式导管冲洗器");
            hisCubeBzEjkfPush.setXmsyje(new BigDecimal(44));
            hisCubeBzEjkfPush.setXmsysj("2021-05-01 11:41:52.0");
            hisCubeBzEjkfPush.setXmsysl("1.00");
            hisCubeBzEjkfPush.setYwlx("2");
            list.add(hisCubeBzEjkfPush);
            hisEjkf.setHiscubebzejkfpush(list);
            Map params = JSON.parseObject(JSON.toJSONString(hisEjkf), Map.class);

            String jsonData = JSON.toJSONString(params);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request = new HttpEntity<>(jsonData, headers);
            ResponseEntity<JsonResult> responseEntity = restTemplate.postForEntity("http://192.168.31.117:8088/stock/DealHIsDataControl/filterData", request, JsonResult.class);
            JsonResult body = responseEntity.getBody();
            if(body.getState() == 0){

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 推送HRP数据
     * @param list
     * @param type
     */
    @Override
    public void hiscubebzejkfpush(List<Integer> list, Integer type) {
        if(type == 1){
            String jlxhStr = "";
            HisEjkf hisEjkf = new HisEjkf();
            hisEjkf.setAccount(hrpAccount);
            hisEjkf.setPassword(hrpPassword);
            hisEjkf.setSsyydm(hrpSsyydm);
            List<HisCubeBzEjkfPush> listPush = new ArrayList<>();
            for (Integer jlxh : list) {
                HisCubeBzEjkfPush fymx = hrpDao.queryFymxByJlxh(jlxh);
                if(fymx != null){
                    jlxhStr += fymx.getLsh() + ",";
                    listPush.add(fymx);
                }
            }
            if(listPush.size() > 0){
                hisEjkf.setHiscubebzejkfpush(listPush);
                String jsonData = JSON.toJSONString(hisEjkf);
                logger.info("hiscubebzejkfpush:" + jsonData);
                try{
                    HttpHeaders headers = new HttpHeaders();
                    headers.setContentType(MediaType.APPLICATION_JSON);
                    HttpEntity<String> request = new HttpEntity<>(jsonData, headers);
                    ResponseEntity<JsonResult> responseEntity = restTemplate.postForEntity(hrpUrl, request, JsonResult.class);
                    JsonResult body = responseEntity.getBody();
                    if(body.getState() == 0 || body.getState() == 1){
                        Map<String, Object> map = new HashMap<String, Object>();
                        map.put("jlxh",jlxhStr);
                        map.put("state",body.getState());
                        map.put("message",body.getMessage());
                        hrpDao.insertHrpLog(map);
                    }
                }catch(Exception e){
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("jlxh",jlxhStr);
                    map.put("state",0);
                    map.put("message",e.getMessage());
                    hrpDao.insertHrpLog(map);
                }
            }
        }
    }
}
