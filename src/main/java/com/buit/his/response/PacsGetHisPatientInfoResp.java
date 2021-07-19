package com.buit.his.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/26.
 */
@ApiModel(value="PACS病人信息提取返回")
public class PacsGetHisPatientInfoResp implements Serializable {
    @ApiModelProperty(value="HIS给出的编号（比如申请单号码等）")
    private String STUDY_ID;
    @ApiModelProperty(value="住院号(门诊病人可以为空)")
    private String HSP_NO;
    @ApiModelProperty(value="门诊号(此号可以为卡号，发票号,病人条码等)")
    private String MZ_NO;
    @ApiModelProperty(value="病人姓名")
    private String PAT_NAME;
    @ApiModelProperty(value="性别（男、女、其他）")
    private String SEX;
    @ApiModelProperty(value="年龄")
    private String AGE;
    @ApiModelProperty(value="出生日期 2015-01-01")
    private String BIRTHDATE;
    @ApiModelProperty(value="年龄类型（岁、月、天）")
    private String AGETYPE;
    @ApiModelProperty(value="病人类别（自费、医保等）")
    private String JZ_CODE;
    @ApiModelProperty(value="申请科室")
    private String Department;
    @ApiModelProperty(value="申请科室编码")
    private String DepartmentID;
    @ApiModelProperty(value="病区(门诊病人可以为空)")
    private String Ward_NO;
    @ApiModelProperty(value="床号(门诊病人可以为空)")
    private String BED_NO;
    @ApiModelProperty(value="家庭地址")
    private String HK_ADDR;
    @ApiModelProperty(value="身份证号")
    private String SFZ_NO;
    @ApiModelProperty(value="电话")
    private String HK_TELE;
    @ApiModelProperty(value="申请医生")
    private String Doctor;
    @ApiModelProperty(value="申请医生编码")
    private String DoctorID;
    @ApiModelProperty(value="医保、医院等卡号")
    private String CardNO;
    @ApiModelProperty(value="发票号码(住院病人可以为空)")
    private String FPNO;
    @ApiModelProperty(value="项目编号")
    private String CHKIT_ID;
    @ApiModelProperty(value="项目名称")
    private String CHKIT_NAME;
    @ApiModelProperty(value="项目单价")
    private String CHKIT_COST;
    @ApiModelProperty(value="项目数量")
    private String CAMT;
    @ApiModelProperty(value="项目执行科室编号")
    private String UT_ID;
    @ApiModelProperty(value="检查类别(属于放射还是CT还是MR等)")
    private String EXAM_CLASS;
    @ApiModelProperty(value="检查子类（具体的设备类型或部位）")
    private String EXAM_SUB_CLASS;
    @ApiModelProperty(value="症状（没有此值可以返回空）")
    private String CLIN_SYMP;
    @ApiModelProperty(value="体征（没有此值可以返回空）")
    private String PHYS_SIGN;
    @ApiModelProperty(value="临床诊断（没有此值可以返回空）")
    private String CLIN_DIAG;
    @ApiModelProperty(value="其他诊断（没有此值可以返回空）")
    private String RELEVANT_DIAG;
    @ApiModelProperty(value="相关化验结果（没有此值可以返回空）")
    private String RELEVANT_LAB_TEST;
    @ApiModelProperty(value="注意事项（没有此值可以返回空）")
    private String NOTICE;
    @ApiModelProperty(value="病人ID（病人唯一号，没有此值可以返回空）")
    private String Patient_id;
    @ApiModelProperty(value="开单日期 2015-01-01")
    private String SCHEDULED_DATE;


    @JsonProperty("STUDY_ID")
    public String getSTUDY_ID() {
        return STUDY_ID;
    }

    public void setSTUDY_ID(String STUDY_ID) {
        this.STUDY_ID = STUDY_ID;
    }
    @JsonProperty("HSP_NO")
    public String getHSP_NO() {
        return HSP_NO;
    }

    public void setHSP_NO(String HSP_NO) {
        this.HSP_NO = HSP_NO;
    }
    @JsonProperty("MZ_NO")
    public String getMZ_NO() {
        return MZ_NO;
    }

    public void setMZ_NO(String MZ_NO) {
        this.MZ_NO = MZ_NO;
    }
    @JsonProperty("PAT_NAME")
    public String getPAT_NAME() {
        return PAT_NAME;
    }

    public void setPAT_NAME(String PAT_NAME) {
        this.PAT_NAME = PAT_NAME;
    }
    @JsonProperty("SEX")
    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }
    @JsonProperty("AGE")
    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }
    @JsonProperty("BIRTHDATE")
    public String getBIRTHDATE() {
        return BIRTHDATE;
    }

    public void setBIRTHDATE(String BIRTHDATE) {
        this.BIRTHDATE = BIRTHDATE;
    }
    @JsonProperty("AGETYPE")
    public String getAGETYPE() {
        return AGETYPE;
    }

    public void setAGETYPE(String AGETYPE) {
        this.AGETYPE = AGETYPE;
    }
    @JsonProperty("JZ_CODE")
    public String getJZ_CODE() {
        return JZ_CODE;
    }

    public void setJZ_CODE(String JZ_CODE) {
        this.JZ_CODE = JZ_CODE;
    }
    @JsonProperty("Department")
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    @JsonProperty("DepartmentID")
    public String getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(String departmentID) {
        DepartmentID = departmentID;
    }
    @JsonProperty("Ward_NO")
    public String getWard_NO() {
        return Ward_NO;
    }

    public void setWard_NO(String ward_NO) {
        Ward_NO = ward_NO;
    }
    @JsonProperty("BED_NO")
    public String getBED_NO() {
        return BED_NO;
    }

    public void setBED_NO(String BED_NO) {
        this.BED_NO = BED_NO;
    }
    @JsonProperty("HK_ADDR")
    public String getHK_ADDR() {
        return HK_ADDR;
    }

    public void setHK_ADDR(String HK_ADDR) {
        this.HK_ADDR = HK_ADDR;
    }
    @JsonProperty("SFZ_NO")
    public String getSFZ_NO() {
        return SFZ_NO;
    }

    public void setSFZ_NO(String SFZ_NO) {
        this.SFZ_NO = SFZ_NO;
    }
    @JsonProperty("HK_TELE")
    public String getHK_TELE() {
        return HK_TELE;
    }

    public void setHK_TELE(String HK_TELE) {
        this.HK_TELE = HK_TELE;
    }
    @JsonProperty("Doctor")
    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }
    @JsonProperty("DoctorID")
    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String doctorID) {
        DoctorID = doctorID;
    }
    @JsonProperty("CardNO")
    public String getCardNO() {
        return CardNO;
    }

    public void setCardNO(String cardNO) {
        CardNO = cardNO;
    }
    @JsonProperty("FPNO")
    public String getFPNO() {
        return FPNO;
    }

    public void setFPNO(String FPNO) {
        this.FPNO = FPNO;
    }
    @JsonProperty("CHKIT_ID")
    public String getCHKIT_ID() {
        return CHKIT_ID;
    }

    public void setCHKIT_ID(String CHKIT_ID) {
        this.CHKIT_ID = CHKIT_ID;
    }
    @JsonProperty("CHKIT_NAME")
    public String getCHKIT_NAME() {
        return CHKIT_NAME;
    }

    public void setCHKIT_NAME(String CHKIT_NAME) {
        this.CHKIT_NAME = CHKIT_NAME;
    }
    @JsonProperty("CHKIT_COST")
    public String getCHKIT_COST() {
        return CHKIT_COST;
    }

    public void setCHKIT_COST(String CHKIT_COST) {
        this.CHKIT_COST = CHKIT_COST;
    }
    @JsonProperty("CAMT")
    public String getCAMT() {
        return CAMT;
    }

    public void setCAMT(String CAMT) {
        this.CAMT = CAMT;
    }
    @JsonProperty("UT_ID")
    public String getUT_ID() {
        return UT_ID;
    }

    public void setUT_ID(String UT_ID) {
        this.UT_ID = UT_ID;
    }
    @JsonProperty("EXAM_CLASS")
    public String getEXAM_CLASS() {
        return EXAM_CLASS;
    }

    public void setEXAM_CLASS(String EXAM_CLASS) {
        this.EXAM_CLASS = EXAM_CLASS;
    }
    @JsonProperty("EXAM_SUB_CLASS")
    public String getEXAM_SUB_CLASS() {
        return EXAM_SUB_CLASS;
    }

    public void setEXAM_SUB_CLASS(String EXAM_SUB_CLASS) {
        this.EXAM_SUB_CLASS = EXAM_SUB_CLASS;
    }
    @JsonProperty("CLIN_SYMP")
    public String getCLIN_SYMP() {
        return CLIN_SYMP;
    }

    public void setCLIN_SYMP(String CLIN_SYMP) {
        this.CLIN_SYMP = CLIN_SYMP;
    }
    @JsonProperty("PHYS_SIGN")
    public String getPHYS_SIGN() {
        return PHYS_SIGN;
    }

    public void setPHYS_SIGN(String PHYS_SIGN) {
        this.PHYS_SIGN = PHYS_SIGN;
    }
    @JsonProperty("CLIN_DIAG")
    public String getCLIN_DIAG() {
        return CLIN_DIAG;
    }

    public void setCLIN_DIAG(String CLIN_DIAG) {
        this.CLIN_DIAG = CLIN_DIAG;
    }
    @JsonProperty("RELEVANT_DIAG")
    public String getRELEVANT_DIAG() {
        return RELEVANT_DIAG;
    }

    public void setRELEVANT_DIAG(String RELEVANT_DIAG) {
        this.RELEVANT_DIAG = RELEVANT_DIAG;
    }
    @JsonProperty("RELEVANT_LAB_TEST")
    public String getRELEVANT_LAB_TEST() {
        return RELEVANT_LAB_TEST;
    }

    public void setRELEVANT_LAB_TEST(String RELEVANT_LAB_TEST) {
        this.RELEVANT_LAB_TEST = RELEVANT_LAB_TEST;
    }
    @JsonProperty("NOTICE")
    public String getNOTICE() {
        return NOTICE;
    }

    public void setNOTICE(String NOTICE) {
        this.NOTICE = NOTICE;
    }
    @JsonProperty("Patient_id")
    public String getPatient_id() {
        return Patient_id;
    }

    public void setPatient_id(String patient_id) {
        Patient_id = patient_id;
    }
    @JsonProperty("SCHEDULED_DATE")
    public String getSCHEDULED_DATE() {
        return SCHEDULED_DATE;
    }

    public void setSCHEDULED_DATE(String SCHEDULED_DATE) {
        this.SCHEDULED_DATE = SCHEDULED_DATE;
    }
}
