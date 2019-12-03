package com.accp.domain;

public class Shop {
    private Integer sid;

    private String uaccount;

    private String sname;

    private String linkman;

    private String phone;

    private String telephone;

    private String provincename;

    private String cityname;

    private String regionname;

    private String street;

    private Integer state;

    @Override
	public String toString() {
		return "Shop [sid=" + sid + ", uaccount=" + uaccount + ", sname=" + sname + ", linkman=" + linkman + ", phone="
				+ phone + ", telephone=" + telephone + ", provincename=" + provincename + ", cityname=" + cityname
				+ ", regionname=" + regionname + ", street=" + street + ", state=" + state + "]";
	}

	

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}