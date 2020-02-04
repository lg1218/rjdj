package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KehuTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuTypeExample() {
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

        public Criteria andKulIdIsNull() {
            addCriterion("kul_id is null");
            return (Criteria) this;
        }

        public Criteria andKulIdIsNotNull() {
            addCriterion("kul_id is not null");
            return (Criteria) this;
        }

        public Criteria andKulIdEqualTo(Integer value) {
            addCriterion("kul_id =", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdNotEqualTo(Integer value) {
            addCriterion("kul_id <>", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdGreaterThan(Integer value) {
            addCriterion("kul_id >", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kul_id >=", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdLessThan(Integer value) {
            addCriterion("kul_id <", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdLessThanOrEqualTo(Integer value) {
            addCriterion("kul_id <=", value, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdIn(List<Integer> values) {
            addCriterion("kul_id in", values, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdNotIn(List<Integer> values) {
            addCriterion("kul_id not in", values, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdBetween(Integer value1, Integer value2) {
            addCriterion("kul_id between", value1, value2, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kul_id not between", value1, value2, "kulId");
            return (Criteria) this;
        }

        public Criteria andKulNameIsNull() {
            addCriterion("kul_name is null");
            return (Criteria) this;
        }

        public Criteria andKulNameIsNotNull() {
            addCriterion("kul_name is not null");
            return (Criteria) this;
        }

        public Criteria andKulNameEqualTo(String value) {
            addCriterion("kul_name =", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameNotEqualTo(String value) {
            addCriterion("kul_name <>", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameGreaterThan(String value) {
            addCriterion("kul_name >", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameGreaterThanOrEqualTo(String value) {
            addCriterion("kul_name >=", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameLessThan(String value) {
            addCriterion("kul_name <", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameLessThanOrEqualTo(String value) {
            addCriterion("kul_name <=", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameLike(String value) {
            addCriterion("kul_name like", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameNotLike(String value) {
            addCriterion("kul_name not like", value, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameIn(List<String> values) {
            addCriterion("kul_name in", values, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameNotIn(List<String> values) {
            addCriterion("kul_name not in", values, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameBetween(String value1, String value2) {
            addCriterion("kul_name between", value1, value2, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulNameNotBetween(String value1, String value2) {
            addCriterion("kul_name not between", value1, value2, "kulName");
            return (Criteria) this;
        }

        public Criteria andKulEnameIsNull() {
            addCriterion("kul_ename is null");
            return (Criteria) this;
        }

        public Criteria andKulEnameIsNotNull() {
            addCriterion("kul_ename is not null");
            return (Criteria) this;
        }

        public Criteria andKulEnameEqualTo(String value) {
            addCriterion("kul_ename =", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameNotEqualTo(String value) {
            addCriterion("kul_ename <>", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameGreaterThan(String value) {
            addCriterion("kul_ename >", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameGreaterThanOrEqualTo(String value) {
            addCriterion("kul_ename >=", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameLessThan(String value) {
            addCriterion("kul_ename <", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameLessThanOrEqualTo(String value) {
            addCriterion("kul_ename <=", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameLike(String value) {
            addCriterion("kul_ename like", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameNotLike(String value) {
            addCriterion("kul_ename not like", value, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameIn(List<String> values) {
            addCriterion("kul_ename in", values, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameNotIn(List<String> values) {
            addCriterion("kul_ename not in", values, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameBetween(String value1, String value2) {
            addCriterion("kul_ename between", value1, value2, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulEnameNotBetween(String value1, String value2) {
            addCriterion("kul_ename not between", value1, value2, "kulEname");
            return (Criteria) this;
        }

        public Criteria andKulRemarkIsNull() {
            addCriterion("kul_remark is null");
            return (Criteria) this;
        }

        public Criteria andKulRemarkIsNotNull() {
            addCriterion("kul_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKulRemarkEqualTo(String value) {
            addCriterion("kul_remark =", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkNotEqualTo(String value) {
            addCriterion("kul_remark <>", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkGreaterThan(String value) {
            addCriterion("kul_remark >", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kul_remark >=", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkLessThan(String value) {
            addCriterion("kul_remark <", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkLessThanOrEqualTo(String value) {
            addCriterion("kul_remark <=", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkLike(String value) {
            addCriterion("kul_remark like", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkNotLike(String value) {
            addCriterion("kul_remark not like", value, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkIn(List<String> values) {
            addCriterion("kul_remark in", values, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkNotIn(List<String> values) {
            addCriterion("kul_remark not in", values, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkBetween(String value1, String value2) {
            addCriterion("kul_remark between", value1, value2, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulRemarkNotBetween(String value1, String value2) {
            addCriterion("kul_remark not between", value1, value2, "kulRemark");
            return (Criteria) this;
        }

        public Criteria andKulBz1IsNull() {
            addCriterion("Kul_Bz1 is null");
            return (Criteria) this;
        }

        public Criteria andKulBz1IsNotNull() {
            addCriterion("Kul_Bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andKulBz1EqualTo(String value) {
            addCriterion("Kul_Bz1 =", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1NotEqualTo(String value) {
            addCriterion("Kul_Bz1 <>", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1GreaterThan(String value) {
            addCriterion("Kul_Bz1 >", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1GreaterThanOrEqualTo(String value) {
            addCriterion("Kul_Bz1 >=", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1LessThan(String value) {
            addCriterion("Kul_Bz1 <", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1LessThanOrEqualTo(String value) {
            addCriterion("Kul_Bz1 <=", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1Like(String value) {
            addCriterion("Kul_Bz1 like", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1NotLike(String value) {
            addCriterion("Kul_Bz1 not like", value, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1In(List<String> values) {
            addCriterion("Kul_Bz1 in", values, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1NotIn(List<String> values) {
            addCriterion("Kul_Bz1 not in", values, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1Between(String value1, String value2) {
            addCriterion("Kul_Bz1 between", value1, value2, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz1NotBetween(String value1, String value2) {
            addCriterion("Kul_Bz1 not between", value1, value2, "kulBz1");
            return (Criteria) this;
        }

        public Criteria andKulBz2IsNull() {
            addCriterion("Kul_Bz2 is null");
            return (Criteria) this;
        }

        public Criteria andKulBz2IsNotNull() {
            addCriterion("Kul_Bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andKulBz2EqualTo(String value) {
            addCriterion("Kul_Bz2 =", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2NotEqualTo(String value) {
            addCriterion("Kul_Bz2 <>", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2GreaterThan(String value) {
            addCriterion("Kul_Bz2 >", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2GreaterThanOrEqualTo(String value) {
            addCriterion("Kul_Bz2 >=", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2LessThan(String value) {
            addCriterion("Kul_Bz2 <", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2LessThanOrEqualTo(String value) {
            addCriterion("Kul_Bz2 <=", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2Like(String value) {
            addCriterion("Kul_Bz2 like", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2NotLike(String value) {
            addCriterion("Kul_Bz2 not like", value, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2In(List<String> values) {
            addCriterion("Kul_Bz2 in", values, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2NotIn(List<String> values) {
            addCriterion("Kul_Bz2 not in", values, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2Between(String value1, String value2) {
            addCriterion("Kul_Bz2 between", value1, value2, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz2NotBetween(String value1, String value2) {
            addCriterion("Kul_Bz2 not between", value1, value2, "kulBz2");
            return (Criteria) this;
        }

        public Criteria andKulBz3IsNull() {
            addCriterion("Kul_Bz3 is null");
            return (Criteria) this;
        }

        public Criteria andKulBz3IsNotNull() {
            addCriterion("Kul_Bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andKulBz3EqualTo(String value) {
            addCriterion("Kul_Bz3 =", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3NotEqualTo(String value) {
            addCriterion("Kul_Bz3 <>", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3GreaterThan(String value) {
            addCriterion("Kul_Bz3 >", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3GreaterThanOrEqualTo(String value) {
            addCriterion("Kul_Bz3 >=", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3LessThan(String value) {
            addCriterion("Kul_Bz3 <", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3LessThanOrEqualTo(String value) {
            addCriterion("Kul_Bz3 <=", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3Like(String value) {
            addCriterion("Kul_Bz3 like", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3NotLike(String value) {
            addCriterion("Kul_Bz3 not like", value, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3In(List<String> values) {
            addCriterion("Kul_Bz3 in", values, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3NotIn(List<String> values) {
            addCriterion("Kul_Bz3 not in", values, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3Between(String value1, String value2) {
            addCriterion("Kul_Bz3 between", value1, value2, "kulBz3");
            return (Criteria) this;
        }

        public Criteria andKulBz3NotBetween(String value1, String value2) {
            addCriterion("Kul_Bz3 not between", value1, value2, "kulBz3");
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