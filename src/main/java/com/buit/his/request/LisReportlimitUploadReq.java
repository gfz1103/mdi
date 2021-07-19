package com.buit.his.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by sg on 2021/3/24.
 */
@ApiModel(value="LIS危急值上传")
public class LisReportlimitUploadReq implements Serializable {
    @ApiModelProperty(value="登记医院")
    private String Hospital_id;
    @ApiModelProperty(value="报告单唯一号")
    private String Report_id;
    @ApiModelProperty(value="病人类型")
    private String BRLX;
    @ApiModelProperty(value="门诊号")
    private String MZH;
    @ApiModelProperty(value="住院号")
    private String ZYH;
    @ApiModelProperty(value="病区代码")
    private String BQDM;
    @ApiModelProperty(value="科室代码")
    private String KSDM;
    @ApiModelProperty(value="床号")
    private String CH;
    @ApiModelProperty(value="发送时间")
    private String FSSJ;
    @ApiModelProperty(value="发送人代码")
    private String FSRDM;
    @ApiModelProperty(value="危急值项目代码")
    private String WJZXMDM;
    @ApiModelProperty(value="危急值项目名称")
    private String WJZXMMC;
    @ApiModelProperty(value="危急值结果")
    private String WJZJG;
    @ApiModelProperty(value="危急值参考值")
    private String ZCCKZ;

    @JsonProperty("Hospital_id")
    public String getHospital_id() {
        return Hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        Hospital_id = hospital_id;
    }
    @JsonProperty("Report_id")
    public String getReport_id() {
        return Report_id;
    }

    public void setReport_id(String report_id) {
        Report_id = report_id;
    }
    @JsonProperty("BRLX")
    public String getBRLX() {
        return BRLX;
    }

    public void setBRLX(String BRLX) {
        this.BRLX = BRLX;
    }
    @JsonProperty("MZH")
    public String getMZH() {
        return MZH;
    }

    public void setMZH(String MZH) {
        this.MZH = MZH;
    }
    @JsonProperty("ZYH")
    public String getZYH() {
        return ZYH;
    }

    public void setZYH(String ZYH) {
        this.ZYH = ZYH;
    }
    @JsonProperty("BQDM")
    public String getBQDM() {
        return BQDM;
    }

    public void setBQDM(String BQDM) {
        this.BQDM = BQDM;
    }
    @JsonProperty("KSDM")
    public String getKSDM() {
        return KSDM;
    }

    public void setKSDM(String KSDM) {
        this.KSDM = KSDM;
    }
    @JsonProperty("CH")
    public String getCH() {
        return CH;
    }

    public void setCH(String CH) {
        this.CH = CH;
    }
    @JsonProperty("FSSJ")
    public String getFSSJ() {
        return FSSJ;
    }

    public void setFSSJ(String FSSJ) {
        this.FSSJ = FSSJ;
    }
    @JsonProperty("FSRDM")
    public String getFSRDM() {
        return FSRDM;
    }

    public void setFSRDM(String FSRDM) {
        this.FSRDM = FSRDM;
    }
    @JsonProperty("WJZXMDM")
    public String getWJZXMDM() {
        return WJZXMDM;
    }

    public void setWJZXMDM(String WJZXMDM) {
        this.WJZXMDM = WJZXMDM;
    }
    @JsonProperty("WJZXMMC")
    public String getWJZXMMC() {
        return WJZXMMC;
    }

    public void setWJZXMMC(String WJZXMMC) {
        this.WJZXMMC = WJZXMMC;
    }
    @JsonProperty("WJZJG")
    public String getWJZJG() {
        return WJZJG;
    }

    public void setWJZJG(String WJZJG) {
        this.WJZJG = WJZJG;
    }
    @JsonProperty("ZCCKZ")
    public String getZCCKZ() {
        return ZCCKZ;
    }

    public void setZCCKZ(String ZCCKZ) {
        this.ZCCKZ = ZCCKZ;
    }
}
