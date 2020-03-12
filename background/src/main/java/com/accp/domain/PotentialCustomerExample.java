package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PotentialCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PotentialCustomerExample() {
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

        public Criteria andPcIdIsNull() {
            addCriterion("pc_id is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("pc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(String value) {
            addCriterion("pc_id =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(String value) {
            addCriterion("pc_id <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(String value) {
            addCriterion("pc_id >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(String value) {
            addCriterion("pc_id >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(String value) {
            addCriterion("pc_id <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(String value) {
            addCriterion("pc_id <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLike(String value) {
            addCriterion("pc_id like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotLike(String value) {
            addCriterion("pc_id not like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<String> values) {
            addCriterion("pc_id in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<String> values) {
            addCriterion("pc_id not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(String value1, String value2) {
            addCriterion("pc_id between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(String value1, String value2) {
            addCriterion("pc_id not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNull() {
            addCriterion("pc_name is null");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNotNull() {
            addCriterion("pc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcNameEqualTo(String value) {
            addCriterion("pc_name =", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotEqualTo(String value) {
            addCriterion("pc_name <>", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThan(String value) {
            addCriterion("pc_name >", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_name >=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThan(String value) {
            addCriterion("pc_name <", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThanOrEqualTo(String value) {
            addCriterion("pc_name <=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLike(String value) {
            addCriterion("pc_name like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotLike(String value) {
            addCriterion("pc_name not like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameIn(List<String> values) {
            addCriterion("pc_name in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotIn(List<String> values) {
            addCriterion("pc_name not in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameBetween(String value1, String value2) {
            addCriterion("pc_name between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotBetween(String value1, String value2) {
            addCriterion("pc_name not between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcEasynameIsNull() {
            addCriterion("pc_easyname is null");
            return (Criteria) this;
        }

        public Criteria andPcEasynameIsNotNull() {
            addCriterion("pc_easyname is not null");
            return (Criteria) this;
        }

        public Criteria andPcEasynameEqualTo(String value) {
            addCriterion("pc_easyname =", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameNotEqualTo(String value) {
            addCriterion("pc_easyname <>", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameGreaterThan(String value) {
            addCriterion("pc_easyname >", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_easyname >=", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameLessThan(String value) {
            addCriterion("pc_easyname <", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameLessThanOrEqualTo(String value) {
            addCriterion("pc_easyname <=", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameLike(String value) {
            addCriterion("pc_easyname like", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameNotLike(String value) {
            addCriterion("pc_easyname not like", value, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameIn(List<String> values) {
            addCriterion("pc_easyname in", values, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameNotIn(List<String> values) {
            addCriterion("pc_easyname not in", values, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameBetween(String value1, String value2) {
            addCriterion("pc_easyname between", value1, value2, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEasynameNotBetween(String value1, String value2) {
            addCriterion("pc_easyname not between", value1, value2, "pcEasyname");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameIsNull() {
            addCriterion("pc_english_name is null");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameIsNotNull() {
            addCriterion("pc_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameEqualTo(String value) {
            addCriterion("pc_english_name =", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameNotEqualTo(String value) {
            addCriterion("pc_english_name <>", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameGreaterThan(String value) {
            addCriterion("pc_english_name >", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_english_name >=", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameLessThan(String value) {
            addCriterion("pc_english_name <", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("pc_english_name <=", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameLike(String value) {
            addCriterion("pc_english_name like", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameNotLike(String value) {
            addCriterion("pc_english_name not like", value, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameIn(List<String> values) {
            addCriterion("pc_english_name in", values, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameNotIn(List<String> values) {
            addCriterion("pc_english_name not in", values, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameBetween(String value1, String value2) {
            addCriterion("pc_english_name between", value1, value2, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcEnglishNameNotBetween(String value1, String value2) {
            addCriterion("pc_english_name not between", value1, value2, "pcEnglishName");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonIsNull() {
            addCriterion("pc_charge_person is null");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonIsNotNull() {
            addCriterion("pc_charge_person is not null");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonEqualTo(String value) {
            addCriterion("pc_charge_person =", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonNotEqualTo(String value) {
            addCriterion("pc_charge_person <>", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonGreaterThan(String value) {
            addCriterion("pc_charge_person >", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonGreaterThanOrEqualTo(String value) {
            addCriterion("pc_charge_person >=", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonLessThan(String value) {
            addCriterion("pc_charge_person <", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonLessThanOrEqualTo(String value) {
            addCriterion("pc_charge_person <=", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonLike(String value) {
            addCriterion("pc_charge_person like", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonNotLike(String value) {
            addCriterion("pc_charge_person not like", value, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonIn(List<String> values) {
            addCriterion("pc_charge_person in", values, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonNotIn(List<String> values) {
            addCriterion("pc_charge_person not in", values, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonBetween(String value1, String value2) {
            addCriterion("pc_charge_person between", value1, value2, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcChargePersonNotBetween(String value1, String value2) {
            addCriterion("pc_charge_person not between", value1, value2, "pcChargePerson");
            return (Criteria) this;
        }

        public Criteria andPcTypeIsNull() {
            addCriterion("pc_type is null");
            return (Criteria) this;
        }

        public Criteria andPcTypeIsNotNull() {
            addCriterion("pc_type is not null");
            return (Criteria) this;
        }

        public Criteria andPcTypeEqualTo(String value) {
            addCriterion("pc_type =", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotEqualTo(String value) {
            addCriterion("pc_type <>", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeGreaterThan(String value) {
            addCriterion("pc_type >", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pc_type >=", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeLessThan(String value) {
            addCriterion("pc_type <", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeLessThanOrEqualTo(String value) {
            addCriterion("pc_type <=", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeLike(String value) {
            addCriterion("pc_type like", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotLike(String value) {
            addCriterion("pc_type not like", value, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeIn(List<String> values) {
            addCriterion("pc_type in", values, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotIn(List<String> values) {
            addCriterion("pc_type not in", values, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeBetween(String value1, String value2) {
            addCriterion("pc_type between", value1, value2, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcTypeNotBetween(String value1, String value2) {
            addCriterion("pc_type not between", value1, value2, "pcType");
            return (Criteria) this;
        }

        public Criteria andPcAreaIsNull() {
            addCriterion("pc_area is null");
            return (Criteria) this;
        }

        public Criteria andPcAreaIsNotNull() {
            addCriterion("pc_area is not null");
            return (Criteria) this;
        }

        public Criteria andPcAreaEqualTo(String value) {
            addCriterion("pc_area =", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaNotEqualTo(String value) {
            addCriterion("pc_area <>", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaGreaterThan(String value) {
            addCriterion("pc_area >", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaGreaterThanOrEqualTo(String value) {
            addCriterion("pc_area >=", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaLessThan(String value) {
            addCriterion("pc_area <", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaLessThanOrEqualTo(String value) {
            addCriterion("pc_area <=", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaLike(String value) {
            addCriterion("pc_area like", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaNotLike(String value) {
            addCriterion("pc_area not like", value, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaIn(List<String> values) {
            addCriterion("pc_area in", values, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaNotIn(List<String> values) {
            addCriterion("pc_area not in", values, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaBetween(String value1, String value2) {
            addCriterion("pc_area between", value1, value2, "pcArea");
            return (Criteria) this;
        }

        public Criteria andPcAreaNotBetween(String value1, String value2) {
            addCriterion("pc_area not between", value1, value2, "pcArea");
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

        public Criteria andCgIdIsNull() {
            addCriterion("cg_id is null");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNotNull() {
            addCriterion("cg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCgIdEqualTo(String value) {
            addCriterion("cg_id =", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotEqualTo(String value) {
            addCriterion("cg_id <>", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThan(String value) {
            addCriterion("cg_id >", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThanOrEqualTo(String value) {
            addCriterion("cg_id >=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThan(String value) {
            addCriterion("cg_id <", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThanOrEqualTo(String value) {
            addCriterion("cg_id <=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLike(String value) {
            addCriterion("cg_id like", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotLike(String value) {
            addCriterion("cg_id not like", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdIn(List<String> values) {
            addCriterion("cg_id in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotIn(List<String> values) {
            addCriterion("cg_id not in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdBetween(String value1, String value2) {
            addCriterion("cg_id between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotBetween(String value1, String value2) {
            addCriterion("cg_id not between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andNsIdIsNull() {
            addCriterion("ns_id is null");
            return (Criteria) this;
        }

        public Criteria andNsIdIsNotNull() {
            addCriterion("ns_id is not null");
            return (Criteria) this;
        }

        public Criteria andNsIdEqualTo(String value) {
            addCriterion("ns_id =", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotEqualTo(String value) {
            addCriterion("ns_id <>", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdGreaterThan(String value) {
            addCriterion("ns_id >", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ns_id >=", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLessThan(String value) {
            addCriterion("ns_id <", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLessThanOrEqualTo(String value) {
            addCriterion("ns_id <=", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLike(String value) {
            addCriterion("ns_id like", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotLike(String value) {
            addCriterion("ns_id not like", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdIn(List<String> values) {
            addCriterion("ns_id in", values, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotIn(List<String> values) {
            addCriterion("ns_id not in", values, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdBetween(String value1, String value2) {
            addCriterion("ns_id between", value1, value2, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotBetween(String value1, String value2) {
            addCriterion("ns_id not between", value1, value2, "nsId");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessIsNull() {
            addCriterion("Pc_probability_success is null");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessIsNotNull() {
            addCriterion("Pc_probability_success is not null");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessEqualTo(Float value) {
            addCriterion("Pc_probability_success =", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessNotEqualTo(Float value) {
            addCriterion("Pc_probability_success <>", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessGreaterThan(Float value) {
            addCriterion("Pc_probability_success >", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessGreaterThanOrEqualTo(Float value) {
            addCriterion("Pc_probability_success >=", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessLessThan(Float value) {
            addCriterion("Pc_probability_success <", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessLessThanOrEqualTo(Float value) {
            addCriterion("Pc_probability_success <=", value, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessIn(List<Float> values) {
            addCriterion("Pc_probability_success in", values, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessNotIn(List<Float> values) {
            addCriterion("Pc_probability_success not in", values, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessBetween(Float value1, Float value2) {
            addCriterion("Pc_probability_success between", value1, value2, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcProbabilitySuccessNotBetween(Float value1, Float value2) {
            addCriterion("Pc_probability_success not between", value1, value2, "pcProbabilitySuccess");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerIsNull() {
            addCriterion("\"Pc_decision maker\" is null");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerIsNotNull() {
            addCriterion("\"Pc_decision maker\" is not null");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerEqualTo(String value) {
            addCriterion("\"Pc_decision maker\" =", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerNotEqualTo(String value) {
            addCriterion("\"Pc_decision maker\" <>", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerGreaterThan(String value) {
            addCriterion("\"Pc_decision maker\" >", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerGreaterThanOrEqualTo(String value) {
            addCriterion("\"Pc_decision maker\" >=", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerLessThan(String value) {
            addCriterion("\"Pc_decision maker\" <", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerLessThanOrEqualTo(String value) {
            addCriterion("\"Pc_decision maker\" <=", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerLike(String value) {
            addCriterion("\"Pc_decision maker\" like", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerNotLike(String value) {
            addCriterion("\"Pc_decision maker\" not like", value, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerIn(List<String> values) {
            addCriterion("\"Pc_decision maker\" in", values, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerNotIn(List<String> values) {
            addCriterion("\"Pc_decision maker\" not in", values, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerBetween(String value1, String value2) {
            addCriterion("\"Pc_decision maker\" between", value1, value2, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcDecisionMakerNotBetween(String value1, String value2) {
            addCriterion("\"Pc_decision maker\" not between", value1, value2, "pcDecisionMaker");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateIsNull() {
            addCriterion("Pc_negotiation_date is null");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateIsNotNull() {
            addCriterion("Pc_negotiation_date is not null");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date =", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date <>", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date >", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date >=", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateLessThan(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date <", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_negotiation_date <=", value, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_negotiation_date in", values, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_negotiation_date not in", values, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_negotiation_date between", value1, value2, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcNegotiationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_negotiation_date not between", value1, value2, "pcNegotiationDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateIsNull() {
            addCriterion("Pc_Appointment_visit_date is null");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateIsNotNull() {
            addCriterion("Pc_Appointment_visit_date is not null");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date =", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date <>", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date >", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date >=", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateLessThan(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date <", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date <=", value, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date in", values, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date not in", values, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date between", value1, value2, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcAppointmentVisitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Appointment_visit_date not between", value1, value2, "pcAppointmentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateIsNull() {
            addCriterion("Pc_Recent_visit_date is null");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateIsNotNull() {
            addCriterion("Pc_Recent_visit_date is not null");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date =", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date <>", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date >", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date >=", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateLessThan(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date <", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Recent_visit_date <=", value, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Recent_visit_date in", values, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Recent_visit_date not in", values, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Recent_visit_date between", value1, value2, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcRecentVisitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Recent_visit_date not between", value1, value2, "pcRecentVisitDate");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverIsNull() {
            addCriterion("Pc_Estimated_turnover is null");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverIsNotNull() {
            addCriterion("Pc_Estimated_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverEqualTo(Float value) {
            addCriterion("Pc_Estimated_turnover =", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverNotEqualTo(Float value) {
            addCriterion("Pc_Estimated_turnover <>", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverGreaterThan(Float value) {
            addCriterion("Pc_Estimated_turnover >", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverGreaterThanOrEqualTo(Float value) {
            addCriterion("Pc_Estimated_turnover >=", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverLessThan(Float value) {
            addCriterion("Pc_Estimated_turnover <", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverLessThanOrEqualTo(Float value) {
            addCriterion("Pc_Estimated_turnover <=", value, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverIn(List<Float> values) {
            addCriterion("Pc_Estimated_turnover in", values, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverNotIn(List<Float> values) {
            addCriterion("Pc_Estimated_turnover not in", values, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverBetween(Float value1, Float value2) {
            addCriterion("Pc_Estimated_turnover between", value1, value2, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcEstimatedTurnoverNotBetween(Float value1, Float value2) {
            addCriterion("Pc_Estimated_turnover not between", value1, value2, "pcEstimatedTurnover");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileIsNull() {
            addCriterion("Pc_Customer_Profile is null");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileIsNotNull() {
            addCriterion("Pc_Customer_Profile is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileEqualTo(String value) {
            addCriterion("Pc_Customer_Profile =", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileNotEqualTo(String value) {
            addCriterion("Pc_Customer_Profile <>", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileGreaterThan(String value) {
            addCriterion("Pc_Customer_Profile >", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileGreaterThanOrEqualTo(String value) {
            addCriterion("Pc_Customer_Profile >=", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileLessThan(String value) {
            addCriterion("Pc_Customer_Profile <", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileLessThanOrEqualTo(String value) {
            addCriterion("Pc_Customer_Profile <=", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileLike(String value) {
            addCriterion("Pc_Customer_Profile like", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileNotLike(String value) {
            addCriterion("Pc_Customer_Profile not like", value, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileIn(List<String> values) {
            addCriterion("Pc_Customer_Profile in", values, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileNotIn(List<String> values) {
            addCriterion("Pc_Customer_Profile not in", values, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileBetween(String value1, String value2) {
            addCriterion("Pc_Customer_Profile between", value1, value2, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcCustomerProfileNotBetween(String value1, String value2) {
            addCriterion("Pc_Customer_Profile not between", value1, value2, "pcCustomerProfile");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanIsNull() {
            addCriterion("pc_principalman is null");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanIsNotNull() {
            addCriterion("pc_principalman is not null");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanEqualTo(String value) {
            addCriterion("pc_principalman =", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanNotEqualTo(String value) {
            addCriterion("pc_principalman <>", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanGreaterThan(String value) {
            addCriterion("pc_principalman >", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanGreaterThanOrEqualTo(String value) {
            addCriterion("pc_principalman >=", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanLessThan(String value) {
            addCriterion("pc_principalman <", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanLessThanOrEqualTo(String value) {
            addCriterion("pc_principalman <=", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanLike(String value) {
            addCriterion("pc_principalman like", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanNotLike(String value) {
            addCriterion("pc_principalman not like", value, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanIn(List<String> values) {
            addCriterion("pc_principalman in", values, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanNotIn(List<String> values) {
            addCriterion("pc_principalman not in", values, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanBetween(String value1, String value2) {
            addCriterion("pc_principalman between", value1, value2, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcPrincipalmanNotBetween(String value1, String value2) {
            addCriterion("pc_principalman not between", value1, value2, "pcPrincipalman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanIsNull() {
            addCriterion("pc_linkman is null");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanIsNotNull() {
            addCriterion("pc_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanEqualTo(String value) {
            addCriterion("pc_linkman =", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanNotEqualTo(String value) {
            addCriterion("pc_linkman <>", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanGreaterThan(String value) {
            addCriterion("pc_linkman >", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("pc_linkman >=", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanLessThan(String value) {
            addCriterion("pc_linkman <", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanLessThanOrEqualTo(String value) {
            addCriterion("pc_linkman <=", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanLike(String value) {
            addCriterion("pc_linkman like", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanNotLike(String value) {
            addCriterion("pc_linkman not like", value, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanIn(List<String> values) {
            addCriterion("pc_linkman in", values, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanNotIn(List<String> values) {
            addCriterion("pc_linkman not in", values, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanBetween(String value1, String value2) {
            addCriterion("pc_linkman between", value1, value2, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinkmanNotBetween(String value1, String value2) {
            addCriterion("pc_linkman not between", value1, value2, "pcLinkman");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaIsNull() {
            addCriterion("pc_linktela is null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaIsNotNull() {
            addCriterion("pc_linktela is not null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaEqualTo(String value) {
            addCriterion("pc_linktela =", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaNotEqualTo(String value) {
            addCriterion("pc_linktela <>", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaGreaterThan(String value) {
            addCriterion("pc_linktela >", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaGreaterThanOrEqualTo(String value) {
            addCriterion("pc_linktela >=", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaLessThan(String value) {
            addCriterion("pc_linktela <", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaLessThanOrEqualTo(String value) {
            addCriterion("pc_linktela <=", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaLike(String value) {
            addCriterion("pc_linktela like", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaNotLike(String value) {
            addCriterion("pc_linktela not like", value, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaIn(List<String> values) {
            addCriterion("pc_linktela in", values, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaNotIn(List<String> values) {
            addCriterion("pc_linktela not in", values, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaBetween(String value1, String value2) {
            addCriterion("pc_linktela between", value1, value2, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelaNotBetween(String value1, String value2) {
            addCriterion("pc_linktela not between", value1, value2, "pcLinktela");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbIsNull() {
            addCriterion("pc_linktelb is null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbIsNotNull() {
            addCriterion("pc_linktelb is not null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbEqualTo(String value) {
            addCriterion("pc_linktelb =", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbNotEqualTo(String value) {
            addCriterion("pc_linktelb <>", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbGreaterThan(String value) {
            addCriterion("pc_linktelb >", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbGreaterThanOrEqualTo(String value) {
            addCriterion("pc_linktelb >=", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbLessThan(String value) {
            addCriterion("pc_linktelb <", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbLessThanOrEqualTo(String value) {
            addCriterion("pc_linktelb <=", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbLike(String value) {
            addCriterion("pc_linktelb like", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbNotLike(String value) {
            addCriterion("pc_linktelb not like", value, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbIn(List<String> values) {
            addCriterion("pc_linktelb in", values, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbNotIn(List<String> values) {
            addCriterion("pc_linktelb not in", values, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbBetween(String value1, String value2) {
            addCriterion("pc_linktelb between", value1, value2, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelbNotBetween(String value1, String value2) {
            addCriterion("pc_linktelb not between", value1, value2, "pcLinktelb");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcIsNull() {
            addCriterion("pc_linktelc is null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcIsNotNull() {
            addCriterion("pc_linktelc is not null");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcEqualTo(String value) {
            addCriterion("pc_linktelc =", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcNotEqualTo(String value) {
            addCriterion("pc_linktelc <>", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcGreaterThan(String value) {
            addCriterion("pc_linktelc >", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcGreaterThanOrEqualTo(String value) {
            addCriterion("pc_linktelc >=", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcLessThan(String value) {
            addCriterion("pc_linktelc <", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcLessThanOrEqualTo(String value) {
            addCriterion("pc_linktelc <=", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcLike(String value) {
            addCriterion("pc_linktelc like", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcNotLike(String value) {
            addCriterion("pc_linktelc not like", value, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcIn(List<String> values) {
            addCriterion("pc_linktelc in", values, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcNotIn(List<String> values) {
            addCriterion("pc_linktelc not in", values, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcBetween(String value1, String value2) {
            addCriterion("pc_linktelc between", value1, value2, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcLinktelcNotBetween(String value1, String value2) {
            addCriterion("pc_linktelc not between", value1, value2, "pcLinktelc");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneIsNull() {
            addCriterion("pc_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneIsNotNull() {
            addCriterion("pc_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneEqualTo(String value) {
            addCriterion("pc_mobilephone =", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneNotEqualTo(String value) {
            addCriterion("pc_mobilephone <>", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneGreaterThan(String value) {
            addCriterion("pc_mobilephone >", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("pc_mobilephone >=", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneLessThan(String value) {
            addCriterion("pc_mobilephone <", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("pc_mobilephone <=", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneLike(String value) {
            addCriterion("pc_mobilephone like", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneNotLike(String value) {
            addCriterion("pc_mobilephone not like", value, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneIn(List<String> values) {
            addCriterion("pc_mobilephone in", values, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneNotIn(List<String> values) {
            addCriterion("pc_mobilephone not in", values, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneBetween(String value1, String value2) {
            addCriterion("pc_mobilephone between", value1, value2, "pcMobilephone");
            return (Criteria) this;
        }

        public Criteria andPcMobilephoneNotBetween(String value1, String value2) {
            addCriterion("pc_mobilephone not between", value1, value2, "pcMobilephone");
            return (Criteria) this;
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

        public Criteria andPcServicerIsNull() {
            addCriterion("Pc_servicer is null");
            return (Criteria) this;
        }

        public Criteria andPcServicerIsNotNull() {
            addCriterion("Pc_servicer is not null");
            return (Criteria) this;
        }

        public Criteria andPcServicerEqualTo(String value) {
            addCriterion("Pc_servicer =", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerNotEqualTo(String value) {
            addCriterion("Pc_servicer <>", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerGreaterThan(String value) {
            addCriterion("Pc_servicer >", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerGreaterThanOrEqualTo(String value) {
            addCriterion("Pc_servicer >=", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerLessThan(String value) {
            addCriterion("Pc_servicer <", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerLessThanOrEqualTo(String value) {
            addCriterion("Pc_servicer <=", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerLike(String value) {
            addCriterion("Pc_servicer like", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerNotLike(String value) {
            addCriterion("Pc_servicer not like", value, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerIn(List<String> values) {
            addCriterion("Pc_servicer in", values, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerNotIn(List<String> values) {
            addCriterion("Pc_servicer not in", values, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerBetween(String value1, String value2) {
            addCriterion("Pc_servicer between", value1, value2, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcServicerNotBetween(String value1, String value2) {
            addCriterion("Pc_servicer not between", value1, value2, "pcServicer");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoIsNull() {
            addCriterion("pc_taxcheckno is null");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoIsNotNull() {
            addCriterion("pc_taxcheckno is not null");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoEqualTo(String value) {
            addCriterion("pc_taxcheckno =", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoNotEqualTo(String value) {
            addCriterion("pc_taxcheckno <>", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoGreaterThan(String value) {
            addCriterion("pc_taxcheckno >", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoGreaterThanOrEqualTo(String value) {
            addCriterion("pc_taxcheckno >=", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoLessThan(String value) {
            addCriterion("pc_taxcheckno <", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoLessThanOrEqualTo(String value) {
            addCriterion("pc_taxcheckno <=", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoLike(String value) {
            addCriterion("pc_taxcheckno like", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoNotLike(String value) {
            addCriterion("pc_taxcheckno not like", value, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoIn(List<String> values) {
            addCriterion("pc_taxcheckno in", values, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoNotIn(List<String> values) {
            addCriterion("pc_taxcheckno not in", values, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoBetween(String value1, String value2) {
            addCriterion("pc_taxcheckno between", value1, value2, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcTaxchecknoNotBetween(String value1, String value2) {
            addCriterion("pc_taxcheckno not between", value1, value2, "pcTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyIsNull() {
            addCriterion("pc_capitalmoney is null");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyIsNotNull() {
            addCriterion("pc_capitalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyEqualTo(Float value) {
            addCriterion("pc_capitalmoney =", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyNotEqualTo(Float value) {
            addCriterion("pc_capitalmoney <>", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyGreaterThan(Float value) {
            addCriterion("pc_capitalmoney >", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pc_capitalmoney >=", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyLessThan(Float value) {
            addCriterion("pc_capitalmoney <", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("pc_capitalmoney <=", value, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyIn(List<Float> values) {
            addCriterion("pc_capitalmoney in", values, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyNotIn(List<Float> values) {
            addCriterion("pc_capitalmoney not in", values, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyBetween(Float value1, Float value2) {
            addCriterion("pc_capitalmoney between", value1, value2, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcCapitalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("pc_capitalmoney not between", value1, value2, "pcCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andPcJobIsNull() {
            addCriterion("pc_job is null");
            return (Criteria) this;
        }

        public Criteria andPcJobIsNotNull() {
            addCriterion("pc_job is not null");
            return (Criteria) this;
        }

        public Criteria andPcJobEqualTo(String value) {
            addCriterion("pc_job =", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobNotEqualTo(String value) {
            addCriterion("pc_job <>", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobGreaterThan(String value) {
            addCriterion("pc_job >", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobGreaterThanOrEqualTo(String value) {
            addCriterion("pc_job >=", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobLessThan(String value) {
            addCriterion("pc_job <", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobLessThanOrEqualTo(String value) {
            addCriterion("pc_job <=", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobLike(String value) {
            addCriterion("pc_job like", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobNotLike(String value) {
            addCriterion("pc_job not like", value, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobIn(List<String> values) {
            addCriterion("pc_job in", values, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobNotIn(List<String> values) {
            addCriterion("pc_job not in", values, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobBetween(String value1, String value2) {
            addCriterion("pc_job between", value1, value2, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcJobNotBetween(String value1, String value2) {
            addCriterion("pc_job not between", value1, value2, "pcJob");
            return (Criteria) this;
        }

        public Criteria andPcEmailIsNull() {
            addCriterion("pc_email is null");
            return (Criteria) this;
        }

        public Criteria andPcEmailIsNotNull() {
            addCriterion("pc_email is not null");
            return (Criteria) this;
        }

        public Criteria andPcEmailEqualTo(String value) {
            addCriterion("pc_email =", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailNotEqualTo(String value) {
            addCriterion("pc_email <>", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailGreaterThan(String value) {
            addCriterion("pc_email >", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("pc_email >=", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailLessThan(String value) {
            addCriterion("pc_email <", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailLessThanOrEqualTo(String value) {
            addCriterion("pc_email <=", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailLike(String value) {
            addCriterion("pc_email like", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailNotLike(String value) {
            addCriterion("pc_email not like", value, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailIn(List<String> values) {
            addCriterion("pc_email in", values, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailNotIn(List<String> values) {
            addCriterion("pc_email not in", values, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailBetween(String value1, String value2) {
            addCriterion("pc_email between", value1, value2, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcEmailNotBetween(String value1, String value2) {
            addCriterion("pc_email not between", value1, value2, "pcEmail");
            return (Criteria) this;
        }

        public Criteria andPcWebaddIsNull() {
            addCriterion("pc_webadd is null");
            return (Criteria) this;
        }

        public Criteria andPcWebaddIsNotNull() {
            addCriterion("pc_webadd is not null");
            return (Criteria) this;
        }

        public Criteria andPcWebaddEqualTo(String value) {
            addCriterion("pc_webadd =", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddNotEqualTo(String value) {
            addCriterion("pc_webadd <>", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddGreaterThan(String value) {
            addCriterion("pc_webadd >", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddGreaterThanOrEqualTo(String value) {
            addCriterion("pc_webadd >=", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddLessThan(String value) {
            addCriterion("pc_webadd <", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddLessThanOrEqualTo(String value) {
            addCriterion("pc_webadd <=", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddLike(String value) {
            addCriterion("pc_webadd like", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddNotLike(String value) {
            addCriterion("pc_webadd not like", value, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddIn(List<String> values) {
            addCriterion("pc_webadd in", values, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddNotIn(List<String> values) {
            addCriterion("pc_webadd not in", values, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddBetween(String value1, String value2) {
            addCriterion("pc_webadd between", value1, value2, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcWebaddNotBetween(String value1, String value2) {
            addCriterion("pc_webadd not between", value1, value2, "pcWebadd");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoIsNull() {
            addCriterion("pc_faxno is null");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoIsNotNull() {
            addCriterion("pc_faxno is not null");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoEqualTo(String value) {
            addCriterion("pc_faxno =", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoNotEqualTo(String value) {
            addCriterion("pc_faxno <>", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoGreaterThan(String value) {
            addCriterion("pc_faxno >", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("pc_faxno >=", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoLessThan(String value) {
            addCriterion("pc_faxno <", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoLessThanOrEqualTo(String value) {
            addCriterion("pc_faxno <=", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoLike(String value) {
            addCriterion("pc_faxno like", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoNotLike(String value) {
            addCriterion("pc_faxno not like", value, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoIn(List<String> values) {
            addCriterion("pc_faxno in", values, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoNotIn(List<String> values) {
            addCriterion("pc_faxno not in", values, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoBetween(String value1, String value2) {
            addCriterion("pc_faxno between", value1, value2, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcFaxnoNotBetween(String value1, String value2) {
            addCriterion("pc_faxno not between", value1, value2, "pcFaxno");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateIsNull() {
            addCriterion("Pc_Expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateIsNotNull() {
            addCriterion("Pc_Expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date =", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date <>", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date >", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date >=", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date <", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pc_Expiry_date <=", value, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Expiry_date in", values, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pc_Expiry_date not in", values, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Expiry_date between", value1, value2, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pc_Expiry_date not between", value1, value2, "pcExpiryDate");
            return (Criteria) this;
        }

        public Criteria andPcSalelvIsNull() {
            addCriterion("pc_salelv is null");
            return (Criteria) this;
        }

        public Criteria andPcSalelvIsNotNull() {
            addCriterion("pc_salelv is not null");
            return (Criteria) this;
        }

        public Criteria andPcSalelvEqualTo(String value) {
            addCriterion("pc_salelv =", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvNotEqualTo(String value) {
            addCriterion("pc_salelv <>", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvGreaterThan(String value) {
            addCriterion("pc_salelv >", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvGreaterThanOrEqualTo(String value) {
            addCriterion("pc_salelv >=", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvLessThan(String value) {
            addCriterion("pc_salelv <", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvLessThanOrEqualTo(String value) {
            addCriterion("pc_salelv <=", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvLike(String value) {
            addCriterion("pc_salelv like", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvNotLike(String value) {
            addCriterion("pc_salelv not like", value, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvIn(List<String> values) {
            addCriterion("pc_salelv in", values, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvNotIn(List<String> values) {
            addCriterion("pc_salelv not in", values, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvBetween(String value1, String value2) {
            addCriterion("pc_salelv between", value1, value2, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andPcSalelvNotBetween(String value1, String value2) {
            addCriterion("pc_salelv not between", value1, value2, "pcSalelv");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNull() {
            addCriterion("Receivable_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNotNull() {
            addCriterion("Receivable_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdEqualTo(String value) {
            addCriterion("Receivable_id =", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotEqualTo(String value) {
            addCriterion("Receivable_id <>", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThan(String value) {
            addCriterion("Receivable_id >", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThanOrEqualTo(String value) {
            addCriterion("Receivable_id >=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThan(String value) {
            addCriterion("Receivable_id <", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThanOrEqualTo(String value) {
            addCriterion("Receivable_id <=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLike(String value) {
            addCriterion("Receivable_id like", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotLike(String value) {
            addCriterion("Receivable_id not like", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIn(List<String> values) {
            addCriterion("Receivable_id in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotIn(List<String> values) {
            addCriterion("Receivable_id not in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdBetween(String value1, String value2) {
            addCriterion("Receivable_id between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotBetween(String value1, String value2) {
            addCriterion("Receivable_id not between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayIsNull() {
            addCriterion("pc_cuendorderday is null");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayIsNotNull() {
            addCriterion("pc_cuendorderday is not null");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayEqualTo(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday =", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday <>", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayGreaterThan(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday >", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday >=", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayLessThan(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday <", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pc_cuendorderday <=", value, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayIn(List<Date> values) {
            addCriterionForJDBCDate("pc_cuendorderday in", values, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("pc_cuendorderday not in", values, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pc_cuendorderday between", value1, value2, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andPcCuendorderdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pc_cuendorderday not between", value1, value2, "pcCuendorderday");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIsNull() {
            addCriterion("It_Accounts_eceivable_subject is null");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIsNotNull() {
            addCriterion("It_Accounts_eceivable_subject is not null");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject =", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject <>", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectGreaterThan(String value) {
            addCriterion("It_Accounts_eceivable_subject >", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject >=", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLessThan(String value) {
            addCriterion("It_Accounts_eceivable_subject <", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLessThanOrEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject <=", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLike(String value) {
            addCriterion("It_Accounts_eceivable_subject like", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotLike(String value) {
            addCriterion("It_Accounts_eceivable_subject not like", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIn(List<String> values) {
            addCriterion("It_Accounts_eceivable_subject in", values, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotIn(List<String> values) {
            addCriterion("It_Accounts_eceivable_subject not in", values, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectBetween(String value1, String value2) {
            addCriterion("It_Accounts_eceivable_subject between", value1, value2, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotBetween(String value1, String value2) {
            addCriterion("It_Accounts_eceivable_subject not between", value1, value2, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointIsNull() {
            addCriterion("pc_discountpoint is null");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointIsNotNull() {
            addCriterion("pc_discountpoint is not null");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointEqualTo(Float value) {
            addCriterion("pc_discountpoint =", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointNotEqualTo(Float value) {
            addCriterion("pc_discountpoint <>", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointGreaterThan(Float value) {
            addCriterion("pc_discountpoint >", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointGreaterThanOrEqualTo(Float value) {
            addCriterion("pc_discountpoint >=", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointLessThan(Float value) {
            addCriterion("pc_discountpoint <", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointLessThanOrEqualTo(Float value) {
            addCriterion("pc_discountpoint <=", value, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointIn(List<Float> values) {
            addCriterion("pc_discountpoint in", values, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointNotIn(List<Float> values) {
            addCriterion("pc_discountpoint not in", values, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointBetween(Float value1, Float value2) {
            addCriterion("pc_discountpoint between", value1, value2, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcDiscountpointNotBetween(Float value1, Float value2) {
            addCriterion("pc_discountpoint not between", value1, value2, "pcDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvIsNull() {
            addCriterion("pc_honestlv is null");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvIsNotNull() {
            addCriterion("pc_honestlv is not null");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvEqualTo(String value) {
            addCriterion("pc_honestlv =", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvNotEqualTo(String value) {
            addCriterion("pc_honestlv <>", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvGreaterThan(String value) {
            addCriterion("pc_honestlv >", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvGreaterThanOrEqualTo(String value) {
            addCriterion("pc_honestlv >=", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvLessThan(String value) {
            addCriterion("pc_honestlv <", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvLessThanOrEqualTo(String value) {
            addCriterion("pc_honestlv <=", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvLike(String value) {
            addCriterion("pc_honestlv like", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvNotLike(String value) {
            addCriterion("pc_honestlv not like", value, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvIn(List<String> values) {
            addCriterion("pc_honestlv in", values, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvNotIn(List<String> values) {
            addCriterion("pc_honestlv not in", values, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvBetween(String value1, String value2) {
            addCriterion("pc_honestlv between", value1, value2, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcHonestlvNotBetween(String value1, String value2) {
            addCriterion("pc_honestlv not between", value1, value2, "pcHonestlv");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxIsNull() {
            addCriterion("pc_cuiftax is null");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxIsNotNull() {
            addCriterion("pc_cuiftax is not null");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxEqualTo(Integer value) {
            addCriterion("pc_cuiftax =", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxNotEqualTo(Integer value) {
            addCriterion("pc_cuiftax <>", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxGreaterThan(Integer value) {
            addCriterion("pc_cuiftax >", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_cuiftax >=", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxLessThan(Integer value) {
            addCriterion("pc_cuiftax <", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxLessThanOrEqualTo(Integer value) {
            addCriterion("pc_cuiftax <=", value, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxIn(List<Integer> values) {
            addCriterion("pc_cuiftax in", values, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxNotIn(List<Integer> values) {
            addCriterion("pc_cuiftax not in", values, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxBetween(Integer value1, Integer value2) {
            addCriterion("pc_cuiftax between", value1, value2, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andPcCuiftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_cuiftax not between", value1, value2, "pcCuiftax");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIsNull() {
            addCriterion("It_deposit_received_subject is null");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIsNotNull() {
            addCriterion("It_deposit_received_subject is not null");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectEqualTo(String value) {
            addCriterion("It_deposit_received_subject =", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotEqualTo(String value) {
            addCriterion("It_deposit_received_subject <>", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectGreaterThan(String value) {
            addCriterion("It_deposit_received_subject >", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("It_deposit_received_subject >=", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLessThan(String value) {
            addCriterion("It_deposit_received_subject <", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLessThanOrEqualTo(String value) {
            addCriterion("It_deposit_received_subject <=", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLike(String value) {
            addCriterion("It_deposit_received_subject like", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotLike(String value) {
            addCriterion("It_deposit_received_subject not like", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIn(List<String> values) {
            addCriterion("It_deposit_received_subject in", values, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotIn(List<String> values) {
            addCriterion("It_deposit_received_subject not in", values, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectBetween(String value1, String value2) {
            addCriterion("It_deposit_received_subject between", value1, value2, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotBetween(String value1, String value2) {
            addCriterion("It_deposit_received_subject not between", value1, value2, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andPcRemarkIsNull() {
            addCriterion("pc_remark is null");
            return (Criteria) this;
        }

        public Criteria andPcRemarkIsNotNull() {
            addCriterion("pc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPcRemarkEqualTo(String value) {
            addCriterion("pc_remark =", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkNotEqualTo(String value) {
            addCriterion("pc_remark <>", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkGreaterThan(String value) {
            addCriterion("pc_remark >", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pc_remark >=", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkLessThan(String value) {
            addCriterion("pc_remark <", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkLessThanOrEqualTo(String value) {
            addCriterion("pc_remark <=", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkLike(String value) {
            addCriterion("pc_remark like", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkNotLike(String value) {
            addCriterion("pc_remark not like", value, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkIn(List<String> values) {
            addCriterion("pc_remark in", values, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkNotIn(List<String> values) {
            addCriterion("pc_remark not in", values, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkBetween(String value1, String value2) {
            addCriterion("pc_remark between", value1, value2, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcRemarkNotBetween(String value1, String value2) {
            addCriterion("pc_remark not between", value1, value2, "pcRemark");
            return (Criteria) this;
        }

        public Criteria andPcAuditingIsNull() {
            addCriterion("pc_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andPcAuditingIsNotNull() {
            addCriterion("pc_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPcAuditingEqualTo(String value) {
            addCriterion("pc_Auditing =", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingNotEqualTo(String value) {
            addCriterion("pc_Auditing <>", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingGreaterThan(String value) {
            addCriterion("pc_Auditing >", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("pc_Auditing >=", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingLessThan(String value) {
            addCriterion("pc_Auditing <", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingLessThanOrEqualTo(String value) {
            addCriterion("pc_Auditing <=", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingLike(String value) {
            addCriterion("pc_Auditing like", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingNotLike(String value) {
            addCriterion("pc_Auditing not like", value, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingIn(List<String> values) {
            addCriterion("pc_Auditing in", values, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingNotIn(List<String> values) {
            addCriterion("pc_Auditing not in", values, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingBetween(String value1, String value2) {
            addCriterion("pc_Auditing between", value1, value2, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcAuditingNotBetween(String value1, String value2) {
            addCriterion("pc_Auditing not between", value1, value2, "pcAuditing");
            return (Criteria) this;
        }

        public Criteria andPcYnIsNull() {
            addCriterion("pc_yn is null");
            return (Criteria) this;
        }

        public Criteria andPcYnIsNotNull() {
            addCriterion("pc_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPcYnEqualTo(String value) {
            addCriterion("pc_yn =", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnNotEqualTo(String value) {
            addCriterion("pc_yn <>", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnGreaterThan(String value) {
            addCriterion("pc_yn >", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnGreaterThanOrEqualTo(String value) {
            addCriterion("pc_yn >=", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnLessThan(String value) {
            addCriterion("pc_yn <", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnLessThanOrEqualTo(String value) {
            addCriterion("pc_yn <=", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnLike(String value) {
            addCriterion("pc_yn like", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnNotLike(String value) {
            addCriterion("pc_yn not like", value, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnIn(List<String> values) {
            addCriterion("pc_yn in", values, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnNotIn(List<String> values) {
            addCriterion("pc_yn not in", values, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnBetween(String value1, String value2) {
            addCriterion("pc_yn between", value1, value2, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcYnNotBetween(String value1, String value2) {
            addCriterion("pc_yn not between", value1, value2, "pcYn");
            return (Criteria) this;
        }

        public Criteria andPcCustom1IsNull() {
            addCriterion("pc_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom1IsNotNull() {
            addCriterion("pc_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom1EqualTo(String value) {
            addCriterion("pc_custom1 =", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1NotEqualTo(String value) {
            addCriterion("pc_custom1 <>", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1GreaterThan(String value) {
            addCriterion("pc_custom1 >", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom1 >=", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1LessThan(String value) {
            addCriterion("pc_custom1 <", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1LessThanOrEqualTo(String value) {
            addCriterion("pc_custom1 <=", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1Like(String value) {
            addCriterion("pc_custom1 like", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1NotLike(String value) {
            addCriterion("pc_custom1 not like", value, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1In(List<String> values) {
            addCriterion("pc_custom1 in", values, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1NotIn(List<String> values) {
            addCriterion("pc_custom1 not in", values, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1Between(String value1, String value2) {
            addCriterion("pc_custom1 between", value1, value2, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom1NotBetween(String value1, String value2) {
            addCriterion("pc_custom1 not between", value1, value2, "pcCustom1");
            return (Criteria) this;
        }

        public Criteria andPcCustom2IsNull() {
            addCriterion("pc_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom2IsNotNull() {
            addCriterion("pc_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom2EqualTo(String value) {
            addCriterion("pc_custom2 =", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2NotEqualTo(String value) {
            addCriterion("pc_custom2 <>", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2GreaterThan(String value) {
            addCriterion("pc_custom2 >", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom2 >=", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2LessThan(String value) {
            addCriterion("pc_custom2 <", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2LessThanOrEqualTo(String value) {
            addCriterion("pc_custom2 <=", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2Like(String value) {
            addCriterion("pc_custom2 like", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2NotLike(String value) {
            addCriterion("pc_custom2 not like", value, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2In(List<String> values) {
            addCriterion("pc_custom2 in", values, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2NotIn(List<String> values) {
            addCriterion("pc_custom2 not in", values, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2Between(String value1, String value2) {
            addCriterion("pc_custom2 between", value1, value2, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom2NotBetween(String value1, String value2) {
            addCriterion("pc_custom2 not between", value1, value2, "pcCustom2");
            return (Criteria) this;
        }

        public Criteria andPcCustom3IsNull() {
            addCriterion("pc_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom3IsNotNull() {
            addCriterion("pc_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom3EqualTo(String value) {
            addCriterion("pc_custom3 =", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3NotEqualTo(String value) {
            addCriterion("pc_custom3 <>", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3GreaterThan(String value) {
            addCriterion("pc_custom3 >", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom3 >=", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3LessThan(String value) {
            addCriterion("pc_custom3 <", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3LessThanOrEqualTo(String value) {
            addCriterion("pc_custom3 <=", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3Like(String value) {
            addCriterion("pc_custom3 like", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3NotLike(String value) {
            addCriterion("pc_custom3 not like", value, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3In(List<String> values) {
            addCriterion("pc_custom3 in", values, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3NotIn(List<String> values) {
            addCriterion("pc_custom3 not in", values, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3Between(String value1, String value2) {
            addCriterion("pc_custom3 between", value1, value2, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom3NotBetween(String value1, String value2) {
            addCriterion("pc_custom3 not between", value1, value2, "pcCustom3");
            return (Criteria) this;
        }

        public Criteria andPcCustom4IsNull() {
            addCriterion("pc_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom4IsNotNull() {
            addCriterion("pc_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom4EqualTo(String value) {
            addCriterion("pc_custom4 =", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4NotEqualTo(String value) {
            addCriterion("pc_custom4 <>", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4GreaterThan(String value) {
            addCriterion("pc_custom4 >", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom4 >=", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4LessThan(String value) {
            addCriterion("pc_custom4 <", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4LessThanOrEqualTo(String value) {
            addCriterion("pc_custom4 <=", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4Like(String value) {
            addCriterion("pc_custom4 like", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4NotLike(String value) {
            addCriterion("pc_custom4 not like", value, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4In(List<String> values) {
            addCriterion("pc_custom4 in", values, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4NotIn(List<String> values) {
            addCriterion("pc_custom4 not in", values, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4Between(String value1, String value2) {
            addCriterion("pc_custom4 between", value1, value2, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom4NotBetween(String value1, String value2) {
            addCriterion("pc_custom4 not between", value1, value2, "pcCustom4");
            return (Criteria) this;
        }

        public Criteria andPcCustom5IsNull() {
            addCriterion("pc_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom5IsNotNull() {
            addCriterion("pc_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom5EqualTo(String value) {
            addCriterion("pc_custom5 =", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5NotEqualTo(String value) {
            addCriterion("pc_custom5 <>", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5GreaterThan(String value) {
            addCriterion("pc_custom5 >", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom5 >=", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5LessThan(String value) {
            addCriterion("pc_custom5 <", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5LessThanOrEqualTo(String value) {
            addCriterion("pc_custom5 <=", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5Like(String value) {
            addCriterion("pc_custom5 like", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5NotLike(String value) {
            addCriterion("pc_custom5 not like", value, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5In(List<String> values) {
            addCriterion("pc_custom5 in", values, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5NotIn(List<String> values) {
            addCriterion("pc_custom5 not in", values, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5Between(String value1, String value2) {
            addCriterion("pc_custom5 between", value1, value2, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom5NotBetween(String value1, String value2) {
            addCriterion("pc_custom5 not between", value1, value2, "pcCustom5");
            return (Criteria) this;
        }

        public Criteria andPcCustom6IsNull() {
            addCriterion("pc_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPcCustom6IsNotNull() {
            addCriterion("pc_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPcCustom6EqualTo(String value) {
            addCriterion("pc_custom6 =", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6NotEqualTo(String value) {
            addCriterion("pc_custom6 <>", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6GreaterThan(String value) {
            addCriterion("pc_custom6 >", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pc_custom6 >=", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6LessThan(String value) {
            addCriterion("pc_custom6 <", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6LessThanOrEqualTo(String value) {
            addCriterion("pc_custom6 <=", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6Like(String value) {
            addCriterion("pc_custom6 like", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6NotLike(String value) {
            addCriterion("pc_custom6 not like", value, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6In(List<String> values) {
            addCriterion("pc_custom6 in", values, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6NotIn(List<String> values) {
            addCriterion("pc_custom6 not in", values, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6Between(String value1, String value2) {
            addCriterion("pc_custom6 between", value1, value2, "pcCustom6");
            return (Criteria) this;
        }

        public Criteria andPcCustom6NotBetween(String value1, String value2) {
            addCriterion("pc_custom6 not between", value1, value2, "pcCustom6");
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