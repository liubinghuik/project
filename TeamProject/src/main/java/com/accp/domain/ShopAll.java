package com.accp.domain;

import java.util.Date;

public class ShopAll {
	

	public ShopAll(String uaccount, Integer sid, Integer pid, String stname) {
		super();
		this.uaccount = uaccount;
		this.sid = sid;
		this.pid = pid;
		this.stname = stname;
	}

	//店铺部分----
	//用户表user
	 private Integer uid;

    private String uaccount;

    private String upwd;

    private String phone;

    private String userpic;

    private String industry;
    
    //店铺表shop
    private Integer sid;

    private String sname;

    private String linkman;

    private String sphone;

    private String telephone;

    private String provincename;

    private String cityname;

    private String regionname;

    private String street;

    private Integer state;
    //员工人数
    private Integer stafftotal;
    
    //职位表position
    private Integer pid;

    private String pname;
    
    //权限表jurisdiction
    private Integer jid;

    private String jname;

    private Integer fatherid;
    
    // 职位权限表positionjurisdiction
    private Integer pjid;
    
    //模型表model
    private Integer moid;

    private String moname;

    private Integer mfatherid;

    private Integer menuid;

    private String path;

    private String column1;

    private String column2;

    private String column3;
    
    //模型职位表modelposition
    private Integer mpid;

    //员工表staff
    private Integer stid;

    private String jobnumber;

    private String stname;

    private String stpwd;

    private Integer ststate;

    private Date createtime;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUaccount() {
		return uaccount;
	}

	public void setUaccount(String uaccount) {
		this.uaccount = uaccount;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserpic() {
		return userpic;
	}

	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
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

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getJid() {
		return jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public Integer getFatherid() {
		return fatherid;
	}

	public void setFatherid(Integer fatherid) {
		this.fatherid = fatherid;
	}

	public Integer getPjid() {
		return pjid;
	}

	public void setPjid(Integer pjid) {
		this.pjid = pjid;
	}

	public Integer getMoid() {
		return moid;
	}

	public void setMoid(Integer moid) {
		this.moid = moid;
	}

	public String getMoname() {
		return moname;
	}

	public void setMoname(String moname) {
		this.moname = moname;
	}

	public Integer getMfatherid() {
		return mfatherid;
	}

	public void setMfatherid(Integer mfatherid) {
		this.mfatherid = mfatherid;
	}

	public Integer getMenuid() {
		return menuid;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public String getColumn3() {
		return column3;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public Integer getMpid() {
		return mpid;
	}

	public void setMpid(Integer mpid) {
		this.mpid = mpid;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getJobnumber() {
		return jobnumber;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getStpwd() {
		return stpwd;
	}

	public void setStpwd(String stpwd) {
		this.stpwd = stpwd;
	}

	public Integer getStstate() {
		return ststate;
	}

	public void setStstate(Integer ststate) {
		this.ststate = ststate;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public ShopAll() {
		super();
	}

	public Integer getStafftotal() {
		return stafftotal;
	}

	public void setStafftotal(Integer stafftotal) {
		this.stafftotal = stafftotal;
	}
    
}
