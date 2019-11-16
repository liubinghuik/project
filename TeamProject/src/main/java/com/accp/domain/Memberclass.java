package com.accp.domain;

public class Memberclass {
    private Integer mcid;

    private String mcname;

    private Float require;

    private Float discount;

    private Integer mstate;

    public Integer getMcid() {
        return mcid;
    }

    public void setMcid(Integer mcid) {
        this.mcid = mcid;
    }

    public String getMcname() {
        return mcname;
    }

    public void setMcname(String mcname) {
        this.mcname = mcname;
    }

    public Float getRequire() {
        return require;
    }

    public void setRequire(Float require) {
        this.require = require;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }
}