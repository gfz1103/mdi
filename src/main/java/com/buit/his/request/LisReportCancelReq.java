package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="LIS检验报告撤销")
public class LisReportCancelReq implements Serializable {
    @ApiModelProperty(value="报告单唯一号")
    private String Report_id;
    @ApiModelProperty(value="医院id")
    private String Hospital_id;

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
}
