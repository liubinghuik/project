package com.accp.domain;

public class Commoditydetails {
    private Integer cdid;

    private Integer cid;

    private String shapecode;

    private Integer sizeid;

    private Integer colorid;

    private Integer inventory;
    
    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

	
    
	public Commoditydetails(Integer cid, String shapecode, Integer sizeid, Integer colorid,
			Integer inventory) {
		this.cid = cid;
		this.shapecode = shapecode;
		this.sizeid = sizeid;
		this.colorid = colorid;
		this.inventory = inventory;
	}

	public Commoditydetails() {
		
	}
}