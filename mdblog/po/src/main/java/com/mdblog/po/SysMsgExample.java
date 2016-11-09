package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class SysMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMsgExample() {
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

        public Criteria andSysMsgIdIsNull() {
            addCriterion("Sys_Msg_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdIsNotNull() {
            addCriterion("Sys_Msg_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdEqualTo(Long value) {
            addCriterion("Sys_Msg_ID =", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdNotEqualTo(Long value) {
            addCriterion("Sys_Msg_ID <>", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdGreaterThan(Long value) {
            addCriterion("Sys_Msg_ID >", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_ID >=", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdLessThan(Long value) {
            addCriterion("Sys_Msg_ID <", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_ID <=", value, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdIn(List<Long> values) {
            addCriterion("Sys_Msg_ID in", values, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdNotIn(List<Long> values) {
            addCriterion("Sys_Msg_ID not in", values, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_ID between", value1, value2, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_ID not between", value1, value2, "sysMsgId");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidIsNull() {
            addCriterion("Sys_Msg_UID is null");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidIsNotNull() {
            addCriterion("Sys_Msg_UID is not null");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidEqualTo(Long value) {
            addCriterion("Sys_Msg_UID =", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidNotEqualTo(Long value) {
            addCriterion("Sys_Msg_UID <>", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidGreaterThan(Long value) {
            addCriterion("Sys_Msg_UID >", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidGreaterThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_UID >=", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidLessThan(Long value) {
            addCriterion("Sys_Msg_UID <", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidLessThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_UID <=", value, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidIn(List<Long> values) {
            addCriterion("Sys_Msg_UID in", values, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidNotIn(List<Long> values) {
            addCriterion("Sys_Msg_UID not in", values, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_UID between", value1, value2, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgUidNotBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_UID not between", value1, value2, "sysMsgUid");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleIsNull() {
            addCriterion("Sys_Msg_Title is null");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleIsNotNull() {
            addCriterion("Sys_Msg_Title is not null");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleEqualTo(String value) {
            addCriterion("Sys_Msg_Title =", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleNotEqualTo(String value) {
            addCriterion("Sys_Msg_Title <>", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleGreaterThan(String value) {
            addCriterion("Sys_Msg_Title >", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Sys_Msg_Title >=", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleLessThan(String value) {
            addCriterion("Sys_Msg_Title <", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("Sys_Msg_Title <=", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleLike(String value) {
            addCriterion("Sys_Msg_Title like", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleNotLike(String value) {
            addCriterion("Sys_Msg_Title not like", value, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleIn(List<String> values) {
            addCriterion("Sys_Msg_Title in", values, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleNotIn(List<String> values) {
            addCriterion("Sys_Msg_Title not in", values, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleBetween(String value1, String value2) {
            addCriterion("Sys_Msg_Title between", value1, value2, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgTitleNotBetween(String value1, String value2) {
            addCriterion("Sys_Msg_Title not between", value1, value2, "sysMsgTitle");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeIsNull() {
            addCriterion("Sys_Msg_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeIsNotNull() {
            addCriterion("Sys_Msg_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeEqualTo(Long value) {
            addCriterion("Sys_Msg_Createtime =", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeNotEqualTo(Long value) {
            addCriterion("Sys_Msg_Createtime <>", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeGreaterThan(Long value) {
            addCriterion("Sys_Msg_Createtime >", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_Createtime >=", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeLessThan(Long value) {
            addCriterion("Sys_Msg_Createtime <", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("Sys_Msg_Createtime <=", value, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeIn(List<Long> values) {
            addCriterion("Sys_Msg_Createtime in", values, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeNotIn(List<Long> values) {
            addCriterion("Sys_Msg_Createtime not in", values, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_Createtime between", value1, value2, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("Sys_Msg_Createtime not between", value1, value2, "sysMsgCreatetime");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelIsNull() {
            addCriterion("Sys_Msg_Del is null");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelIsNotNull() {
            addCriterion("Sys_Msg_Del is not null");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelEqualTo(Integer value) {
            addCriterion("Sys_Msg_Del =", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelNotEqualTo(Integer value) {
            addCriterion("Sys_Msg_Del <>", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelGreaterThan(Integer value) {
            addCriterion("Sys_Msg_Del >", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sys_Msg_Del >=", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelLessThan(Integer value) {
            addCriterion("Sys_Msg_Del <", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelLessThanOrEqualTo(Integer value) {
            addCriterion("Sys_Msg_Del <=", value, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelIn(List<Integer> values) {
            addCriterion("Sys_Msg_Del in", values, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelNotIn(List<Integer> values) {
            addCriterion("Sys_Msg_Del not in", values, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelBetween(Integer value1, Integer value2) {
            addCriterion("Sys_Msg_Del between", value1, value2, "sysMsgDel");
            return (Criteria) this;
        }

        public Criteria andSysMsgDelNotBetween(Integer value1, Integer value2) {
            addCriterion("Sys_Msg_Del not between", value1, value2, "sysMsgDel");
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