package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AssessmentProcurementFruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessmentProcurementFruitExample() {
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

        public Criteria andApfIdIsNull() {
            addCriterion("apf_id is null");
            return (Criteria) this;
        }

        public Criteria andApfIdIsNotNull() {
            addCriterion("apf_id is not null");
            return (Criteria) this;
        }

        public Criteria andApfIdEqualTo(String value) {
            addCriterion("apf_id =", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdNotEqualTo(String value) {
            addCriterion("apf_id <>", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdGreaterThan(String value) {
            addCriterion("apf_id >", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdGreaterThanOrEqualTo(String value) {
            addCriterion("apf_id >=", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdLessThan(String value) {
            addCriterion("apf_id <", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdLessThanOrEqualTo(String value) {
            addCriterion("apf_id <=", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdLike(String value) {
            addCriterion("apf_id like", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdNotLike(String value) {
            addCriterion("apf_id not like", value, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdIn(List<String> values) {
            addCriterion("apf_id in", values, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdNotIn(List<String> values) {
            addCriterion("apf_id not in", values, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdBetween(String value1, String value2) {
            addCriterion("apf_id between", value1, value2, "apfId");
            return (Criteria) this;
        }

        public Criteria andApfIdNotBetween(String value1, String value2) {
            addCriterion("apf_id not between", value1, value2, "apfId");
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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(String value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(String value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(String value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(String value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(String value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLike(String value) {
            addCriterion("ps_id like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotLike(String value) {
            addCriterion("ps_id not like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<String> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<String> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(String value1, String value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(String value1, String value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdIsNull() {
            addCriterion("apf_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdIsNotNull() {
            addCriterion("apf_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdEqualTo(String value) {
            addCriterion("apf_matter_id =", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdNotEqualTo(String value) {
            addCriterion("apf_matter_id <>", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdGreaterThan(String value) {
            addCriterion("apf_matter_id >", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("apf_matter_id >=", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdLessThan(String value) {
            addCriterion("apf_matter_id <", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdLessThanOrEqualTo(String value) {
            addCriterion("apf_matter_id <=", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdLike(String value) {
            addCriterion("apf_matter_id like", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdNotLike(String value) {
            addCriterion("apf_matter_id not like", value, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdIn(List<String> values) {
            addCriterion("apf_matter_id in", values, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdNotIn(List<String> values) {
            addCriterion("apf_matter_id not in", values, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdBetween(String value1, String value2) {
            addCriterion("apf_matter_id between", value1, value2, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterIdNotBetween(String value1, String value2) {
            addCriterion("apf_matter_id not between", value1, value2, "apfMatterId");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameIsNull() {
            addCriterion("apf_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameIsNotNull() {
            addCriterion("apf_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameEqualTo(String value) {
            addCriterion("apf_matter_name =", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameNotEqualTo(String value) {
            addCriterion("apf_matter_name <>", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameGreaterThan(String value) {
            addCriterion("apf_matter_name >", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("apf_matter_name >=", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameLessThan(String value) {
            addCriterion("apf_matter_name <", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameLessThanOrEqualTo(String value) {
            addCriterion("apf_matter_name <=", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameLike(String value) {
            addCriterion("apf_matter_name like", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameNotLike(String value) {
            addCriterion("apf_matter_name not like", value, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameIn(List<String> values) {
            addCriterion("apf_matter_name in", values, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameNotIn(List<String> values) {
            addCriterion("apf_matter_name not in", values, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameBetween(String value1, String value2) {
            addCriterion("apf_matter_name between", value1, value2, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfMatterNameNotBetween(String value1, String value2) {
            addCriterion("apf_matter_name not between", value1, value2, "apfMatterName");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsIsNull() {
            addCriterion("apf_specifications is null");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsIsNotNull() {
            addCriterion("apf_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsEqualTo(String value) {
            addCriterion("apf_specifications =", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsNotEqualTo(String value) {
            addCriterion("apf_specifications <>", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsGreaterThan(String value) {
            addCriterion("apf_specifications >", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("apf_specifications >=", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsLessThan(String value) {
            addCriterion("apf_specifications <", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("apf_specifications <=", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsLike(String value) {
            addCriterion("apf_specifications like", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsNotLike(String value) {
            addCriterion("apf_specifications not like", value, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsIn(List<String> values) {
            addCriterion("apf_specifications in", values, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsNotIn(List<String> values) {
            addCriterion("apf_specifications not in", values, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsBetween(String value1, String value2) {
            addCriterion("apf_specifications between", value1, value2, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfSpecificationsNotBetween(String value1, String value2) {
            addCriterion("apf_specifications not between", value1, value2, "apfSpecifications");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameIsNull() {
            addCriterion("apf_company_name is null");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameIsNotNull() {
            addCriterion("apf_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameEqualTo(String value) {
            addCriterion("apf_company_name =", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameNotEqualTo(String value) {
            addCriterion("apf_company_name <>", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameGreaterThan(String value) {
            addCriterion("apf_company_name >", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("apf_company_name >=", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameLessThan(String value) {
            addCriterion("apf_company_name <", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("apf_company_name <=", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameLike(String value) {
            addCriterion("apf_company_name like", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameNotLike(String value) {
            addCriterion("apf_company_name not like", value, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameIn(List<String> values) {
            addCriterion("apf_company_name in", values, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameNotIn(List<String> values) {
            addCriterion("apf_company_name not in", values, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameBetween(String value1, String value2) {
            addCriterion("apf_company_name between", value1, value2, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfCompanyNameNotBetween(String value1, String value2) {
            addCriterion("apf_company_name not between", value1, value2, "apfCompanyName");
            return (Criteria) this;
        }

        public Criteria andApfAmountIsNull() {
            addCriterion("apf_amount is null");
            return (Criteria) this;
        }

        public Criteria andApfAmountIsNotNull() {
            addCriterion("apf_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApfAmountEqualTo(Integer value) {
            addCriterion("apf_amount =", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountNotEqualTo(Integer value) {
            addCriterion("apf_amount <>", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountGreaterThan(Integer value) {
            addCriterion("apf_amount >", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("apf_amount >=", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountLessThan(Integer value) {
            addCriterion("apf_amount <", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountLessThanOrEqualTo(Integer value) {
            addCriterion("apf_amount <=", value, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountIn(List<Integer> values) {
            addCriterion("apf_amount in", values, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountNotIn(List<Integer> values) {
            addCriterion("apf_amount not in", values, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountBetween(Integer value1, Integer value2) {
            addCriterion("apf_amount between", value1, value2, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("apf_amount not between", value1, value2, "apfAmount");
            return (Criteria) this;
        }

        public Criteria andApfMoneyIsNull() {
            addCriterion("apf_money is null");
            return (Criteria) this;
        }

        public Criteria andApfMoneyIsNotNull() {
            addCriterion("apf_money is not null");
            return (Criteria) this;
        }

        public Criteria andApfMoneyEqualTo(Float value) {
            addCriterion("apf_money =", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyNotEqualTo(Float value) {
            addCriterion("apf_money <>", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyGreaterThan(Float value) {
            addCriterion("apf_money >", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("apf_money >=", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyLessThan(Float value) {
            addCriterion("apf_money <", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyLessThanOrEqualTo(Float value) {
            addCriterion("apf_money <=", value, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyIn(List<Float> values) {
            addCriterion("apf_money in", values, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyNotIn(List<Float> values) {
            addCriterion("apf_money not in", values, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyBetween(Float value1, Float value2) {
            addCriterion("apf_money between", value1, value2, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfMoneyNotBetween(Float value1, Float value2) {
            addCriterion("apf_money not between", value1, value2, "apfMoney");
            return (Criteria) this;
        }

        public Criteria andApfWeightIsNull() {
            addCriterion("apf_weight is null");
            return (Criteria) this;
        }

        public Criteria andApfWeightIsNotNull() {
            addCriterion("apf_weight is not null");
            return (Criteria) this;
        }

        public Criteria andApfWeightEqualTo(Float value) {
            addCriterion("apf_weight =", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightNotEqualTo(Float value) {
            addCriterion("apf_weight <>", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightGreaterThan(Float value) {
            addCriterion("apf_weight >", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("apf_weight >=", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightLessThan(Float value) {
            addCriterion("apf_weight <", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightLessThanOrEqualTo(Float value) {
            addCriterion("apf_weight <=", value, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightIn(List<Float> values) {
            addCriterion("apf_weight in", values, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightNotIn(List<Float> values) {
            addCriterion("apf_weight not in", values, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightBetween(Float value1, Float value2) {
            addCriterion("apf_weight between", value1, value2, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfWeightNotBetween(Float value1, Float value2) {
            addCriterion("apf_weight not between", value1, value2, "apfWeight");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodIsNull() {
            addCriterion("apf_volume_wood is null");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodIsNotNull() {
            addCriterion("apf_volume_wood is not null");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodEqualTo(Float value) {
            addCriterion("apf_volume_wood =", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodNotEqualTo(Float value) {
            addCriterion("apf_volume_wood <>", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodGreaterThan(Float value) {
            addCriterion("apf_volume_wood >", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodGreaterThanOrEqualTo(Float value) {
            addCriterion("apf_volume_wood >=", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodLessThan(Float value) {
            addCriterion("apf_volume_wood <", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodLessThanOrEqualTo(Float value) {
            addCriterion("apf_volume_wood <=", value, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodIn(List<Float> values) {
            addCriterion("apf_volume_wood in", values, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodNotIn(List<Float> values) {
            addCriterion("apf_volume_wood not in", values, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodBetween(Float value1, Float value2) {
            addCriterion("apf_volume_wood between", value1, value2, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfVolumeWoodNotBetween(Float value1, Float value2) {
            addCriterion("apf_volume_wood not between", value1, value2, "apfVolumeWood");
            return (Criteria) this;
        }

        public Criteria andApfContributionIsNull() {
            addCriterion("apf_contribution is null");
            return (Criteria) this;
        }

        public Criteria andApfContributionIsNotNull() {
            addCriterion("apf_contribution is not null");
            return (Criteria) this;
        }

        public Criteria andApfContributionEqualTo(Float value) {
            addCriterion("apf_contribution =", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionNotEqualTo(Float value) {
            addCriterion("apf_contribution <>", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionGreaterThan(Float value) {
            addCriterion("apf_contribution >", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionGreaterThanOrEqualTo(Float value) {
            addCriterion("apf_contribution >=", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionLessThan(Float value) {
            addCriterion("apf_contribution <", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionLessThanOrEqualTo(Float value) {
            addCriterion("apf_contribution <=", value, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionIn(List<Float> values) {
            addCriterion("apf_contribution in", values, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionNotIn(List<Float> values) {
            addCriterion("apf_contribution not in", values, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionBetween(Float value1, Float value2) {
            addCriterion("apf_contribution between", value1, value2, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andApfContributionNotBetween(Float value1, Float value2) {
            addCriterion("apf_contribution not between", value1, value2, "apfContribution");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIsNull() {
            addCriterion("prt_audition is null");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIsNotNull() {
            addCriterion("prt_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionEqualTo(String value) {
            addCriterion("prt_audition =", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotEqualTo(String value) {
            addCriterion("prt_audition <>", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionGreaterThan(String value) {
            addCriterion("prt_audition >", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("prt_audition >=", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLessThan(String value) {
            addCriterion("prt_audition <", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLessThanOrEqualTo(String value) {
            addCriterion("prt_audition <=", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLike(String value) {
            addCriterion("prt_audition like", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotLike(String value) {
            addCriterion("prt_audition not like", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIn(List<String> values) {
            addCriterion("prt_audition in", values, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotIn(List<String> values) {
            addCriterion("prt_audition not in", values, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionBetween(String value1, String value2) {
            addCriterion("prt_audition between", value1, value2, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotBetween(String value1, String value2) {
            addCriterion("prt_audition not between", value1, value2, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtYnIsNull() {
            addCriterion("prt_yn is null");
            return (Criteria) this;
        }

        public Criteria andPrtYnIsNotNull() {
            addCriterion("prt_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPrtYnEqualTo(String value) {
            addCriterion("prt_yn =", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotEqualTo(String value) {
            addCriterion("prt_yn <>", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnGreaterThan(String value) {
            addCriterion("prt_yn >", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnGreaterThanOrEqualTo(String value) {
            addCriterion("prt_yn >=", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLessThan(String value) {
            addCriterion("prt_yn <", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLessThanOrEqualTo(String value) {
            addCriterion("prt_yn <=", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLike(String value) {
            addCriterion("prt_yn like", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotLike(String value) {
            addCriterion("prt_yn not like", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnIn(List<String> values) {
            addCriterion("prt_yn in", values, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotIn(List<String> values) {
            addCriterion("prt_yn not in", values, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnBetween(String value1, String value2) {
            addCriterion("prt_yn between", value1, value2, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotBetween(String value1, String value2) {
            addCriterion("prt_yn not between", value1, value2, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1IsNull() {
            addCriterion("prt_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1IsNotNull() {
            addCriterion("prt_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1EqualTo(String value) {
            addCriterion("prt_custom1 =", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotEqualTo(String value) {
            addCriterion("prt_custom1 <>", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1GreaterThan(String value) {
            addCriterion("prt_custom1 >", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom1 >=", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1LessThan(String value) {
            addCriterion("prt_custom1 <", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1LessThanOrEqualTo(String value) {
            addCriterion("prt_custom1 <=", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1Like(String value) {
            addCriterion("prt_custom1 like", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotLike(String value) {
            addCriterion("prt_custom1 not like", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1In(List<String> values) {
            addCriterion("prt_custom1 in", values, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotIn(List<String> values) {
            addCriterion("prt_custom1 not in", values, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1Between(String value1, String value2) {
            addCriterion("prt_custom1 between", value1, value2, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotBetween(String value1, String value2) {
            addCriterion("prt_custom1 not between", value1, value2, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2IsNull() {
            addCriterion("prt_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2IsNotNull() {
            addCriterion("prt_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2EqualTo(String value) {
            addCriterion("prt_custom2 =", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotEqualTo(String value) {
            addCriterion("prt_custom2 <>", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2GreaterThan(String value) {
            addCriterion("prt_custom2 >", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom2 >=", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2LessThan(String value) {
            addCriterion("prt_custom2 <", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2LessThanOrEqualTo(String value) {
            addCriterion("prt_custom2 <=", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2Like(String value) {
            addCriterion("prt_custom2 like", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotLike(String value) {
            addCriterion("prt_custom2 not like", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2In(List<String> values) {
            addCriterion("prt_custom2 in", values, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotIn(List<String> values) {
            addCriterion("prt_custom2 not in", values, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2Between(String value1, String value2) {
            addCriterion("prt_custom2 between", value1, value2, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotBetween(String value1, String value2) {
            addCriterion("prt_custom2 not between", value1, value2, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3IsNull() {
            addCriterion("prt_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3IsNotNull() {
            addCriterion("prt_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3EqualTo(String value) {
            addCriterion("prt_custom3 =", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotEqualTo(String value) {
            addCriterion("prt_custom3 <>", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3GreaterThan(String value) {
            addCriterion("prt_custom3 >", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom3 >=", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3LessThan(String value) {
            addCriterion("prt_custom3 <", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3LessThanOrEqualTo(String value) {
            addCriterion("prt_custom3 <=", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3Like(String value) {
            addCriterion("prt_custom3 like", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotLike(String value) {
            addCriterion("prt_custom3 not like", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3In(List<String> values) {
            addCriterion("prt_custom3 in", values, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotIn(List<String> values) {
            addCriterion("prt_custom3 not in", values, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3Between(String value1, String value2) {
            addCriterion("prt_custom3 between", value1, value2, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotBetween(String value1, String value2) {
            addCriterion("prt_custom3 not between", value1, value2, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4IsNull() {
            addCriterion("prt_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4IsNotNull() {
            addCriterion("prt_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4EqualTo(String value) {
            addCriterion("prt_custom4 =", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotEqualTo(String value) {
            addCriterion("prt_custom4 <>", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4GreaterThan(String value) {
            addCriterion("prt_custom4 >", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom4 >=", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4LessThan(String value) {
            addCriterion("prt_custom4 <", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4LessThanOrEqualTo(String value) {
            addCriterion("prt_custom4 <=", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4Like(String value) {
            addCriterion("prt_custom4 like", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotLike(String value) {
            addCriterion("prt_custom4 not like", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4In(List<String> values) {
            addCriterion("prt_custom4 in", values, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotIn(List<String> values) {
            addCriterion("prt_custom4 not in", values, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4Between(String value1, String value2) {
            addCriterion("prt_custom4 between", value1, value2, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotBetween(String value1, String value2) {
            addCriterion("prt_custom4 not between", value1, value2, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5IsNull() {
            addCriterion("prt_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5IsNotNull() {
            addCriterion("prt_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5EqualTo(String value) {
            addCriterion("prt_custom5 =", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotEqualTo(String value) {
            addCriterion("prt_custom5 <>", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5GreaterThan(String value) {
            addCriterion("prt_custom5 >", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom5 >=", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5LessThan(String value) {
            addCriterion("prt_custom5 <", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5LessThanOrEqualTo(String value) {
            addCriterion("prt_custom5 <=", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5Like(String value) {
            addCriterion("prt_custom5 like", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotLike(String value) {
            addCriterion("prt_custom5 not like", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5In(List<String> values) {
            addCriterion("prt_custom5 in", values, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotIn(List<String> values) {
            addCriterion("prt_custom5 not in", values, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5Between(String value1, String value2) {
            addCriterion("prt_custom5 between", value1, value2, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotBetween(String value1, String value2) {
            addCriterion("prt_custom5 not between", value1, value2, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6IsNull() {
            addCriterion("prt_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6IsNotNull() {
            addCriterion("prt_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6EqualTo(String value) {
            addCriterion("prt_custom6 =", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotEqualTo(String value) {
            addCriterion("prt_custom6 <>", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6GreaterThan(String value) {
            addCriterion("prt_custom6 >", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom6 >=", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6LessThan(String value) {
            addCriterion("prt_custom6 <", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6LessThanOrEqualTo(String value) {
            addCriterion("prt_custom6 <=", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6Like(String value) {
            addCriterion("prt_custom6 like", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotLike(String value) {
            addCriterion("prt_custom6 not like", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6In(List<String> values) {
            addCriterion("prt_custom6 in", values, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotIn(List<String> values) {
            addCriterion("prt_custom6 not in", values, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6Between(String value1, String value2) {
            addCriterion("prt_custom6 between", value1, value2, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotBetween(String value1, String value2) {
            addCriterion("prt_custom6 not between", value1, value2, "prtCustom6");
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