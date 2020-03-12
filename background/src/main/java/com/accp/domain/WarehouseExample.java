package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNull() {
            addCriterion("warehouse_name is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNotNull() {
            addCriterion("warehouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameEqualTo(String value) {
            addCriterion("warehouse_name =", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotEqualTo(String value) {
            addCriterion("warehouse_name <>", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThan(String value) {
            addCriterion("warehouse_name >", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_name >=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThan(String value) {
            addCriterion("warehouse_name <", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_name <=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLike(String value) {
            addCriterion("warehouse_name like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotLike(String value) {
            addCriterion("warehouse_name not like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIn(List<String> values) {
            addCriterion("warehouse_name in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotIn(List<String> values) {
            addCriterion("warehouse_name not in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameBetween(String value1, String value2) {
            addCriterion("warehouse_name between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotBetween(String value1, String value2) {
            addCriterion("warehouse_name not between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameIsNull() {
            addCriterion("warehouse_easy_name is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameIsNotNull() {
            addCriterion("warehouse_easy_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameEqualTo(String value) {
            addCriterion("warehouse_easy_name =", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameNotEqualTo(String value) {
            addCriterion("warehouse_easy_name <>", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameGreaterThan(String value) {
            addCriterion("warehouse_easy_name >", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_easy_name >=", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameLessThan(String value) {
            addCriterion("warehouse_easy_name <", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_easy_name <=", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameLike(String value) {
            addCriterion("warehouse_easy_name like", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameNotLike(String value) {
            addCriterion("warehouse_easy_name not like", value, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameIn(List<String> values) {
            addCriterion("warehouse_easy_name in", values, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameNotIn(List<String> values) {
            addCriterion("warehouse_easy_name not in", values, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameBetween(String value1, String value2) {
            addCriterion("warehouse_easy_name between", value1, value2, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEasyNameNotBetween(String value1, String value2) {
            addCriterion("warehouse_easy_name not between", value1, value2, "warehouseEasyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameIsNull() {
            addCriterion("warehouse_engname is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameIsNotNull() {
            addCriterion("warehouse_engname is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameEqualTo(String value) {
            addCriterion("warehouse_engname =", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameNotEqualTo(String value) {
            addCriterion("warehouse_engname <>", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameGreaterThan(String value) {
            addCriterion("warehouse_engname >", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_engname >=", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameLessThan(String value) {
            addCriterion("warehouse_engname <", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_engname <=", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameLike(String value) {
            addCriterion("warehouse_engname like", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameNotLike(String value) {
            addCriterion("warehouse_engname not like", value, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameIn(List<String> values) {
            addCriterion("warehouse_engname in", values, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameNotIn(List<String> values) {
            addCriterion("warehouse_engname not in", values, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameBetween(String value1, String value2) {
            addCriterion("warehouse_engname between", value1, value2, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseEngnameNotBetween(String value1, String value2) {
            addCriterion("warehouse_engname not between", value1, value2, "warehouseEngname");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanIsNull() {
            addCriterion("warehouse_linkman is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanIsNotNull() {
            addCriterion("warehouse_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanEqualTo(String value) {
            addCriterion("warehouse_linkman =", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanNotEqualTo(String value) {
            addCriterion("warehouse_linkman <>", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanGreaterThan(String value) {
            addCriterion("warehouse_linkman >", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_linkman >=", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanLessThan(String value) {
            addCriterion("warehouse_linkman <", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanLessThanOrEqualTo(String value) {
            addCriterion("warehouse_linkman <=", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanLike(String value) {
            addCriterion("warehouse_linkman like", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanNotLike(String value) {
            addCriterion("warehouse_linkman not like", value, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanIn(List<String> values) {
            addCriterion("warehouse_linkman in", values, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanNotIn(List<String> values) {
            addCriterion("warehouse_linkman not in", values, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanBetween(String value1, String value2) {
            addCriterion("warehouse_linkman between", value1, value2, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinkmanNotBetween(String value1, String value2) {
            addCriterion("warehouse_linkman not between", value1, value2, "warehouseLinkman");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelIsNull() {
            addCriterion("warehouse_linktel is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelIsNotNull() {
            addCriterion("warehouse_linktel is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelEqualTo(String value) {
            addCriterion("warehouse_linktel =", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelNotEqualTo(String value) {
            addCriterion("warehouse_linktel <>", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelGreaterThan(String value) {
            addCriterion("warehouse_linktel >", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_linktel >=", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelLessThan(String value) {
            addCriterion("warehouse_linktel <", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelLessThanOrEqualTo(String value) {
            addCriterion("warehouse_linktel <=", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelLike(String value) {
            addCriterion("warehouse_linktel like", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelNotLike(String value) {
            addCriterion("warehouse_linktel not like", value, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelIn(List<String> values) {
            addCriterion("warehouse_linktel in", values, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelNotIn(List<String> values) {
            addCriterion("warehouse_linktel not in", values, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelBetween(String value1, String value2) {
            addCriterion("warehouse_linktel between", value1, value2, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseLinktelNotBetween(String value1, String value2) {
            addCriterion("warehouse_linktel not between", value1, value2, "warehouseLinktel");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressIsNull() {
            addCriterion("warehouse_address is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressIsNotNull() {
            addCriterion("warehouse_address is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressEqualTo(String value) {
            addCriterion("warehouse_address =", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotEqualTo(String value) {
            addCriterion("warehouse_address <>", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressGreaterThan(String value) {
            addCriterion("warehouse_address >", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_address >=", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLessThan(String value) {
            addCriterion("warehouse_address <", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLessThanOrEqualTo(String value) {
            addCriterion("warehouse_address <=", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLike(String value) {
            addCriterion("warehouse_address like", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotLike(String value) {
            addCriterion("warehouse_address not like", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressIn(List<String> values) {
            addCriterion("warehouse_address in", values, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotIn(List<String> values) {
            addCriterion("warehouse_address not in", values, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressBetween(String value1, String value2) {
            addCriterion("warehouse_address between", value1, value2, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotBetween(String value1, String value2) {
            addCriterion("warehouse_address not between", value1, value2, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationIsNull() {
            addCriterion("warehouse_decoration is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationIsNotNull() {
            addCriterion("warehouse_decoration is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationEqualTo(String value) {
            addCriterion("warehouse_decoration =", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationNotEqualTo(String value) {
            addCriterion("warehouse_decoration <>", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationGreaterThan(String value) {
            addCriterion("warehouse_decoration >", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_decoration >=", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationLessThan(String value) {
            addCriterion("warehouse_decoration <", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationLessThanOrEqualTo(String value) {
            addCriterion("warehouse_decoration <=", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationLike(String value) {
            addCriterion("warehouse_decoration like", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationNotLike(String value) {
            addCriterion("warehouse_decoration not like", value, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationIn(List<String> values) {
            addCriterion("warehouse_decoration in", values, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationNotIn(List<String> values) {
            addCriterion("warehouse_decoration not in", values, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationBetween(String value1, String value2) {
            addCriterion("warehouse_decoration between", value1, value2, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseDecorationNotBetween(String value1, String value2) {
            addCriterion("warehouse_decoration not between", value1, value2, "warehouseDecoration");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingIsNull() {
            addCriterion("warehouse_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingIsNotNull() {
            addCriterion("warehouse_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingEqualTo(String value) {
            addCriterion("warehouse_Auditing =", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingNotEqualTo(String value) {
            addCriterion("warehouse_Auditing <>", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingGreaterThan(String value) {
            addCriterion("warehouse_Auditing >", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_Auditing >=", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingLessThan(String value) {
            addCriterion("warehouse_Auditing <", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingLessThanOrEqualTo(String value) {
            addCriterion("warehouse_Auditing <=", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingLike(String value) {
            addCriterion("warehouse_Auditing like", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingNotLike(String value) {
            addCriterion("warehouse_Auditing not like", value, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingIn(List<String> values) {
            addCriterion("warehouse_Auditing in", values, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingNotIn(List<String> values) {
            addCriterion("warehouse_Auditing not in", values, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingBetween(String value1, String value2) {
            addCriterion("warehouse_Auditing between", value1, value2, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseAuditingNotBetween(String value1, String value2) {
            addCriterion("warehouse_Auditing not between", value1, value2, "warehouseAuditing");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnIsNull() {
            addCriterion("warehouse_yn is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnIsNotNull() {
            addCriterion("warehouse_yn is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnEqualTo(String value) {
            addCriterion("warehouse_yn =", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnNotEqualTo(String value) {
            addCriterion("warehouse_yn <>", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnGreaterThan(String value) {
            addCriterion("warehouse_yn >", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_yn >=", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnLessThan(String value) {
            addCriterion("warehouse_yn <", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnLessThanOrEqualTo(String value) {
            addCriterion("warehouse_yn <=", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnLike(String value) {
            addCriterion("warehouse_yn like", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnNotLike(String value) {
            addCriterion("warehouse_yn not like", value, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnIn(List<String> values) {
            addCriterion("warehouse_yn in", values, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnNotIn(List<String> values) {
            addCriterion("warehouse_yn not in", values, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnBetween(String value1, String value2) {
            addCriterion("warehouse_yn between", value1, value2, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseYnNotBetween(String value1, String value2) {
            addCriterion("warehouse_yn not between", value1, value2, "warehouseYn");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1IsNull() {
            addCriterion("warehouse_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1IsNotNull() {
            addCriterion("warehouse_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1EqualTo(String value) {
            addCriterion("warehouse_custom1 =", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1NotEqualTo(String value) {
            addCriterion("warehouse_custom1 <>", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1GreaterThan(String value) {
            addCriterion("warehouse_custom1 >", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom1 >=", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1LessThan(String value) {
            addCriterion("warehouse_custom1 <", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom1 <=", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1Like(String value) {
            addCriterion("warehouse_custom1 like", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1NotLike(String value) {
            addCriterion("warehouse_custom1 not like", value, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1In(List<String> values) {
            addCriterion("warehouse_custom1 in", values, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1NotIn(List<String> values) {
            addCriterion("warehouse_custom1 not in", values, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1Between(String value1, String value2) {
            addCriterion("warehouse_custom1 between", value1, value2, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom1NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom1 not between", value1, value2, "warehouseCustom1");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2IsNull() {
            addCriterion("warehouse_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2IsNotNull() {
            addCriterion("warehouse_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2EqualTo(String value) {
            addCriterion("warehouse_custom2 =", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2NotEqualTo(String value) {
            addCriterion("warehouse_custom2 <>", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2GreaterThan(String value) {
            addCriterion("warehouse_custom2 >", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom2 >=", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2LessThan(String value) {
            addCriterion("warehouse_custom2 <", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom2 <=", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2Like(String value) {
            addCriterion("warehouse_custom2 like", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2NotLike(String value) {
            addCriterion("warehouse_custom2 not like", value, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2In(List<String> values) {
            addCriterion("warehouse_custom2 in", values, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2NotIn(List<String> values) {
            addCriterion("warehouse_custom2 not in", values, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2Between(String value1, String value2) {
            addCriterion("warehouse_custom2 between", value1, value2, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom2NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom2 not between", value1, value2, "warehouseCustom2");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3IsNull() {
            addCriterion("warehouse_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3IsNotNull() {
            addCriterion("warehouse_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3EqualTo(String value) {
            addCriterion("warehouse_custom3 =", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3NotEqualTo(String value) {
            addCriterion("warehouse_custom3 <>", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3GreaterThan(String value) {
            addCriterion("warehouse_custom3 >", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom3 >=", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3LessThan(String value) {
            addCriterion("warehouse_custom3 <", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom3 <=", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3Like(String value) {
            addCriterion("warehouse_custom3 like", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3NotLike(String value) {
            addCriterion("warehouse_custom3 not like", value, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3In(List<String> values) {
            addCriterion("warehouse_custom3 in", values, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3NotIn(List<String> values) {
            addCriterion("warehouse_custom3 not in", values, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3Between(String value1, String value2) {
            addCriterion("warehouse_custom3 between", value1, value2, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom3NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom3 not between", value1, value2, "warehouseCustom3");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4IsNull() {
            addCriterion("warehouse_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4IsNotNull() {
            addCriterion("warehouse_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4EqualTo(String value) {
            addCriterion("warehouse_custom4 =", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4NotEqualTo(String value) {
            addCriterion("warehouse_custom4 <>", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4GreaterThan(String value) {
            addCriterion("warehouse_custom4 >", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom4 >=", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4LessThan(String value) {
            addCriterion("warehouse_custom4 <", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom4 <=", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4Like(String value) {
            addCriterion("warehouse_custom4 like", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4NotLike(String value) {
            addCriterion("warehouse_custom4 not like", value, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4In(List<String> values) {
            addCriterion("warehouse_custom4 in", values, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4NotIn(List<String> values) {
            addCriterion("warehouse_custom4 not in", values, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4Between(String value1, String value2) {
            addCriterion("warehouse_custom4 between", value1, value2, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom4NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom4 not between", value1, value2, "warehouseCustom4");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5IsNull() {
            addCriterion("warehouse_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5IsNotNull() {
            addCriterion("warehouse_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5EqualTo(String value) {
            addCriterion("warehouse_custom5 =", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5NotEqualTo(String value) {
            addCriterion("warehouse_custom5 <>", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5GreaterThan(String value) {
            addCriterion("warehouse_custom5 >", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom5 >=", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5LessThan(String value) {
            addCriterion("warehouse_custom5 <", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom5 <=", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5Like(String value) {
            addCriterion("warehouse_custom5 like", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5NotLike(String value) {
            addCriterion("warehouse_custom5 not like", value, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5In(List<String> values) {
            addCriterion("warehouse_custom5 in", values, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5NotIn(List<String> values) {
            addCriterion("warehouse_custom5 not in", values, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5Between(String value1, String value2) {
            addCriterion("warehouse_custom5 between", value1, value2, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom5NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom5 not between", value1, value2, "warehouseCustom5");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6IsNull() {
            addCriterion("warehouse_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6IsNotNull() {
            addCriterion("warehouse_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6EqualTo(String value) {
            addCriterion("warehouse_custom6 =", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6NotEqualTo(String value) {
            addCriterion("warehouse_custom6 <>", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6GreaterThan(String value) {
            addCriterion("warehouse_custom6 >", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_custom6 >=", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6LessThan(String value) {
            addCriterion("warehouse_custom6 <", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6LessThanOrEqualTo(String value) {
            addCriterion("warehouse_custom6 <=", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6Like(String value) {
            addCriterion("warehouse_custom6 like", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6NotLike(String value) {
            addCriterion("warehouse_custom6 not like", value, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6In(List<String> values) {
            addCriterion("warehouse_custom6 in", values, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6NotIn(List<String> values) {
            addCriterion("warehouse_custom6 not in", values, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6Between(String value1, String value2) {
            addCriterion("warehouse_custom6 between", value1, value2, "warehouseCustom6");
            return (Criteria) this;
        }

        public Criteria andWarehouseCustom6NotBetween(String value1, String value2) {
            addCriterion("warehouse_custom6 not between", value1, value2, "warehouseCustom6");
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