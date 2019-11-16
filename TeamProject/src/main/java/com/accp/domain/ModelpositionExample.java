package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ModelpositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelpositionExample() {
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

        public Criteria andMpidIsNull() {
            addCriterion("mpid is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("mpid is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(Integer value) {
            addCriterion("mpid =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(Integer value) {
            addCriterion("mpid <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(Integer value) {
            addCriterion("mpid >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mpid >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(Integer value) {
            addCriterion("mpid <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(Integer value) {
            addCriterion("mpid <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<Integer> values) {
            addCriterion("mpid in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<Integer> values) {
            addCriterion("mpid not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(Integer value1, Integer value2) {
            addCriterion("mpid between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(Integer value1, Integer value2) {
            addCriterion("mpid not between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMoidIsNull() {
            addCriterion("moid is null");
            return (Criteria) this;
        }

        public Criteria andMoidIsNotNull() {
            addCriterion("moid is not null");
            return (Criteria) this;
        }

        public Criteria andMoidEqualTo(Integer value) {
            addCriterion("moid =", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotEqualTo(Integer value) {
            addCriterion("moid <>", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThan(Integer value) {
            addCriterion("moid >", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moid >=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThan(Integer value) {
            addCriterion("moid <", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThanOrEqualTo(Integer value) {
            addCriterion("moid <=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidIn(List<Integer> values) {
            addCriterion("moid in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotIn(List<Integer> values) {
            addCriterion("moid not in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidBetween(Integer value1, Integer value2) {
            addCriterion("moid between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotBetween(Integer value1, Integer value2) {
            addCriterion("moid not between", value1, value2, "moid");
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