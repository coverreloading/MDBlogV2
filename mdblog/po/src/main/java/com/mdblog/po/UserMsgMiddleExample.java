package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class UserMsgMiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMsgMiddleExample() {
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

        public Criteria andUmmIdIsNull() {
            addCriterion("UMM_ID is null");
            return (Criteria) this;
        }

        public Criteria andUmmIdIsNotNull() {
            addCriterion("UMM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUmmIdEqualTo(Long value) {
            addCriterion("UMM_ID =", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdNotEqualTo(Long value) {
            addCriterion("UMM_ID <>", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdGreaterThan(Long value) {
            addCriterion("UMM_ID >", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UMM_ID >=", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdLessThan(Long value) {
            addCriterion("UMM_ID <", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdLessThanOrEqualTo(Long value) {
            addCriterion("UMM_ID <=", value, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdIn(List<Long> values) {
            addCriterion("UMM_ID in", values, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdNotIn(List<Long> values) {
            addCriterion("UMM_ID not in", values, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdBetween(Long value1, Long value2) {
            addCriterion("UMM_ID between", value1, value2, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmIdNotBetween(Long value1, Long value2) {
            addCriterion("UMM_ID not between", value1, value2, "ummId");
            return (Criteria) this;
        }

        public Criteria andUmmUidIsNull() {
            addCriterion("UMM_UID is null");
            return (Criteria) this;
        }

        public Criteria andUmmUidIsNotNull() {
            addCriterion("UMM_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUmmUidEqualTo(Long value) {
            addCriterion("UMM_UID =", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidNotEqualTo(Long value) {
            addCriterion("UMM_UID <>", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidGreaterThan(Long value) {
            addCriterion("UMM_UID >", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidGreaterThanOrEqualTo(Long value) {
            addCriterion("UMM_UID >=", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidLessThan(Long value) {
            addCriterion("UMM_UID <", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidLessThanOrEqualTo(Long value) {
            addCriterion("UMM_UID <=", value, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidIn(List<Long> values) {
            addCriterion("UMM_UID in", values, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidNotIn(List<Long> values) {
            addCriterion("UMM_UID not in", values, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidBetween(Long value1, Long value2) {
            addCriterion("UMM_UID between", value1, value2, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmUidNotBetween(Long value1, Long value2) {
            addCriterion("UMM_UID not between", value1, value2, "ummUid");
            return (Criteria) this;
        }

        public Criteria andUmmMidIsNull() {
            addCriterion("UMM_MID is null");
            return (Criteria) this;
        }

        public Criteria andUmmMidIsNotNull() {
            addCriterion("UMM_MID is not null");
            return (Criteria) this;
        }

        public Criteria andUmmMidEqualTo(Long value) {
            addCriterion("UMM_MID =", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidNotEqualTo(Long value) {
            addCriterion("UMM_MID <>", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidGreaterThan(Long value) {
            addCriterion("UMM_MID >", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidGreaterThanOrEqualTo(Long value) {
            addCriterion("UMM_MID >=", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidLessThan(Long value) {
            addCriterion("UMM_MID <", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidLessThanOrEqualTo(Long value) {
            addCriterion("UMM_MID <=", value, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidIn(List<Long> values) {
            addCriterion("UMM_MID in", values, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidNotIn(List<Long> values) {
            addCriterion("UMM_MID not in", values, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidBetween(Long value1, Long value2) {
            addCriterion("UMM_MID between", value1, value2, "ummMid");
            return (Criteria) this;
        }

        public Criteria andUmmMidNotBetween(Long value1, Long value2) {
            addCriterion("UMM_MID not between", value1, value2, "ummMid");
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