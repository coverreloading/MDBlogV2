package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class ArticleTipsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleTipsExample() {
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

        public Criteria andAtIdIsNull() {
            addCriterion("AT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtIdIsNotNull() {
            addCriterion("AT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtIdEqualTo(Long value) {
            addCriterion("AT_ID =", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotEqualTo(Long value) {
            addCriterion("AT_ID <>", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThan(Long value) {
            addCriterion("AT_ID >", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AT_ID >=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThan(Long value) {
            addCriterion("AT_ID <", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThanOrEqualTo(Long value) {
            addCriterion("AT_ID <=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdIn(List<Long> values) {
            addCriterion("AT_ID in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotIn(List<Long> values) {
            addCriterion("AT_ID not in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdBetween(Long value1, Long value2) {
            addCriterion("AT_ID between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotBetween(Long value1, Long value2) {
            addCriterion("AT_ID not between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdIsNull() {
            addCriterion("AT_RA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtRaIdIsNotNull() {
            addCriterion("AT_RA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtRaIdEqualTo(Long value) {
            addCriterion("AT_RA_ID =", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdNotEqualTo(Long value) {
            addCriterion("AT_RA_ID <>", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdGreaterThan(Long value) {
            addCriterion("AT_RA_ID >", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AT_RA_ID >=", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdLessThan(Long value) {
            addCriterion("AT_RA_ID <", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdLessThanOrEqualTo(Long value) {
            addCriterion("AT_RA_ID <=", value, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdIn(List<Long> values) {
            addCriterion("AT_RA_ID in", values, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdNotIn(List<Long> values) {
            addCriterion("AT_RA_ID not in", values, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdBetween(Long value1, Long value2) {
            addCriterion("AT_RA_ID between", value1, value2, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtRaIdNotBetween(Long value1, Long value2) {
            addCriterion("AT_RA_ID not between", value1, value2, "atRaId");
            return (Criteria) this;
        }

        public Criteria andAtTipnameIsNull() {
            addCriterion("AT_TIpName is null");
            return (Criteria) this;
        }

        public Criteria andAtTipnameIsNotNull() {
            addCriterion("AT_TIpName is not null");
            return (Criteria) this;
        }

        public Criteria andAtTipnameEqualTo(String value) {
            addCriterion("AT_TIpName =", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameNotEqualTo(String value) {
            addCriterion("AT_TIpName <>", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameGreaterThan(String value) {
            addCriterion("AT_TIpName >", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameGreaterThanOrEqualTo(String value) {
            addCriterion("AT_TIpName >=", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameLessThan(String value) {
            addCriterion("AT_TIpName <", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameLessThanOrEqualTo(String value) {
            addCriterion("AT_TIpName <=", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameLike(String value) {
            addCriterion("AT_TIpName like", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameNotLike(String value) {
            addCriterion("AT_TIpName not like", value, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameIn(List<String> values) {
            addCriterion("AT_TIpName in", values, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameNotIn(List<String> values) {
            addCriterion("AT_TIpName not in", values, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameBetween(String value1, String value2) {
            addCriterion("AT_TIpName between", value1, value2, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtTipnameNotBetween(String value1, String value2) {
            addCriterion("AT_TIpName not between", value1, value2, "atTipname");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeIsNull() {
            addCriterion("AT_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeIsNotNull() {
            addCriterion("AT_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeEqualTo(Long value) {
            addCriterion("AT_Createtime =", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeNotEqualTo(Long value) {
            addCriterion("AT_Createtime <>", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeGreaterThan(Long value) {
            addCriterion("AT_Createtime >", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("AT_Createtime >=", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeLessThan(Long value) {
            addCriterion("AT_Createtime <", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("AT_Createtime <=", value, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeIn(List<Long> values) {
            addCriterion("AT_Createtime in", values, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeNotIn(List<Long> values) {
            addCriterion("AT_Createtime not in", values, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeBetween(Long value1, Long value2) {
            addCriterion("AT_Createtime between", value1, value2, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("AT_Createtime not between", value1, value2, "atCreatetime");
            return (Criteria) this;
        }

        public Criteria andAtUidIsNull() {
            addCriterion("AT_UID is null");
            return (Criteria) this;
        }

        public Criteria andAtUidIsNotNull() {
            addCriterion("AT_UID is not null");
            return (Criteria) this;
        }

        public Criteria andAtUidEqualTo(Long value) {
            addCriterion("AT_UID =", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidNotEqualTo(Long value) {
            addCriterion("AT_UID <>", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidGreaterThan(Long value) {
            addCriterion("AT_UID >", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidGreaterThanOrEqualTo(Long value) {
            addCriterion("AT_UID >=", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidLessThan(Long value) {
            addCriterion("AT_UID <", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidLessThanOrEqualTo(Long value) {
            addCriterion("AT_UID <=", value, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidIn(List<Long> values) {
            addCriterion("AT_UID in", values, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidNotIn(List<Long> values) {
            addCriterion("AT_UID not in", values, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidBetween(Long value1, Long value2) {
            addCriterion("AT_UID between", value1, value2, "atUid");
            return (Criteria) this;
        }

        public Criteria andAtUidNotBetween(Long value1, Long value2) {
            addCriterion("AT_UID not between", value1, value2, "atUid");
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