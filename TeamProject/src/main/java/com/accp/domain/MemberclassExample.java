package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MemberclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberclassExample() {
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

        public Criteria andMcidIsNull() {
            addCriterion("mcid is null");
            return (Criteria) this;
        }

        public Criteria andMcidIsNotNull() {
            addCriterion("mcid is not null");
            return (Criteria) this;
        }

        public Criteria andMcidEqualTo(Integer value) {
            addCriterion("mcid =", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidNotEqualTo(Integer value) {
            addCriterion("mcid <>", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidGreaterThan(Integer value) {
            addCriterion("mcid >", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mcid >=", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidLessThan(Integer value) {
            addCriterion("mcid <", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidLessThanOrEqualTo(Integer value) {
            addCriterion("mcid <=", value, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidIn(List<Integer> values) {
            addCriterion("mcid in", values, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidNotIn(List<Integer> values) {
            addCriterion("mcid not in", values, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidBetween(Integer value1, Integer value2) {
            addCriterion("mcid between", value1, value2, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcidNotBetween(Integer value1, Integer value2) {
            addCriterion("mcid not between", value1, value2, "mcid");
            return (Criteria) this;
        }

        public Criteria andMcnameIsNull() {
            addCriterion("mcname is null");
            return (Criteria) this;
        }

        public Criteria andMcnameIsNotNull() {
            addCriterion("mcname is not null");
            return (Criteria) this;
        }

        public Criteria andMcnameEqualTo(String value) {
            addCriterion("mcname =", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameNotEqualTo(String value) {
            addCriterion("mcname <>", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameGreaterThan(String value) {
            addCriterion("mcname >", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameGreaterThanOrEqualTo(String value) {
            addCriterion("mcname >=", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameLessThan(String value) {
            addCriterion("mcname <", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameLessThanOrEqualTo(String value) {
            addCriterion("mcname <=", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameLike(String value) {
            addCriterion("mcname like", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameNotLike(String value) {
            addCriterion("mcname not like", value, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameIn(List<String> values) {
            addCriterion("mcname in", values, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameNotIn(List<String> values) {
            addCriterion("mcname not in", values, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameBetween(String value1, String value2) {
            addCriterion("mcname between", value1, value2, "mcname");
            return (Criteria) this;
        }

        public Criteria andMcnameNotBetween(String value1, String value2) {
            addCriterion("mcname not between", value1, value2, "mcname");
            return (Criteria) this;
        }

        public Criteria andRequireIsNull() {
            addCriterion("require is null");
            return (Criteria) this;
        }

        public Criteria andRequireIsNotNull() {
            addCriterion("require is not null");
            return (Criteria) this;
        }

        public Criteria andRequireEqualTo(Float value) {
            addCriterion("require =", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotEqualTo(Float value) {
            addCriterion("require <>", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireGreaterThan(Float value) {
            addCriterion("require >", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireGreaterThanOrEqualTo(Float value) {
            addCriterion("require >=", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireLessThan(Float value) {
            addCriterion("require <", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireLessThanOrEqualTo(Float value) {
            addCriterion("require <=", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireIn(List<Float> values) {
            addCriterion("require in", values, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotIn(List<Float> values) {
            addCriterion("require not in", values, "require");
            return (Criteria) this;
        }

        public Criteria andRequireBetween(Float value1, Float value2) {
            addCriterion("require between", value1, value2, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotBetween(Float value1, Float value2) {
            addCriterion("require not between", value1, value2, "require");
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

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(Integer value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(Integer value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(Integer value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(Integer value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(Integer value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<Integer> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<Integer> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(Integer value1, Integer value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(Integer value1, Integer value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
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