package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CashaCcountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashaCcountExample() {
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

        public Criteria andCcIdIsNull() {
            addCriterion("cc_id is null");
            return (Criteria) this;
        }

        public Criteria andCcIdIsNotNull() {
            addCriterion("cc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcIdEqualTo(String value) {
            addCriterion("cc_id =", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotEqualTo(String value) {
            addCriterion("cc_id <>", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThan(String value) {
            addCriterion("cc_id >", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThanOrEqualTo(String value) {
            addCriterion("cc_id >=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThan(String value) {
            addCriterion("cc_id <", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThanOrEqualTo(String value) {
            addCriterion("cc_id <=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLike(String value) {
            addCriterion("cc_id like", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotLike(String value) {
            addCriterion("cc_id not like", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdIn(List<String> values) {
            addCriterion("cc_id in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotIn(List<String> values) {
            addCriterion("cc_id not in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdBetween(String value1, String value2) {
            addCriterion("cc_id between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotBetween(String value1, String value2) {
            addCriterion("cc_id not between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNull() {
            addCriterion("cc_name is null");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNotNull() {
            addCriterion("cc_name is not null");
            return (Criteria) this;
        }

        public Criteria andCcNameEqualTo(String value) {
            addCriterion("cc_name =", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotEqualTo(String value) {
            addCriterion("cc_name <>", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThan(String value) {
            addCriterion("cc_name >", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThanOrEqualTo(String value) {
            addCriterion("cc_name >=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThan(String value) {
            addCriterion("cc_name <", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThanOrEqualTo(String value) {
            addCriterion("cc_name <=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLike(String value) {
            addCriterion("cc_name like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotLike(String value) {
            addCriterion("cc_name not like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameIn(List<String> values) {
            addCriterion("cc_name in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotIn(List<String> values) {
            addCriterion("cc_name not in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameBetween(String value1, String value2) {
            addCriterion("cc_name between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotBetween(String value1, String value2) {
            addCriterion("cc_name not between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCcSubjectIsNull() {
            addCriterion("cc_subject is null");
            return (Criteria) this;
        }

        public Criteria andCcSubjectIsNotNull() {
            addCriterion("cc_subject is not null");
            return (Criteria) this;
        }

        public Criteria andCcSubjectEqualTo(String value) {
            addCriterion("cc_subject =", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectNotEqualTo(String value) {
            addCriterion("cc_subject <>", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectGreaterThan(String value) {
            addCriterion("cc_subject >", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("cc_subject >=", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectLessThan(String value) {
            addCriterion("cc_subject <", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectLessThanOrEqualTo(String value) {
            addCriterion("cc_subject <=", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectLike(String value) {
            addCriterion("cc_subject like", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectNotLike(String value) {
            addCriterion("cc_subject not like", value, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectIn(List<String> values) {
            addCriterion("cc_subject in", values, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectNotIn(List<String> values) {
            addCriterion("cc_subject not in", values, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectBetween(String value1, String value2) {
            addCriterion("cc_subject between", value1, value2, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcSubjectNotBetween(String value1, String value2) {
            addCriterion("cc_subject not between", value1, value2, "ccSubject");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceIsNull() {
            addCriterion("cc_initialbalance is null");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceIsNotNull() {
            addCriterion("cc_initialbalance is not null");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceEqualTo(Float value) {
            addCriterion("cc_initialbalance =", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceNotEqualTo(Float value) {
            addCriterion("cc_initialbalance <>", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceGreaterThan(Float value) {
            addCriterion("cc_initialbalance >", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("cc_initialbalance >=", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceLessThan(Float value) {
            addCriterion("cc_initialbalance <", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceLessThanOrEqualTo(Float value) {
            addCriterion("cc_initialbalance <=", value, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceIn(List<Float> values) {
            addCriterion("cc_initialbalance in", values, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceNotIn(List<Float> values) {
            addCriterion("cc_initialbalance not in", values, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceBetween(Float value1, Float value2) {
            addCriterion("cc_initialbalance between", value1, value2, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcInitialbalanceNotBetween(Float value1, Float value2) {
            addCriterion("cc_initialbalance not between", value1, value2, "ccInitialbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceIsNull() {
            addCriterion("cc_currentbalance is null");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceIsNotNull() {
            addCriterion("cc_currentbalance is not null");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceEqualTo(Float value) {
            addCriterion("cc_currentbalance =", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceNotEqualTo(Float value) {
            addCriterion("cc_currentbalance <>", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceGreaterThan(Float value) {
            addCriterion("cc_currentbalance >", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("cc_currentbalance >=", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceLessThan(Float value) {
            addCriterion("cc_currentbalance <", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceLessThanOrEqualTo(Float value) {
            addCriterion("cc_currentbalance <=", value, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceIn(List<Float> values) {
            addCriterion("cc_currentbalance in", values, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceNotIn(List<Float> values) {
            addCriterion("cc_currentbalance not in", values, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceBetween(Float value1, Float value2) {
            addCriterion("cc_currentbalance between", value1, value2, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcCurrentbalanceNotBetween(Float value1, Float value2) {
            addCriterion("cc_currentbalance not between", value1, value2, "ccCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andCcRemarkIsNull() {
            addCriterion("cc_remark is null");
            return (Criteria) this;
        }

        public Criteria andCcRemarkIsNotNull() {
            addCriterion("cc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCcRemarkEqualTo(String value) {
            addCriterion("cc_remark =", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkNotEqualTo(String value) {
            addCriterion("cc_remark <>", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkGreaterThan(String value) {
            addCriterion("cc_remark >", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cc_remark >=", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkLessThan(String value) {
            addCriterion("cc_remark <", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkLessThanOrEqualTo(String value) {
            addCriterion("cc_remark <=", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkLike(String value) {
            addCriterion("cc_remark like", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkNotLike(String value) {
            addCriterion("cc_remark not like", value, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkIn(List<String> values) {
            addCriterion("cc_remark in", values, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkNotIn(List<String> values) {
            addCriterion("cc_remark not in", values, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkBetween(String value1, String value2) {
            addCriterion("cc_remark between", value1, value2, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcRemarkNotBetween(String value1, String value2) {
            addCriterion("cc_remark not between", value1, value2, "ccRemark");
            return (Criteria) this;
        }

        public Criteria andCcAuditingIsNull() {
            addCriterion("cc_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCcAuditingIsNotNull() {
            addCriterion("cc_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCcAuditingEqualTo(String value) {
            addCriterion("cc_Auditing =", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingNotEqualTo(String value) {
            addCriterion("cc_Auditing <>", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingGreaterThan(String value) {
            addCriterion("cc_Auditing >", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cc_Auditing >=", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingLessThan(String value) {
            addCriterion("cc_Auditing <", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingLessThanOrEqualTo(String value) {
            addCriterion("cc_Auditing <=", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingLike(String value) {
            addCriterion("cc_Auditing like", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingNotLike(String value) {
            addCriterion("cc_Auditing not like", value, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingIn(List<String> values) {
            addCriterion("cc_Auditing in", values, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingNotIn(List<String> values) {
            addCriterion("cc_Auditing not in", values, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingBetween(String value1, String value2) {
            addCriterion("cc_Auditing between", value1, value2, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcAuditingNotBetween(String value1, String value2) {
            addCriterion("cc_Auditing not between", value1, value2, "ccAuditing");
            return (Criteria) this;
        }

        public Criteria andCcYnIsNull() {
            addCriterion("cc_yn is null");
            return (Criteria) this;
        }

        public Criteria andCcYnIsNotNull() {
            addCriterion("cc_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCcYnEqualTo(String value) {
            addCriterion("cc_yn =", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnNotEqualTo(String value) {
            addCriterion("cc_yn <>", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnGreaterThan(String value) {
            addCriterion("cc_yn >", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnGreaterThanOrEqualTo(String value) {
            addCriterion("cc_yn >=", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnLessThan(String value) {
            addCriterion("cc_yn <", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnLessThanOrEqualTo(String value) {
            addCriterion("cc_yn <=", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnLike(String value) {
            addCriterion("cc_yn like", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnNotLike(String value) {
            addCriterion("cc_yn not like", value, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnIn(List<String> values) {
            addCriterion("cc_yn in", values, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnNotIn(List<String> values) {
            addCriterion("cc_yn not in", values, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnBetween(String value1, String value2) {
            addCriterion("cc_yn between", value1, value2, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcYnNotBetween(String value1, String value2) {
            addCriterion("cc_yn not between", value1, value2, "ccYn");
            return (Criteria) this;
        }

        public Criteria andCcCustom1IsNull() {
            addCriterion("cc_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom1IsNotNull() {
            addCriterion("cc_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom1EqualTo(String value) {
            addCriterion("cc_custom1 =", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1NotEqualTo(String value) {
            addCriterion("cc_custom1 <>", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1GreaterThan(String value) {
            addCriterion("cc_custom1 >", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom1 >=", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1LessThan(String value) {
            addCriterion("cc_custom1 <", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1LessThanOrEqualTo(String value) {
            addCriterion("cc_custom1 <=", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1Like(String value) {
            addCriterion("cc_custom1 like", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1NotLike(String value) {
            addCriterion("cc_custom1 not like", value, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1In(List<String> values) {
            addCriterion("cc_custom1 in", values, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1NotIn(List<String> values) {
            addCriterion("cc_custom1 not in", values, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1Between(String value1, String value2) {
            addCriterion("cc_custom1 between", value1, value2, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom1NotBetween(String value1, String value2) {
            addCriterion("cc_custom1 not between", value1, value2, "ccCustom1");
            return (Criteria) this;
        }

        public Criteria andCcCustom2IsNull() {
            addCriterion("cc_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom2IsNotNull() {
            addCriterion("cc_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom2EqualTo(String value) {
            addCriterion("cc_custom2 =", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2NotEqualTo(String value) {
            addCriterion("cc_custom2 <>", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2GreaterThan(String value) {
            addCriterion("cc_custom2 >", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom2 >=", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2LessThan(String value) {
            addCriterion("cc_custom2 <", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2LessThanOrEqualTo(String value) {
            addCriterion("cc_custom2 <=", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2Like(String value) {
            addCriterion("cc_custom2 like", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2NotLike(String value) {
            addCriterion("cc_custom2 not like", value, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2In(List<String> values) {
            addCriterion("cc_custom2 in", values, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2NotIn(List<String> values) {
            addCriterion("cc_custom2 not in", values, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2Between(String value1, String value2) {
            addCriterion("cc_custom2 between", value1, value2, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom2NotBetween(String value1, String value2) {
            addCriterion("cc_custom2 not between", value1, value2, "ccCustom2");
            return (Criteria) this;
        }

        public Criteria andCcCustom3IsNull() {
            addCriterion("cc_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom3IsNotNull() {
            addCriterion("cc_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom3EqualTo(String value) {
            addCriterion("cc_custom3 =", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3NotEqualTo(String value) {
            addCriterion("cc_custom3 <>", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3GreaterThan(String value) {
            addCriterion("cc_custom3 >", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom3 >=", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3LessThan(String value) {
            addCriterion("cc_custom3 <", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3LessThanOrEqualTo(String value) {
            addCriterion("cc_custom3 <=", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3Like(String value) {
            addCriterion("cc_custom3 like", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3NotLike(String value) {
            addCriterion("cc_custom3 not like", value, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3In(List<String> values) {
            addCriterion("cc_custom3 in", values, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3NotIn(List<String> values) {
            addCriterion("cc_custom3 not in", values, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3Between(String value1, String value2) {
            addCriterion("cc_custom3 between", value1, value2, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom3NotBetween(String value1, String value2) {
            addCriterion("cc_custom3 not between", value1, value2, "ccCustom3");
            return (Criteria) this;
        }

        public Criteria andCcCustom4IsNull() {
            addCriterion("cc_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom4IsNotNull() {
            addCriterion("cc_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom4EqualTo(String value) {
            addCriterion("cc_custom4 =", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4NotEqualTo(String value) {
            addCriterion("cc_custom4 <>", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4GreaterThan(String value) {
            addCriterion("cc_custom4 >", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom4 >=", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4LessThan(String value) {
            addCriterion("cc_custom4 <", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4LessThanOrEqualTo(String value) {
            addCriterion("cc_custom4 <=", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4Like(String value) {
            addCriterion("cc_custom4 like", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4NotLike(String value) {
            addCriterion("cc_custom4 not like", value, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4In(List<String> values) {
            addCriterion("cc_custom4 in", values, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4NotIn(List<String> values) {
            addCriterion("cc_custom4 not in", values, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4Between(String value1, String value2) {
            addCriterion("cc_custom4 between", value1, value2, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom4NotBetween(String value1, String value2) {
            addCriterion("cc_custom4 not between", value1, value2, "ccCustom4");
            return (Criteria) this;
        }

        public Criteria andCcCustom5IsNull() {
            addCriterion("cc_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom5IsNotNull() {
            addCriterion("cc_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom5EqualTo(String value) {
            addCriterion("cc_custom5 =", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5NotEqualTo(String value) {
            addCriterion("cc_custom5 <>", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5GreaterThan(String value) {
            addCriterion("cc_custom5 >", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom5 >=", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5LessThan(String value) {
            addCriterion("cc_custom5 <", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5LessThanOrEqualTo(String value) {
            addCriterion("cc_custom5 <=", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5Like(String value) {
            addCriterion("cc_custom5 like", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5NotLike(String value) {
            addCriterion("cc_custom5 not like", value, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5In(List<String> values) {
            addCriterion("cc_custom5 in", values, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5NotIn(List<String> values) {
            addCriterion("cc_custom5 not in", values, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5Between(String value1, String value2) {
            addCriterion("cc_custom5 between", value1, value2, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom5NotBetween(String value1, String value2) {
            addCriterion("cc_custom5 not between", value1, value2, "ccCustom5");
            return (Criteria) this;
        }

        public Criteria andCcCustom6IsNull() {
            addCriterion("cc_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCcCustom6IsNotNull() {
            addCriterion("cc_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCcCustom6EqualTo(String value) {
            addCriterion("cc_custom6 =", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6NotEqualTo(String value) {
            addCriterion("cc_custom6 <>", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6GreaterThan(String value) {
            addCriterion("cc_custom6 >", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cc_custom6 >=", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6LessThan(String value) {
            addCriterion("cc_custom6 <", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6LessThanOrEqualTo(String value) {
            addCriterion("cc_custom6 <=", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6Like(String value) {
            addCriterion("cc_custom6 like", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6NotLike(String value) {
            addCriterion("cc_custom6 not like", value, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6In(List<String> values) {
            addCriterion("cc_custom6 in", values, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6NotIn(List<String> values) {
            addCriterion("cc_custom6 not in", values, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6Between(String value1, String value2) {
            addCriterion("cc_custom6 between", value1, value2, "ccCustom6");
            return (Criteria) this;
        }

        public Criteria andCcCustom6NotBetween(String value1, String value2) {
            addCriterion("cc_custom6 not between", value1, value2, "ccCustom6");
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