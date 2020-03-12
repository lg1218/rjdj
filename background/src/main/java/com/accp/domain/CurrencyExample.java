package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CurrencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrencyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCurrencyNameIsNull() {
            addCriterion("currency_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameIsNotNull() {
            addCriterion("currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEqualTo(String value) {
            addCriterion("currency_name =", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotEqualTo(String value) {
            addCriterion("currency_name <>", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameGreaterThan(String value) {
            addCriterion("currency_name >", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("currency_name >=", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLessThan(String value) {
            addCriterion("currency_name <", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("currency_name <=", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLike(String value) {
            addCriterion("currency_name like", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotLike(String value) {
            addCriterion("currency_name not like", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameIn(List<String> values) {
            addCriterion("currency_name in", values, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotIn(List<String> values) {
            addCriterion("currency_name not in", values, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameBetween(String value1, String value2) {
            addCriterion("currency_name between", value1, value2, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("currency_name not between", value1, value2, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameIsNull() {
            addCriterion("currency_easyname is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameIsNotNull() {
            addCriterion("currency_easyname is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameEqualTo(String value) {
            addCriterion("currency_easyname =", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameNotEqualTo(String value) {
            addCriterion("currency_easyname <>", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameGreaterThan(String value) {
            addCriterion("currency_easyname >", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameGreaterThanOrEqualTo(String value) {
            addCriterion("currency_easyname >=", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameLessThan(String value) {
            addCriterion("currency_easyname <", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameLessThanOrEqualTo(String value) {
            addCriterion("currency_easyname <=", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameLike(String value) {
            addCriterion("currency_easyname like", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameNotLike(String value) {
            addCriterion("currency_easyname not like", value, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameIn(List<String> values) {
            addCriterion("currency_easyname in", values, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameNotIn(List<String> values) {
            addCriterion("currency_easyname not in", values, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameBetween(String value1, String value2) {
            addCriterion("currency_easyname between", value1, value2, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEasynameNotBetween(String value1, String value2) {
            addCriterion("currency_easyname not between", value1, value2, "currencyEasyname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameIsNull() {
            addCriterion("currency_engname is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameIsNotNull() {
            addCriterion("currency_engname is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameEqualTo(String value) {
            addCriterion("currency_engname =", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameNotEqualTo(String value) {
            addCriterion("currency_engname <>", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameGreaterThan(String value) {
            addCriterion("currency_engname >", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("currency_engname >=", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameLessThan(String value) {
            addCriterion("currency_engname <", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameLessThanOrEqualTo(String value) {
            addCriterion("currency_engname <=", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameLike(String value) {
            addCriterion("currency_engname like", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameNotLike(String value) {
            addCriterion("currency_engname not like", value, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameIn(List<String> values) {
            addCriterion("currency_engname in", values, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameNotIn(List<String> values) {
            addCriterion("currency_engname not in", values, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameBetween(String value1, String value2) {
            addCriterion("currency_engname between", value1, value2, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyEngnameNotBetween(String value1, String value2) {
            addCriterion("currency_engname not between", value1, value2, "currencyEngname");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayIsNull() {
            addCriterion("currency_transactionday is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayIsNotNull() {
            addCriterion("currency_transactionday is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayEqualTo(Date value) {
            addCriterionForJDBCDate("currency_transactionday =", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayNotEqualTo(Date value) {
            addCriterionForJDBCDate("currency_transactionday <>", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayGreaterThan(Date value) {
            addCriterionForJDBCDate("currency_transactionday >", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("currency_transactionday >=", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayLessThan(Date value) {
            addCriterionForJDBCDate("currency_transactionday <", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("currency_transactionday <=", value, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayIn(List<Date> values) {
            addCriterionForJDBCDate("currency_transactionday in", values, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayNotIn(List<Date> values) {
            addCriterionForJDBCDate("currency_transactionday not in", values, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("currency_transactionday between", value1, value2, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyTransactiondayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("currency_transactionday not between", value1, value2, "currencyTransactionday");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeIsNull() {
            addCriterion("currency_standardexchange is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeIsNotNull() {
            addCriterion("currency_standardexchange is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeEqualTo(Float value) {
            addCriterion("currency_standardexchange =", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeNotEqualTo(Float value) {
            addCriterion("currency_standardexchange <>", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeGreaterThan(Float value) {
            addCriterion("currency_standardexchange >", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeGreaterThanOrEqualTo(Float value) {
            addCriterion("currency_standardexchange >=", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeLessThan(Float value) {
            addCriterion("currency_standardexchange <", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeLessThanOrEqualTo(Float value) {
            addCriterion("currency_standardexchange <=", value, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeIn(List<Float> values) {
            addCriterion("currency_standardexchange in", values, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeNotIn(List<Float> values) {
            addCriterion("currency_standardexchange not in", values, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeBetween(Float value1, Float value2) {
            addCriterion("currency_standardexchange between", value1, value2, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyStandardexchangeNotBetween(Float value1, Float value2) {
            addCriterion("currency_standardexchange not between", value1, value2, "currencyStandardexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeIsNull() {
            addCriterion("currency_inexchange is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeIsNotNull() {
            addCriterion("currency_inexchange is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeEqualTo(Float value) {
            addCriterion("currency_inexchange =", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeNotEqualTo(Float value) {
            addCriterion("currency_inexchange <>", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeGreaterThan(Float value) {
            addCriterion("currency_inexchange >", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeGreaterThanOrEqualTo(Float value) {
            addCriterion("currency_inexchange >=", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeLessThan(Float value) {
            addCriterion("currency_inexchange <", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeLessThanOrEqualTo(Float value) {
            addCriterion("currency_inexchange <=", value, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeIn(List<Float> values) {
            addCriterion("currency_inexchange in", values, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeNotIn(List<Float> values) {
            addCriterion("currency_inexchange not in", values, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeBetween(Float value1, Float value2) {
            addCriterion("currency_inexchange between", value1, value2, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyInexchangeNotBetween(Float value1, Float value2) {
            addCriterion("currency_inexchange not between", value1, value2, "currencyInexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeIsNull() {
            addCriterion("currency_outexchange is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeIsNotNull() {
            addCriterion("currency_outexchange is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeEqualTo(Float value) {
            addCriterion("currency_outexchange =", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeNotEqualTo(Float value) {
            addCriterion("currency_outexchange <>", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeGreaterThan(Float value) {
            addCriterion("currency_outexchange >", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeGreaterThanOrEqualTo(Float value) {
            addCriterion("currency_outexchange >=", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeLessThan(Float value) {
            addCriterion("currency_outexchange <", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeLessThanOrEqualTo(Float value) {
            addCriterion("currency_outexchange <=", value, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeIn(List<Float> values) {
            addCriterion("currency_outexchange in", values, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeNotIn(List<Float> values) {
            addCriterion("currency_outexchange not in", values, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeBetween(Float value1, Float value2) {
            addCriterion("currency_outexchange between", value1, value2, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyOutexchangeNotBetween(Float value1, Float value2) {
            addCriterion("currency_outexchange not between", value1, value2, "currencyOutexchange");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandIsNull() {
            addCriterion("currency_ifthousand is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandIsNotNull() {
            addCriterion("currency_ifthousand is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandEqualTo(Integer value) {
            addCriterion("currency_ifthousand =", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandNotEqualTo(Integer value) {
            addCriterion("currency_ifthousand <>", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandGreaterThan(Integer value) {
            addCriterion("currency_ifthousand >", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandGreaterThanOrEqualTo(Integer value) {
            addCriterion("currency_ifthousand >=", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandLessThan(Integer value) {
            addCriterion("currency_ifthousand <", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandLessThanOrEqualTo(Integer value) {
            addCriterion("currency_ifthousand <=", value, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandIn(List<Integer> values) {
            addCriterion("currency_ifthousand in", values, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandNotIn(List<Integer> values) {
            addCriterion("currency_ifthousand not in", values, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandBetween(Integer value1, Integer value2) {
            addCriterion("currency_ifthousand between", value1, value2, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyIfthousandNotBetween(Integer value1, Integer value2) {
            addCriterion("currency_ifthousand not between", value1, value2, "currencyIfthousand");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetIsNull() {
            addCriterion("currency_mpointset is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetIsNotNull() {
            addCriterion("currency_mpointset is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetEqualTo(Integer value) {
            addCriterion("currency_mpointset =", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetNotEqualTo(Integer value) {
            addCriterion("currency_mpointset <>", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetGreaterThan(Integer value) {
            addCriterion("currency_mpointset >", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("currency_mpointset >=", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetLessThan(Integer value) {
            addCriterion("currency_mpointset <", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetLessThanOrEqualTo(Integer value) {
            addCriterion("currency_mpointset <=", value, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetIn(List<Integer> values) {
            addCriterion("currency_mpointset in", values, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetNotIn(List<Integer> values) {
            addCriterion("currency_mpointset not in", values, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetBetween(Integer value1, Integer value2) {
            addCriterion("currency_mpointset between", value1, value2, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyMpointsetNotBetween(Integer value1, Integer value2) {
            addCriterion("currency_mpointset not between", value1, value2, "currencyMpointset");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingIsNull() {
            addCriterion("currency_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingIsNotNull() {
            addCriterion("currency_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingEqualTo(String value) {
            addCriterion("currency_Auditing =", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingNotEqualTo(String value) {
            addCriterion("currency_Auditing <>", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingGreaterThan(String value) {
            addCriterion("currency_Auditing >", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("currency_Auditing >=", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingLessThan(String value) {
            addCriterion("currency_Auditing <", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingLessThanOrEqualTo(String value) {
            addCriterion("currency_Auditing <=", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingLike(String value) {
            addCriterion("currency_Auditing like", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingNotLike(String value) {
            addCriterion("currency_Auditing not like", value, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingIn(List<String> values) {
            addCriterion("currency_Auditing in", values, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingNotIn(List<String> values) {
            addCriterion("currency_Auditing not in", values, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingBetween(String value1, String value2) {
            addCriterion("currency_Auditing between", value1, value2, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andCurrencyAuditingNotBetween(String value1, String value2) {
            addCriterion("currency_Auditing not between", value1, value2, "currencyAuditing");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnIsNull() {
            addCriterion("urrency_yn is null");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnIsNotNull() {
            addCriterion("urrency_yn is not null");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnEqualTo(String value) {
            addCriterion("urrency_yn =", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnNotEqualTo(String value) {
            addCriterion("urrency_yn <>", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnGreaterThan(String value) {
            addCriterion("urrency_yn >", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnGreaterThanOrEqualTo(String value) {
            addCriterion("urrency_yn >=", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnLessThan(String value) {
            addCriterion("urrency_yn <", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnLessThanOrEqualTo(String value) {
            addCriterion("urrency_yn <=", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnLike(String value) {
            addCriterion("urrency_yn like", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnNotLike(String value) {
            addCriterion("urrency_yn not like", value, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnIn(List<String> values) {
            addCriterion("urrency_yn in", values, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnNotIn(List<String> values) {
            addCriterion("urrency_yn not in", values, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnBetween(String value1, String value2) {
            addCriterion("urrency_yn between", value1, value2, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andUrrencyYnNotBetween(String value1, String value2) {
            addCriterion("urrency_yn not between", value1, value2, "urrencyYn");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1IsNull() {
            addCriterion("currency_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1IsNotNull() {
            addCriterion("currency_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1EqualTo(String value) {
            addCriterion("currency_custom1 =", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1NotEqualTo(String value) {
            addCriterion("currency_custom1 <>", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1GreaterThan(String value) {
            addCriterion("currency_custom1 >", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom1 >=", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1LessThan(String value) {
            addCriterion("currency_custom1 <", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1LessThanOrEqualTo(String value) {
            addCriterion("currency_custom1 <=", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1Like(String value) {
            addCriterion("currency_custom1 like", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1NotLike(String value) {
            addCriterion("currency_custom1 not like", value, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1In(List<String> values) {
            addCriterion("currency_custom1 in", values, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1NotIn(List<String> values) {
            addCriterion("currency_custom1 not in", values, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1Between(String value1, String value2) {
            addCriterion("currency_custom1 between", value1, value2, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom1NotBetween(String value1, String value2) {
            addCriterion("currency_custom1 not between", value1, value2, "currencyCustom1");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2IsNull() {
            addCriterion("currency_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2IsNotNull() {
            addCriterion("currency_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2EqualTo(String value) {
            addCriterion("currency_custom2 =", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2NotEqualTo(String value) {
            addCriterion("currency_custom2 <>", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2GreaterThan(String value) {
            addCriterion("currency_custom2 >", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom2 >=", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2LessThan(String value) {
            addCriterion("currency_custom2 <", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2LessThanOrEqualTo(String value) {
            addCriterion("currency_custom2 <=", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2Like(String value) {
            addCriterion("currency_custom2 like", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2NotLike(String value) {
            addCriterion("currency_custom2 not like", value, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2In(List<String> values) {
            addCriterion("currency_custom2 in", values, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2NotIn(List<String> values) {
            addCriterion("currency_custom2 not in", values, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2Between(String value1, String value2) {
            addCriterion("currency_custom2 between", value1, value2, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom2NotBetween(String value1, String value2) {
            addCriterion("currency_custom2 not between", value1, value2, "currencyCustom2");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3IsNull() {
            addCriterion("currency_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3IsNotNull() {
            addCriterion("currency_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3EqualTo(String value) {
            addCriterion("currency_custom3 =", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3NotEqualTo(String value) {
            addCriterion("currency_custom3 <>", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3GreaterThan(String value) {
            addCriterion("currency_custom3 >", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom3 >=", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3LessThan(String value) {
            addCriterion("currency_custom3 <", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3LessThanOrEqualTo(String value) {
            addCriterion("currency_custom3 <=", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3Like(String value) {
            addCriterion("currency_custom3 like", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3NotLike(String value) {
            addCriterion("currency_custom3 not like", value, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3In(List<String> values) {
            addCriterion("currency_custom3 in", values, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3NotIn(List<String> values) {
            addCriterion("currency_custom3 not in", values, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3Between(String value1, String value2) {
            addCriterion("currency_custom3 between", value1, value2, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom3NotBetween(String value1, String value2) {
            addCriterion("currency_custom3 not between", value1, value2, "currencyCustom3");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4IsNull() {
            addCriterion("currency_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4IsNotNull() {
            addCriterion("currency_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4EqualTo(String value) {
            addCriterion("currency_custom4 =", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4NotEqualTo(String value) {
            addCriterion("currency_custom4 <>", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4GreaterThan(String value) {
            addCriterion("currency_custom4 >", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom4 >=", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4LessThan(String value) {
            addCriterion("currency_custom4 <", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4LessThanOrEqualTo(String value) {
            addCriterion("currency_custom4 <=", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4Like(String value) {
            addCriterion("currency_custom4 like", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4NotLike(String value) {
            addCriterion("currency_custom4 not like", value, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4In(List<String> values) {
            addCriterion("currency_custom4 in", values, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4NotIn(List<String> values) {
            addCriterion("currency_custom4 not in", values, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4Between(String value1, String value2) {
            addCriterion("currency_custom4 between", value1, value2, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom4NotBetween(String value1, String value2) {
            addCriterion("currency_custom4 not between", value1, value2, "currencyCustom4");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5IsNull() {
            addCriterion("currency_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5IsNotNull() {
            addCriterion("currency_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5EqualTo(String value) {
            addCriterion("currency_custom5 =", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5NotEqualTo(String value) {
            addCriterion("currency_custom5 <>", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5GreaterThan(String value) {
            addCriterion("currency_custom5 >", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom5 >=", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5LessThan(String value) {
            addCriterion("currency_custom5 <", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5LessThanOrEqualTo(String value) {
            addCriterion("currency_custom5 <=", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5Like(String value) {
            addCriterion("currency_custom5 like", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5NotLike(String value) {
            addCriterion("currency_custom5 not like", value, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5In(List<String> values) {
            addCriterion("currency_custom5 in", values, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5NotIn(List<String> values) {
            addCriterion("currency_custom5 not in", values, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5Between(String value1, String value2) {
            addCriterion("currency_custom5 between", value1, value2, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom5NotBetween(String value1, String value2) {
            addCriterion("currency_custom5 not between", value1, value2, "currencyCustom5");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6IsNull() {
            addCriterion("currency_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6IsNotNull() {
            addCriterion("currency_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6EqualTo(String value) {
            addCriterion("currency_custom6 =", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6NotEqualTo(String value) {
            addCriterion("currency_custom6 <>", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6GreaterThan(String value) {
            addCriterion("currency_custom6 >", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("currency_custom6 >=", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6LessThan(String value) {
            addCriterion("currency_custom6 <", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6LessThanOrEqualTo(String value) {
            addCriterion("currency_custom6 <=", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6Like(String value) {
            addCriterion("currency_custom6 like", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6NotLike(String value) {
            addCriterion("currency_custom6 not like", value, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6In(List<String> values) {
            addCriterion("currency_custom6 in", values, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6NotIn(List<String> values) {
            addCriterion("currency_custom6 not in", values, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6Between(String value1, String value2) {
            addCriterion("currency_custom6 between", value1, value2, "currencyCustom6");
            return (Criteria) this;
        }

        public Criteria andCurrencyCustom6NotBetween(String value1, String value2) {
            addCriterion("currency_custom6 not between", value1, value2, "currencyCustom6");
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