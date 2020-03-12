package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RequisitionDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequisitionDetailedExample() {
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

        public Criteria andRdIdIsNull() {
            addCriterion("rd_id is null");
            return (Criteria) this;
        }

        public Criteria andRdIdIsNotNull() {
            addCriterion("rd_id is not null");
            return (Criteria) this;
        }

        public Criteria andRdIdEqualTo(String value) {
            addCriterion("rd_id =", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotEqualTo(String value) {
            addCriterion("rd_id <>", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdGreaterThan(String value) {
            addCriterion("rd_id >", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdGreaterThanOrEqualTo(String value) {
            addCriterion("rd_id >=", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdLessThan(String value) {
            addCriterion("rd_id <", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdLessThanOrEqualTo(String value) {
            addCriterion("rd_id <=", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdLike(String value) {
            addCriterion("rd_id like", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotLike(String value) {
            addCriterion("rd_id not like", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdIn(List<String> values) {
            addCriterion("rd_id in", values, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotIn(List<String> values) {
            addCriterion("rd_id not in", values, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdBetween(String value1, String value2) {
            addCriterion("rd_id between", value1, value2, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotBetween(String value1, String value2) {
            addCriterion("rd_id not between", value1, value2, "rdId");
            return (Criteria) this;
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

        public Criteria andRdEngnameIsNull() {
            addCriterion("rd_engname is null");
            return (Criteria) this;
        }

        public Criteria andRdEngnameIsNotNull() {
            addCriterion("rd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andRdEngnameEqualTo(String value) {
            addCriterion("rd_engname =", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameNotEqualTo(String value) {
            addCriterion("rd_engname <>", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameGreaterThan(String value) {
            addCriterion("rd_engname >", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("rd_engname >=", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameLessThan(String value) {
            addCriterion("rd_engname <", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameLessThanOrEqualTo(String value) {
            addCriterion("rd_engname <=", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameLike(String value) {
            addCriterion("rd_engname like", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameNotLike(String value) {
            addCriterion("rd_engname not like", value, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameIn(List<String> values) {
            addCriterion("rd_engname in", values, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameNotIn(List<String> values) {
            addCriterion("rd_engname not in", values, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameBetween(String value1, String value2) {
            addCriterion("rd_engname between", value1, value2, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdEngnameNotBetween(String value1, String value2) {
            addCriterion("rd_engname not between", value1, value2, "rdEngname");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIsNull() {
            addCriterion("rd_remark is null");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIsNotNull() {
            addCriterion("rd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRdRemarkEqualTo(String value) {
            addCriterion("rd_remark =", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotEqualTo(String value) {
            addCriterion("rd_remark <>", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkGreaterThan(String value) {
            addCriterion("rd_remark >", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("rd_remark >=", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLessThan(String value) {
            addCriterion("rd_remark <", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLessThanOrEqualTo(String value) {
            addCriterion("rd_remark <=", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkLike(String value) {
            addCriterion("rd_remark like", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotLike(String value) {
            addCriterion("rd_remark not like", value, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkIn(List<String> values) {
            addCriterion("rd_remark in", values, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotIn(List<String> values) {
            addCriterion("rd_remark not in", values, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkBetween(String value1, String value2) {
            addCriterion("rd_remark between", value1, value2, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdRemarkNotBetween(String value1, String value2) {
            addCriterion("rd_remark not between", value1, value2, "rdRemark");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxIsNull() {
            addCriterion("rd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxIsNotNull() {
            addCriterion("rd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxEqualTo(String value) {
            addCriterion("rd_price_include_tax =", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("rd_price_include_tax <>", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("rd_price_include_tax >", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("rd_price_include_tax >=", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxLessThan(String value) {
            addCriterion("rd_price_include_tax <", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("rd_price_include_tax <=", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxLike(String value) {
            addCriterion("rd_price_include_tax like", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxNotLike(String value) {
            addCriterion("rd_price_include_tax not like", value, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxIn(List<String> values) {
            addCriterion("rd_price_include_tax in", values, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("rd_price_include_tax not in", values, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("rd_price_include_tax between", value1, value2, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("rd_price_include_tax not between", value1, value2, "rdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumIsNull() {
            addCriterion("rd_single_num is null");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumIsNotNull() {
            addCriterion("rd_single_num is not null");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumEqualTo(Integer value) {
            addCriterion("rd_single_num =", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumNotEqualTo(Integer value) {
            addCriterion("rd_single_num <>", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumGreaterThan(Integer value) {
            addCriterion("rd_single_num >", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_single_num >=", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumLessThan(Integer value) {
            addCriterion("rd_single_num <", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumLessThanOrEqualTo(Integer value) {
            addCriterion("rd_single_num <=", value, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumIn(List<Integer> values) {
            addCriterion("rd_single_num in", values, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumNotIn(List<Integer> values) {
            addCriterion("rd_single_num not in", values, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumBetween(Integer value1, Integer value2) {
            addCriterion("rd_single_num between", value1, value2, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdSingleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_single_num not between", value1, value2, "rdSingleNum");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberIsNull() {
            addCriterion("\"rd_batch _number\" is null");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberIsNotNull() {
            addCriterion("\"rd_batch _number\" is not null");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberEqualTo(String value) {
            addCriterion("\"rd_batch _number\" =", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberNotEqualTo(String value) {
            addCriterion("\"rd_batch _number\" <>", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberGreaterThan(String value) {
            addCriterion("\"rd_batch _number\" >", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"rd_batch _number\" >=", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberLessThan(String value) {
            addCriterion("\"rd_batch _number\" <", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("\"rd_batch _number\" <=", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberLike(String value) {
            addCriterion("\"rd_batch _number\" like", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberNotLike(String value) {
            addCriterion("\"rd_batch _number\" not like", value, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberIn(List<String> values) {
            addCriterion("\"rd_batch _number\" in", values, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberNotIn(List<String> values) {
            addCriterion("\"rd_batch _number\" not in", values, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberBetween(String value1, String value2) {
            addCriterion("\"rd_batch _number\" between", value1, value2, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdBatchNumberNotBetween(String value1, String value2) {
            addCriterion("\"rd_batch _number\" not between", value1, value2, "rdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRdRemarksIsNull() {
            addCriterion("rd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRdRemarksIsNotNull() {
            addCriterion("rd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRdRemarksEqualTo(String value) {
            addCriterion("rd_remarks =", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksNotEqualTo(String value) {
            addCriterion("rd_remarks <>", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksGreaterThan(String value) {
            addCriterion("rd_remarks >", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("rd_remarks >=", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksLessThan(String value) {
            addCriterion("rd_remarks <", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksLessThanOrEqualTo(String value) {
            addCriterion("rd_remarks <=", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksLike(String value) {
            addCriterion("rd_remarks like", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksNotLike(String value) {
            addCriterion("rd_remarks not like", value, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksIn(List<String> values) {
            addCriterion("rd_remarks in", values, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksNotIn(List<String> values) {
            addCriterion("rd_remarks not in", values, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksBetween(String value1, String value2) {
            addCriterion("rd_remarks between", value1, value2, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdRemarksNotBetween(String value1, String value2) {
            addCriterion("rd_remarks not between", value1, value2, "rdRemarks");
            return (Criteria) this;
        }

        public Criteria andRdAuditingIsNull() {
            addCriterion("rd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andRdAuditingIsNotNull() {
            addCriterion("rd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andRdAuditingEqualTo(String value) {
            addCriterion("rd_auditing =", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingNotEqualTo(String value) {
            addCriterion("rd_auditing <>", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingGreaterThan(String value) {
            addCriterion("rd_auditing >", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("rd_auditing >=", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingLessThan(String value) {
            addCriterion("rd_auditing <", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingLessThanOrEqualTo(String value) {
            addCriterion("rd_auditing <=", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingLike(String value) {
            addCriterion("rd_auditing like", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingNotLike(String value) {
            addCriterion("rd_auditing not like", value, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingIn(List<String> values) {
            addCriterion("rd_auditing in", values, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingNotIn(List<String> values) {
            addCriterion("rd_auditing not in", values, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingBetween(String value1, String value2) {
            addCriterion("rd_auditing between", value1, value2, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdAuditingNotBetween(String value1, String value2) {
            addCriterion("rd_auditing not between", value1, value2, "rdAuditing");
            return (Criteria) this;
        }

        public Criteria andRdYnIsNull() {
            addCriterion("rd_yn is null");
            return (Criteria) this;
        }

        public Criteria andRdYnIsNotNull() {
            addCriterion("rd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andRdYnEqualTo(String value) {
            addCriterion("rd_yn =", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnNotEqualTo(String value) {
            addCriterion("rd_yn <>", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnGreaterThan(String value) {
            addCriterion("rd_yn >", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnGreaterThanOrEqualTo(String value) {
            addCriterion("rd_yn >=", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnLessThan(String value) {
            addCriterion("rd_yn <", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnLessThanOrEqualTo(String value) {
            addCriterion("rd_yn <=", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnLike(String value) {
            addCriterion("rd_yn like", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnNotLike(String value) {
            addCriterion("rd_yn not like", value, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnIn(List<String> values) {
            addCriterion("rd_yn in", values, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnNotIn(List<String> values) {
            addCriterion("rd_yn not in", values, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnBetween(String value1, String value2) {
            addCriterion("rd_yn between", value1, value2, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdYnNotBetween(String value1, String value2) {
            addCriterion("rd_yn not between", value1, value2, "rdYn");
            return (Criteria) this;
        }

        public Criteria andRdCustom1IsNull() {
            addCriterion("rd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andRdCustom1IsNotNull() {
            addCriterion("rd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andRdCustom1EqualTo(String value) {
            addCriterion("rd_custom1 =", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1NotEqualTo(String value) {
            addCriterion("rd_custom1 <>", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1GreaterThan(String value) {
            addCriterion("rd_custom1 >", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("rd_custom1 >=", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1LessThan(String value) {
            addCriterion("rd_custom1 <", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1LessThanOrEqualTo(String value) {
            addCriterion("rd_custom1 <=", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1Like(String value) {
            addCriterion("rd_custom1 like", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1NotLike(String value) {
            addCriterion("rd_custom1 not like", value, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1In(List<String> values) {
            addCriterion("rd_custom1 in", values, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1NotIn(List<String> values) {
            addCriterion("rd_custom1 not in", values, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1Between(String value1, String value2) {
            addCriterion("rd_custom1 between", value1, value2, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom1NotBetween(String value1, String value2) {
            addCriterion("rd_custom1 not between", value1, value2, "rdCustom1");
            return (Criteria) this;
        }

        public Criteria andRdCustom2IsNull() {
            addCriterion("rd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andRdCustom2IsNotNull() {
            addCriterion("rd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andRdCustom2EqualTo(String value) {
            addCriterion("rd_custom2 =", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2NotEqualTo(String value) {
            addCriterion("rd_custom2 <>", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2GreaterThan(String value) {
            addCriterion("rd_custom2 >", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("rd_custom2 >=", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2LessThan(String value) {
            addCriterion("rd_custom2 <", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2LessThanOrEqualTo(String value) {
            addCriterion("rd_custom2 <=", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2Like(String value) {
            addCriterion("rd_custom2 like", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2NotLike(String value) {
            addCriterion("rd_custom2 not like", value, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2In(List<String> values) {
            addCriterion("rd_custom2 in", values, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2NotIn(List<String> values) {
            addCriterion("rd_custom2 not in", values, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2Between(String value1, String value2) {
            addCriterion("rd_custom2 between", value1, value2, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom2NotBetween(String value1, String value2) {
            addCriterion("rd_custom2 not between", value1, value2, "rdCustom2");
            return (Criteria) this;
        }

        public Criteria andRdCustom3IsNull() {
            addCriterion("rd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andRdCustom3IsNotNull() {
            addCriterion("rd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andRdCustom3EqualTo(String value) {
            addCriterion("rd_custom3 =", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3NotEqualTo(String value) {
            addCriterion("rd_custom3 <>", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3GreaterThan(String value) {
            addCriterion("rd_custom3 >", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("rd_custom3 >=", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3LessThan(String value) {
            addCriterion("rd_custom3 <", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3LessThanOrEqualTo(String value) {
            addCriterion("rd_custom3 <=", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3Like(String value) {
            addCriterion("rd_custom3 like", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3NotLike(String value) {
            addCriterion("rd_custom3 not like", value, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3In(List<String> values) {
            addCriterion("rd_custom3 in", values, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3NotIn(List<String> values) {
            addCriterion("rd_custom3 not in", values, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3Between(String value1, String value2) {
            addCriterion("rd_custom3 between", value1, value2, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom3NotBetween(String value1, String value2) {
            addCriterion("rd_custom3 not between", value1, value2, "rdCustom3");
            return (Criteria) this;
        }

        public Criteria andRdCustom4IsNull() {
            addCriterion("rd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andRdCustom4IsNotNull() {
            addCriterion("rd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andRdCustom4EqualTo(String value) {
            addCriterion("rd_custom4 =", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4NotEqualTo(String value) {
            addCriterion("rd_custom4 <>", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4GreaterThan(String value) {
            addCriterion("rd_custom4 >", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("rd_custom4 >=", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4LessThan(String value) {
            addCriterion("rd_custom4 <", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4LessThanOrEqualTo(String value) {
            addCriterion("rd_custom4 <=", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4Like(String value) {
            addCriterion("rd_custom4 like", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4NotLike(String value) {
            addCriterion("rd_custom4 not like", value, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4In(List<String> values) {
            addCriterion("rd_custom4 in", values, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4NotIn(List<String> values) {
            addCriterion("rd_custom4 not in", values, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4Between(String value1, String value2) {
            addCriterion("rd_custom4 between", value1, value2, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom4NotBetween(String value1, String value2) {
            addCriterion("rd_custom4 not between", value1, value2, "rdCustom4");
            return (Criteria) this;
        }

        public Criteria andRdCustom5IsNull() {
            addCriterion("rd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andRdCustom5IsNotNull() {
            addCriterion("rd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andRdCustom5EqualTo(String value) {
            addCriterion("rd_custom5 =", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5NotEqualTo(String value) {
            addCriterion("rd_custom5 <>", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5GreaterThan(String value) {
            addCriterion("rd_custom5 >", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("rd_custom5 >=", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5LessThan(String value) {
            addCriterion("rd_custom5 <", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5LessThanOrEqualTo(String value) {
            addCriterion("rd_custom5 <=", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5Like(String value) {
            addCriterion("rd_custom5 like", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5NotLike(String value) {
            addCriterion("rd_custom5 not like", value, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5In(List<String> values) {
            addCriterion("rd_custom5 in", values, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5NotIn(List<String> values) {
            addCriterion("rd_custom5 not in", values, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5Between(String value1, String value2) {
            addCriterion("rd_custom5 between", value1, value2, "rdCustom5");
            return (Criteria) this;
        }

        public Criteria andRdCustom5NotBetween(String value1, String value2) {
            addCriterion("rd_custom5 not between", value1, value2, "rdCustom5");
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