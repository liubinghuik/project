package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNull() {
            addCriterion("jobnumber is null");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNotNull() {
            addCriterion("jobnumber is not null");
            return (Criteria) this;
        }

        public Criteria andJobnumberEqualTo(String value) {
            addCriterion("jobnumber =", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotEqualTo(String value) {
            addCriterion("jobnumber <>", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThan(String value) {
            addCriterion("jobnumber >", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("jobnumber >=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThan(String value) {
            addCriterion("jobnumber <", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThanOrEqualTo(String value) {
            addCriterion("jobnumber <=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLike(String value) {
            addCriterion("jobnumber like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotLike(String value) {
            addCriterion("jobnumber not like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberIn(List<String> values) {
            addCriterion("jobnumber in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotIn(List<String> values) {
            addCriterion("jobnumber not in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberBetween(String value1, String value2) {
            addCriterion("jobnumber between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotBetween(String value1, String value2) {
            addCriterion("jobnumber not between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andStnameIsNull() {
            addCriterion("stname is null");
            return (Criteria) this;
        }

        public Criteria andStnameIsNotNull() {
            addCriterion("stname is not null");
            return (Criteria) this;
        }

        public Criteria andStnameEqualTo(String value) {
            addCriterion("stname =", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotEqualTo(String value) {
            addCriterion("stname <>", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThan(String value) {
            addCriterion("stname >", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThanOrEqualTo(String value) {
            addCriterion("stname >=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThan(String value) {
            addCriterion("stname <", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThanOrEqualTo(String value) {
            addCriterion("stname <=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLike(String value) {
            addCriterion("stname like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotLike(String value) {
            addCriterion("stname not like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameIn(List<String> values) {
            addCriterion("stname in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotIn(List<String> values) {
            addCriterion("stname not in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameBetween(String value1, String value2) {
            addCriterion("stname between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotBetween(String value1, String value2) {
            addCriterion("stname not between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStpwdIsNull() {
            addCriterion("stpwd is null");
            return (Criteria) this;
        }

        public Criteria andStpwdIsNotNull() {
            addCriterion("stpwd is not null");
            return (Criteria) this;
        }

        public Criteria andStpwdEqualTo(String value) {
            addCriterion("stpwd =", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdNotEqualTo(String value) {
            addCriterion("stpwd <>", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdGreaterThan(String value) {
            addCriterion("stpwd >", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdGreaterThanOrEqualTo(String value) {
            addCriterion("stpwd >=", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdLessThan(String value) {
            addCriterion("stpwd <", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdLessThanOrEqualTo(String value) {
            addCriterion("stpwd <=", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdLike(String value) {
            addCriterion("stpwd like", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdNotLike(String value) {
            addCriterion("stpwd not like", value, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdIn(List<String> values) {
            addCriterion("stpwd in", values, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdNotIn(List<String> values) {
            addCriterion("stpwd not in", values, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdBetween(String value1, String value2) {
            addCriterion("stpwd between", value1, value2, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStpwdNotBetween(String value1, String value2) {
            addCriterion("stpwd not between", value1, value2, "stpwd");
            return (Criteria) this;
        }

        public Criteria andStstateIsNull() {
            addCriterion("ststate is null");
            return (Criteria) this;
        }

        public Criteria andStstateIsNotNull() {
            addCriterion("ststate is not null");
            return (Criteria) this;
        }

        public Criteria andStstateEqualTo(Integer value) {
            addCriterion("ststate =", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateNotEqualTo(Integer value) {
            addCriterion("ststate <>", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateGreaterThan(Integer value) {
            addCriterion("ststate >", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ststate >=", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateLessThan(Integer value) {
            addCriterion("ststate <", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateLessThanOrEqualTo(Integer value) {
            addCriterion("ststate <=", value, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateIn(List<Integer> values) {
            addCriterion("ststate in", values, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateNotIn(List<Integer> values) {
            addCriterion("ststate not in", values, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateBetween(Integer value1, Integer value2) {
            addCriterion("ststate between", value1, value2, "ststate");
            return (Criteria) this;
        }

        public Criteria andStstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ststate not between", value1, value2, "ststate");
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