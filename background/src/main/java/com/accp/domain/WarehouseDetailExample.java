package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehouseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseDetailExample() {
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

        public Criteria andWdIdIsNull() {
            addCriterion("wd_id is null");
            return (Criteria) this;
        }

        public Criteria andWdIdIsNotNull() {
            addCriterion("wd_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdIdEqualTo(String value) {
            addCriterion("wd_id =", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotEqualTo(String value) {
            addCriterion("wd_id <>", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThan(String value) {
            addCriterion("wd_id >", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThanOrEqualTo(String value) {
            addCriterion("wd_id >=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThan(String value) {
            addCriterion("wd_id <", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThanOrEqualTo(String value) {
            addCriterion("wd_id <=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLike(String value) {
            addCriterion("wd_id like", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotLike(String value) {
            addCriterion("wd_id not like", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdIn(List<String> values) {
            addCriterion("wd_id in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotIn(List<String> values) {
            addCriterion("wd_id not in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdBetween(String value1, String value2) {
            addCriterion("wd_id between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotBetween(String value1, String value2) {
            addCriterion("wd_id not between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andMtIdIsNull() {
            addCriterion("mt_id is null");
            return (Criteria) this;
        }

        public Criteria andMtIdIsNotNull() {
            addCriterion("mt_id is not null");
            return (Criteria) this;
        }

        public Criteria andMtIdEqualTo(Integer value) {
            addCriterion("mt_id =", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotEqualTo(Integer value) {
            addCriterion("mt_id <>", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThan(Integer value) {
            addCriterion("mt_id >", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_id >=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThan(Integer value) {
            addCriterion("mt_id <", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThanOrEqualTo(Integer value) {
            addCriterion("mt_id <=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdIn(List<Integer> values) {
            addCriterion("mt_id in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotIn(List<Integer> values) {
            addCriterion("mt_id not in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdBetween(Integer value1, Integer value2) {
            addCriterion("mt_id between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_id not between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceIsNull() {
            addCriterion("wd_unit_rice is null");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceIsNotNull() {
            addCriterion("wd_unit_rice is not null");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceEqualTo(Float value) {
            addCriterion("wd_unit_rice =", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceNotEqualTo(Float value) {
            addCriterion("wd_unit_rice <>", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceGreaterThan(Float value) {
            addCriterion("wd_unit_rice >", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceGreaterThanOrEqualTo(Float value) {
            addCriterion("wd_unit_rice >=", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceLessThan(Float value) {
            addCriterion("wd_unit_rice <", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceLessThanOrEqualTo(Float value) {
            addCriterion("wd_unit_rice <=", value, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceIn(List<Float> values) {
            addCriterion("wd_unit_rice in", values, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceNotIn(List<Float> values) {
            addCriterion("wd_unit_rice not in", values, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceBetween(Float value1, Float value2) {
            addCriterion("wd_unit_rice between", value1, value2, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdUnitRiceNotBetween(Float value1, Float value2) {
            addCriterion("wd_unit_rice not between", value1, value2, "wdUnitRice");
            return (Criteria) this;
        }

        public Criteria andWdNumberIsNull() {
            addCriterion("wd_number is null");
            return (Criteria) this;
        }

        public Criteria andWdNumberIsNotNull() {
            addCriterion("wd_number is not null");
            return (Criteria) this;
        }

        public Criteria andWdNumberEqualTo(Integer value) {
            addCriterion("wd_number =", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberNotEqualTo(Integer value) {
            addCriterion("wd_number <>", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberGreaterThan(Integer value) {
            addCriterion("wd_number >", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_number >=", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberLessThan(Integer value) {
            addCriterion("wd_number <", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("wd_number <=", value, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberIn(List<Integer> values) {
            addCriterion("wd_number in", values, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberNotIn(List<Integer> values) {
            addCriterion("wd_number not in", values, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberBetween(Integer value1, Integer value2) {
            addCriterion("wd_number between", value1, value2, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_number not between", value1, value2, "wdNumber");
            return (Criteria) this;
        }

        public Criteria andWdInoroutIsNull() {
            addCriterion("wd_inorout is null");
            return (Criteria) this;
        }

        public Criteria andWdInoroutIsNotNull() {
            addCriterion("wd_inorout is not null");
            return (Criteria) this;
        }

        public Criteria andWdInoroutEqualTo(Integer value) {
            addCriterion("wd_inorout =", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutNotEqualTo(Integer value) {
            addCriterion("wd_inorout <>", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutGreaterThan(Integer value) {
            addCriterion("wd_inorout >", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_inorout >=", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutLessThan(Integer value) {
            addCriterion("wd_inorout <", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutLessThanOrEqualTo(Integer value) {
            addCriterion("wd_inorout <=", value, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutIn(List<Integer> values) {
            addCriterion("wd_inorout in", values, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutNotIn(List<Integer> values) {
            addCriterion("wd_inorout not in", values, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutBetween(Integer value1, Integer value2) {
            addCriterion("wd_inorout between", value1, value2, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdInoroutNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_inorout not between", value1, value2, "wdInorout");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberIsNull() {
            addCriterion("wd_lastbalancenumber is null");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberIsNotNull() {
            addCriterion("wd_lastbalancenumber is not null");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberEqualTo(Integer value) {
            addCriterion("wd_lastbalancenumber =", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberNotEqualTo(Integer value) {
            addCriterion("wd_lastbalancenumber <>", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberGreaterThan(Integer value) {
            addCriterion("wd_lastbalancenumber >", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_lastbalancenumber >=", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberLessThan(Integer value) {
            addCriterion("wd_lastbalancenumber <", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberLessThanOrEqualTo(Integer value) {
            addCriterion("wd_lastbalancenumber <=", value, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberIn(List<Integer> values) {
            addCriterion("wd_lastbalancenumber in", values, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberNotIn(List<Integer> values) {
            addCriterion("wd_lastbalancenumber not in", values, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberBetween(Integer value1, Integer value2) {
            addCriterion("wd_lastbalancenumber between", value1, value2, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdLastbalancenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_lastbalancenumber not between", value1, value2, "wdLastbalancenumber");
            return (Criteria) this;
        }

        public Criteria andWdAuditingIsNull() {
            addCriterion("wd_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andWdAuditingIsNotNull() {
            addCriterion("wd_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andWdAuditingEqualTo(String value) {
            addCriterion("wd_Auditing =", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingNotEqualTo(String value) {
            addCriterion("wd_Auditing <>", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingGreaterThan(String value) {
            addCriterion("wd_Auditing >", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("wd_Auditing >=", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingLessThan(String value) {
            addCriterion("wd_Auditing <", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingLessThanOrEqualTo(String value) {
            addCriterion("wd_Auditing <=", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingLike(String value) {
            addCriterion("wd_Auditing like", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingNotLike(String value) {
            addCriterion("wd_Auditing not like", value, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingIn(List<String> values) {
            addCriterion("wd_Auditing in", values, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingNotIn(List<String> values) {
            addCriterion("wd_Auditing not in", values, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingBetween(String value1, String value2) {
            addCriterion("wd_Auditing between", value1, value2, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdAuditingNotBetween(String value1, String value2) {
            addCriterion("wd_Auditing not between", value1, value2, "wdAuditing");
            return (Criteria) this;
        }

        public Criteria andWdYnIsNull() {
            addCriterion("wd_yn is null");
            return (Criteria) this;
        }

        public Criteria andWdYnIsNotNull() {
            addCriterion("wd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andWdYnEqualTo(String value) {
            addCriterion("wd_yn =", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnNotEqualTo(String value) {
            addCriterion("wd_yn <>", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnGreaterThan(String value) {
            addCriterion("wd_yn >", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnGreaterThanOrEqualTo(String value) {
            addCriterion("wd_yn >=", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnLessThan(String value) {
            addCriterion("wd_yn <", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnLessThanOrEqualTo(String value) {
            addCriterion("wd_yn <=", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnLike(String value) {
            addCriterion("wd_yn like", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnNotLike(String value) {
            addCriterion("wd_yn not like", value, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnIn(List<String> values) {
            addCriterion("wd_yn in", values, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnNotIn(List<String> values) {
            addCriterion("wd_yn not in", values, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnBetween(String value1, String value2) {
            addCriterion("wd_yn between", value1, value2, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdYnNotBetween(String value1, String value2) {
            addCriterion("wd_yn not between", value1, value2, "wdYn");
            return (Criteria) this;
        }

        public Criteria andWdCustom1IsNull() {
            addCriterion("wd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom1IsNotNull() {
            addCriterion("wd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom1EqualTo(String value) {
            addCriterion("wd_custom1 =", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1NotEqualTo(String value) {
            addCriterion("wd_custom1 <>", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1GreaterThan(String value) {
            addCriterion("wd_custom1 >", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom1 >=", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1LessThan(String value) {
            addCriterion("wd_custom1 <", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1LessThanOrEqualTo(String value) {
            addCriterion("wd_custom1 <=", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1Like(String value) {
            addCriterion("wd_custom1 like", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1NotLike(String value) {
            addCriterion("wd_custom1 not like", value, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1In(List<String> values) {
            addCriterion("wd_custom1 in", values, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1NotIn(List<String> values) {
            addCriterion("wd_custom1 not in", values, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1Between(String value1, String value2) {
            addCriterion("wd_custom1 between", value1, value2, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom1NotBetween(String value1, String value2) {
            addCriterion("wd_custom1 not between", value1, value2, "wdCustom1");
            return (Criteria) this;
        }

        public Criteria andWdCustom2IsNull() {
            addCriterion("wd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom2IsNotNull() {
            addCriterion("wd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom2EqualTo(String value) {
            addCriterion("wd_custom2 =", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2NotEqualTo(String value) {
            addCriterion("wd_custom2 <>", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2GreaterThan(String value) {
            addCriterion("wd_custom2 >", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom2 >=", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2LessThan(String value) {
            addCriterion("wd_custom2 <", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2LessThanOrEqualTo(String value) {
            addCriterion("wd_custom2 <=", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2Like(String value) {
            addCriterion("wd_custom2 like", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2NotLike(String value) {
            addCriterion("wd_custom2 not like", value, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2In(List<String> values) {
            addCriterion("wd_custom2 in", values, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2NotIn(List<String> values) {
            addCriterion("wd_custom2 not in", values, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2Between(String value1, String value2) {
            addCriterion("wd_custom2 between", value1, value2, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom2NotBetween(String value1, String value2) {
            addCriterion("wd_custom2 not between", value1, value2, "wdCustom2");
            return (Criteria) this;
        }

        public Criteria andWdCustom3IsNull() {
            addCriterion("wd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom3IsNotNull() {
            addCriterion("wd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom3EqualTo(String value) {
            addCriterion("wd_custom3 =", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3NotEqualTo(String value) {
            addCriterion("wd_custom3 <>", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3GreaterThan(String value) {
            addCriterion("wd_custom3 >", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom3 >=", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3LessThan(String value) {
            addCriterion("wd_custom3 <", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3LessThanOrEqualTo(String value) {
            addCriterion("wd_custom3 <=", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3Like(String value) {
            addCriterion("wd_custom3 like", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3NotLike(String value) {
            addCriterion("wd_custom3 not like", value, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3In(List<String> values) {
            addCriterion("wd_custom3 in", values, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3NotIn(List<String> values) {
            addCriterion("wd_custom3 not in", values, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3Between(String value1, String value2) {
            addCriterion("wd_custom3 between", value1, value2, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom3NotBetween(String value1, String value2) {
            addCriterion("wd_custom3 not between", value1, value2, "wdCustom3");
            return (Criteria) this;
        }

        public Criteria andWdCustom4IsNull() {
            addCriterion("wd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom4IsNotNull() {
            addCriterion("wd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom4EqualTo(String value) {
            addCriterion("wd_custom4 =", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4NotEqualTo(String value) {
            addCriterion("wd_custom4 <>", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4GreaterThan(String value) {
            addCriterion("wd_custom4 >", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom4 >=", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4LessThan(String value) {
            addCriterion("wd_custom4 <", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4LessThanOrEqualTo(String value) {
            addCriterion("wd_custom4 <=", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4Like(String value) {
            addCriterion("wd_custom4 like", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4NotLike(String value) {
            addCriterion("wd_custom4 not like", value, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4In(List<String> values) {
            addCriterion("wd_custom4 in", values, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4NotIn(List<String> values) {
            addCriterion("wd_custom4 not in", values, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4Between(String value1, String value2) {
            addCriterion("wd_custom4 between", value1, value2, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom4NotBetween(String value1, String value2) {
            addCriterion("wd_custom4 not between", value1, value2, "wdCustom4");
            return (Criteria) this;
        }

        public Criteria andWdCustom5IsNull() {
            addCriterion("wd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom5IsNotNull() {
            addCriterion("wd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom5EqualTo(String value) {
            addCriterion("wd_custom5 =", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5NotEqualTo(String value) {
            addCriterion("wd_custom5 <>", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5GreaterThan(String value) {
            addCriterion("wd_custom5 >", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom5 >=", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5LessThan(String value) {
            addCriterion("wd_custom5 <", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5LessThanOrEqualTo(String value) {
            addCriterion("wd_custom5 <=", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5Like(String value) {
            addCriterion("wd_custom5 like", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5NotLike(String value) {
            addCriterion("wd_custom5 not like", value, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5In(List<String> values) {
            addCriterion("wd_custom5 in", values, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5NotIn(List<String> values) {
            addCriterion("wd_custom5 not in", values, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5Between(String value1, String value2) {
            addCriterion("wd_custom5 between", value1, value2, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom5NotBetween(String value1, String value2) {
            addCriterion("wd_custom5 not between", value1, value2, "wdCustom5");
            return (Criteria) this;
        }

        public Criteria andWdCustom6IsNull() {
            addCriterion("wd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andWdCustom6IsNotNull() {
            addCriterion("wd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andWdCustom6EqualTo(String value) {
            addCriterion("wd_custom6 =", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6NotEqualTo(String value) {
            addCriterion("wd_custom6 <>", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6GreaterThan(String value) {
            addCriterion("wd_custom6 >", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("wd_custom6 >=", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6LessThan(String value) {
            addCriterion("wd_custom6 <", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6LessThanOrEqualTo(String value) {
            addCriterion("wd_custom6 <=", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6Like(String value) {
            addCriterion("wd_custom6 like", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6NotLike(String value) {
            addCriterion("wd_custom6 not like", value, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6In(List<String> values) {
            addCriterion("wd_custom6 in", values, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6NotIn(List<String> values) {
            addCriterion("wd_custom6 not in", values, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6Between(String value1, String value2) {
            addCriterion("wd_custom6 between", value1, value2, "wdCustom6");
            return (Criteria) this;
        }

        public Criteria andWdCustom6NotBetween(String value1, String value2) {
            addCriterion("wd_custom6 not between", value1, value2, "wdCustom6");
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