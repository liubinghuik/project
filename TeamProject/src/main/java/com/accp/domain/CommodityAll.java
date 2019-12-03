package com.accp.domain;

public class CommodityAll {
	
	public CommodityAll(String uaccount, String csname) {
		super();
		this.uaccount = uaccount;
		this.csname = csname;
	}

	public CommodityAll(Integer cdid, Integer inventory) {
		super();
		this.cdid = cdid;
		this.inventory = inventory;
	}

	//用户表user
	private Integer uid;

	private String uaccount;
	
	//店铺表shop
    private Integer sid;
    
    //员工表staff
    private Integer stid;

    private String jobnumber;

    //商品类别表
    private Integer csid;

    private String csname;
    
	//commodity(商品表)
	private Integer cid;

    private String cname;

    private String brand;

    private String articleno;

    private Float sell;

    private Float cost;

    private String message;
    private String picture;
    
    //Commoditydetails商品详情
    private Integer cdid;

    private String shapecode;

    private Integer sizeid;

    private Integer colorid;

    private Integer inventory;

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

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

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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

	public Integer getCsid() {
		return csid;
	}

	public void setCsid(Integer csid) {
		this.csid = csid;
	}

	public String getCsname() {
		return csname;
	}

	public void setCsname(String csname) {
		this.csname = csname;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	public Integer getCdid() {
		return cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
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

	public CommodityAll() {
		super();
	}

	public CommodityAll(String uaccount, Integer csid) {
		super();
		this.uaccount = uaccount;
		this.csid = csid;
	}

}
