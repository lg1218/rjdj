package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssessmentProcurementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessmentProcurementExample() {
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

        public Criteria andApDateDocumentIsNull() {
            addCriterion("ap_date_document is null");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentIsNotNull() {
            addCriterion("ap_date_document is not null");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentEqualTo(Date value) {
            addCriterionForJDBCDate("ap_date_document =", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentNotEqualTo(Date value) {
            addCriterionForJDBCDate("ap_date_document <>", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentGreaterThan(Date value) {
            addCriterionForJDBCDate("ap_date_document >", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ap_date_document >=", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentLessThan(Date value) {
            addCriterionForJDBCDate("ap_date_document <", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ap_date_document <=", value, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentIn(List<Date> values) {
            addCriterionForJDBCDate("ap_date_document in", values, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentNotIn(List<Date> values) {
            addCriterionForJDBCDate("ap_date_document not in", values, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ap_date_document between", value1, value2, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApDateDocumentNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ap_date_document not between", value1, value2, "apDateDocument");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentIsNull() {
            addCriterion("ap_method_assessment is null");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentIsNotNull() {
            addCriterion("ap_method_assessment is not null");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentEqualTo(String value) {
            addCriterion("ap_method_assessment =", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentNotEqualTo(String value) {
            addCriterion("ap_method_assessment <>", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentGreaterThan(String value) {
            addCriterion("ap_method_assessment >", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentGreaterThanOrEqualTo(String value) {
            addCriterion("ap_method_assessment >=", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentLessThan(String value) {
            addCriterion("ap_method_assessment <", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentLessThanOrEqualTo(String value) {
            addCriterion("ap_method_assessment <=", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentLike(String value) {
            addCriterion("ap_method_assessment like", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentNotLike(String value) {
            addCriterion("ap_method_assessment not like", value, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentIn(List<String> values) {
            addCriterion("ap_method_assessment in", values, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentNotIn(List<String> values) {
            addCriterion("ap_method_assessment not in", values, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentBetween(String value1, String value2) {
            addCriterion("ap_method_assessment between", value1, value2, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApMethodAssessmentNotBetween(String value1, String value2) {
            addCriterion("ap_method_assessment not between", value1, value2, "apMethodAssessment");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedIsNull() {
            addCriterion("ap_principal_currency_amortized is null");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedIsNotNull() {
            addCriterion("ap_principal_currency_amortized is not null");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedEqualTo(Float value) {
            addCriterion("ap_principal_currency_amortized =", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedNotEqualTo(Float value) {
            addCriterion("ap_principal_currency_amortized <>", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedGreaterThan(Float value) {
            addCriterion("ap_principal_currency_amortized >", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedGreaterThanOrEqualTo(Float value) {
            addCriterion("ap_principal_currency_amortized >=", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedLessThan(Float value) {
            addCriterion("ap_principal_currency_amortized <", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedLessThanOrEqualTo(Float value) {
            addCriterion("ap_principal_currency_amortized <=", value, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedIn(List<Float> values) {
            addCriterion("ap_principal_currency_amortized in", values, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedNotIn(List<Float> values) {
            addCriterion("ap_principal_currency_amortized not in", values, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedBetween(Float value1, Float value2) {
            addCriterion("ap_principal_currency_amortized between", value1, value2, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApPrincipalCurrencyAmortizedNotBetween(Float value1, Float value2) {
            addCriterion("ap_principal_currency_amortized not between", value1, value2, "apPrincipalCurrencyAmortized");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusIsNull() {
            addCriterion("ap_single_status is null");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusIsNotNull() {
            addCriterion("ap_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusEqualTo(String value) {
            addCriterion("ap_single_status =", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusNotEqualTo(String value) {
            addCriterion("ap_single_status <>", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusGreaterThan(String value) {
            addCriterion("ap_single_status >", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ap_single_status >=", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusLessThan(String value) {
            addCriterion("ap_single_status <", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("ap_single_status <=", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusLike(String value) {
            addCriterion("ap_single_status like", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusNotLike(String value) {
            addCriterion("ap_single_status not like", value, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusIn(List<String> values) {
            addCriterion("ap_single_status in", values, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusNotIn(List<String> values) {
            addCriterion("ap_single_status not in", values, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusBetween(String value1, String value2) {
            addCriterion("ap_single_status between", value1, value2, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApSingleStatusNotBetween(String value1, String value2) {
            addCriterion("ap_single_status not between", value1, value2, "apSingleStatus");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectIsNull() {
            addCriterion("ap_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectIsNotNull() {
            addCriterion("ap_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectEqualTo(String value) {
            addCriterion("ap_belongs_project =", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectNotEqualTo(String value) {
            addCriterion("ap_belongs_project <>", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectGreaterThan(String value) {
            addCriterion("ap_belongs_project >", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("ap_belongs_project >=", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectLessThan(String value) {
            addCriterion("ap_belongs_project <", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("ap_belongs_project <=", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectLike(String value) {
            addCriterion("ap_belongs_project like", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectNotLike(String value) {
            addCriterion("ap_belongs_project not like", value, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectIn(List<String> values) {
            addCriterion("ap_belongs_project in", values, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectNotIn(List<String> values) {
            addCriterion("ap_belongs_project not in", values, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectBetween(String value1, String value2) {
            addCriterion("ap_belongs_project between", value1, value2, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("ap_belongs_project not between", value1, value2, "apBelongsProject");
            return (Criteria) this;
        }

        public Criteria andApExecutorIsNull() {
            addCriterion("ap_executor is null");
            return (Criteria) this;
        }

        public Criteria andApExecutorIsNotNull() {
            addCriterion("ap_executor is not null");
            return (Criteria) this;
        }

        public Criteria andApExecutorEqualTo(String value) {
            addCriterion("ap_executor =", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorNotEqualTo(String value) {
            addCriterion("ap_executor <>", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorGreaterThan(String value) {
            addCriterion("ap_executor >", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("ap_executor >=", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorLessThan(String value) {
            addCriterion("ap_executor <", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorLessThanOrEqualTo(String value) {
            addCriterion("ap_executor <=", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorLike(String value) {
            addCriterion("ap_executor like", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorNotLike(String value) {
            addCriterion("ap_executor not like", value, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorIn(List<String> values) {
            addCriterion("ap_executor in", values, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorNotIn(List<String> values) {
            addCriterion("ap_executor not in", values, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorBetween(String value1, String value2) {
            addCriterion("ap_executor between", value1, value2, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApExecutorNotBetween(String value1, String value2) {
            addCriterion("ap_executor not between", value1, value2, "apExecutor");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffIsNull() {
            addCriterion("ap_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffIsNotNull() {
            addCriterion("ap_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffEqualTo(String value) {
            addCriterion("ap_checkagain_staff =", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffNotEqualTo(String value) {
            addCriterion("ap_checkagain_staff <>", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffGreaterThan(String value) {
            addCriterion("ap_checkagain_staff >", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("ap_checkagain_staff >=", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffLessThan(String value) {
            addCriterion("ap_checkagain_staff <", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("ap_checkagain_staff <=", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffLike(String value) {
            addCriterion("ap_checkagain_staff like", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffNotLike(String value) {
            addCriterion("ap_checkagain_staff not like", value, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffIn(List<String> values) {
            addCriterion("ap_checkagain_staff in", values, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffNotIn(List<String> values) {
            addCriterion("ap_checkagain_staff not in", values, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffBetween(String value1, String value2) {
            addCriterion("ap_checkagain_staff between", value1, value2, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("ap_checkagain_staff not between", value1, value2, "apCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionIsNull() {
            addCriterion("ap_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionIsNotNull() {
            addCriterion("ap_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionEqualTo(String value) {
            addCriterion("ap_header_provision =", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionNotEqualTo(String value) {
            addCriterion("ap_header_provision <>", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionGreaterThan(String value) {
            addCriterion("ap_header_provision >", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("ap_header_provision >=", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionLessThan(String value) {
            addCriterion("ap_header_provision <", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("ap_header_provision <=", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionLike(String value) {
            addCriterion("ap_header_provision like", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionNotLike(String value) {
            addCriterion("ap_header_provision not like", value, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionIn(List<String> values) {
            addCriterion("ap_header_provision in", values, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionNotIn(List<String> values) {
            addCriterion("ap_header_provision not in", values, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionBetween(String value1, String value2) {
            addCriterion("ap_header_provision between", value1, value2, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("ap_header_provision not between", value1, value2, "apHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andApEndClauseIsNull() {
            addCriterion("ap_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andApEndClauseIsNotNull() {
            addCriterion("ap_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andApEndClauseEqualTo(String value) {
            addCriterion("ap_end_clause =", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseNotEqualTo(String value) {
            addCriterion("ap_end_clause <>", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseGreaterThan(String value) {
            addCriterion("ap_end_clause >", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("ap_end_clause >=", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseLessThan(String value) {
            addCriterion("ap_end_clause <", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseLessThanOrEqualTo(String value) {
            addCriterion("ap_end_clause <=", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseLike(String value) {
            addCriterion("ap_end_clause like", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseNotLike(String value) {
            addCriterion("ap_end_clause not like", value, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseIn(List<String> values) {
            addCriterion("ap_end_clause in", values, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseNotIn(List<String> values) {
            addCriterion("ap_end_clause not in", values, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseBetween(String value1, String value2) {
            addCriterion("ap_end_clause between", value1, value2, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApEndClauseNotBetween(String value1, String value2) {
            addCriterion("ap_end_clause not between", value1, value2, "apEndClause");
            return (Criteria) this;
        }

        public Criteria andApRemarkIsNull() {
            addCriterion("ap_remark is null");
            return (Criteria) this;
        }

        public Criteria andApRemarkIsNotNull() {
            addCriterion("ap_remark is not null");
            return (Criteria) this;
        }

        public Criteria andApRemarkEqualTo(String value) {
            addCriterion("ap_remark =", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkNotEqualTo(String value) {
            addCriterion("ap_remark <>", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkGreaterThan(String value) {
            addCriterion("ap_remark >", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ap_remark >=", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkLessThan(String value) {
            addCriterion("ap_remark <", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkLessThanOrEqualTo(String value) {
            addCriterion("ap_remark <=", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkLike(String value) {
            addCriterion("ap_remark like", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkNotLike(String value) {
            addCriterion("ap_remark not like", value, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkIn(List<String> values) {
            addCriterion("ap_remark in", values, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkNotIn(List<String> values) {
            addCriterion("ap_remark not in", values, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkBetween(String value1, String value2) {
            addCriterion("ap_remark between", value1, value2, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApRemarkNotBetween(String value1, String value2) {
            addCriterion("ap_remark not between", value1, value2, "apRemark");
            return (Criteria) this;
        }

        public Criteria andApAuditionIsNull() {
            addCriterion("ap_audition is null");
            return (Criteria) this;
        }

        public Criteria andApAuditionIsNotNull() {
            addCriterion("ap_audition is not null");
            return (Criteria) this;
        }

        public Criteria andApAuditionEqualTo(String value) {
            addCriterion("ap_audition =", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionNotEqualTo(String value) {
            addCriterion("ap_audition <>", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionGreaterThan(String value) {
            addCriterion("ap_audition >", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("ap_audition >=", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionLessThan(String value) {
            addCriterion("ap_audition <", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionLessThanOrEqualTo(String value) {
            addCriterion("ap_audition <=", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionLike(String value) {
            addCriterion("ap_audition like", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionNotLike(String value) {
            addCriterion("ap_audition not like", value, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionIn(List<String> values) {
            addCriterion("ap_audition in", values, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionNotIn(List<String> values) {
            addCriterion("ap_audition not in", values, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionBetween(String value1, String value2) {
            addCriterion("ap_audition between", value1, value2, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApAuditionNotBetween(String value1, String value2) {
            addCriterion("ap_audition not between", value1, value2, "apAudition");
            return (Criteria) this;
        }

        public Criteria andApYnIsNull() {
            addCriterion("ap_yn is null");
            return (Criteria) this;
        }

        public Criteria andApYnIsNotNull() {
            addCriterion("ap_yn is not null");
            return (Criteria) this;
        }

        public Criteria andApYnEqualTo(String value) {
            addCriterion("ap_yn =", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotEqualTo(String value) {
            addCriterion("ap_yn <>", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnGreaterThan(String value) {
            addCriterion("ap_yn >", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnGreaterThanOrEqualTo(String value) {
            addCriterion("ap_yn >=", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLessThan(String value) {
            addCriterion("ap_yn <", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLessThanOrEqualTo(String value) {
            addCriterion("ap_yn <=", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnLike(String value) {
            addCriterion("ap_yn like", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotLike(String value) {
            addCriterion("ap_yn not like", value, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnIn(List<String> values) {
            addCriterion("ap_yn in", values, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotIn(List<String> values) {
            addCriterion("ap_yn not in", values, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnBetween(String value1, String value2) {
            addCriterion("ap_yn between", value1, value2, "apYn");
            return (Criteria) this;
        }

        public Criteria andApYnNotBetween(String value1, String value2) {
            addCriterion("ap_yn not between", value1, value2, "apYn");
            return (Criteria) this;
        }

        public Criteria andApCustom1IsNull() {
            addCriterion("ap_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom1IsNotNull() {
            addCriterion("ap_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom1EqualTo(String value) {
            addCriterion("ap_custom1 =", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotEqualTo(String value) {
            addCriterion("ap_custom1 <>", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1GreaterThan(String value) {
            addCriterion("ap_custom1 >", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom1 >=", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1LessThan(String value) {
            addCriterion("ap_custom1 <", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1LessThanOrEqualTo(String value) {
            addCriterion("ap_custom1 <=", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1Like(String value) {
            addCriterion("ap_custom1 like", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotLike(String value) {
            addCriterion("ap_custom1 not like", value, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1In(List<String> values) {
            addCriterion("ap_custom1 in", values, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotIn(List<String> values) {
            addCriterion("ap_custom1 not in", values, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1Between(String value1, String value2) {
            addCriterion("ap_custom1 between", value1, value2, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom1NotBetween(String value1, String value2) {
            addCriterion("ap_custom1 not between", value1, value2, "apCustom1");
            return (Criteria) this;
        }

        public Criteria andApCustom2IsNull() {
            addCriterion("ap_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom2IsNotNull() {
            addCriterion("ap_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom2EqualTo(String value) {
            addCriterion("ap_custom2 =", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotEqualTo(String value) {
            addCriterion("ap_custom2 <>", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2GreaterThan(String value) {
            addCriterion("ap_custom2 >", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom2 >=", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2LessThan(String value) {
            addCriterion("ap_custom2 <", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2LessThanOrEqualTo(String value) {
            addCriterion("ap_custom2 <=", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2Like(String value) {
            addCriterion("ap_custom2 like", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotLike(String value) {
            addCriterion("ap_custom2 not like", value, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2In(List<String> values) {
            addCriterion("ap_custom2 in", values, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotIn(List<String> values) {
            addCriterion("ap_custom2 not in", values, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2Between(String value1, String value2) {
            addCriterion("ap_custom2 between", value1, value2, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom2NotBetween(String value1, String value2) {
            addCriterion("ap_custom2 not between", value1, value2, "apCustom2");
            return (Criteria) this;
        }

        public Criteria andApCustom3IsNull() {
            addCriterion("ap_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom3IsNotNull() {
            addCriterion("ap_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom3EqualTo(String value) {
            addCriterion("ap_custom3 =", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotEqualTo(String value) {
            addCriterion("ap_custom3 <>", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3GreaterThan(String value) {
            addCriterion("ap_custom3 >", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom3 >=", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3LessThan(String value) {
            addCriterion("ap_custom3 <", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3LessThanOrEqualTo(String value) {
            addCriterion("ap_custom3 <=", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3Like(String value) {
            addCriterion("ap_custom3 like", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotLike(String value) {
            addCriterion("ap_custom3 not like", value, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3In(List<String> values) {
            addCriterion("ap_custom3 in", values, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotIn(List<String> values) {
            addCriterion("ap_custom3 not in", values, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3Between(String value1, String value2) {
            addCriterion("ap_custom3 between", value1, value2, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom3NotBetween(String value1, String value2) {
            addCriterion("ap_custom3 not between", value1, value2, "apCustom3");
            return (Criteria) this;
        }

        public Criteria andApCustom4IsNull() {
            addCriterion("ap_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom4IsNotNull() {
            addCriterion("ap_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom4EqualTo(String value) {
            addCriterion("ap_custom4 =", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotEqualTo(String value) {
            addCriterion("ap_custom4 <>", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4GreaterThan(String value) {
            addCriterion("ap_custom4 >", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom4 >=", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4LessThan(String value) {
            addCriterion("ap_custom4 <", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4LessThanOrEqualTo(String value) {
            addCriterion("ap_custom4 <=", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4Like(String value) {
            addCriterion("ap_custom4 like", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotLike(String value) {
            addCriterion("ap_custom4 not like", value, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4In(List<String> values) {
            addCriterion("ap_custom4 in", values, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotIn(List<String> values) {
            addCriterion("ap_custom4 not in", values, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4Between(String value1, String value2) {
            addCriterion("ap_custom4 between", value1, value2, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom4NotBetween(String value1, String value2) {
            addCriterion("ap_custom4 not between", value1, value2, "apCustom4");
            return (Criteria) this;
        }

        public Criteria andApCustom5IsNull() {
            addCriterion("ap_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom5IsNotNull() {
            addCriterion("ap_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom5EqualTo(String value) {
            addCriterion("ap_custom5 =", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotEqualTo(String value) {
            addCriterion("ap_custom5 <>", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5GreaterThan(String value) {
            addCriterion("ap_custom5 >", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom5 >=", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5LessThan(String value) {
            addCriterion("ap_custom5 <", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5LessThanOrEqualTo(String value) {
            addCriterion("ap_custom5 <=", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5Like(String value) {
            addCriterion("ap_custom5 like", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotLike(String value) {
            addCriterion("ap_custom5 not like", value, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5In(List<String> values) {
            addCriterion("ap_custom5 in", values, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotIn(List<String> values) {
            addCriterion("ap_custom5 not in", values, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5Between(String value1, String value2) {
            addCriterion("ap_custom5 between", value1, value2, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom5NotBetween(String value1, String value2) {
            addCriterion("ap_custom5 not between", value1, value2, "apCustom5");
            return (Criteria) this;
        }

        public Criteria andApCustom6IsNull() {
            addCriterion("ap_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andApCustom6IsNotNull() {
            addCriterion("ap_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andApCustom6EqualTo(String value) {
            addCriterion("ap_custom6 =", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotEqualTo(String value) {
            addCriterion("ap_custom6 <>", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6GreaterThan(String value) {
            addCriterion("ap_custom6 >", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ap_custom6 >=", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6LessThan(String value) {
            addCriterion("ap_custom6 <", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6LessThanOrEqualTo(String value) {
            addCriterion("ap_custom6 <=", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6Like(String value) {
            addCriterion("ap_custom6 like", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotLike(String value) {
            addCriterion("ap_custom6 not like", value, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6In(List<String> values) {
            addCriterion("ap_custom6 in", values, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotIn(List<String> values) {
            addCriterion("ap_custom6 not in", values, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6Between(String value1, String value2) {
            addCriterion("ap_custom6 between", value1, value2, "apCustom6");
            return (Criteria) this;
        }

        public Criteria andApCustom6NotBetween(String value1, String value2) {
            addCriterion("ap_custom6 not between", value1, value2, "apCustom6");
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