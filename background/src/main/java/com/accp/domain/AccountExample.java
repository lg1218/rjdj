package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameIsNull() {
            addCriterion("account_invoicetypename is null");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameIsNotNull() {
            addCriterion("account_invoicetypename is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameEqualTo(String value) {
            addCriterion("account_invoicetypename =", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameNotEqualTo(String value) {
            addCriterion("account_invoicetypename <>", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameGreaterThan(String value) {
            addCriterion("account_invoicetypename >", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("account_invoicetypename >=", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameLessThan(String value) {
            addCriterion("account_invoicetypename <", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameLessThanOrEqualTo(String value) {
            addCriterion("account_invoicetypename <=", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameLike(String value) {
            addCriterion("account_invoicetypename like", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameNotLike(String value) {
            addCriterion("account_invoicetypename not like", value, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameIn(List<String> values) {
            addCriterion("account_invoicetypename in", values, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameNotIn(List<String> values) {
            addCriterion("account_invoicetypename not in", values, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameBetween(String value1, String value2) {
            addCriterion("account_invoicetypename between", value1, value2, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountInvoicetypenameNotBetween(String value1, String value2) {
            addCriterion("account_invoicetypename not between", value1, value2, "accountInvoicetypename");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameIsNull() {
            addCriterion("account_engname is null");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameIsNotNull() {
            addCriterion("account_engname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameEqualTo(String value) {
            addCriterion("account_engname =", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameNotEqualTo(String value) {
            addCriterion("account_engname <>", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameGreaterThan(String value) {
            addCriterion("account_engname >", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("account_engname >=", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameLessThan(String value) {
            addCriterion("account_engname <", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameLessThanOrEqualTo(String value) {
            addCriterion("account_engname <=", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameLike(String value) {
            addCriterion("account_engname like", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameNotLike(String value) {
            addCriterion("account_engname not like", value, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameIn(List<String> values) {
            addCriterion("account_engname in", values, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameNotIn(List<String> values) {
            addCriterion("account_engname not in", values, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameBetween(String value1, String value2) {
            addCriterion("account_engname between", value1, value2, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountEngnameNotBetween(String value1, String value2) {
            addCriterion("account_engname not between", value1, value2, "accountEngname");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIsNull() {
            addCriterion("account_remark is null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIsNotNull() {
            addCriterion("account_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkEqualTo(String value) {
            addCriterion("account_remark =", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotEqualTo(String value) {
            addCriterion("account_remark <>", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkGreaterThan(String value) {
            addCriterion("account_remark >", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("account_remark >=", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLessThan(String value) {
            addCriterion("account_remark <", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLessThanOrEqualTo(String value) {
            addCriterion("account_remark <=", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLike(String value) {
            addCriterion("account_remark like", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotLike(String value) {
            addCriterion("account_remark not like", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIn(List<String> values) {
            addCriterion("account_remark in", values, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotIn(List<String> values) {
            addCriterion("account_remark not in", values, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkBetween(String value1, String value2) {
            addCriterion("account_remark between", value1, value2, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotBetween(String value1, String value2) {
            addCriterion("account_remark not between", value1, value2, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingIsNull() {
            addCriterion("account_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingIsNotNull() {
            addCriterion("account_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingEqualTo(String value) {
            addCriterion("account_Auditing =", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingNotEqualTo(String value) {
            addCriterion("account_Auditing <>", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingGreaterThan(String value) {
            addCriterion("account_Auditing >", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("account_Auditing >=", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingLessThan(String value) {
            addCriterion("account_Auditing <", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingLessThanOrEqualTo(String value) {
            addCriterion("account_Auditing <=", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingLike(String value) {
            addCriterion("account_Auditing like", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingNotLike(String value) {
            addCriterion("account_Auditing not like", value, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingIn(List<String> values) {
            addCriterion("account_Auditing in", values, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingNotIn(List<String> values) {
            addCriterion("account_Auditing not in", values, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingBetween(String value1, String value2) {
            addCriterion("account_Auditing between", value1, value2, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountAuditingNotBetween(String value1, String value2) {
            addCriterion("account_Auditing not between", value1, value2, "accountAuditing");
            return (Criteria) this;
        }

        public Criteria andAccountYnIsNull() {
            addCriterion("account_yn is null");
            return (Criteria) this;
        }

        public Criteria andAccountYnIsNotNull() {
            addCriterion("account_yn is not null");
            return (Criteria) this;
        }

        public Criteria andAccountYnEqualTo(String value) {
            addCriterion("account_yn =", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnNotEqualTo(String value) {
            addCriterion("account_yn <>", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnGreaterThan(String value) {
            addCriterion("account_yn >", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnGreaterThanOrEqualTo(String value) {
            addCriterion("account_yn >=", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnLessThan(String value) {
            addCriterion("account_yn <", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnLessThanOrEqualTo(String value) {
            addCriterion("account_yn <=", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnLike(String value) {
            addCriterion("account_yn like", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnNotLike(String value) {
            addCriterion("account_yn not like", value, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnIn(List<String> values) {
            addCriterion("account_yn in", values, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnNotIn(List<String> values) {
            addCriterion("account_yn not in", values, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnBetween(String value1, String value2) {
            addCriterion("account_yn between", value1, value2, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountYnNotBetween(String value1, String value2) {
            addCriterion("account_yn not between", value1, value2, "accountYn");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1IsNull() {
            addCriterion("account_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1IsNotNull() {
            addCriterion("account_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1EqualTo(String value) {
            addCriterion("account_custom1 =", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1NotEqualTo(String value) {
            addCriterion("account_custom1 <>", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1GreaterThan(String value) {
            addCriterion("account_custom1 >", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom1 >=", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1LessThan(String value) {
            addCriterion("account_custom1 <", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1LessThanOrEqualTo(String value) {
            addCriterion("account_custom1 <=", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1Like(String value) {
            addCriterion("account_custom1 like", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1NotLike(String value) {
            addCriterion("account_custom1 not like", value, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1In(List<String> values) {
            addCriterion("account_custom1 in", values, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1NotIn(List<String> values) {
            addCriterion("account_custom1 not in", values, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1Between(String value1, String value2) {
            addCriterion("account_custom1 between", value1, value2, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom1NotBetween(String value1, String value2) {
            addCriterion("account_custom1 not between", value1, value2, "accountCustom1");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2IsNull() {
            addCriterion("account_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2IsNotNull() {
            addCriterion("account_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2EqualTo(String value) {
            addCriterion("account_custom2 =", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2NotEqualTo(String value) {
            addCriterion("account_custom2 <>", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2GreaterThan(String value) {
            addCriterion("account_custom2 >", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom2 >=", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2LessThan(String value) {
            addCriterion("account_custom2 <", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2LessThanOrEqualTo(String value) {
            addCriterion("account_custom2 <=", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2Like(String value) {
            addCriterion("account_custom2 like", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2NotLike(String value) {
            addCriterion("account_custom2 not like", value, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2In(List<String> values) {
            addCriterion("account_custom2 in", values, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2NotIn(List<String> values) {
            addCriterion("account_custom2 not in", values, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2Between(String value1, String value2) {
            addCriterion("account_custom2 between", value1, value2, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom2NotBetween(String value1, String value2) {
            addCriterion("account_custom2 not between", value1, value2, "accountCustom2");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3IsNull() {
            addCriterion("account_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3IsNotNull() {
            addCriterion("account_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3EqualTo(String value) {
            addCriterion("account_custom3 =", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3NotEqualTo(String value) {
            addCriterion("account_custom3 <>", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3GreaterThan(String value) {
            addCriterion("account_custom3 >", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom3 >=", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3LessThan(String value) {
            addCriterion("account_custom3 <", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3LessThanOrEqualTo(String value) {
            addCriterion("account_custom3 <=", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3Like(String value) {
            addCriterion("account_custom3 like", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3NotLike(String value) {
            addCriterion("account_custom3 not like", value, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3In(List<String> values) {
            addCriterion("account_custom3 in", values, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3NotIn(List<String> values) {
            addCriterion("account_custom3 not in", values, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3Between(String value1, String value2) {
            addCriterion("account_custom3 between", value1, value2, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom3NotBetween(String value1, String value2) {
            addCriterion("account_custom3 not between", value1, value2, "accountCustom3");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4IsNull() {
            addCriterion("account_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4IsNotNull() {
            addCriterion("account_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4EqualTo(String value) {
            addCriterion("account_custom4 =", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4NotEqualTo(String value) {
            addCriterion("account_custom4 <>", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4GreaterThan(String value) {
            addCriterion("account_custom4 >", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom4 >=", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4LessThan(String value) {
            addCriterion("account_custom4 <", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4LessThanOrEqualTo(String value) {
            addCriterion("account_custom4 <=", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4Like(String value) {
            addCriterion("account_custom4 like", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4NotLike(String value) {
            addCriterion("account_custom4 not like", value, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4In(List<String> values) {
            addCriterion("account_custom4 in", values, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4NotIn(List<String> values) {
            addCriterion("account_custom4 not in", values, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4Between(String value1, String value2) {
            addCriterion("account_custom4 between", value1, value2, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom4NotBetween(String value1, String value2) {
            addCriterion("account_custom4 not between", value1, value2, "accountCustom4");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5IsNull() {
            addCriterion("account_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5IsNotNull() {
            addCriterion("account_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5EqualTo(String value) {
            addCriterion("account_custom5 =", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5NotEqualTo(String value) {
            addCriterion("account_custom5 <>", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5GreaterThan(String value) {
            addCriterion("account_custom5 >", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom5 >=", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5LessThan(String value) {
            addCriterion("account_custom5 <", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5LessThanOrEqualTo(String value) {
            addCriterion("account_custom5 <=", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5Like(String value) {
            addCriterion("account_custom5 like", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5NotLike(String value) {
            addCriterion("account_custom5 not like", value, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5In(List<String> values) {
            addCriterion("account_custom5 in", values, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5NotIn(List<String> values) {
            addCriterion("account_custom5 not in", values, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5Between(String value1, String value2) {
            addCriterion("account_custom5 between", value1, value2, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom5NotBetween(String value1, String value2) {
            addCriterion("account_custom5 not between", value1, value2, "accountCustom5");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6IsNull() {
            addCriterion("account_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6IsNotNull() {
            addCriterion("account_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6EqualTo(String value) {
            addCriterion("account_custom6 =", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6NotEqualTo(String value) {
            addCriterion("account_custom6 <>", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6GreaterThan(String value) {
            addCriterion("account_custom6 >", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("account_custom6 >=", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6LessThan(String value) {
            addCriterion("account_custom6 <", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6LessThanOrEqualTo(String value) {
            addCriterion("account_custom6 <=", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6Like(String value) {
            addCriterion("account_custom6 like", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6NotLike(String value) {
            addCriterion("account_custom6 not like", value, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6In(List<String> values) {
            addCriterion("account_custom6 in", values, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6NotIn(List<String> values) {
            addCriterion("account_custom6 not in", values, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6Between(String value1, String value2) {
            addCriterion("account_custom6 between", value1, value2, "accountCustom6");
            return (Criteria) this;
        }

        public Criteria andAccountCustom6NotBetween(String value1, String value2) {
            addCriterion("account_custom6 not between", value1, value2, "accountCustom6");
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