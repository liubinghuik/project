package com.accp.domain;

public class Modelposition {
    private Integer mpid;

    private Integer moid;

    private Integer pid;


    public Modelposition(Integer moid, Integer pid) {
		super();
		this.moid = moid;
		this.pid = pid;
	}


	public Modelposition() {
		super();
	}

	public Integer getMpid() {
        return mpid;
    }

    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public Integer getMoid() {
        return moid;
    }

    public void setMoid(Integer moid) {
        this.moid = moid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}