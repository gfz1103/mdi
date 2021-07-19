package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/26.
 */
@ApiModel(value="PACS检查确认")
public class PacsHisIsChargeUpReq implements Serializable {
    @ApiModelProperty(value="HIS给出的编号（比如申请单号码等）与信息获取相对应")
    private String STUDY_ID;
    @ApiModelProperty(value="项目编号")
    private String CHKIT_ID;
    @ApiModelProperty(value="确认和取消确认标志FLAG=1，确认，FLAG=0，取消确认")
    private String FLAG;
    @JsonProperty("STUDY_ID")
    public String getSTUDY_ID() {
        return STUDY_ID;
    }

    public void setSTUDY_ID(String STUDY_ID) {
        this.STUDY_ID = STUDY_ID;
    }
    @JsonProperty("CHKIT_ID")
    public String getCHKIT_ID() {
        return CHKIT_ID;
    }

    public void setCHKIT_ID(String CHKIT_ID) {
        this.CHKIT_ID = CHKIT_ID;
    }
    @JsonProperty("FLAG")
    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }
}
