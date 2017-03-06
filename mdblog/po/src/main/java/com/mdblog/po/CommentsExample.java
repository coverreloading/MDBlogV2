package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Long value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Long value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Long value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Long value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Long value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Long> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Long> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Long value1, Long value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Long value1, Long value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCRaidIsNull() {
            addCriterion("C_RAID is null");
            return (Criteria) this;
        }

        public Criteria andCRaidIsNotNull() {
            addCriterion("C_RAID is not null");
            return (Criteria) this;
        }

        public Criteria andCRaidEqualTo(Long value) {
            addCriterion("C_RAID =", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidNotEqualTo(Long value) {
            addCriterion("C_RAID <>", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidGreaterThan(Long value) {
            addCriterion("C_RAID >", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidGreaterThanOrEqualTo(Long value) {
            addCriterion("C_RAID >=", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidLessThan(Long value) {
            addCriterion("C_RAID <", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidLessThanOrEqualTo(Long value) {
            addCriterion("C_RAID <=", value, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidIn(List<Long> values) {
            addCriterion("C_RAID in", values, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidNotIn(List<Long> values) {
            addCriterion("C_RAID not in", values, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidBetween(Long value1, Long value2) {
            addCriterion("C_RAID between", value1, value2, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCRaidNotBetween(Long value1, Long value2) {
            addCriterion("C_RAID not between", value1, value2, "cRaid");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNull() {
            addCriterion("C_ParentID is null");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNotNull() {
            addCriterion("C_ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andCParentidEqualTo(Long value) {
            addCriterion("C_ParentID =", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotEqualTo(Long value) {
            addCriterion("C_ParentID <>", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThan(Long value) {
            addCriterion("C_ParentID >", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("C_ParentID >=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThan(Long value) {
            addCriterion("C_ParentID <", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThanOrEqualTo(Long value) {
            addCriterion("C_ParentID <=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidIn(List<Long> values) {
            addCriterion("C_ParentID in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotIn(List<Long> values) {
            addCriterion("C_ParentID not in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidBetween(Long value1, Long value2) {
            addCriterion("C_ParentID between", value1, value2, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotBetween(Long value1, Long value2) {
            addCriterion("C_ParentID not between", value1, value2, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCUidIsNull() {
            addCriterion("C_UID is null");
            return (Criteria) this;
        }

        public Criteria andCUidIsNotNull() {
            addCriterion("C_UID is not null");
            return (Criteria) this;
        }

        public Criteria andCUidEqualTo(Long value) {
            addCriterion("C_UID =", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotEqualTo(Long value) {
            addCriterion("C_UID <>", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThan(Long value) {
            addCriterion("C_UID >", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThanOrEqualTo(Long value) {
            addCriterion("C_UID >=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThan(Long value) {
            addCriterion("C_UID <", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThanOrEqualTo(Long value) {
            addCriterion("C_UID <=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidIn(List<Long> values) {
            addCriterion("C_UID in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotIn(List<Long> values) {
            addCriterion("C_UID not in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidBetween(Long value1, Long value2) {
            addCriterion("C_UID between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotBetween(Long value1, Long value2) {
            addCriterion("C_UID not between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUPicIsNull() {
            addCriterion("C_U_Pic is null");
            return (Criteria) this;
        }

        public Criteria andCUPicIsNotNull() {
            addCriterion("C_U_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andCUPicEqualTo(String value) {
            addCriterion("C_U_Pic =", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicNotEqualTo(String value) {
            addCriterion("C_U_Pic <>", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicGreaterThan(String value) {
            addCriterion("C_U_Pic >", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicGreaterThanOrEqualTo(String value) {
            addCriterion("C_U_Pic >=", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicLessThan(String value) {
            addCriterion("C_U_Pic <", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicLessThanOrEqualTo(String value) {
            addCriterion("C_U_Pic <=", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicLike(String value) {
            addCriterion("C_U_Pic like", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicNotLike(String value) {
            addCriterion("C_U_Pic not like", value, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicIn(List<String> values) {
            addCriterion("C_U_Pic in", values, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicNotIn(List<String> values) {
            addCriterion("C_U_Pic not in", values, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicBetween(String value1, String value2) {
            addCriterion("C_U_Pic between", value1, value2, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUPicNotBetween(String value1, String value2) {
            addCriterion("C_U_Pic not between", value1, value2, "cUPic");
            return (Criteria) this;
        }

        public Criteria andCUNicknameIsNull() {
            addCriterion("C_U_Nickname is null");
            return (Criteria) this;
        }

        public Criteria andCUNicknameIsNotNull() {
            addCriterion("C_U_Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andCUNicknameEqualTo(String value) {
            addCriterion("C_U_Nickname =", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameNotEqualTo(String value) {
            addCriterion("C_U_Nickname <>", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameGreaterThan(String value) {
            addCriterion("C_U_Nickname >", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("C_U_Nickname >=", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameLessThan(String value) {
            addCriterion("C_U_Nickname <", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameLessThanOrEqualTo(String value) {
            addCriterion("C_U_Nickname <=", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameLike(String value) {
            addCriterion("C_U_Nickname like", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameNotLike(String value) {
            addCriterion("C_U_Nickname not like", value, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameIn(List<String> values) {
            addCriterion("C_U_Nickname in", values, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameNotIn(List<String> values) {
            addCriterion("C_U_Nickname not in", values, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameBetween(String value1, String value2) {
            addCriterion("C_U_Nickname between", value1, value2, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUNicknameNotBetween(String value1, String value2) {
            addCriterion("C_U_Nickname not between", value1, value2, "cUNickname");
            return (Criteria) this;
        }

        public Criteria andCUid2IsNull() {
            addCriterion("C_UID2 is null");
            return (Criteria) this;
        }

        public Criteria andCUid2IsNotNull() {
            addCriterion("C_UID2 is not null");
            return (Criteria) this;
        }

        public Criteria andCUid2EqualTo(Long value) {
            addCriterion("C_UID2 =", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2NotEqualTo(Long value) {
            addCriterion("C_UID2 <>", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2GreaterThan(Long value) {
            addCriterion("C_UID2 >", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2GreaterThanOrEqualTo(Long value) {
            addCriterion("C_UID2 >=", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2LessThan(Long value) {
            addCriterion("C_UID2 <", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2LessThanOrEqualTo(Long value) {
            addCriterion("C_UID2 <=", value, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2In(List<Long> values) {
            addCriterion("C_UID2 in", values, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2NotIn(List<Long> values) {
            addCriterion("C_UID2 not in", values, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2Between(Long value1, Long value2) {
            addCriterion("C_UID2 between", value1, value2, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUid2NotBetween(Long value1, Long value2) {
            addCriterion("C_UID2 not between", value1, value2, "cUid2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2IsNull() {
            addCriterion("C_U_Nickname2 is null");
            return (Criteria) this;
        }

        public Criteria andCUNickname2IsNotNull() {
            addCriterion("C_U_Nickname2 is not null");
            return (Criteria) this;
        }

        public Criteria andCUNickname2EqualTo(String value) {
            addCriterion("C_U_Nickname2 =", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2NotEqualTo(String value) {
            addCriterion("C_U_Nickname2 <>", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2GreaterThan(String value) {
            addCriterion("C_U_Nickname2 >", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2GreaterThanOrEqualTo(String value) {
            addCriterion("C_U_Nickname2 >=", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2LessThan(String value) {
            addCriterion("C_U_Nickname2 <", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2LessThanOrEqualTo(String value) {
            addCriterion("C_U_Nickname2 <=", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2Like(String value) {
            addCriterion("C_U_Nickname2 like", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2NotLike(String value) {
            addCriterion("C_U_Nickname2 not like", value, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2In(List<String> values) {
            addCriterion("C_U_Nickname2 in", values, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2NotIn(List<String> values) {
            addCriterion("C_U_Nickname2 not in", values, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2Between(String value1, String value2) {
            addCriterion("C_U_Nickname2 between", value1, value2, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCUNickname2NotBetween(String value1, String value2) {
            addCriterion("C_U_Nickname2 not between", value1, value2, "cUNickname2");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("C_Content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("C_Content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("C_Content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("C_Content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("C_Content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_Content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("C_Content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("C_Content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("C_Content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("C_Content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("C_Content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("C_Content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("C_Content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("C_Content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNull() {
            addCriterion("C_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNotNull() {
            addCriterion("C_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeEqualTo(Long value) {
            addCriterion("C_Createtime =", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotEqualTo(Long value) {
            addCriterion("C_Createtime <>", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThan(Long value) {
            addCriterion("C_Createtime >", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("C_Createtime >=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThan(Long value) {
            addCriterion("C_Createtime <", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("C_Createtime <=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIn(List<Long> values) {
            addCriterion("C_Createtime in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotIn(List<Long> values) {
            addCriterion("C_Createtime not in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeBetween(Long value1, Long value2) {
            addCriterion("C_Createtime between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("C_Createtime not between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCDelIsNull() {
            addCriterion("C_Del is null");
            return (Criteria) this;
        }

        public Criteria andCDelIsNotNull() {
            addCriterion("C_Del is not null");
            return (Criteria) this;
        }

        public Criteria andCDelEqualTo(Integer value) {
            addCriterion("C_Del =", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotEqualTo(Integer value) {
            addCriterion("C_Del <>", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelGreaterThan(Integer value) {
            addCriterion("C_Del >", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_Del >=", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelLessThan(Integer value) {
            addCriterion("C_Del <", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelLessThanOrEqualTo(Integer value) {
            addCriterion("C_Del <=", value, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelIn(List<Integer> values) {
            addCriterion("C_Del in", values, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotIn(List<Integer> values) {
            addCriterion("C_Del not in", values, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelBetween(Integer value1, Integer value2) {
            addCriterion("C_Del between", value1, value2, "cDel");
            return (Criteria) this;
        }

        public Criteria andCDelNotBetween(Integer value1, Integer value2) {
            addCriterion("C_Del not between", value1, value2, "cDel");
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