package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andReidIsNull() {
            addCriterion("reid is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("reid is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("reid =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("reid <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("reid >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reid >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("reid <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("reid <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("reid in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("reid not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("reid between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("reid not between", value1, value2, "reid");
            return (Criteria) this;
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

        public Criteria andRemoneyIsNull() {
            addCriterion("remoney is null");
            return (Criteria) this;
        }

        public Criteria andRemoneyIsNotNull() {
            addCriterion("remoney is not null");
            return (Criteria) this;
        }

        public Criteria andRemoneyEqualTo(Float value) {
            addCriterion("remoney =", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyNotEqualTo(Float value) {
            addCriterion("remoney <>", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyGreaterThan(Float value) {
            addCriterion("remoney >", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("remoney >=", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyLessThan(Float value) {
            addCriterion("remoney <", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyLessThanOrEqualTo(Float value) {
            addCriterion("remoney <=", value, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyIn(List<Float> values) {
            addCriterion("remoney in", values, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyNotIn(List<Float> values) {
            addCriterion("remoney not in", values, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyBetween(Float value1, Float value2) {
            addCriterion("remoney between", value1, value2, "remoney");
            return (Criteria) this;
        }

        public Criteria andRemoneyNotBetween(Float value1, Float value2) {
            addCriterion("remoney not between", value1, value2, "remoney");
            return (Criteria) this;
        }

        public Criteria andRewayIsNull() {
            addCriterion("reway is null");
            return (Criteria) this;
        }

        public Criteria andRewayIsNotNull() {
            addCriterion("reway is not null");
            return (Criteria) this;
        }

        public Criteria andRewayEqualTo(String value) {
            addCriterion("reway =", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayNotEqualTo(String value) {
            addCriterion("reway <>", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayGreaterThan(String value) {
            addCriterion("reway >", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayGreaterThanOrEqualTo(String value) {
            addCriterion("reway >=", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayLessThan(String value) {
            addCriterion("reway <", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayLessThanOrEqualTo(String value) {
            addCriterion("reway <=", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayLike(String value) {
            addCriterion("reway like", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayNotLike(String value) {
            addCriterion("reway not like", value, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayIn(List<String> values) {
            addCriterion("reway in", values, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayNotIn(List<String> values) {
            addCriterion("reway not in", values, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayBetween(String value1, String value2) {
            addCriterion("reway between", value1, value2, "reway");
            return (Criteria) this;
        }

        public Criteria andRewayNotBetween(String value1, String value2) {
            addCriterion("reway not between", value1, value2, "reway");
            return (Criteria) this;
        }

        public Criteria andRejfIsNull() {
            addCriterion("rejf is null");
            return (Criteria) this;
        }

        public Criteria andRejfIsNotNull() {
            addCriterion("rejf is not null");
            return (Criteria) this;
        }

        public Criteria andRejfEqualTo(Integer value) {
            addCriterion("rejf =", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfNotEqualTo(Integer value) {
            addCriterion("rejf <>", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfGreaterThan(Integer value) {
            addCriterion("rejf >", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfGreaterThanOrEqualTo(Integer value) {
            addCriterion("rejf >=", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfLessThan(Integer value) {
            addCriterion("rejf <", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfLessThanOrEqualTo(Integer value) {
            addCriterion("rejf <=", value, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfIn(List<Integer> values) {
            addCriterion("rejf in", values, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfNotIn(List<Integer> values) {
            addCriterion("rejf not in", values, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfBetween(Integer value1, Integer value2) {
            addCriterion("rejf between", value1, value2, "rejf");
            return (Criteria) this;
        }

        public Criteria andRejfNotBetween(Integer value1, Integer value2) {
            addCriterion("rejf not between", value1, value2, "rejf");
            return (Criteria) this;
        }

        public Criteria andRebalanceIsNull() {
            addCriterion("rebalance is null");
            return (Criteria) this;
        }

        public Criteria andRebalanceIsNotNull() {
            addCriterion("rebalance is not null");
            return (Criteria) this;
        }

        public Criteria andRebalanceEqualTo(Float value) {
            addCriterion("rebalance =", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceNotEqualTo(Float value) {
            addCriterion("rebalance <>", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceGreaterThan(Float value) {
            addCriterion("rebalance >", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("rebalance >=", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceLessThan(Float value) {
            addCriterion("rebalance <", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceLessThanOrEqualTo(Float value) {
            addCriterion("rebalance <=", value, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceIn(List<Float> values) {
            addCriterion("rebalance in", values, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceNotIn(List<Float> values) {
            addCriterion("rebalance not in", values, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceBetween(Float value1, Float value2) {
            addCriterion("rebalance between", value1, value2, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRebalanceNotBetween(Float value1, Float value2) {
            addCriterion("rebalance not between", value1, value2, "rebalance");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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