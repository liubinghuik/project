package com.accp.domain;

import java.util.Date;

public class Staff {
    private Integer stid;

    private Integer sid;

    private Integer pid;

    private String jobnumber;

    private String stname;

    private String stpwd;

    private Integer ststate;

    private Date createtime;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

	public Staff() {
		super();
	}

	public Staff(Integer stid, String jobnumber, String stpwd) {
		super();
		this.stid = stid;
		this.jobnumber = jobnumber;
		this.stpwd = stpwd;
	}
}