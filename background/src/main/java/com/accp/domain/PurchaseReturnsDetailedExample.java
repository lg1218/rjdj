package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseReturnsDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseReturnsDetailedExample() {
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

        public Criteria andPuredIdIsNull() {
            addCriterion("pured_id is null");
            return (Criteria) this;
        }

        public Criteria andPuredIdIsNotNull() {
            addCriterion("pured_id is not null");
            return (Criteria) this;
        }

        public Criteria andPuredIdEqualTo(String value) {
            addCriterion("pured_id =", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdNotEqualTo(String value) {
            addCriterion("pured_id <>", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdGreaterThan(String value) {
            addCriterion("pured_id >", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdGreaterThanOrEqualTo(String value) {
            addCriterion("pured_id >=", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdLessThan(String value) {
            addCriterion("pured_id <", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdLessThanOrEqualTo(String value) {
            addCriterion("pured_id <=", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdLike(String value) {
            addCriterion("pured_id like", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdNotLike(String value) {
            addCriterion("pured_id not like", value, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdIn(List<String> values) {
            addCriterion("pured_id in", values, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdNotIn(List<String> values) {
            addCriterion("pured_id not in", values, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdBetween(String value1, String value2) {
            addCriterion("pured_id between", value1, value2, "puredId");
            return (Criteria) this;
        }

        public Criteria andPuredIdNotBetween(String value1, String value2) {
            addCriterion("pured_id not between", value1, value2, "puredId");
            return (Criteria) this;
        }

        public Criteria andPureIdIsNull() {
            addCriterion("pure_id is null");
            return (Criteria) this;
        }

        public Criteria andPureIdIsNotNull() {
            addCriterion("pure_id is not null");
            return (Criteria) this;
        }

        public Criteria andPureIdEqualTo(String value) {
            addCriterion("pure_id =", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotEqualTo(String value) {
            addCriterion("pure_id <>", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdGreaterThan(String value) {
            addCriterion("pure_id >", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdGreaterThanOrEqualTo(String value) {
            addCriterion("pure_id >=", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLessThan(String value) {
            addCriterion("pure_id <", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLessThanOrEqualTo(String value) {
            addCriterion("pure_id <=", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLike(String value) {
            addCriterion("pure_id like", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotLike(String value) {
            addCriterion("pure_id not like", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdIn(List<String> values) {
            addCriterion("pure_id in", values, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotIn(List<String> values) {
            addCriterion("pure_id not in", values, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdBetween(String value1, String value2) {
            addCriterion("pure_id between", value1, value2, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotBetween(String value1, String value2) {
            addCriterion("pure_id not between", value1, value2, "pureId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNull() {
            addCriterion("matter_id is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("matter_id =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("matter_id <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("matter_id >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("matter_id >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("matter_id <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("matter_id <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("matter_id like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("matter_id not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("matter_id in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("matter_id not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("matter_id between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("matter_id not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameIsNull() {
            addCriterion("pured_engname is null");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameIsNotNull() {
            addCriterion("pured_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameEqualTo(String value) {
            addCriterion("pured_engname =", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameNotEqualTo(String value) {
            addCriterion("pured_engname <>", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameGreaterThan(String value) {
            addCriterion("pured_engname >", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("pured_engname >=", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameLessThan(String value) {
            addCriterion("pured_engname <", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameLessThanOrEqualTo(String value) {
            addCriterion("pured_engname <=", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameLike(String value) {
            addCriterion("pured_engname like", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameNotLike(String value) {
            addCriterion("pured_engname not like", value, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameIn(List<String> values) {
            addCriterion("pured_engname in", values, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameNotIn(List<String> values) {
            addCriterion("pured_engname not in", values, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameBetween(String value1, String value2) {
            addCriterion("pured_engname between", value1, value2, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredEngnameNotBetween(String value1, String value2) {
            addCriterion("pured_engname not between", value1, value2, "puredEngname");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkIsNull() {
            addCriterion("pured_remark is null");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkIsNotNull() {
            addCriterion("pured_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkEqualTo(String value) {
            addCriterion("pured_remark =", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkNotEqualTo(String value) {
            addCriterion("pured_remark <>", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkGreaterThan(String value) {
            addCriterion("pured_remark >", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pured_remark >=", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkLessThan(String value) {
            addCriterion("pured_remark <", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkLessThanOrEqualTo(String value) {
            addCriterion("pured_remark <=", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkLike(String value) {
            addCriterion("pured_remark like", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkNotLike(String value) {
            addCriterion("pured_remark not like", value, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkIn(List<String> values) {
            addCriterion("pured_remark in", values, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkNotIn(List<String> values) {
            addCriterion("pured_remark not in", values, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkBetween(String value1, String value2) {
            addCriterion("pured_remark between", value1, value2, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredRemarkNotBetween(String value1, String value2) {
            addCriterion("pured_remark not between", value1, value2, "puredRemark");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxIsNull() {
            addCriterion("pured_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxIsNotNull() {
            addCriterion("pured_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxEqualTo(String value) {
            addCriterion("pured_price_include_tax =", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("pured_price_include_tax <>", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxGreaterThan(String value) {
            addCriterion("pured_price_include_tax >", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("pured_price_include_tax >=", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxLessThan(String value) {
            addCriterion("pured_price_include_tax <", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("pured_price_include_tax <=", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxLike(String value) {
            addCriterion("pured_price_include_tax like", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxNotLike(String value) {
            addCriterion("pured_price_include_tax not like", value, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxIn(List<String> values) {
            addCriterion("pured_price_include_tax in", values, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("pured_price_include_tax not in", values, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("pured_price_include_tax between", value1, value2, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("pured_price_include_tax not between", value1, value2, "puredPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusIsNull() {
            addCriterion("pured_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusIsNotNull() {
            addCriterion("pured_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusEqualTo(Integer value) {
            addCriterion("pured_single_status =", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusNotEqualTo(Integer value) {
            addCriterion("pured_single_status <>", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusGreaterThan(Integer value) {
            addCriterion("pured_single_status >", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pured_single_status >=", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusLessThan(Integer value) {
            addCriterion("pured_single_status <", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pured_single_status <=", value, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusIn(List<Integer> values) {
            addCriterion("pured_single_status in", values, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusNotIn(List<Integer> values) {
            addCriterion("pured_single_status not in", values, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("pured_single_status between", value1, value2, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pured_single_status not between", value1, value2, "puredSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateIsNull() {
            addCriterion("pured_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateIsNotNull() {
            addCriterion("pured_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pured_document_date =", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pured_document_date <>", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pured_document_date >", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pured_document_date >=", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pured_document_date <", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pured_document_date <=", value, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pured_document_date in", values, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pured_document_date not in", values, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pured_document_date between", value1, value2, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pured_document_date not between", value1, value2, "puredDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberIsNull() {
            addCriterion("pured_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberIsNotNull() {
            addCriterion("pured_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberEqualTo(String value) {
            addCriterion("pured_document_number =", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberNotEqualTo(String value) {
            addCriterion("pured_document_number <>", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberGreaterThan(String value) {
            addCriterion("pured_document_number >", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pured_document_number >=", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberLessThan(String value) {
            addCriterion("pured_document_number <", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pured_document_number <=", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberLike(String value) {
            addCriterion("pured_document_number like", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberNotLike(String value) {
            addCriterion("pured_document_number not like", value, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberIn(List<String> values) {
            addCriterion("pured_document_number in", values, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberNotIn(List<String> values) {
            addCriterion("pured_document_number not in", values, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberBetween(String value1, String value2) {
            addCriterion("pured_document_number between", value1, value2, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pured_document_number not between", value1, value2, "puredDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIsNull() {
            addCriterion("pured_price is null");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIsNotNull() {
            addCriterion("pured_price is not null");
            return (Criteria) this;
        }

        public Criteria andPuredPriceEqualTo(Float value) {
            addCriterion("pured_price =", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceNotEqualTo(Float value) {
            addCriterion("pured_price <>", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceGreaterThan(Float value) {
            addCriterion("pured_price >", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pured_price >=", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceLessThan(Float value) {
            addCriterion("pured_price <", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceLessThanOrEqualTo(Float value) {
            addCriterion("pured_price <=", value, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceIn(List<Float> values) {
            addCriterion("pured_price in", values, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceNotIn(List<Float> values) {
            addCriterion("pured_price not in", values, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceBetween(Float value1, Float value2) {
            addCriterion("pured_price between", value1, value2, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredPriceNotBetween(Float value1, Float value2) {
            addCriterion("pured_price not between", value1, value2, "puredPrice");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyIsNull() {
            addCriterion("pured_money is null");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyIsNotNull() {
            addCriterion("pured_money is not null");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyEqualTo(Float value) {
            addCriterion("pured_money =", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyNotEqualTo(Float value) {
            addCriterion("pured_money <>", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyGreaterThan(Float value) {
            addCriterion("pured_money >", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pured_money >=", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyLessThan(Float value) {
            addCriterion("pured_money <", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyLessThanOrEqualTo(Float value) {
            addCriterion("pured_money <=", value, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyIn(List<Float> values) {
            addCriterion("pured_money in", values, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyNotIn(List<Float> values) {
            addCriterion("pured_money not in", values, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyBetween(Float value1, Float value2) {
            addCriterion("pured_money between", value1, value2, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredMoneyNotBetween(Float value1, Float value2) {
            addCriterion("pured_money not between", value1, value2, "puredMoney");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateIsNull() {
            addCriterion("pured_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateIsNotNull() {
            addCriterion("pured_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateEqualTo(Float value) {
            addCriterion("pured_tax_rate =", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateNotEqualTo(Float value) {
            addCriterion("pured_tax_rate <>", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateGreaterThan(Float value) {
            addCriterion("pured_tax_rate >", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pured_tax_rate >=", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateLessThan(Float value) {
            addCriterion("pured_tax_rate <", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("pured_tax_rate <=", value, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateIn(List<Float> values) {
            addCriterion("pured_tax_rate in", values, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateNotIn(List<Float> values) {
            addCriterion("pured_tax_rate not in", values, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateBetween(Float value1, Float value2) {
            addCriterion("pured_tax_rate between", value1, value2, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("pured_tax_rate not between", value1, value2, "puredTaxRate");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountIsNull() {
            addCriterion("pured_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountIsNotNull() {
            addCriterion("pured_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountEqualTo(Float value) {
            addCriterion("pured_tax_amount =", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountNotEqualTo(Float value) {
            addCriterion("pured_tax_amount <>", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountGreaterThan(Float value) {
            addCriterion("pured_tax_amount >", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pured_tax_amount >=", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountLessThan(Float value) {
            addCriterion("pured_tax_amount <", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pured_tax_amount <=", value, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountIn(List<Float> values) {
            addCriterion("pured_tax_amount in", values, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountNotIn(List<Float> values) {
            addCriterion("pured_tax_amount not in", values, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pured_tax_amount between", value1, value2, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pured_tax_amount not between", value1, value2, "puredTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountIsNull() {
            addCriterion("pured_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountIsNotNull() {
            addCriterion("pured_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountEqualTo(Float value) {
            addCriterion("pured_including_tax_amount =", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("pured_including_tax_amount <>", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("pured_including_tax_amount >", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pured_including_tax_amount >=", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountLessThan(Float value) {
            addCriterion("pured_including_tax_amount <", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pured_including_tax_amount <=", value, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountIn(List<Float> values) {
            addCriterion("pured_including_tax_amount in", values, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("pured_including_tax_amount not in", values, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pured_including_tax_amount between", value1, value2, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pured_including_tax_amount not between", value1, value2, "puredIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberIsNull() {
            addCriterion("pured_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberIsNotNull() {
            addCriterion("pured_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberEqualTo(String value) {
            addCriterion("pured_batch_number =", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberNotEqualTo(String value) {
            addCriterion("pured_batch_number <>", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberGreaterThan(String value) {
            addCriterion("pured_batch_number >", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pured_batch_number >=", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberLessThan(String value) {
            addCriterion("pured_batch_number <", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("pured_batch_number <=", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberLike(String value) {
            addCriterion("pured_batch_number like", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberNotLike(String value) {
            addCriterion("pured_batch_number not like", value, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberIn(List<String> values) {
            addCriterion("pured_batch_number in", values, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberNotIn(List<String> values) {
            addCriterion("pured_batch_number not in", values, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberBetween(String value1, String value2) {
            addCriterion("pured_batch_number between", value1, value2, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredBatchNumberNotBetween(String value1, String value2) {
            addCriterion("pured_batch_number not between", value1, value2, "puredBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftIsNull() {
            addCriterion("pured_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftIsNotNull() {
            addCriterion("pured_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftEqualTo(String value) {
            addCriterion("pured_ifgift =", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftNotEqualTo(String value) {
            addCriterion("pured_ifgift <>", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftGreaterThan(String value) {
            addCriterion("pured_ifgift >", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("pured_ifgift >=", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftLessThan(String value) {
            addCriterion("pured_ifgift <", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftLessThanOrEqualTo(String value) {
            addCriterion("pured_ifgift <=", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftLike(String value) {
            addCriterion("pured_ifgift like", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftNotLike(String value) {
            addCriterion("pured_ifgift not like", value, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftIn(List<String> values) {
            addCriterion("pured_ifgift in", values, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftNotIn(List<String> values) {
            addCriterion("pured_ifgift not in", values, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftBetween(String value1, String value2) {
            addCriterion("pured_ifgift between", value1, value2, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredIfgiftNotBetween(String value1, String value2) {
            addCriterion("pured_ifgift not between", value1, value2, "puredIfgift");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsIsNull() {
            addCriterion("pured_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsIsNotNull() {
            addCriterion("pured_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsEqualTo(String value) {
            addCriterion("pured_invoice_details =", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsNotEqualTo(String value) {
            addCriterion("pured_invoice_details <>", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsGreaterThan(String value) {
            addCriterion("pured_invoice_details >", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("pured_invoice_details >=", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsLessThan(String value) {
            addCriterion("pured_invoice_details <", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("pured_invoice_details <=", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsLike(String value) {
            addCriterion("pured_invoice_details like", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsNotLike(String value) {
            addCriterion("pured_invoice_details not like", value, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsIn(List<String> values) {
            addCriterion("pured_invoice_details in", values, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsNotIn(List<String> values) {
            addCriterion("pured_invoice_details not in", values, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("pured_invoice_details between", value1, value2, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("pured_invoice_details not between", value1, value2, "puredInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksIsNull() {
            addCriterion("pured_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksIsNotNull() {
            addCriterion("pured_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksEqualTo(String value) {
            addCriterion("pured_remarks =", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksNotEqualTo(String value) {
            addCriterion("pured_remarks <>", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksGreaterThan(String value) {
            addCriterion("pured_remarks >", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("pured_remarks >=", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksLessThan(String value) {
            addCriterion("pured_remarks <", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksLessThanOrEqualTo(String value) {
            addCriterion("pured_remarks <=", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksLike(String value) {
            addCriterion("pured_remarks like", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksNotLike(String value) {
            addCriterion("pured_remarks not like", value, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksIn(List<String> values) {
            addCriterion("pured_remarks in", values, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksNotIn(List<String> values) {
            addCriterion("pured_remarks not in", values, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksBetween(String value1, String value2) {
            addCriterion("pured_remarks between", value1, value2, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredRemarksNotBetween(String value1, String value2) {
            addCriterion("pured_remarks not between", value1, value2, "puredRemarks");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderIsNull() {
            addCriterion("pured_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderIsNotNull() {
            addCriterion("pured_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderEqualTo(String value) {
            addCriterion("pured_source_order =", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderNotEqualTo(String value) {
            addCriterion("pured_source_order <>", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderGreaterThan(String value) {
            addCriterion("pured_source_order >", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("pured_source_order >=", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderLessThan(String value) {
            addCriterion("pured_source_order <", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("pured_source_order <=", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderLike(String value) {
            addCriterion("pured_source_order like", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderNotLike(String value) {
            addCriterion("pured_source_order not like", value, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderIn(List<String> values) {
            addCriterion("pured_source_order in", values, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderNotIn(List<String> values) {
            addCriterion("pured_source_order not in", values, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderBetween(String value1, String value2) {
            addCriterion("pured_source_order between", value1, value2, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceOrderNotBetween(String value1, String value2) {
            addCriterion("pured_source_order not between", value1, value2, "puredSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoIsNull() {
            addCriterion("pured_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoIsNotNull() {
            addCriterion("pured_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoEqualTo(String value) {
            addCriterion("pured_source_no =", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoNotEqualTo(String value) {
            addCriterion("pured_source_no <>", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoGreaterThan(String value) {
            addCriterion("pured_source_no >", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("pured_source_no >=", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoLessThan(String value) {
            addCriterion("pured_source_no <", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoLessThanOrEqualTo(String value) {
            addCriterion("pured_source_no <=", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoLike(String value) {
            addCriterion("pured_source_no like", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoNotLike(String value) {
            addCriterion("pured_source_no not like", value, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoIn(List<String> values) {
            addCriterion("pured_source_no in", values, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoNotIn(List<String> values) {
            addCriterion("pured_source_no not in", values, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoBetween(String value1, String value2) {
            addCriterion("pured_source_no between", value1, value2, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredSourceNoNotBetween(String value1, String value2) {
            addCriterion("pured_source_no not between", value1, value2, "puredSourceNo");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingIsNull() {
            addCriterion("pured_auditing is null");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingIsNotNull() {
            addCriterion("pured_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingEqualTo(String value) {
            addCriterion("pured_auditing =", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingNotEqualTo(String value) {
            addCriterion("pured_auditing <>", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingGreaterThan(String value) {
            addCriterion("pured_auditing >", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("pured_auditing >=", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingLessThan(String value) {
            addCriterion("pured_auditing <", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingLessThanOrEqualTo(String value) {
            addCriterion("pured_auditing <=", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingLike(String value) {
            addCriterion("pured_auditing like", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingNotLike(String value) {
            addCriterion("pured_auditing not like", value, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingIn(List<String> values) {
            addCriterion("pured_auditing in", values, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingNotIn(List<String> values) {
            addCriterion("pured_auditing not in", values, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingBetween(String value1, String value2) {
            addCriterion("pured_auditing between", value1, value2, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredAuditingNotBetween(String value1, String value2) {
            addCriterion("pured_auditing not between", value1, value2, "puredAuditing");
            return (Criteria) this;
        }

        public Criteria andPuredYnIsNull() {
            addCriterion("pured_yn is null");
            return (Criteria) this;
        }

        public Criteria andPuredYnIsNotNull() {
            addCriterion("pured_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPuredYnEqualTo(String value) {
            addCriterion("pured_yn =", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnNotEqualTo(String value) {
            addCriterion("pured_yn <>", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnGreaterThan(String value) {
            addCriterion("pured_yn >", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnGreaterThanOrEqualTo(String value) {
            addCriterion("pured_yn >=", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnLessThan(String value) {
            addCriterion("pured_yn <", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnLessThanOrEqualTo(String value) {
            addCriterion("pured_yn <=", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnLike(String value) {
            addCriterion("pured_yn like", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnNotLike(String value) {
            addCriterion("pured_yn not like", value, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnIn(List<String> values) {
            addCriterion("pured_yn in", values, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnNotIn(List<String> values) {
            addCriterion("pured_yn not in", values, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnBetween(String value1, String value2) {
            addCriterion("pured_yn between", value1, value2, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredYnNotBetween(String value1, String value2) {
            addCriterion("pured_yn not between", value1, value2, "puredYn");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1IsNull() {
            addCriterion("pured_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1IsNotNull() {
            addCriterion("pured_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1EqualTo(String value) {
            addCriterion("pured_custom1 =", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1NotEqualTo(String value) {
            addCriterion("pured_custom1 <>", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1GreaterThan(String value) {
            addCriterion("pured_custom1 >", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom1 >=", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1LessThan(String value) {
            addCriterion("pured_custom1 <", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1LessThanOrEqualTo(String value) {
            addCriterion("pured_custom1 <=", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1Like(String value) {
            addCriterion("pured_custom1 like", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1NotLike(String value) {
            addCriterion("pured_custom1 not like", value, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1In(List<String> values) {
            addCriterion("pured_custom1 in", values, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1NotIn(List<String> values) {
            addCriterion("pured_custom1 not in", values, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1Between(String value1, String value2) {
            addCriterion("pured_custom1 between", value1, value2, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom1NotBetween(String value1, String value2) {
            addCriterion("pured_custom1 not between", value1, value2, "puredCustom1");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2IsNull() {
            addCriterion("pured_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2IsNotNull() {
            addCriterion("pured_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2EqualTo(String value) {
            addCriterion("pured_custom2 =", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2NotEqualTo(String value) {
            addCriterion("pured_custom2 <>", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2GreaterThan(String value) {
            addCriterion("pured_custom2 >", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom2 >=", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2LessThan(String value) {
            addCriterion("pured_custom2 <", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2LessThanOrEqualTo(String value) {
            addCriterion("pured_custom2 <=", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2Like(String value) {
            addCriterion("pured_custom2 like", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2NotLike(String value) {
            addCriterion("pured_custom2 not like", value, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2In(List<String> values) {
            addCriterion("pured_custom2 in", values, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2NotIn(List<String> values) {
            addCriterion("pured_custom2 not in", values, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2Between(String value1, String value2) {
            addCriterion("pured_custom2 between", value1, value2, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom2NotBetween(String value1, String value2) {
            addCriterion("pured_custom2 not between", value1, value2, "puredCustom2");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3IsNull() {
            addCriterion("pured_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3IsNotNull() {
            addCriterion("pured_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3EqualTo(String value) {
            addCriterion("pured_custom3 =", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3NotEqualTo(String value) {
            addCriterion("pured_custom3 <>", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3GreaterThan(String value) {
            addCriterion("pured_custom3 >", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom3 >=", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3LessThan(String value) {
            addCriterion("pured_custom3 <", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3LessThanOrEqualTo(String value) {
            addCriterion("pured_custom3 <=", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3Like(String value) {
            addCriterion("pured_custom3 like", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3NotLike(String value) {
            addCriterion("pured_custom3 not like", value, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3In(List<String> values) {
            addCriterion("pured_custom3 in", values, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3NotIn(List<String> values) {
            addCriterion("pured_custom3 not in", values, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3Between(String value1, String value2) {
            addCriterion("pured_custom3 between", value1, value2, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom3NotBetween(String value1, String value2) {
            addCriterion("pured_custom3 not between", value1, value2, "puredCustom3");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4IsNull() {
            addCriterion("pured_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4IsNotNull() {
            addCriterion("pured_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4EqualTo(String value) {
            addCriterion("pured_custom4 =", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4NotEqualTo(String value) {
            addCriterion("pured_custom4 <>", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4GreaterThan(String value) {
            addCriterion("pured_custom4 >", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom4 >=", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4LessThan(String value) {
            addCriterion("pured_custom4 <", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4LessThanOrEqualTo(String value) {
            addCriterion("pured_custom4 <=", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4Like(String value) {
            addCriterion("pured_custom4 like", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4NotLike(String value) {
            addCriterion("pured_custom4 not like", value, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4In(List<String> values) {
            addCriterion("pured_custom4 in", values, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4NotIn(List<String> values) {
            addCriterion("pured_custom4 not in", values, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4Between(String value1, String value2) {
            addCriterion("pured_custom4 between", value1, value2, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom4NotBetween(String value1, String value2) {
            addCriterion("pured_custom4 not between", value1, value2, "puredCustom4");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5IsNull() {
            addCriterion("pured_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5IsNotNull() {
            addCriterion("pured_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5EqualTo(String value) {
            addCriterion("pured_custom5 =", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5NotEqualTo(String value) {
            addCriterion("pured_custom5 <>", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5GreaterThan(String value) {
            addCriterion("pured_custom5 >", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom5 >=", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5LessThan(String value) {
            addCriterion("pured_custom5 <", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5LessThanOrEqualTo(String value) {
            addCriterion("pured_custom5 <=", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5Like(String value) {
            addCriterion("pured_custom5 like", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5NotLike(String value) {
            addCriterion("pured_custom5 not like", value, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5In(List<String> values) {
            addCriterion("pured_custom5 in", values, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5NotIn(List<String> values) {
            addCriterion("pured_custom5 not in", values, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5Between(String value1, String value2) {
            addCriterion("pured_custom5 between", value1, value2, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom5NotBetween(String value1, String value2) {
            addCriterion("pured_custom5 not between", value1, value2, "puredCustom5");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6IsNull() {
            addCriterion("pured_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6IsNotNull() {
            addCriterion("pured_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6EqualTo(String value) {
            addCriterion("pured_custom6 =", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6NotEqualTo(String value) {
            addCriterion("pured_custom6 <>", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6GreaterThan(String value) {
            addCriterion("pured_custom6 >", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pured_custom6 >=", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6LessThan(String value) {
            addCriterion("pured_custom6 <", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6LessThanOrEqualTo(String value) {
            addCriterion("pured_custom6 <=", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6Like(String value) {
            addCriterion("pured_custom6 like", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6NotLike(String value) {
            addCriterion("pured_custom6 not like", value, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6In(List<String> values) {
            addCriterion("pured_custom6 in", values, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6NotIn(List<String> values) {
            addCriterion("pured_custom6 not in", values, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6Between(String value1, String value2) {
            addCriterion("pured_custom6 between", value1, value2, "puredCustom6");
            return (Criteria) this;
        }

        public Criteria andPuredCustom6NotBetween(String value1, String value2) {
            addCriterion("pured_custom6 not between", value1, value2, "puredCustom6");
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