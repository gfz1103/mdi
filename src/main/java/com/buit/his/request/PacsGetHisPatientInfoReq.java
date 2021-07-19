package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/26.
 */
@ApiModel(value="PACS病人信息提取")
public class PacsGetHisPatientInfoReq implements Serializable {
    @ApiModelProperty(value="HIS给出的编号（比如申请单号码等）")
    private String Input_NO;
    @ApiModelProperty(value="病人类型，门诊，住院")
    private String PatientType;
    @ApiModelProperty(value="检查设备，US，CT，XR，动态心电")
    private String Modality;
    @ApiModelProperty(value="开始时间")
    private String StartDate;
    @ApiModelProperty(value="结束时间")
    private String EndDate;

    @JsonProperty("Input_NO")
    public String getInput_NO() {
        return Input_NO;
    }

    public void setInput_NO(String input_NO) {
        Input_NO = input_NO;
    }
    @JsonProperty("PatientType")
    public String getPatientType() {
        return PatientType;
    }

    public void setPatientType(String patientType) {
        PatientType = patientType;
    }
    @JsonProperty("Modality")
    public String getModality() {
        return Modality;
    }

    public void setModality(String modality) {
        Modality = modality;
    }
    @JsonProperty("StartDate")
    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }
    @JsonProperty("EndDate")
    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
}
