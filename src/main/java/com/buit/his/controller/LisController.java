package com.buit.his.controller;

import com.buit.commons.BaseController;
import com.buit.his.mtdms.model.MtdmsSqd;
import com.buit.his.mtdms.response.RespMessage;
import com.buit.his.mtdms.service.MtdmsService;
import com.buit.his.request.*;
import com.buit.his.response.LisRes;
import com.buit.his.response.LisResp;
import com.buit.his.service.HrpService;
import com.buit.his.service.MdiLisService;
import com.buit.his.service.MdiPackMedService;
import com.buit.mms.crivalu.request.CisLisReportlimitUploadReq;
import com.buit.mms.crivalu.response.LisWjzResp;
import com.buit.mms.crivalu.service.CisWjzService;
import com.buit.mq.RabbitMqProducer;
import com.buit.op.request.LisReportCancelRequest;
import com.buit.op.request.LisReportUploadRequest;
import com.buit.op.service.LisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * Created by sg on 2021/3/24.
 */
@Api(tags = "LIS接口")
@RestController
@RequestMapping("/ex/lis")
public class LisController  extends BaseController {
    @DubboReference
    private MdiLisService mdiLisService;
    @DubboReference
    private MtdmsService mtdmsService;
    @DubboReference
    private LisService lisService;
    @DubboReference
    private CisWjzService cisWjzService;
    @DubboReference
    private MdiPackMedService mdiPackMedService;
    @Autowired
    private RabbitMqProducer producer;
    @Autowired
    private HrpService hrpService;

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/Report_upload")
    @ApiOperation(value = "上传检验报告", httpMethod = "POST", notes = "上传检验报告")
    public LisRes Report_upload(@Valid @RequestBody LisReportUploadRequest req){
        LisRes resp = new LisRes();
        resp.setCode("0");
        try {
            lisService.reportUpload(req);
        }catch (Exception e){
            resp.setCode("-1");
            resp.setMessage(e.getMessage());
        }
        return resp;
    }


    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/Report_cancel")
    @ApiOperation(value = "检验报告撤销", httpMethod = "POST", notes = "检验报告撤销")
    public LisRes Report_cancel(@Valid @RequestBody LisReportCancelRequest req){
        LisRes resp = new LisRes();
        resp.setCode("0");
        if(Objects.isNull(req.getReport_id()) || "".equals(req.getReport_id())){
            resp.setCode("-1");
            resp.setMessage("报告单号不能为空");
            return resp;
        }
        try {
            lisService.reportCancel(req);
        }catch (Exception e){
            resp.setCode("-1");
            resp.setMessage(e.getMessage());
        }
        return resp;
    }


//    @Transactional(rollbackFor = Exception.class)
//    @PostMapping("/RequestStateExec")
//    @ApiOperation(value = "更新申请单执行状态", httpMethod = "POST", notes = "更新申请单执行状态")
//    public LisRes RequestStateExec(@Valid @RequestBody LisRequestStateReq req){
//        LisRes resp = new LisRes();
//        if(Objects.isNull(req.getRequest_no()) || "".equals(req.getRequest_no())){
//            resp.setCode("-1");
//            resp.setMessage("申请单号不能为空");
//            return resp;
//        }
//        MtdmsSqd sqd = new MtdmsSqd();
//        BeanUtils.copyProperties(req,sqd);
//        sqd.setDate(req.getDate().toString());
//        RespMessage ret = mtdmsService.requestStateExec(sqd);
//        resp.setCode(ret.getRetcode());
//        resp.setMessage(ret.getRetmsg());
//        return resp;
//    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/RequestStateUse")
    @ApiOperation(value = "更新申请单上机状态", httpMethod = "POST", notes = "更新申请单上机状态")
    public LisRes RequestStateUse(@Valid @RequestBody LisRequestStateReq req){
        LisRes resp = new LisRes();
        if(Objects.isNull(req.getRequest_no()) || "".equals(req.getRequest_no())){
            resp.setCode("-1");
            resp.setMessage("申请单号不能为空");
            return resp;
        }
        MtdmsSqd sqd = new MtdmsSqd();
        BeanUtils.copyProperties(req,sqd);
        sqd.setDate(req.getDate().toString());
        RespMessage ret = mtdmsService.requestStateFinish(sqd);
        resp.setCode(ret.getRetcode());
        resp.setMessage(ret.getRetmsg());
        return resp;
    }

//    @Transactional(rollbackFor = Exception.class)
//    @PostMapping("/RequestStateFinish")
//    @ApiOperation(value = "更新申请单完成状态", httpMethod = "POST", notes = "更新申请单完成状态")
//    public LisRes RequestStateFinish(@Valid @RequestBody LisRequestStateReq req){
//        LisRes resp = new LisRes();
//        if(Objects.isNull(req.getRequest_no()) || "".equals(req.getRequest_no())){
//            resp.setCode("-1");
//            resp.setMessage("申请单号不能为空");
//            return resp;
//        }
//        MtdmsSqd sqd = new MtdmsSqd();
//        BeanUtils.copyProperties(req,sqd);
//        sqd.setDate(req.getDate().toString());
//        RespMessage ret = mtdmsService.requestStateFinish(sqd);
//        resp.setCode(ret.getRetcode());
//        resp.setMessage(ret.getRetmsg());
//        return resp;
//    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/FeeStatus")
    @ApiOperation(value = "住院医嘱确费", httpMethod = "POST", notes = "住院医嘱确费")
    public LisRes FeeStatus(@Valid @RequestBody LisFeeStatusReq req){
        LisRes resp = new LisRes();
        if(Objects.isNull(req.getRequest_no()) || "".equals(req.getRequest_no())){
            resp.setCode("-1");
            resp.setMessage("申请单号不能为空");
            return resp;
        }
        MtdmsSqd sqd = new MtdmsSqd();
        BeanUtils.copyProperties(req,sqd);
        sqd.setDate(req.getDate().toString());
        RespMessage ret = mtdmsService.feeStatus(sqd);
        resp.setCode(ret.getRetcode());
        resp.setMessage(ret.getRetmsg());
        return resp;
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/FeeStatus_Back")
    @ApiOperation(value = "住院医嘱退费", httpMethod = "POST", notes = "住院医嘱退费")
    public LisRes FeeStatus_Back(@Valid @RequestBody LisFeeStatusReq req){
        LisRes resp = new LisRes();
        if(Objects.isNull(req.getRequest_no()) || "".equals(req.getRequest_no())){
            resp.setCode("-1");
            resp.setMessage("申请单号不能为空");
            return resp;
        }
        MtdmsSqd sqd = new MtdmsSqd();
        BeanUtils.copyProperties(req,sqd);
        sqd.setDate(req.getDate().toString());
        RespMessage ret = mtdmsService.FeeStatus_Back(sqd);
        resp.setCode(ret.getRetcode());
        resp.setMessage(ret.getRetmsg());
        return resp;
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/Reportlimit_upload")
    @ApiOperation(value = "危急值上传", httpMethod = "POST", notes = "危急值上传")
    public LisWjzResp Reportlimit_upload(@Valid @RequestBody CisLisReportlimitUploadReq req){
        LisWjzResp ret = cisWjzService.reportLimitUpload(req);
        return ret;
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/RequestUpdate")
    @ApiOperation(value = "医嘱上传测试用", httpMethod = "POST", notes = "医嘱上传测试用")
    public LisResp lisRequestUpdate(@Valid @RequestBody LisRequestUpdateReq req) {
        LisResp ret = mdiLisService.lisRequestUpdate(req);
        return ret;
    }


    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/testpack")
    @ApiOperation(value = "testpack", httpMethod = "POST", notes = "testpack")
    public void testpack(@Valid @RequestBody PackMess req){
        producer.send("drugs.doctor.advice.dispensing",req);
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/RequestCancel")
    @ApiOperation(value = "医嘱撤销测试用", httpMethod = "POST", notes = "医嘱撤销测试用")
    public LisResp lisRequestUpdate(@Valid @RequestBody LisRequestCancelReq req) {
        LisResp ret = mdiLisService.lisRequestCancel(req);
        return ret;
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/testhrp")
    @ApiOperation(value = "testhrp", httpMethod = "POST", notes = "testhrp")
    public void testhrp(@Valid @RequestBody List<Integer> list,@RequestParam Integer type){
        hrpService.hiscubebzejkfpush(list,type);
    }

}
