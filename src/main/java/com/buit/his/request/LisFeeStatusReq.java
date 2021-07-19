package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="LIS住院医嘱确费")
public class LisFeeStatusReq implements Serializable {
    @ApiModelProperty(value="登记医院")
    private String Hospital_id;
    @ApiModelProperty(value="申请单号")
    private String Request_no;
    @ApiModelProperty(value="申请单明细号")
    private String Requestdetail_no;
    @ApiModelProperty(value="操作时间")
    private Timestamp Date;
    @ApiModelProperty(value="操作人")
    private String Doctor;

    @JsonProperty("Hospital_id")
    public String getHospital_id() {
        return Hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        Hospital_id = hospital_id;
    }
    @JsonProperty("Request_no")
    public String getRequest_no() {
        return Request_no;
    }

    public void setRequest_no(String request_no) {
        Request_no = request_no;
    }
    @JsonProperty("Date")
    public Timestamp getDate() {
        return Date;
    }

    public void setDate(Timestamp date) {
        Date = date;
    }
    @JsonProperty("Doctor")
    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }
    @JsonProperty("Requestdetail_no")
    public String getRequestdetail_no() {
        return Requestdetail_no;
    }

    public void setRequestdetail_no(String requestdetail_no) {
        Requestdetail_no = requestdetail_no;
    }
}
