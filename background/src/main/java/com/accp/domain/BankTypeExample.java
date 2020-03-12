package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class BankTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankTypeExample() {
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

        public Criteria andBtIdIsNull() {
            addCriterion("bt_id is null");
            return (Criteria) this;
        }

        public Criteria andBtIdIsNotNull() {
            addCriterion("bt_id is not null");
            return (Criteria) this;
        }

        public Criteria andBtIdEqualTo(String value) {
            addCriterion("bt_id =", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotEqualTo(String value) {
            addCriterion("bt_id <>", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThan(String value) {
            addCriterion("bt_id >", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThanOrEqualTo(String value) {
            addCriterion("bt_id >=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThan(String value) {
            addCriterion("bt_id <", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThanOrEqualTo(String value) {
            addCriterion("bt_id <=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLike(String value) {
            addCriterion("bt_id like", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotLike(String value) {
            addCriterion("bt_id not like", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdIn(List<String> values) {
            addCriterion("bt_id in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotIn(List<String> values) {
            addCriterion("bt_id not in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdBetween(String value1, String value2) {
            addCriterion("bt_id between", value1, value2, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotBetween(String value1, String value2) {
            addCriterion("bt_id not between", value1, value2, "btId");
            return (Criteria) this;
        }

        public Criteria andBtNameIsNull() {
            addCriterion("bt_name is null");
            return (Criteria) this;
        }

        public Criteria andBtNameIsNotNull() {
            addCriterion("bt_name is not null");
            return (Criteria) this;
        }

        public Criteria andBtNameEqualTo(String value) {
            addCriterion("bt_name =", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotEqualTo(String value) {
            addCriterion("bt_name <>", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameGreaterThan(String value) {
            addCriterion("bt_name >", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameGreaterThanOrEqualTo(String value) {
            addCriterion("bt_name >=", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLessThan(String value) {
            addCriterion("bt_name <", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLessThanOrEqualTo(String value) {
            addCriterion("bt_name <=", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLike(String value) {
            addCriterion("bt_name like", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotLike(String value) {
            addCriterion("bt_name not like", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameIn(List<String> values) {
            addCriterion("bt_name in", values, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotIn(List<String> values) {
            addCriterion("bt_name not in", values, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameBetween(String value1, String value2) {
            addCriterion("bt_name between", value1, value2, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotBetween(String value1, String value2) {
            addCriterion("bt_name not between", value1, value2, "btName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameIsNull() {
            addCriterion("bt_english_name is null");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameIsNotNull() {
            addCriterion("bt_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameEqualTo(String value) {
            addCriterion("bt_english_name =", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameNotEqualTo(String value) {
            addCriterion("bt_english_name <>", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameGreaterThan(String value) {
            addCriterion("bt_english_name >", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("bt_english_name >=", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameLessThan(String value) {
            addCriterion("bt_english_name <", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("bt_english_name <=", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameLike(String value) {
            addCriterion("bt_english_name like", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameNotLike(String value) {
            addCriterion("bt_english_name not like", value, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameIn(List<String> values) {
            addCriterion("bt_english_name in", values, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameNotIn(List<String> values) {
            addCriterion("bt_english_name not in", values, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameBetween(String value1, String value2) {
            addCriterion("bt_english_name between", value1, value2, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtEnglishNameNotBetween(String value1, String value2) {
            addCriterion("bt_english_name not between", value1, value2, "btEnglishName");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIsNull() {
            addCriterion("bt_remark is null");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIsNotNull() {
            addCriterion("bt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBtRemarkEqualTo(String value) {
            addCriterion("bt_remark =", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotEqualTo(String value) {
            addCriterion("bt_remark <>", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkGreaterThan(String value) {
            addCriterion("bt_remark >", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bt_remark >=", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLessThan(String value) {
            addCriterion("bt_remark <", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLessThanOrEqualTo(String value) {
            addCriterion("bt_remark <=", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLike(String value) {
            addCriterion("bt_remark like", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotLike(String value) {
            addCriterion("bt_remark not like", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIn(List<String> values) {
            addCriterion("bt_remark in", values, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotIn(List<String> values) {
            addCriterion("bt_remark not in", values, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkBetween(String value1, String value2) {
            addCriterion("bt_remark between", value1, value2, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotBetween(String value1, String value2) {
            addCriterion("bt_remark not between", value1, value2, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtAuditingIsNull() {
            addCriterion("bt_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andBtAuditingIsNotNull() {
            addCriterion("bt_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andBtAuditingEqualTo(String value) {
            addCriterion("bt_Auditing =", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingNotEqualTo(String value) {
            addCriterion("bt_Auditing <>", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingGreaterThan(String value) {
            addCriterion("bt_Auditing >", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("bt_Auditing >=", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingLessThan(String value) {
            addCriterion("bt_Auditing <", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingLessThanOrEqualTo(String value) {
            addCriterion("bt_Auditing <=", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingLike(String value) {
            addCriterion("bt_Auditing like", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingNotLike(String value) {
            addCriterion("bt_Auditing not like", value, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingIn(List<String> values) {
            addCriterion("bt_Auditing in", values, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingNotIn(List<String> values) {
            addCriterion("bt_Auditing not in", values, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingBetween(String value1, String value2) {
            addCriterion("bt_Auditing between", value1, value2, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtAuditingNotBetween(String value1, String value2) {
            addCriterion("bt_Auditing not between", value1, value2, "btAuditing");
            return (Criteria) this;
        }

        public Criteria andBtYnIsNull() {
            addCriterion("bt_yn is null");
            return (Criteria) this;
        }

        public Criteria andBtYnIsNotNull() {
            addCriterion("bt_yn is not null");
            return (Criteria) this;
        }

        public Criteria andBtYnEqualTo(String value) {
            addCriterion("bt_yn =", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnNotEqualTo(String value) {
            addCriterion("bt_yn <>", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnGreaterThan(String value) {
            addCriterion("bt_yn >", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnGreaterThanOrEqualTo(String value) {
            addCriterion("bt_yn >=", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnLessThan(String value) {
            addCriterion("bt_yn <", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnLessThanOrEqualTo(String value) {
            addCriterion("bt_yn <=", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnLike(String value) {
            addCriterion("bt_yn like", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnNotLike(String value) {
            addCriterion("bt_yn not like", value, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnIn(List<String> values) {
            addCriterion("bt_yn in", values, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnNotIn(List<String> values) {
            addCriterion("bt_yn not in", values, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnBetween(String value1, String value2) {
            addCriterion("bt_yn between", value1, value2, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtYnNotBetween(String value1, String value2) {
            addCriterion("bt_yn not between", value1, value2, "btYn");
            return (Criteria) this;
        }

        public Criteria andBtCustom1IsNull() {
            addCriterion("bt_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom1IsNotNull() {
            addCriterion("bt_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom1EqualTo(String value) {
            addCriterion("bt_custom1 =", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1NotEqualTo(String value) {
            addCriterion("bt_custom1 <>", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1GreaterThan(String value) {
            addCriterion("bt_custom1 >", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom1 >=", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1LessThan(String value) {
            addCriterion("bt_custom1 <", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1LessThanOrEqualTo(String value) {
            addCriterion("bt_custom1 <=", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1Like(String value) {
            addCriterion("bt_custom1 like", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1NotLike(String value) {
            addCriterion("bt_custom1 not like", value, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1In(List<String> values) {
            addCriterion("bt_custom1 in", values, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1NotIn(List<String> values) {
            addCriterion("bt_custom1 not in", values, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1Between(String value1, String value2) {
            addCriterion("bt_custom1 between", value1, value2, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom1NotBetween(String value1, String value2) {
            addCriterion("bt_custom1 not between", value1, value2, "btCustom1");
            return (Criteria) this;
        }

        public Criteria andBtCustom2IsNull() {
            addCriterion("bt_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom2IsNotNull() {
            addCriterion("bt_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom2EqualTo(String value) {
            addCriterion("bt_custom2 =", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2NotEqualTo(String value) {
            addCriterion("bt_custom2 <>", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2GreaterThan(String value) {
            addCriterion("bt_custom2 >", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom2 >=", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2LessThan(String value) {
            addCriterion("bt_custom2 <", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2LessThanOrEqualTo(String value) {
            addCriterion("bt_custom2 <=", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2Like(String value) {
            addCriterion("bt_custom2 like", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2NotLike(String value) {
            addCriterion("bt_custom2 not like", value, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2In(List<String> values) {
            addCriterion("bt_custom2 in", values, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2NotIn(List<String> values) {
            addCriterion("bt_custom2 not in", values, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2Between(String value1, String value2) {
            addCriterion("bt_custom2 between", value1, value2, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom2NotBetween(String value1, String value2) {
            addCriterion("bt_custom2 not between", value1, value2, "btCustom2");
            return (Criteria) this;
        }

        public Criteria andBtCustom3IsNull() {
            addCriterion("bt_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom3IsNotNull() {
            addCriterion("bt_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom3EqualTo(String value) {
            addCriterion("bt_custom3 =", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3NotEqualTo(String value) {
            addCriterion("bt_custom3 <>", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3GreaterThan(String value) {
            addCriterion("bt_custom3 >", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom3 >=", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3LessThan(String value) {
            addCriterion("bt_custom3 <", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3LessThanOrEqualTo(String value) {
            addCriterion("bt_custom3 <=", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3Like(String value) {
            addCriterion("bt_custom3 like", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3NotLike(String value) {
            addCriterion("bt_custom3 not like", value, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3In(List<String> values) {
            addCriterion("bt_custom3 in", values, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3NotIn(List<String> values) {
            addCriterion("bt_custom3 not in", values, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3Between(String value1, String value2) {
            addCriterion("bt_custom3 between", value1, value2, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom3NotBetween(String value1, String value2) {
            addCriterion("bt_custom3 not between", value1, value2, "btCustom3");
            return (Criteria) this;
        }

        public Criteria andBtCustom4IsNull() {
            addCriterion("bt_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom4IsNotNull() {
            addCriterion("bt_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom4EqualTo(String value) {
            addCriterion("bt_custom4 =", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4NotEqualTo(String value) {
            addCriterion("bt_custom4 <>", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4GreaterThan(String value) {
            addCriterion("bt_custom4 >", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom4 >=", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4LessThan(String value) {
            addCriterion("bt_custom4 <", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4LessThanOrEqualTo(String value) {
            addCriterion("bt_custom4 <=", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4Like(String value) {
            addCriterion("bt_custom4 like", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4NotLike(String value) {
            addCriterion("bt_custom4 not like", value, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4In(List<String> values) {
            addCriterion("bt_custom4 in", values, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4NotIn(List<String> values) {
            addCriterion("bt_custom4 not in", values, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4Between(String value1, String value2) {
            addCriterion("bt_custom4 between", value1, value2, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom4NotBetween(String value1, String value2) {
            addCriterion("bt_custom4 not between", value1, value2, "btCustom4");
            return (Criteria) this;
        }

        public Criteria andBtCustom5IsNull() {
            addCriterion("bt_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom5IsNotNull() {
            addCriterion("bt_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom5EqualTo(String value) {
            addCriterion("bt_custom5 =", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5NotEqualTo(String value) {
            addCriterion("bt_custom5 <>", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5GreaterThan(String value) {
            addCriterion("bt_custom5 >", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom5 >=", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5LessThan(String value) {
            addCriterion("bt_custom5 <", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5LessThanOrEqualTo(String value) {
            addCriterion("bt_custom5 <=", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5Like(String value) {
            addCriterion("bt_custom5 like", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5NotLike(String value) {
            addCriterion("bt_custom5 not like", value, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5In(List<String> values) {
            addCriterion("bt_custom5 in", values, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5NotIn(List<String> values) {
            addCriterion("bt_custom5 not in", values, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5Between(String value1, String value2) {
            addCriterion("bt_custom5 between", value1, value2, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom5NotBetween(String value1, String value2) {
            addCriterion("bt_custom5 not between", value1, value2, "btCustom5");
            return (Criteria) this;
        }

        public Criteria andBtCustom6IsNull() {
            addCriterion("bt_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andBtCustom6IsNotNull() {
            addCriterion("bt_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andBtCustom6EqualTo(String value) {
            addCriterion("bt_custom6 =", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6NotEqualTo(String value) {
            addCriterion("bt_custom6 <>", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6GreaterThan(String value) {
            addCriterion("bt_custom6 >", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("bt_custom6 >=", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6LessThan(String value) {
            addCriterion("bt_custom6 <", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6LessThanOrEqualTo(String value) {
            addCriterion("bt_custom6 <=", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6Like(String value) {
            addCriterion("bt_custom6 like", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6NotLike(String value) {
            addCriterion("bt_custom6 not like", value, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6In(List<String> values) {
            addCriterion("bt_custom6 in", values, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6NotIn(List<String> values) {
            addCriterion("bt_custom6 not in", values, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6Between(String value1, String value2) {
            addCriterion("bt_custom6 between", value1, value2, "btCustom6");
            return (Criteria) this;
        }

        public Criteria andBtCustom6NotBetween(String value1, String value2) {
            addCriterion("bt_custom6 not between", value1, value2, "btCustom6");
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