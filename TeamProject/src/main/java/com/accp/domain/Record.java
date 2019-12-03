package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Record {
    private Integer rdid;

    private String rdorder;

    private Integer client;

    private Float total;

    private Float discount;

    private Float actualincome;

    private Float notincome;

    private String rdpay;

    private Integer sid;

    private String cashier;

    private String shopassistant;

    private Integer state;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private Member mem;

    public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Integer getRdid() {
        return rdid;
    }

    public void setRdid(Integer rdid) {
        this.rdid = rdid;
    }

    public String getRdorder() {
        return rdorder;
    }

    public void setRdorder(String rdorder) {
        this.rdorder = rdorder;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getActualincome() {
        return actualincome;
    }

    public void setActualincome(Float actualincome) {
        this.actualincome = actualincome;
    }

    public Float getNotincome() {
        return notincome;
    }

    public void setNotincome(Float notincome) {
        this.notincome = notincome;
    }

    public String getRdpay() {
        return rdpay;
    }

    public void setRdpay(String rdpay) {
        this.rdpay = rdpay;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getShopassistant() {
        return shopassistant;
    }

    public void setShopassistant(String shopassistant) {
        this.shopassistant = shopassistant;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    
}