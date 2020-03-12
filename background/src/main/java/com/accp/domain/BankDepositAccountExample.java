package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class BankDepositAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDepositAccountExample() {
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

        public Criteria andAdaIdIsNull() {
            addCriterion("ada_id is null");
            return (Criteria) this;
        }

        public Criteria andAdaIdIsNotNull() {
            addCriterion("ada_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdaIdEqualTo(String value) {
            addCriterion("ada_id =", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotEqualTo(String value) {
            addCriterion("ada_id <>", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdGreaterThan(String value) {
            addCriterion("ada_id >", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ada_id >=", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLessThan(String value) {
            addCriterion("ada_id <", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLessThanOrEqualTo(String value) {
            addCriterion("ada_id <=", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLike(String value) {
            addCriterion("ada_id like", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotLike(String value) {
            addCriterion("ada_id not like", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdIn(List<String> values) {
            addCriterion("ada_id in", values, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotIn(List<String> values) {
            addCriterion("ada_id not in", values, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdBetween(String value1, String value2) {
            addCriterion("ada_id between", value1, value2, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotBetween(String value1, String value2) {
            addCriterion("ada_id not between", value1, value2, "adaId");
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressIsNull() {
            addCriterion("ada_bankaddress is null");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressIsNotNull() {
            addCriterion("ada_bankaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressEqualTo(String value) {
            addCriterion("ada_bankaddress =", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressNotEqualTo(String value) {
            addCriterion("ada_bankaddress <>", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressGreaterThan(String value) {
            addCriterion("ada_bankaddress >", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ada_bankaddress >=", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressLessThan(String value) {
            addCriterion("ada_bankaddress <", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressLessThanOrEqualTo(String value) {
            addCriterion("ada_bankaddress <=", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressLike(String value) {
            addCriterion("ada_bankaddress like", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressNotLike(String value) {
            addCriterion("ada_bankaddress not like", value, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressIn(List<String> values) {
            addCriterion("ada_bankaddress in", values, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressNotIn(List<String> values) {
            addCriterion("ada_bankaddress not in", values, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressBetween(String value1, String value2) {
            addCriterion("ada_bankaddress between", value1, value2, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaBankaddressNotBetween(String value1, String value2) {
            addCriterion("ada_bankaddress not between", value1, value2, "adaBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneIsNull() {
            addCriterion("ada_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneIsNotNull() {
            addCriterion("ada_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneEqualTo(String value) {
            addCriterion("ada_phone =", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneNotEqualTo(String value) {
            addCriterion("ada_phone <>", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneGreaterThan(String value) {
            addCriterion("ada_phone >", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ada_phone >=", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneLessThan(String value) {
            addCriterion("ada_phone <", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneLessThanOrEqualTo(String value) {
            addCriterion("ada_phone <=", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneLike(String value) {
            addCriterion("ada_phone like", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneNotLike(String value) {
            addCriterion("ada_phone not like", value, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneIn(List<String> values) {
            addCriterion("ada_phone in", values, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneNotIn(List<String> values) {
            addCriterion("ada_phone not in", values, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneBetween(String value1, String value2) {
            addCriterion("ada_phone between", value1, value2, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaPhoneNotBetween(String value1, String value2) {
            addCriterion("ada_phone not between", value1, value2, "adaPhone");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceIsNull() {
            addCriterion("ada_initialbalance is null");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceIsNotNull() {
            addCriterion("ada_initialbalance is not null");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceEqualTo(Float value) {
            addCriterion("ada_initialbalance =", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceNotEqualTo(Float value) {
            addCriterion("ada_initialbalance <>", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceGreaterThan(Float value) {
            addCriterion("ada_initialbalance >", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("ada_initialbalance >=", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceLessThan(Float value) {
            addCriterion("ada_initialbalance <", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceLessThanOrEqualTo(Float value) {
            addCriterion("ada_initialbalance <=", value, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceIn(List<Float> values) {
            addCriterion("ada_initialbalance in", values, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceNotIn(List<Float> values) {
            addCriterion("ada_initialbalance not in", values, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceBetween(Float value1, Float value2) {
            addCriterion("ada_initialbalance between", value1, value2, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaInitialbalanceNotBetween(Float value1, Float value2) {
            addCriterion("ada_initialbalance not between", value1, value2, "adaInitialbalance");
            return (Criteria) this;
        }

        public Criteria andAdaNameIsNull() {
            addCriterion("ada_name is null");
            return (Criteria) this;
        }

        public Criteria andAdaNameIsNotNull() {
            addCriterion("ada_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdaNameEqualTo(String value) {
            addCriterion("ada_name =", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameNotEqualTo(String value) {
            addCriterion("ada_name <>", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameGreaterThan(String value) {
            addCriterion("ada_name >", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameGreaterThanOrEqualTo(String value) {
            addCriterion("ada_name >=", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameLessThan(String value) {
            addCriterion("ada_name <", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameLessThanOrEqualTo(String value) {
            addCriterion("ada_name <=", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameLike(String value) {
            addCriterion("ada_name like", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameNotLike(String value) {
            addCriterion("ada_name not like", value, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameIn(List<String> values) {
            addCriterion("ada_name in", values, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameNotIn(List<String> values) {
            addCriterion("ada_name not in", values, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameBetween(String value1, String value2) {
            addCriterion("ada_name between", value1, value2, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaNameNotBetween(String value1, String value2) {
            addCriterion("ada_name not between", value1, value2, "adaName");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectIsNull() {
            addCriterion("ada_subject is null");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectIsNotNull() {
            addCriterion("ada_subject is not null");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectEqualTo(String value) {
            addCriterion("ada_subject =", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectNotEqualTo(String value) {
            addCriterion("ada_subject <>", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectGreaterThan(String value) {
            addCriterion("ada_subject >", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("ada_subject >=", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectLessThan(String value) {
            addCriterion("ada_subject <", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectLessThanOrEqualTo(String value) {
            addCriterion("ada_subject <=", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectLike(String value) {
            addCriterion("ada_subject like", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectNotLike(String value) {
            addCriterion("ada_subject not like", value, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectIn(List<String> values) {
            addCriterion("ada_subject in", values, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectNotIn(List<String> values) {
            addCriterion("ada_subject not in", values, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectBetween(String value1, String value2) {
            addCriterion("ada_subject between", value1, value2, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaSubjectNotBetween(String value1, String value2) {
            addCriterion("ada_subject not between", value1, value2, "adaSubject");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressIsNull() {
            addCriterion("\"ada_cyber bankaddress\" is null");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressIsNotNull() {
            addCriterion("\"ada_cyber bankaddress\" is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressEqualTo(String value) {
            addCriterion("\"ada_cyber bankaddress\" =", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressNotEqualTo(String value) {
            addCriterion("\"ada_cyber bankaddress\" <>", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressGreaterThan(String value) {
            addCriterion("\"ada_cyber bankaddress\" >", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressGreaterThanOrEqualTo(String value) {
            addCriterion("\"ada_cyber bankaddress\" >=", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressLessThan(String value) {
            addCriterion("\"ada_cyber bankaddress\" <", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressLessThanOrEqualTo(String value) {
            addCriterion("\"ada_cyber bankaddress\" <=", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressLike(String value) {
            addCriterion("\"ada_cyber bankaddress\" like", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressNotLike(String value) {
            addCriterion("\"ada_cyber bankaddress\" not like", value, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressIn(List<String> values) {
            addCriterion("\"ada_cyber bankaddress\" in", values, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressNotIn(List<String> values) {
            addCriterion("\"ada_cyber bankaddress\" not in", values, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressBetween(String value1, String value2) {
            addCriterion("\"ada_cyber bankaddress\" between", value1, value2, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaCyberBankaddressNotBetween(String value1, String value2) {
            addCriterion("\"ada_cyber bankaddress\" not between", value1, value2, "adaCyberBankaddress");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanIsNull() {
            addCriterion("ada_linkman is null");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanIsNotNull() {
            addCriterion("ada_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanEqualTo(String value) {
            addCriterion("ada_linkman =", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanNotEqualTo(String value) {
            addCriterion("ada_linkman <>", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanGreaterThan(String value) {
            addCriterion("ada_linkman >", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("ada_linkman >=", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanLessThan(String value) {
            addCriterion("ada_linkman <", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanLessThanOrEqualTo(String value) {
            addCriterion("ada_linkman <=", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanLike(String value) {
            addCriterion("ada_linkman like", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanNotLike(String value) {
            addCriterion("ada_linkman not like", value, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanIn(List<String> values) {
            addCriterion("ada_linkman in", values, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanNotIn(List<String> values) {
            addCriterion("ada_linkman not in", values, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanBetween(String value1, String value2) {
            addCriterion("ada_linkman between", value1, value2, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaLinkmanNotBetween(String value1, String value2) {
            addCriterion("ada_linkman not between", value1, value2, "adaLinkman");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceIsNull() {
            addCriterion("ada_currentbalance is null");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceIsNotNull() {
            addCriterion("ada_currentbalance is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceEqualTo(Float value) {
            addCriterion("ada_currentbalance =", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceNotEqualTo(Float value) {
            addCriterion("ada_currentbalance <>", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceGreaterThan(Float value) {
            addCriterion("ada_currentbalance >", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("ada_currentbalance >=", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceLessThan(Float value) {
            addCriterion("ada_currentbalance <", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceLessThanOrEqualTo(Float value) {
            addCriterion("ada_currentbalance <=", value, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceIn(List<Float> values) {
            addCriterion("ada_currentbalance in", values, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceNotIn(List<Float> values) {
            addCriterion("ada_currentbalance not in", values, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceBetween(Float value1, Float value2) {
            addCriterion("ada_currentbalance between", value1, value2, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaCurrentbalanceNotBetween(Float value1, Float value2) {
            addCriterion("ada_currentbalance not between", value1, value2, "adaCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkIsNull() {
            addCriterion("ada_remark is null");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkIsNotNull() {
            addCriterion("ada_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkEqualTo(String value) {
            addCriterion("ada_remark =", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkNotEqualTo(String value) {
            addCriterion("ada_remark <>", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkGreaterThan(String value) {
            addCriterion("ada_remark >", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ada_remark >=", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkLessThan(String value) {
            addCriterion("ada_remark <", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkLessThanOrEqualTo(String value) {
            addCriterion("ada_remark <=", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkLike(String value) {
            addCriterion("ada_remark like", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkNotLike(String value) {
            addCriterion("ada_remark not like", value, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkIn(List<String> values) {
            addCriterion("ada_remark in", values, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkNotIn(List<String> values) {
            addCriterion("ada_remark not in", values, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkBetween(String value1, String value2) {
            addCriterion("ada_remark between", value1, value2, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaRemarkNotBetween(String value1, String value2) {
            addCriterion("ada_remark not between", value1, value2, "adaRemark");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingIsNull() {
            addCriterion("ada_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingIsNotNull() {
            addCriterion("ada_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingEqualTo(String value) {
            addCriterion("ada_Auditing =", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingNotEqualTo(String value) {
            addCriterion("ada_Auditing <>", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingGreaterThan(String value) {
            addCriterion("ada_Auditing >", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ada_Auditing >=", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingLessThan(String value) {
            addCriterion("ada_Auditing <", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingLessThanOrEqualTo(String value) {
            addCriterion("ada_Auditing <=", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingLike(String value) {
            addCriterion("ada_Auditing like", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingNotLike(String value) {
            addCriterion("ada_Auditing not like", value, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingIn(List<String> values) {
            addCriterion("ada_Auditing in", values, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingNotIn(List<String> values) {
            addCriterion("ada_Auditing not in", values, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingBetween(String value1, String value2) {
            addCriterion("ada_Auditing between", value1, value2, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaAuditingNotBetween(String value1, String value2) {
            addCriterion("ada_Auditing not between", value1, value2, "adaAuditing");
            return (Criteria) this;
        }

        public Criteria andAdaYnIsNull() {
            addCriterion("ada_yn is null");
            return (Criteria) this;
        }

        public Criteria andAdaYnIsNotNull() {
            addCriterion("ada_yn is not null");
            return (Criteria) this;
        }

        public Criteria andAdaYnEqualTo(String value) {
            addCriterion("ada_yn =", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnNotEqualTo(String value) {
            addCriterion("ada_yn <>", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnGreaterThan(String value) {
            addCriterion("ada_yn >", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnGreaterThanOrEqualTo(String value) {
            addCriterion("ada_yn >=", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnLessThan(String value) {
            addCriterion("ada_yn <", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnLessThanOrEqualTo(String value) {
            addCriterion("ada_yn <=", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnLike(String value) {
            addCriterion("ada_yn like", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnNotLike(String value) {
            addCriterion("ada_yn not like", value, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnIn(List<String> values) {
            addCriterion("ada_yn in", values, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnNotIn(List<String> values) {
            addCriterion("ada_yn not in", values, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnBetween(String value1, String value2) {
            addCriterion("ada_yn between", value1, value2, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaYnNotBetween(String value1, String value2) {
            addCriterion("ada_yn not between", value1, value2, "adaYn");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1IsNull() {
            addCriterion("ada_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1IsNotNull() {
            addCriterion("ada_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1EqualTo(String value) {
            addCriterion("ada_custom1 =", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1NotEqualTo(String value) {
            addCriterion("ada_custom1 <>", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1GreaterThan(String value) {
            addCriterion("ada_custom1 >", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom1 >=", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1LessThan(String value) {
            addCriterion("ada_custom1 <", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1LessThanOrEqualTo(String value) {
            addCriterion("ada_custom1 <=", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1Like(String value) {
            addCriterion("ada_custom1 like", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1NotLike(String value) {
            addCriterion("ada_custom1 not like", value, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1In(List<String> values) {
            addCriterion("ada_custom1 in", values, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1NotIn(List<String> values) {
            addCriterion("ada_custom1 not in", values, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1Between(String value1, String value2) {
            addCriterion("ada_custom1 between", value1, value2, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom1NotBetween(String value1, String value2) {
            addCriterion("ada_custom1 not between", value1, value2, "adaCustom1");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2IsNull() {
            addCriterion("ada_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2IsNotNull() {
            addCriterion("ada_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2EqualTo(String value) {
            addCriterion("ada_custom2 =", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2NotEqualTo(String value) {
            addCriterion("ada_custom2 <>", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2GreaterThan(String value) {
            addCriterion("ada_custom2 >", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom2 >=", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2LessThan(String value) {
            addCriterion("ada_custom2 <", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2LessThanOrEqualTo(String value) {
            addCriterion("ada_custom2 <=", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2Like(String value) {
            addCriterion("ada_custom2 like", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2NotLike(String value) {
            addCriterion("ada_custom2 not like", value, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2In(List<String> values) {
            addCriterion("ada_custom2 in", values, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2NotIn(List<String> values) {
            addCriterion("ada_custom2 not in", values, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2Between(String value1, String value2) {
            addCriterion("ada_custom2 between", value1, value2, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom2NotBetween(String value1, String value2) {
            addCriterion("ada_custom2 not between", value1, value2, "adaCustom2");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3IsNull() {
            addCriterion("ada_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3IsNotNull() {
            addCriterion("ada_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3EqualTo(String value) {
            addCriterion("ada_custom3 =", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3NotEqualTo(String value) {
            addCriterion("ada_custom3 <>", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3GreaterThan(String value) {
            addCriterion("ada_custom3 >", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom3 >=", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3LessThan(String value) {
            addCriterion("ada_custom3 <", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3LessThanOrEqualTo(String value) {
            addCriterion("ada_custom3 <=", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3Like(String value) {
            addCriterion("ada_custom3 like", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3NotLike(String value) {
            addCriterion("ada_custom3 not like", value, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3In(List<String> values) {
            addCriterion("ada_custom3 in", values, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3NotIn(List<String> values) {
            addCriterion("ada_custom3 not in", values, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3Between(String value1, String value2) {
            addCriterion("ada_custom3 between", value1, value2, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom3NotBetween(String value1, String value2) {
            addCriterion("ada_custom3 not between", value1, value2, "adaCustom3");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4IsNull() {
            addCriterion("ada_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4IsNotNull() {
            addCriterion("ada_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4EqualTo(String value) {
            addCriterion("ada_custom4 =", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4NotEqualTo(String value) {
            addCriterion("ada_custom4 <>", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4GreaterThan(String value) {
            addCriterion("ada_custom4 >", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom4 >=", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4LessThan(String value) {
            addCriterion("ada_custom4 <", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4LessThanOrEqualTo(String value) {
            addCriterion("ada_custom4 <=", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4Like(String value) {
            addCriterion("ada_custom4 like", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4NotLike(String value) {
            addCriterion("ada_custom4 not like", value, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4In(List<String> values) {
            addCriterion("ada_custom4 in", values, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4NotIn(List<String> values) {
            addCriterion("ada_custom4 not in", values, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4Between(String value1, String value2) {
            addCriterion("ada_custom4 between", value1, value2, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom4NotBetween(String value1, String value2) {
            addCriterion("ada_custom4 not between", value1, value2, "adaCustom4");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5IsNull() {
            addCriterion("ada_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5IsNotNull() {
            addCriterion("ada_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5EqualTo(String value) {
            addCriterion("ada_custom5 =", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5NotEqualTo(String value) {
            addCriterion("ada_custom5 <>", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5GreaterThan(String value) {
            addCriterion("ada_custom5 >", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom5 >=", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5LessThan(String value) {
            addCriterion("ada_custom5 <", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5LessThanOrEqualTo(String value) {
            addCriterion("ada_custom5 <=", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5Like(String value) {
            addCriterion("ada_custom5 like", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5NotLike(String value) {
            addCriterion("ada_custom5 not like", value, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5In(List<String> values) {
            addCriterion("ada_custom5 in", values, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5NotIn(List<String> values) {
            addCriterion("ada_custom5 not in", values, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5Between(String value1, String value2) {
            addCriterion("ada_custom5 between", value1, value2, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom5NotBetween(String value1, String value2) {
            addCriterion("ada_custom5 not between", value1, value2, "adaCustom5");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6IsNull() {
            addCriterion("ada_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6IsNotNull() {
            addCriterion("ada_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6EqualTo(String value) {
            addCriterion("ada_custom6 =", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6NotEqualTo(String value) {
            addCriterion("ada_custom6 <>", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6GreaterThan(String value) {
            addCriterion("ada_custom6 >", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ada_custom6 >=", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6LessThan(String value) {
            addCriterion("ada_custom6 <", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6LessThanOrEqualTo(String value) {
            addCriterion("ada_custom6 <=", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6Like(String value) {
            addCriterion("ada_custom6 like", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6NotLike(String value) {
            addCriterion("ada_custom6 not like", value, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6In(List<String> values) {
            addCriterion("ada_custom6 in", values, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6NotIn(List<String> values) {
            addCriterion("ada_custom6 not in", values, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6Between(String value1, String value2) {
            addCriterion("ada_custom6 between", value1, value2, "adaCustom6");
            return (Criteria) this;
        }

        public Criteria andAdaCustom6NotBetween(String value1, String value2) {
            addCriterion("ada_custom6 not between", value1, value2, "adaCustom6");
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