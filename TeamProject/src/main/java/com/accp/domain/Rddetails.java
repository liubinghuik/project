package com.accp.domain;

public class Rddetails {
    private Integer did;

    private Integer cdid;

    private Integer articleno;

    private String rdorder;

    private Integer dage;

    private Float originalcost;

    private Float discount;

    private Float totalprice;

    private Integer state;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public Integer getArticleno() {
        return articleno;
    }

    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }

    public String getRdorder() {
        return rdorder;
    }

    public void setRdorder(String rdorder) {
        this.rdorder = rdorder;
    }

    public Integer getDage() {
        return dage;
    }

    public void setDage(Integer dage) {
        this.dage = dage;
    }

    public Float getOriginalcost() {
        return originalcost;
    }

    public void setOriginalcost(Float originalcost) {
        this.originalcost = originalcost;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}