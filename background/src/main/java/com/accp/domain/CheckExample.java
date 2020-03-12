package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckExample() {
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

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(String value) {
            addCriterion("check_id =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(String value) {
            addCriterion("check_id <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(String value) {
            addCriterion("check_id >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_id >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(String value) {
            addCriterion("check_id <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(String value) {
            addCriterion("check_id <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLike(String value) {
            addCriterion("check_id like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotLike(String value) {
            addCriterion("check_id not like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<String> values) {
            addCriterion("check_id in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<String> values) {
            addCriterion("check_id not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(String value1, String value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(String value1, String value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
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

        public Criteria andScAppreciationSubjectsIsNull() {
            addCriterion("sc_appreciation_subjects is null");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsIsNotNull() {
            addCriterion("sc_appreciation_subjects is not null");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsEqualTo(String value) {
            addCriterion("sc_appreciation_subjects =", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsNotEqualTo(String value) {
            addCriterion("sc_appreciation_subjects <>", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsGreaterThan(String value) {
            addCriterion("sc_appreciation_subjects >", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsGreaterThanOrEqualTo(String value) {
            addCriterion("sc_appreciation_subjects >=", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsLessThan(String value) {
            addCriterion("sc_appreciation_subjects <", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsLessThanOrEqualTo(String value) {
            addCriterion("sc_appreciation_subjects <=", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsLike(String value) {
            addCriterion("sc_appreciation_subjects like", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsNotLike(String value) {
            addCriterion("sc_appreciation_subjects not like", value, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsIn(List<String> values) {
            addCriterion("sc_appreciation_subjects in", values, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsNotIn(List<String> values) {
            addCriterion("sc_appreciation_subjects not in", values, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsBetween(String value1, String value2) {
            addCriterion("sc_appreciation_subjects between", value1, value2, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScAppreciationSubjectsNotBetween(String value1, String value2) {
            addCriterion("sc_appreciation_subjects not between", value1, value2, "scAppreciationSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsIsNull() {
            addCriterion("sc_impairment_subjects is null");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsIsNotNull() {
            addCriterion("sc_impairment_subjects is not null");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsEqualTo(String value) {
            addCriterion("sc_impairment_subjects =", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsNotEqualTo(String value) {
            addCriterion("sc_impairment_subjects <>", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsGreaterThan(String value) {
            addCriterion("sc_impairment_subjects >", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsGreaterThanOrEqualTo(String value) {
            addCriterion("sc_impairment_subjects >=", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsLessThan(String value) {
            addCriterion("sc_impairment_subjects <", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsLessThanOrEqualTo(String value) {
            addCriterion("sc_impairment_subjects <=", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsLike(String value) {
            addCriterion("sc_impairment_subjects like", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsNotLike(String value) {
            addCriterion("sc_impairment_subjects not like", value, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsIn(List<String> values) {
            addCriterion("sc_impairment_subjects in", values, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsNotIn(List<String> values) {
            addCriterion("sc_impairment_subjects not in", values, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsBetween(String value1, String value2) {
            addCriterion("sc_impairment_subjects between", value1, value2, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andScImpairmentSubjectsNotBetween(String value1, String value2) {
            addCriterion("sc_impairment_subjects not between", value1, value2, "scImpairmentSubjects");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateIsNull() {
            addCriterion("check_documentation_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateIsNotNull() {
            addCriterion("check_documentation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateEqualTo(Date value) {
            addCriterion("check_documentation_date =", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateNotEqualTo(Date value) {
            addCriterion("check_documentation_date <>", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateGreaterThan(Date value) {
            addCriterion("check_documentation_date >", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_documentation_date >=", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateLessThan(Date value) {
            addCriterion("check_documentation_date <", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateLessThanOrEqualTo(Date value) {
            addCriterion("check_documentation_date <=", value, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateIn(List<Date> values) {
            addCriterion("check_documentation_date in", values, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateNotIn(List<Date> values) {
            addCriterion("check_documentation_date not in", values, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateBetween(Date value1, Date value2) {
            addCriterion("check_documentation_date between", value1, value2, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationDateNotBetween(Date value1, Date value2) {
            addCriterion("check_documentation_date not between", value1, value2, "checkDocumentationDate");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoIsNull() {
            addCriterion("check_documentation_no is null");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoIsNotNull() {
            addCriterion("check_documentation_no is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoEqualTo(String value) {
            addCriterion("check_documentation_no =", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoNotEqualTo(String value) {
            addCriterion("check_documentation_no <>", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoGreaterThan(String value) {
            addCriterion("check_documentation_no >", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoGreaterThanOrEqualTo(String value) {
            addCriterion("check_documentation_no >=", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoLessThan(String value) {
            addCriterion("check_documentation_no <", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoLessThanOrEqualTo(String value) {
            addCriterion("check_documentation_no <=", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoLike(String value) {
            addCriterion("check_documentation_no like", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoNotLike(String value) {
            addCriterion("check_documentation_no not like", value, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoIn(List<String> values) {
            addCriterion("check_documentation_no in", values, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoNotIn(List<String> values) {
            addCriterion("check_documentation_no not in", values, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoBetween(String value1, String value2) {
            addCriterion("check_documentation_no between", value1, value2, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckDocumentationNoNotBetween(String value1, String value2) {
            addCriterion("check_documentation_no not between", value1, value2, "checkDocumentationNo");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerIsNull() {
            addCriterion("check_buyer is null");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerIsNotNull() {
            addCriterion("check_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerEqualTo(String value) {
            addCriterion("check_buyer =", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerNotEqualTo(String value) {
            addCriterion("check_buyer <>", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerGreaterThan(String value) {
            addCriterion("check_buyer >", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("check_buyer >=", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerLessThan(String value) {
            addCriterion("check_buyer <", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerLessThanOrEqualTo(String value) {
            addCriterion("check_buyer <=", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerLike(String value) {
            addCriterion("check_buyer like", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerNotLike(String value) {
            addCriterion("check_buyer not like", value, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerIn(List<String> values) {
            addCriterion("check_buyer in", values, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerNotIn(List<String> values) {
            addCriterion("check_buyer not in", values, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerBetween(String value1, String value2) {
            addCriterion("check_buyer between", value1, value2, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBuyerNotBetween(String value1, String value2) {
            addCriterion("check_buyer not between", value1, value2, "checkBuyer");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionIsNull() {
            addCriterion("check_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionIsNotNull() {
            addCriterion("check_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionEqualTo(String value) {
            addCriterion("check_belongs_section =", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionNotEqualTo(String value) {
            addCriterion("check_belongs_section <>", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionGreaterThan(String value) {
            addCriterion("check_belongs_section >", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("check_belongs_section >=", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionLessThan(String value) {
            addCriterion("check_belongs_section <", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("check_belongs_section <=", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionLike(String value) {
            addCriterion("check_belongs_section like", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionNotLike(String value) {
            addCriterion("check_belongs_section not like", value, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionIn(List<String> values) {
            addCriterion("check_belongs_section in", values, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionNotIn(List<String> values) {
            addCriterion("check_belongs_section not in", values, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionBetween(String value1, String value2) {
            addCriterion("check_belongs_section between", value1, value2, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("check_belongs_section not between", value1, value2, "checkBelongsSection");
            return (Criteria) this;
        }

        public Criteria andCheckFormIsNull() {
            addCriterion("check_form is null");
            return (Criteria) this;
        }

        public Criteria andCheckFormIsNotNull() {
            addCriterion("check_form is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFormEqualTo(String value) {
            addCriterion("check_form =", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormNotEqualTo(String value) {
            addCriterion("check_form <>", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormGreaterThan(String value) {
            addCriterion("check_form >", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormGreaterThanOrEqualTo(String value) {
            addCriterion("check_form >=", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormLessThan(String value) {
            addCriterion("check_form <", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormLessThanOrEqualTo(String value) {
            addCriterion("check_form <=", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormLike(String value) {
            addCriterion("check_form like", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormNotLike(String value) {
            addCriterion("check_form not like", value, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormIn(List<String> values) {
            addCriterion("check_form in", values, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormNotIn(List<String> values) {
            addCriterion("check_form not in", values, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormBetween(String value1, String value2) {
            addCriterion("check_form between", value1, value2, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckFormNotBetween(String value1, String value2) {
            addCriterion("check_form not between", value1, value2, "checkForm");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffIsNull() {
            addCriterion("check_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffIsNotNull() {
            addCriterion("check_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffEqualTo(String value) {
            addCriterion("check_checkagain_staff =", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffNotEqualTo(String value) {
            addCriterion("check_checkagain_staff <>", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffGreaterThan(String value) {
            addCriterion("check_checkagain_staff >", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("check_checkagain_staff >=", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffLessThan(String value) {
            addCriterion("check_checkagain_staff <", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("check_checkagain_staff <=", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffLike(String value) {
            addCriterion("check_checkagain_staff like", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffNotLike(String value) {
            addCriterion("check_checkagain_staff not like", value, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffIn(List<String> values) {
            addCriterion("check_checkagain_staff in", values, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffNotIn(List<String> values) {
            addCriterion("check_checkagain_staff not in", values, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffBetween(String value1, String value2) {
            addCriterion("check_checkagain_staff between", value1, value2, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("check_checkagain_staff not between", value1, value2, "checkCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNull() {
            addCriterion("check_remark is null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNotNull() {
            addCriterion("check_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkEqualTo(String value) {
            addCriterion("check_remark =", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotEqualTo(String value) {
            addCriterion("check_remark <>", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThan(String value) {
            addCriterion("check_remark >", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("check_remark >=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThan(String value) {
            addCriterion("check_remark <", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("check_remark <=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLike(String value) {
            addCriterion("check_remark like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotLike(String value) {
            addCriterion("check_remark not like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIn(List<String> values) {
            addCriterion("check_remark in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotIn(List<String> values) {
            addCriterion("check_remark not in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkBetween(String value1, String value2) {
            addCriterion("check_remark between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("check_remark not between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingIsNull() {
            addCriterion("check_auditing is null");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingIsNotNull() {
            addCriterion("check_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingEqualTo(String value) {
            addCriterion("check_auditing =", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingNotEqualTo(String value) {
            addCriterion("check_auditing <>", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingGreaterThan(String value) {
            addCriterion("check_auditing >", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("check_auditing >=", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingLessThan(String value) {
            addCriterion("check_auditing <", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingLessThanOrEqualTo(String value) {
            addCriterion("check_auditing <=", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingLike(String value) {
            addCriterion("check_auditing like", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingNotLike(String value) {
            addCriterion("check_auditing not like", value, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingIn(List<String> values) {
            addCriterion("check_auditing in", values, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingNotIn(List<String> values) {
            addCriterion("check_auditing not in", values, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingBetween(String value1, String value2) {
            addCriterion("check_auditing between", value1, value2, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckAuditingNotBetween(String value1, String value2) {
            addCriterion("check_auditing not between", value1, value2, "checkAuditing");
            return (Criteria) this;
        }

        public Criteria andCheckYnIsNull() {
            addCriterion("check_yn is null");
            return (Criteria) this;
        }

        public Criteria andCheckYnIsNotNull() {
            addCriterion("check_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCheckYnEqualTo(String value) {
            addCriterion("check_yn =", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnNotEqualTo(String value) {
            addCriterion("check_yn <>", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnGreaterThan(String value) {
            addCriterion("check_yn >", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnGreaterThanOrEqualTo(String value) {
            addCriterion("check_yn >=", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnLessThan(String value) {
            addCriterion("check_yn <", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnLessThanOrEqualTo(String value) {
            addCriterion("check_yn <=", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnLike(String value) {
            addCriterion("check_yn like", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnNotLike(String value) {
            addCriterion("check_yn not like", value, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnIn(List<String> values) {
            addCriterion("check_yn in", values, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnNotIn(List<String> values) {
            addCriterion("check_yn not in", values, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnBetween(String value1, String value2) {
            addCriterion("check_yn between", value1, value2, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckYnNotBetween(String value1, String value2) {
            addCriterion("check_yn not between", value1, value2, "checkYn");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1IsNull() {
            addCriterion("check_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1IsNotNull() {
            addCriterion("check_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1EqualTo(String value) {
            addCriterion("check_custom1 =", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1NotEqualTo(String value) {
            addCriterion("check_custom1 <>", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1GreaterThan(String value) {
            addCriterion("check_custom1 >", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom1 >=", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1LessThan(String value) {
            addCriterion("check_custom1 <", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1LessThanOrEqualTo(String value) {
            addCriterion("check_custom1 <=", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1Like(String value) {
            addCriterion("check_custom1 like", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1NotLike(String value) {
            addCriterion("check_custom1 not like", value, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1In(List<String> values) {
            addCriterion("check_custom1 in", values, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1NotIn(List<String> values) {
            addCriterion("check_custom1 not in", values, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1Between(String value1, String value2) {
            addCriterion("check_custom1 between", value1, value2, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom1NotBetween(String value1, String value2) {
            addCriterion("check_custom1 not between", value1, value2, "checkCustom1");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2IsNull() {
            addCriterion("check_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2IsNotNull() {
            addCriterion("check_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2EqualTo(String value) {
            addCriterion("check_custom2 =", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2NotEqualTo(String value) {
            addCriterion("check_custom2 <>", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2GreaterThan(String value) {
            addCriterion("check_custom2 >", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom2 >=", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2LessThan(String value) {
            addCriterion("check_custom2 <", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2LessThanOrEqualTo(String value) {
            addCriterion("check_custom2 <=", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2Like(String value) {
            addCriterion("check_custom2 like", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2NotLike(String value) {
            addCriterion("check_custom2 not like", value, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2In(List<String> values) {
            addCriterion("check_custom2 in", values, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2NotIn(List<String> values) {
            addCriterion("check_custom2 not in", values, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2Between(String value1, String value2) {
            addCriterion("check_custom2 between", value1, value2, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom2NotBetween(String value1, String value2) {
            addCriterion("check_custom2 not between", value1, value2, "checkCustom2");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3IsNull() {
            addCriterion("check_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3IsNotNull() {
            addCriterion("check_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3EqualTo(String value) {
            addCriterion("check_custom3 =", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3NotEqualTo(String value) {
            addCriterion("check_custom3 <>", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3GreaterThan(String value) {
            addCriterion("check_custom3 >", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom3 >=", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3LessThan(String value) {
            addCriterion("check_custom3 <", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3LessThanOrEqualTo(String value) {
            addCriterion("check_custom3 <=", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3Like(String value) {
            addCriterion("check_custom3 like", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3NotLike(String value) {
            addCriterion("check_custom3 not like", value, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3In(List<String> values) {
            addCriterion("check_custom3 in", values, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3NotIn(List<String> values) {
            addCriterion("check_custom3 not in", values, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3Between(String value1, String value2) {
            addCriterion("check_custom3 between", value1, value2, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom3NotBetween(String value1, String value2) {
            addCriterion("check_custom3 not between", value1, value2, "checkCustom3");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4IsNull() {
            addCriterion("check_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4IsNotNull() {
            addCriterion("check_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4EqualTo(String value) {
            addCriterion("check_custom4 =", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4NotEqualTo(String value) {
            addCriterion("check_custom4 <>", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4GreaterThan(String value) {
            addCriterion("check_custom4 >", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom4 >=", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4LessThan(String value) {
            addCriterion("check_custom4 <", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4LessThanOrEqualTo(String value) {
            addCriterion("check_custom4 <=", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4Like(String value) {
            addCriterion("check_custom4 like", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4NotLike(String value) {
            addCriterion("check_custom4 not like", value, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4In(List<String> values) {
            addCriterion("check_custom4 in", values, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4NotIn(List<String> values) {
            addCriterion("check_custom4 not in", values, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4Between(String value1, String value2) {
            addCriterion("check_custom4 between", value1, value2, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom4NotBetween(String value1, String value2) {
            addCriterion("check_custom4 not between", value1, value2, "checkCustom4");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5IsNull() {
            addCriterion("check_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5IsNotNull() {
            addCriterion("check_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5EqualTo(String value) {
            addCriterion("check_custom5 =", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5NotEqualTo(String value) {
            addCriterion("check_custom5 <>", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5GreaterThan(String value) {
            addCriterion("check_custom5 >", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom5 >=", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5LessThan(String value) {
            addCriterion("check_custom5 <", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5LessThanOrEqualTo(String value) {
            addCriterion("check_custom5 <=", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5Like(String value) {
            addCriterion("check_custom5 like", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5NotLike(String value) {
            addCriterion("check_custom5 not like", value, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5In(List<String> values) {
            addCriterion("check_custom5 in", values, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5NotIn(List<String> values) {
            addCriterion("check_custom5 not in", values, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5Between(String value1, String value2) {
            addCriterion("check_custom5 between", value1, value2, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom5NotBetween(String value1, String value2) {
            addCriterion("check_custom5 not between", value1, value2, "checkCustom5");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6IsNull() {
            addCriterion("check_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6IsNotNull() {
            addCriterion("check_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6EqualTo(String value) {
            addCriterion("check_custom6 =", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6NotEqualTo(String value) {
            addCriterion("check_custom6 <>", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6GreaterThan(String value) {
            addCriterion("check_custom6 >", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("check_custom6 >=", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6LessThan(String value) {
            addCriterion("check_custom6 <", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6LessThanOrEqualTo(String value) {
            addCriterion("check_custom6 <=", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6Like(String value) {
            addCriterion("check_custom6 like", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6NotLike(String value) {
            addCriterion("check_custom6 not like", value, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6In(List<String> values) {
            addCriterion("check_custom6 in", values, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6NotIn(List<String> values) {
            addCriterion("check_custom6 not in", values, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6Between(String value1, String value2) {
            addCriterion("check_custom6 between", value1, value2, "checkCustom6");
            return (Criteria) this;
        }

        public Criteria andCheckCustom6NotBetween(String value1, String value2) {
            addCriterion("check_custom6 not between", value1, value2, "checkCustom6");
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