package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DeductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeductionExample() {
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

        public Criteria andDdidIsNull() {
            addCriterion("ddid is null");
            return (Criteria) this;
        }

        public Criteria andDdidIsNotNull() {
            addCriterion("ddid is not null");
            return (Criteria) this;
        }

        public Criteria andDdidEqualTo(Integer value) {
            addCriterion("ddid =", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotEqualTo(Integer value) {
            addCriterion("ddid <>", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThan(Integer value) {
            addCriterion("ddid >", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddid >=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThan(Integer value) {
            addCriterion("ddid <", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThanOrEqualTo(Integer value) {
            addCriterion("ddid <=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidIn(List<Integer> values) {
            addCriterion("ddid in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotIn(List<Integer> values) {
            addCriterion("ddid not in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidBetween(Integer value1, Integer value2) {
            addCriterion("ddid between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotBetween(Integer value1, Integer value2) {
            addCriterion("ddid not between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andJfIsNull() {
            addCriterion("jf is null");
            return (Criteria) this;
        }

        public Criteria andJfIsNotNull() {
            addCriterion("jf is not null");
            return (Criteria) this;
        }

        public Criteria andJfEqualTo(Float value) {
            addCriterion("jf =", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotEqualTo(Float value) {
            addCriterion("jf <>", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThan(Float value) {
            addCriterion("jf >", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThanOrEqualTo(Float value) {
            addCriterion("jf >=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThan(Float value) {
            addCriterion("jf <", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThanOrEqualTo(Float value) {
            addCriterion("jf <=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfIn(List<Float> values) {
            addCriterion("jf in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotIn(List<Float> values) {
            addCriterion("jf not in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfBetween(Float value1, Float value2) {
            addCriterion("jf between", value1, value2, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotBetween(Float value1, Float value2) {
            addCriterion("jf not between", value1, value2, "jf");
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