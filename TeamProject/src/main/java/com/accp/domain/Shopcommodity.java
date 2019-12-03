package com.accp.domain;

public class Shopcommodity {
    private Integer sid;

    private Integer cid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

	public Shopcommodity(Integer sid, Integer cid) {
		this.sid = sid;
		this.cid = cid;
	}

	public Shopcommodity() {
	}

}