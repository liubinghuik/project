package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNull() {
            addCriterion("mpassword is null");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNotNull() {
            addCriterion("mpassword is not null");
            return (Criteria) this;
        }

        public Criteria andMpasswordEqualTo(String value) {
            addCriterion("mpassword =", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotEqualTo(String value) {
            addCriterion("mpassword <>", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThan(String value) {
            addCriterion("mpassword >", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mpassword >=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThan(String value) {
            addCriterion("mpassword <", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThanOrEqualTo(String value) {
            addCriterion("mpassword <=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLike(String value) {
            addCriterion("mpassword like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotLike(String value) {
            addCriterion("mpassword not like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordIn(List<String> values) {
            addCriterion("mpassword in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotIn(List<String> values) {
            addCriterion("mpassword not in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordBetween(String value1, String value2) {
            addCriterion("mpassword between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotBetween(String value1, String value2) {
            addCriterion("mpassword not between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("mphone is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("mphone is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("mphone =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("mphone <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("mphone >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mphone >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("mphone <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("mphone <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("mphone like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("mphone not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("mphone in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("mphone not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("mphone between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("mphone not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMmoneyIsNull() {
            addCriterion("mmoney is null");
            return (Criteria) this;
        }

        public Criteria andMmoneyIsNotNull() {
            addCriterion("mmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMmoneyEqualTo(Float value) {
            addCriterion("mmoney =", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotEqualTo(Float value) {
            addCriterion("mmoney <>", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThan(Float value) {
            addCriterion("mmoney >", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("mmoney >=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThan(Float value) {
            addCriterion("mmoney <", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThanOrEqualTo(Float value) {
            addCriterion("mmoney <=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyIn(List<Float> values) {
            addCriterion("mmoney in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotIn(List<Float> values) {
            addCriterion("mmoney not in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyBetween(Float value1, Float value2) {
            addCriterion("mmoney between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotBetween(Float value1, Float value2) {
            addCriterion("mmoney not between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMbalanceIsNull() {
            addCriterion("mbalance is null");
            return (Criteria) this;
        }

        public Criteria andMbalanceIsNotNull() {
            addCriterion("mbalance is not null");
            return (Criteria) this;
        }

        public Criteria andMbalanceEqualTo(Float value) {
            addCriterion("mbalance =", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceNotEqualTo(Float value) {
            addCriterion("mbalance <>", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceGreaterThan(Float value) {
            addCriterion("mbalance >", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("mbalance >=", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceLessThan(Float value) {
            addCriterion("mbalance <", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceLessThanOrEqualTo(Float value) {
            addCriterion("mbalance <=", value, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceIn(List<Float> values) {
            addCriterion("mbalance in", values, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceNotIn(List<Float> values) {
            addCriterion("mbalance not in", values, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceBetween(Float value1, Float value2) {
            addCriterion("mbalance between", value1, value2, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMbalanceNotBetween(Float value1, Float value2) {
            addCriterion("mbalance not between", value1, value2, "mbalance");
            return (Criteria) this;
        }

        public Criteria andMintegralIsNull() {
            addCriterion("mintegral is null");
            return (Criteria) this;
        }

        public Criteria andMintegralIsNotNull() {
            addCriterion("mintegral is not null");
            return (Criteria) this;
        }

        public Criteria andMintegralEqualTo(Float value) {
            addCriterion("mintegral =", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralNotEqualTo(Float value) {
            addCriterion("mintegral <>", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralGreaterThan(Float value) {
            addCriterion("mintegral >", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralGreaterThanOrEqualTo(Float value) {
            addCriterion("mintegral >=", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralLessThan(Float value) {
            addCriterion("mintegral <", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralLessThanOrEqualTo(Float value) {
            addCriterion("mintegral <=", value, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralIn(List<Float> values) {
            addCriterion("mintegral in", values, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralNotIn(List<Float> values) {
            addCriterion("mintegral not in", values, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralBetween(Float value1, Float value2) {
            addCriterion("mintegral between", value1, value2, "mintegral");
            return (Criteria) this;
        }

        public Criteria andMintegralNotBetween(Float value1, Float value2) {
            addCriterion("mintegral not between", value1, value2, "mintegral");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNull() {
            addCriterion("wechatid is null");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNotNull() {
            addCriterion("wechatid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatidEqualTo(String value) {
            addCriterion("wechatid =", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotEqualTo(String value) {
            addCriterion("wechatid <>", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThan(String value) {
            addCriterion("wechatid >", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThanOrEqualTo(String value) {
            addCriterion("wechatid >=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThan(String value) {
            addCriterion("wechatid <", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThanOrEqualTo(String value) {
            addCriterion("wechatid <=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLike(String value) {
            addCriterion("wechatid like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotLike(String value) {
            addCriterion("wechatid not like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidIn(List<String> values) {
            addCriterion("wechatid in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotIn(List<String> values) {
            addCriterion("wechatid not in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidBetween(String value1, String value2) {
            addCriterion("wechatid between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotBetween(String value1, String value2) {
            addCriterion("wechatid not between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNull() {
            addCriterion("provincename is null");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNotNull() {
            addCriterion("provincename is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenameEqualTo(String value) {
            addCriterion("provincename =", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotEqualTo(String value) {
            addCriterion("provincename <>", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThan(String value) {
            addCriterion("provincename >", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThanOrEqualTo(String value) {
            addCriterion("provincename >=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThan(String value) {
            addCriterion("provincename <", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThanOrEqualTo(String value) {
            addCriterion("provincename <=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLike(String value) {
            addCriterion("provincename like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotLike(String value) {
            addCriterion("provincename not like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameIn(List<String> values) {
            addCriterion("provincename in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotIn(List<String> values) {
            addCriterion("provincename not in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameBetween(String value1, String value2) {
            addCriterion("provincename between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotBetween(String value1, String value2) {
            addCriterion("provincename not between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityname is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityname is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityname =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityname <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityname >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityname >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityname <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityname <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityname like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityname not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityname in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityname not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityname between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityname not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNull() {
            addCriterion("regionname is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNotNull() {
            addCriterion("regionname is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameEqualTo(String value) {
            addCriterion("regionname =", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotEqualTo(String value) {
            addCriterion("regionname <>", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThan(String value) {
            addCriterion("regionname >", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThanOrEqualTo(String value) {
            addCriterion("regionname >=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThan(String value) {
            addCriterion("regionname <", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThanOrEqualTo(String value) {
            addCriterion("regionname <=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLike(String value) {
            addCriterion("regionname like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotLike(String value) {
            addCriterion("regionname not like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIn(List<String> values) {
            addCriterion("regionname in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotIn(List<String> values) {
            addCriterion("regionname not in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameBetween(String value1, String value2) {
            addCriterion("regionname between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotBetween(String value1, String value2) {
            addCriterion("regionname not between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}