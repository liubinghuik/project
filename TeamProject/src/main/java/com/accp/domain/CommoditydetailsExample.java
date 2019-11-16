package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CommoditydetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommoditydetailsExample() {
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

        public Criteria andCdidIsNull() {
            addCriterion("cdid is null");
            return (Criteria) this;
        }

        public Criteria andCdidIsNotNull() {
            addCriterion("cdid is not null");
            return (Criteria) this;
        }

        public Criteria andCdidEqualTo(Integer value) {
            addCriterion("cdid =", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotEqualTo(Integer value) {
            addCriterion("cdid <>", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidGreaterThan(Integer value) {
            addCriterion("cdid >", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdid >=", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidLessThan(Integer value) {
            addCriterion("cdid <", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidLessThanOrEqualTo(Integer value) {
            addCriterion("cdid <=", value, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidIn(List<Integer> values) {
            addCriterion("cdid in", values, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotIn(List<Integer> values) {
            addCriterion("cdid not in", values, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidBetween(Integer value1, Integer value2) {
            addCriterion("cdid between", value1, value2, "cdid");
            return (Criteria) this;
        }

        public Criteria andCdidNotBetween(Integer value1, Integer value2) {
            addCriterion("cdid not between", value1, value2, "cdid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andShapecodeIsNull() {
            addCriterion("shapecode is null");
            return (Criteria) this;
        }

        public Criteria andShapecodeIsNotNull() {
            addCriterion("shapecode is not null");
            return (Criteria) this;
        }

        public Criteria andShapecodeEqualTo(String value) {
            addCriterion("shapecode =", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotEqualTo(String value) {
            addCriterion("shapecode <>", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeGreaterThan(String value) {
            addCriterion("shapecode >", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeGreaterThanOrEqualTo(String value) {
            addCriterion("shapecode >=", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLessThan(String value) {
            addCriterion("shapecode <", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLessThanOrEqualTo(String value) {
            addCriterion("shapecode <=", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeLike(String value) {
            addCriterion("shapecode like", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotLike(String value) {
            addCriterion("shapecode not like", value, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeIn(List<String> values) {
            addCriterion("shapecode in", values, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotIn(List<String> values) {
            addCriterion("shapecode not in", values, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeBetween(String value1, String value2) {
            addCriterion("shapecode between", value1, value2, "shapecode");
            return (Criteria) this;
        }

        public Criteria andShapecodeNotBetween(String value1, String value2) {
            addCriterion("shapecode not between", value1, value2, "shapecode");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNull() {
            addCriterion("sizeid is null");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNotNull() {
            addCriterion("sizeid is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidEqualTo(Integer value) {
            addCriterion("sizeid =", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotEqualTo(Integer value) {
            addCriterion("sizeid <>", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThan(Integer value) {
            addCriterion("sizeid >", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sizeid >=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThan(Integer value) {
            addCriterion("sizeid <", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThanOrEqualTo(Integer value) {
            addCriterion("sizeid <=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidIn(List<Integer> values) {
            addCriterion("sizeid in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotIn(List<Integer> values) {
            addCriterion("sizeid not in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidBetween(Integer value1, Integer value2) {
            addCriterion("sizeid between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("sizeid not between", value1, value2, "sizeid");
            return (Criteria) this;
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

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
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