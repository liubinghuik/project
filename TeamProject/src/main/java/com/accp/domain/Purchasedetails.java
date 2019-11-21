package com.accp.domain;

public class Purchasedetails {
    private Integer pudid;

    private Integer puid;

    private Integer amount;

    private Integer cdid;
    
    private Double moeny;

    public Integer getPudid() {
        return pudid;
    }

    public void setPudid(Integer pudid) {
        this.pudid = pudid;
    }

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

	public Double getMoeny() {
		return moeny;
	}

	public void setMoeny(Double moeny) {
		this.moeny = moeny;
	}
    
}