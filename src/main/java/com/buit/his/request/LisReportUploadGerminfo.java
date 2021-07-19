package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/25.
 */
@ApiModel(value="上传检验报告-Germinfo")
public class LisReportUploadGerminfo implements Serializable {
    @ApiModelProperty(value="申请项目id")
    private String Feeitem_no;
    @ApiModelProperty(value="申请项目名称")
    private String Feeitem_name;
    @ApiModelProperty(value="细菌项目id")
    private String Germ_code;
    @ApiModelProperty(value="细菌项目名称")
    private String Germ_name;
    @ApiModelProperty(value="结果")
    private String Result;
    @ApiModelProperty(value="结果类型")
    private String Result_type;
    @ApiModelProperty(value="备注")
    private String Bz;

    @JsonProperty("Feeitem_no")
    public String getFeeitem_no() {
        return Feeitem_no;
    }

    public void setFeeitem_no(String feeitem_no) {
        Feeitem_no = feeitem_no;
    }
    @JsonProperty("Feeitem_name")
    public String getFeeitem_name() {
        return Feeitem_name;
    }

    public void setFeeitem_name(String feeitem_name) {
        Feeitem_name = feeitem_name;
    }
    @JsonProperty("Germ_code")
    public String getGerm_code() {
        return Germ_code;
    }

    public void setGerm_code(String germ_code) {
        Germ_code = germ_code;
    }
    @JsonProperty("Germ_name")
    public String getGerm_name() {
        return Germ_name;
    }

    public void setGerm_name(String germ_name) {
        Germ_name = germ_name;
    }
    @JsonProperty("Result")
    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
    @JsonProperty("Result_type")
    public String getResult_type() {
        return Result_type;
    }

    public void setResult_type(String result_type) {
        Result_type = result_type;
    }
    @JsonProperty("Bz")
    public String getBz() {
        return Bz;
    }

    public void setBz(String bz) {
        Bz = bz;
    }
}
