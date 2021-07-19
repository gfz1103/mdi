package com.buit.his.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.buit.commons.BaseController;
import com.buit.his.dao.SelfCheckDao;
import com.buit.his.response.SelfQueryImDetailResp;
import com.buit.his.response.SelfQueryImResp;
import com.buit.his.response.SelfQueryItemResp;
import com.buit.his.response.SelfQueryMedResp;
import com.buit.system.service.SysXtcsCacheSer;
import com.buit.utill.ReturnEntity;
import com.buit.utill.ReturnEntityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sg on 2021/4/24.
 */
@Api(tags = "自助查询接口")
@RestController
@RequestMapping("/ex/self")
public class SelfCheckController  extends BaseController {
    @Autowired
    private SelfCheckDao selfCheckDao;
    @DubboReference
    private SysXtcsCacheSer sysXtcsCacheSer;

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/QueryItem")
    @ApiOperation(value = "查询收费项目", httpMethod = "POST", notes = "查询收费项目")
    public ReturnEntity<List<SelfQueryItemResp>> queryItem(){
        return ReturnEntityUtil.success(selfCheckDao.queryItem());
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/QueryMed")
    @ApiOperation(value = "查询药品", httpMethod = "POST", notes = "查询药品")
    public ReturnEntity<List<SelfQueryMedResp>> queryMed(){
        return ReturnEntityUtil.success(selfCheckDao.queryMed());
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/QueryIm")
    @ApiOperation(value = "查询住院清单", httpMethod = "POST", notes = "查询住院清单")
    public ReturnEntity<SelfQueryImResp> queryIm(@ApiParam(name = "zyhm", value = "住院号码", required = true) @RequestParam String zyhm,
                                                 @ApiParam(name = "brxm", value = "病人姓名", required = true) @RequestParam String brxm,
                                                 @ApiParam(name = "ksrq", value = "开始日期", required = true) @RequestParam String ksrq,
                                                 @ApiParam(name = "jsrq", value = "结束日期", required = true) @RequestParam String jsrq){
        SelfQueryImResp im = selfCheckDao.queryIm(zyhm,brxm);
        if(im != null){
            List<SelfQueryImDetailResp> detail = selfCheckDao.queryImDetail(im.getZyh(),ksrq,jsrq);
            im.setDetails(detail);
            if(CollectionUtil.isNotEmpty(detail)){
                im.setZjje(detail.stream().map(SelfQueryImDetailResp::getJe).reduce(BigDecimal.ZERO,BigDecimal::add));
            }
        }else{
            return ReturnEntityUtil.error("ERROR_DCTWORK_ZYBRRY_00017");
        }
        return ReturnEntityUtil.success(im);
    }

    @ApiOperation("非his系统登录获取系统参数（自助机）")
    @PostMapping("/getHisParam")
    @ResponseBody
    public ReturnEntity<String> getHisSystemParam(@ApiParam(name = "csmc", value = "参数名称") @RequestParam String csmc) {
        return ReturnEntityUtil.success(sysXtcsCacheSer.getHisSystemParam(csmc));
    }
}
