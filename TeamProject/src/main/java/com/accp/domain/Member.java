package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Member {
	
    public Member(Integer mid, Float mbalance) {
		super();
		this.mid = mid;
		this.mbalance = mbalance;
	}

	public Member() {
		super();
	}

	public Member(Integer mid, String mname, String mpassword, String mphone, Float mmoney, Float mbalance,
			Float mintegral, String wechatid, String provincename, String cityname, String regionname, String street,
			Date createtime, Integer mcid, Memberclass mb) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mpassword = mpassword;
		this.mphone = mphone;
		this.mmoney = mmoney;
		this.mbalance = mbalance;
		this.mintegral = mintegral;
		this.wechatid = wechatid;
		this.provincename = provincename;
		this.cityname = cityname;
		this.regionname = regionname;
		this.street = street;
		this.createtime = createtime;
		this.mcid = mcid;
		this.mb = mb;
	}

	private Integer mid;

    private String mname;

    private String mpassword;

    private String mphone;

    private Float mmoney;

    private Float mbalance;

    private Float mintegral;

    private String wechatid;

    private String provincename;

    private String cityname;

    private String regionname;

    private String street;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private Integer mcid;
    
    private Memberclass mb;
    
    public Memberclass getMb() {
		return mb;
	}

	public void setMb(Memberclass mb) {
		this.mb = mb;
	}

	public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public Float getMmoney() {
        return mmoney;
    }

    public void setMmoney(Float mmoney) {
        this.mmoney = mmoney;
    }

    public Float getMbalance() {
        return mbalance;
    }

    public void setMbalance(Float mbalance) {
        this.mbalance = mbalance;
    }

    public Float getMintegral() {
        return mintegral;
    }

    public void setMintegral(Float mintegral) {
        this.mintegral = mintegral;
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getMcid() {
        return mcid;
    }

    public void setMcid(Integer mcid) {
        this.mcid = mcid;
    }
}