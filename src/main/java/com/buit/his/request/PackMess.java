package com.buit.his.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by sg on 2021/4/15.
 */
public class PackMess {
    @ApiModelProperty(value="phar_fyjl表JLID")
    private Integer jlid;

    public Integer getJlid() {
        return jlid;
    }

    public void setJlid(Integer jlid) {
        this.jlid = jlid;
    }
}
