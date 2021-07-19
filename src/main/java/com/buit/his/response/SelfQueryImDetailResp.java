package com.buit.his.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by sg on 2021/4/24.
 */
@ApiModel(value="自助查询住院清单明细")
public class SelfQueryImDetailResp implements Serializable {
    @ApiModelProperty(value="类别")
    private String lb;
    @ApiModelProperty(value="项目名称")
    private String xmmc;
    @ApiModelProperty(value="规格")
    private String gg;
    @ApiModelProperty(value="单价")
    private String dj;
    @ApiModelProperty(value="数量")
    private String sl;
    @ApiModelProperty(value="金额")
    private BigDecimal je;
    @ApiModelProperty(value="日期")
    private String rq;

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public BigDecimal getJe() {
        return je;
    }

    public void setJe(BigDecimal je) {
        this.je = je;
    }

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }
}
