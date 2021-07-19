package com.buit.his.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/4/24.
 */
@ApiModel(value="自助查询收费项目")
public class SelfQueryItemResp implements Serializable {
    @ApiModelProperty(value="费用名称")
    private String fymc;
    @ApiModelProperty(value="费用单位")
    private String fydw;
    @ApiModelProperty(value="单价")
    private String fydj;
    @ApiModelProperty(value="拼音代码")
    private String pydm;

    public String getFymc() {
        return fymc;
    }

    public void setFymc(String fymc) {
        this.fymc = fymc;
    }

    public String getFydw() {
        return fydw;
    }

    public void setFydw(String fydw) {
        this.fydw = fydw;
    }

    public String getFydj() {
        return fydj;
    }

    public void setFydj(String fydj) {
        this.fydj = fydj;
    }

    public String getPydm() {
        return pydm;
    }

    public void setPydm(String pydm) {
        this.pydm = pydm;
    }
}
