package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Rechargededuction {
	private Integer rid;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date time;
	private Integer mid;
	private Integer point;
	private String remark;
	private String colunm1;
	private Integer colunm2;
	
	private Member m;
	
	public Member getM() {
		return m;
	}
	public void setM(Member m) {
		this.m = m;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getColunm1() {
		return colunm1;
	}
	public void setColunm1(String colunm1) {
		this.colunm1 = colunm1;
	}
	public Integer getColunm2() {
		return colunm2;
	}
	public void setColunm2(Integer colunm2) {
		this.colunm2 = colunm2;
	}
	
	
}
