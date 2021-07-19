package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/25.
 */
@ApiModel(value="上传检验报告-Antiinfo")
public class LisReportUploadAntiinfo implements Serializable {
    @ApiModelProperty(value="申请项目id")
    private String Feeitem_no;
    @ApiModelProperty(value="申请项目名称")
    private String Feeitem_name;
    @ApiModelProperty(value="细菌项目id")
    private String Germ_code;
    @ApiModelProperty(value="细菌项目名称")
    private String Germ_name;
    @ApiModelProperty(value="药敏项目id")
    private String Anti_code;
    @ApiModelProperty(value="药敏项目名称")
    private String Anti_name;
    @ApiModelProperty(value="药敏结果")
    private String Anti_result;
    @ApiModelProperty(value="R耐药/S敏感/I中敏")
    private String Anti_result1;

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
    @JsonProperty("Anti_code")
    public String getAnti_code() {
        return Anti_code;
    }

    public void setAnti_code(String anti_code) {
        Anti_code = anti_code;
    }
    @JsonProperty("Anti_name")
    public String getAnti_name() {
        return Anti_name;
    }

    public void setAnti_name(String anti_name) {
        Anti_name = anti_name;
    }
    @JsonProperty("Anti_result")
    public String getAnti_result() {
        return Anti_result;
    }

    public void setAnti_result(String anti_result) {
        Anti_result = anti_result;
    }
    @JsonProperty("Anti_result1")
    public String getAnti_result1() {
        return Anti_result1;
    }

    public void setAnti_result1(String anti_result1) {
        Anti_result1 = anti_result1;
    }
}
