package com.buit.his.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/4/24.
 */
@ApiModel(value="自助查询药品项目")
public class SelfQueryMedResp implements Serializable {
    @ApiModelProperty(value="药品名称")
    private String ypmc;
    @ApiModelProperty(value="规格")
    private String ypgg;
    @ApiModelProperty(value="单位")
    private String ypdw;
    @ApiModelProperty(value="单价(元)")
    private String lsjg;
    @ApiModelProperty(value="产地")
    private String cdmc;
    @ApiModelProperty(value="拼音码")
    private String pydm;

    public String getYpmc() {
        return ypmc;
    }

    public void setYpmc(String ypmc) {
        this.ypmc = ypmc;
    }

    public String getYpgg() {
        return ypgg;
    }

    public void setYpgg(String ypgg) {
        this.ypgg = ypgg;
    }

    public String getYpdw() {
        return ypdw;
    }

    public void setYpdw(String ypdw) {
        this.ypdw = ypdw;
    }

    public String getLsjg() {
        return lsjg;
    }

    public void setLsjg(String lsjg) {
        this.lsjg = lsjg;
    }

    public String getCdmc() {
        return cdmc;
    }

    public void setCdmc(String cdmc) {
        this.cdmc = cdmc;
    }

    public String getPydm() {
        return pydm;
    }

    public void setPydm(String pydm) {
        this.pydm = pydm;
    }
}
