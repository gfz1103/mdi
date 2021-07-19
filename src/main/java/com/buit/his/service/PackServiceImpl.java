package com.buit.his.service;

import com.buit.his.dao.PackDao;
import com.buit.his.request.PackMedSendReq;
import com.buit.his.response.PackMedResp;
import com.buit.his.response.PackPharResp;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sg on 2021/5/31.
 */
@DubboService(timeout = 10000)
public class PackServiceImpl implements MdiPackMedService{

    @Autowired
    private PackDao packDao;

    @Override
    public PackMedResp packMedSend(List<PackMedSendReq> list) {
        return null;
    }

    @Override
    public List<PackPharResp> queryPackStatus(List<Integer> list) {
        List<PackPharResp> ret = new ArrayList<>();
        for(Integer id:list){
            PackPharResp res = new PackPharResp();
            res.setFyjl(id);
            long ll = packDao.queryCountByJlid(id);
            if(ll > 0){
                res.setStatus(1);
            }else{
                res.setStatus(0);
            }
            ret.add(res);
        }
        return ret;
    }
}
