package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class UserLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLikeExample() {
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

        public Criteria andUlIdIsNull() {
            addCriterion("UL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUlIdIsNotNull() {
            addCriterion("UL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUlIdEqualTo(Long value) {
            addCriterion("UL_ID =", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotEqualTo(Long value) {
            addCriterion("UL_ID <>", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThan(Long value) {
            addCriterion("UL_ID >", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UL_ID >=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThan(Long value) {
            addCriterion("UL_ID <", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThanOrEqualTo(Long value) {
            addCriterion("UL_ID <=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdIn(List<Long> values) {
            addCriterion("UL_ID in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotIn(List<Long> values) {
            addCriterion("UL_ID not in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdBetween(Long value1, Long value2) {
            addCriterion("UL_ID between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotBetween(Long value1, Long value2) {
            addCriterion("UL_ID not between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlUidIsNull() {
            addCriterion("UL_UID is null");
            return (Criteria) this;
        }

        public Criteria andUlUidIsNotNull() {
            addCriterion("UL_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUlUidEqualTo(Long value) {
            addCriterion("UL_UID =", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidNotEqualTo(Long value) {
            addCriterion("UL_UID <>", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidGreaterThan(Long value) {
            addCriterion("UL_UID >", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidGreaterThanOrEqualTo(Long value) {
            addCriterion("UL_UID >=", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidLessThan(Long value) {
            addCriterion("UL_UID <", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidLessThanOrEqualTo(Long value) {
            addCriterion("UL_UID <=", value, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidIn(List<Long> values) {
            addCriterion("UL_UID in", values, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidNotIn(List<Long> values) {
            addCriterion("UL_UID not in", values, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidBetween(Long value1, Long value2) {
            addCriterion("UL_UID between", value1, value2, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUidNotBetween(Long value1, Long value2) {
            addCriterion("UL_UID not between", value1, value2, "ulUid");
            return (Criteria) this;
        }

        public Criteria andUlUid2IsNull() {
            addCriterion("UL_UID2 is null");
            return (Criteria) this;
        }

        public Criteria andUlUid2IsNotNull() {
            addCriterion("UL_UID2 is not null");
            return (Criteria) this;
        }

        public Criteria andUlUid2EqualTo(Long value) {
            addCriterion("UL_UID2 =", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2NotEqualTo(Long value) {
            addCriterion("UL_UID2 <>", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2GreaterThan(Long value) {
            addCriterion("UL_UID2 >", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2GreaterThanOrEqualTo(Long value) {
            addCriterion("UL_UID2 >=", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2LessThan(Long value) {
            addCriterion("UL_UID2 <", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2LessThanOrEqualTo(Long value) {
            addCriterion("UL_UID2 <=", value, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2In(List<Long> values) {
            addCriterion("UL_UID2 in", values, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2NotIn(List<Long> values) {
            addCriterion("UL_UID2 not in", values, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2Between(Long value1, Long value2) {
            addCriterion("UL_UID2 between", value1, value2, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlUid2NotBetween(Long value1, Long value2) {
            addCriterion("UL_UID2 not between", value1, value2, "ulUid2");
            return (Criteria) this;
        }

        public Criteria andUlNicknameIsNull() {
            addCriterion("UL_Nickname is null");
            return (Criteria) this;
        }

        public Criteria andUlNicknameIsNotNull() {
            addCriterion("UL_Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUlNicknameEqualTo(String value) {
            addCriterion("UL_Nickname =", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameNotEqualTo(String value) {
            addCriterion("UL_Nickname <>", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameGreaterThan(String value) {
            addCriterion("UL_Nickname >", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("UL_Nickname >=", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameLessThan(String value) {
            addCriterion("UL_Nickname <", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameLessThanOrEqualTo(String value) {
            addCriterion("UL_Nickname <=", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameLike(String value) {
            addCriterion("UL_Nickname like", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameNotLike(String value) {
            addCriterion("UL_Nickname not like", value, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameIn(List<String> values) {
            addCriterion("UL_Nickname in", values, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameNotIn(List<String> values) {
            addCriterion("UL_Nickname not in", values, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameBetween(String value1, String value2) {
            addCriterion("UL_Nickname between", value1, value2, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlNicknameNotBetween(String value1, String value2) {
            addCriterion("UL_Nickname not between", value1, value2, "ulNickname");
            return (Criteria) this;
        }

        public Criteria andUlPicIsNull() {
            addCriterion("UL_Pic is null");
            return (Criteria) this;
        }

        public Criteria andUlPicIsNotNull() {
            addCriterion("UL_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andUlPicEqualTo(String value) {
            addCriterion("UL_Pic =", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicNotEqualTo(String value) {
            addCriterion("UL_Pic <>", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicGreaterThan(String value) {
            addCriterion("UL_Pic >", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicGreaterThanOrEqualTo(String value) {
            addCriterion("UL_Pic >=", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicLessThan(String value) {
            addCriterion("UL_Pic <", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicLessThanOrEqualTo(String value) {
            addCriterion("UL_Pic <=", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicLike(String value) {
            addCriterion("UL_Pic like", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicNotLike(String value) {
            addCriterion("UL_Pic not like", value, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicIn(List<String> values) {
            addCriterion("UL_Pic in", values, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicNotIn(List<String> values) {
            addCriterion("UL_Pic not in", values, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicBetween(String value1, String value2) {
            addCriterion("UL_Pic between", value1, value2, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlPicNotBetween(String value1, String value2) {
            addCriterion("UL_Pic not between", value1, value2, "ulPic");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeIsNull() {
            addCriterion("UL_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeIsNotNull() {
            addCriterion("UL_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeEqualTo(Long value) {
            addCriterion("UL_Createtime =", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeNotEqualTo(Long value) {
            addCriterion("UL_Createtime <>", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeGreaterThan(Long value) {
            addCriterion("UL_Createtime >", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UL_Createtime >=", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeLessThan(Long value) {
            addCriterion("UL_Createtime <", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("UL_Createtime <=", value, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeIn(List<Long> values) {
            addCriterion("UL_Createtime in", values, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeNotIn(List<Long> values) {
            addCriterion("UL_Createtime not in", values, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeBetween(Long value1, Long value2) {
            addCriterion("UL_Createtime between", value1, value2, "ulCreatetime");
            return (Criteria) this;
        }

        public Criteria andUlCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("UL_Createtime not between", value1, value2, "ulCreatetime");
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