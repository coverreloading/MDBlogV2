package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNull() {
            addCriterion("S_Title is null");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNotNull() {
            addCriterion("S_Title is not null");
            return (Criteria) this;
        }

        public Criteria andSTitleEqualTo(String value) {
            addCriterion("S_Title =", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotEqualTo(String value) {
            addCriterion("S_Title <>", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThan(String value) {
            addCriterion("S_Title >", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThanOrEqualTo(String value) {
            addCriterion("S_Title >=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThan(String value) {
            addCriterion("S_Title <", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThanOrEqualTo(String value) {
            addCriterion("S_Title <=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLike(String value) {
            addCriterion("S_Title like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotLike(String value) {
            addCriterion("S_Title not like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleIn(List<String> values) {
            addCriterion("S_Title in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotIn(List<String> values) {
            addCriterion("S_Title not in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleBetween(String value1, String value2) {
            addCriterion("S_Title between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotBetween(String value1, String value2) {
            addCriterion("S_Title not between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSPicIsNull() {
            addCriterion("S_Pic is null");
            return (Criteria) this;
        }

        public Criteria andSPicIsNotNull() {
            addCriterion("S_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andSPicEqualTo(String value) {
            addCriterion("S_Pic =", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotEqualTo(String value) {
            addCriterion("S_Pic <>", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicGreaterThan(String value) {
            addCriterion("S_Pic >", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicGreaterThanOrEqualTo(String value) {
            addCriterion("S_Pic >=", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLessThan(String value) {
            addCriterion("S_Pic <", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLessThanOrEqualTo(String value) {
            addCriterion("S_Pic <=", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLike(String value) {
            addCriterion("S_Pic like", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotLike(String value) {
            addCriterion("S_Pic not like", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicIn(List<String> values) {
            addCriterion("S_Pic in", values, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotIn(List<String> values) {
            addCriterion("S_Pic not in", values, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicBetween(String value1, String value2) {
            addCriterion("S_Pic between", value1, value2, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotBetween(String value1, String value2) {
            addCriterion("S_Pic not between", value1, value2, "sPic");
            return (Criteria) this;
        }

        public Criteria andSDescIsNull() {
            addCriterion("S_Desc is null");
            return (Criteria) this;
        }

        public Criteria andSDescIsNotNull() {
            addCriterion("S_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andSDescEqualTo(String value) {
            addCriterion("S_Desc =", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotEqualTo(String value) {
            addCriterion("S_Desc <>", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThan(String value) {
            addCriterion("S_Desc >", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescGreaterThanOrEqualTo(String value) {
            addCriterion("S_Desc >=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThan(String value) {
            addCriterion("S_Desc <", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLessThanOrEqualTo(String value) {
            addCriterion("S_Desc <=", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescLike(String value) {
            addCriterion("S_Desc like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotLike(String value) {
            addCriterion("S_Desc not like", value, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescIn(List<String> values) {
            addCriterion("S_Desc in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotIn(List<String> values) {
            addCriterion("S_Desc not in", values, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescBetween(String value1, String value2) {
            addCriterion("S_Desc between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSDescNotBetween(String value1, String value2) {
            addCriterion("S_Desc not between", value1, value2, "sDesc");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIsNull() {
            addCriterion("S_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIsNotNull() {
            addCriterion("S_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeEqualTo(Long value) {
            addCriterion("S_Createtime =", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotEqualTo(Long value) {
            addCriterion("S_Createtime <>", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeGreaterThan(Long value) {
            addCriterion("S_Createtime >", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("S_Createtime >=", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeLessThan(Long value) {
            addCriterion("S_Createtime <", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("S_Createtime <=", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIn(List<Long> values) {
            addCriterion("S_Createtime in", values, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotIn(List<Long> values) {
            addCriterion("S_Createtime not in", values, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeBetween(Long value1, Long value2) {
            addCriterion("S_Createtime between", value1, value2, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("S_Createtime not between", value1, value2, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSDelIsNull() {
            addCriterion("S_Del is null");
            return (Criteria) this;
        }

        public Criteria andSDelIsNotNull() {
            addCriterion("S_Del is not null");
            return (Criteria) this;
        }

        public Criteria andSDelEqualTo(Integer value) {
            addCriterion("S_Del =", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelNotEqualTo(Integer value) {
            addCriterion("S_Del <>", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelGreaterThan(Integer value) {
            addCriterion("S_Del >", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_Del >=", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelLessThan(Integer value) {
            addCriterion("S_Del <", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelLessThanOrEqualTo(Integer value) {
            addCriterion("S_Del <=", value, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelIn(List<Integer> values) {
            addCriterion("S_Del in", values, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelNotIn(List<Integer> values) {
            addCriterion("S_Del not in", values, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelBetween(Integer value1, Integer value2) {
            addCriterion("S_Del between", value1, value2, "sDel");
            return (Criteria) this;
        }

        public Criteria andSDelNotBetween(Integer value1, Integer value2) {
            addCriterion("S_Del not between", value1, value2, "sDel");
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