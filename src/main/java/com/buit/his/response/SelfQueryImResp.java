package com.buit.his.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sg on 2021/4/24.
 */
@ApiModel(value="自助查询住院清单")
public class SelfQueryImResp implements Serializable {
    @ApiModelProperty(value="住院号")
    private String zyh;
    @ApiModelProperty(value="住院号码")
    private String zyhm;
    @ApiModelProperty(value="姓名")
    private String xm;
    @ApiModelProperty(value="性别")
    private String xb;
    @ApiModelProperty(value="性质")
    private String xz;
    @ApiModelProperty(value="病区")
    private String bq;
    @ApiModelProperty(value="床号")
    private String ch;
    @ApiModelProperty(value="总计金额")
    private BigDecimal zjje;
    private List<SelfQueryImDetailResp> details;

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public String getZyhm() {
        return zyhm;
    }

    public void setZyhm(String zyhm) {
        this.zyhm = zyhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz;
    }

    public String getBq() {
        return bq;
    }

    public void setBq(String bq) {
        this.bq = bq;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public List<SelfQueryImDetailResp> getDetails() {
        return details;
    }

    public void setDetails(List<SelfQueryImDetailResp> details) {
        this.details = details;
    }

    public BigDecimal getZjje() {
        return zjje;
    }

    public void setZjje(BigDecimal zjje) {
        this.zjje = zjje;
    }
}
