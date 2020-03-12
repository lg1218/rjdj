package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequisitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequisitionExample() {
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

        public Criteria andRequisitionIdIsNull() {
            addCriterion("requisition_id is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdIsNotNull() {
            addCriterion("requisition_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdEqualTo(String value) {
            addCriterion("requisition_id =", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdNotEqualTo(String value) {
            addCriterion("requisition_id <>", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdGreaterThan(String value) {
            addCriterion("requisition_id >", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_id >=", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdLessThan(String value) {
            addCriterion("requisition_id <", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdLessThanOrEqualTo(String value) {
            addCriterion("requisition_id <=", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdLike(String value) {
            addCriterion("requisition_id like", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdNotLike(String value) {
            addCriterion("requisition_id not like", value, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdIn(List<String> values) {
            addCriterion("requisition_id in", values, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdNotIn(List<String> values) {
            addCriterion("requisition_id not in", values, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdBetween(String value1, String value2) {
            addCriterion("requisition_id between", value1, value2, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionIdNotBetween(String value1, String value2) {
            addCriterion("requisition_id not between", value1, value2, "requisitionId");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseIsNull() {
            addCriterion("requisition_out_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseIsNotNull() {
            addCriterion("requisition_out_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseEqualTo(String value) {
            addCriterion("requisition_out_warehouse =", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseNotEqualTo(String value) {
            addCriterion("requisition_out_warehouse <>", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseGreaterThan(String value) {
            addCriterion("requisition_out_warehouse >", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_out_warehouse >=", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseLessThan(String value) {
            addCriterion("requisition_out_warehouse <", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseLessThanOrEqualTo(String value) {
            addCriterion("requisition_out_warehouse <=", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseLike(String value) {
            addCriterion("requisition_out_warehouse like", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseNotLike(String value) {
            addCriterion("requisition_out_warehouse not like", value, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseIn(List<String> values) {
            addCriterion("requisition_out_warehouse in", values, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseNotIn(List<String> values) {
            addCriterion("requisition_out_warehouse not in", values, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseBetween(String value1, String value2) {
            addCriterion("requisition_out_warehouse between", value1, value2, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionOutWarehouseNotBetween(String value1, String value2) {
            addCriterion("requisition_out_warehouse not between", value1, value2, "requisitionOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseIsNull() {
            addCriterion("requisition_input_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseIsNotNull() {
            addCriterion("requisition_input_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseEqualTo(String value) {
            addCriterion("requisition_input_warehouse =", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseNotEqualTo(String value) {
            addCriterion("requisition_input_warehouse <>", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseGreaterThan(String value) {
            addCriterion("requisition_input_warehouse >", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_input_warehouse >=", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseLessThan(String value) {
            addCriterion("requisition_input_warehouse <", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseLessThanOrEqualTo(String value) {
            addCriterion("requisition_input_warehouse <=", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseLike(String value) {
            addCriterion("requisition_input_warehouse like", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseNotLike(String value) {
            addCriterion("requisition_input_warehouse not like", value, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseIn(List<String> values) {
            addCriterion("requisition_input_warehouse in", values, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseNotIn(List<String> values) {
            addCriterion("requisition_input_warehouse not in", values, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseBetween(String value1, String value2) {
            addCriterion("requisition_input_warehouse between", value1, value2, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionInputWarehouseNotBetween(String value1, String value2) {
            addCriterion("requisition_input_warehouse not between", value1, value2, "requisitionInputWarehouse");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateIsNull() {
            addCriterion("requisition_documentation_date is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateIsNotNull() {
            addCriterion("requisition_documentation_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateEqualTo(Date value) {
            addCriterion("requisition_documentation_date =", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateNotEqualTo(Date value) {
            addCriterion("requisition_documentation_date <>", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateGreaterThan(Date value) {
            addCriterion("requisition_documentation_date >", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("requisition_documentation_date >=", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateLessThan(Date value) {
            addCriterion("requisition_documentation_date <", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateLessThanOrEqualTo(Date value) {
            addCriterion("requisition_documentation_date <=", value, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateIn(List<Date> values) {
            addCriterion("requisition_documentation_date in", values, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateNotIn(List<Date> values) {
            addCriterion("requisition_documentation_date not in", values, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateBetween(Date value1, Date value2) {
            addCriterion("requisition_documentation_date between", value1, value2, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationDateNotBetween(Date value1, Date value2) {
            addCriterion("requisition_documentation_date not between", value1, value2, "requisitionDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoIsNull() {
            addCriterion("requisition_documentation_no is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoIsNotNull() {
            addCriterion("requisition_documentation_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoEqualTo(String value) {
            addCriterion("requisition_documentation_no =", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoNotEqualTo(String value) {
            addCriterion("requisition_documentation_no <>", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoGreaterThan(String value) {
            addCriterion("requisition_documentation_no >", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_documentation_no >=", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoLessThan(String value) {
            addCriterion("requisition_documentation_no <", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoLessThanOrEqualTo(String value) {
            addCriterion("requisition_documentation_no <=", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoLike(String value) {
            addCriterion("requisition_documentation_no like", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoNotLike(String value) {
            addCriterion("requisition_documentation_no not like", value, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoIn(List<String> values) {
            addCriterion("requisition_documentation_no in", values, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoNotIn(List<String> values) {
            addCriterion("requisition_documentation_no not in", values, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoBetween(String value1, String value2) {
            addCriterion("requisition_documentation_no between", value1, value2, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionDocumentationNoNotBetween(String value1, String value2) {
            addCriterion("requisition_documentation_no not between", value1, value2, "requisitionDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormIsNull() {
            addCriterion("requisition_form is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormIsNotNull() {
            addCriterion("requisition_form is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormEqualTo(String value) {
            addCriterion("requisition_form =", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormNotEqualTo(String value) {
            addCriterion("requisition_form <>", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormGreaterThan(String value) {
            addCriterion("requisition_form >", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_form >=", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormLessThan(String value) {
            addCriterion("requisition_form <", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormLessThanOrEqualTo(String value) {
            addCriterion("requisition_form <=", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormLike(String value) {
            addCriterion("requisition_form like", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormNotLike(String value) {
            addCriterion("requisition_form not like", value, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormIn(List<String> values) {
            addCriterion("requisition_form in", values, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormNotIn(List<String> values) {
            addCriterion("requisition_form not in", values, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormBetween(String value1, String value2) {
            addCriterion("requisition_form between", value1, value2, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andRequisitionFormNotBetween(String value1, String value2) {
            addCriterion("requisition_form not between", value1, value2, "requisitionForm");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffIsNull() {
            addCriterion("is_review_staff is null");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffIsNotNull() {
            addCriterion("is_review_staff is not null");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffEqualTo(String value) {
            addCriterion("is_review_staff =", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffNotEqualTo(String value) {
            addCriterion("is_review_staff <>", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffGreaterThan(String value) {
            addCriterion("is_review_staff >", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffGreaterThanOrEqualTo(String value) {
            addCriterion("is_review_staff >=", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffLessThan(String value) {
            addCriterion("is_review_staff <", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffLessThanOrEqualTo(String value) {
            addCriterion("is_review_staff <=", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffLike(String value) {
            addCriterion("is_review_staff like", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffNotLike(String value) {
            addCriterion("is_review_staff not like", value, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffIn(List<String> values) {
            addCriterion("is_review_staff in", values, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffNotIn(List<String> values) {
            addCriterion("is_review_staff not in", values, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffBetween(String value1, String value2) {
            addCriterion("is_review_staff between", value1, value2, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andIsReviewStaffNotBetween(String value1, String value2) {
            addCriterion("is_review_staff not between", value1, value2, "isReviewStaff");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkIsNull() {
            addCriterion("requisition_remark is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkIsNotNull() {
            addCriterion("requisition_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkEqualTo(String value) {
            addCriterion("requisition_remark =", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkNotEqualTo(String value) {
            addCriterion("requisition_remark <>", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkGreaterThan(String value) {
            addCriterion("requisition_remark >", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_remark >=", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkLessThan(String value) {
            addCriterion("requisition_remark <", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkLessThanOrEqualTo(String value) {
            addCriterion("requisition_remark <=", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkLike(String value) {
            addCriterion("requisition_remark like", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkNotLike(String value) {
            addCriterion("requisition_remark not like", value, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkIn(List<String> values) {
            addCriterion("requisition_remark in", values, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkNotIn(List<String> values) {
            addCriterion("requisition_remark not in", values, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkBetween(String value1, String value2) {
            addCriterion("requisition_remark between", value1, value2, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionRemarkNotBetween(String value1, String value2) {
            addCriterion("requisition_remark not between", value1, value2, "requisitionRemark");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingIsNull() {
            addCriterion("requisition_auditing is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingIsNotNull() {
            addCriterion("requisition_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingEqualTo(String value) {
            addCriterion("requisition_auditing =", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingNotEqualTo(String value) {
            addCriterion("requisition_auditing <>", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingGreaterThan(String value) {
            addCriterion("requisition_auditing >", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_auditing >=", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingLessThan(String value) {
            addCriterion("requisition_auditing <", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingLessThanOrEqualTo(String value) {
            addCriterion("requisition_auditing <=", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingLike(String value) {
            addCriterion("requisition_auditing like", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingNotLike(String value) {
            addCriterion("requisition_auditing not like", value, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingIn(List<String> values) {
            addCriterion("requisition_auditing in", values, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingNotIn(List<String> values) {
            addCriterion("requisition_auditing not in", values, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingBetween(String value1, String value2) {
            addCriterion("requisition_auditing between", value1, value2, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionAuditingNotBetween(String value1, String value2) {
            addCriterion("requisition_auditing not between", value1, value2, "requisitionAuditing");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnIsNull() {
            addCriterion("requisition_yn is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnIsNotNull() {
            addCriterion("requisition_yn is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnEqualTo(String value) {
            addCriterion("requisition_yn =", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnNotEqualTo(String value) {
            addCriterion("requisition_yn <>", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnGreaterThan(String value) {
            addCriterion("requisition_yn >", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnGreaterThanOrEqualTo(String value) {
            addCriterion("requisition_yn >=", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnLessThan(String value) {
            addCriterion("requisition_yn <", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnLessThanOrEqualTo(String value) {
            addCriterion("requisition_yn <=", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnLike(String value) {
            addCriterion("requisition_yn like", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnNotLike(String value) {
            addCriterion("requisition_yn not like", value, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnIn(List<String> values) {
            addCriterion("requisition_yn in", values, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnNotIn(List<String> values) {
            addCriterion("requisition_yn not in", values, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnBetween(String value1, String value2) {
            addCriterion("requisition_yn between", value1, value2, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionYnNotBetween(String value1, String value2) {
            addCriterion("requisition_yn not between", value1, value2, "requisitionYn");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1IsNull() {
            addCriterion("requisition_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1IsNotNull() {
            addCriterion("requisition_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1EqualTo(String value) {
            addCriterion("requisition_custom1 =", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1NotEqualTo(String value) {
            addCriterion("requisition_custom1 <>", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1GreaterThan(String value) {
            addCriterion("requisition_custom1 >", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom1 >=", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1LessThan(String value) {
            addCriterion("requisition_custom1 <", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom1 <=", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1Like(String value) {
            addCriterion("requisition_custom1 like", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1NotLike(String value) {
            addCriterion("requisition_custom1 not like", value, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1In(List<String> values) {
            addCriterion("requisition_custom1 in", values, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1NotIn(List<String> values) {
            addCriterion("requisition_custom1 not in", values, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1Between(String value1, String value2) {
            addCriterion("requisition_custom1 between", value1, value2, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom1NotBetween(String value1, String value2) {
            addCriterion("requisition_custom1 not between", value1, value2, "requisitionCustom1");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2IsNull() {
            addCriterion("requisition_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2IsNotNull() {
            addCriterion("requisition_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2EqualTo(String value) {
            addCriterion("requisition_custom2 =", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2NotEqualTo(String value) {
            addCriterion("requisition_custom2 <>", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2GreaterThan(String value) {
            addCriterion("requisition_custom2 >", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom2 >=", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2LessThan(String value) {
            addCriterion("requisition_custom2 <", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom2 <=", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2Like(String value) {
            addCriterion("requisition_custom2 like", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2NotLike(String value) {
            addCriterion("requisition_custom2 not like", value, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2In(List<String> values) {
            addCriterion("requisition_custom2 in", values, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2NotIn(List<String> values) {
            addCriterion("requisition_custom2 not in", values, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2Between(String value1, String value2) {
            addCriterion("requisition_custom2 between", value1, value2, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom2NotBetween(String value1, String value2) {
            addCriterion("requisition_custom2 not between", value1, value2, "requisitionCustom2");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3IsNull() {
            addCriterion("requisition_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3IsNotNull() {
            addCriterion("requisition_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3EqualTo(String value) {
            addCriterion("requisition_custom3 =", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3NotEqualTo(String value) {
            addCriterion("requisition_custom3 <>", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3GreaterThan(String value) {
            addCriterion("requisition_custom3 >", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom3 >=", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3LessThan(String value) {
            addCriterion("requisition_custom3 <", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom3 <=", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3Like(String value) {
            addCriterion("requisition_custom3 like", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3NotLike(String value) {
            addCriterion("requisition_custom3 not like", value, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3In(List<String> values) {
            addCriterion("requisition_custom3 in", values, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3NotIn(List<String> values) {
            addCriterion("requisition_custom3 not in", values, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3Between(String value1, String value2) {
            addCriterion("requisition_custom3 between", value1, value2, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom3NotBetween(String value1, String value2) {
            addCriterion("requisition_custom3 not between", value1, value2, "requisitionCustom3");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4IsNull() {
            addCriterion("requisition_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4IsNotNull() {
            addCriterion("requisition_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4EqualTo(String value) {
            addCriterion("requisition_custom4 =", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4NotEqualTo(String value) {
            addCriterion("requisition_custom4 <>", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4GreaterThan(String value) {
            addCriterion("requisition_custom4 >", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom4 >=", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4LessThan(String value) {
            addCriterion("requisition_custom4 <", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom4 <=", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4Like(String value) {
            addCriterion("requisition_custom4 like", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4NotLike(String value) {
            addCriterion("requisition_custom4 not like", value, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4In(List<String> values) {
            addCriterion("requisition_custom4 in", values, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4NotIn(List<String> values) {
            addCriterion("requisition_custom4 not in", values, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4Between(String value1, String value2) {
            addCriterion("requisition_custom4 between", value1, value2, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom4NotBetween(String value1, String value2) {
            addCriterion("requisition_custom4 not between", value1, value2, "requisitionCustom4");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5IsNull() {
            addCriterion("requisition_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5IsNotNull() {
            addCriterion("requisition_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5EqualTo(String value) {
            addCriterion("requisition_custom5 =", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5NotEqualTo(String value) {
            addCriterion("requisition_custom5 <>", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5GreaterThan(String value) {
            addCriterion("requisition_custom5 >", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom5 >=", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5LessThan(String value) {
            addCriterion("requisition_custom5 <", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom5 <=", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5Like(String value) {
            addCriterion("requisition_custom5 like", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5NotLike(String value) {
            addCriterion("requisition_custom5 not like", value, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5In(List<String> values) {
            addCriterion("requisition_custom5 in", values, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5NotIn(List<String> values) {
            addCriterion("requisition_custom5 not in", values, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5Between(String value1, String value2) {
            addCriterion("requisition_custom5 between", value1, value2, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom5NotBetween(String value1, String value2) {
            addCriterion("requisition_custom5 not between", value1, value2, "requisitionCustom5");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6IsNull() {
            addCriterion("requisition_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6IsNotNull() {
            addCriterion("requisition_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6EqualTo(String value) {
            addCriterion("requisition_custom6 =", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6NotEqualTo(String value) {
            addCriterion("requisition_custom6 <>", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6GreaterThan(String value) {
            addCriterion("requisition_custom6 >", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("requisition_custom6 >=", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6LessThan(String value) {
            addCriterion("requisition_custom6 <", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6LessThanOrEqualTo(String value) {
            addCriterion("requisition_custom6 <=", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6Like(String value) {
            addCriterion("requisition_custom6 like", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6NotLike(String value) {
            addCriterion("requisition_custom6 not like", value, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6In(List<String> values) {
            addCriterion("requisition_custom6 in", values, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6NotIn(List<String> values) {
            addCriterion("requisition_custom6 not in", values, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6Between(String value1, String value2) {
            addCriterion("requisition_custom6 between", value1, value2, "requisitionCustom6");
            return (Criteria) this;
        }

        public Criteria andRequisitionCustom6NotBetween(String value1, String value2) {
            addCriterion("requisition_custom6 not between", value1, value2, "requisitionCustom6");
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