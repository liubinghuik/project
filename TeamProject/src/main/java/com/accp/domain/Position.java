package com.accp.domain;

public class Position {
    private Integer pid;

    private String pname;

   

	public Position() {
		super();
	}

	public Position(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
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
    
}