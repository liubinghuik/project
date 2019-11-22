package com.accp.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PurchaseVO {

	/*采购表*/
	private Integer puid;

    private String odd;

    private String auditstate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliverydate;

    private Integer suid;

    private Integer sid;

    private String uaccount;

    private String remark;

    private Date createtime;
    
    /*采购详情表*/
    private Integer amount;

    private Double moeny;
    
    private Integer cdid;
    
    /*供应商表*/
    private String suname;
    
    /*商品表*/
    private Integer cid;

    private Integer csid;

    private String cname;

    private String brand;

    private String articleno;

    private Float sell;

    private Float cost;

    private String message;
    
    /*商品详情表*/
    private String shapecode;

    private Integer sizeid;

    private Integer colorid;

    private Integer inventory;
    
    /*尺码表*/
    private String sizename;
    
    /*颜色表*/
    private String colorname;

    private String colorpicture;

    private Integer fatherid;

	public Integer getPuid() {
		return puid;
	}

	public void setPuid(Integer puid) {
		this.puid = puid;
	}

	public String getOdd() {
		return odd;
	}

	public void setOdd(String odd) {
		this.odd = odd;
	}

	public String getAuditstate() {
		return auditstate;
	}

	public void setAuditstate(String auditstate) {
		this.auditstate = auditstate;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public Integer getSuid() {
		return suid;
	}

	public void setSuid(Integer suid) {
		this.suid = suid;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getMoeny() {
		return moeny;
	}

	public void setMoeny(Double moeny) {
		this.moeny = moeny;
	}

	public Integer getCdid() {
		return cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
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

	public String getShapecode() {
		return shapecode;
	}

	public void setShapecode(String shapecode) {
		this.shapecode = shapecode;
	}

	public Integer getSizeid() {
		return sizeid;
	}

	public void setSizeid(Integer sizeid) {
		this.sizeid = sizeid;
	}

	public Integer getColorid() {
		return colorid;
	}

	public void setColorid(Integer colorid) {
		this.colorid = colorid;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getSizename() {
		return sizename;
	}

	public void setSizename(String sizename) {
		this.sizename = sizename;
	}

	public String getColorname() {
		return colorname;
	}

	public void setColorname(String colorname) {
		this.colorname = colorname;
	}

	public String getColorpicture() {
		return colorpicture;
	}

	public void setColorpicture(String colorpicture) {
		this.colorpicture = colorpicture;
	}

	public Integer getFatherid() {
		return fatherid;
	}

	public void setFatherid(Integer fatherid) {
		this.fatherid = fatherid;
	}

	
}
