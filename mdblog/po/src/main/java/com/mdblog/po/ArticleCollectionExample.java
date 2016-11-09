package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class ArticleCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleCollectionExample() {
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

        public Criteria andAcIdIsNull() {
            addCriterion("AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Long value) {
            addCriterion("AC_ID =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Long value) {
            addCriterion("AC_ID <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Long value) {
            addCriterion("AC_ID >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AC_ID >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Long value) {
            addCriterion("AC_ID <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Long value) {
            addCriterion("AC_ID <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Long> values) {
            addCriterion("AC_ID in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Long> values) {
            addCriterion("AC_ID not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Long value1, Long value2) {
            addCriterion("AC_ID between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Long value1, Long value2) {
            addCriterion("AC_ID not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcUidIsNull() {
            addCriterion("AC_UID is null");
            return (Criteria) this;
        }

        public Criteria andAcUidIsNotNull() {
            addCriterion("AC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andAcUidEqualTo(Long value) {
            addCriterion("AC_UID =", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidNotEqualTo(Long value) {
            addCriterion("AC_UID <>", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidGreaterThan(Long value) {
            addCriterion("AC_UID >", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidGreaterThanOrEqualTo(Long value) {
            addCriterion("AC_UID >=", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidLessThan(Long value) {
            addCriterion("AC_UID <", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidLessThanOrEqualTo(Long value) {
            addCriterion("AC_UID <=", value, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidIn(List<Long> values) {
            addCriterion("AC_UID in", values, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidNotIn(List<Long> values) {
            addCriterion("AC_UID not in", values, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidBetween(Long value1, Long value2) {
            addCriterion("AC_UID between", value1, value2, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcUidNotBetween(Long value1, Long value2) {
            addCriterion("AC_UID not between", value1, value2, "acUid");
            return (Criteria) this;
        }

        public Criteria andAcRaIdIsNull() {
            addCriterion("AC_RA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcRaIdIsNotNull() {
            addCriterion("AC_RA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcRaIdEqualTo(Long value) {
            addCriterion("AC_RA_ID =", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdNotEqualTo(Long value) {
            addCriterion("AC_RA_ID <>", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdGreaterThan(Long value) {
            addCriterion("AC_RA_ID >", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AC_RA_ID >=", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdLessThan(Long value) {
            addCriterion("AC_RA_ID <", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdLessThanOrEqualTo(Long value) {
            addCriterion("AC_RA_ID <=", value, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdIn(List<Long> values) {
            addCriterion("AC_RA_ID in", values, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdNotIn(List<Long> values) {
            addCriterion("AC_RA_ID not in", values, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdBetween(Long value1, Long value2) {
            addCriterion("AC_RA_ID between", value1, value2, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaIdNotBetween(Long value1, Long value2) {
            addCriterion("AC_RA_ID not between", value1, value2, "acRaId");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleIsNull() {
            addCriterion("AC_RA_Title is null");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleIsNotNull() {
            addCriterion("AC_RA_Title is not null");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleEqualTo(String value) {
            addCriterion("AC_RA_Title =", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleNotEqualTo(String value) {
            addCriterion("AC_RA_Title <>", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleGreaterThan(String value) {
            addCriterion("AC_RA_Title >", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("AC_RA_Title >=", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleLessThan(String value) {
            addCriterion("AC_RA_Title <", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleLessThanOrEqualTo(String value) {
            addCriterion("AC_RA_Title <=", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleLike(String value) {
            addCriterion("AC_RA_Title like", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleNotLike(String value) {
            addCriterion("AC_RA_Title not like", value, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleIn(List<String> values) {
            addCriterion("AC_RA_Title in", values, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleNotIn(List<String> values) {
            addCriterion("AC_RA_Title not in", values, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleBetween(String value1, String value2) {
            addCriterion("AC_RA_Title between", value1, value2, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcRaTitleNotBetween(String value1, String value2) {
            addCriterion("AC_RA_Title not between", value1, value2, "acRaTitle");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeIsNull() {
            addCriterion("AC_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeIsNotNull() {
            addCriterion("AC_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeEqualTo(Long value) {
            addCriterion("AC_Createtime =", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeNotEqualTo(Long value) {
            addCriterion("AC_Createtime <>", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeGreaterThan(Long value) {
            addCriterion("AC_Createtime >", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("AC_Createtime >=", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeLessThan(Long value) {
            addCriterion("AC_Createtime <", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("AC_Createtime <=", value, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeIn(List<Long> values) {
            addCriterion("AC_Createtime in", values, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeNotIn(List<Long> values) {
            addCriterion("AC_Createtime not in", values, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeBetween(Long value1, Long value2) {
            addCriterion("AC_Createtime between", value1, value2, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("AC_Createtime not between", value1, value2, "acCreatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeIsNull() {
            addCriterion("AC_Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeIsNotNull() {
            addCriterion("AC_Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeEqualTo(Long value) {
            addCriterion("AC_Updatetime =", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeNotEqualTo(Long value) {
            addCriterion("AC_Updatetime <>", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeGreaterThan(Long value) {
            addCriterion("AC_Updatetime >", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("AC_Updatetime >=", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeLessThan(Long value) {
            addCriterion("AC_Updatetime <", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("AC_Updatetime <=", value, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeIn(List<Long> values) {
            addCriterion("AC_Updatetime in", values, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeNotIn(List<Long> values) {
            addCriterion("AC_Updatetime not in", values, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("AC_Updatetime between", value1, value2, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("AC_Updatetime not between", value1, value2, "acUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAcDelIsNull() {
            addCriterion("AC_Del is null");
            return (Criteria) this;
        }

        public Criteria andAcDelIsNotNull() {
            addCriterion("AC_Del is not null");
            return (Criteria) this;
        }

        public Criteria andAcDelEqualTo(Integer value) {
            addCriterion("AC_Del =", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelNotEqualTo(Integer value) {
            addCriterion("AC_Del <>", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelGreaterThan(Integer value) {
            addCriterion("AC_Del >", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("AC_Del >=", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelLessThan(Integer value) {
            addCriterion("AC_Del <", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelLessThanOrEqualTo(Integer value) {
            addCriterion("AC_Del <=", value, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelIn(List<Integer> values) {
            addCriterion("AC_Del in", values, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelNotIn(List<Integer> values) {
            addCriterion("AC_Del not in", values, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelBetween(Integer value1, Integer value2) {
            addCriterion("AC_Del between", value1, value2, "acDel");
            return (Criteria) this;
        }

        public Criteria andAcDelNotBetween(Integer value1, Integer value2) {
            addCriterion("AC_Del not between", value1, value2, "acDel");
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