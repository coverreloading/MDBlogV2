package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUiUidIsNull() {
            addCriterion("UI_UID is null");
            return (Criteria) this;
        }

        public Criteria andUiUidIsNotNull() {
            addCriterion("UI_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUiUidEqualTo(Long value) {
            addCriterion("UI_UID =", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidNotEqualTo(Long value) {
            addCriterion("UI_UID <>", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidGreaterThan(Long value) {
            addCriterion("UI_UID >", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_UID >=", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidLessThan(Long value) {
            addCriterion("UI_UID <", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidLessThanOrEqualTo(Long value) {
            addCriterion("UI_UID <=", value, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidIn(List<Long> values) {
            addCriterion("UI_UID in", values, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidNotIn(List<Long> values) {
            addCriterion("UI_UID not in", values, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidBetween(Long value1, Long value2) {
            addCriterion("UI_UID between", value1, value2, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiUidNotBetween(Long value1, Long value2) {
            addCriterion("UI_UID not between", value1, value2, "uiUid");
            return (Criteria) this;
        }

        public Criteria andUiNicknameIsNull() {
            addCriterion("UI_Nickname is null");
            return (Criteria) this;
        }

        public Criteria andUiNicknameIsNotNull() {
            addCriterion("UI_Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUiNicknameEqualTo(String value) {
            addCriterion("UI_Nickname =", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameNotEqualTo(String value) {
            addCriterion("UI_Nickname <>", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameGreaterThan(String value) {
            addCriterion("UI_Nickname >", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Nickname >=", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameLessThan(String value) {
            addCriterion("UI_Nickname <", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameLessThanOrEqualTo(String value) {
            addCriterion("UI_Nickname <=", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameLike(String value) {
            addCriterion("UI_Nickname like", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameNotLike(String value) {
            addCriterion("UI_Nickname not like", value, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameIn(List<String> values) {
            addCriterion("UI_Nickname in", values, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameNotIn(List<String> values) {
            addCriterion("UI_Nickname not in", values, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameBetween(String value1, String value2) {
            addCriterion("UI_Nickname between", value1, value2, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiNicknameNotBetween(String value1, String value2) {
            addCriterion("UI_Nickname not between", value1, value2, "uiNickname");
            return (Criteria) this;
        }

        public Criteria andUiPicIsNull() {
            addCriterion("UI_Pic is null");
            return (Criteria) this;
        }

        public Criteria andUiPicIsNotNull() {
            addCriterion("UI_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andUiPicEqualTo(String value) {
            addCriterion("UI_Pic =", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicNotEqualTo(String value) {
            addCriterion("UI_Pic <>", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicGreaterThan(String value) {
            addCriterion("UI_Pic >", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Pic >=", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicLessThan(String value) {
            addCriterion("UI_Pic <", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicLessThanOrEqualTo(String value) {
            addCriterion("UI_Pic <=", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicLike(String value) {
            addCriterion("UI_Pic like", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicNotLike(String value) {
            addCriterion("UI_Pic not like", value, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicIn(List<String> values) {
            addCriterion("UI_Pic in", values, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicNotIn(List<String> values) {
            addCriterion("UI_Pic not in", values, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicBetween(String value1, String value2) {
            addCriterion("UI_Pic between", value1, value2, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiPicNotBetween(String value1, String value2) {
            addCriterion("UI_Pic not between", value1, value2, "uiPic");
            return (Criteria) this;
        }

        public Criteria andUiDescIsNull() {
            addCriterion("UI_Desc is null");
            return (Criteria) this;
        }

        public Criteria andUiDescIsNotNull() {
            addCriterion("UI_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andUiDescEqualTo(String value) {
            addCriterion("UI_Desc =", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotEqualTo(String value) {
            addCriterion("UI_Desc <>", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescGreaterThan(String value) {
            addCriterion("UI_Desc >", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Desc >=", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLessThan(String value) {
            addCriterion("UI_Desc <", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLessThanOrEqualTo(String value) {
            addCriterion("UI_Desc <=", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescLike(String value) {
            addCriterion("UI_Desc like", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotLike(String value) {
            addCriterion("UI_Desc not like", value, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescIn(List<String> values) {
            addCriterion("UI_Desc in", values, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotIn(List<String> values) {
            addCriterion("UI_Desc not in", values, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescBetween(String value1, String value2) {
            addCriterion("UI_Desc between", value1, value2, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiDescNotBetween(String value1, String value2) {
            addCriterion("UI_Desc not between", value1, value2, "uiDesc");
            return (Criteria) this;
        }

        public Criteria andUiSexIsNull() {
            addCriterion("UI_Sex is null");
            return (Criteria) this;
        }

        public Criteria andUiSexIsNotNull() {
            addCriterion("UI_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andUiSexEqualTo(String value) {
            addCriterion("UI_Sex =", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexNotEqualTo(String value) {
            addCriterion("UI_Sex <>", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexGreaterThan(String value) {
            addCriterion("UI_Sex >", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Sex >=", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexLessThan(String value) {
            addCriterion("UI_Sex <", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexLessThanOrEqualTo(String value) {
            addCriterion("UI_Sex <=", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexLike(String value) {
            addCriterion("UI_Sex like", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexNotLike(String value) {
            addCriterion("UI_Sex not like", value, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexIn(List<String> values) {
            addCriterion("UI_Sex in", values, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexNotIn(List<String> values) {
            addCriterion("UI_Sex not in", values, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexBetween(String value1, String value2) {
            addCriterion("UI_Sex between", value1, value2, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiSexNotBetween(String value1, String value2) {
            addCriterion("UI_Sex not between", value1, value2, "uiSex");
            return (Criteria) this;
        }

        public Criteria andUiBirthIsNull() {
            addCriterion("UI_Birth is null");
            return (Criteria) this;
        }

        public Criteria andUiBirthIsNotNull() {
            addCriterion("UI_Birth is not null");
            return (Criteria) this;
        }

        public Criteria andUiBirthEqualTo(Long value) {
            addCriterion("UI_Birth =", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthNotEqualTo(Long value) {
            addCriterion("UI_Birth <>", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthGreaterThan(Long value) {
            addCriterion("UI_Birth >", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_Birth >=", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthLessThan(Long value) {
            addCriterion("UI_Birth <", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthLessThanOrEqualTo(Long value) {
            addCriterion("UI_Birth <=", value, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthIn(List<Long> values) {
            addCriterion("UI_Birth in", values, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthNotIn(List<Long> values) {
            addCriterion("UI_Birth not in", values, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthBetween(Long value1, Long value2) {
            addCriterion("UI_Birth between", value1, value2, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiBirthNotBetween(Long value1, Long value2) {
            addCriterion("UI_Birth not between", value1, value2, "uiBirth");
            return (Criteria) this;
        }

        public Criteria andUiOccupationIsNull() {
            addCriterion("UI_Occupation is null");
            return (Criteria) this;
        }

        public Criteria andUiOccupationIsNotNull() {
            addCriterion("UI_Occupation is not null");
            return (Criteria) this;
        }

        public Criteria andUiOccupationEqualTo(String value) {
            addCriterion("UI_Occupation =", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationNotEqualTo(String value) {
            addCriterion("UI_Occupation <>", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationGreaterThan(String value) {
            addCriterion("UI_Occupation >", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Occupation >=", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationLessThan(String value) {
            addCriterion("UI_Occupation <", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationLessThanOrEqualTo(String value) {
            addCriterion("UI_Occupation <=", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationLike(String value) {
            addCriterion("UI_Occupation like", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationNotLike(String value) {
            addCriterion("UI_Occupation not like", value, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationIn(List<String> values) {
            addCriterion("UI_Occupation in", values, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationNotIn(List<String> values) {
            addCriterion("UI_Occupation not in", values, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationBetween(String value1, String value2) {
            addCriterion("UI_Occupation between", value1, value2, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiOccupationNotBetween(String value1, String value2) {
            addCriterion("UI_Occupation not between", value1, value2, "uiOccupation");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceIsNull() {
            addCriterion("UI_Live_Place is null");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceIsNotNull() {
            addCriterion("UI_Live_Place is not null");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceEqualTo(String value) {
            addCriterion("UI_Live_Place =", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceNotEqualTo(String value) {
            addCriterion("UI_Live_Place <>", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceGreaterThan(String value) {
            addCriterion("UI_Live_Place >", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("UI_Live_Place >=", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceLessThan(String value) {
            addCriterion("UI_Live_Place <", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceLessThanOrEqualTo(String value) {
            addCriterion("UI_Live_Place <=", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceLike(String value) {
            addCriterion("UI_Live_Place like", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceNotLike(String value) {
            addCriterion("UI_Live_Place not like", value, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceIn(List<String> values) {
            addCriterion("UI_Live_Place in", values, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceNotIn(List<String> values) {
            addCriterion("UI_Live_Place not in", values, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceBetween(String value1, String value2) {
            addCriterion("UI_Live_Place between", value1, value2, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiLivePlaceNotBetween(String value1, String value2) {
            addCriterion("UI_Live_Place not between", value1, value2, "uiLivePlace");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeIsNull() {
            addCriterion("UI_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeIsNotNull() {
            addCriterion("UI_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeEqualTo(Long value) {
            addCriterion("UI_Createtime =", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeNotEqualTo(Long value) {
            addCriterion("UI_Createtime <>", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeGreaterThan(Long value) {
            addCriterion("UI_Createtime >", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_Createtime >=", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeLessThan(Long value) {
            addCriterion("UI_Createtime <", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("UI_Createtime <=", value, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeIn(List<Long> values) {
            addCriterion("UI_Createtime in", values, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeNotIn(List<Long> values) {
            addCriterion("UI_Createtime not in", values, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeBetween(Long value1, Long value2) {
            addCriterion("UI_Createtime between", value1, value2, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("UI_Createtime not between", value1, value2, "uiCreatetime");
            return (Criteria) this;
        }

        public Criteria andUiDelIsNull() {
            addCriterion("UI_Del is null");
            return (Criteria) this;
        }

        public Criteria andUiDelIsNotNull() {
            addCriterion("UI_Del is not null");
            return (Criteria) this;
        }

        public Criteria andUiDelEqualTo(Integer value) {
            addCriterion("UI_Del =", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelNotEqualTo(Integer value) {
            addCriterion("UI_Del <>", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelGreaterThan(Integer value) {
            addCriterion("UI_Del >", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_Del >=", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelLessThan(Integer value) {
            addCriterion("UI_Del <", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelLessThanOrEqualTo(Integer value) {
            addCriterion("UI_Del <=", value, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelIn(List<Integer> values) {
            addCriterion("UI_Del in", values, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelNotIn(List<Integer> values) {
            addCriterion("UI_Del not in", values, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelBetween(Integer value1, Integer value2) {
            addCriterion("UI_Del between", value1, value2, "uiDel");
            return (Criteria) this;
        }

        public Criteria andUiDelNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_Del not between", value1, value2, "uiDel");
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