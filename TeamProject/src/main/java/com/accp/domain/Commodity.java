package com.accp.domain;

import java.util.List;

public class Commodity {
    private Integer cid;

    private Integer csid;

    private String cname;

    private String brand;

    private String articleno;

    private Float sell;

    private Float cost;

    private String message;
    
    private String picture;
    
    private List<Commoditydetails> details;
    
    

    public List<Commoditydetails> getDetails() {
		return details;
	}

	public void setDetails(List<Commoditydetails> details) {
		this.details = details;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getArticleno() {
        return articleno;
    }

    public void setArticleno(String articleno) {
        this.articleno = articleno;
    }

    public Float getSell() {
        return sell;
    }

    public void setSell(Float sell) {
        this.sell = sell;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Commodity(Integer cid, Integer csid, String cname, String brand, String articleno, Float sell, Float cost,
			String message, String picture) {
		this.cid = cid;
		this.csid = csid;
		this.cname = cname;
		this.brand = brand;
		this.articleno = articleno;
		this.sell = sell;
		this.cost = cost;
		this.message = message;
		this.picture = picture;
	}

	public Commodity() {
		
	}
	
}