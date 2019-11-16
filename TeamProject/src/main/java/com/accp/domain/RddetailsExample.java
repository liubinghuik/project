package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RddetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RddetailsExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
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

        public Criteria andArticlenoIsNull() {
            addCriterion("articleno is null");
            return (Criteria) this;
        }

        public Criteria andArticlenoIsNotNull() {
            addCriterion("articleno is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenoEqualTo(Integer value) {
            addCriterion("articleno =", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoNotEqualTo(Integer value) {
            addCriterion("articleno <>", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoGreaterThan(Integer value) {
            addCriterion("articleno >", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleno >=", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoLessThan(Integer value) {
            addCriterion("articleno <", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoLessThanOrEqualTo(Integer value) {
            addCriterion("articleno <=", value, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoIn(List<Integer> values) {
            addCriterion("articleno in", values, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoNotIn(List<Integer> values) {
            addCriterion("articleno not in", values, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoBetween(Integer value1, Integer value2) {
            addCriterion("articleno between", value1, value2, "articleno");
            return (Criteria) this;
        }

        public Criteria andArticlenoNotBetween(Integer value1, Integer value2) {
            addCriterion("articleno not between", value1, value2, "articleno");
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

        public Criteria andDageIsNull() {
            addCriterion("dage is null");
            return (Criteria) this;
        }

        public Criteria andDageIsNotNull() {
            addCriterion("dage is not null");
            return (Criteria) this;
        }

        public Criteria andDageEqualTo(Integer value) {
            addCriterion("dage =", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotEqualTo(Integer value) {
            addCriterion("dage <>", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThan(Integer value) {
            addCriterion("dage >", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThanOrEqualTo(Integer value) {
            addCriterion("dage >=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThan(Integer value) {
            addCriterion("dage <", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThanOrEqualTo(Integer value) {
            addCriterion("dage <=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageIn(List<Integer> values) {
            addCriterion("dage in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotIn(List<Integer> values) {
            addCriterion("dage not in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageBetween(Integer value1, Integer value2) {
            addCriterion("dage between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotBetween(Integer value1, Integer value2) {
            addCriterion("dage not between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIsNull() {
            addCriterion("originalcost is null");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIsNotNull() {
            addCriterion("originalcost is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalcostEqualTo(Float value) {
            addCriterion("originalcost =", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotEqualTo(Float value) {
            addCriterion("originalcost <>", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostGreaterThan(Float value) {
            addCriterion("originalcost >", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostGreaterThanOrEqualTo(Float value) {
            addCriterion("originalcost >=", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostLessThan(Float value) {
            addCriterion("originalcost <", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostLessThanOrEqualTo(Float value) {
            addCriterion("originalcost <=", value, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostIn(List<Float> values) {
            addCriterion("originalcost in", values, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotIn(List<Float> values) {
            addCriterion("originalcost not in", values, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostBetween(Float value1, Float value2) {
            addCriterion("originalcost between", value1, value2, "originalcost");
            return (Criteria) this;
        }

        public Criteria andOriginalcostNotBetween(Float value1, Float value2) {
            addCriterion("originalcost not between", value1, value2, "originalcost");
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

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalprice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Float value) {
            addCriterion("totalprice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Float value) {
            addCriterion("totalprice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Float value) {
            addCriterion("totalprice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("totalprice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Float value) {
            addCriterion("totalprice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Float value) {
            addCriterion("totalprice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Float> values) {
            addCriterion("totalprice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Float> values) {
            addCriterion("totalprice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Float value1, Float value2) {
            addCriterion("totalprice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Float value1, Float value2) {
            addCriterion("totalprice not between", value1, value2, "totalprice");
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