package com.accp.vo;

public class commodityVO {

	/*商品类别*/
	private String csname;
	
	/*商品主表*/
	private Integer cid;

    private Integer csid;

    private String cname;

    private String articleno;

    private Float sell;

    private Float cost;

    /*商品详情*/
    private String shapecode;

    private Integer sizeid;

    private Integer colorid;

    private Integer inventory;
    
    /*尺码*/
    private String sizename;
    
    /*颜色*/
    private String colorname;

    private String colorpicture;

    private Integer fatherid;

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
