package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRdidIsNull() {
            addCriterion("rdid is null");
            return (Criteria) this;
        }

        public Criteria andRdidIsNotNull() {
            addCriterion("rdid is not null");
            return (Criteria) this;
        }

        public Criteria andRdidEqualTo(Integer value) {
            addCriterion("rdid =", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotEqualTo(Integer value) {
            addCriterion("rdid <>", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidGreaterThan(Integer value) {
            addCriterion("rdid >", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rdid >=", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidLessThan(Integer value) {
            addCriterion("rdid <", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidLessThanOrEqualTo(Integer value) {
            addCriterion("rdid <=", value, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidIn(List<Integer> values) {
            addCriterion("rdid in", values, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotIn(List<Integer> values) {
            addCriterion("rdid not in", values, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidBetween(Integer value1, Integer value2) {
            addCriterion("rdid between", value1, value2, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdidNotBetween(Integer value1, Integer value2) {
            addCriterion("rdid not between", value1, value2, "rdid");
            return (Criteria) this;
        }

        public Criteria andRdorderIsNull() {
            addCriterion("rdorder is null");
            return (Criteria) this;
        }

        public Criteria andRdorderIsNotNull() {
            addCriterion("rdorder is not null");
            return (Criteria) this;
        }

        public Criteria andRdorderEqualTo(String value) {
            addCriterion("rdorder =", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderNotEqualTo(String value) {
            addCriterion("rdorder <>", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderGreaterThan(String value) {
            addCriterion("rdorder >", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderGreaterThanOrEqualTo(String value) {
            addCriterion("rdorder >=", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderLessThan(String value) {
            addCriterion("rdorder <", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderLessThanOrEqualTo(String value) {
            addCriterion("rdorder <=", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderLike(String value) {
            addCriterion("rdorder like", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderNotLike(String value) {
            addCriterion("rdorder not like", value, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderIn(List<String> values) {
            addCriterion("rdorder in", values, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderNotIn(List<String> values) {
            addCriterion("rdorder not in", values, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderBetween(String value1, String value2) {
            addCriterion("rdorder between", value1, value2, "rdorder");
            return (Criteria) this;
        }

        public Criteria andRdorderNotBetween(String value1, String value2) {
            addCriterion("rdorder not between", value1, value2, "rdorder");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(Integer value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(Integer value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(Integer value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(Integer value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(Integer value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(Integer value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<Integer> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<Integer> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(Integer value1, Integer value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(Integer value1, Integer value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Float value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Float value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Float value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Float value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Float value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Float> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Float> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Float value1, Float value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Float value1, Float value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andActualincomeIsNull() {
            addCriterion("actualincome is null");
            return (Criteria) this;
        }

        public Criteria andActualincomeIsNotNull() {
            addCriterion("actualincome is not null");
            return (Criteria) this;
        }

        public Criteria andActualincomeEqualTo(Float value) {
            addCriterion("actualincome =", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeNotEqualTo(Float value) {
            addCriterion("actualincome <>", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeGreaterThan(Float value) {
            addCriterion("actualincome >", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeGreaterThanOrEqualTo(Float value) {
            addCriterion("actualincome >=", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeLessThan(Float value) {
            addCriterion("actualincome <", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeLessThanOrEqualTo(Float value) {
            addCriterion("actualincome <=", value, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeIn(List<Float> values) {
            addCriterion("actualincome in", values, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeNotIn(List<Float> values) {
            addCriterion("actualincome not in", values, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeBetween(Float value1, Float value2) {
            addCriterion("actualincome between", value1, value2, "actualincome");
            return (Criteria) this;
        }

        public Criteria andActualincomeNotBetween(Float value1, Float value2) {
            addCriterion("actualincome not between", value1, value2, "actualincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeIsNull() {
            addCriterion("notincome is null");
            return (Criteria) this;
        }

        public Criteria andNotincomeIsNotNull() {
            addCriterion("notincome is not null");
            return (Criteria) this;
        }

        public Criteria andNotincomeEqualTo(Float value) {
            addCriterion("notincome =", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeNotEqualTo(Float value) {
            addCriterion("notincome <>", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeGreaterThan(Float value) {
            addCriterion("notincome >", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeGreaterThanOrEqualTo(Float value) {
            addCriterion("notincome >=", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeLessThan(Float value) {
            addCriterion("notincome <", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeLessThanOrEqualTo(Float value) {
            addCriterion("notincome <=", value, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeIn(List<Float> values) {
            addCriterion("notincome in", values, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeNotIn(List<Float> values) {
            addCriterion("notincome not in", values, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeBetween(Float value1, Float value2) {
            addCriterion("notincome between", value1, value2, "notincome");
            return (Criteria) this;
        }

        public Criteria andNotincomeNotBetween(Float value1, Float value2) {
            addCriterion("notincome not between", value1, value2, "notincome");
            return (Criteria) this;
        }

        public Criteria andRdpayIsNull() {
            addCriterion("rdpay is null");
            return (Criteria) this;
        }

        public Criteria andRdpayIsNotNull() {
            addCriterion("rdpay is not null");
            return (Criteria) this;
        }

        public Criteria andRdpayEqualTo(String value) {
            addCriterion("rdpay =", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayNotEqualTo(String value) {
            addCriterion("rdpay <>", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayGreaterThan(String value) {
            addCriterion("rdpay >", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayGreaterThanOrEqualTo(String value) {
            addCriterion("rdpay >=", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayLessThan(String value) {
            addCriterion("rdpay <", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayLessThanOrEqualTo(String value) {
            addCriterion("rdpay <=", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayLike(String value) {
            addCriterion("rdpay like", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayNotLike(String value) {
            addCriterion("rdpay not like", value, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayIn(List<String> values) {
            addCriterion("rdpay in", values, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayNotIn(List<String> values) {
            addCriterion("rdpay not in", values, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayBetween(String value1, String value2) {
            addCriterion("rdpay between", value1, value2, "rdpay");
            return (Criteria) this;
        }

        public Criteria andRdpayNotBetween(String value1, String value2) {
            addCriterion("rdpay not between", value1, value2, "rdpay");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCashierIsNull() {
            addCriterion("cashier is null");
            return (Criteria) this;
        }

        public Criteria andCashierIsNotNull() {
            addCriterion("cashier is not null");
            return (Criteria) this;
        }

        public Criteria andCashierEqualTo(String value) {
            addCriterion("cashier =", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotEqualTo(String value) {
            addCriterion("cashier <>", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThan(String value) {
            addCriterion("cashier >", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThanOrEqualTo(String value) {
            addCriterion("cashier >=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThan(String value) {
            addCriterion("cashier <", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThanOrEqualTo(String value) {
            addCriterion("cashier <=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLike(String value) {
            addCriterion("cashier like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotLike(String value) {
            addCriterion("cashier not like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierIn(List<String> values) {
            addCriterion("cashier in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotIn(List<String> values) {
            addCriterion("cashier not in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierBetween(String value1, String value2) {
            addCriterion("cashier between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotBetween(String value1, String value2) {
            addCriterion("cashier not between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andShopassistantIsNull() {
            addCriterion("shopassistant is null");
            return (Criteria) this;
        }

        public Criteria andShopassistantIsNotNull() {
            addCriterion("shopassistant is not null");
            return (Criteria) this;
        }

        public Criteria andShopassistantEqualTo(String value) {
            addCriterion("shopassistant =", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantNotEqualTo(String value) {
            addCriterion("shopassistant <>", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantGreaterThan(String value) {
            addCriterion("shopassistant >", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantGreaterThanOrEqualTo(String value) {
            addCriterion("shopassistant >=", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantLessThan(String value) {
            addCriterion("shopassistant <", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantLessThanOrEqualTo(String value) {
            addCriterion("shopassistant <=", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantLike(String value) {
            addCriterion("shopassistant like", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantNotLike(String value) {
            addCriterion("shopassistant not like", value, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantIn(List<String> values) {
            addCriterion("shopassistant in", values, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantNotIn(List<String> values) {
            addCriterion("shopassistant not in", values, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantBetween(String value1, String value2) {
            addCriterion("shopassistant between", value1, value2, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andShopassistantNotBetween(String value1, String value2) {
            addCriterion("shopassistant not between", value1, value2, "shopassistant");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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