package com.accp.domain;

public class User {
    private Integer uid;

    private String uaccount;

    private String upwd;

    private String phone;

    private String userpic;

    private String industry;

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

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

	public User() {
		super();
	}

	public User(Integer uid, String userpic) {
		super();
		this.uid = uid;
		this.userpic = userpic;
	}

	public User(Integer uid, String uaccount, String upwd, String phone, String industry) {
		super();
		this.uid = uid;
		this.uaccount = uaccount;
		this.upwd = upwd;
		this.phone = phone;
		this.industry = industry;
	}

	public User(Integer uid, String uaccount, String upwd, String phone, String userpic, String industry) {
		super();
		this.uid = uid;
		this.uaccount = uaccount;
		this.upwd = upwd;
		this.phone = phone;
		this.userpic = userpic;
		this.industry = industry;
	}

	public User(String uaccount, String upwd) {
		super();
		this.uaccount = uaccount;
		this.upwd = upwd;
	}
	
	public User(String uaccount, String upwd, String phone, String userpic, String industry) {
		super();
		this.uaccount = uaccount;
		this.upwd = upwd;
		this.phone = phone;
		this.userpic = userpic;
		this.industry = industry;
	}

	public User(Integer uid, String uaccount, String upwd) {
		super();
		this.uid = uid;
		this.uaccount = uaccount;
		this.upwd = upwd;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uaccount=" + uaccount + ", upwd=" + upwd + ", phone=" + phone + ", userpic="
				+ userpic + ", industry=" + industry + "]";
	}
	
}