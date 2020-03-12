package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtherInputStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherInputStorageExample() {
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

        public Criteria andOisIdIsNull() {
            addCriterion("ois_id is null");
            return (Criteria) this;
        }

        public Criteria andOisIdIsNotNull() {
            addCriterion("ois_id is not null");
            return (Criteria) this;
        }

        public Criteria andOisIdEqualTo(String value) {
            addCriterion("ois_id =", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotEqualTo(String value) {
            addCriterion("ois_id <>", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdGreaterThan(String value) {
            addCriterion("ois_id >", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdGreaterThanOrEqualTo(String value) {
            addCriterion("ois_id >=", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLessThan(String value) {
            addCriterion("ois_id <", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLessThanOrEqualTo(String value) {
            addCriterion("ois_id <=", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLike(String value) {
            addCriterion("ois_id like", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotLike(String value) {
            addCriterion("ois_id not like", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdIn(List<String> values) {
            addCriterion("ois_id in", values, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotIn(List<String> values) {
            addCriterion("ois_id not in", values, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdBetween(String value1, String value2) {
            addCriterion("ois_id between", value1, value2, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotBetween(String value1, String value2) {
            addCriterion("ois_id not between", value1, value2, "oisId");
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

        public Criteria andIstIdEqualTo(String value) {
            addCriterion("ist_id =", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotEqualTo(String value) {
            addCriterion("ist_id <>", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThan(String value) {
            addCriterion("ist_id >", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThanOrEqualTo(String value) {
            addCriterion("ist_id >=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThan(String value) {
            addCriterion("ist_id <", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThanOrEqualTo(String value) {
            addCriterion("ist_id <=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLike(String value) {
            addCriterion("ist_id like", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotLike(String value) {
            addCriterion("ist_id not like", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdIn(List<String> values) {
            addCriterion("ist_id in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotIn(List<String> values) {
            addCriterion("ist_id not in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdBetween(String value1, String value2) {
            addCriterion("ist_id between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotBetween(String value1, String value2) {
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

        public Criteria andOisDocumentationDateIsNull() {
            addCriterion("ois_documentation_date is null");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateIsNotNull() {
            addCriterion("ois_documentation_date is not null");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateEqualTo(String value) {
            addCriterion("ois_documentation_date =", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateNotEqualTo(String value) {
            addCriterion("ois_documentation_date <>", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateGreaterThan(String value) {
            addCriterion("ois_documentation_date >", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateGreaterThanOrEqualTo(String value) {
            addCriterion("ois_documentation_date >=", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateLessThan(String value) {
            addCriterion("ois_documentation_date <", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateLessThanOrEqualTo(String value) {
            addCriterion("ois_documentation_date <=", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateLike(String value) {
            addCriterion("ois_documentation_date like", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateNotLike(String value) {
            addCriterion("ois_documentation_date not like", value, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateIn(List<String> values) {
            addCriterion("ois_documentation_date in", values, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateNotIn(List<String> values) {
            addCriterion("ois_documentation_date not in", values, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateBetween(String value1, String value2) {
            addCriterion("ois_documentation_date between", value1, value2, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationDateNotBetween(String value1, String value2) {
            addCriterion("ois_documentation_date not between", value1, value2, "oisDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoIsNull() {
            addCriterion("ois_documentation_no is null");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoIsNotNull() {
            addCriterion("ois_documentation_no is not null");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoEqualTo(Date value) {
            addCriterion("ois_documentation_no =", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoNotEqualTo(Date value) {
            addCriterion("ois_documentation_no <>", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoGreaterThan(Date value) {
            addCriterion("ois_documentation_no >", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoGreaterThanOrEqualTo(Date value) {
            addCriterion("ois_documentation_no >=", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoLessThan(Date value) {
            addCriterion("ois_documentation_no <", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoLessThanOrEqualTo(Date value) {
            addCriterion("ois_documentation_no <=", value, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoIn(List<Date> values) {
            addCriterion("ois_documentation_no in", values, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoNotIn(List<Date> values) {
            addCriterion("ois_documentation_no not in", values, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoBetween(Date value1, Date value2) {
            addCriterion("ois_documentation_no between", value1, value2, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisDocumentationNoNotBetween(Date value1, Date value2) {
            addCriterion("ois_documentation_no not between", value1, value2, "oisDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberIsNull() {
            addCriterion("ois_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberIsNotNull() {
            addCriterion("ois_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberEqualTo(String value) {
            addCriterion("ois_certificate_number =", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberNotEqualTo(String value) {
            addCriterion("ois_certificate_number <>", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberGreaterThan(String value) {
            addCriterion("ois_certificate_number >", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ois_certificate_number >=", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberLessThan(String value) {
            addCriterion("ois_certificate_number <", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("ois_certificate_number <=", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberLike(String value) {
            addCriterion("ois_certificate_number like", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberNotLike(String value) {
            addCriterion("ois_certificate_number not like", value, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberIn(List<String> values) {
            addCriterion("ois_certificate_number in", values, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberNotIn(List<String> values) {
            addCriterion("ois_certificate_number not in", values, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberBetween(String value1, String value2) {
            addCriterion("ois_certificate_number between", value1, value2, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("ois_certificate_number not between", value1, value2, "oisCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelIsNull() {
            addCriterion("ois_warehousing_personnel is null");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelIsNotNull() {
            addCriterion("ois_warehousing_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelEqualTo(String value) {
            addCriterion("ois_warehousing_personnel =", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelNotEqualTo(String value) {
            addCriterion("ois_warehousing_personnel <>", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelGreaterThan(String value) {
            addCriterion("ois_warehousing_personnel >", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("ois_warehousing_personnel >=", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelLessThan(String value) {
            addCriterion("ois_warehousing_personnel <", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelLessThanOrEqualTo(String value) {
            addCriterion("ois_warehousing_personnel <=", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelLike(String value) {
            addCriterion("ois_warehousing_personnel like", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelNotLike(String value) {
            addCriterion("ois_warehousing_personnel not like", value, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelIn(List<String> values) {
            addCriterion("ois_warehousing_personnel in", values, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelNotIn(List<String> values) {
            addCriterion("ois_warehousing_personnel not in", values, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelBetween(String value1, String value2) {
            addCriterion("ois_warehousing_personnel between", value1, value2, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisWarehousingPersonnelNotBetween(String value1, String value2) {
            addCriterion("ois_warehousing_personnel not between", value1, value2, "oisWarehousingPersonnel");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionIsNull() {
            addCriterion("ois_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionIsNotNull() {
            addCriterion("ois_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionEqualTo(String value) {
            addCriterion("ois_belongs_section =", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionNotEqualTo(String value) {
            addCriterion("ois_belongs_section <>", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionGreaterThan(String value) {
            addCriterion("ois_belongs_section >", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("ois_belongs_section >=", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionLessThan(String value) {
            addCriterion("ois_belongs_section <", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("ois_belongs_section <=", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionLike(String value) {
            addCriterion("ois_belongs_section like", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionNotLike(String value) {
            addCriterion("ois_belongs_section not like", value, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionIn(List<String> values) {
            addCriterion("ois_belongs_section in", values, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionNotIn(List<String> values) {
            addCriterion("ois_belongs_section not in", values, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionBetween(String value1, String value2) {
            addCriterion("ois_belongs_section between", value1, value2, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("ois_belongs_section not between", value1, value2, "oisBelongsSection");
            return (Criteria) this;
        }

        public Criteria andOisFormIsNull() {
            addCriterion("ois_form is null");
            return (Criteria) this;
        }

        public Criteria andOisFormIsNotNull() {
            addCriterion("ois_form is not null");
            return (Criteria) this;
        }

        public Criteria andOisFormEqualTo(String value) {
            addCriterion("ois_form =", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormNotEqualTo(String value) {
            addCriterion("ois_form <>", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormGreaterThan(String value) {
            addCriterion("ois_form >", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormGreaterThanOrEqualTo(String value) {
            addCriterion("ois_form >=", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormLessThan(String value) {
            addCriterion("ois_form <", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormLessThanOrEqualTo(String value) {
            addCriterion("ois_form <=", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormLike(String value) {
            addCriterion("ois_form like", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormNotLike(String value) {
            addCriterion("ois_form not like", value, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormIn(List<String> values) {
            addCriterion("ois_form in", values, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormNotIn(List<String> values) {
            addCriterion("ois_form not in", values, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormBetween(String value1, String value2) {
            addCriterion("ois_form between", value1, value2, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisFormNotBetween(String value1, String value2) {
            addCriterion("ois_form not between", value1, value2, "oisForm");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffIsNull() {
            addCriterion("ois_review_staff is null");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffIsNotNull() {
            addCriterion("ois_review_staff is not null");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffEqualTo(String value) {
            addCriterion("ois_review_staff =", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffNotEqualTo(String value) {
            addCriterion("ois_review_staff <>", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffGreaterThan(String value) {
            addCriterion("ois_review_staff >", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffGreaterThanOrEqualTo(String value) {
            addCriterion("ois_review_staff >=", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffLessThan(String value) {
            addCriterion("ois_review_staff <", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffLessThanOrEqualTo(String value) {
            addCriterion("ois_review_staff <=", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffLike(String value) {
            addCriterion("ois_review_staff like", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffNotLike(String value) {
            addCriterion("ois_review_staff not like", value, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffIn(List<String> values) {
            addCriterion("ois_review_staff in", values, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffNotIn(List<String> values) {
            addCriterion("ois_review_staff not in", values, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffBetween(String value1, String value2) {
            addCriterion("ois_review_staff between", value1, value2, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisReviewStaffNotBetween(String value1, String value2) {
            addCriterion("ois_review_staff not between", value1, value2, "oisReviewStaff");
            return (Criteria) this;
        }

        public Criteria andOisRemarkIsNull() {
            addCriterion("ois_remark is null");
            return (Criteria) this;
        }

        public Criteria andOisRemarkIsNotNull() {
            addCriterion("ois_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOisRemarkEqualTo(String value) {
            addCriterion("ois_remark =", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkNotEqualTo(String value) {
            addCriterion("ois_remark <>", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkGreaterThan(String value) {
            addCriterion("ois_remark >", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ois_remark >=", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkLessThan(String value) {
            addCriterion("ois_remark <", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkLessThanOrEqualTo(String value) {
            addCriterion("ois_remark <=", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkLike(String value) {
            addCriterion("ois_remark like", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkNotLike(String value) {
            addCriterion("ois_remark not like", value, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkIn(List<String> values) {
            addCriterion("ois_remark in", values, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkNotIn(List<String> values) {
            addCriterion("ois_remark not in", values, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkBetween(String value1, String value2) {
            addCriterion("ois_remark between", value1, value2, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisRemarkNotBetween(String value1, String value2) {
            addCriterion("ois_remark not between", value1, value2, "oisRemark");
            return (Criteria) this;
        }

        public Criteria andOisAuditingIsNull() {
            addCriterion("ois_auditing is null");
            return (Criteria) this;
        }

        public Criteria andOisAuditingIsNotNull() {
            addCriterion("ois_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andOisAuditingEqualTo(String value) {
            addCriterion("ois_auditing =", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingNotEqualTo(String value) {
            addCriterion("ois_auditing <>", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingGreaterThan(String value) {
            addCriterion("ois_auditing >", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ois_auditing >=", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingLessThan(String value) {
            addCriterion("ois_auditing <", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingLessThanOrEqualTo(String value) {
            addCriterion("ois_auditing <=", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingLike(String value) {
            addCriterion("ois_auditing like", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingNotLike(String value) {
            addCriterion("ois_auditing not like", value, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingIn(List<String> values) {
            addCriterion("ois_auditing in", values, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingNotIn(List<String> values) {
            addCriterion("ois_auditing not in", values, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingBetween(String value1, String value2) {
            addCriterion("ois_auditing between", value1, value2, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisAuditingNotBetween(String value1, String value2) {
            addCriterion("ois_auditing not between", value1, value2, "oisAuditing");
            return (Criteria) this;
        }

        public Criteria andOisYnIsNull() {
            addCriterion("ois_yn is null");
            return (Criteria) this;
        }

        public Criteria andOisYnIsNotNull() {
            addCriterion("ois_yn is not null");
            return (Criteria) this;
        }

        public Criteria andOisYnEqualTo(String value) {
            addCriterion("ois_yn =", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnNotEqualTo(String value) {
            addCriterion("ois_yn <>", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnGreaterThan(String value) {
            addCriterion("ois_yn >", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnGreaterThanOrEqualTo(String value) {
            addCriterion("ois_yn >=", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnLessThan(String value) {
            addCriterion("ois_yn <", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnLessThanOrEqualTo(String value) {
            addCriterion("ois_yn <=", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnLike(String value) {
            addCriterion("ois_yn like", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnNotLike(String value) {
            addCriterion("ois_yn not like", value, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnIn(List<String> values) {
            addCriterion("ois_yn in", values, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnNotIn(List<String> values) {
            addCriterion("ois_yn not in", values, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnBetween(String value1, String value2) {
            addCriterion("ois_yn between", value1, value2, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisYnNotBetween(String value1, String value2) {
            addCriterion("ois_yn not between", value1, value2, "oisYn");
            return (Criteria) this;
        }

        public Criteria andOisCustom1IsNull() {
            addCriterion("ois_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom1IsNotNull() {
            addCriterion("ois_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom1EqualTo(String value) {
            addCriterion("ois_custom1 =", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1NotEqualTo(String value) {
            addCriterion("ois_custom1 <>", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1GreaterThan(String value) {
            addCriterion("ois_custom1 >", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom1 >=", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1LessThan(String value) {
            addCriterion("ois_custom1 <", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1LessThanOrEqualTo(String value) {
            addCriterion("ois_custom1 <=", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1Like(String value) {
            addCriterion("ois_custom1 like", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1NotLike(String value) {
            addCriterion("ois_custom1 not like", value, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1In(List<String> values) {
            addCriterion("ois_custom1 in", values, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1NotIn(List<String> values) {
            addCriterion("ois_custom1 not in", values, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1Between(String value1, String value2) {
            addCriterion("ois_custom1 between", value1, value2, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom1NotBetween(String value1, String value2) {
            addCriterion("ois_custom1 not between", value1, value2, "oisCustom1");
            return (Criteria) this;
        }

        public Criteria andOisCustom2IsNull() {
            addCriterion("ois_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom2IsNotNull() {
            addCriterion("ois_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom2EqualTo(String value) {
            addCriterion("ois_custom2 =", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2NotEqualTo(String value) {
            addCriterion("ois_custom2 <>", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2GreaterThan(String value) {
            addCriterion("ois_custom2 >", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom2 >=", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2LessThan(String value) {
            addCriterion("ois_custom2 <", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2LessThanOrEqualTo(String value) {
            addCriterion("ois_custom2 <=", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2Like(String value) {
            addCriterion("ois_custom2 like", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2NotLike(String value) {
            addCriterion("ois_custom2 not like", value, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2In(List<String> values) {
            addCriterion("ois_custom2 in", values, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2NotIn(List<String> values) {
            addCriterion("ois_custom2 not in", values, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2Between(String value1, String value2) {
            addCriterion("ois_custom2 between", value1, value2, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom2NotBetween(String value1, String value2) {
            addCriterion("ois_custom2 not between", value1, value2, "oisCustom2");
            return (Criteria) this;
        }

        public Criteria andOisCustom3IsNull() {
            addCriterion("ois_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom3IsNotNull() {
            addCriterion("ois_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom3EqualTo(String value) {
            addCriterion("ois_custom3 =", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3NotEqualTo(String value) {
            addCriterion("ois_custom3 <>", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3GreaterThan(String value) {
            addCriterion("ois_custom3 >", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom3 >=", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3LessThan(String value) {
            addCriterion("ois_custom3 <", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3LessThanOrEqualTo(String value) {
            addCriterion("ois_custom3 <=", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3Like(String value) {
            addCriterion("ois_custom3 like", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3NotLike(String value) {
            addCriterion("ois_custom3 not like", value, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3In(List<String> values) {
            addCriterion("ois_custom3 in", values, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3NotIn(List<String> values) {
            addCriterion("ois_custom3 not in", values, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3Between(String value1, String value2) {
            addCriterion("ois_custom3 between", value1, value2, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom3NotBetween(String value1, String value2) {
            addCriterion("ois_custom3 not between", value1, value2, "oisCustom3");
            return (Criteria) this;
        }

        public Criteria andOisCustom4IsNull() {
            addCriterion("ois_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom4IsNotNull() {
            addCriterion("ois_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom4EqualTo(String value) {
            addCriterion("ois_custom4 =", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4NotEqualTo(String value) {
            addCriterion("ois_custom4 <>", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4GreaterThan(String value) {
            addCriterion("ois_custom4 >", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom4 >=", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4LessThan(String value) {
            addCriterion("ois_custom4 <", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4LessThanOrEqualTo(String value) {
            addCriterion("ois_custom4 <=", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4Like(String value) {
            addCriterion("ois_custom4 like", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4NotLike(String value) {
            addCriterion("ois_custom4 not like", value, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4In(List<String> values) {
            addCriterion("ois_custom4 in", values, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4NotIn(List<String> values) {
            addCriterion("ois_custom4 not in", values, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4Between(String value1, String value2) {
            addCriterion("ois_custom4 between", value1, value2, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom4NotBetween(String value1, String value2) {
            addCriterion("ois_custom4 not between", value1, value2, "oisCustom4");
            return (Criteria) this;
        }

        public Criteria andOisCustom5IsNull() {
            addCriterion("ois_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom5IsNotNull() {
            addCriterion("ois_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom5EqualTo(String value) {
            addCriterion("ois_custom5 =", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5NotEqualTo(String value) {
            addCriterion("ois_custom5 <>", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5GreaterThan(String value) {
            addCriterion("ois_custom5 >", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom5 >=", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5LessThan(String value) {
            addCriterion("ois_custom5 <", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5LessThanOrEqualTo(String value) {
            addCriterion("ois_custom5 <=", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5Like(String value) {
            addCriterion("ois_custom5 like", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5NotLike(String value) {
            addCriterion("ois_custom5 not like", value, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5In(List<String> values) {
            addCriterion("ois_custom5 in", values, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5NotIn(List<String> values) {
            addCriterion("ois_custom5 not in", values, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5Between(String value1, String value2) {
            addCriterion("ois_custom5 between", value1, value2, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom5NotBetween(String value1, String value2) {
            addCriterion("ois_custom5 not between", value1, value2, "oisCustom5");
            return (Criteria) this;
        }

        public Criteria andOisCustom6IsNull() {
            addCriterion("ois_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andOisCustom6IsNotNull() {
            addCriterion("ois_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andOisCustom6EqualTo(String value) {
            addCriterion("ois_custom6 =", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6NotEqualTo(String value) {
            addCriterion("ois_custom6 <>", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6GreaterThan(String value) {
            addCriterion("ois_custom6 >", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ois_custom6 >=", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6LessThan(String value) {
            addCriterion("ois_custom6 <", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6LessThanOrEqualTo(String value) {
            addCriterion("ois_custom6 <=", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6Like(String value) {
            addCriterion("ois_custom6 like", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6NotLike(String value) {
            addCriterion("ois_custom6 not like", value, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6In(List<String> values) {
            addCriterion("ois_custom6 in", values, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6NotIn(List<String> values) {
            addCriterion("ois_custom6 not in", values, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6Between(String value1, String value2) {
            addCriterion("ois_custom6 between", value1, value2, "oisCustom6");
            return (Criteria) this;
        }

        public Criteria andOisCustom6NotBetween(String value1, String value2) {
            addCriterion("ois_custom6 not between", value1, value2, "oisCustom6");
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