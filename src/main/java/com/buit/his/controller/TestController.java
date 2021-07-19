package com.buit.his.controller;

import com.buit.his.dao.HisTestDao;
import com.buit.his.model.HisTestModel;
import com.buit.mdi.dao.MdiTestDao;
import com.buit.mdi.model.MdiTestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yueyu
 * @Date 2021/1/19 16:15
 */
@RestController
public class TestController {

    @Autowired
    HisTestDao hisTestDao;
    @Autowired
    MdiTestDao mdiTestDao;

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/insert")
    public void insert(@RequestParam("value")Integer value){
        HisTestModel hisTestModel = new HisTestModel();
        hisTestModel.setName("his");
        hisTestDao.insert(hisTestModel);
        MdiTestModel mdiTestModel = new MdiTestModel();
        mdiTestModel.setName("mdi");
        mdiTestDao.insert(mdiTestModel);
        int n = 1/value;
    }
}
