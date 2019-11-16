package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andPuidIsNull() {
            addCriterion("puid is null");
            return (Criteria) this;
        }

        public Criteria andPuidIsNotNull() {
            addCriterion("puid is not null");
            return (Criteria) this;
        }

        public Criteria andPuidEqualTo(Integer value) {
            addCriterion("puid =", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotEqualTo(Integer value) {
            addCriterion("puid <>", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThan(Integer value) {
            addCriterion("puid >", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("puid >=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThan(Integer value) {
            addCriterion("puid <", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThanOrEqualTo(Integer value) {
            addCriterion("puid <=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidIn(List<Integer> values) {
            addCriterion("puid in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotIn(List<Integer> values) {
            addCriterion("puid not in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidBetween(Integer value1, Integer value2) {
            addCriterion("puid between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotBetween(Integer value1, Integer value2) {
            addCriterion("puid not between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andOddIsNull() {
            addCriterion("odd is null");
            return (Criteria) this;
        }

        public Criteria andOddIsNotNull() {
            addCriterion("odd is not null");
            return (Criteria) this;
        }

        public Criteria andOddEqualTo(String value) {
            addCriterion("odd =", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddNotEqualTo(String value) {
            addCriterion("odd <>", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddGreaterThan(String value) {
            addCriterion("odd >", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddGreaterThanOrEqualTo(String value) {
            addCriterion("odd >=", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddLessThan(String value) {
            addCriterion("odd <", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddLessThanOrEqualTo(String value) {
            addCriterion("odd <=", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddLike(String value) {
            addCriterion("odd like", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddNotLike(String value) {
            addCriterion("odd not like", value, "odd");
            return (Criteria) this;
        }

        public Criteria andOddIn(List<String> values) {
            addCriterion("odd in", values, "odd");
            return (Criteria) this;
        }

        public Criteria andOddNotIn(List<String> values) {
            addCriterion("odd not in", values, "odd");
            return (Criteria) this;
        }

        public Criteria andOddBetween(String value1, String value2) {
            addCriterion("odd between", value1, value2, "odd");
            return (Criteria) this;
        }

        public Criteria andOddNotBetween(String value1, String value2) {
            addCriterion("odd not between", value1, value2, "odd");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("auditstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(String value) {
            addCriterion("auditstate =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(String value) {
            addCriterion("auditstate <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(String value) {
            addCriterion("auditstate >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(String value) {
            addCriterion("auditstate >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(String value) {
            addCriterion("auditstate <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(String value) {
            addCriterion("auditstate <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLike(String value) {
            addCriterion("auditstate like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotLike(String value) {
            addCriterion("auditstate not like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<String> values) {
            addCriterion("auditstate in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<String> values) {
            addCriterion("auditstate not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(String value1, String value2) {
            addCriterion("auditstate between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(String value1, String value2) {
            addCriterion("auditstate not between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliverydate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliverydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("deliverydate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("deliverydate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("deliverydate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deliverydate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("deliverydate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("deliverydate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("deliverydate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("deliverydate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("deliverydate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("deliverydate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andSuidIsNull() {
            addCriterion("suid is null");
            return (Criteria) this;
        }

        public Criteria andSuidIsNotNull() {
            addCriterion("suid is not null");
            return (Criteria) this;
        }

        public Criteria andSuidEqualTo(Integer value) {
            addCriterion("suid =", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotEqualTo(Integer value) {
            addCriterion("suid <>", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThan(Integer value) {
            addCriterion("suid >", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("suid >=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThan(Integer value) {
            addCriterion("suid <", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidLessThanOrEqualTo(Integer value) {
            addCriterion("suid <=", value, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidIn(List<Integer> values) {
            addCriterion("suid in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotIn(List<Integer> values) {
            addCriterion("suid not in", values, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidBetween(Integer value1, Integer value2) {
            addCriterion("suid between", value1, value2, "suid");
            return (Criteria) this;
        }

        public Criteria andSuidNotBetween(Integer value1, Integer value2) {
            addCriterion("suid not between", value1, value2, "suid");
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

        public Criteria andUaccountIsNull() {
            addCriterion("uaccount is null");
            return (Criteria) this;
        }

        public Criteria andUaccountIsNotNull() {
            addCriterion("uaccount is not null");
            return (Criteria) this;
        }

        public Criteria andUaccountEqualTo(String value) {
            addCriterion("uaccount =", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotEqualTo(String value) {
            addCriterion("uaccount <>", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThan(String value) {
            addCriterion("uaccount >", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThanOrEqualTo(String value) {
            addCriterion("uaccount >=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThan(String value) {
            addCriterion("uaccount <", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThanOrEqualTo(String value) {
            addCriterion("uaccount <=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLike(String value) {
            addCriterion("uaccount like", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotLike(String value) {
            addCriterion("uaccount not like", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountIn(List<String> values) {
            addCriterion("uaccount in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotIn(List<String> values) {
            addCriterion("uaccount not in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountBetween(String value1, String value2) {
            addCriterion("uaccount between", value1, value2, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotBetween(String value1, String value2) {
            addCriterion("uaccount not between", value1, value2, "uaccount");
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