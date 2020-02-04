package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KehuAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuAddressExample() {
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

        public Criteria andKudIdIsNull() {
            addCriterion("kud_id is null");
            return (Criteria) this;
        }

        public Criteria andKudIdIsNotNull() {
            addCriterion("kud_id is not null");
            return (Criteria) this;
        }

        public Criteria andKudIdEqualTo(Integer value) {
            addCriterion("kud_id =", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdNotEqualTo(Integer value) {
            addCriterion("kud_id <>", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdGreaterThan(Integer value) {
            addCriterion("kud_id >", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kud_id >=", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdLessThan(Integer value) {
            addCriterion("kud_id <", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdLessThanOrEqualTo(Integer value) {
            addCriterion("kud_id <=", value, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdIn(List<Integer> values) {
            addCriterion("kud_id in", values, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdNotIn(List<Integer> values) {
            addCriterion("kud_id not in", values, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdBetween(Integer value1, Integer value2) {
            addCriterion("kud_id between", value1, value2, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kud_id not between", value1, value2, "kudId");
            return (Criteria) this;
        }

        public Criteria andKudNameIsNull() {
            addCriterion("kud_name is null");
            return (Criteria) this;
        }

        public Criteria andKudNameIsNotNull() {
            addCriterion("kud_name is not null");
            return (Criteria) this;
        }

        public Criteria andKudNameEqualTo(String value) {
            addCriterion("kud_name =", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameNotEqualTo(String value) {
            addCriterion("kud_name <>", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameGreaterThan(String value) {
            addCriterion("kud_name >", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameGreaterThanOrEqualTo(String value) {
            addCriterion("kud_name >=", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameLessThan(String value) {
            addCriterion("kud_name <", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameLessThanOrEqualTo(String value) {
            addCriterion("kud_name <=", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameLike(String value) {
            addCriterion("kud_name like", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameNotLike(String value) {
            addCriterion("kud_name not like", value, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameIn(List<String> values) {
            addCriterion("kud_name in", values, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameNotIn(List<String> values) {
            addCriterion("kud_name not in", values, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameBetween(String value1, String value2) {
            addCriterion("kud_name between", value1, value2, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudNameNotBetween(String value1, String value2) {
            addCriterion("kud_name not between", value1, value2, "kudName");
            return (Criteria) this;
        }

        public Criteria andKudEnameIsNull() {
            addCriterion("kud_ename is null");
            return (Criteria) this;
        }

        public Criteria andKudEnameIsNotNull() {
            addCriterion("kud_ename is not null");
            return (Criteria) this;
        }

        public Criteria andKudEnameEqualTo(String value) {
            addCriterion("kud_ename =", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameNotEqualTo(String value) {
            addCriterion("kud_ename <>", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameGreaterThan(String value) {
            addCriterion("kud_ename >", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameGreaterThanOrEqualTo(String value) {
            addCriterion("kud_ename >=", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameLessThan(String value) {
            addCriterion("kud_ename <", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameLessThanOrEqualTo(String value) {
            addCriterion("kud_ename <=", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameLike(String value) {
            addCriterion("kud_ename like", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameNotLike(String value) {
            addCriterion("kud_ename not like", value, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameIn(List<String> values) {
            addCriterion("kud_ename in", values, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameNotIn(List<String> values) {
            addCriterion("kud_ename not in", values, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameBetween(String value1, String value2) {
            addCriterion("kud_ename between", value1, value2, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudEnameNotBetween(String value1, String value2) {
            addCriterion("kud_ename not between", value1, value2, "kudEname");
            return (Criteria) this;
        }

        public Criteria andKudRemarkIsNull() {
            addCriterion("kud_remark is null");
            return (Criteria) this;
        }

        public Criteria andKudRemarkIsNotNull() {
            addCriterion("kud_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKudRemarkEqualTo(String value) {
            addCriterion("kud_remark =", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkNotEqualTo(String value) {
            addCriterion("kud_remark <>", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkGreaterThan(String value) {
            addCriterion("kud_remark >", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kud_remark >=", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkLessThan(String value) {
            addCriterion("kud_remark <", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkLessThanOrEqualTo(String value) {
            addCriterion("kud_remark <=", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkLike(String value) {
            addCriterion("kud_remark like", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkNotLike(String value) {
            addCriterion("kud_remark not like", value, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkIn(List<String> values) {
            addCriterion("kud_remark in", values, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkNotIn(List<String> values) {
            addCriterion("kud_remark not in", values, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkBetween(String value1, String value2) {
            addCriterion("kud_remark between", value1, value2, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudRemarkNotBetween(String value1, String value2) {
            addCriterion("kud_remark not between", value1, value2, "kudRemark");
            return (Criteria) this;
        }

        public Criteria andKudBz1IsNull() {
            addCriterion("kud_Bz1 is null");
            return (Criteria) this;
        }

        public Criteria andKudBz1IsNotNull() {
            addCriterion("kud_Bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andKudBz1EqualTo(String value) {
            addCriterion("kud_Bz1 =", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1NotEqualTo(String value) {
            addCriterion("kud_Bz1 <>", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1GreaterThan(String value) {
            addCriterion("kud_Bz1 >", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1GreaterThanOrEqualTo(String value) {
            addCriterion("kud_Bz1 >=", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1LessThan(String value) {
            addCriterion("kud_Bz1 <", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1LessThanOrEqualTo(String value) {
            addCriterion("kud_Bz1 <=", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1Like(String value) {
            addCriterion("kud_Bz1 like", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1NotLike(String value) {
            addCriterion("kud_Bz1 not like", value, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1In(List<String> values) {
            addCriterion("kud_Bz1 in", values, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1NotIn(List<String> values) {
            addCriterion("kud_Bz1 not in", values, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1Between(String value1, String value2) {
            addCriterion("kud_Bz1 between", value1, value2, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz1NotBetween(String value1, String value2) {
            addCriterion("kud_Bz1 not between", value1, value2, "kudBz1");
            return (Criteria) this;
        }

        public Criteria andKudBz2IsNull() {
            addCriterion("kud_Bz2 is null");
            return (Criteria) this;
        }

        public Criteria andKudBz2IsNotNull() {
            addCriterion("kud_Bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andKudBz2EqualTo(String value) {
            addCriterion("kud_Bz2 =", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2NotEqualTo(String value) {
            addCriterion("kud_Bz2 <>", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2GreaterThan(String value) {
            addCriterion("kud_Bz2 >", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2GreaterThanOrEqualTo(String value) {
            addCriterion("kud_Bz2 >=", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2LessThan(String value) {
            addCriterion("kud_Bz2 <", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2LessThanOrEqualTo(String value) {
            addCriterion("kud_Bz2 <=", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2Like(String value) {
            addCriterion("kud_Bz2 like", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2NotLike(String value) {
            addCriterion("kud_Bz2 not like", value, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2In(List<String> values) {
            addCriterion("kud_Bz2 in", values, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2NotIn(List<String> values) {
            addCriterion("kud_Bz2 not in", values, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2Between(String value1, String value2) {
            addCriterion("kud_Bz2 between", value1, value2, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andKudBz2NotBetween(String value1, String value2) {
            addCriterion("kud_Bz2 not between", value1, value2, "kudBz2");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("bz3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("bz3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("bz3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("bz3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("bz3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("bz3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("bz3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("bz3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("bz3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("bz3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("bz3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("bz3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("bz3 not between", value1, value2, "bz3");
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