package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TaxItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaxItemsExample() {
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

        public Criteria andTiIdIsNull() {
            addCriterion("ti_id is null");
            return (Criteria) this;
        }

        public Criteria andTiIdIsNotNull() {
            addCriterion("ti_id is not null");
            return (Criteria) this;
        }

        public Criteria andTiIdEqualTo(String value) {
            addCriterion("ti_id =", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotEqualTo(String value) {
            addCriterion("ti_id <>", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThan(String value) {
            addCriterion("ti_id >", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThanOrEqualTo(String value) {
            addCriterion("ti_id >=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThan(String value) {
            addCriterion("ti_id <", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThanOrEqualTo(String value) {
            addCriterion("ti_id <=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLike(String value) {
            addCriterion("ti_id like", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotLike(String value) {
            addCriterion("ti_id not like", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdIn(List<String> values) {
            addCriterion("ti_id in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotIn(List<String> values) {
            addCriterion("ti_id not in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdBetween(String value1, String value2) {
            addCriterion("ti_id between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotBetween(String value1, String value2) {
            addCriterion("ti_id not between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiNameIsNull() {
            addCriterion("ti_name is null");
            return (Criteria) this;
        }

        public Criteria andTiNameIsNotNull() {
            addCriterion("ti_name is not null");
            return (Criteria) this;
        }

        public Criteria andTiNameEqualTo(String value) {
            addCriterion("ti_name =", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotEqualTo(String value) {
            addCriterion("ti_name <>", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameGreaterThan(String value) {
            addCriterion("ti_name >", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ti_name >=", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLessThan(String value) {
            addCriterion("ti_name <", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLessThanOrEqualTo(String value) {
            addCriterion("ti_name <=", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameLike(String value) {
            addCriterion("ti_name like", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotLike(String value) {
            addCriterion("ti_name not like", value, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameIn(List<String> values) {
            addCriterion("ti_name in", values, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotIn(List<String> values) {
            addCriterion("ti_name not in", values, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameBetween(String value1, String value2) {
            addCriterion("ti_name between", value1, value2, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiNameNotBetween(String value1, String value2) {
            addCriterion("ti_name not between", value1, value2, "tiName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameIsNull() {
            addCriterion("ti_english_name is null");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameIsNotNull() {
            addCriterion("ti_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameEqualTo(String value) {
            addCriterion("ti_english_name =", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameNotEqualTo(String value) {
            addCriterion("ti_english_name <>", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameGreaterThan(String value) {
            addCriterion("ti_english_name >", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("ti_english_name >=", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameLessThan(String value) {
            addCriterion("ti_english_name <", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("ti_english_name <=", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameLike(String value) {
            addCriterion("ti_english_name like", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameNotLike(String value) {
            addCriterion("ti_english_name not like", value, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameIn(List<String> values) {
            addCriterion("ti_english_name in", values, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameNotIn(List<String> values) {
            addCriterion("ti_english_name not in", values, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameBetween(String value1, String value2) {
            addCriterion("ti_english_name between", value1, value2, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiEnglishNameNotBetween(String value1, String value2) {
            addCriterion("ti_english_name not between", value1, value2, "tiEnglishName");
            return (Criteria) this;
        }

        public Criteria andTiRemarkIsNull() {
            addCriterion("ti_remark is null");
            return (Criteria) this;
        }

        public Criteria andTiRemarkIsNotNull() {
            addCriterion("ti_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTiRemarkEqualTo(String value) {
            addCriterion("ti_remark =", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkNotEqualTo(String value) {
            addCriterion("ti_remark <>", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkGreaterThan(String value) {
            addCriterion("ti_remark >", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ti_remark >=", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkLessThan(String value) {
            addCriterion("ti_remark <", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkLessThanOrEqualTo(String value) {
            addCriterion("ti_remark <=", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkLike(String value) {
            addCriterion("ti_remark like", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkNotLike(String value) {
            addCriterion("ti_remark not like", value, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkIn(List<String> values) {
            addCriterion("ti_remark in", values, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkNotIn(List<String> values) {
            addCriterion("ti_remark not in", values, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkBetween(String value1, String value2) {
            addCriterion("ti_remark between", value1, value2, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiRemarkNotBetween(String value1, String value2) {
            addCriterion("ti_remark not between", value1, value2, "tiRemark");
            return (Criteria) this;
        }

        public Criteria andTiAuditingIsNull() {
            addCriterion("ti_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andTiAuditingIsNotNull() {
            addCriterion("ti_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andTiAuditingEqualTo(String value) {
            addCriterion("ti_Auditing =", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingNotEqualTo(String value) {
            addCriterion("ti_Auditing <>", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingGreaterThan(String value) {
            addCriterion("ti_Auditing >", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ti_Auditing >=", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingLessThan(String value) {
            addCriterion("ti_Auditing <", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingLessThanOrEqualTo(String value) {
            addCriterion("ti_Auditing <=", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingLike(String value) {
            addCriterion("ti_Auditing like", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingNotLike(String value) {
            addCriterion("ti_Auditing not like", value, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingIn(List<String> values) {
            addCriterion("ti_Auditing in", values, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingNotIn(List<String> values) {
            addCriterion("ti_Auditing not in", values, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingBetween(String value1, String value2) {
            addCriterion("ti_Auditing between", value1, value2, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiAuditingNotBetween(String value1, String value2) {
            addCriterion("ti_Auditing not between", value1, value2, "tiAuditing");
            return (Criteria) this;
        }

        public Criteria andTiYnIsNull() {
            addCriterion("ti_yn is null");
            return (Criteria) this;
        }

        public Criteria andTiYnIsNotNull() {
            addCriterion("ti_yn is not null");
            return (Criteria) this;
        }

        public Criteria andTiYnEqualTo(String value) {
            addCriterion("ti_yn =", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnNotEqualTo(String value) {
            addCriterion("ti_yn <>", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnGreaterThan(String value) {
            addCriterion("ti_yn >", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnGreaterThanOrEqualTo(String value) {
            addCriterion("ti_yn >=", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnLessThan(String value) {
            addCriterion("ti_yn <", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnLessThanOrEqualTo(String value) {
            addCriterion("ti_yn <=", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnLike(String value) {
            addCriterion("ti_yn like", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnNotLike(String value) {
            addCriterion("ti_yn not like", value, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnIn(List<String> values) {
            addCriterion("ti_yn in", values, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnNotIn(List<String> values) {
            addCriterion("ti_yn not in", values, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnBetween(String value1, String value2) {
            addCriterion("ti_yn between", value1, value2, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiYnNotBetween(String value1, String value2) {
            addCriterion("ti_yn not between", value1, value2, "tiYn");
            return (Criteria) this;
        }

        public Criteria andTiCustom1IsNull() {
            addCriterion("ti_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom1IsNotNull() {
            addCriterion("ti_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom1EqualTo(String value) {
            addCriterion("ti_custom1 =", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1NotEqualTo(String value) {
            addCriterion("ti_custom1 <>", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1GreaterThan(String value) {
            addCriterion("ti_custom1 >", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom1 >=", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1LessThan(String value) {
            addCriterion("ti_custom1 <", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1LessThanOrEqualTo(String value) {
            addCriterion("ti_custom1 <=", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1Like(String value) {
            addCriterion("ti_custom1 like", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1NotLike(String value) {
            addCriterion("ti_custom1 not like", value, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1In(List<String> values) {
            addCriterion("ti_custom1 in", values, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1NotIn(List<String> values) {
            addCriterion("ti_custom1 not in", values, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1Between(String value1, String value2) {
            addCriterion("ti_custom1 between", value1, value2, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom1NotBetween(String value1, String value2) {
            addCriterion("ti_custom1 not between", value1, value2, "tiCustom1");
            return (Criteria) this;
        }

        public Criteria andTiCustom2IsNull() {
            addCriterion("ti_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom2IsNotNull() {
            addCriterion("ti_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom2EqualTo(String value) {
            addCriterion("ti_custom2 =", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2NotEqualTo(String value) {
            addCriterion("ti_custom2 <>", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2GreaterThan(String value) {
            addCriterion("ti_custom2 >", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom2 >=", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2LessThan(String value) {
            addCriterion("ti_custom2 <", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2LessThanOrEqualTo(String value) {
            addCriterion("ti_custom2 <=", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2Like(String value) {
            addCriterion("ti_custom2 like", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2NotLike(String value) {
            addCriterion("ti_custom2 not like", value, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2In(List<String> values) {
            addCriterion("ti_custom2 in", values, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2NotIn(List<String> values) {
            addCriterion("ti_custom2 not in", values, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2Between(String value1, String value2) {
            addCriterion("ti_custom2 between", value1, value2, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom2NotBetween(String value1, String value2) {
            addCriterion("ti_custom2 not between", value1, value2, "tiCustom2");
            return (Criteria) this;
        }

        public Criteria andTiCustom3IsNull() {
            addCriterion("ti_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom3IsNotNull() {
            addCriterion("ti_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom3EqualTo(String value) {
            addCriterion("ti_custom3 =", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3NotEqualTo(String value) {
            addCriterion("ti_custom3 <>", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3GreaterThan(String value) {
            addCriterion("ti_custom3 >", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom3 >=", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3LessThan(String value) {
            addCriterion("ti_custom3 <", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3LessThanOrEqualTo(String value) {
            addCriterion("ti_custom3 <=", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3Like(String value) {
            addCriterion("ti_custom3 like", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3NotLike(String value) {
            addCriterion("ti_custom3 not like", value, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3In(List<String> values) {
            addCriterion("ti_custom3 in", values, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3NotIn(List<String> values) {
            addCriterion("ti_custom3 not in", values, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3Between(String value1, String value2) {
            addCriterion("ti_custom3 between", value1, value2, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom3NotBetween(String value1, String value2) {
            addCriterion("ti_custom3 not between", value1, value2, "tiCustom3");
            return (Criteria) this;
        }

        public Criteria andTiCustom4IsNull() {
            addCriterion("ti_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom4IsNotNull() {
            addCriterion("ti_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom4EqualTo(String value) {
            addCriterion("ti_custom4 =", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4NotEqualTo(String value) {
            addCriterion("ti_custom4 <>", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4GreaterThan(String value) {
            addCriterion("ti_custom4 >", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom4 >=", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4LessThan(String value) {
            addCriterion("ti_custom4 <", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4LessThanOrEqualTo(String value) {
            addCriterion("ti_custom4 <=", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4Like(String value) {
            addCriterion("ti_custom4 like", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4NotLike(String value) {
            addCriterion("ti_custom4 not like", value, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4In(List<String> values) {
            addCriterion("ti_custom4 in", values, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4NotIn(List<String> values) {
            addCriterion("ti_custom4 not in", values, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4Between(String value1, String value2) {
            addCriterion("ti_custom4 between", value1, value2, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom4NotBetween(String value1, String value2) {
            addCriterion("ti_custom4 not between", value1, value2, "tiCustom4");
            return (Criteria) this;
        }

        public Criteria andTiCustom5IsNull() {
            addCriterion("ti_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom5IsNotNull() {
            addCriterion("ti_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom5EqualTo(String value) {
            addCriterion("ti_custom5 =", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5NotEqualTo(String value) {
            addCriterion("ti_custom5 <>", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5GreaterThan(String value) {
            addCriterion("ti_custom5 >", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom5 >=", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5LessThan(String value) {
            addCriterion("ti_custom5 <", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5LessThanOrEqualTo(String value) {
            addCriterion("ti_custom5 <=", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5Like(String value) {
            addCriterion("ti_custom5 like", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5NotLike(String value) {
            addCriterion("ti_custom5 not like", value, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5In(List<String> values) {
            addCriterion("ti_custom5 in", values, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5NotIn(List<String> values) {
            addCriterion("ti_custom5 not in", values, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5Between(String value1, String value2) {
            addCriterion("ti_custom5 between", value1, value2, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom5NotBetween(String value1, String value2) {
            addCriterion("ti_custom5 not between", value1, value2, "tiCustom5");
            return (Criteria) this;
        }

        public Criteria andTiCustom6IsNull() {
            addCriterion("ti_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andTiCustom6IsNotNull() {
            addCriterion("ti_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andTiCustom6EqualTo(String value) {
            addCriterion("ti_custom6 =", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6NotEqualTo(String value) {
            addCriterion("ti_custom6 <>", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6GreaterThan(String value) {
            addCriterion("ti_custom6 >", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ti_custom6 >=", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6LessThan(String value) {
            addCriterion("ti_custom6 <", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6LessThanOrEqualTo(String value) {
            addCriterion("ti_custom6 <=", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6Like(String value) {
            addCriterion("ti_custom6 like", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6NotLike(String value) {
            addCriterion("ti_custom6 not like", value, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6In(List<String> values) {
            addCriterion("ti_custom6 in", values, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6NotIn(List<String> values) {
            addCriterion("ti_custom6 not in", values, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6Between(String value1, String value2) {
            addCriterion("ti_custom6 between", value1, value2, "tiCustom6");
            return (Criteria) this;
        }

        public Criteria andTiCustom6NotBetween(String value1, String value2) {
            addCriterion("ti_custom6 not between", value1, value2, "tiCustom6");
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