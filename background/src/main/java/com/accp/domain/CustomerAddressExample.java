package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerAddressExample() {
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

        public Criteria andCaAddressidIsNull() {
            addCriterion("ca_addressid is null");
            return (Criteria) this;
        }

        public Criteria andCaAddressidIsNotNull() {
            addCriterion("ca_addressid is not null");
            return (Criteria) this;
        }

        public Criteria andCaAddressidEqualTo(String value) {
            addCriterion("ca_addressid =", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidNotEqualTo(String value) {
            addCriterion("ca_addressid <>", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidGreaterThan(String value) {
            addCriterion("ca_addressid >", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("ca_addressid >=", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidLessThan(String value) {
            addCriterion("ca_addressid <", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidLessThanOrEqualTo(String value) {
            addCriterion("ca_addressid <=", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidLike(String value) {
            addCriterion("ca_addressid like", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidNotLike(String value) {
            addCriterion("ca_addressid not like", value, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidIn(List<String> values) {
            addCriterion("ca_addressid in", values, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidNotIn(List<String> values) {
            addCriterion("ca_addressid not in", values, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidBetween(String value1, String value2) {
            addCriterion("ca_addressid between", value1, value2, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressidNotBetween(String value1, String value2) {
            addCriterion("ca_addressid not between", value1, value2, "caAddressid");
            return (Criteria) this;
        }

        public Criteria andCaAddressIsNull() {
            addCriterion("ca_address is null");
            return (Criteria) this;
        }

        public Criteria andCaAddressIsNotNull() {
            addCriterion("ca_address is not null");
            return (Criteria) this;
        }

        public Criteria andCaAddressEqualTo(String value) {
            addCriterion("ca_address =", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressNotEqualTo(String value) {
            addCriterion("ca_address <>", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressGreaterThan(String value) {
            addCriterion("ca_address >", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ca_address >=", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressLessThan(String value) {
            addCriterion("ca_address <", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressLessThanOrEqualTo(String value) {
            addCriterion("ca_address <=", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressLike(String value) {
            addCriterion("ca_address like", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressNotLike(String value) {
            addCriterion("ca_address not like", value, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressIn(List<String> values) {
            addCriterion("ca_address in", values, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressNotIn(List<String> values) {
            addCriterion("ca_address not in", values, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressBetween(String value1, String value2) {
            addCriterion("ca_address between", value1, value2, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaAddressNotBetween(String value1, String value2) {
            addCriterion("ca_address not between", value1, value2, "caAddress");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeIsNull() {
            addCriterion("ca_postcode is null");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeIsNotNull() {
            addCriterion("ca_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeEqualTo(String value) {
            addCriterion("ca_postcode =", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeNotEqualTo(String value) {
            addCriterion("ca_postcode <>", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeGreaterThan(String value) {
            addCriterion("ca_postcode >", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ca_postcode >=", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeLessThan(String value) {
            addCriterion("ca_postcode <", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeLessThanOrEqualTo(String value) {
            addCriterion("ca_postcode <=", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeLike(String value) {
            addCriterion("ca_postcode like", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeNotLike(String value) {
            addCriterion("ca_postcode not like", value, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeIn(List<String> values) {
            addCriterion("ca_postcode in", values, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeNotIn(List<String> values) {
            addCriterion("ca_postcode not in", values, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeBetween(String value1, String value2) {
            addCriterion("ca_postcode between", value1, value2, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaPostcodeNotBetween(String value1, String value2) {
            addCriterion("ca_postcode not between", value1, value2, "caPostcode");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanIsNull() {
            addCriterion("ca_alinkman is null");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanIsNotNull() {
            addCriterion("ca_alinkman is not null");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanEqualTo(String value) {
            addCriterion("ca_alinkman =", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanNotEqualTo(String value) {
            addCriterion("ca_alinkman <>", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanGreaterThan(String value) {
            addCriterion("ca_alinkman >", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("ca_alinkman >=", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanLessThan(String value) {
            addCriterion("ca_alinkman <", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanLessThanOrEqualTo(String value) {
            addCriterion("ca_alinkman <=", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanLike(String value) {
            addCriterion("ca_alinkman like", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanNotLike(String value) {
            addCriterion("ca_alinkman not like", value, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanIn(List<String> values) {
            addCriterion("ca_alinkman in", values, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanNotIn(List<String> values) {
            addCriterion("ca_alinkman not in", values, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanBetween(String value1, String value2) {
            addCriterion("ca_alinkman between", value1, value2, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaAlinkmanNotBetween(String value1, String value2) {
            addCriterion("ca_alinkman not between", value1, value2, "caAlinkman");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameIsNull() {
            addCriterion("ca_linkmaneasyname is null");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameIsNotNull() {
            addCriterion("ca_linkmaneasyname is not null");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameEqualTo(String value) {
            addCriterion("ca_linkmaneasyname =", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameNotEqualTo(String value) {
            addCriterion("ca_linkmaneasyname <>", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameGreaterThan(String value) {
            addCriterion("ca_linkmaneasyname >", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameGreaterThanOrEqualTo(String value) {
            addCriterion("ca_linkmaneasyname >=", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameLessThan(String value) {
            addCriterion("ca_linkmaneasyname <", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameLessThanOrEqualTo(String value) {
            addCriterion("ca_linkmaneasyname <=", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameLike(String value) {
            addCriterion("ca_linkmaneasyname like", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameNotLike(String value) {
            addCriterion("ca_linkmaneasyname not like", value, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameIn(List<String> values) {
            addCriterion("ca_linkmaneasyname in", values, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameNotIn(List<String> values) {
            addCriterion("ca_linkmaneasyname not in", values, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameBetween(String value1, String value2) {
            addCriterion("ca_linkmaneasyname between", value1, value2, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaLinkmaneasynameNotBetween(String value1, String value2) {
            addCriterion("ca_linkmaneasyname not between", value1, value2, "caLinkmaneasyname");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoIsNull() {
            addCriterion("ca_afaxno is null");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoIsNotNull() {
            addCriterion("ca_afaxno is not null");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoEqualTo(String value) {
            addCriterion("ca_afaxno =", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoNotEqualTo(String value) {
            addCriterion("ca_afaxno <>", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoGreaterThan(String value) {
            addCriterion("ca_afaxno >", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("ca_afaxno >=", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoLessThan(String value) {
            addCriterion("ca_afaxno <", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoLessThanOrEqualTo(String value) {
            addCriterion("ca_afaxno <=", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoLike(String value) {
            addCriterion("ca_afaxno like", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoNotLike(String value) {
            addCriterion("ca_afaxno not like", value, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoIn(List<String> values) {
            addCriterion("ca_afaxno in", values, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoNotIn(List<String> values) {
            addCriterion("ca_afaxno not in", values, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoBetween(String value1, String value2) {
            addCriterion("ca_afaxno between", value1, value2, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaAfaxnoNotBetween(String value1, String value2) {
            addCriterion("ca_afaxno not between", value1, value2, "caAfaxno");
            return (Criteria) this;
        }

        public Criteria andCaWayIsNull() {
            addCriterion("ca_way is null");
            return (Criteria) this;
        }

        public Criteria andCaWayIsNotNull() {
            addCriterion("ca_way is not null");
            return (Criteria) this;
        }

        public Criteria andCaWayEqualTo(String value) {
            addCriterion("ca_way =", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayNotEqualTo(String value) {
            addCriterion("ca_way <>", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayGreaterThan(String value) {
            addCriterion("ca_way >", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayGreaterThanOrEqualTo(String value) {
            addCriterion("ca_way >=", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayLessThan(String value) {
            addCriterion("ca_way <", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayLessThanOrEqualTo(String value) {
            addCriterion("ca_way <=", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayLike(String value) {
            addCriterion("ca_way like", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayNotLike(String value) {
            addCriterion("ca_way not like", value, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayIn(List<String> values) {
            addCriterion("ca_way in", values, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayNotIn(List<String> values) {
            addCriterion("ca_way not in", values, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayBetween(String value1, String value2) {
            addCriterion("ca_way between", value1, value2, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaWayNotBetween(String value1, String value2) {
            addCriterion("ca_way not between", value1, value2, "caWay");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationIsNull() {
            addCriterion("ca_adecoration is null");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationIsNotNull() {
            addCriterion("ca_adecoration is not null");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationEqualTo(String value) {
            addCriterion("ca_adecoration =", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationNotEqualTo(String value) {
            addCriterion("ca_adecoration <>", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationGreaterThan(String value) {
            addCriterion("ca_adecoration >", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationGreaterThanOrEqualTo(String value) {
            addCriterion("ca_adecoration >=", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationLessThan(String value) {
            addCriterion("ca_adecoration <", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationLessThanOrEqualTo(String value) {
            addCriterion("ca_adecoration <=", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationLike(String value) {
            addCriterion("ca_adecoration like", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationNotLike(String value) {
            addCriterion("ca_adecoration not like", value, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationIn(List<String> values) {
            addCriterion("ca_adecoration in", values, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationNotIn(List<String> values) {
            addCriterion("ca_adecoration not in", values, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationBetween(String value1, String value2) {
            addCriterion("ca_adecoration between", value1, value2, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCaAdecorationNotBetween(String value1, String value2) {
            addCriterion("ca_adecoration not between", value1, value2, "caAdecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCaAuditingIsNull() {
            addCriterion("ca_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCaAuditingIsNotNull() {
            addCriterion("ca_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCaAuditingEqualTo(String value) {
            addCriterion("ca_Auditing =", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingNotEqualTo(String value) {
            addCriterion("ca_Auditing <>", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingGreaterThan(String value) {
            addCriterion("ca_Auditing >", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ca_Auditing >=", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingLessThan(String value) {
            addCriterion("ca_Auditing <", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingLessThanOrEqualTo(String value) {
            addCriterion("ca_Auditing <=", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingLike(String value) {
            addCriterion("ca_Auditing like", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingNotLike(String value) {
            addCriterion("ca_Auditing not like", value, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingIn(List<String> values) {
            addCriterion("ca_Auditing in", values, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingNotIn(List<String> values) {
            addCriterion("ca_Auditing not in", values, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingBetween(String value1, String value2) {
            addCriterion("ca_Auditing between", value1, value2, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaAuditingNotBetween(String value1, String value2) {
            addCriterion("ca_Auditing not between", value1, value2, "caAuditing");
            return (Criteria) this;
        }

        public Criteria andCaYnIsNull() {
            addCriterion("ca_yn is null");
            return (Criteria) this;
        }

        public Criteria andCaYnIsNotNull() {
            addCriterion("ca_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCaYnEqualTo(String value) {
            addCriterion("ca_yn =", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnNotEqualTo(String value) {
            addCriterion("ca_yn <>", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnGreaterThan(String value) {
            addCriterion("ca_yn >", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnGreaterThanOrEqualTo(String value) {
            addCriterion("ca_yn >=", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnLessThan(String value) {
            addCriterion("ca_yn <", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnLessThanOrEqualTo(String value) {
            addCriterion("ca_yn <=", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnLike(String value) {
            addCriterion("ca_yn like", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnNotLike(String value) {
            addCriterion("ca_yn not like", value, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnIn(List<String> values) {
            addCriterion("ca_yn in", values, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnNotIn(List<String> values) {
            addCriterion("ca_yn not in", values, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnBetween(String value1, String value2) {
            addCriterion("ca_yn between", value1, value2, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaYnNotBetween(String value1, String value2) {
            addCriterion("ca_yn not between", value1, value2, "caYn");
            return (Criteria) this;
        }

        public Criteria andCaCustom1IsNull() {
            addCriterion("ca_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom1IsNotNull() {
            addCriterion("ca_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom1EqualTo(String value) {
            addCriterion("ca_custom1 =", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1NotEqualTo(String value) {
            addCriterion("ca_custom1 <>", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1GreaterThan(String value) {
            addCriterion("ca_custom1 >", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom1 >=", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1LessThan(String value) {
            addCriterion("ca_custom1 <", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1LessThanOrEqualTo(String value) {
            addCriterion("ca_custom1 <=", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1Like(String value) {
            addCriterion("ca_custom1 like", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1NotLike(String value) {
            addCriterion("ca_custom1 not like", value, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1In(List<String> values) {
            addCriterion("ca_custom1 in", values, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1NotIn(List<String> values) {
            addCriterion("ca_custom1 not in", values, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1Between(String value1, String value2) {
            addCriterion("ca_custom1 between", value1, value2, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom1NotBetween(String value1, String value2) {
            addCriterion("ca_custom1 not between", value1, value2, "caCustom1");
            return (Criteria) this;
        }

        public Criteria andCaCustom2IsNull() {
            addCriterion("ca_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom2IsNotNull() {
            addCriterion("ca_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom2EqualTo(String value) {
            addCriterion("ca_custom2 =", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2NotEqualTo(String value) {
            addCriterion("ca_custom2 <>", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2GreaterThan(String value) {
            addCriterion("ca_custom2 >", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom2 >=", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2LessThan(String value) {
            addCriterion("ca_custom2 <", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2LessThanOrEqualTo(String value) {
            addCriterion("ca_custom2 <=", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2Like(String value) {
            addCriterion("ca_custom2 like", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2NotLike(String value) {
            addCriterion("ca_custom2 not like", value, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2In(List<String> values) {
            addCriterion("ca_custom2 in", values, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2NotIn(List<String> values) {
            addCriterion("ca_custom2 not in", values, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2Between(String value1, String value2) {
            addCriterion("ca_custom2 between", value1, value2, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom2NotBetween(String value1, String value2) {
            addCriterion("ca_custom2 not between", value1, value2, "caCustom2");
            return (Criteria) this;
        }

        public Criteria andCaCustom3IsNull() {
            addCriterion("ca_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom3IsNotNull() {
            addCriterion("ca_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom3EqualTo(String value) {
            addCriterion("ca_custom3 =", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3NotEqualTo(String value) {
            addCriterion("ca_custom3 <>", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3GreaterThan(String value) {
            addCriterion("ca_custom3 >", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom3 >=", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3LessThan(String value) {
            addCriterion("ca_custom3 <", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3LessThanOrEqualTo(String value) {
            addCriterion("ca_custom3 <=", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3Like(String value) {
            addCriterion("ca_custom3 like", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3NotLike(String value) {
            addCriterion("ca_custom3 not like", value, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3In(List<String> values) {
            addCriterion("ca_custom3 in", values, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3NotIn(List<String> values) {
            addCriterion("ca_custom3 not in", values, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3Between(String value1, String value2) {
            addCriterion("ca_custom3 between", value1, value2, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom3NotBetween(String value1, String value2) {
            addCriterion("ca_custom3 not between", value1, value2, "caCustom3");
            return (Criteria) this;
        }

        public Criteria andCaCustom4IsNull() {
            addCriterion("ca_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom4IsNotNull() {
            addCriterion("ca_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom4EqualTo(String value) {
            addCriterion("ca_custom4 =", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4NotEqualTo(String value) {
            addCriterion("ca_custom4 <>", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4GreaterThan(String value) {
            addCriterion("ca_custom4 >", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom4 >=", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4LessThan(String value) {
            addCriterion("ca_custom4 <", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4LessThanOrEqualTo(String value) {
            addCriterion("ca_custom4 <=", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4Like(String value) {
            addCriterion("ca_custom4 like", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4NotLike(String value) {
            addCriterion("ca_custom4 not like", value, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4In(List<String> values) {
            addCriterion("ca_custom4 in", values, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4NotIn(List<String> values) {
            addCriterion("ca_custom4 not in", values, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4Between(String value1, String value2) {
            addCriterion("ca_custom4 between", value1, value2, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom4NotBetween(String value1, String value2) {
            addCriterion("ca_custom4 not between", value1, value2, "caCustom4");
            return (Criteria) this;
        }

        public Criteria andCaCustom5IsNull() {
            addCriterion("ca_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom5IsNotNull() {
            addCriterion("ca_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom5EqualTo(String value) {
            addCriterion("ca_custom5 =", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5NotEqualTo(String value) {
            addCriterion("ca_custom5 <>", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5GreaterThan(String value) {
            addCriterion("ca_custom5 >", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom5 >=", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5LessThan(String value) {
            addCriterion("ca_custom5 <", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5LessThanOrEqualTo(String value) {
            addCriterion("ca_custom5 <=", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5Like(String value) {
            addCriterion("ca_custom5 like", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5NotLike(String value) {
            addCriterion("ca_custom5 not like", value, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5In(List<String> values) {
            addCriterion("ca_custom5 in", values, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5NotIn(List<String> values) {
            addCriterion("ca_custom5 not in", values, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5Between(String value1, String value2) {
            addCriterion("ca_custom5 between", value1, value2, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom5NotBetween(String value1, String value2) {
            addCriterion("ca_custom5 not between", value1, value2, "caCustom5");
            return (Criteria) this;
        }

        public Criteria andCaCustom6IsNull() {
            addCriterion("ca_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCaCustom6IsNotNull() {
            addCriterion("ca_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCaCustom6EqualTo(String value) {
            addCriterion("ca_custom6 =", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6NotEqualTo(String value) {
            addCriterion("ca_custom6 <>", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6GreaterThan(String value) {
            addCriterion("ca_custom6 >", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ca_custom6 >=", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6LessThan(String value) {
            addCriterion("ca_custom6 <", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6LessThanOrEqualTo(String value) {
            addCriterion("ca_custom6 <=", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6Like(String value) {
            addCriterion("ca_custom6 like", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6NotLike(String value) {
            addCriterion("ca_custom6 not like", value, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6In(List<String> values) {
            addCriterion("ca_custom6 in", values, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6NotIn(List<String> values) {
            addCriterion("ca_custom6 not in", values, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6Between(String value1, String value2) {
            addCriterion("ca_custom6 between", value1, value2, "caCustom6");
            return (Criteria) this;
        }

        public Criteria andCaCustom6NotBetween(String value1, String value2) {
            addCriterion("ca_custom6 not between", value1, value2, "caCustom6");
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