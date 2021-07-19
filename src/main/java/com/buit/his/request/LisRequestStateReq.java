package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="LIS申请单状态")
public class LisRequestStateReq implements Serializable {

    @ApiModelProperty(value="登记医院")
    private String Hospital_id;
    @ApiModelProperty(value="类型（门诊，住院，体检）")
    private String Type;
    @ApiModelProperty(value="申请单号")
    private String Request_no;
    @ApiModelProperty(value="操作时间")
    private Timestamp Date;
    @ApiModelProperty(value="操作人")
    private String Doctor;
    @ApiModelProperty(value="状态1-执行2-上机3-完成")
    private String State;
    @JsonProperty("Hospital_id")
    public String getHospital_id() {
        return Hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        Hospital_id = hospital_id;
    }
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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
    @JsonProperty("State")
    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
