package com.buit.his.request;

import java.io.Serializable;
import java.util.List;

/**
 * HRP数据推送
 */
public class HisEjkf implements Serializable {
    /**
    * 账号
    */
    private String account;
    /**
    * 密码
    */
    private String password;
    /**
     * 密码
     */
    private String ssyydm;
    /**
     * 收费明细
     */
   private List<HisCubeBzEjkfPush> hiscubebzejkfpush;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSsyydm() {
        return ssyydm;
    }

    public void setSsyydm(String ssyydm) {
        this.ssyydm = ssyydm;
    }

    public List<HisCubeBzEjkfPush> getHiscubebzejkfpush() {
        return hiscubebzejkfpush;
    }

    public void setHiscubebzejkfpush(List<HisCubeBzEjkfPush> hiscubebzejkfpush) {
        this.hiscubebzejkfpush = hiscubebzejkfpush;
    }
}