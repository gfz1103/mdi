package com.buit.his.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * HRP数据推送明细数据
 */
public class HisCubeBzEjkfPush implements Serializable {
    /**
    * ID序号
    */
    private Long id;
    /**
    * 病人编码
    */
    private String brbh;
    /**
    * 病人姓名
    */
    private String brxm;
    /**
    * 所属病区代码
    */
    private String ssbq;
    /**
    * 所属病区名称
    */
    private String ssbqmc;
    /**
    * 项目编码
    */
    private String xmbm;
    /**
    * 项目名称
    */
    private String xmmc;
    /**
    * 项目规格
    */
    private String xmgg;
    /**
    * 项目单位
    */
    private String xmdw;
    /**
    * 项目使用数量
    */
    private String xmsysl;
    /**
    * 项目单价
    */
    private BigDecimal xmdj;
    /**
    * 项目使用金额
    */
    private BigDecimal xmsyje;
    /**
    * 项目使用时间
    */
    private String xmsysj;
    /**
    * 使用类型 确费0，退费1
    */
    private Integer sylx;
    /**
    * 流水号
    */
    private String lsh;
    /**
     * 所属科室代码
     */
    private String ssks;
    /**
     * 所属科室名称
     */
    private String ssksmc;
    /**
     * 备注
     */
    private  String memo;
    /**
     * his确费ID
     */
    private Integer hisid;
    /**
     * 机构代码
     */
    private  String jgid;
    /**
     * 机构名称
     */
    private  String jgname;
    /**
     * 1门诊，2住院，3体检，H互联网医院 目前都是2病区住院使用
     */
    private  String ywlx;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrbh() {
        return brbh;
    }

    public void setBrbh(String brbh) {
        this.brbh = brbh;
    }

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    public String getSsbq() {
        return ssbq;
    }

    public void setSsbq(String ssbq) {
        this.ssbq = ssbq;
    }

    public String getSsbqmc() {
        return ssbqmc;
    }

    public void setSsbqmc(String ssbqmc) {
        this.ssbqmc = ssbqmc;
    }

    public String getXmbm() {
        return xmbm;
    }

    public void setXmbm(String xmbm) {
        this.xmbm = xmbm;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXmgg() {
        return xmgg;
    }

    public void setXmgg(String xmgg) {
        this.xmgg = xmgg;
    }

    public String getXmdw() {
        return xmdw;
    }

    public void setXmdw(String xmdw) {
        this.xmdw = xmdw;
    }

    public String getXmsysl() {
        return xmsysl;
    }

    public void setXmsysl(String xmsysl) {
        this.xmsysl = xmsysl;
    }

    public BigDecimal getXmdj() {
        return xmdj;
    }

    public void setXmdj(BigDecimal xmdj) {
        this.xmdj = xmdj;
    }

    public BigDecimal getXmsyje() {
        return xmsyje;
    }

    public void setXmsyje(BigDecimal xmsyje) {
        this.xmsyje = xmsyje;
    }

    public String getXmsysj() {
        return xmsysj;
    }

    public void setXmsysj(String xmsysj) {
        this.xmsysj = xmsysj;
    }

    public Integer getSylx() {
        return sylx;
    }

    public void setSylx(Integer sylx) {
        this.sylx = sylx;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getSsks() {
        return ssks;
    }

    public void setSsks(String ssks) {
        this.ssks = ssks;
    }

    public String getSsksmc() {
        return ssksmc;
    }

    public void setSsksmc(String ssksmc) {
        this.ssksmc = ssksmc;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getHisid() {
        return hisid;
    }

    public void setHisid(Integer hisid) {
        this.hisid = hisid;
    }

    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    public String getJgname() {
        return jgname;
    }

    public void setJgname(String jgname) {
        this.jgname = jgname;
    }

    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }
}