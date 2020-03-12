package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtherOutStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherOutStorageExample() {
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

        public Criteria andOosIdIsNull() {
            addCriterion("oos_id is null");
            return (Criteria) this;
        }

        public Criteria andOosIdIsNotNull() {
            addCriterion("oos_id is not null");
            return (Criteria) this;
        }

        public Criteria andOosIdEqualTo(String value) {
            addCriterion("oos_id =", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotEqualTo(String value) {
            addCriterion("oos_id <>", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdGreaterThan(String value) {
            addCriterion("oos_id >", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdGreaterThanOrEqualTo(String value) {
            addCriterion("oos_id >=", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLessThan(String value) {
            addCriterion("oos_id <", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLessThanOrEqualTo(String value) {
            addCriterion("oos_id <=", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLike(String value) {
            addCriterion("oos_id like", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotLike(String value) {
            addCriterion("oos_id not like", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdIn(List<String> values) {
            addCriterion("oos_id in", values, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotIn(List<String> values) {
            addCriterion("oos_id not in", values, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdBetween(String value1, String value2) {
            addCriterion("oos_id between", value1, value2, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotBetween(String value1, String value2) {
            addCriterion("oos_id not between", value1, value2, "oosId");
            return (Criteria) this;
        }

        public Criteria andIstIdIsNull() {
            addCriterion("ist_id is null");
            return (Criteria) this;
        }

        public Criteria andIstIdIsNotNull() {
            addCriterion("ist_id is not null");
            return (Criteria) this;
        }

        public Criteria andIstIdEqualTo(Integer value) {
            addCriterion("ist_id =", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotEqualTo(Integer value) {
            addCriterion("ist_id <>", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThan(Integer value) {
            addCriterion("ist_id >", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ist_id >=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThan(Integer value) {
            addCriterion("ist_id <", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThanOrEqualTo(Integer value) {
            addCriterion("ist_id <=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdIn(List<Integer> values) {
            addCriterion("ist_id in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotIn(List<Integer> values) {
            addCriterion("ist_id not in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdBetween(Integer value1, Integer value2) {
            addCriterion("ist_id between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ist_id not between", value1, value2, "istId");
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

        public Criteria andOosDocumentationDateIsNull() {
            addCriterion("oos_documentation_date is null");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateIsNotNull() {
            addCriterion("oos_documentation_date is not null");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateEqualTo(String value) {
            addCriterion("oos_documentation_date =", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateNotEqualTo(String value) {
            addCriterion("oos_documentation_date <>", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateGreaterThan(String value) {
            addCriterion("oos_documentation_date >", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateGreaterThanOrEqualTo(String value) {
            addCriterion("oos_documentation_date >=", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateLessThan(String value) {
            addCriterion("oos_documentation_date <", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateLessThanOrEqualTo(String value) {
            addCriterion("oos_documentation_date <=", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateLike(String value) {
            addCriterion("oos_documentation_date like", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateNotLike(String value) {
            addCriterion("oos_documentation_date not like", value, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateIn(List<String> values) {
            addCriterion("oos_documentation_date in", values, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateNotIn(List<String> values) {
            addCriterion("oos_documentation_date not in", values, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateBetween(String value1, String value2) {
            addCriterion("oos_documentation_date between", value1, value2, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationDateNotBetween(String value1, String value2) {
            addCriterion("oos_documentation_date not between", value1, value2, "oosDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoIsNull() {
            addCriterion("oos_documentation_no is null");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoIsNotNull() {
            addCriterion("oos_documentation_no is not null");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoEqualTo(Date value) {
            addCriterion("oos_documentation_no =", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoNotEqualTo(Date value) {
            addCriterion("oos_documentation_no <>", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoGreaterThan(Date value) {
            addCriterion("oos_documentation_no >", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoGreaterThanOrEqualTo(Date value) {
            addCriterion("oos_documentation_no >=", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoLessThan(Date value) {
            addCriterion("oos_documentation_no <", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoLessThanOrEqualTo(Date value) {
            addCriterion("oos_documentation_no <=", value, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoIn(List<Date> values) {
            addCriterion("oos_documentation_no in", values, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoNotIn(List<Date> values) {
            addCriterion("oos_documentation_no not in", values, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoBetween(Date value1, Date value2) {
            addCriterion("oos_documentation_no between", value1, value2, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosDocumentationNoNotBetween(Date value1, Date value2) {
            addCriterion("oos_documentation_no not between", value1, value2, "oosDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberIsNull() {
            addCriterion("oos_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberIsNotNull() {
            addCriterion("oos_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberEqualTo(String value) {
            addCriterion("oos_certificate_number =", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberNotEqualTo(String value) {
            addCriterion("oos_certificate_number <>", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberGreaterThan(String value) {
            addCriterion("oos_certificate_number >", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("oos_certificate_number >=", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberLessThan(String value) {
            addCriterion("oos_certificate_number <", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("oos_certificate_number <=", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberLike(String value) {
            addCriterion("oos_certificate_number like", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberNotLike(String value) {
            addCriterion("oos_certificate_number not like", value, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberIn(List<String> values) {
            addCriterion("oos_certificate_number in", values, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberNotIn(List<String> values) {
            addCriterion("oos_certificate_number not in", values, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberBetween(String value1, String value2) {
            addCriterion("oos_certificate_number between", value1, value2, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("oos_certificate_number not between", value1, value2, "oosCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelIsNull() {
            addCriterion("oos_warehousing_personnel is null");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelIsNotNull() {
            addCriterion("oos_warehousing_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelEqualTo(String value) {
            addCriterion("oos_warehousing_personnel =", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelNotEqualTo(String value) {
            addCriterion("oos_warehousing_personnel <>", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelGreaterThan(String value) {
            addCriterion("oos_warehousing_personnel >", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("oos_warehousing_personnel >=", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelLessThan(String value) {
            addCriterion("oos_warehousing_personnel <", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelLessThanOrEqualTo(String value) {
            addCriterion("oos_warehousing_personnel <=", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelLike(String value) {
            addCriterion("oos_warehousing_personnel like", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelNotLike(String value) {
            addCriterion("oos_warehousing_personnel not like", value, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelIn(List<String> values) {
            addCriterion("oos_warehousing_personnel in", values, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelNotIn(List<String> values) {
            addCriterion("oos_warehousing_personnel not in", values, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelBetween(String value1, String value2) {
            addCriterion("oos_warehousing_personnel between", value1, value2, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosWarehousingPersonnelNotBetween(String value1, String value2) {
            addCriterion("oos_warehousing_personnel not between", value1, value2, "oosWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionIsNull() {
            addCriterion("oos_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionIsNotNull() {
            addCriterion("oos_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionEqualTo(String value) {
            addCriterion("oos_belongs_section =", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionNotEqualTo(String value) {
            addCriterion("oos_belongs_section <>", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionGreaterThan(String value) {
            addCriterion("oos_belongs_section >", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("oos_belongs_section >=", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionLessThan(String value) {
            addCriterion("oos_belongs_section <", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("oos_belongs_section <=", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionLike(String value) {
            addCriterion("oos_belongs_section like", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionNotLike(String value) {
            addCriterion("oos_belongs_section not like", value, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionIn(List<String> values) {
            addCriterion("oos_belongs_section in", values, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionNotIn(List<String> values) {
            addCriterion("oos_belongs_section not in", values, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionBetween(String value1, String value2) {
            addCriterion("oos_belongs_section between", value1, value2, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("oos_belongs_section not between", value1, value2, "oosBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOosFormIsNull() {
            addCriterion("oos_form is null");
            return (Criteria) this;
        }

        public Criteria andOosFormIsNotNull() {
            addCriterion("oos_form is not null");
            return (Criteria) this;
        }

        public Criteria andOosFormEqualTo(String value) {
            addCriterion("oos_form =", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormNotEqualTo(String value) {
            addCriterion("oos_form <>", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormGreaterThan(String value) {
            addCriterion("oos_form >", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormGreaterThanOrEqualTo(String value) {
            addCriterion("oos_form >=", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormLessThan(String value) {
            addCriterion("oos_form <", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormLessThanOrEqualTo(String value) {
            addCriterion("oos_form <=", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormLike(String value) {
            addCriterion("oos_form like", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormNotLike(String value) {
            addCriterion("oos_form not like", value, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormIn(List<String> values) {
            addCriterion("oos_form in", values, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormNotIn(List<String> values) {
            addCriterion("oos_form not in", values, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormBetween(String value1, String value2) {
            addCriterion("oos_form between", value1, value2, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosFormNotBetween(String value1, String value2) {
            addCriterion("oos_form not between", value1, value2, "oosForm");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffIsNull() {
            addCriterion("oos_review_staff is null");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffIsNotNull() {
            addCriterion("oos_review_staff is not null");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffEqualTo(String value) {
            addCriterion("oos_review_staff =", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffNotEqualTo(String value) {
            addCriterion("oos_review_staff <>", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffGreaterThan(String value) {
            addCriterion("oos_review_staff >", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffGreaterThanOrEqualTo(String value) {
            addCriterion("oos_review_staff >=", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffLessThan(String value) {
            addCriterion("oos_review_staff <", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffLessThanOrEqualTo(String value) {
            addCriterion("oos_review_staff <=", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffLike(String value) {
            addCriterion("oos_review_staff like", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffNotLike(String value) {
            addCriterion("oos_review_staff not like", value, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffIn(List<String> values) {
            addCriterion("oos_review_staff in", values, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffNotIn(List<String> values) {
            addCriterion("oos_review_staff not in", values, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffBetween(String value1, String value2) {
            addCriterion("oos_review_staff between", value1, value2, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosReviewStaffNotBetween(String value1, String value2) {
            addCriterion("oos_review_staff not between", value1, value2, "oosReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOosRemarkIsNull() {
            addCriterion("oos_remark is null");
            return (Criteria) this;
        }

        public Criteria andOosRemarkIsNotNull() {
            addCriterion("oos_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOosRemarkEqualTo(String value) {
            addCriterion("oos_remark =", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkNotEqualTo(String value) {
            addCriterion("oos_remark <>", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkGreaterThan(String value) {
            addCriterion("oos_remark >", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("oos_remark >=", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkLessThan(String value) {
            addCriterion("oos_remark <", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkLessThanOrEqualTo(String value) {
            addCriterion("oos_remark <=", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkLike(String value) {
            addCriterion("oos_remark like", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkNotLike(String value) {
            addCriterion("oos_remark not like", value, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkIn(List<String> values) {
            addCriterion("oos_remark in", values, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkNotIn(List<String> values) {
            addCriterion("oos_remark not in", values, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkBetween(String value1, String value2) {
            addCriterion("oos_remark between", value1, value2, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosRemarkNotBetween(String value1, String value2) {
            addCriterion("oos_remark not between", value1, value2, "oosRemark");
            return (Criteria) this;
        }

        public Criteria andOosAuditingIsNull() {
            addCriterion("oos_auditing is null");
            return (Criteria) this;
        }

        public Criteria andOosAuditingIsNotNull() {
            addCriterion("oos_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andOosAuditingEqualTo(String value) {
            addCriterion("oos_auditing =", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingNotEqualTo(String value) {
            addCriterion("oos_auditing <>", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingGreaterThan(String value) {
            addCriterion("oos_auditing >", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("oos_auditing >=", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingLessThan(String value) {
            addCriterion("oos_auditing <", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingLessThanOrEqualTo(String value) {
            addCriterion("oos_auditing <=", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingLike(String value) {
            addCriterion("oos_auditing like", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingNotLike(String value) {
            addCriterion("oos_auditing not like", value, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingIn(List<String> values) {
            addCriterion("oos_auditing in", values, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingNotIn(List<String> values) {
            addCriterion("oos_auditing not in", values, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingBetween(String value1, String value2) {
            addCriterion("oos_auditing between", value1, value2, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosAuditingNotBetween(String value1, String value2) {
            addCriterion("oos_auditing not between", value1, value2, "oosAuditing");
            return (Criteria) this;
        }

        public Criteria andOosYnIsNull() {
            addCriterion("oos_yn is null");
            return (Criteria) this;
        }

        public Criteria andOosYnIsNotNull() {
            addCriterion("oos_yn is not null");
            return (Criteria) this;
        }

        public Criteria andOosYnEqualTo(String value) {
            addCriterion("oos_yn =", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnNotEqualTo(String value) {
            addCriterion("oos_yn <>", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnGreaterThan(String value) {
            addCriterion("oos_yn >", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnGreaterThanOrEqualTo(String value) {
            addCriterion("oos_yn >=", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnLessThan(String value) {
            addCriterion("oos_yn <", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnLessThanOrEqualTo(String value) {
            addCriterion("oos_yn <=", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnLike(String value) {
            addCriterion("oos_yn like", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnNotLike(String value) {
            addCriterion("oos_yn not like", value, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnIn(List<String> values) {
            addCriterion("oos_yn in", values, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnNotIn(List<String> values) {
            addCriterion("oos_yn not in", values, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnBetween(String value1, String value2) {
            addCriterion("oos_yn between", value1, value2, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosYnNotBetween(String value1, String value2) {
            addCriterion("oos_yn not between", value1, value2, "oosYn");
            return (Criteria) this;
        }

        public Criteria andOosCustom1IsNull() {
            addCriterion("oos_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom1IsNotNull() {
            addCriterion("oos_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom1EqualTo(String value) {
            addCriterion("oos_custom1 =", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1NotEqualTo(String value) {
            addCriterion("oos_custom1 <>", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1GreaterThan(String value) {
            addCriterion("oos_custom1 >", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom1 >=", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1LessThan(String value) {
            addCriterion("oos_custom1 <", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1LessThanOrEqualTo(String value) {
            addCriterion("oos_custom1 <=", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1Like(String value) {
            addCriterion("oos_custom1 like", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1NotLike(String value) {
            addCriterion("oos_custom1 not like", value, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1In(List<String> values) {
            addCriterion("oos_custom1 in", values, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1NotIn(List<String> values) {
            addCriterion("oos_custom1 not in", values, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1Between(String value1, String value2) {
            addCriterion("oos_custom1 between", value1, value2, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom1NotBetween(String value1, String value2) {
            addCriterion("oos_custom1 not between", value1, value2, "oosCustom1");
            return (Criteria) this;
        }

        public Criteria andOosCustom2IsNull() {
            addCriterion("oos_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom2IsNotNull() {
            addCriterion("oos_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom2EqualTo(String value) {
            addCriterion("oos_custom2 =", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2NotEqualTo(String value) {
            addCriterion("oos_custom2 <>", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2GreaterThan(String value) {
            addCriterion("oos_custom2 >", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom2 >=", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2LessThan(String value) {
            addCriterion("oos_custom2 <", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2LessThanOrEqualTo(String value) {
            addCriterion("oos_custom2 <=", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2Like(String value) {
            addCriterion("oos_custom2 like", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2NotLike(String value) {
            addCriterion("oos_custom2 not like", value, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2In(List<String> values) {
            addCriterion("oos_custom2 in", values, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2NotIn(List<String> values) {
            addCriterion("oos_custom2 not in", values, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2Between(String value1, String value2) {
            addCriterion("oos_custom2 between", value1, value2, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom2NotBetween(String value1, String value2) {
            addCriterion("oos_custom2 not between", value1, value2, "oosCustom2");
            return (Criteria) this;
        }

        public Criteria andOosCustom3IsNull() {
            addCriterion("oos_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom3IsNotNull() {
            addCriterion("oos_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom3EqualTo(String value) {
            addCriterion("oos_custom3 =", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3NotEqualTo(String value) {
            addCriterion("oos_custom3 <>", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3GreaterThan(String value) {
            addCriterion("oos_custom3 >", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom3 >=", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3LessThan(String value) {
            addCriterion("oos_custom3 <", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3LessThanOrEqualTo(String value) {
            addCriterion("oos_custom3 <=", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3Like(String value) {
            addCriterion("oos_custom3 like", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3NotLike(String value) {
            addCriterion("oos_custom3 not like", value, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3In(List<String> values) {
            addCriterion("oos_custom3 in", values, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3NotIn(List<String> values) {
            addCriterion("oos_custom3 not in", values, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3Between(String value1, String value2) {
            addCriterion("oos_custom3 between", value1, value2, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom3NotBetween(String value1, String value2) {
            addCriterion("oos_custom3 not between", value1, value2, "oosCustom3");
            return (Criteria) this;
        }

        public Criteria andOosCustom4IsNull() {
            addCriterion("oos_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom4IsNotNull() {
            addCriterion("oos_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom4EqualTo(String value) {
            addCriterion("oos_custom4 =", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4NotEqualTo(String value) {
            addCriterion("oos_custom4 <>", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4GreaterThan(String value) {
            addCriterion("oos_custom4 >", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom4 >=", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4LessThan(String value) {
            addCriterion("oos_custom4 <", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4LessThanOrEqualTo(String value) {
            addCriterion("oos_custom4 <=", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4Like(String value) {
            addCriterion("oos_custom4 like", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4NotLike(String value) {
            addCriterion("oos_custom4 not like", value, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4In(List<String> values) {
            addCriterion("oos_custom4 in", values, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4NotIn(List<String> values) {
            addCriterion("oos_custom4 not in", values, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4Between(String value1, String value2) {
            addCriterion("oos_custom4 between", value1, value2, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom4NotBetween(String value1, String value2) {
            addCriterion("oos_custom4 not between", value1, value2, "oosCustom4");
            return (Criteria) this;
        }

        public Criteria andOosCustom5IsNull() {
            addCriterion("oos_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom5IsNotNull() {
            addCriterion("oos_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom5EqualTo(String value) {
            addCriterion("oos_custom5 =", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5NotEqualTo(String value) {
            addCriterion("oos_custom5 <>", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5GreaterThan(String value) {
            addCriterion("oos_custom5 >", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom5 >=", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5LessThan(String value) {
            addCriterion("oos_custom5 <", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5LessThanOrEqualTo(String value) {
            addCriterion("oos_custom5 <=", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5Like(String value) {
            addCriterion("oos_custom5 like", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5NotLike(String value) {
            addCriterion("oos_custom5 not like", value, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5In(List<String> values) {
            addCriterion("oos_custom5 in", values, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5NotIn(List<String> values) {
            addCriterion("oos_custom5 not in", values, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5Between(String value1, String value2) {
            addCriterion("oos_custom5 between", value1, value2, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom5NotBetween(String value1, String value2) {
            addCriterion("oos_custom5 not between", value1, value2, "oosCustom5");
            return (Criteria) this;
        }

        public Criteria andOosCustom6IsNull() {
            addCriterion("oos_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andOosCustom6IsNotNull() {
            addCriterion("oos_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andOosCustom6EqualTo(String value) {
            addCriterion("oos_custom6 =", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6NotEqualTo(String value) {
            addCriterion("oos_custom6 <>", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6GreaterThan(String value) {
            addCriterion("oos_custom6 >", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("oos_custom6 >=", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6LessThan(String value) {
            addCriterion("oos_custom6 <", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6LessThanOrEqualTo(String value) {
            addCriterion("oos_custom6 <=", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6Like(String value) {
            addCriterion("oos_custom6 like", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6NotLike(String value) {
            addCriterion("oos_custom6 not like", value, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6In(List<String> values) {
            addCriterion("oos_custom6 in", values, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6NotIn(List<String> values) {
            addCriterion("oos_custom6 not in", values, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6Between(String value1, String value2) {
            addCriterion("oos_custom6 between", value1, value2, "oosCustom6");
            return (Criteria) this;
        }

        public Criteria andOosCustom6NotBetween(String value1, String value2) {
            addCriterion("oos_custom6 not between", value1, value2, "oosCustom6");
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