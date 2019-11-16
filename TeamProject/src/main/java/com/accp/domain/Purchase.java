package com.accp.domain;

import java.util.Date;

public class Purchase {
    private Integer puid;

    private String odd;

    private String auditstate;

    private Date deliverydate;

    private Integer suid;

    private Integer sid;

    private String uaccount;

    private String remark;

    private Date createtime;

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
}