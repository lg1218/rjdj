package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AdjustPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdjustPriceExample() {
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

        public Criteria andApDateidIsNull() {
            addCriterion("ap_dateid is null");
            return (Criteria) this;
        }

        public Criteria andApDateidIsNotNull() {
            addCriterion("ap_dateid is not null");
            return (Criteria) this;
        }

        public Criteria andApDateidEqualTo(String value) {
            addCriterion("ap_dateid =", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidNotEqualTo(String value) {
            addCriterion("ap_dateid <>", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidGreaterThan(String value) {
            addCriterion("ap_dateid >", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidGreaterThanOrEqualTo(String value) {
            addCriterion("ap_dateid >=", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidLessThan(String value) {
            addCriterion("ap_dateid <", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidLessThanOrEqualTo(String value) {
            addCriterion("ap_dateid <=", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidLike(String value) {
            addCriterion("ap_dateid like", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidNotLike(String value) {
            addCriterion("ap_dateid not like", value, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidIn(List<String> values) {
            addCriterion("ap_dateid in", values, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidNotIn(List<String> values) {
            addCriterion("ap_dateid not in", values, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidBetween(String value1, String value2) {
            addCriterion("ap_dateid between", value1, value2, "apDateid");
            return (Criteria) this;
        }

        public Criteria andApDateidNotBetween(String value1, String value2) {
            addCriterion("ap_dateid not between", value1, value2, "apDateid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNull() {
            addCriterion("materialid is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialid is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(String value) {
            addCriterion("materialid =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(String value) {
            addCriterion("materialid <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(String value) {
            addCriterion("materialid >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(String value) {
            addCriterion("materialid >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(String value) {
            addCriterion("materialid <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(String value) {
            addCriterion("materialid <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLike(String value) {
            addCriterion("materialid like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotLike(String value) {
            addCriterion("materialid not like", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<String> values) {
            addCriterion("materialid in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<String> values) {
            addCriterion("materialid not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(String value1, String value2) {
            addCriterion("materialid between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(String value1, String value2) {
            addCriterion("materialid not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidIsNull() {
            addCriterion("updowmid is null");
            return (Criteria) this;
        }

        public Criteria andUpdowmidIsNotNull() {
            addCriterion("updowmid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdowmidEqualTo(String value) {
            addCriterion("updowmid =", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidNotEqualTo(String value) {
            addCriterion("updowmid <>", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidGreaterThan(String value) {
            addCriterion("updowmid >", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidGreaterThanOrEqualTo(String value) {
            addCriterion("updowmid >=", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidLessThan(String value) {
            addCriterion("updowmid <", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidLessThanOrEqualTo(String value) {
            addCriterion("updowmid <=", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidLike(String value) {
            addCriterion("updowmid like", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidNotLike(String value) {
            addCriterion("updowmid not like", value, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidIn(List<String> values) {
            addCriterion("updowmid in", values, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidNotIn(List<String> values) {
            addCriterion("updowmid not in", values, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidBetween(String value1, String value2) {
            addCriterion("updowmid between", value1, value2, "updowmid");
            return (Criteria) this;
        }

        public Criteria andUpdowmidNotBetween(String value1, String value2) {
            addCriterion("updowmid not between", value1, value2, "updowmid");
            return (Criteria) this;
        }

        public Criteria andApPriceIsNull() {
            addCriterion("ap_price is null");
            return (Criteria) this;
        }

        public Criteria andApPriceIsNotNull() {
            addCriterion("ap_price is not null");
            return (Criteria) this;
        }

        public Criteria andApPriceEqualTo(Float value) {
            addCriterion("ap_price =", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceNotEqualTo(Float value) {
            addCriterion("ap_price <>", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceGreaterThan(Float value) {
            addCriterion("ap_price >", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ap_price >=", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceLessThan(Float value) {
            addCriterion("ap_price <", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceLessThanOrEqualTo(Float value) {
            addCriterion("ap_price <=", value, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceIn(List<Float> values) {
            addCriterion("ap_price in", values, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceNotIn(List<Float> values) {
            addCriterion("ap_price not in", values, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceBetween(Float value1, Float value2) {
            addCriterion("ap_price between", value1, value2, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApPriceNotBetween(Float value1, Float value2) {
            addCriterion("ap_price not between", value1, value2, "apPrice");
            return (Criteria) this;
        }

        public Criteria andApDecorationIsNull() {
            addCriterion("ap_decoration is null");
            return (Criteria) this;
        }

        public Criteria andApDecorationIsNotNull() {
            addCriterion("ap_decoration is not null");
            return (Criteria) this;
        }

        public Criteria andApDecorationEqualTo(String value) {
            addCriterion("ap_decoration =", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationNotEqualTo(String value) {
            addCriterion("ap_decoration <>", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationGreaterThan(String value) {
            addCriterion("ap_decoration >", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("ap_decoration >=", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationLessThan(String value) {
            addCriterion("ap_decoration <", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationLessThanOrEqualTo(String value) {
            addCriterion("ap_decoration <=", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationLike(String value) {
            addCriterion("ap_decoration like", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationNotLike(String value) {
            addCriterion("ap_decoration not like", value, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationIn(List<String> values) {
            addCriterion("ap_decoration in", values, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationNotIn(List<String> values) {
            addCriterion("ap_decoration not in", values, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationBetween(String value1, String value2) {
            addCriterion("ap_decoration between", value1, value2, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDecorationNotBetween(String value1, String value2) {
            addCriterion("ap_decoration not between", value1, value2, "apDecoration");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanIsNull() {
            addCriterion("ap_doworkman is null");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanIsNotNull() {
            addCriterion("ap_doworkman is not null");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanEqualTo(String value) {
            addCriterion("ap_doworkman =", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanNotEqualTo(String value) {
            addCriterion("ap_doworkman <>", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanGreaterThan(String value) {
            addCriterion("ap_doworkman >", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanGreaterThanOrEqualTo(String value) {
            addCriterion("ap_doworkman >=", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanLessThan(String value) {
            addCriterion("ap_doworkman <", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanLessThanOrEqualTo(String value) {
            addCriterion("ap_doworkman <=", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanLike(String value) {
            addCriterion("ap_doworkman like", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanNotLike(String value) {
            addCriterion("ap_doworkman not like", value, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanIn(List<String> values) {
            addCriterion("ap_doworkman in", values, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanNotIn(List<String> values) {
            addCriterion("ap_doworkman not in", values, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanBetween(String value1, String value2) {
            addCriterion("ap_doworkman between", value1, value2, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApDoworkmanNotBetween(String value1, String value2) {
            addCriterion("ap_doworkman not between", value1, value2, "apDoworkman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanIsNull() {
            addCriterion("ap_recheckman is null");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanIsNotNull() {
            addCriterion("ap_recheckman is not null");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanEqualTo(String value) {
            addCriterion("ap_recheckman =", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanNotEqualTo(String value) {
            addCriterion("ap_recheckman <>", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanGreaterThan(String value) {
            addCriterion("ap_recheckman >", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanGreaterThanOrEqualTo(String value) {
            addCriterion("ap_recheckman >=", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanLessThan(String value) {
            addCriterion("ap_recheckman <", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanLessThanOrEqualTo(String value) {
            addCriterion("ap_recheckman <=", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanLike(String value) {
            addCriterion("ap_recheckman like", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanNotLike(String value) {
            addCriterion("ap_recheckman not like", value, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanIn(List<String> values) {
            addCriterion("ap_recheckman in", values, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanNotIn(List<String> values) {
            addCriterion("ap_recheckman not in", values, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanBetween(String value1, String value2) {
            addCriterion("ap_recheckman between", value1, value2, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApRecheckmanNotBetween(String value1, String value2) {
            addCriterion("ap_recheckman not between", value1, value2, "apRecheckman");
            return (Criteria) this;
        }

        public Criteria andApAuditingIsNull() {
            addCriterion("ap_auditing is null");
            return (Criteria) this;
        }

        public Criteria andApAuditingIsNotNull() {
            addCriterion("ap_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andApAuditingEqualTo(String value) {
            addCriterion("ap_auditing =", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingNotEqualTo(String value) {
            addCriterion("ap_auditing <>", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingGreaterThan(String value) {
            addCriterion("ap_auditing >", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ap_auditing >=", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingLessThan(String value) {
            addCriterion("ap_auditing <", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingLessThanOrEqualTo(String value) {
            addCriterion("ap_auditing <=", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingLike(String value) {
            addCriterion("ap_auditing like", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingNotLike(String value) {
            addCriterion("ap_auditing not like", value, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingIn(List<String> values) {
            addCriterion("ap_auditing in", values, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingNotIn(List<String> values) {
            addCriterion("ap_auditing not in", values, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingBetween(String value1, String value2) {
            addCriterion("ap_auditing between", value1, value2, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApAuditingNotBetween(String value1, String value2) {
            addCriterion("ap_auditing not between", value1, value2, "apAuditing");
            return (Criteria) this;
        }

        public Criteria andApYnIsNull() {
            addCriterion("ap_yn is null");
            return (Criteria) this;
        }

        public Criteria andApYnIsNotNull() {
            addCriterion("ap_yn is not null");
            return (Criteria) this;
        }

        public Criteria andApYnEqualTo(String value) {
            addCriterion("ap_yn =", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotEqualTo(String value) {
            addCriterion("ap_yn <>", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnGreaterThan(String value) {
            addCriterion("ap_yn >", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnGreaterThanOrEqualTo(String value) {
            addCriterion("ap_yn >=", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLessThan(String value) {
            addCriterion("ap_yn <", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLessThanOrEqualTo(String value) {
            addCriterion("ap_yn <=", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLike(String value) {
            addCriterion("ap_yn like", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotLike(String value) {
            addCriterion("ap_yn not like", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnIn(List<String> values) {
            addCriterion("ap_yn in", values, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotIn(List<String> values) {
            addCriterion("ap_yn not in", values, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnBetween(String value1, String value2) {
            addCriterion("ap_yn between", value1, value2, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotBetween(String value1, String value2) {
            addCriterion("ap_yn not between", value1, value2, "apYn");
            return (Criteria) this;
        }

        public Criteria andApCustom1IsNull() {
            addCriterion("ap_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom1IsNotNull() {
            addCriterion("ap_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom1EqualTo(String value) {
            addCriterion("ap_custom1 =", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotEqualTo(String value) {
            addCriterion("ap_custom1 <>", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1GreaterThan(String value) {
            addCriterion("ap_custom1 >", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom1 >=", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1LessThan(String value) {
            addCriterion("ap_custom1 <", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1LessThanOrEqualTo(String value) {
            addCriterion("ap_custom1 <=", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1Like(String value) {
            addCriterion("ap_custom1 like", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotLike(String value) {
            addCriterion("ap_custom1 not like", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1In(List<String> values) {
            addCriterion("ap_custom1 in", values, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotIn(List<String> values) {
            addCriterion("ap_custom1 not in", values, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1Between(String value1, String value2) {
            addCriterion("ap_custom1 between", value1, value2, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotBetween(String value1, String value2) {
            addCriterion("ap_custom1 not between", value1, value2, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom2IsNull() {
            addCriterion("ap_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom2IsNotNull() {
            addCriterion("ap_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom2EqualTo(String value) {
            addCriterion("ap_custom2 =", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotEqualTo(String value) {
            addCriterion("ap_custom2 <>", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2GreaterThan(String value) {
            addCriterion("ap_custom2 >", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom2 >=", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2LessThan(String value) {
            addCriterion("ap_custom2 <", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2LessThanOrEqualTo(String value) {
            addCriterion("ap_custom2 <=", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2Like(String value) {
            addCriterion("ap_custom2 like", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotLike(String value) {
            addCriterion("ap_custom2 not like", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2In(List<String> values) {
            addCriterion("ap_custom2 in", values, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotIn(List<String> values) {
            addCriterion("ap_custom2 not in", values, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2Between(String value1, String value2) {
            addCriterion("ap_custom2 between", value1, value2, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotBetween(String value1, String value2) {
            addCriterion("ap_custom2 not between", value1, value2, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom3IsNull() {
            addCriterion("ap_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom3IsNotNull() {
            addCriterion("ap_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom3EqualTo(String value) {
            addCriterion("ap_custom3 =", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotEqualTo(String value) {
            addCriterion("ap_custom3 <>", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3GreaterThan(String value) {
            addCriterion("ap_custom3 >", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom3 >=", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3LessThan(String value) {
            addCriterion("ap_custom3 <", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3LessThanOrEqualTo(String value) {
            addCriterion("ap_custom3 <=", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3Like(String value) {
            addCriterion("ap_custom3 like", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotLike(String value) {
            addCriterion("ap_custom3 not like", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3In(List<String> values) {
            addCriterion("ap_custom3 in", values, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotIn(List<String> values) {
            addCriterion("ap_custom3 not in", values, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3Between(String value1, String value2) {
            addCriterion("ap_custom3 between", value1, value2, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotBetween(String value1, String value2) {
            addCriterion("ap_custom3 not between", value1, value2, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom4IsNull() {
            addCriterion("ap_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom4IsNotNull() {
            addCriterion("ap_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom4EqualTo(String value) {
            addCriterion("ap_custom4 =", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotEqualTo(String value) {
            addCriterion("ap_custom4 <>", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4GreaterThan(String value) {
            addCriterion("ap_custom4 >", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom4 >=", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4LessThan(String value) {
            addCriterion("ap_custom4 <", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4LessThanOrEqualTo(String value) {
            addCriterion("ap_custom4 <=", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4Like(String value) {
            addCriterion("ap_custom4 like", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotLike(String value) {
            addCriterion("ap_custom4 not like", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4In(List<String> values) {
            addCriterion("ap_custom4 in", values, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotIn(List<String> values) {
            addCriterion("ap_custom4 not in", values, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4Between(String value1, String value2) {
            addCriterion("ap_custom4 between", value1, value2, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotBetween(String value1, String value2) {
            addCriterion("ap_custom4 not between", value1, value2, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom5IsNull() {
            addCriterion("ap_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom5IsNotNull() {
            addCriterion("ap_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom5EqualTo(String value) {
            addCriterion("ap_custom5 =", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotEqualTo(String value) {
            addCriterion("ap_custom5 <>", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5GreaterThan(String value) {
            addCriterion("ap_custom5 >", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom5 >=", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5LessThan(String value) {
            addCriterion("ap_custom5 <", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5LessThanOrEqualTo(String value) {
            addCriterion("ap_custom5 <=", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5Like(String value) {
            addCriterion("ap_custom5 like", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotLike(String value) {
            addCriterion("ap_custom5 not like", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5In(List<String> values) {
            addCriterion("ap_custom5 in", values, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotIn(List<String> values) {
            addCriterion("ap_custom5 not in", values, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5Between(String value1, String value2) {
            addCriterion("ap_custom5 between", value1, value2, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotBetween(String value1, String value2) {
            addCriterion("ap_custom5 not between", value1, value2, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom6IsNull() {
            addCriterion("ap_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom6IsNotNull() {
            addCriterion("ap_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom6EqualTo(String value) {
            addCriterion("ap_custom6 =", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotEqualTo(String value) {
            addCriterion("ap_custom6 <>", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6GreaterThan(String value) {
            addCriterion("ap_custom6 >", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom6 >=", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6LessThan(String value) {
            addCriterion("ap_custom6 <", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6LessThanOrEqualTo(String value) {
            addCriterion("ap_custom6 <=", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6Like(String value) {
            addCriterion("ap_custom6 like", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotLike(String value) {
            addCriterion("ap_custom6 not like", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6In(List<String> values) {
            addCriterion("ap_custom6 in", values, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotIn(List<String> values) {
            addCriterion("ap_custom6 not in", values, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6Between(String value1, String value2) {
            addCriterion("ap_custom6 between", value1, value2, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotBetween(String value1, String value2) {
            addCriterion("ap_custom6 not between", value1, value2, "apCustom6");
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