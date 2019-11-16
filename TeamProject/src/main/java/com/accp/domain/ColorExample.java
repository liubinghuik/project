package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("colorid is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorid is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("colorid =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("colorid <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("colorid >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("colorid >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("colorid <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("colorid <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("colorid in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("colorid not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("colorid between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("colorid not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("colorname is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("colorname is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("colorname =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("colorname <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("colorname >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("colorname >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("colorname <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("colorname <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("colorname like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("colorname not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("colorname in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("colorname not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("colorname between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("colorname not between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColorpictureIsNull() {
            addCriterion("colorpicture is null");
            return (Criteria) this;
        }

        public Criteria andColorpictureIsNotNull() {
            addCriterion("colorpicture is not null");
            return (Criteria) this;
        }

        public Criteria andColorpictureEqualTo(String value) {
            addCriterion("colorpicture =", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureNotEqualTo(String value) {
            addCriterion("colorpicture <>", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureGreaterThan(String value) {
            addCriterion("colorpicture >", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureGreaterThanOrEqualTo(String value) {
            addCriterion("colorpicture >=", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureLessThan(String value) {
            addCriterion("colorpicture <", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureLessThanOrEqualTo(String value) {
            addCriterion("colorpicture <=", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureLike(String value) {
            addCriterion("colorpicture like", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureNotLike(String value) {
            addCriterion("colorpicture not like", value, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureIn(List<String> values) {
            addCriterion("colorpicture in", values, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureNotIn(List<String> values) {
            addCriterion("colorpicture not in", values, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureBetween(String value1, String value2) {
            addCriterion("colorpicture between", value1, value2, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andColorpictureNotBetween(String value1, String value2) {
            addCriterion("colorpicture not between", value1, value2, "colorpicture");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("fatherid is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("fatherid is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(Integer value) {
            addCriterion("fatherid =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(Integer value) {
            addCriterion("fatherid <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(Integer value) {
            addCriterion("fatherid >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fatherid >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(Integer value) {
            addCriterion("fatherid <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(Integer value) {
            addCriterion("fatherid <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<Integer> values) {
            addCriterion("fatherid in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<Integer> values) {
            addCriterion("fatherid not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(Integer value1, Integer value2) {
            addCriterion("fatherid between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(Integer value1, Integer value2) {
            addCriterion("fatherid not between", value1, value2, "fatherid");
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