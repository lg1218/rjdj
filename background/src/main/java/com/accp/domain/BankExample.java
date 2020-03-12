package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class BankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankExample() {
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameIsNull() {
            addCriterion("bank_english_name is null");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameIsNotNull() {
            addCriterion("bank_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameEqualTo(String value) {
            addCriterion("bank_english_name =", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameNotEqualTo(String value) {
            addCriterion("bank_english_name <>", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameGreaterThan(String value) {
            addCriterion("bank_english_name >", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_english_name >=", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameLessThan(String value) {
            addCriterion("bank_english_name <", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("bank_english_name <=", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameLike(String value) {
            addCriterion("bank_english_name like", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameNotLike(String value) {
            addCriterion("bank_english_name not like", value, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameIn(List<String> values) {
            addCriterion("bank_english_name in", values, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameNotIn(List<String> values) {
            addCriterion("bank_english_name not in", values, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameBetween(String value1, String value2) {
            addCriterion("bank_english_name between", value1, value2, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankEnglishNameNotBetween(String value1, String value2) {
            addCriterion("bank_english_name not between", value1, value2, "bankEnglishName");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNull() {
            addCriterion("bank_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNotNull() {
            addCriterion("bank_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneEqualTo(String value) {
            addCriterion("bank_telephone =", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotEqualTo(String value) {
            addCriterion("bank_telephone <>", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThan(String value) {
            addCriterion("bank_telephone >", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_telephone >=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThan(String value) {
            addCriterion("bank_telephone <", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThanOrEqualTo(String value) {
            addCriterion("bank_telephone <=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLike(String value) {
            addCriterion("bank_telephone like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotLike(String value) {
            addCriterion("bank_telephone not like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIn(List<String> values) {
            addCriterion("bank_telephone in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotIn(List<String> values) {
            addCriterion("bank_telephone not in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneBetween(String value1, String value2) {
            addCriterion("bank_telephone between", value1, value2, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotBetween(String value1, String value2) {
            addCriterion("bank_telephone not between", value1, value2, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeIsNull() {
            addCriterion("bank_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeIsNotNull() {
            addCriterion("bank_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeEqualTo(String value) {
            addCriterion("bank_zipcode =", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeNotEqualTo(String value) {
            addCriterion("bank_zipcode <>", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeGreaterThan(String value) {
            addCriterion("bank_zipcode >", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_zipcode >=", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeLessThan(String value) {
            addCriterion("bank_zipcode <", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeLessThanOrEqualTo(String value) {
            addCriterion("bank_zipcode <=", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeLike(String value) {
            addCriterion("bank_zipcode like", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeNotLike(String value) {
            addCriterion("bank_zipcode not like", value, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeIn(List<String> values) {
            addCriterion("bank_zipcode in", values, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeNotIn(List<String> values) {
            addCriterion("bank_zipcode not in", values, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeBetween(String value1, String value2) {
            addCriterion("bank_zipcode between", value1, value2, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankZipcodeNotBetween(String value1, String value2) {
            addCriterion("bank_zipcode not between", value1, value2, "bankZipcode");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankRemarkIsNull() {
            addCriterion("bank_remark is null");
            return (Criteria) this;
        }

        public Criteria andBankRemarkIsNotNull() {
            addCriterion("bank_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBankRemarkEqualTo(String value) {
            addCriterion("bank_remark =", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkNotEqualTo(String value) {
            addCriterion("bank_remark <>", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkGreaterThan(String value) {
            addCriterion("bank_remark >", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bank_remark >=", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkLessThan(String value) {
            addCriterion("bank_remark <", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkLessThanOrEqualTo(String value) {
            addCriterion("bank_remark <=", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkLike(String value) {
            addCriterion("bank_remark like", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkNotLike(String value) {
            addCriterion("bank_remark not like", value, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkIn(List<String> values) {
            addCriterion("bank_remark in", values, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkNotIn(List<String> values) {
            addCriterion("bank_remark not in", values, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkBetween(String value1, String value2) {
            addCriterion("bank_remark between", value1, value2, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankRemarkNotBetween(String value1, String value2) {
            addCriterion("bank_remark not between", value1, value2, "bankRemark");
            return (Criteria) this;
        }

        public Criteria andBankYnIsNull() {
            addCriterion("bank_yn is null");
            return (Criteria) this;
        }

        public Criteria andBankYnIsNotNull() {
            addCriterion("bank_yn is not null");
            return (Criteria) this;
        }

        public Criteria andBankYnEqualTo(String value) {
            addCriterion("bank_yn =", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnNotEqualTo(String value) {
            addCriterion("bank_yn <>", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnGreaterThan(String value) {
            addCriterion("bank_yn >", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnGreaterThanOrEqualTo(String value) {
            addCriterion("bank_yn >=", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnLessThan(String value) {
            addCriterion("bank_yn <", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnLessThanOrEqualTo(String value) {
            addCriterion("bank_yn <=", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnLike(String value) {
            addCriterion("bank_yn like", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnNotLike(String value) {
            addCriterion("bank_yn not like", value, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnIn(List<String> values) {
            addCriterion("bank_yn in", values, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnNotIn(List<String> values) {
            addCriterion("bank_yn not in", values, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnBetween(String value1, String value2) {
            addCriterion("bank_yn between", value1, value2, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankYnNotBetween(String value1, String value2) {
            addCriterion("bank_yn not between", value1, value2, "bankYn");
            return (Criteria) this;
        }

        public Criteria andBankCustom1IsNull() {
            addCriterion("bank_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom1IsNotNull() {
            addCriterion("bank_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom1EqualTo(String value) {
            addCriterion("bank_custom1 =", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1NotEqualTo(String value) {
            addCriterion("bank_custom1 <>", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1GreaterThan(String value) {
            addCriterion("bank_custom1 >", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom1 >=", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1LessThan(String value) {
            addCriterion("bank_custom1 <", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1LessThanOrEqualTo(String value) {
            addCriterion("bank_custom1 <=", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1Like(String value) {
            addCriterion("bank_custom1 like", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1NotLike(String value) {
            addCriterion("bank_custom1 not like", value, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1In(List<String> values) {
            addCriterion("bank_custom1 in", values, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1NotIn(List<String> values) {
            addCriterion("bank_custom1 not in", values, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1Between(String value1, String value2) {
            addCriterion("bank_custom1 between", value1, value2, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom1NotBetween(String value1, String value2) {
            addCriterion("bank_custom1 not between", value1, value2, "bankCustom1");
            return (Criteria) this;
        }

        public Criteria andBankCustom2IsNull() {
            addCriterion("bank_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom2IsNotNull() {
            addCriterion("bank_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom2EqualTo(String value) {
            addCriterion("bank_custom2 =", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2NotEqualTo(String value) {
            addCriterion("bank_custom2 <>", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2GreaterThan(String value) {
            addCriterion("bank_custom2 >", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom2 >=", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2LessThan(String value) {
            addCriterion("bank_custom2 <", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2LessThanOrEqualTo(String value) {
            addCriterion("bank_custom2 <=", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2Like(String value) {
            addCriterion("bank_custom2 like", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2NotLike(String value) {
            addCriterion("bank_custom2 not like", value, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2In(List<String> values) {
            addCriterion("bank_custom2 in", values, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2NotIn(List<String> values) {
            addCriterion("bank_custom2 not in", values, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2Between(String value1, String value2) {
            addCriterion("bank_custom2 between", value1, value2, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom2NotBetween(String value1, String value2) {
            addCriterion("bank_custom2 not between", value1, value2, "bankCustom2");
            return (Criteria) this;
        }

        public Criteria andBankCustom3IsNull() {
            addCriterion("bank_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom3IsNotNull() {
            addCriterion("bank_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom3EqualTo(String value) {
            addCriterion("bank_custom3 =", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3NotEqualTo(String value) {
            addCriterion("bank_custom3 <>", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3GreaterThan(String value) {
            addCriterion("bank_custom3 >", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom3 >=", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3LessThan(String value) {
            addCriterion("bank_custom3 <", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3LessThanOrEqualTo(String value) {
            addCriterion("bank_custom3 <=", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3Like(String value) {
            addCriterion("bank_custom3 like", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3NotLike(String value) {
            addCriterion("bank_custom3 not like", value, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3In(List<String> values) {
            addCriterion("bank_custom3 in", values, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3NotIn(List<String> values) {
            addCriterion("bank_custom3 not in", values, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3Between(String value1, String value2) {
            addCriterion("bank_custom3 between", value1, value2, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom3NotBetween(String value1, String value2) {
            addCriterion("bank_custom3 not between", value1, value2, "bankCustom3");
            return (Criteria) this;
        }

        public Criteria andBankCustom4IsNull() {
            addCriterion("bank_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom4IsNotNull() {
            addCriterion("bank_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom4EqualTo(String value) {
            addCriterion("bank_custom4 =", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4NotEqualTo(String value) {
            addCriterion("bank_custom4 <>", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4GreaterThan(String value) {
            addCriterion("bank_custom4 >", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom4 >=", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4LessThan(String value) {
            addCriterion("bank_custom4 <", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4LessThanOrEqualTo(String value) {
            addCriterion("bank_custom4 <=", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4Like(String value) {
            addCriterion("bank_custom4 like", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4NotLike(String value) {
            addCriterion("bank_custom4 not like", value, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4In(List<String> values) {
            addCriterion("bank_custom4 in", values, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4NotIn(List<String> values) {
            addCriterion("bank_custom4 not in", values, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4Between(String value1, String value2) {
            addCriterion("bank_custom4 between", value1, value2, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom4NotBetween(String value1, String value2) {
            addCriterion("bank_custom4 not between", value1, value2, "bankCustom4");
            return (Criteria) this;
        }

        public Criteria andBankCustom5IsNull() {
            addCriterion("bank_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom5IsNotNull() {
            addCriterion("bank_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom5EqualTo(String value) {
            addCriterion("bank_custom5 =", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5NotEqualTo(String value) {
            addCriterion("bank_custom5 <>", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5GreaterThan(String value) {
            addCriterion("bank_custom5 >", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom5 >=", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5LessThan(String value) {
            addCriterion("bank_custom5 <", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5LessThanOrEqualTo(String value) {
            addCriterion("bank_custom5 <=", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5Like(String value) {
            addCriterion("bank_custom5 like", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5NotLike(String value) {
            addCriterion("bank_custom5 not like", value, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5In(List<String> values) {
            addCriterion("bank_custom5 in", values, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5NotIn(List<String> values) {
            addCriterion("bank_custom5 not in", values, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5Between(String value1, String value2) {
            addCriterion("bank_custom5 between", value1, value2, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom5NotBetween(String value1, String value2) {
            addCriterion("bank_custom5 not between", value1, value2, "bankCustom5");
            return (Criteria) this;
        }

        public Criteria andBankCustom6IsNull() {
            addCriterion("bank_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andBankCustom6IsNotNull() {
            addCriterion("bank_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustom6EqualTo(String value) {
            addCriterion("bank_custom6 =", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6NotEqualTo(String value) {
            addCriterion("bank_custom6 <>", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6GreaterThan(String value) {
            addCriterion("bank_custom6 >", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("bank_custom6 >=", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6LessThan(String value) {
            addCriterion("bank_custom6 <", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6LessThanOrEqualTo(String value) {
            addCriterion("bank_custom6 <=", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6Like(String value) {
            addCriterion("bank_custom6 like", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6NotLike(String value) {
            addCriterion("bank_custom6 not like", value, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6In(List<String> values) {
            addCriterion("bank_custom6 in", values, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6NotIn(List<String> values) {
            addCriterion("bank_custom6 not in", values, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6Between(String value1, String value2) {
            addCriterion("bank_custom6 between", value1, value2, "bankCustom6");
            return (Criteria) this;
        }

        public Criteria andBankCustom6NotBetween(String value1, String value2) {
            addCriterion("bank_custom6 not between", value1, value2, "bankCustom6");
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