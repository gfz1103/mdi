package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/26.
 */
@ApiModel(value="PACS诊断结果文字回写")
public class PacsHisIsSetCrisisReq implements Serializable {
    @ApiModelProperty("HIS给出的编号（比如申请单号码等）与信息获取相对应")
    private String STUDY_ID;
    @ApiModelProperty("报告的唯一ID")
    private String Report_ID;
    @ApiModelProperty("病人的检查编号(RIS产生)")
    private String Patient_NO;
    @ApiModelProperty("报告医生姓名")
    private String Reporter;
    @ApiModelProperty("审核医生姓名")
    private String Auditor;
    @ApiModelProperty("报告日期")
    private String WriteDate;
    @ApiModelProperty("审核日期")
    private String AuditDate;
    @ApiModelProperty("检查部位，string数组")
    private String[] BodyPart;
    @ApiModelProperty("检查名称，string数组")
    private String[] ExamName;
    @ApiModelProperty("检查方法，string数组")
    private String[] ExamMethod;
    @ApiModelProperty("影像表现")
    private String DiagDesc;
    @ApiModelProperty("诊断")
    private String DiagName;
    @ApiModelProperty("图像信息，string数组,Base64")
    private String ImageList;

    public PacsHisIsSetCrisisReq() {
    }

    @JsonProperty("STUDY_ID")
    public String getSTUDY_ID() {
        return this.STUDY_ID;
    }

    public void setSTUDY_ID(String STUDY_ID) {
        this.STUDY_ID = STUDY_ID;
    }

    @JsonProperty("Report_ID")
    public String getReport_ID() {
        return this.Report_ID;
    }

    public void setReport_ID(String report_ID) {
        this.Report_ID = report_ID;
    }

    @JsonProperty("Patient_NO")
    public String getPatient_NO() {
        return this.Patient_NO;
    }

    public void setPatient_NO(String patient_NO) {
        this.Patient_NO = patient_NO;
    }

    @JsonProperty("Reporter")
    public String getReporter() {
        return this.Reporter;
    }

    public void setReporter(String reporter) {
        this.Reporter = reporter;
    }

    @JsonProperty("Auditor")
    public String getAuditor() {
        return this.Auditor;
    }

    public void setAuditor(String auditor) {
        this.Auditor = auditor;
    }

    @JsonProperty("WriteDate")
    public String getWriteDate() {
        return this.WriteDate;
    }

    public void setWriteDate(String writeDate) {
        this.WriteDate = writeDate;
    }

    @JsonProperty("AuditDate")
    public String getAuditDate() {
        return this.AuditDate;
    }

    public void setAuditDate(String auditDate) {
        this.AuditDate = auditDate;
    }

    @JsonProperty("BodyPart")
    public String[] getBodyPart() {
        return this.BodyPart;
    }

    public void setBodyPart(String[] bodyPart) {
        this.BodyPart = bodyPart;
    }

    @JsonProperty("ExamName")
    public String[] getExamName() {
        return this.ExamName;
    }

    public void setExamName(String[] examName) {
        this.ExamName = examName;
    }

    @JsonProperty("ExamMethod")
    public String[] getExamMethod() {
        return this.ExamMethod;
    }

    public void setExamMethod(String[] examMethod) {
        this.ExamMethod = examMethod;
    }

    @JsonProperty("DiagDesc")
    public String getDiagDesc() {
        return this.DiagDesc;
    }

    public void setDiagDesc(String diagDesc) {
        this.DiagDesc = diagDesc;
    }

    @JsonProperty("DiagName")
    public String getDiagName() {
        return this.DiagName;
    }

    public void setDiagName(String diagName) {
        this.DiagName = diagName;
    }

    @JsonProperty("ImageList")
    public String getImageList() {
        return this.ImageList;
    }

    public void setImageList(String imageList) {
        this.ImageList = imageList;
    }
}
