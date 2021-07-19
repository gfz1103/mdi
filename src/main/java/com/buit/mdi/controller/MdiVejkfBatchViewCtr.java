package com.buit.mdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.buit.mdi.dao.MdiVejkfBatchViewDao;

import io.swagger.annotations.Api;
@Api(tags="")
@Controller
@RequestMapping("/mdiVejkfBatchView")
public class MdiVejkfBatchViewCtr {

	@Autowired
	private MdiVejkfBatchViewDao mdiVejkfBatchViewDao;
	
//	@RequestMapping("/HrpTest")
//    @ResponseBody
//    @ApiOperation(value="HrpTest" ,httpMethod="POST")
//    public ReturnEntity<List<HighQualityConsumablesResp>> queryHighQualityConsumables(){
//        return ReturnEntityUtil.success(mdiVejkfBatchViewDao.queryHighQualityConsumables());    
//    }

}
