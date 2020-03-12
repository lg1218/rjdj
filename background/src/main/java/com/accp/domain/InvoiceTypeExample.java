package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class InvoiceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceTypeExample() {
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

        public Criteria andItIdIsNull() {
            addCriterion("it_id is null");
            return (Criteria) this;
        }

        public Criteria andItIdIsNotNull() {
            addCriterion("it_id is not null");
            return (Criteria) this;
        }

        public Criteria andItIdEqualTo(String value) {
            addCriterion("it_id =", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotEqualTo(String value) {
            addCriterion("it_id <>", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThan(String value) {
            addCriterion("it_id >", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThanOrEqualTo(String value) {
            addCriterion("it_id >=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThan(String value) {
            addCriterion("it_id <", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThanOrEqualTo(String value) {
            addCriterion("it_id <=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLike(String value) {
            addCriterion("it_id like", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotLike(String value) {
            addCriterion("it_id not like", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdIn(List<String> values) {
            addCriterion("it_id in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotIn(List<String> values) {
            addCriterion("it_id not in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdBetween(String value1, String value2) {
            addCriterion("it_id between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotBetween(String value1, String value2) {
            addCriterion("it_id not between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItNameIsNull() {
            addCriterion("it_name is null");
            return (Criteria) this;
        }

        public Criteria andItNameIsNotNull() {
            addCriterion("it_name is not null");
            return (Criteria) this;
        }

        public Criteria andItNameEqualTo(String value) {
            addCriterion("it_name =", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotEqualTo(String value) {
            addCriterion("it_name <>", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThan(String value) {
            addCriterion("it_name >", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameGreaterThanOrEqualTo(String value) {
            addCriterion("it_name >=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThan(String value) {
            addCriterion("it_name <", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLessThanOrEqualTo(String value) {
            addCriterion("it_name <=", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameLike(String value) {
            addCriterion("it_name like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotLike(String value) {
            addCriterion("it_name not like", value, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameIn(List<String> values) {
            addCriterion("it_name in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotIn(List<String> values) {
            addCriterion("it_name not in", values, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameBetween(String value1, String value2) {
            addCriterion("it_name between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItNameNotBetween(String value1, String value2) {
            addCriterion("it_name not between", value1, value2, "itName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameIsNull() {
            addCriterion("it_english_name is null");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameIsNotNull() {
            addCriterion("it_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameEqualTo(String value) {
            addCriterion("it_english_name =", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameNotEqualTo(String value) {
            addCriterion("it_english_name <>", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameGreaterThan(String value) {
            addCriterion("it_english_name >", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("it_english_name >=", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameLessThan(String value) {
            addCriterion("it_english_name <", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("it_english_name <=", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameLike(String value) {
            addCriterion("it_english_name like", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameNotLike(String value) {
            addCriterion("it_english_name not like", value, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameIn(List<String> values) {
            addCriterion("it_english_name in", values, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameNotIn(List<String> values) {
            addCriterion("it_english_name not in", values, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameBetween(String value1, String value2) {
            addCriterion("it_english_name between", value1, value2, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItEnglishNameNotBetween(String value1, String value2) {
            addCriterion("it_english_name not between", value1, value2, "itEnglishName");
            return (Criteria) this;
        }

        public Criteria andItRemarkIsNull() {
            addCriterion("it_remark is null");
            return (Criteria) this;
        }

        public Criteria andItRemarkIsNotNull() {
            addCriterion("it_remark is not null");
            return (Criteria) this;
        }

        public Criteria andItRemarkEqualTo(String value) {
            addCriterion("it_remark =", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkNotEqualTo(String value) {
            addCriterion("it_remark <>", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkGreaterThan(String value) {
            addCriterion("it_remark >", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("it_remark >=", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkLessThan(String value) {
            addCriterion("it_remark <", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkLessThanOrEqualTo(String value) {
            addCriterion("it_remark <=", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkLike(String value) {
            addCriterion("it_remark like", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkNotLike(String value) {
            addCriterion("it_remark not like", value, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkIn(List<String> values) {
            addCriterion("it_remark in", values, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkNotIn(List<String> values) {
            addCriterion("it_remark not in", values, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkBetween(String value1, String value2) {
            addCriterion("it_remark between", value1, value2, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItRemarkNotBetween(String value1, String value2) {
            addCriterion("it_remark not between", value1, value2, "itRemark");
            return (Criteria) this;
        }

        public Criteria andItAuditingIsNull() {
            addCriterion("it_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andItAuditingIsNotNull() {
            addCriterion("it_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andItAuditingEqualTo(String value) {
            addCriterion("it_Auditing =", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingNotEqualTo(String value) {
            addCriterion("it_Auditing <>", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingGreaterThan(String value) {
            addCriterion("it_Auditing >", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("it_Auditing >=", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingLessThan(String value) {
            addCriterion("it_Auditing <", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingLessThanOrEqualTo(String value) {
            addCriterion("it_Auditing <=", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingLike(String value) {
            addCriterion("it_Auditing like", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingNotLike(String value) {
            addCriterion("it_Auditing not like", value, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingIn(List<String> values) {
            addCriterion("it_Auditing in", values, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingNotIn(List<String> values) {
            addCriterion("it_Auditing not in", values, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingBetween(String value1, String value2) {
            addCriterion("it_Auditing between", value1, value2, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItAuditingNotBetween(String value1, String value2) {
            addCriterion("it_Auditing not between", value1, value2, "itAuditing");
            return (Criteria) this;
        }

        public Criteria andItYnIsNull() {
            addCriterion("it_yn is null");
            return (Criteria) this;
        }

        public Criteria andItYnIsNotNull() {
            addCriterion("it_yn is not null");
            return (Criteria) this;
        }

        public Criteria andItYnEqualTo(String value) {
            addCriterion("it_yn =", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnNotEqualTo(String value) {
            addCriterion("it_yn <>", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnGreaterThan(String value) {
            addCriterion("it_yn >", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnGreaterThanOrEqualTo(String value) {
            addCriterion("it_yn >=", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnLessThan(String value) {
            addCriterion("it_yn <", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnLessThanOrEqualTo(String value) {
            addCriterion("it_yn <=", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnLike(String value) {
            addCriterion("it_yn like", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnNotLike(String value) {
            addCriterion("it_yn not like", value, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnIn(List<String> values) {
            addCriterion("it_yn in", values, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnNotIn(List<String> values) {
            addCriterion("it_yn not in", values, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnBetween(String value1, String value2) {
            addCriterion("it_yn between", value1, value2, "itYn");
            return (Criteria) this;
        }

        public Criteria andItYnNotBetween(String value1, String value2) {
            addCriterion("it_yn not between", value1, value2, "itYn");
            return (Criteria) this;
        }

        public Criteria andItCustom1IsNull() {
            addCriterion("it_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom1IsNotNull() {
            addCriterion("it_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom1EqualTo(String value) {
            addCriterion("it_custom1 =", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1NotEqualTo(String value) {
            addCriterion("it_custom1 <>", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1GreaterThan(String value) {
            addCriterion("it_custom1 >", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom1 >=", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1LessThan(String value) {
            addCriterion("it_custom1 <", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1LessThanOrEqualTo(String value) {
            addCriterion("it_custom1 <=", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1Like(String value) {
            addCriterion("it_custom1 like", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1NotLike(String value) {
            addCriterion("it_custom1 not like", value, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1In(List<String> values) {
            addCriterion("it_custom1 in", values, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1NotIn(List<String> values) {
            addCriterion("it_custom1 not in", values, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1Between(String value1, String value2) {
            addCriterion("it_custom1 between", value1, value2, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom1NotBetween(String value1, String value2) {
            addCriterion("it_custom1 not between", value1, value2, "itCustom1");
            return (Criteria) this;
        }

        public Criteria andItCustom2IsNull() {
            addCriterion("it_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom2IsNotNull() {
            addCriterion("it_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom2EqualTo(String value) {
            addCriterion("it_custom2 =", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2NotEqualTo(String value) {
            addCriterion("it_custom2 <>", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2GreaterThan(String value) {
            addCriterion("it_custom2 >", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom2 >=", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2LessThan(String value) {
            addCriterion("it_custom2 <", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2LessThanOrEqualTo(String value) {
            addCriterion("it_custom2 <=", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2Like(String value) {
            addCriterion("it_custom2 like", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2NotLike(String value) {
            addCriterion("it_custom2 not like", value, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2In(List<String> values) {
            addCriterion("it_custom2 in", values, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2NotIn(List<String> values) {
            addCriterion("it_custom2 not in", values, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2Between(String value1, String value2) {
            addCriterion("it_custom2 between", value1, value2, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom2NotBetween(String value1, String value2) {
            addCriterion("it_custom2 not between", value1, value2, "itCustom2");
            return (Criteria) this;
        }

        public Criteria andItCustom3IsNull() {
            addCriterion("it_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom3IsNotNull() {
            addCriterion("it_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom3EqualTo(String value) {
            addCriterion("it_custom3 =", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3NotEqualTo(String value) {
            addCriterion("it_custom3 <>", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3GreaterThan(String value) {
            addCriterion("it_custom3 >", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom3 >=", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3LessThan(String value) {
            addCriterion("it_custom3 <", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3LessThanOrEqualTo(String value) {
            addCriterion("it_custom3 <=", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3Like(String value) {
            addCriterion("it_custom3 like", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3NotLike(String value) {
            addCriterion("it_custom3 not like", value, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3In(List<String> values) {
            addCriterion("it_custom3 in", values, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3NotIn(List<String> values) {
            addCriterion("it_custom3 not in", values, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3Between(String value1, String value2) {
            addCriterion("it_custom3 between", value1, value2, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom3NotBetween(String value1, String value2) {
            addCriterion("it_custom3 not between", value1, value2, "itCustom3");
            return (Criteria) this;
        }

        public Criteria andItCustom4IsNull() {
            addCriterion("it_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom4IsNotNull() {
            addCriterion("it_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom4EqualTo(String value) {
            addCriterion("it_custom4 =", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4NotEqualTo(String value) {
            addCriterion("it_custom4 <>", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4GreaterThan(String value) {
            addCriterion("it_custom4 >", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom4 >=", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4LessThan(String value) {
            addCriterion("it_custom4 <", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4LessThanOrEqualTo(String value) {
            addCriterion("it_custom4 <=", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4Like(String value) {
            addCriterion("it_custom4 like", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4NotLike(String value) {
            addCriterion("it_custom4 not like", value, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4In(List<String> values) {
            addCriterion("it_custom4 in", values, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4NotIn(List<String> values) {
            addCriterion("it_custom4 not in", values, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4Between(String value1, String value2) {
            addCriterion("it_custom4 between", value1, value2, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom4NotBetween(String value1, String value2) {
            addCriterion("it_custom4 not between", value1, value2, "itCustom4");
            return (Criteria) this;
        }

        public Criteria andItCustom5IsNull() {
            addCriterion("it_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom5IsNotNull() {
            addCriterion("it_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom5EqualTo(String value) {
            addCriterion("it_custom5 =", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5NotEqualTo(String value) {
            addCriterion("it_custom5 <>", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5GreaterThan(String value) {
            addCriterion("it_custom5 >", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom5 >=", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5LessThan(String value) {
            addCriterion("it_custom5 <", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5LessThanOrEqualTo(String value) {
            addCriterion("it_custom5 <=", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5Like(String value) {
            addCriterion("it_custom5 like", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5NotLike(String value) {
            addCriterion("it_custom5 not like", value, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5In(List<String> values) {
            addCriterion("it_custom5 in", values, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5NotIn(List<String> values) {
            addCriterion("it_custom5 not in", values, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5Between(String value1, String value2) {
            addCriterion("it_custom5 between", value1, value2, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom5NotBetween(String value1, String value2) {
            addCriterion("it_custom5 not between", value1, value2, "itCustom5");
            return (Criteria) this;
        }

        public Criteria andItCustom6IsNull() {
            addCriterion("it_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andItCustom6IsNotNull() {
            addCriterion("it_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andItCustom6EqualTo(String value) {
            addCriterion("it_custom6 =", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6NotEqualTo(String value) {
            addCriterion("it_custom6 <>", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6GreaterThan(String value) {
            addCriterion("it_custom6 >", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("it_custom6 >=", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6LessThan(String value) {
            addCriterion("it_custom6 <", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6LessThanOrEqualTo(String value) {
            addCriterion("it_custom6 <=", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6Like(String value) {
            addCriterion("it_custom6 like", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6NotLike(String value) {
            addCriterion("it_custom6 not like", value, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6In(List<String> values) {
            addCriterion("it_custom6 in", values, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6NotIn(List<String> values) {
            addCriterion("it_custom6 not in", values, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6Between(String value1, String value2) {
            addCriterion("it_custom6 between", value1, value2, "itCustom6");
            return (Criteria) this;
        }

        public Criteria andItCustom6NotBetween(String value1, String value2) {
            addCriterion("it_custom6 not between", value1, value2, "itCustom6");
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