package com.buit.his.controller;

import com.alibaba.fastjson.JSONObject;
import com.buit.cis.im.request.ImPacsPatientInfoReq;
import com.buit.cis.im.response.ImPacsPatientInfoResp;
import com.buit.cis.im.service.ImHzryService;
import com.buit.commons.BaseController;
import com.buit.commons.BaseException;
import com.buit.his.mtdms.model.MtdmsJc;
import com.buit.his.mtdms.service.MtdmsService;
import com.buit.his.request.PacsHisIsChargeUpReq;
import com.buit.op.request.PacsGetHisPatientInfoRequest;
import com.buit.op.request.PacsHisIsSetCrisisRequest;
import com.buit.op.response.PacsGetHisPatientInfoResponse;
import com.buit.op.service.RisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by sg on 2021/3/26.
 */
@Api(tags = "PACS接口")
@RestController
@RequestMapping("/ex/pacs")
public class PacsController extends BaseController{
    @DubboReference
    private MtdmsService mtdmsService;
    @DubboReference
    private RisService risService;
    @DubboReference
    private ImHzryService imHzryService;

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/GetHisPatientInfo")
    @ApiOperation(value = "病人信息提取", httpMethod = "POST", notes = "病人信息提取")
    public String GetHisPatientInfo(@Valid @RequestBody PacsGetHisPatientInfoRequest req){
        if(Objects.isNull(req.getPatientType()) || "".equals(req.getPatientType())){
            throw BaseException.create("ERROR_LIS_PACS_0001");
        }
        if(StringUtils.isEmpty(req.getInput_NO())){
            req.setInput_NO(null);
        }
        List<PacsGetHisPatientInfoResponse> res = new ArrayList<>();
        if("门诊".equals(req.getPatientType())){
            res = risService.getHisPatientInfo(req);
        }else if("住院".equals(req.getPatientType())){
            ImPacsPatientInfoReq imReq = new ImPacsPatientInfoReq();
            BeanUtils.copyProperties(req,imReq);
            List<ImPacsPatientInfoResp> imRes = imHzryService.getHisPatientInfo(imReq);
            for(ImPacsPatientInfoResp im:imRes){
                PacsGetHisPatientInfoResponse pacsRes = new PacsGetHisPatientInfoResponse();
                BeanUtils.copyProperties(im,pacsRes);
                res.add(pacsRes);
            }
        }
        return JSONObject.toJSONString(res);
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/HisIsChargeUp")
    @ApiOperation(value = "检查确认", httpMethod = "POST", notes = "检查确认")
    public Boolean HisIsChargeUp(@Valid @RequestBody PacsHisIsChargeUpReq req){
        if(Objects.isNull(req.getSTUDY_ID()) || "".equals(req.getSTUDY_ID())){
            return false;
        }
        if(Objects.isNull(req.getFLAG()) || "".equals(req.getFLAG())){
            return false;
        }
        MtdmsJc jc = new MtdmsJc();
        jc.setChkit_id(req.getCHKIT_ID());
        jc.setFlag(req.getFLAG());
        jc.setStudy_id(req.getSTUDY_ID());
        Boolean ret = mtdmsService.risHisIsChargeUp(jc);
        return ret;
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/HisIsSetCrisis")
    @ApiOperation(value = "诊断结果文字回写", httpMethod = "POST", notes = "诊断结果文字回写")
    public Boolean HisIsSetCrisis(@Valid @RequestBody PacsHisIsSetCrisisRequest req){
        Boolean ret = risService.hisIsSetCrisis(req);
        return ret;
    }
}
