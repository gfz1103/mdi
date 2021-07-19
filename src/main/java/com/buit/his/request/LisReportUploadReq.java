package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="上传检验报告")
public class LisReportUploadReq implements Serializable {
    @ApiModelProperty(value="报告单唯一号")
    private String Report_id;
    @ApiModelProperty(value="完成报告的医院id")
    private String Hospital_id;
    @ApiModelProperty(value="完成报告的医院名称")
    private String Hospital_name;
    @ApiModelProperty(value="标本号")
    private String Sample_no;
    @ApiModelProperty(value="条码号")
    private String Barcode;
    @ApiModelProperty(value="病人类型")
    private String Patient_Type;
    @ApiModelProperty(value="门诊或者住院号")
    private String Patient_id;
    @ApiModelProperty(value="姓名")
    private String Patient_name;
    @ApiModelProperty(value="身份证")
    private String Identity_card;
    @ApiModelProperty(value="联系电话")
    private String Phone;
    @ApiModelProperty(value="性别（男，女）")
    private String Gender;
    @ApiModelProperty(value="生日（2011-09-09 00:00:00）")
    private String Birthday;
    @ApiModelProperty(value="年龄")
    private String Age;
    @ApiModelProperty(value="年龄单位")
    private String Age_unit;
    @ApiModelProperty(value="标本类型")
    private String Sample_type;
    @ApiModelProperty(value="备注")
    private String Note;
    @ApiModelProperty(value="诊断")
    private String Diagnostic;
    @ApiModelProperty(value="申请病区")
    private String Ward;
    @ApiModelProperty(value="申请科室")
    private String Department;
    @ApiModelProperty(value="床号")
    private String Bed_no;
    @ApiModelProperty(value="申请项目")
    private String Order_item;
    @ApiModelProperty(value="申请日期（2019-04-09 09:00:00）")
    private String Req_date;
    @ApiModelProperty(value="采集日期（2019-04-09 09:20:00）")
    private String Sampling_date;
    @ApiModelProperty(value="采集医院接收日期（2019-04-09 09:25:00）")
    private String Receipt_date;
    @ApiModelProperty(value="执行医院接收日期（2019-04-09 13:00:00）")
    private String Receipt_date1;
    @ApiModelProperty(value="检验时间（2019-04-09 14:00:00）")
    private String Test_date;
    @ApiModelProperty(value="审核时间（2019-04-09 15:00:00）")
    private String Report_date;
    @ApiModelProperty(value="申请医生姓名")
    private String Req_doctor;
    @ApiModelProperty(value="采集人姓名")
    private String Sampling_doctor;
    @ApiModelProperty(value="检验人姓名")
    private String Test_doctor;
    @ApiModelProperty(value="审核人姓名")
    private String Report_doctor;
    @ApiModelProperty(value="报告类型(0，普通结果，1，微生物结果)")
    private String Report_type;
    @ApiModelProperty(value="Normal")
    private List<LisReportUploadNormal> Normal;
    @ApiModelProperty(value="Germinfo")
    private List<LisReportUploadGerminfo> Germinfo;
    @ApiModelProperty(value="Antiinfo")
    private List<LisReportUploadAntiinfo> Antiinfo;

    @JsonProperty("Report_id")
    public String getReport_id() {
        return Report_id;
    }

    public void setReport_id(String report_id) {
        Report_id = report_id;
    }
    @JsonProperty("Hospital_id")
    public String getHospital_id() {
        return Hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        Hospital_id = hospital_id;
    }
    @JsonProperty("Hospital_name")
    public String getHospital_name() {
        return Hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        Hospital_name = hospital_name;
    }
    @JsonProperty("Sample_no")
    public String getSample_no() {
        return Sample_no;
    }

    public void setSample_no(String sample_no) {
        Sample_no = sample_no;
    }
    @JsonProperty("Barcode")
    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }
    @JsonProperty("Patient_Type")
    public String getPatient_Type() {
        return Patient_Type;
    }

    public void setPatient_Type(String patient_Type) {
        Patient_Type = patient_Type;
    }
    @JsonProperty("Patient_id")
    public String getPatient_id() {
        return Patient_id;
    }

    public void setPatient_id(String patient_id) {
        Patient_id = patient_id;
    }
    @JsonProperty("Patient_name")
    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }
    @JsonProperty("Identity_card")
    public String getIdentity_card() {
        return Identity_card;
    }

    public void setIdentity_card(String identity_card) {
        Identity_card = identity_card;
    }
    @JsonProperty("Phone")
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @JsonProperty("Gender")
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
    @JsonProperty("Birthday")
    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }
    @JsonProperty("Age")
    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
    @JsonProperty("Age_unit")
    public String getAge_unit() {
        return Age_unit;
    }

    public void setAge_unit(String age_unit) {
        Age_unit = age_unit;
    }
    @JsonProperty("Sample_type")
    public String getSample_type() {
        return Sample_type;
    }

    public void setSample_type(String sample_type) {
        Sample_type = sample_type;
    }
    @JsonProperty("Note")
    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
    @JsonProperty("Diagnostic")
    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        Diagnostic = diagnostic;
    }
    @JsonProperty("Ward")
    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }
    @JsonProperty("Department")
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    @JsonProperty("Bed_no")
    public String getBed_no() {
        return Bed_no;
    }

    public void setBed_no(String bed_no) {
        Bed_no = bed_no;
    }
    @JsonProperty("Order_item")
    public String getOrder_item() {
        return Order_item;
    }

    public void setOrder_item(String order_item) {
        Order_item = order_item;
    }
    @JsonProperty("Req_date")
    public String getReq_date() {
        return Req_date;
    }

    public void setReq_date(String req_date) {
        Req_date = req_date;
    }
    @JsonProperty("Sampling_date")
    public String getSampling_date() {
        return Sampling_date;
    }

    public void setSampling_date(String sampling_date) {
        Sampling_date = sampling_date;
    }
    @JsonProperty("Receipt_date")
    public String getReceipt_date() {
        return Receipt_date;
    }

    public void setReceipt_date(String receipt_date) {
        Receipt_date = receipt_date;
    }
    @JsonProperty("Receipt_date1")
    public String getReceipt_date1() {
        return Receipt_date1;
    }

    public void setReceipt_date1(String receipt_date1) {
        Receipt_date1 = receipt_date1;
    }
    @JsonProperty("Test_date")
    public String getTest_date() {
        return Test_date;
    }

    public void setTest_date(String test_date) {
        Test_date = test_date;
    }
    @JsonProperty("Report_date")
    public String getReport_date() {
        return Report_date;
    }

    public void setReport_date(String report_date) {
        Report_date = report_date;
    }
    @JsonProperty("Req_doctor")
    public String getReq_doctor() {
        return Req_doctor;
    }

    public void setReq_doctor(String req_doctor) {
        Req_doctor = req_doctor;
    }
    @JsonProperty("Sampling_doctor")
    public String getSampling_doctor() {
        return Sampling_doctor;
    }

    public void setSampling_doctor(String sampling_doctor) {
        Sampling_doctor = sampling_doctor;
    }
    @JsonProperty("Test_doctor")
    public String getTest_doctor() {
        return Test_doctor;
    }

    public void setTest_doctor(String test_doctor) {
        Test_doctor = test_doctor;
    }
    @JsonProperty("Report_doctor")
    public String getReport_doctor() {
        return Report_doctor;
    }

    public void setReport_doctor(String report_doctor) {
        Report_doctor = report_doctor;
    }
    @JsonProperty("Report_type")
    public String getReport_type() {
        return Report_type;
    }

    public void setReport_type(String report_type) {
        Report_type = report_type;
    }
    @JsonProperty("Normal")
    public List<LisReportUploadNormal> getNormal() {
        return Normal;
    }

    public void setNormal(List<LisReportUploadNormal> normal) {
        Normal = normal;
    }
    @JsonProperty("Germinfo")
    public List<LisReportUploadGerminfo> getGerminfo() {
        return Germinfo;
    }

    public void setGerminfo(List<LisReportUploadGerminfo> germinfo) {
        Germinfo = germinfo;
    }
    @JsonProperty("Antiinfo")
    public List<LisReportUploadAntiinfo> getAntiinfo() {
        return Antiinfo;
    }

    public void setAntiinfo(List<LisReportUploadAntiinfo> antiinfo) {
        Antiinfo = antiinfo;
    }
}
