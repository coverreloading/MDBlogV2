package com.mdblog.po;

import java.util.ArrayList;
import java.util.List;

public class NewsletterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsletterExample() {
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

        public Criteria andNlIdIsNull() {
            addCriterion("NL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNlIdIsNotNull() {
            addCriterion("NL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNlIdEqualTo(Long value) {
            addCriterion("NL_ID =", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdNotEqualTo(Long value) {
            addCriterion("NL_ID <>", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdGreaterThan(Long value) {
            addCriterion("NL_ID >", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NL_ID >=", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdLessThan(Long value) {
            addCriterion("NL_ID <", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdLessThanOrEqualTo(Long value) {
            addCriterion("NL_ID <=", value, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdIn(List<Long> values) {
            addCriterion("NL_ID in", values, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdNotIn(List<Long> values) {
            addCriterion("NL_ID not in", values, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdBetween(Long value1, Long value2) {
            addCriterion("NL_ID between", value1, value2, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlIdNotBetween(Long value1, Long value2) {
            addCriterion("NL_ID not between", value1, value2, "nlId");
            return (Criteria) this;
        }

        public Criteria andNlFromUidIsNull() {
            addCriterion("NL_From_UID is null");
            return (Criteria) this;
        }

        public Criteria andNlFromUidIsNotNull() {
            addCriterion("NL_From_UID is not null");
            return (Criteria) this;
        }

        public Criteria andNlFromUidEqualTo(Long value) {
            addCriterion("NL_From_UID =", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidNotEqualTo(Long value) {
            addCriterion("NL_From_UID <>", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidGreaterThan(Long value) {
            addCriterion("NL_From_UID >", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidGreaterThanOrEqualTo(Long value) {
            addCriterion("NL_From_UID >=", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidLessThan(Long value) {
            addCriterion("NL_From_UID <", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidLessThanOrEqualTo(Long value) {
            addCriterion("NL_From_UID <=", value, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidIn(List<Long> values) {
            addCriterion("NL_From_UID in", values, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidNotIn(List<Long> values) {
            addCriterion("NL_From_UID not in", values, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidBetween(Long value1, Long value2) {
            addCriterion("NL_From_UID between", value1, value2, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlFromUidNotBetween(Long value1, Long value2) {
            addCriterion("NL_From_UID not between", value1, value2, "nlFromUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidIsNull() {
            addCriterion("NL_To_UID is null");
            return (Criteria) this;
        }

        public Criteria andNlToUidIsNotNull() {
            addCriterion("NL_To_UID is not null");
            return (Criteria) this;
        }

        public Criteria andNlToUidEqualTo(Long value) {
            addCriterion("NL_To_UID =", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidNotEqualTo(Long value) {
            addCriterion("NL_To_UID <>", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidGreaterThan(Long value) {
            addCriterion("NL_To_UID >", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidGreaterThanOrEqualTo(Long value) {
            addCriterion("NL_To_UID >=", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidLessThan(Long value) {
            addCriterion("NL_To_UID <", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidLessThanOrEqualTo(Long value) {
            addCriterion("NL_To_UID <=", value, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidIn(List<Long> values) {
            addCriterion("NL_To_UID in", values, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidNotIn(List<Long> values) {
            addCriterion("NL_To_UID not in", values, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidBetween(Long value1, Long value2) {
            addCriterion("NL_To_UID between", value1, value2, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlToUidNotBetween(Long value1, Long value2) {
            addCriterion("NL_To_UID not between", value1, value2, "nlToUid");
            return (Criteria) this;
        }

        public Criteria andNlTextIsNull() {
            addCriterion("NL_Text is null");
            return (Criteria) this;
        }

        public Criteria andNlTextIsNotNull() {
            addCriterion("NL_Text is not null");
            return (Criteria) this;
        }

        public Criteria andNlTextEqualTo(String value) {
            addCriterion("NL_Text =", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextNotEqualTo(String value) {
            addCriterion("NL_Text <>", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextGreaterThan(String value) {
            addCriterion("NL_Text >", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextGreaterThanOrEqualTo(String value) {
            addCriterion("NL_Text >=", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextLessThan(String value) {
            addCriterion("NL_Text <", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextLessThanOrEqualTo(String value) {
            addCriterion("NL_Text <=", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextLike(String value) {
            addCriterion("NL_Text like", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextNotLike(String value) {
            addCriterion("NL_Text not like", value, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextIn(List<String> values) {
            addCriterion("NL_Text in", values, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextNotIn(List<String> values) {
            addCriterion("NL_Text not in", values, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextBetween(String value1, String value2) {
            addCriterion("NL_Text between", value1, value2, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlTextNotBetween(String value1, String value2) {
            addCriterion("NL_Text not between", value1, value2, "nlText");
            return (Criteria) this;
        }

        public Criteria andNlIsreadIsNull() {
            addCriterion("NL_IsRead is null");
            return (Criteria) this;
        }

        public Criteria andNlIsreadIsNotNull() {
            addCriterion("NL_IsRead is not null");
            return (Criteria) this;
        }

        public Criteria andNlIsreadEqualTo(Integer value) {
            addCriterion("NL_IsRead =", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadNotEqualTo(Integer value) {
            addCriterion("NL_IsRead <>", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadGreaterThan(Integer value) {
            addCriterion("NL_IsRead >", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("NL_IsRead >=", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadLessThan(Integer value) {
            addCriterion("NL_IsRead <", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadLessThanOrEqualTo(Integer value) {
            addCriterion("NL_IsRead <=", value, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadIn(List<Integer> values) {
            addCriterion("NL_IsRead in", values, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadNotIn(List<Integer> values) {
            addCriterion("NL_IsRead not in", values, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadBetween(Integer value1, Integer value2) {
            addCriterion("NL_IsRead between", value1, value2, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlIsreadNotBetween(Integer value1, Integer value2) {
            addCriterion("NL_IsRead not between", value1, value2, "nlIsread");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeIsNull() {
            addCriterion("NL_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeIsNotNull() {
            addCriterion("NL_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeEqualTo(Long value) {
            addCriterion("NL_Createtime =", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeNotEqualTo(Long value) {
            addCriterion("NL_Createtime <>", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeGreaterThan(Long value) {
            addCriterion("NL_Createtime >", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("NL_Createtime >=", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeLessThan(Long value) {
            addCriterion("NL_Createtime <", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("NL_Createtime <=", value, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeIn(List<Long> values) {
            addCriterion("NL_Createtime in", values, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeNotIn(List<Long> values) {
            addCriterion("NL_Createtime not in", values, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeBetween(Long value1, Long value2) {
            addCriterion("NL_Createtime between", value1, value2, "nlCreatetime");
            return (Criteria) this;
        }

        public Criteria andNlCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("NL_Createtime not between", value1, value2, "nlCreatetime");
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