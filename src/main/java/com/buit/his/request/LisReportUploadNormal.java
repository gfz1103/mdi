package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/25.
 */
@ApiModel(value="上传检验报告-normal")
public class LisReportUploadNormal implements Serializable {
    @ApiModelProperty(value="申请项目id")
    private String Feeitem_no;
    @ApiModelProperty(value="申请项目名称")
    private String Feeitem_name;
    @ApiModelProperty(value="项目代码")
    private String Item_code;
    @ApiModelProperty(value="项目名称")
    private String Item_name;
    @ApiModelProperty(value="结果")
    private String Result;
    @ApiModelProperty(value="参考值")
    private String Ref;
    @ApiModelProperty(value="参考值高")
    private String High;
    @ApiModelProperty(value="参考值低")
    private String Low;
    @ApiModelProperty(value="单位")
    private String Unit;
    @ApiModelProperty(value="危急值(0，否，1，是)")
    private String Limit_flag;
    @ApiModelProperty(value="H,L,P,N,Q,N")
    private String Result_flag;

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
    @JsonProperty("Item_code")
    public String getItem_code() {
        return Item_code;
    }

    public void setItem_code(String item_code) {
        Item_code = item_code;
    }
    @JsonProperty("Item_name")
    public String getItem_name() {
        return Item_name;
    }

    public void setItem_name(String item_name) {
        Item_name = item_name;
    }
    @JsonProperty("Result")
    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
    @JsonProperty("Ref")
    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }
    @JsonProperty("High")
    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }
    @JsonProperty("Low")
    public String getLow() {
        return Low;
    }

    public void setLow(String low) {
        Low = low;
    }
    @JsonProperty("Unit")
    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }
    @JsonProperty("Limit_flag")
    public String getLimit_flag() {
        return Limit_flag;
    }

    public void setLimit_flag(String limit_flag) {
        Limit_flag = limit_flag;
    }
    @JsonProperty("Result_flag")
    public String getResult_flag() {
        return Result_flag;
    }

    public void setResult_flag(String result_flag) {
        Result_flag = result_flag;
    }
}
