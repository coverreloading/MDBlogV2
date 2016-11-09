package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Long value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Long value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Long value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Long value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Long value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Long value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Long> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Long> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Long value1, Long value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Long value1, Long value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUidIsNull() {
            addCriterion("A_UID is null");
            return (Criteria) this;
        }

        public Criteria andAUidIsNotNull() {
            addCriterion("A_UID is not null");
            return (Criteria) this;
        }

        public Criteria andAUidEqualTo(Long value) {
            addCriterion("A_UID =", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidNotEqualTo(Long value) {
            addCriterion("A_UID <>", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidGreaterThan(Long value) {
            addCriterion("A_UID >", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidGreaterThanOrEqualTo(Long value) {
            addCriterion("A_UID >=", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidLessThan(Long value) {
            addCriterion("A_UID <", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidLessThanOrEqualTo(Long value) {
            addCriterion("A_UID <=", value, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidIn(List<Long> values) {
            addCriterion("A_UID in", values, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidNotIn(List<Long> values) {
            addCriterion("A_UID not in", values, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidBetween(Long value1, Long value2) {
            addCriterion("A_UID between", value1, value2, "aUid");
            return (Criteria) this;
        }

        public Criteria andAUidNotBetween(Long value1, Long value2) {
            addCriterion("A_UID not between", value1, value2, "aUid");
            return (Criteria) this;
        }

        public Criteria andATitleIsNull() {
            addCriterion("A_Title is null");
            return (Criteria) this;
        }

        public Criteria andATitleIsNotNull() {
            addCriterion("A_Title is not null");
            return (Criteria) this;
        }

        public Criteria andATitleEqualTo(String value) {
            addCriterion("A_Title =", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotEqualTo(String value) {
            addCriterion("A_Title <>", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThan(String value) {
            addCriterion("A_Title >", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThanOrEqualTo(String value) {
            addCriterion("A_Title >=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThan(String value) {
            addCriterion("A_Title <", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThanOrEqualTo(String value) {
            addCriterion("A_Title <=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLike(String value) {
            addCriterion("A_Title like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotLike(String value) {
            addCriterion("A_Title not like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleIn(List<String> values) {
            addCriterion("A_Title in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotIn(List<String> values) {
            addCriterion("A_Title not in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleBetween(String value1, String value2) {
            addCriterion("A_Title between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotBetween(String value1, String value2) {
            addCriterion("A_Title not between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andADescIsNull() {
            addCriterion("A_Desc is null");
            return (Criteria) this;
        }

        public Criteria andADescIsNotNull() {
            addCriterion("A_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andADescEqualTo(String value) {
            addCriterion("A_Desc =", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescNotEqualTo(String value) {
            addCriterion("A_Desc <>", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescGreaterThan(String value) {
            addCriterion("A_Desc >", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescGreaterThanOrEqualTo(String value) {
            addCriterion("A_Desc >=", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescLessThan(String value) {
            addCriterion("A_Desc <", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescLessThanOrEqualTo(String value) {
            addCriterion("A_Desc <=", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescLike(String value) {
            addCriterion("A_Desc like", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescNotLike(String value) {
            addCriterion("A_Desc not like", value, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescIn(List<String> values) {
            addCriterion("A_Desc in", values, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescNotIn(List<String> values) {
            addCriterion("A_Desc not in", values, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescBetween(String value1, String value2) {
            addCriterion("A_Desc between", value1, value2, "aDesc");
            return (Criteria) this;
        }

        public Criteria andADescNotBetween(String value1, String value2) {
            addCriterion("A_Desc not between", value1, value2, "aDesc");
            return (Criteria) this;
        }

        public Criteria andAPicIsNull() {
            addCriterion("A_Pic is null");
            return (Criteria) this;
        }

        public Criteria andAPicIsNotNull() {
            addCriterion("A_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andAPicEqualTo(String value) {
            addCriterion("A_Pic =", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotEqualTo(String value) {
            addCriterion("A_Pic <>", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicGreaterThan(String value) {
            addCriterion("A_Pic >", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicGreaterThanOrEqualTo(String value) {
            addCriterion("A_Pic >=", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLessThan(String value) {
            addCriterion("A_Pic <", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLessThanOrEqualTo(String value) {
            addCriterion("A_Pic <=", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLike(String value) {
            addCriterion("A_Pic like", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotLike(String value) {
            addCriterion("A_Pic not like", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicIn(List<String> values) {
            addCriterion("A_Pic in", values, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotIn(List<String> values) {
            addCriterion("A_Pic not in", values, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicBetween(String value1, String value2) {
            addCriterion("A_Pic between", value1, value2, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotBetween(String value1, String value2) {
            addCriterion("A_Pic not between", value1, value2, "aPic");
            return (Criteria) this;
        }

        public Criteria andACreatetimeIsNull() {
            addCriterion("A_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andACreatetimeIsNotNull() {
            addCriterion("A_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andACreatetimeEqualTo(Long value) {
            addCriterion("A_Createtime =", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotEqualTo(Long value) {
            addCriterion("A_Createtime <>", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeGreaterThan(Long value) {
            addCriterion("A_Createtime >", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("A_Createtime >=", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeLessThan(Long value) {
            addCriterion("A_Createtime <", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("A_Createtime <=", value, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeIn(List<Long> values) {
            addCriterion("A_Createtime in", values, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotIn(List<Long> values) {
            addCriterion("A_Createtime not in", values, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeBetween(Long value1, Long value2) {
            addCriterion("A_Createtime between", value1, value2, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andACreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("A_Createtime not between", value1, value2, "aCreatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeIsNull() {
            addCriterion("A_Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeIsNotNull() {
            addCriterion("A_Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeEqualTo(Long value) {
            addCriterion("A_Updatetime =", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeNotEqualTo(Long value) {
            addCriterion("A_Updatetime <>", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeGreaterThan(Long value) {
            addCriterion("A_Updatetime >", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("A_Updatetime >=", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeLessThan(Long value) {
            addCriterion("A_Updatetime <", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("A_Updatetime <=", value, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeIn(List<Long> values) {
            addCriterion("A_Updatetime in", values, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeNotIn(List<Long> values) {
            addCriterion("A_Updatetime not in", values, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("A_Updatetime between", value1, value2, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("A_Updatetime not between", value1, value2, "aUpdatetime");
            return (Criteria) this;
        }

        public Criteria andADelIsNull() {
            addCriterion("A_Del is null");
            return (Criteria) this;
        }

        public Criteria andADelIsNotNull() {
            addCriterion("A_Del is not null");
            return (Criteria) this;
        }

        public Criteria andADelEqualTo(Integer value) {
            addCriterion("A_Del =", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelNotEqualTo(Integer value) {
            addCriterion("A_Del <>", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelGreaterThan(Integer value) {
            addCriterion("A_Del >", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_Del >=", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelLessThan(Integer value) {
            addCriterion("A_Del <", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelLessThanOrEqualTo(Integer value) {
            addCriterion("A_Del <=", value, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelIn(List<Integer> values) {
            addCriterion("A_Del in", values, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelNotIn(List<Integer> values) {
            addCriterion("A_Del not in", values, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelBetween(Integer value1, Integer value2) {
            addCriterion("A_Del between", value1, value2, "aDel");
            return (Criteria) this;
        }

        public Criteria andADelNotBetween(Integer value1, Integer value2) {
            addCriterion("A_Del not between", value1, value2, "aDel");
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