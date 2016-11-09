package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class ReleaseArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseArticleExample() {
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

        public Criteria andRaIdIsNull() {
            addCriterion("RA_ID is null");
            return (Criteria) this;
        }

        public Criteria andRaIdIsNotNull() {
            addCriterion("RA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRaIdEqualTo(Long value) {
            addCriterion("RA_ID =", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdNotEqualTo(Long value) {
            addCriterion("RA_ID <>", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdGreaterThan(Long value) {
            addCriterion("RA_ID >", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_ID >=", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdLessThan(Long value) {
            addCriterion("RA_ID <", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdLessThanOrEqualTo(Long value) {
            addCriterion("RA_ID <=", value, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdIn(List<Long> values) {
            addCriterion("RA_ID in", values, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdNotIn(List<Long> values) {
            addCriterion("RA_ID not in", values, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdBetween(Long value1, Long value2) {
            addCriterion("RA_ID between", value1, value2, "raId");
            return (Criteria) this;
        }

        public Criteria andRaIdNotBetween(Long value1, Long value2) {
            addCriterion("RA_ID not between", value1, value2, "raId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdIsNull() {
            addCriterion("RA_Article_ID is null");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdIsNotNull() {
            addCriterion("RA_Article_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdEqualTo(Long value) {
            addCriterion("RA_Article_ID =", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdNotEqualTo(Long value) {
            addCriterion("RA_Article_ID <>", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdGreaterThan(Long value) {
            addCriterion("RA_Article_ID >", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Article_ID >=", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdLessThan(Long value) {
            addCriterion("RA_Article_ID <", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("RA_Article_ID <=", value, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdIn(List<Long> values) {
            addCriterion("RA_Article_ID in", values, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdNotIn(List<Long> values) {
            addCriterion("RA_Article_ID not in", values, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdBetween(Long value1, Long value2) {
            addCriterion("RA_Article_ID between", value1, value2, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("RA_Article_ID not between", value1, value2, "raArticleId");
            return (Criteria) this;
        }

        public Criteria andRaUidIsNull() {
            addCriterion("RA_UID is null");
            return (Criteria) this;
        }

        public Criteria andRaUidIsNotNull() {
            addCriterion("RA_UID is not null");
            return (Criteria) this;
        }

        public Criteria andRaUidEqualTo(Long value) {
            addCriterion("RA_UID =", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidNotEqualTo(Long value) {
            addCriterion("RA_UID <>", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidGreaterThan(Long value) {
            addCriterion("RA_UID >", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_UID >=", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidLessThan(Long value) {
            addCriterion("RA_UID <", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidLessThanOrEqualTo(Long value) {
            addCriterion("RA_UID <=", value, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidIn(List<Long> values) {
            addCriterion("RA_UID in", values, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidNotIn(List<Long> values) {
            addCriterion("RA_UID not in", values, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidBetween(Long value1, Long value2) {
            addCriterion("RA_UID between", value1, value2, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaUidNotBetween(Long value1, Long value2) {
            addCriterion("RA_UID not between", value1, value2, "raUid");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdIsNull() {
            addCriterion("RA_Subject_ID is null");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdIsNotNull() {
            addCriterion("RA_Subject_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdEqualTo(Long value) {
            addCriterion("RA_Subject_ID =", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdNotEqualTo(Long value) {
            addCriterion("RA_Subject_ID <>", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdGreaterThan(Long value) {
            addCriterion("RA_Subject_ID >", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Subject_ID >=", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdLessThan(Long value) {
            addCriterion("RA_Subject_ID <", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("RA_Subject_ID <=", value, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdIn(List<Long> values) {
            addCriterion("RA_Subject_ID in", values, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdNotIn(List<Long> values) {
            addCriterion("RA_Subject_ID not in", values, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdBetween(Long value1, Long value2) {
            addCriterion("RA_Subject_ID between", value1, value2, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("RA_Subject_ID not between", value1, value2, "raSubjectId");
            return (Criteria) this;
        }

        public Criteria andRaTitleIsNull() {
            addCriterion("RA_Title is null");
            return (Criteria) this;
        }

        public Criteria andRaTitleIsNotNull() {
            addCriterion("RA_Title is not null");
            return (Criteria) this;
        }

        public Criteria andRaTitleEqualTo(String value) {
            addCriterion("RA_Title =", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleNotEqualTo(String value) {
            addCriterion("RA_Title <>", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleGreaterThan(String value) {
            addCriterion("RA_Title >", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("RA_Title >=", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleLessThan(String value) {
            addCriterion("RA_Title <", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleLessThanOrEqualTo(String value) {
            addCriterion("RA_Title <=", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleLike(String value) {
            addCriterion("RA_Title like", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleNotLike(String value) {
            addCriterion("RA_Title not like", value, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleIn(List<String> values) {
            addCriterion("RA_Title in", values, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleNotIn(List<String> values) {
            addCriterion("RA_Title not in", values, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleBetween(String value1, String value2) {
            addCriterion("RA_Title between", value1, value2, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaTitleNotBetween(String value1, String value2) {
            addCriterion("RA_Title not between", value1, value2, "raTitle");
            return (Criteria) this;
        }

        public Criteria andRaDescIsNull() {
            addCriterion("RA_Desc is null");
            return (Criteria) this;
        }

        public Criteria andRaDescIsNotNull() {
            addCriterion("RA_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andRaDescEqualTo(String value) {
            addCriterion("RA_Desc =", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescNotEqualTo(String value) {
            addCriterion("RA_Desc <>", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescGreaterThan(String value) {
            addCriterion("RA_Desc >", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescGreaterThanOrEqualTo(String value) {
            addCriterion("RA_Desc >=", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescLessThan(String value) {
            addCriterion("RA_Desc <", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescLessThanOrEqualTo(String value) {
            addCriterion("RA_Desc <=", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescLike(String value) {
            addCriterion("RA_Desc like", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescNotLike(String value) {
            addCriterion("RA_Desc not like", value, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescIn(List<String> values) {
            addCriterion("RA_Desc in", values, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescNotIn(List<String> values) {
            addCriterion("RA_Desc not in", values, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescBetween(String value1, String value2) {
            addCriterion("RA_Desc between", value1, value2, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaDescNotBetween(String value1, String value2) {
            addCriterion("RA_Desc not between", value1, value2, "raDesc");
            return (Criteria) this;
        }

        public Criteria andRaReadIsNull() {
            addCriterion("RA_Read is null");
            return (Criteria) this;
        }

        public Criteria andRaReadIsNotNull() {
            addCriterion("RA_Read is not null");
            return (Criteria) this;
        }

        public Criteria andRaReadEqualTo(Long value) {
            addCriterion("RA_Read =", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadNotEqualTo(Long value) {
            addCriterion("RA_Read <>", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadGreaterThan(Long value) {
            addCriterion("RA_Read >", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Read >=", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadLessThan(Long value) {
            addCriterion("RA_Read <", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadLessThanOrEqualTo(Long value) {
            addCriterion("RA_Read <=", value, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadIn(List<Long> values) {
            addCriterion("RA_Read in", values, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadNotIn(List<Long> values) {
            addCriterion("RA_Read not in", values, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadBetween(Long value1, Long value2) {
            addCriterion("RA_Read between", value1, value2, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaReadNotBetween(Long value1, Long value2) {
            addCriterion("RA_Read not between", value1, value2, "raRead");
            return (Criteria) this;
        }

        public Criteria andRaLikeIsNull() {
            addCriterion("RA_Like is null");
            return (Criteria) this;
        }

        public Criteria andRaLikeIsNotNull() {
            addCriterion("RA_Like is not null");
            return (Criteria) this;
        }

        public Criteria andRaLikeEqualTo(Long value) {
            addCriterion("RA_Like =", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotEqualTo(Long value) {
            addCriterion("RA_Like <>", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeGreaterThan(Long value) {
            addCriterion("RA_Like >", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Like >=", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeLessThan(Long value) {
            addCriterion("RA_Like <", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeLessThanOrEqualTo(Long value) {
            addCriterion("RA_Like <=", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeIn(List<Long> values) {
            addCriterion("RA_Like in", values, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotIn(List<Long> values) {
            addCriterion("RA_Like not in", values, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeBetween(Long value1, Long value2) {
            addCriterion("RA_Like between", value1, value2, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotBetween(Long value1, Long value2) {
            addCriterion("RA_Like not between", value1, value2, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeIsNull() {
            addCriterion("RA_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeIsNotNull() {
            addCriterion("RA_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeEqualTo(Long value) {
            addCriterion("RA_Createtime =", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeNotEqualTo(Long value) {
            addCriterion("RA_Createtime <>", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeGreaterThan(Long value) {
            addCriterion("RA_Createtime >", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Createtime >=", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeLessThan(Long value) {
            addCriterion("RA_Createtime <", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("RA_Createtime <=", value, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeIn(List<Long> values) {
            addCriterion("RA_Createtime in", values, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeNotIn(List<Long> values) {
            addCriterion("RA_Createtime not in", values, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeBetween(Long value1, Long value2) {
            addCriterion("RA_Createtime between", value1, value2, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("RA_Createtime not between", value1, value2, "raCreatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeIsNull() {
            addCriterion("RA_Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeIsNotNull() {
            addCriterion("RA_Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeEqualTo(Long value) {
            addCriterion("RA_Updatetime =", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeNotEqualTo(Long value) {
            addCriterion("RA_Updatetime <>", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeGreaterThan(Long value) {
            addCriterion("RA_Updatetime >", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("RA_Updatetime >=", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeLessThan(Long value) {
            addCriterion("RA_Updatetime <", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("RA_Updatetime <=", value, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeIn(List<Long> values) {
            addCriterion("RA_Updatetime in", values, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeNotIn(List<Long> values) {
            addCriterion("RA_Updatetime not in", values, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("RA_Updatetime between", value1, value2, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("RA_Updatetime not between", value1, value2, "raUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRaDelIsNull() {
            addCriterion("RA_Del is null");
            return (Criteria) this;
        }

        public Criteria andRaDelIsNotNull() {
            addCriterion("RA_Del is not null");
            return (Criteria) this;
        }

        public Criteria andRaDelEqualTo(Integer value) {
            addCriterion("RA_Del =", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelNotEqualTo(Integer value) {
            addCriterion("RA_Del <>", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelGreaterThan(Integer value) {
            addCriterion("RA_Del >", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("RA_Del >=", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelLessThan(Integer value) {
            addCriterion("RA_Del <", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelLessThanOrEqualTo(Integer value) {
            addCriterion("RA_Del <=", value, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelIn(List<Integer> values) {
            addCriterion("RA_Del in", values, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelNotIn(List<Integer> values) {
            addCriterion("RA_Del not in", values, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelBetween(Integer value1, Integer value2) {
            addCriterion("RA_Del between", value1, value2, "raDel");
            return (Criteria) this;
        }

        public Criteria andRaDelNotBetween(Integer value1, Integer value2) {
            addCriterion("RA_Del not between", value1, value2, "raDel");
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