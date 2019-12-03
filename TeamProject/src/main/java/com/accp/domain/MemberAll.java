package com.accp.domain;

import java.util.Date;
import java.util.List;

public class MemberAll {
	@Override
	public String toString() {
		return "MemberAll [mid=" + mid + ", mname=" + mname + ", mpassword=" + mpassword + ", mphone=" + mphone
				+ ", mmoney=" + mmoney + ", mbalance=" + mbalance + ", mintegral=" + mintegral + ", wechatid="
				+ wechatid + ", provincename=" + provincename + ", cityname=" + cityname + ", regionname=" + regionname
				+ ", street=" + street + ", createtime=" + createtime + ", mcid=" + mcid + ", mcname=" + mcname
				+ ", require=" + require + ", discount=" + discount + ", mstate=" + mstate + ", rdid=" + rdid
				+ ", rdorder=" + rdorder + ", client=" + client + ", total=" + total + ", rdiscount=" + rdiscount
				+ ", actualincome=" + actualincome + ", notincome=" + notincome + ", rdpay=" + rdpay + ", sid=" + sid
				+ ", cashier=" + cashier + ", shopassistant=" + shopassistant + ", rstate=" + rstate + ", rcreatetime="
				+ rcreatetime + ", tabledata=" + tabledata + ", did=" + did + ", cdid=" + cdid + ", articleno="
				+ articleno + ", dage=" + dage + ", originalcost=" + originalcost + ", rddiscount=" + rddiscount
				+ ", totalprice=" + totalprice + ", state=" + state + "]";
	}

	// 会员表
	private Integer mid;

	private String mname;

	private String mpassword;

	private String mphone;

	private Float mmoney;

	private Float mbalance;

	private Float mintegral;

	private String wechatid;

	private String provincename;

	private String cityname;

	private String regionname;

	private String street;

	private Date createtime;

	// 等级表
	private Integer mcid;

	private String mcname;

	private Float require;

	private Float discount;

	private Integer mstate;

	// record(成交记录表)
	private Integer rdid;

	private String rdorder;

	private Integer client;

	private Float total;

	private Float rdiscount;

	private Float actualincome;

	private Float notincome;

	private String rdpay;

	private Integer sid;

	private String cashier;

	private String shopassistant;

	private Integer rstate;

	private Date rcreatetime;
	
	private List<Rddetails> tabledata;

	// rddetails(成交记录详情表)
	private Integer did;

	private Integer cdid;

	private Integer articleno;

	private Integer dage;

	private Float originalcost;

	private Float rddiscount;

	private Float totalprice;

	private Integer state;

	public MemberAll(Integer client, Float total, Float rdiscount, Float actualincome, Float notincome, String rdpay,
			Integer sid, String cashier, String shopassistant, Integer rstate, List<Rddetails> tabledata) {
		super();
		this.client = client;
		this.total = total;
		this.rdiscount = rdiscount;
		this.actualincome = actualincome;
		this.notincome = notincome;
		this.rdpay = rdpay;
		this.sid = sid;
		this.cashier = cashier;
		this.shopassistant = shopassistant;
		this.rstate = rstate;
		this.tabledata = tabledata;
	}

	public List<Rddetails> getTabledata() {
		return tabledata;
	}

	public void setTabledata(List<Rddetails> tabledata) {
		this.tabledata = tabledata;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public Float getMmoney() {
		return mmoney;
	}

	public void setMmoney(Float mmoney) {
		this.mmoney = mmoney;
	}

	public Float getMbalance() {
		return mbalance;
	}

	public void setMbalance(Float mbalance) {
		this.mbalance = mbalance;
	}

	public Float getMintegral() {
		return mintegral;
	}

	public void setMintegral(Float mintegral) {
		this.mintegral = mintegral;
	}

	public String getWechatid() {
		return wechatid;
	}

	public void setWechatid(String wechatid) {
		this.wechatid = wechatid;
	}

	public String getProvincename() {
		return provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getMcid() {
		return mcid;
	}

	public void setMcid(Integer mcid) {
		this.mcid = mcid;
	}

	public String getMcname() {
		return mcname;
	}

	public void setMcname(String mcname) {
		this.mcname = mcname;
	}

	public Float getRequire() {
		return require;
	}

	public void setRequire(Float require) {
		this.require = require;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Integer getMstate() {
		return mstate;
	}

	public void setMstate(Integer mstate) {
		this.mstate = mstate;
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

	public Float getRdiscount() {
		return rdiscount;
	}

	public void setRdiscount(Float rdiscount) {
		this.rdiscount = rdiscount;
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

	public Integer getRstate() {
		return rstate;
	}

	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}

	public Date getRcreatetime() {
		return rcreatetime;
	}

	public void setRcreatetime(Date rcreatetime) {
		this.rcreatetime = rcreatetime;
	}

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

	public Float getRddiscount() {
		return rddiscount;
	}

	public void setRddiscount(Float rddiscount) {
		this.rddiscount = rddiscount;
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

	public MemberAll() {
		super();
	}

	

	

	public MemberAll(Integer mid, Float mmoney, Float mbalance, Float mintegral) {
		super();
		this.mid = mid;
		this.mmoney = mmoney;
		this.mbalance = mbalance;
		this.mintegral = mintegral;
	}

	public MemberAll(String rdorder, Integer cdid, Integer articleno, Integer dage, Float originalcost,
			Float rddiscount, Float totalprice, Integer state) {
		super();
		this.rdorder = rdorder;
		this.cdid = cdid;
		this.articleno = articleno;
		this.dage = dage;
		this.originalcost = originalcost;
		this.rddiscount = rddiscount;
		this.totalprice = totalprice;
		this.state = state;
	}

	public MemberAll(String rdorder, Integer client, Float total, Float rdiscount, Float actualincome, Float notincome,
			String rdpay, Integer sid, String cashier, String shopassistant, Integer rstate) {
		super();
		this.rdorder = rdorder;
		this.client = client;
		this.total = total;
		this.rdiscount = rdiscount;
		this.actualincome = actualincome;
		this.notincome = notincome;
		this.rdpay = rdpay;
		this.sid = sid;
		this.cashier = cashier;
		this.shopassistant = shopassistant;
		this.rstate = rstate;
	}

	

}
