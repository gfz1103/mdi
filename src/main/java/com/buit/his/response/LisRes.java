package com.buit.his.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="LIS返回")
public class LisRes implements Serializable {
    @ApiModelProperty(value="成功返回0，失败返回-1")
    private String code;
    @ApiModelProperty(value="失败返回内容")
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
