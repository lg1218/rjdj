package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseStorageDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStorageDetailedExample() {
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

        public Criteria andPsdIdIsNull() {
            addCriterion("psd_id is null");
            return (Criteria) this;
        }

        public Criteria andPsdIdIsNotNull() {
            addCriterion("psd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsdIdEqualTo(String value) {
            addCriterion("psd_id =", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotEqualTo(String value) {
            addCriterion("psd_id <>", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdGreaterThan(String value) {
            addCriterion("psd_id >", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdGreaterThanOrEqualTo(String value) {
            addCriterion("psd_id >=", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdLessThan(String value) {
            addCriterion("psd_id <", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdLessThanOrEqualTo(String value) {
            addCriterion("psd_id <=", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdLike(String value) {
            addCriterion("psd_id like", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotLike(String value) {
            addCriterion("psd_id not like", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdIn(List<String> values) {
            addCriterion("psd_id in", values, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotIn(List<String> values) {
            addCriterion("psd_id not in", values, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdBetween(String value1, String value2) {
            addCriterion("psd_id between", value1, value2, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotBetween(String value1, String value2) {
            addCriterion("psd_id not between", value1, value2, "psdId");
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

        public Criteria andPsdEngnameIsNull() {
            addCriterion("psd_engname is null");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameIsNotNull() {
            addCriterion("psd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameEqualTo(String value) {
            addCriterion("psd_engname =", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameNotEqualTo(String value) {
            addCriterion("psd_engname <>", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameGreaterThan(String value) {
            addCriterion("psd_engname >", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("psd_engname >=", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameLessThan(String value) {
            addCriterion("psd_engname <", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameLessThanOrEqualTo(String value) {
            addCriterion("psd_engname <=", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameLike(String value) {
            addCriterion("psd_engname like", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameNotLike(String value) {
            addCriterion("psd_engname not like", value, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameIn(List<String> values) {
            addCriterion("psd_engname in", values, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameNotIn(List<String> values) {
            addCriterion("psd_engname not in", values, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameBetween(String value1, String value2) {
            addCriterion("psd_engname between", value1, value2, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdEngnameNotBetween(String value1, String value2) {
            addCriterion("psd_engname not between", value1, value2, "psdEngname");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIsNull() {
            addCriterion("psd_remark is null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIsNotNull() {
            addCriterion("psd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkEqualTo(String value) {
            addCriterion("psd_remark =", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotEqualTo(String value) {
            addCriterion("psd_remark <>", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkGreaterThan(String value) {
            addCriterion("psd_remark >", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("psd_remark >=", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLessThan(String value) {
            addCriterion("psd_remark <", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLessThanOrEqualTo(String value) {
            addCriterion("psd_remark <=", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLike(String value) {
            addCriterion("psd_remark like", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotLike(String value) {
            addCriterion("psd_remark not like", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIn(List<String> values) {
            addCriterion("psd_remark in", values, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotIn(List<String> values) {
            addCriterion("psd_remark not in", values, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkBetween(String value1, String value2) {
            addCriterion("psd_remark between", value1, value2, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotBetween(String value1, String value2) {
            addCriterion("psd_remark not between", value1, value2, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxIsNull() {
            addCriterion("psd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxIsNotNull() {
            addCriterion("psd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxEqualTo(String value) {
            addCriterion("psd_price_include_tax =", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("psd_price_include_tax <>", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("psd_price_include_tax >", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("psd_price_include_tax >=", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxLessThan(String value) {
            addCriterion("psd_price_include_tax <", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("psd_price_include_tax <=", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxLike(String value) {
            addCriterion("psd_price_include_tax like", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxNotLike(String value) {
            addCriterion("psd_price_include_tax not like", value, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxIn(List<String> values) {
            addCriterion("psd_price_include_tax in", values, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("psd_price_include_tax not in", values, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("psd_price_include_tax between", value1, value2, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("psd_price_include_tax not between", value1, value2, "psdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusIsNull() {
            addCriterion("psd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusIsNotNull() {
            addCriterion("psd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusEqualTo(Integer value) {
            addCriterion("psd_single_status =", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusNotEqualTo(Integer value) {
            addCriterion("psd_single_status <>", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusGreaterThan(Integer value) {
            addCriterion("psd_single_status >", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_single_status >=", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusLessThan(Integer value) {
            addCriterion("psd_single_status <", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("psd_single_status <=", value, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusIn(List<Integer> values) {
            addCriterion("psd_single_status in", values, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusNotIn(List<Integer> values) {
            addCriterion("psd_single_status not in", values, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("psd_single_status between", value1, value2, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_single_status not between", value1, value2, "psdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateIsNull() {
            addCriterion("psd_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateIsNotNull() {
            addCriterion("psd_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("psd_document_date =", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("psd_document_date <>", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("psd_document_date >", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psd_document_date >=", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("psd_document_date <", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psd_document_date <=", value, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("psd_document_date in", values, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("psd_document_date not in", values, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psd_document_date between", value1, value2, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psd_document_date not between", value1, value2, "psdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIsNull() {
            addCriterion("psd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIsNotNull() {
            addCriterion("psd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberEqualTo(String value) {
            addCriterion("psd_document_number =", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotEqualTo(String value) {
            addCriterion("psd_document_number <>", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberGreaterThan(String value) {
            addCriterion("psd_document_number >", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("psd_document_number >=", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLessThan(String value) {
            addCriterion("psd_document_number <", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("psd_document_number <=", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLike(String value) {
            addCriterion("psd_document_number like", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotLike(String value) {
            addCriterion("psd_document_number not like", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIn(List<String> values) {
            addCriterion("psd_document_number in", values, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotIn(List<String> values) {
            addCriterion("psd_document_number not in", values, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberBetween(String value1, String value2) {
            addCriterion("psd_document_number between", value1, value2, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("psd_document_number not between", value1, value2, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIsNull() {
            addCriterion("psd_price is null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIsNotNull() {
            addCriterion("psd_price is not null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceEqualTo(Float value) {
            addCriterion("psd_price =", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotEqualTo(Float value) {
            addCriterion("psd_price <>", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceGreaterThan(Float value) {
            addCriterion("psd_price >", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_price >=", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceLessThan(Float value) {
            addCriterion("psd_price <", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceLessThanOrEqualTo(Float value) {
            addCriterion("psd_price <=", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIn(List<Float> values) {
            addCriterion("psd_price in", values, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotIn(List<Float> values) {
            addCriterion("psd_price not in", values, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceBetween(Float value1, Float value2) {
            addCriterion("psd_price between", value1, value2, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotBetween(Float value1, Float value2) {
            addCriterion("psd_price not between", value1, value2, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIsNull() {
            addCriterion("psd_money is null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIsNotNull() {
            addCriterion("psd_money is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyEqualTo(Float value) {
            addCriterion("psd_money =", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotEqualTo(Float value) {
            addCriterion("psd_money <>", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyGreaterThan(Float value) {
            addCriterion("psd_money >", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_money >=", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyLessThan(Float value) {
            addCriterion("psd_money <", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("psd_money <=", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIn(List<Float> values) {
            addCriterion("psd_money in", values, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotIn(List<Float> values) {
            addCriterion("psd_money not in", values, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyBetween(Float value1, Float value2) {
            addCriterion("psd_money between", value1, value2, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("psd_money not between", value1, value2, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIsNull() {
            addCriterion("psd_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIsNotNull() {
            addCriterion("psd_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateEqualTo(Float value) {
            addCriterion("psd_tax_rate =", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotEqualTo(Float value) {
            addCriterion("psd_tax_rate <>", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateGreaterThan(Float value) {
            addCriterion("psd_tax_rate >", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_tax_rate >=", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateLessThan(Float value) {
            addCriterion("psd_tax_rate <", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("psd_tax_rate <=", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIn(List<Float> values) {
            addCriterion("psd_tax_rate in", values, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotIn(List<Float> values) {
            addCriterion("psd_tax_rate not in", values, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateBetween(Float value1, Float value2) {
            addCriterion("psd_tax_rate between", value1, value2, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("psd_tax_rate not between", value1, value2, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIsNull() {
            addCriterion("psd_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIsNotNull() {
            addCriterion("psd_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountEqualTo(Float value) {
            addCriterion("psd_tax_amount =", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotEqualTo(Float value) {
            addCriterion("psd_tax_amount <>", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountGreaterThan(Float value) {
            addCriterion("psd_tax_amount >", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_tax_amount >=", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountLessThan(Float value) {
            addCriterion("psd_tax_amount <", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("psd_tax_amount <=", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIn(List<Float> values) {
            addCriterion("psd_tax_amount in", values, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotIn(List<Float> values) {
            addCriterion("psd_tax_amount not in", values, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountBetween(Float value1, Float value2) {
            addCriterion("psd_tax_amount between", value1, value2, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("psd_tax_amount not between", value1, value2, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIsNull() {
            addCriterion("psd_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIsNotNull() {
            addCriterion("psd_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountEqualTo(Float value) {
            addCriterion("psd_including_tax_amount =", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("psd_including_tax_amount <>", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("psd_including_tax_amount >", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_including_tax_amount >=", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountLessThan(Float value) {
            addCriterion("psd_including_tax_amount <", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("psd_including_tax_amount <=", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIn(List<Float> values) {
            addCriterion("psd_including_tax_amount in", values, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("psd_including_tax_amount not in", values, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("psd_including_tax_amount between", value1, value2, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("psd_including_tax_amount not between", value1, value2, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberIsNull() {
            addCriterion("psd_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberIsNotNull() {
            addCriterion("psd_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberEqualTo(String value) {
            addCriterion("psd_batch_number =", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberNotEqualTo(String value) {
            addCriterion("psd_batch_number <>", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberGreaterThan(String value) {
            addCriterion("psd_batch_number >", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("psd_batch_number >=", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberLessThan(String value) {
            addCriterion("psd_batch_number <", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("psd_batch_number <=", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberLike(String value) {
            addCriterion("psd_batch_number like", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberNotLike(String value) {
            addCriterion("psd_batch_number not like", value, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberIn(List<String> values) {
            addCriterion("psd_batch_number in", values, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberNotIn(List<String> values) {
            addCriterion("psd_batch_number not in", values, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberBetween(String value1, String value2) {
            addCriterion("psd_batch_number between", value1, value2, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdBatchNumberNotBetween(String value1, String value2) {
            addCriterion("psd_batch_number not between", value1, value2, "psdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftIsNull() {
            addCriterion("psd_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftIsNotNull() {
            addCriterion("psd_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftEqualTo(String value) {
            addCriterion("psd_ifgift =", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftNotEqualTo(String value) {
            addCriterion("psd_ifgift <>", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftGreaterThan(String value) {
            addCriterion("psd_ifgift >", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("psd_ifgift >=", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftLessThan(String value) {
            addCriterion("psd_ifgift <", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftLessThanOrEqualTo(String value) {
            addCriterion("psd_ifgift <=", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftLike(String value) {
            addCriterion("psd_ifgift like", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftNotLike(String value) {
            addCriterion("psd_ifgift not like", value, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftIn(List<String> values) {
            addCriterion("psd_ifgift in", values, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftNotIn(List<String> values) {
            addCriterion("psd_ifgift not in", values, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftBetween(String value1, String value2) {
            addCriterion("psd_ifgift between", value1, value2, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdIfgiftNotBetween(String value1, String value2) {
            addCriterion("psd_ifgift not between", value1, value2, "psdIfgift");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNull() {
            addCriterion("psd_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNotNull() {
            addCriterion("psd_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsEqualTo(String value) {
            addCriterion("psd_invoice_details =", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotEqualTo(String value) {
            addCriterion("psd_invoice_details <>", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThan(String value) {
            addCriterion("psd_invoice_details >", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details >=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThan(String value) {
            addCriterion("psd_invoice_details <", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details <=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLike(String value) {
            addCriterion("psd_invoice_details like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotLike(String value) {
            addCriterion("psd_invoice_details not like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIn(List<String> values) {
            addCriterion("psd_invoice_details in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotIn(List<String> values) {
            addCriterion("psd_invoice_details not in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("psd_invoice_details between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("psd_invoice_details not between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIsNull() {
            addCriterion("psd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIsNotNull() {
            addCriterion("psd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksEqualTo(String value) {
            addCriterion("psd_remarks =", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotEqualTo(String value) {
            addCriterion("psd_remarks <>", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksGreaterThan(String value) {
            addCriterion("psd_remarks >", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("psd_remarks >=", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLessThan(String value) {
            addCriterion("psd_remarks <", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLessThanOrEqualTo(String value) {
            addCriterion("psd_remarks <=", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLike(String value) {
            addCriterion("psd_remarks like", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotLike(String value) {
            addCriterion("psd_remarks not like", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIn(List<String> values) {
            addCriterion("psd_remarks in", values, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotIn(List<String> values) {
            addCriterion("psd_remarks not in", values, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksBetween(String value1, String value2) {
            addCriterion("psd_remarks between", value1, value2, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotBetween(String value1, String value2) {
            addCriterion("psd_remarks not between", value1, value2, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIsNull() {
            addCriterion("psd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIsNotNull() {
            addCriterion("psd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderEqualTo(String value) {
            addCriterion("psd_source_order =", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotEqualTo(String value) {
            addCriterion("psd_source_order <>", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderGreaterThan(String value) {
            addCriterion("psd_source_order >", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("psd_source_order >=", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLessThan(String value) {
            addCriterion("psd_source_order <", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("psd_source_order <=", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLike(String value) {
            addCriterion("psd_source_order like", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotLike(String value) {
            addCriterion("psd_source_order not like", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIn(List<String> values) {
            addCriterion("psd_source_order in", values, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotIn(List<String> values) {
            addCriterion("psd_source_order not in", values, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderBetween(String value1, String value2) {
            addCriterion("psd_source_order between", value1, value2, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("psd_source_order not between", value1, value2, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIsNull() {
            addCriterion("psd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIsNotNull() {
            addCriterion("psd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoEqualTo(String value) {
            addCriterion("psd_source_no =", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotEqualTo(String value) {
            addCriterion("psd_source_no <>", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoGreaterThan(String value) {
            addCriterion("psd_source_no >", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("psd_source_no >=", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLessThan(String value) {
            addCriterion("psd_source_no <", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("psd_source_no <=", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLike(String value) {
            addCriterion("psd_source_no like", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotLike(String value) {
            addCriterion("psd_source_no not like", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIn(List<String> values) {
            addCriterion("psd_source_no in", values, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotIn(List<String> values) {
            addCriterion("psd_source_no not in", values, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoBetween(String value1, String value2) {
            addCriterion("psd_source_no between", value1, value2, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotBetween(String value1, String value2) {
            addCriterion("psd_source_no not between", value1, value2, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingIsNull() {
            addCriterion("psd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingIsNotNull() {
            addCriterion("psd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingEqualTo(String value) {
            addCriterion("psd_auditing =", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingNotEqualTo(String value) {
            addCriterion("psd_auditing <>", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingGreaterThan(String value) {
            addCriterion("psd_auditing >", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("psd_auditing >=", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingLessThan(String value) {
            addCriterion("psd_auditing <", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingLessThanOrEqualTo(String value) {
            addCriterion("psd_auditing <=", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingLike(String value) {
            addCriterion("psd_auditing like", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingNotLike(String value) {
            addCriterion("psd_auditing not like", value, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingIn(List<String> values) {
            addCriterion("psd_auditing in", values, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingNotIn(List<String> values) {
            addCriterion("psd_auditing not in", values, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingBetween(String value1, String value2) {
            addCriterion("psd_auditing between", value1, value2, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdAuditingNotBetween(String value1, String value2) {
            addCriterion("psd_auditing not between", value1, value2, "psdAuditing");
            return (Criteria) this;
        }

        public Criteria andPsdYnIsNull() {
            addCriterion("psd_yn is null");
            return (Criteria) this;
        }

        public Criteria andPsdYnIsNotNull() {
            addCriterion("psd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPsdYnEqualTo(String value) {
            addCriterion("psd_yn =", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnNotEqualTo(String value) {
            addCriterion("psd_yn <>", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnGreaterThan(String value) {
            addCriterion("psd_yn >", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnGreaterThanOrEqualTo(String value) {
            addCriterion("psd_yn >=", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnLessThan(String value) {
            addCriterion("psd_yn <", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnLessThanOrEqualTo(String value) {
            addCriterion("psd_yn <=", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnLike(String value) {
            addCriterion("psd_yn like", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnNotLike(String value) {
            addCriterion("psd_yn not like", value, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnIn(List<String> values) {
            addCriterion("psd_yn in", values, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnNotIn(List<String> values) {
            addCriterion("psd_yn not in", values, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnBetween(String value1, String value2) {
            addCriterion("psd_yn between", value1, value2, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdYnNotBetween(String value1, String value2) {
            addCriterion("psd_yn not between", value1, value2, "psdYn");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1IsNull() {
            addCriterion("psd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1IsNotNull() {
            addCriterion("psd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1EqualTo(String value) {
            addCriterion("psd_custom1 =", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1NotEqualTo(String value) {
            addCriterion("psd_custom1 <>", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1GreaterThan(String value) {
            addCriterion("psd_custom1 >", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom1 >=", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1LessThan(String value) {
            addCriterion("psd_custom1 <", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1LessThanOrEqualTo(String value) {
            addCriterion("psd_custom1 <=", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1Like(String value) {
            addCriterion("psd_custom1 like", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1NotLike(String value) {
            addCriterion("psd_custom1 not like", value, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1In(List<String> values) {
            addCriterion("psd_custom1 in", values, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1NotIn(List<String> values) {
            addCriterion("psd_custom1 not in", values, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1Between(String value1, String value2) {
            addCriterion("psd_custom1 between", value1, value2, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom1NotBetween(String value1, String value2) {
            addCriterion("psd_custom1 not between", value1, value2, "psdCustom1");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2IsNull() {
            addCriterion("psd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2IsNotNull() {
            addCriterion("psd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2EqualTo(String value) {
            addCriterion("psd_custom2 =", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2NotEqualTo(String value) {
            addCriterion("psd_custom2 <>", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2GreaterThan(String value) {
            addCriterion("psd_custom2 >", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom2 >=", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2LessThan(String value) {
            addCriterion("psd_custom2 <", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2LessThanOrEqualTo(String value) {
            addCriterion("psd_custom2 <=", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2Like(String value) {
            addCriterion("psd_custom2 like", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2NotLike(String value) {
            addCriterion("psd_custom2 not like", value, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2In(List<String> values) {
            addCriterion("psd_custom2 in", values, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2NotIn(List<String> values) {
            addCriterion("psd_custom2 not in", values, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2Between(String value1, String value2) {
            addCriterion("psd_custom2 between", value1, value2, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom2NotBetween(String value1, String value2) {
            addCriterion("psd_custom2 not between", value1, value2, "psdCustom2");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3IsNull() {
            addCriterion("psd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3IsNotNull() {
            addCriterion("psd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3EqualTo(String value) {
            addCriterion("psd_custom3 =", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3NotEqualTo(String value) {
            addCriterion("psd_custom3 <>", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3GreaterThan(String value) {
            addCriterion("psd_custom3 >", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom3 >=", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3LessThan(String value) {
            addCriterion("psd_custom3 <", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3LessThanOrEqualTo(String value) {
            addCriterion("psd_custom3 <=", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3Like(String value) {
            addCriterion("psd_custom3 like", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3NotLike(String value) {
            addCriterion("psd_custom3 not like", value, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3In(List<String> values) {
            addCriterion("psd_custom3 in", values, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3NotIn(List<String> values) {
            addCriterion("psd_custom3 not in", values, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3Between(String value1, String value2) {
            addCriterion("psd_custom3 between", value1, value2, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom3NotBetween(String value1, String value2) {
            addCriterion("psd_custom3 not between", value1, value2, "psdCustom3");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4IsNull() {
            addCriterion("psd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4IsNotNull() {
            addCriterion("psd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4EqualTo(String value) {
            addCriterion("psd_custom4 =", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4NotEqualTo(String value) {
            addCriterion("psd_custom4 <>", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4GreaterThan(String value) {
            addCriterion("psd_custom4 >", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom4 >=", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4LessThan(String value) {
            addCriterion("psd_custom4 <", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4LessThanOrEqualTo(String value) {
            addCriterion("psd_custom4 <=", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4Like(String value) {
            addCriterion("psd_custom4 like", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4NotLike(String value) {
            addCriterion("psd_custom4 not like", value, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4In(List<String> values) {
            addCriterion("psd_custom4 in", values, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4NotIn(List<String> values) {
            addCriterion("psd_custom4 not in", values, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4Between(String value1, String value2) {
            addCriterion("psd_custom4 between", value1, value2, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom4NotBetween(String value1, String value2) {
            addCriterion("psd_custom4 not between", value1, value2, "psdCustom4");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5IsNull() {
            addCriterion("psd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5IsNotNull() {
            addCriterion("psd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5EqualTo(String value) {
            addCriterion("psd_custom5 =", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5NotEqualTo(String value) {
            addCriterion("psd_custom5 <>", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5GreaterThan(String value) {
            addCriterion("psd_custom5 >", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom5 >=", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5LessThan(String value) {
            addCriterion("psd_custom5 <", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5LessThanOrEqualTo(String value) {
            addCriterion("psd_custom5 <=", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5Like(String value) {
            addCriterion("psd_custom5 like", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5NotLike(String value) {
            addCriterion("psd_custom5 not like", value, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5In(List<String> values) {
            addCriterion("psd_custom5 in", values, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5NotIn(List<String> values) {
            addCriterion("psd_custom5 not in", values, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5Between(String value1, String value2) {
            addCriterion("psd_custom5 between", value1, value2, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom5NotBetween(String value1, String value2) {
            addCriterion("psd_custom5 not between", value1, value2, "psdCustom5");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6IsNull() {
            addCriterion("psd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6IsNotNull() {
            addCriterion("psd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6EqualTo(String value) {
            addCriterion("psd_custom6 =", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6NotEqualTo(String value) {
            addCriterion("psd_custom6 <>", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6GreaterThan(String value) {
            addCriterion("psd_custom6 >", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("psd_custom6 >=", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6LessThan(String value) {
            addCriterion("psd_custom6 <", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6LessThanOrEqualTo(String value) {
            addCriterion("psd_custom6 <=", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6Like(String value) {
            addCriterion("psd_custom6 like", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6NotLike(String value) {
            addCriterion("psd_custom6 not like", value, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6In(List<String> values) {
            addCriterion("psd_custom6 in", values, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6NotIn(List<String> values) {
            addCriterion("psd_custom6 not in", values, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6Between(String value1, String value2) {
            addCriterion("psd_custom6 between", value1, value2, "psdCustom6");
            return (Criteria) this;
        }

        public Criteria andPsdCustom6NotBetween(String value1, String value2) {
            addCriterion("psd_custom6 not between", value1, value2, "psdCustom6");
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