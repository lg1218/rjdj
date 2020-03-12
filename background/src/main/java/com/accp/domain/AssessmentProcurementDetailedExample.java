package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AssessmentProcurementDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessmentProcurementDetailedExample() {
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

        public Criteria andApdIdIsNull() {
            addCriterion("apd_id is null");
            return (Criteria) this;
        }

        public Criteria andApdIdIsNotNull() {
            addCriterion("apd_id is not null");
            return (Criteria) this;
        }

        public Criteria andApdIdEqualTo(String value) {
            addCriterion("apd_id =", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdNotEqualTo(String value) {
            addCriterion("apd_id <>", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdGreaterThan(String value) {
            addCriterion("apd_id >", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdGreaterThanOrEqualTo(String value) {
            addCriterion("apd_id >=", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdLessThan(String value) {
            addCriterion("apd_id <", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdLessThanOrEqualTo(String value) {
            addCriterion("apd_id <=", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdLike(String value) {
            addCriterion("apd_id like", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdNotLike(String value) {
            addCriterion("apd_id not like", value, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdIn(List<String> values) {
            addCriterion("apd_id in", values, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdNotIn(List<String> values) {
            addCriterion("apd_id not in", values, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdBetween(String value1, String value2) {
            addCriterion("apd_id between", value1, value2, "apdId");
            return (Criteria) this;
        }

        public Criteria andApdIdNotBetween(String value1, String value2) {
            addCriterion("apd_id not between", value1, value2, "apdId");
            return (Criteria) this;
        }

        public Criteria andApIdIsNull() {
            addCriterion("ap_id is null");
            return (Criteria) this;
        }

        public Criteria andApIdIsNotNull() {
            addCriterion("ap_id is not null");
            return (Criteria) this;
        }

        public Criteria andApIdEqualTo(String value) {
            addCriterion("ap_id =", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotEqualTo(String value) {
            addCriterion("ap_id <>", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThan(String value) {
            addCriterion("ap_id >", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThanOrEqualTo(String value) {
            addCriterion("ap_id >=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThan(String value) {
            addCriterion("ap_id <", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThanOrEqualTo(String value) {
            addCriterion("ap_id <=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLike(String value) {
            addCriterion("ap_id like", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotLike(String value) {
            addCriterion("ap_id not like", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdIn(List<String> values) {
            addCriterion("ap_id in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotIn(List<String> values) {
            addCriterion("ap_id not in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdBetween(String value1, String value2) {
            addCriterion("ap_id between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotBetween(String value1, String value2) {
            addCriterion("ap_id not between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdIsNull() {
            addCriterion("apd_ict_id is null");
            return (Criteria) this;
        }

        public Criteria andApdIctIdIsNotNull() {
            addCriterion("apd_ict_id is not null");
            return (Criteria) this;
        }

        public Criteria andApdIctIdEqualTo(String value) {
            addCriterion("apd_ict_id =", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdNotEqualTo(String value) {
            addCriterion("apd_ict_id <>", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdGreaterThan(String value) {
            addCriterion("apd_ict_id >", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdGreaterThanOrEqualTo(String value) {
            addCriterion("apd_ict_id >=", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdLessThan(String value) {
            addCriterion("apd_ict_id <", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdLessThanOrEqualTo(String value) {
            addCriterion("apd_ict_id <=", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdLike(String value) {
            addCriterion("apd_ict_id like", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdNotLike(String value) {
            addCriterion("apd_ict_id not like", value, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdIn(List<String> values) {
            addCriterion("apd_ict_id in", values, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdNotIn(List<String> values) {
            addCriterion("apd_ict_id not in", values, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdBetween(String value1, String value2) {
            addCriterion("apd_ict_id between", value1, value2, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctIdNotBetween(String value1, String value2) {
            addCriterion("apd_ict_id not between", value1, value2, "apdIctId");
            return (Criteria) this;
        }

        public Criteria andApdIctNameIsNull() {
            addCriterion("apd_ict_name is null");
            return (Criteria) this;
        }

        public Criteria andApdIctNameIsNotNull() {
            addCriterion("apd_ict_name is not null");
            return (Criteria) this;
        }

        public Criteria andApdIctNameEqualTo(String value) {
            addCriterion("apd_ict_name =", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameNotEqualTo(String value) {
            addCriterion("apd_ict_name <>", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameGreaterThan(String value) {
            addCriterion("apd_ict_name >", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameGreaterThanOrEqualTo(String value) {
            addCriterion("apd_ict_name >=", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameLessThan(String value) {
            addCriterion("apd_ict_name <", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameLessThanOrEqualTo(String value) {
            addCriterion("apd_ict_name <=", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameLike(String value) {
            addCriterion("apd_ict_name like", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameNotLike(String value) {
            addCriterion("apd_ict_name not like", value, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameIn(List<String> values) {
            addCriterion("apd_ict_name in", values, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameNotIn(List<String> values) {
            addCriterion("apd_ict_name not in", values, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameBetween(String value1, String value2) {
            addCriterion("apd_ict_name between", value1, value2, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdIctNameNotBetween(String value1, String value2) {
            addCriterion("apd_ict_name not between", value1, value2, "apdIctName");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdIsNull() {
            addCriterion("apd_currency_id is null");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdIsNotNull() {
            addCriterion("apd_currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdEqualTo(String value) {
            addCriterion("apd_currency_id =", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdNotEqualTo(String value) {
            addCriterion("apd_currency_id <>", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdGreaterThan(String value) {
            addCriterion("apd_currency_id >", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apd_currency_id >=", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdLessThan(String value) {
            addCriterion("apd_currency_id <", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("apd_currency_id <=", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdLike(String value) {
            addCriterion("apd_currency_id like", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdNotLike(String value) {
            addCriterion("apd_currency_id not like", value, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdIn(List<String> values) {
            addCriterion("apd_currency_id in", values, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdNotIn(List<String> values) {
            addCriterion("apd_currency_id not in", values, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdBetween(String value1, String value2) {
            addCriterion("apd_currency_id between", value1, value2, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("apd_currency_id not between", value1, value2, "apdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateIsNull() {
            addCriterion("apd_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateIsNotNull() {
            addCriterion("apd_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateEqualTo(Float value) {
            addCriterion("apd_exchange_rate =", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateNotEqualTo(Float value) {
            addCriterion("apd_exchange_rate <>", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateGreaterThan(Float value) {
            addCriterion("apd_exchange_rate >", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("apd_exchange_rate >=", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateLessThan(Float value) {
            addCriterion("apd_exchange_rate <", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("apd_exchange_rate <=", value, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateIn(List<Float> values) {
            addCriterion("apd_exchange_rate in", values, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateNotIn(List<Float> values) {
            addCriterion("apd_exchange_rate not in", values, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateBetween(Float value1, Float value2) {
            addCriterion("apd_exchange_rate between", value1, value2, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("apd_exchange_rate not between", value1, value2, "apdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIsNull() {
            addCriterion("apd_money is null");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIsNotNull() {
            addCriterion("apd_money is not null");
            return (Criteria) this;
        }

        public Criteria andApdMoneyEqualTo(Integer value) {
            addCriterion("apd_money =", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotEqualTo(Integer value) {
            addCriterion("apd_money <>", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyGreaterThan(Integer value) {
            addCriterion("apd_money >", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("apd_money >=", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyLessThan(Integer value) {
            addCriterion("apd_money <", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("apd_money <=", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIn(List<Integer> values) {
            addCriterion("apd_money in", values, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotIn(List<Integer> values) {
            addCriterion("apd_money not in", values, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyBetween(Integer value1, Integer value2) {
            addCriterion("apd_money between", value1, value2, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("apd_money not between", value1, value2, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyIsNull() {
            addCriterion("apd_amount_standard_currency is null");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyIsNotNull() {
            addCriterion("apd_amount_standard_currency is not null");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyEqualTo(Float value) {
            addCriterion("apd_amount_standard_currency =", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyNotEqualTo(Float value) {
            addCriterion("apd_amount_standard_currency <>", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyGreaterThan(Float value) {
            addCriterion("apd_amount_standard_currency >", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyGreaterThanOrEqualTo(Float value) {
            addCriterion("apd_amount_standard_currency >=", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyLessThan(Float value) {
            addCriterion("apd_amount_standard_currency <", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyLessThanOrEqualTo(Float value) {
            addCriterion("apd_amount_standard_currency <=", value, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyIn(List<Float> values) {
            addCriterion("apd_amount_standard_currency in", values, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyNotIn(List<Float> values) {
            addCriterion("apd_amount_standard_currency not in", values, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyBetween(Float value1, Float value2) {
            addCriterion("apd_amount_standard_currency between", value1, value2, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAmountStandardCurrencyNotBetween(Float value1, Float value2) {
            addCriterion("apd_amount_standard_currency not between", value1, value2, "apdAmountStandardCurrency");
            return (Criteria) this;
        }

        public Criteria andApdAuditionIsNull() {
            addCriterion("apd_audition is null");
            return (Criteria) this;
        }

        public Criteria andApdAuditionIsNotNull() {
            addCriterion("apd_audition is not null");
            return (Criteria) this;
        }

        public Criteria andApdAuditionEqualTo(String value) {
            addCriterion("apd_audition =", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionNotEqualTo(String value) {
            addCriterion("apd_audition <>", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionGreaterThan(String value) {
            addCriterion("apd_audition >", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("apd_audition >=", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionLessThan(String value) {
            addCriterion("apd_audition <", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionLessThanOrEqualTo(String value) {
            addCriterion("apd_audition <=", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionLike(String value) {
            addCriterion("apd_audition like", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionNotLike(String value) {
            addCriterion("apd_audition not like", value, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionIn(List<String> values) {
            addCriterion("apd_audition in", values, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionNotIn(List<String> values) {
            addCriterion("apd_audition not in", values, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionBetween(String value1, String value2) {
            addCriterion("apd_audition between", value1, value2, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdAuditionNotBetween(String value1, String value2) {
            addCriterion("apd_audition not between", value1, value2, "apdAudition");
            return (Criteria) this;
        }

        public Criteria andApdYnIsNull() {
            addCriterion("apd_yn is null");
            return (Criteria) this;
        }

        public Criteria andApdYnIsNotNull() {
            addCriterion("apd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andApdYnEqualTo(String value) {
            addCriterion("apd_yn =", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnNotEqualTo(String value) {
            addCriterion("apd_yn <>", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnGreaterThan(String value) {
            addCriterion("apd_yn >", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnGreaterThanOrEqualTo(String value) {
            addCriterion("apd_yn >=", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnLessThan(String value) {
            addCriterion("apd_yn <", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnLessThanOrEqualTo(String value) {
            addCriterion("apd_yn <=", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnLike(String value) {
            addCriterion("apd_yn like", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnNotLike(String value) {
            addCriterion("apd_yn not like", value, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnIn(List<String> values) {
            addCriterion("apd_yn in", values, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnNotIn(List<String> values) {
            addCriterion("apd_yn not in", values, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnBetween(String value1, String value2) {
            addCriterion("apd_yn between", value1, value2, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdYnNotBetween(String value1, String value2) {
            addCriterion("apd_yn not between", value1, value2, "apdYn");
            return (Criteria) this;
        }

        public Criteria andApdCustom1IsNull() {
            addCriterion("apd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom1IsNotNull() {
            addCriterion("apd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom1EqualTo(String value) {
            addCriterion("apd_custom1 =", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1NotEqualTo(String value) {
            addCriterion("apd_custom1 <>", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1GreaterThan(String value) {
            addCriterion("apd_custom1 >", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom1 >=", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1LessThan(String value) {
            addCriterion("apd_custom1 <", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1LessThanOrEqualTo(String value) {
            addCriterion("apd_custom1 <=", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1Like(String value) {
            addCriterion("apd_custom1 like", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1NotLike(String value) {
            addCriterion("apd_custom1 not like", value, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1In(List<String> values) {
            addCriterion("apd_custom1 in", values, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1NotIn(List<String> values) {
            addCriterion("apd_custom1 not in", values, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1Between(String value1, String value2) {
            addCriterion("apd_custom1 between", value1, value2, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom1NotBetween(String value1, String value2) {
            addCriterion("apd_custom1 not between", value1, value2, "apdCustom1");
            return (Criteria) this;
        }

        public Criteria andApdCustom2IsNull() {
            addCriterion("apd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom2IsNotNull() {
            addCriterion("apd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom2EqualTo(String value) {
            addCriterion("apd_custom2 =", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2NotEqualTo(String value) {
            addCriterion("apd_custom2 <>", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2GreaterThan(String value) {
            addCriterion("apd_custom2 >", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom2 >=", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2LessThan(String value) {
            addCriterion("apd_custom2 <", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2LessThanOrEqualTo(String value) {
            addCriterion("apd_custom2 <=", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2Like(String value) {
            addCriterion("apd_custom2 like", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2NotLike(String value) {
            addCriterion("apd_custom2 not like", value, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2In(List<String> values) {
            addCriterion("apd_custom2 in", values, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2NotIn(List<String> values) {
            addCriterion("apd_custom2 not in", values, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2Between(String value1, String value2) {
            addCriterion("apd_custom2 between", value1, value2, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom2NotBetween(String value1, String value2) {
            addCriterion("apd_custom2 not between", value1, value2, "apdCustom2");
            return (Criteria) this;
        }

        public Criteria andApdCustom3IsNull() {
            addCriterion("apd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom3IsNotNull() {
            addCriterion("apd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom3EqualTo(String value) {
            addCriterion("apd_custom3 =", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3NotEqualTo(String value) {
            addCriterion("apd_custom3 <>", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3GreaterThan(String value) {
            addCriterion("apd_custom3 >", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom3 >=", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3LessThan(String value) {
            addCriterion("apd_custom3 <", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3LessThanOrEqualTo(String value) {
            addCriterion("apd_custom3 <=", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3Like(String value) {
            addCriterion("apd_custom3 like", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3NotLike(String value) {
            addCriterion("apd_custom3 not like", value, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3In(List<String> values) {
            addCriterion("apd_custom3 in", values, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3NotIn(List<String> values) {
            addCriterion("apd_custom3 not in", values, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3Between(String value1, String value2) {
            addCriterion("apd_custom3 between", value1, value2, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom3NotBetween(String value1, String value2) {
            addCriterion("apd_custom3 not between", value1, value2, "apdCustom3");
            return (Criteria) this;
        }

        public Criteria andApdCustom4IsNull() {
            addCriterion("apd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom4IsNotNull() {
            addCriterion("apd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom4EqualTo(String value) {
            addCriterion("apd_custom4 =", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4NotEqualTo(String value) {
            addCriterion("apd_custom4 <>", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4GreaterThan(String value) {
            addCriterion("apd_custom4 >", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom4 >=", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4LessThan(String value) {
            addCriterion("apd_custom4 <", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4LessThanOrEqualTo(String value) {
            addCriterion("apd_custom4 <=", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4Like(String value) {
            addCriterion("apd_custom4 like", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4NotLike(String value) {
            addCriterion("apd_custom4 not like", value, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4In(List<String> values) {
            addCriterion("apd_custom4 in", values, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4NotIn(List<String> values) {
            addCriterion("apd_custom4 not in", values, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4Between(String value1, String value2) {
            addCriterion("apd_custom4 between", value1, value2, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom4NotBetween(String value1, String value2) {
            addCriterion("apd_custom4 not between", value1, value2, "apdCustom4");
            return (Criteria) this;
        }

        public Criteria andApdCustom5IsNull() {
            addCriterion("apd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom5IsNotNull() {
            addCriterion("apd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom5EqualTo(String value) {
            addCriterion("apd_custom5 =", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5NotEqualTo(String value) {
            addCriterion("apd_custom5 <>", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5GreaterThan(String value) {
            addCriterion("apd_custom5 >", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom5 >=", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5LessThan(String value) {
            addCriterion("apd_custom5 <", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5LessThanOrEqualTo(String value) {
            addCriterion("apd_custom5 <=", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5Like(String value) {
            addCriterion("apd_custom5 like", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5NotLike(String value) {
            addCriterion("apd_custom5 not like", value, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5In(List<String> values) {
            addCriterion("apd_custom5 in", values, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5NotIn(List<String> values) {
            addCriterion("apd_custom5 not in", values, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5Between(String value1, String value2) {
            addCriterion("apd_custom5 between", value1, value2, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom5NotBetween(String value1, String value2) {
            addCriterion("apd_custom5 not between", value1, value2, "apdCustom5");
            return (Criteria) this;
        }

        public Criteria andApdCustom6IsNull() {
            addCriterion("apd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andApdCustom6IsNotNull() {
            addCriterion("apd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andApdCustom6EqualTo(String value) {
            addCriterion("apd_custom6 =", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6NotEqualTo(String value) {
            addCriterion("apd_custom6 <>", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6GreaterThan(String value) {
            addCriterion("apd_custom6 >", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("apd_custom6 >=", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6LessThan(String value) {
            addCriterion("apd_custom6 <", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6LessThanOrEqualTo(String value) {
            addCriterion("apd_custom6 <=", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6Like(String value) {
            addCriterion("apd_custom6 like", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6NotLike(String value) {
            addCriterion("apd_custom6 not like", value, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6In(List<String> values) {
            addCriterion("apd_custom6 in", values, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6NotIn(List<String> values) {
            addCriterion("apd_custom6 not in", values, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6Between(String value1, String value2) {
            addCriterion("apd_custom6 between", value1, value2, "apdCustom6");
            return (Criteria) this;
        }

        public Criteria andApdCustom6NotBetween(String value1, String value2) {
            addCriterion("apd_custom6 not between", value1, value2, "apdCustom6");
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