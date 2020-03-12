package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SupplierTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierTypeExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(String value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(String value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(String value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(String value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(String value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(String value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLike(String value) {
            addCriterion("st_id like", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotLike(String value) {
            addCriterion("st_id not like", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<String> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<String> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(String value1, String value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(String value1, String value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStEngnameIsNull() {
            addCriterion("st_engname is null");
            return (Criteria) this;
        }

        public Criteria andStEngnameIsNotNull() {
            addCriterion("st_engname is not null");
            return (Criteria) this;
        }

        public Criteria andStEngnameEqualTo(String value) {
            addCriterion("st_engname =", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameNotEqualTo(String value) {
            addCriterion("st_engname <>", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameGreaterThan(String value) {
            addCriterion("st_engname >", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("st_engname >=", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameLessThan(String value) {
            addCriterion("st_engname <", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameLessThanOrEqualTo(String value) {
            addCriterion("st_engname <=", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameLike(String value) {
            addCriterion("st_engname like", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameNotLike(String value) {
            addCriterion("st_engname not like", value, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameIn(List<String> values) {
            addCriterion("st_engname in", values, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameNotIn(List<String> values) {
            addCriterion("st_engname not in", values, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameBetween(String value1, String value2) {
            addCriterion("st_engname between", value1, value2, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStEngnameNotBetween(String value1, String value2) {
            addCriterion("st_engname not between", value1, value2, "stEngname");
            return (Criteria) this;
        }

        public Criteria andStRemarkIsNull() {
            addCriterion("st_remark is null");
            return (Criteria) this;
        }

        public Criteria andStRemarkIsNotNull() {
            addCriterion("st_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStRemarkEqualTo(String value) {
            addCriterion("st_remark =", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkNotEqualTo(String value) {
            addCriterion("st_remark <>", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkGreaterThan(String value) {
            addCriterion("st_remark >", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("st_remark >=", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkLessThan(String value) {
            addCriterion("st_remark <", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkLessThanOrEqualTo(String value) {
            addCriterion("st_remark <=", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkLike(String value) {
            addCriterion("st_remark like", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkNotLike(String value) {
            addCriterion("st_remark not like", value, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkIn(List<String> values) {
            addCriterion("st_remark in", values, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkNotIn(List<String> values) {
            addCriterion("st_remark not in", values, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkBetween(String value1, String value2) {
            addCriterion("st_remark between", value1, value2, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStRemarkNotBetween(String value1, String value2) {
            addCriterion("st_remark not between", value1, value2, "stRemark");
            return (Criteria) this;
        }

        public Criteria andStAuditingIsNull() {
            addCriterion("st_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andStAuditingIsNotNull() {
            addCriterion("st_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andStAuditingEqualTo(String value) {
            addCriterion("st_Auditing =", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingNotEqualTo(String value) {
            addCriterion("st_Auditing <>", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingGreaterThan(String value) {
            addCriterion("st_Auditing >", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("st_Auditing >=", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingLessThan(String value) {
            addCriterion("st_Auditing <", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingLessThanOrEqualTo(String value) {
            addCriterion("st_Auditing <=", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingLike(String value) {
            addCriterion("st_Auditing like", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingNotLike(String value) {
            addCriterion("st_Auditing not like", value, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingIn(List<String> values) {
            addCriterion("st_Auditing in", values, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingNotIn(List<String> values) {
            addCriterion("st_Auditing not in", values, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingBetween(String value1, String value2) {
            addCriterion("st_Auditing between", value1, value2, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStAuditingNotBetween(String value1, String value2) {
            addCriterion("st_Auditing not between", value1, value2, "stAuditing");
            return (Criteria) this;
        }

        public Criteria andStYnIsNull() {
            addCriterion("st_yn is null");
            return (Criteria) this;
        }

        public Criteria andStYnIsNotNull() {
            addCriterion("st_yn is not null");
            return (Criteria) this;
        }

        public Criteria andStYnEqualTo(String value) {
            addCriterion("st_yn =", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnNotEqualTo(String value) {
            addCriterion("st_yn <>", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnGreaterThan(String value) {
            addCriterion("st_yn >", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnGreaterThanOrEqualTo(String value) {
            addCriterion("st_yn >=", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnLessThan(String value) {
            addCriterion("st_yn <", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnLessThanOrEqualTo(String value) {
            addCriterion("st_yn <=", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnLike(String value) {
            addCriterion("st_yn like", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnNotLike(String value) {
            addCriterion("st_yn not like", value, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnIn(List<String> values) {
            addCriterion("st_yn in", values, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnNotIn(List<String> values) {
            addCriterion("st_yn not in", values, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnBetween(String value1, String value2) {
            addCriterion("st_yn between", value1, value2, "stYn");
            return (Criteria) this;
        }

        public Criteria andStYnNotBetween(String value1, String value2) {
            addCriterion("st_yn not between", value1, value2, "stYn");
            return (Criteria) this;
        }

        public Criteria andStCustom1IsNull() {
            addCriterion("st_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom1IsNotNull() {
            addCriterion("st_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom1EqualTo(String value) {
            addCriterion("st_custom1 =", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1NotEqualTo(String value) {
            addCriterion("st_custom1 <>", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1GreaterThan(String value) {
            addCriterion("st_custom1 >", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom1 >=", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1LessThan(String value) {
            addCriterion("st_custom1 <", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1LessThanOrEqualTo(String value) {
            addCriterion("st_custom1 <=", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1Like(String value) {
            addCriterion("st_custom1 like", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1NotLike(String value) {
            addCriterion("st_custom1 not like", value, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1In(List<String> values) {
            addCriterion("st_custom1 in", values, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1NotIn(List<String> values) {
            addCriterion("st_custom1 not in", values, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1Between(String value1, String value2) {
            addCriterion("st_custom1 between", value1, value2, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom1NotBetween(String value1, String value2) {
            addCriterion("st_custom1 not between", value1, value2, "stCustom1");
            return (Criteria) this;
        }

        public Criteria andStCustom2IsNull() {
            addCriterion("st_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom2IsNotNull() {
            addCriterion("st_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom2EqualTo(String value) {
            addCriterion("st_custom2 =", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2NotEqualTo(String value) {
            addCriterion("st_custom2 <>", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2GreaterThan(String value) {
            addCriterion("st_custom2 >", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom2 >=", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2LessThan(String value) {
            addCriterion("st_custom2 <", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2LessThanOrEqualTo(String value) {
            addCriterion("st_custom2 <=", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2Like(String value) {
            addCriterion("st_custom2 like", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2NotLike(String value) {
            addCriterion("st_custom2 not like", value, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2In(List<String> values) {
            addCriterion("st_custom2 in", values, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2NotIn(List<String> values) {
            addCriterion("st_custom2 not in", values, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2Between(String value1, String value2) {
            addCriterion("st_custom2 between", value1, value2, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom2NotBetween(String value1, String value2) {
            addCriterion("st_custom2 not between", value1, value2, "stCustom2");
            return (Criteria) this;
        }

        public Criteria andStCustom3IsNull() {
            addCriterion("st_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom3IsNotNull() {
            addCriterion("st_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom3EqualTo(String value) {
            addCriterion("st_custom3 =", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3NotEqualTo(String value) {
            addCriterion("st_custom3 <>", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3GreaterThan(String value) {
            addCriterion("st_custom3 >", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom3 >=", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3LessThan(String value) {
            addCriterion("st_custom3 <", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3LessThanOrEqualTo(String value) {
            addCriterion("st_custom3 <=", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3Like(String value) {
            addCriterion("st_custom3 like", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3NotLike(String value) {
            addCriterion("st_custom3 not like", value, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3In(List<String> values) {
            addCriterion("st_custom3 in", values, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3NotIn(List<String> values) {
            addCriterion("st_custom3 not in", values, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3Between(String value1, String value2) {
            addCriterion("st_custom3 between", value1, value2, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom3NotBetween(String value1, String value2) {
            addCriterion("st_custom3 not between", value1, value2, "stCustom3");
            return (Criteria) this;
        }

        public Criteria andStCustom4IsNull() {
            addCriterion("st_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom4IsNotNull() {
            addCriterion("st_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom4EqualTo(String value) {
            addCriterion("st_custom4 =", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4NotEqualTo(String value) {
            addCriterion("st_custom4 <>", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4GreaterThan(String value) {
            addCriterion("st_custom4 >", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom4 >=", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4LessThan(String value) {
            addCriterion("st_custom4 <", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4LessThanOrEqualTo(String value) {
            addCriterion("st_custom4 <=", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4Like(String value) {
            addCriterion("st_custom4 like", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4NotLike(String value) {
            addCriterion("st_custom4 not like", value, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4In(List<String> values) {
            addCriterion("st_custom4 in", values, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4NotIn(List<String> values) {
            addCriterion("st_custom4 not in", values, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4Between(String value1, String value2) {
            addCriterion("st_custom4 between", value1, value2, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom4NotBetween(String value1, String value2) {
            addCriterion("st_custom4 not between", value1, value2, "stCustom4");
            return (Criteria) this;
        }

        public Criteria andStCustom5IsNull() {
            addCriterion("st_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom5IsNotNull() {
            addCriterion("st_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom5EqualTo(String value) {
            addCriterion("st_custom5 =", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5NotEqualTo(String value) {
            addCriterion("st_custom5 <>", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5GreaterThan(String value) {
            addCriterion("st_custom5 >", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom5 >=", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5LessThan(String value) {
            addCriterion("st_custom5 <", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5LessThanOrEqualTo(String value) {
            addCriterion("st_custom5 <=", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5Like(String value) {
            addCriterion("st_custom5 like", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5NotLike(String value) {
            addCriterion("st_custom5 not like", value, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5In(List<String> values) {
            addCriterion("st_custom5 in", values, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5NotIn(List<String> values) {
            addCriterion("st_custom5 not in", values, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5Between(String value1, String value2) {
            addCriterion("st_custom5 between", value1, value2, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom5NotBetween(String value1, String value2) {
            addCriterion("st_custom5 not between", value1, value2, "stCustom5");
            return (Criteria) this;
        }

        public Criteria andStCustom6IsNull() {
            addCriterion("st_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andStCustom6IsNotNull() {
            addCriterion("st_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andStCustom6EqualTo(String value) {
            addCriterion("st_custom6 =", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6NotEqualTo(String value) {
            addCriterion("st_custom6 <>", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6GreaterThan(String value) {
            addCriterion("st_custom6 >", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("st_custom6 >=", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6LessThan(String value) {
            addCriterion("st_custom6 <", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6LessThanOrEqualTo(String value) {
            addCriterion("st_custom6 <=", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6Like(String value) {
            addCriterion("st_custom6 like", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6NotLike(String value) {
            addCriterion("st_custom6 not like", value, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6In(List<String> values) {
            addCriterion("st_custom6 in", values, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6NotIn(List<String> values) {
            addCriterion("st_custom6 not in", values, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6Between(String value1, String value2) {
            addCriterion("st_custom6 between", value1, value2, "stCustom6");
            return (Criteria) this;
        }

        public Criteria andStCustom6NotBetween(String value1, String value2) {
            addCriterion("st_custom6 not between", value1, value2, "stCustom6");
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