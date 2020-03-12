package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseRequisitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseRequisitionExample() {
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

        public Criteria andPrIdIsNull() {
            addCriterion("pr_id is null");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNotNull() {
            addCriterion("pr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrIdEqualTo(String value) {
            addCriterion("pr_id =", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotEqualTo(String value) {
            addCriterion("pr_id <>", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThan(String value) {
            addCriterion("pr_id >", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_id >=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThan(String value) {
            addCriterion("pr_id <", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThanOrEqualTo(String value) {
            addCriterion("pr_id <=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLike(String value) {
            addCriterion("pr_id like", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotLike(String value) {
            addCriterion("pr_id not like", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdIn(List<String> values) {
            addCriterion("pr_id in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotIn(List<String> values) {
            addCriterion("pr_id not in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdBetween(String value1, String value2) {
            addCriterion("pr_id between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotBetween(String value1, String value2) {
            addCriterion("pr_id not between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrtIdIsNull() {
            addCriterion("prt_id is null");
            return (Criteria) this;
        }

        public Criteria andPrtIdIsNotNull() {
            addCriterion("prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrtIdEqualTo(String value) {
            addCriterion("prt_id =", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotEqualTo(String value) {
            addCriterion("prt_id <>", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThan(String value) {
            addCriterion("prt_id >", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThanOrEqualTo(String value) {
            addCriterion("prt_id >=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThan(String value) {
            addCriterion("prt_id <", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThanOrEqualTo(String value) {
            addCriterion("prt_id <=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLike(String value) {
            addCriterion("prt_id like", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotLike(String value) {
            addCriterion("prt_id not like", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdIn(List<String> values) {
            addCriterion("prt_id in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotIn(List<String> values) {
            addCriterion("prt_id not in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdBetween(String value1, String value2) {
            addCriterion("prt_id between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotBetween(String value1, String value2) {
            addCriterion("prt_id not between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusIsNull() {
            addCriterion("pr_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusIsNotNull() {
            addCriterion("pr_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusEqualTo(String value) {
            addCriterion("pr_single_status =", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusNotEqualTo(String value) {
            addCriterion("pr_single_status <>", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusGreaterThan(String value) {
            addCriterion("pr_single_status >", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pr_single_status >=", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusLessThan(String value) {
            addCriterion("pr_single_status <", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("pr_single_status <=", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusLike(String value) {
            addCriterion("pr_single_status like", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusNotLike(String value) {
            addCriterion("pr_single_status not like", value, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusIn(List<String> values) {
            addCriterion("pr_single_status in", values, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusNotIn(List<String> values) {
            addCriterion("pr_single_status not in", values, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusBetween(String value1, String value2) {
            addCriterion("pr_single_status between", value1, value2, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrSingleStatusNotBetween(String value1, String value2) {
            addCriterion("pr_single_status not between", value1, value2, "prSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIsNull() {
            addCriterion("pr_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIsNotNull() {
            addCriterion("pr_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date =", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date <>", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pr_document_date >", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date >=", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pr_document_date <", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date <=", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pr_document_date in", values, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pr_document_date not in", values, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_document_date between", value1, value2, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_document_date not between", value1, value2, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberIsNull() {
            addCriterion("pr_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberIsNotNull() {
            addCriterion("pr_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberEqualTo(String value) {
            addCriterion("pr_document_number =", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotEqualTo(String value) {
            addCriterion("pr_document_number <>", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberGreaterThan(String value) {
            addCriterion("pr_document_number >", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pr_document_number >=", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLessThan(String value) {
            addCriterion("pr_document_number <", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pr_document_number <=", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLike(String value) {
            addCriterion("pr_document_number like", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotLike(String value) {
            addCriterion("pr_document_number not like", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberIn(List<String> values) {
            addCriterion("pr_document_number in", values, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotIn(List<String> values) {
            addCriterion("pr_document_number not in", values, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberBetween(String value1, String value2) {
            addCriterion("pr_document_number between", value1, value2, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pr_document_number not between", value1, value2, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrBuyerIsNull() {
            addCriterion("pr_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPrBuyerIsNotNull() {
            addCriterion("pr_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPrBuyerEqualTo(String value) {
            addCriterion("pr_buyer =", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerNotEqualTo(String value) {
            addCriterion("pr_buyer <>", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerGreaterThan(String value) {
            addCriterion("pr_buyer >", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("pr_buyer >=", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerLessThan(String value) {
            addCriterion("pr_buyer <", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerLessThanOrEqualTo(String value) {
            addCriterion("pr_buyer <=", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerLike(String value) {
            addCriterion("pr_buyer like", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerNotLike(String value) {
            addCriterion("pr_buyer not like", value, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerIn(List<String> values) {
            addCriterion("pr_buyer in", values, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerNotIn(List<String> values) {
            addCriterion("pr_buyer not in", values, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerBetween(String value1, String value2) {
            addCriterion("pr_buyer between", value1, value2, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBuyerNotBetween(String value1, String value2) {
            addCriterion("pr_buyer not between", value1, value2, "prBuyer");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionIsNull() {
            addCriterion("pr_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionIsNotNull() {
            addCriterion("pr_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionEqualTo(String value) {
            addCriterion("pr_belongs_section =", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionNotEqualTo(String value) {
            addCriterion("pr_belongs_section <>", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionGreaterThan(String value) {
            addCriterion("pr_belongs_section >", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pr_belongs_section >=", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionLessThan(String value) {
            addCriterion("pr_belongs_section <", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("pr_belongs_section <=", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionLike(String value) {
            addCriterion("pr_belongs_section like", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionNotLike(String value) {
            addCriterion("pr_belongs_section not like", value, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionIn(List<String> values) {
            addCriterion("pr_belongs_section in", values, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionNotIn(List<String> values) {
            addCriterion("pr_belongs_section not in", values, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionBetween(String value1, String value2) {
            addCriterion("pr_belongs_section between", value1, value2, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("pr_belongs_section not between", value1, value2, "prBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIsNull() {
            addCriterion("pr_executor is null");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIsNotNull() {
            addCriterion("pr_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPrExecutorEqualTo(String value) {
            addCriterion("pr_executor =", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotEqualTo(String value) {
            addCriterion("pr_executor <>", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorGreaterThan(String value) {
            addCriterion("pr_executor >", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("pr_executor >=", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLessThan(String value) {
            addCriterion("pr_executor <", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLessThanOrEqualTo(String value) {
            addCriterion("pr_executor <=", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLike(String value) {
            addCriterion("pr_executor like", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotLike(String value) {
            addCriterion("pr_executor not like", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIn(List<String> values) {
            addCriterion("pr_executor in", values, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotIn(List<String> values) {
            addCriterion("pr_executor not in", values, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorBetween(String value1, String value2) {
            addCriterion("pr_executor between", value1, value2, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotBetween(String value1, String value2) {
            addCriterion("pr_executor not between", value1, value2, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIsNull() {
            addCriterion("pr_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIsNotNull() {
            addCriterion("pr_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffEqualTo(String value) {
            addCriterion("pr_checkagain_staff =", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotEqualTo(String value) {
            addCriterion("pr_checkagain_staff <>", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffGreaterThan(String value) {
            addCriterion("pr_checkagain_staff >", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pr_checkagain_staff >=", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLessThan(String value) {
            addCriterion("pr_checkagain_staff <", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("pr_checkagain_staff <=", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLike(String value) {
            addCriterion("pr_checkagain_staff like", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotLike(String value) {
            addCriterion("pr_checkagain_staff not like", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIn(List<String> values) {
            addCriterion("pr_checkagain_staff in", values, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotIn(List<String> values) {
            addCriterion("pr_checkagain_staff not in", values, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffBetween(String value1, String value2) {
            addCriterion("pr_checkagain_staff between", value1, value2, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("pr_checkagain_staff not between", value1, value2, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrSumnumIsNull() {
            addCriterion("pr_sumnum is null");
            return (Criteria) this;
        }

        public Criteria andPrSumnumIsNotNull() {
            addCriterion("pr_sumnum is not null");
            return (Criteria) this;
        }

        public Criteria andPrSumnumEqualTo(Integer value) {
            addCriterion("pr_sumnum =", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumNotEqualTo(Integer value) {
            addCriterion("pr_sumnum <>", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumGreaterThan(Integer value) {
            addCriterion("pr_sumnum >", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_sumnum >=", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumLessThan(Integer value) {
            addCriterion("pr_sumnum <", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumLessThanOrEqualTo(Integer value) {
            addCriterion("pr_sumnum <=", value, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumIn(List<Integer> values) {
            addCriterion("pr_sumnum in", values, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumNotIn(List<Integer> values) {
            addCriterion("pr_sumnum not in", values, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumBetween(Integer value1, Integer value2) {
            addCriterion("pr_sumnum between", value1, value2, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrSumnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_sumnum not between", value1, value2, "prSumnum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumIsNull() {
            addCriterion("pr_nopurchase_num is null");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumIsNotNull() {
            addCriterion("pr_nopurchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumEqualTo(Integer value) {
            addCriterion("pr_nopurchase_num =", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumNotEqualTo(Integer value) {
            addCriterion("pr_nopurchase_num <>", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumGreaterThan(Integer value) {
            addCriterion("pr_nopurchase_num >", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_nopurchase_num >=", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumLessThan(Integer value) {
            addCriterion("pr_nopurchase_num <", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("pr_nopurchase_num <=", value, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumIn(List<Integer> values) {
            addCriterion("pr_nopurchase_num in", values, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumNotIn(List<Integer> values) {
            addCriterion("pr_nopurchase_num not in", values, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumBetween(Integer value1, Integer value2) {
            addCriterion("pr_nopurchase_num between", value1, value2, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrNopurchaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_nopurchase_num not between", value1, value2, "prNopurchaseNum");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionIsNull() {
            addCriterion("pr_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionIsNotNull() {
            addCriterion("pr_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionEqualTo(String value) {
            addCriterion("pr_header_provision =", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionNotEqualTo(String value) {
            addCriterion("pr_header_provision <>", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionGreaterThan(String value) {
            addCriterion("pr_header_provision >", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("pr_header_provision >=", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionLessThan(String value) {
            addCriterion("pr_header_provision <", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("pr_header_provision <=", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionLike(String value) {
            addCriterion("pr_header_provision like", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionNotLike(String value) {
            addCriterion("pr_header_provision not like", value, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionIn(List<String> values) {
            addCriterion("pr_header_provision in", values, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionNotIn(List<String> values) {
            addCriterion("pr_header_provision not in", values, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionBetween(String value1, String value2) {
            addCriterion("pr_header_provision between", value1, value2, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("pr_header_provision not between", value1, value2, "prHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseIsNull() {
            addCriterion("pr_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseIsNotNull() {
            addCriterion("pr_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseEqualTo(String value) {
            addCriterion("pr_end_clause =", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseNotEqualTo(String value) {
            addCriterion("pr_end_clause <>", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseGreaterThan(String value) {
            addCriterion("pr_end_clause >", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("pr_end_clause >=", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseLessThan(String value) {
            addCriterion("pr_end_clause <", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseLessThanOrEqualTo(String value) {
            addCriterion("pr_end_clause <=", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseLike(String value) {
            addCriterion("pr_end_clause like", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseNotLike(String value) {
            addCriterion("pr_end_clause not like", value, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseIn(List<String> values) {
            addCriterion("pr_end_clause in", values, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseNotIn(List<String> values) {
            addCriterion("pr_end_clause not in", values, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseBetween(String value1, String value2) {
            addCriterion("pr_end_clause between", value1, value2, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrEndClauseNotBetween(String value1, String value2) {
            addCriterion("pr_end_clause not between", value1, value2, "prEndClause");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNull() {
            addCriterion("pr_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNotNull() {
            addCriterion("pr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkEqualTo(String value) {
            addCriterion("pr_remark =", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotEqualTo(String value) {
            addCriterion("pr_remark <>", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThan(String value) {
            addCriterion("pr_remark >", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pr_remark >=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThan(String value) {
            addCriterion("pr_remark <", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThanOrEqualTo(String value) {
            addCriterion("pr_remark <=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLike(String value) {
            addCriterion("pr_remark like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotLike(String value) {
            addCriterion("pr_remark not like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIn(List<String> values) {
            addCriterion("pr_remark in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotIn(List<String> values) {
            addCriterion("pr_remark not in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkBetween(String value1, String value2) {
            addCriterion("pr_remark between", value1, value2, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotBetween(String value1, String value2) {
            addCriterion("pr_remark not between", value1, value2, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIsNull() {
            addCriterion("pr_audition is null");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIsNotNull() {
            addCriterion("pr_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPrAuditionEqualTo(String value) {
            addCriterion("pr_audition =", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotEqualTo(String value) {
            addCriterion("pr_audition <>", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionGreaterThan(String value) {
            addCriterion("pr_audition >", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pr_audition >=", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionLessThan(String value) {
            addCriterion("pr_audition <", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionLessThanOrEqualTo(String value) {
            addCriterion("pr_audition <=", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionLike(String value) {
            addCriterion("pr_audition like", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotLike(String value) {
            addCriterion("pr_audition not like", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIn(List<String> values) {
            addCriterion("pr_audition in", values, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotIn(List<String> values) {
            addCriterion("pr_audition not in", values, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionBetween(String value1, String value2) {
            addCriterion("pr_audition between", value1, value2, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotBetween(String value1, String value2) {
            addCriterion("pr_audition not between", value1, value2, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrYnIsNull() {
            addCriterion("pr_yn is null");
            return (Criteria) this;
        }

        public Criteria andPrYnIsNotNull() {
            addCriterion("pr_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPrYnEqualTo(String value) {
            addCriterion("pr_yn =", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotEqualTo(String value) {
            addCriterion("pr_yn <>", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnGreaterThan(String value) {
            addCriterion("pr_yn >", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnGreaterThanOrEqualTo(String value) {
            addCriterion("pr_yn >=", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnLessThan(String value) {
            addCriterion("pr_yn <", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnLessThanOrEqualTo(String value) {
            addCriterion("pr_yn <=", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnLike(String value) {
            addCriterion("pr_yn like", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotLike(String value) {
            addCriterion("pr_yn not like", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnIn(List<String> values) {
            addCriterion("pr_yn in", values, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotIn(List<String> values) {
            addCriterion("pr_yn not in", values, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnBetween(String value1, String value2) {
            addCriterion("pr_yn between", value1, value2, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotBetween(String value1, String value2) {
            addCriterion("pr_yn not between", value1, value2, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrCustom1IsNull() {
            addCriterion("pr_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom1IsNotNull() {
            addCriterion("pr_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom1EqualTo(String value) {
            addCriterion("pr_custom1 =", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotEqualTo(String value) {
            addCriterion("pr_custom1 <>", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1GreaterThan(String value) {
            addCriterion("pr_custom1 >", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom1 >=", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1LessThan(String value) {
            addCriterion("pr_custom1 <", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1LessThanOrEqualTo(String value) {
            addCriterion("pr_custom1 <=", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1Like(String value) {
            addCriterion("pr_custom1 like", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotLike(String value) {
            addCriterion("pr_custom1 not like", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1In(List<String> values) {
            addCriterion("pr_custom1 in", values, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotIn(List<String> values) {
            addCriterion("pr_custom1 not in", values, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1Between(String value1, String value2) {
            addCriterion("pr_custom1 between", value1, value2, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotBetween(String value1, String value2) {
            addCriterion("pr_custom1 not between", value1, value2, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom2IsNull() {
            addCriterion("pr_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom2IsNotNull() {
            addCriterion("pr_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom2EqualTo(String value) {
            addCriterion("pr_custom2 =", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotEqualTo(String value) {
            addCriterion("pr_custom2 <>", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2GreaterThan(String value) {
            addCriterion("pr_custom2 >", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom2 >=", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2LessThan(String value) {
            addCriterion("pr_custom2 <", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2LessThanOrEqualTo(String value) {
            addCriterion("pr_custom2 <=", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2Like(String value) {
            addCriterion("pr_custom2 like", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotLike(String value) {
            addCriterion("pr_custom2 not like", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2In(List<String> values) {
            addCriterion("pr_custom2 in", values, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotIn(List<String> values) {
            addCriterion("pr_custom2 not in", values, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2Between(String value1, String value2) {
            addCriterion("pr_custom2 between", value1, value2, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotBetween(String value1, String value2) {
            addCriterion("pr_custom2 not between", value1, value2, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom3IsNull() {
            addCriterion("pr_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom3IsNotNull() {
            addCriterion("pr_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom3EqualTo(String value) {
            addCriterion("pr_custom3 =", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3NotEqualTo(String value) {
            addCriterion("pr_custom3 <>", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3GreaterThan(String value) {
            addCriterion("pr_custom3 >", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom3 >=", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3LessThan(String value) {
            addCriterion("pr_custom3 <", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3LessThanOrEqualTo(String value) {
            addCriterion("pr_custom3 <=", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3Like(String value) {
            addCriterion("pr_custom3 like", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3NotLike(String value) {
            addCriterion("pr_custom3 not like", value, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3In(List<String> values) {
            addCriterion("pr_custom3 in", values, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3NotIn(List<String> values) {
            addCriterion("pr_custom3 not in", values, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3Between(String value1, String value2) {
            addCriterion("pr_custom3 between", value1, value2, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom3NotBetween(String value1, String value2) {
            addCriterion("pr_custom3 not between", value1, value2, "prCustom3");
            return (Criteria) this;
        }

        public Criteria andPrCustom4IsNull() {
            addCriterion("pr_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom4IsNotNull() {
            addCriterion("pr_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom4EqualTo(String value) {
            addCriterion("pr_custom4 =", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4NotEqualTo(String value) {
            addCriterion("pr_custom4 <>", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4GreaterThan(String value) {
            addCriterion("pr_custom4 >", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom4 >=", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4LessThan(String value) {
            addCriterion("pr_custom4 <", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4LessThanOrEqualTo(String value) {
            addCriterion("pr_custom4 <=", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4Like(String value) {
            addCriterion("pr_custom4 like", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4NotLike(String value) {
            addCriterion("pr_custom4 not like", value, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4In(List<String> values) {
            addCriterion("pr_custom4 in", values, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4NotIn(List<String> values) {
            addCriterion("pr_custom4 not in", values, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4Between(String value1, String value2) {
            addCriterion("pr_custom4 between", value1, value2, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom4NotBetween(String value1, String value2) {
            addCriterion("pr_custom4 not between", value1, value2, "prCustom4");
            return (Criteria) this;
        }

        public Criteria andPrCustom5IsNull() {
            addCriterion("pr_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom5IsNotNull() {
            addCriterion("pr_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom5EqualTo(String value) {
            addCriterion("pr_custom5 =", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5NotEqualTo(String value) {
            addCriterion("pr_custom5 <>", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5GreaterThan(String value) {
            addCriterion("pr_custom5 >", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom5 >=", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5LessThan(String value) {
            addCriterion("pr_custom5 <", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5LessThanOrEqualTo(String value) {
            addCriterion("pr_custom5 <=", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5Like(String value) {
            addCriterion("pr_custom5 like", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5NotLike(String value) {
            addCriterion("pr_custom5 not like", value, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5In(List<String> values) {
            addCriterion("pr_custom5 in", values, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5NotIn(List<String> values) {
            addCriterion("pr_custom5 not in", values, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5Between(String value1, String value2) {
            addCriterion("pr_custom5 between", value1, value2, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom5NotBetween(String value1, String value2) {
            addCriterion("pr_custom5 not between", value1, value2, "prCustom5");
            return (Criteria) this;
        }

        public Criteria andPrCustom6IsNull() {
            addCriterion("pr_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom6IsNotNull() {
            addCriterion("pr_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom6EqualTo(String value) {
            addCriterion("pr_custom6 =", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6NotEqualTo(String value) {
            addCriterion("pr_custom6 <>", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6GreaterThan(String value) {
            addCriterion("pr_custom6 >", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom6 >=", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6LessThan(String value) {
            addCriterion("pr_custom6 <", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6LessThanOrEqualTo(String value) {
            addCriterion("pr_custom6 <=", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6Like(String value) {
            addCriterion("pr_custom6 like", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6NotLike(String value) {
            addCriterion("pr_custom6 not like", value, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6In(List<String> values) {
            addCriterion("pr_custom6 in", values, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6NotIn(List<String> values) {
            addCriterion("pr_custom6 not in", values, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6Between(String value1, String value2) {
            addCriterion("pr_custom6 between", value1, value2, "prCustom6");
            return (Criteria) this;
        }

        public Criteria andPrCustom6NotBetween(String value1, String value2) {
            addCriterion("pr_custom6 not between", value1, value2, "prCustom6");
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