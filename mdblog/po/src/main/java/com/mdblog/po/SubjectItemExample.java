package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class SubjectItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectItemExample() {
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

        public Criteria andSiIdIsNull() {
            addCriterion("SI_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiIdIsNotNull() {
            addCriterion("SI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiIdEqualTo(Long value) {
            addCriterion("SI_ID =", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotEqualTo(Long value) {
            addCriterion("SI_ID <>", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThan(Long value) {
            addCriterion("SI_ID >", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SI_ID >=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThan(Long value) {
            addCriterion("SI_ID <", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThanOrEqualTo(Long value) {
            addCriterion("SI_ID <=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdIn(List<Long> values) {
            addCriterion("SI_ID in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotIn(List<Long> values) {
            addCriterion("SI_ID not in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdBetween(Long value1, Long value2) {
            addCriterion("SI_ID between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotBetween(Long value1, Long value2) {
            addCriterion("SI_ID not between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiSidIsNull() {
            addCriterion("SI_SID is null");
            return (Criteria) this;
        }

        public Criteria andSiSidIsNotNull() {
            addCriterion("SI_SID is not null");
            return (Criteria) this;
        }

        public Criteria andSiSidEqualTo(Long value) {
            addCriterion("SI_SID =", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidNotEqualTo(Long value) {
            addCriterion("SI_SID <>", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidGreaterThan(Long value) {
            addCriterion("SI_SID >", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidGreaterThanOrEqualTo(Long value) {
            addCriterion("SI_SID >=", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidLessThan(Long value) {
            addCriterion("SI_SID <", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidLessThanOrEqualTo(Long value) {
            addCriterion("SI_SID <=", value, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidIn(List<Long> values) {
            addCriterion("SI_SID in", values, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidNotIn(List<Long> values) {
            addCriterion("SI_SID not in", values, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidBetween(Long value1, Long value2) {
            addCriterion("SI_SID between", value1, value2, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiSidNotBetween(Long value1, Long value2) {
            addCriterion("SI_SID not between", value1, value2, "siSid");
            return (Criteria) this;
        }

        public Criteria andSiRaIdIsNull() {
            addCriterion("SI_RA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiRaIdIsNotNull() {
            addCriterion("SI_RA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiRaIdEqualTo(Long value) {
            addCriterion("SI_RA_ID =", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdNotEqualTo(Long value) {
            addCriterion("SI_RA_ID <>", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdGreaterThan(Long value) {
            addCriterion("SI_RA_ID >", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SI_RA_ID >=", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdLessThan(Long value) {
            addCriterion("SI_RA_ID <", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdLessThanOrEqualTo(Long value) {
            addCriterion("SI_RA_ID <=", value, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdIn(List<Long> values) {
            addCriterion("SI_RA_ID in", values, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdNotIn(List<Long> values) {
            addCriterion("SI_RA_ID not in", values, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdBetween(Long value1, Long value2) {
            addCriterion("SI_RA_ID between", value1, value2, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiRaIdNotBetween(Long value1, Long value2) {
            addCriterion("SI_RA_ID not between", value1, value2, "siRaId");
            return (Criteria) this;
        }

        public Criteria andSiTitleIsNull() {
            addCriterion("SI_Title is null");
            return (Criteria) this;
        }

        public Criteria andSiTitleIsNotNull() {
            addCriterion("SI_Title is not null");
            return (Criteria) this;
        }

        public Criteria andSiTitleEqualTo(String value) {
            addCriterion("SI_Title =", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleNotEqualTo(String value) {
            addCriterion("SI_Title <>", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleGreaterThan(String value) {
            addCriterion("SI_Title >", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SI_Title >=", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleLessThan(String value) {
            addCriterion("SI_Title <", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleLessThanOrEqualTo(String value) {
            addCriterion("SI_Title <=", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleLike(String value) {
            addCriterion("SI_Title like", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleNotLike(String value) {
            addCriterion("SI_Title not like", value, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleIn(List<String> values) {
            addCriterion("SI_Title in", values, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleNotIn(List<String> values) {
            addCriterion("SI_Title not in", values, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleBetween(String value1, String value2) {
            addCriterion("SI_Title between", value1, value2, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiTitleNotBetween(String value1, String value2) {
            addCriterion("SI_Title not between", value1, value2, "siTitle");
            return (Criteria) this;
        }

        public Criteria andSiDescIsNull() {
            addCriterion("SI_Desc is null");
            return (Criteria) this;
        }

        public Criteria andSiDescIsNotNull() {
            addCriterion("SI_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andSiDescEqualTo(String value) {
            addCriterion("SI_Desc =", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescNotEqualTo(String value) {
            addCriterion("SI_Desc <>", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescGreaterThan(String value) {
            addCriterion("SI_Desc >", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescGreaterThanOrEqualTo(String value) {
            addCriterion("SI_Desc >=", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescLessThan(String value) {
            addCriterion("SI_Desc <", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescLessThanOrEqualTo(String value) {
            addCriterion("SI_Desc <=", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescLike(String value) {
            addCriterion("SI_Desc like", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescNotLike(String value) {
            addCriterion("SI_Desc not like", value, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescIn(List<String> values) {
            addCriterion("SI_Desc in", values, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescNotIn(List<String> values) {
            addCriterion("SI_Desc not in", values, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescBetween(String value1, String value2) {
            addCriterion("SI_Desc between", value1, value2, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiDescNotBetween(String value1, String value2) {
            addCriterion("SI_Desc not between", value1, value2, "siDesc");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeIsNull() {
            addCriterion("SI_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeIsNotNull() {
            addCriterion("SI_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeEqualTo(Long value) {
            addCriterion("SI_Createtime =", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeNotEqualTo(Long value) {
            addCriterion("SI_Createtime <>", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeGreaterThan(Long value) {
            addCriterion("SI_Createtime >", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SI_Createtime >=", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeLessThan(Long value) {
            addCriterion("SI_Createtime <", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("SI_Createtime <=", value, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeIn(List<Long> values) {
            addCriterion("SI_Createtime in", values, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeNotIn(List<Long> values) {
            addCriterion("SI_Createtime not in", values, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeBetween(Long value1, Long value2) {
            addCriterion("SI_Createtime between", value1, value2, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("SI_Createtime not between", value1, value2, "siCreatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeIsNull() {
            addCriterion("SI_Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeIsNotNull() {
            addCriterion("SI_Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeEqualTo(Long value) {
            addCriterion("SI_Updatetime =", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeNotEqualTo(Long value) {
            addCriterion("SI_Updatetime <>", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeGreaterThan(Long value) {
            addCriterion("SI_Updatetime >", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SI_Updatetime >=", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeLessThan(Long value) {
            addCriterion("SI_Updatetime <", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("SI_Updatetime <=", value, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeIn(List<Long> values) {
            addCriterion("SI_Updatetime in", values, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeNotIn(List<Long> values) {
            addCriterion("SI_Updatetime not in", values, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("SI_Updatetime between", value1, value2, "siUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSiUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("SI_Updatetime not between", value1, value2, "siUpdatetime");
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