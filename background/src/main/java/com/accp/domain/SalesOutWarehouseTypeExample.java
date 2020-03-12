package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesOutWarehouseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOutWarehouseTypeExample() {
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

        public Criteria andSowtIdIsNull() {
            addCriterion("sowt_id is null");
            return (Criteria) this;
        }

        public Criteria andSowtIdIsNotNull() {
            addCriterion("sowt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSowtIdEqualTo(String value) {
            addCriterion("sowt_id =", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotEqualTo(String value) {
            addCriterion("sowt_id <>", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdGreaterThan(String value) {
            addCriterion("sowt_id >", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_id >=", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLessThan(String value) {
            addCriterion("sowt_id <", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLessThanOrEqualTo(String value) {
            addCriterion("sowt_id <=", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLike(String value) {
            addCriterion("sowt_id like", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotLike(String value) {
            addCriterion("sowt_id not like", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdIn(List<String> values) {
            addCriterion("sowt_id in", values, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotIn(List<String> values) {
            addCriterion("sowt_id not in", values, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdBetween(String value1, String value2) {
            addCriterion("sowt_id between", value1, value2, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotBetween(String value1, String value2) {
            addCriterion("sowt_id not between", value1, value2, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtNameIsNull() {
            addCriterion("sowt_name is null");
            return (Criteria) this;
        }

        public Criteria andSowtNameIsNotNull() {
            addCriterion("sowt_name is not null");
            return (Criteria) this;
        }

        public Criteria andSowtNameEqualTo(String value) {
            addCriterion("sowt_name =", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameNotEqualTo(String value) {
            addCriterion("sowt_name <>", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameGreaterThan(String value) {
            addCriterion("sowt_name >", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_name >=", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameLessThan(String value) {
            addCriterion("sowt_name <", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameLessThanOrEqualTo(String value) {
            addCriterion("sowt_name <=", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameLike(String value) {
            addCriterion("sowt_name like", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameNotLike(String value) {
            addCriterion("sowt_name not like", value, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameIn(List<String> values) {
            addCriterion("sowt_name in", values, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameNotIn(List<String> values) {
            addCriterion("sowt_name not in", values, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameBetween(String value1, String value2) {
            addCriterion("sowt_name between", value1, value2, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtNameNotBetween(String value1, String value2) {
            addCriterion("sowt_name not between", value1, value2, "sowtName");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameIsNull() {
            addCriterion("sowt_engname is null");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameIsNotNull() {
            addCriterion("sowt_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameEqualTo(String value) {
            addCriterion("sowt_engname =", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameNotEqualTo(String value) {
            addCriterion("sowt_engname <>", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameGreaterThan(String value) {
            addCriterion("sowt_engname >", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_engname >=", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameLessThan(String value) {
            addCriterion("sowt_engname <", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameLessThanOrEqualTo(String value) {
            addCriterion("sowt_engname <=", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameLike(String value) {
            addCriterion("sowt_engname like", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameNotLike(String value) {
            addCriterion("sowt_engname not like", value, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameIn(List<String> values) {
            addCriterion("sowt_engname in", values, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameNotIn(List<String> values) {
            addCriterion("sowt_engname not in", values, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameBetween(String value1, String value2) {
            addCriterion("sowt_engname between", value1, value2, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtEngnameNotBetween(String value1, String value2) {
            addCriterion("sowt_engname not between", value1, value2, "sowtEngname");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkIsNull() {
            addCriterion("sowt_remark is null");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkIsNotNull() {
            addCriterion("sowt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkEqualTo(String value) {
            addCriterion("sowt_remark =", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkNotEqualTo(String value) {
            addCriterion("sowt_remark <>", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkGreaterThan(String value) {
            addCriterion("sowt_remark >", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_remark >=", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkLessThan(String value) {
            addCriterion("sowt_remark <", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkLessThanOrEqualTo(String value) {
            addCriterion("sowt_remark <=", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkLike(String value) {
            addCriterion("sowt_remark like", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkNotLike(String value) {
            addCriterion("sowt_remark not like", value, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkIn(List<String> values) {
            addCriterion("sowt_remark in", values, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkNotIn(List<String> values) {
            addCriterion("sowt_remark not in", values, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkBetween(String value1, String value2) {
            addCriterion("sowt_remark between", value1, value2, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtRemarkNotBetween(String value1, String value2) {
            addCriterion("sowt_remark not between", value1, value2, "sowtRemark");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingIsNull() {
            addCriterion("sowt_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingIsNotNull() {
            addCriterion("sowt_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingEqualTo(String value) {
            addCriterion("sowt_auditing =", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingNotEqualTo(String value) {
            addCriterion("sowt_auditing <>", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingGreaterThan(String value) {
            addCriterion("sowt_auditing >", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_auditing >=", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingLessThan(String value) {
            addCriterion("sowt_auditing <", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingLessThanOrEqualTo(String value) {
            addCriterion("sowt_auditing <=", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingLike(String value) {
            addCriterion("sowt_auditing like", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingNotLike(String value) {
            addCriterion("sowt_auditing not like", value, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingIn(List<String> values) {
            addCriterion("sowt_auditing in", values, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingNotIn(List<String> values) {
            addCriterion("sowt_auditing not in", values, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingBetween(String value1, String value2) {
            addCriterion("sowt_auditing between", value1, value2, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtAuditingNotBetween(String value1, String value2) {
            addCriterion("sowt_auditing not between", value1, value2, "sowtAuditing");
            return (Criteria) this;
        }

        public Criteria andSowtYnIsNull() {
            addCriterion("sowt_yn is null");
            return (Criteria) this;
        }

        public Criteria andSowtYnIsNotNull() {
            addCriterion("sowt_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSowtYnEqualTo(String value) {
            addCriterion("sowt_yn =", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnNotEqualTo(String value) {
            addCriterion("sowt_yn <>", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnGreaterThan(String value) {
            addCriterion("sowt_yn >", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_yn >=", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnLessThan(String value) {
            addCriterion("sowt_yn <", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnLessThanOrEqualTo(String value) {
            addCriterion("sowt_yn <=", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnLike(String value) {
            addCriterion("sowt_yn like", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnNotLike(String value) {
            addCriterion("sowt_yn not like", value, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnIn(List<String> values) {
            addCriterion("sowt_yn in", values, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnNotIn(List<String> values) {
            addCriterion("sowt_yn not in", values, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnBetween(String value1, String value2) {
            addCriterion("sowt_yn between", value1, value2, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtYnNotBetween(String value1, String value2) {
            addCriterion("sowt_yn not between", value1, value2, "sowtYn");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1IsNull() {
            addCriterion("sowt_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1IsNotNull() {
            addCriterion("sowt_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1EqualTo(String value) {
            addCriterion("sowt_custom1 =", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1NotEqualTo(String value) {
            addCriterion("sowt_custom1 <>", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1GreaterThan(String value) {
            addCriterion("sowt_custom1 >", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom1 >=", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1LessThan(String value) {
            addCriterion("sowt_custom1 <", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom1 <=", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1Like(String value) {
            addCriterion("sowt_custom1 like", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1NotLike(String value) {
            addCriterion("sowt_custom1 not like", value, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1In(List<String> values) {
            addCriterion("sowt_custom1 in", values, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1NotIn(List<String> values) {
            addCriterion("sowt_custom1 not in", values, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1Between(String value1, String value2) {
            addCriterion("sowt_custom1 between", value1, value2, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom1NotBetween(String value1, String value2) {
            addCriterion("sowt_custom1 not between", value1, value2, "sowtCustom1");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2IsNull() {
            addCriterion("sowt_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2IsNotNull() {
            addCriterion("sowt_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2EqualTo(String value) {
            addCriterion("sowt_custom2 =", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2NotEqualTo(String value) {
            addCriterion("sowt_custom2 <>", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2GreaterThan(String value) {
            addCriterion("sowt_custom2 >", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom2 >=", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2LessThan(String value) {
            addCriterion("sowt_custom2 <", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom2 <=", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2Like(String value) {
            addCriterion("sowt_custom2 like", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2NotLike(String value) {
            addCriterion("sowt_custom2 not like", value, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2In(List<String> values) {
            addCriterion("sowt_custom2 in", values, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2NotIn(List<String> values) {
            addCriterion("sowt_custom2 not in", values, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2Between(String value1, String value2) {
            addCriterion("sowt_custom2 between", value1, value2, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom2NotBetween(String value1, String value2) {
            addCriterion("sowt_custom2 not between", value1, value2, "sowtCustom2");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3IsNull() {
            addCriterion("sowt_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3IsNotNull() {
            addCriterion("sowt_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3EqualTo(String value) {
            addCriterion("sowt_custom3 =", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3NotEqualTo(String value) {
            addCriterion("sowt_custom3 <>", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3GreaterThan(String value) {
            addCriterion("sowt_custom3 >", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom3 >=", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3LessThan(String value) {
            addCriterion("sowt_custom3 <", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom3 <=", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3Like(String value) {
            addCriterion("sowt_custom3 like", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3NotLike(String value) {
            addCriterion("sowt_custom3 not like", value, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3In(List<String> values) {
            addCriterion("sowt_custom3 in", values, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3NotIn(List<String> values) {
            addCriterion("sowt_custom3 not in", values, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3Between(String value1, String value2) {
            addCriterion("sowt_custom3 between", value1, value2, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom3NotBetween(String value1, String value2) {
            addCriterion("sowt_custom3 not between", value1, value2, "sowtCustom3");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4IsNull() {
            addCriterion("sowt_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4IsNotNull() {
            addCriterion("sowt_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4EqualTo(String value) {
            addCriterion("sowt_custom4 =", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4NotEqualTo(String value) {
            addCriterion("sowt_custom4 <>", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4GreaterThan(String value) {
            addCriterion("sowt_custom4 >", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom4 >=", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4LessThan(String value) {
            addCriterion("sowt_custom4 <", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom4 <=", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4Like(String value) {
            addCriterion("sowt_custom4 like", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4NotLike(String value) {
            addCriterion("sowt_custom4 not like", value, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4In(List<String> values) {
            addCriterion("sowt_custom4 in", values, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4NotIn(List<String> values) {
            addCriterion("sowt_custom4 not in", values, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4Between(String value1, String value2) {
            addCriterion("sowt_custom4 between", value1, value2, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom4NotBetween(String value1, String value2) {
            addCriterion("sowt_custom4 not between", value1, value2, "sowtCustom4");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5IsNull() {
            addCriterion("sowt_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5IsNotNull() {
            addCriterion("sowt_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5EqualTo(String value) {
            addCriterion("sowt_custom5 =", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5NotEqualTo(String value) {
            addCriterion("sowt_custom5 <>", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5GreaterThan(String value) {
            addCriterion("sowt_custom5 >", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom5 >=", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5LessThan(String value) {
            addCriterion("sowt_custom5 <", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom5 <=", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5Like(String value) {
            addCriterion("sowt_custom5 like", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5NotLike(String value) {
            addCriterion("sowt_custom5 not like", value, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5In(List<String> values) {
            addCriterion("sowt_custom5 in", values, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5NotIn(List<String> values) {
            addCriterion("sowt_custom5 not in", values, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5Between(String value1, String value2) {
            addCriterion("sowt_custom5 between", value1, value2, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom5NotBetween(String value1, String value2) {
            addCriterion("sowt_custom5 not between", value1, value2, "sowtCustom5");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6IsNull() {
            addCriterion("sowt_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6IsNotNull() {
            addCriterion("sowt_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6EqualTo(String value) {
            addCriterion("sowt_custom6 =", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6NotEqualTo(String value) {
            addCriterion("sowt_custom6 <>", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6GreaterThan(String value) {
            addCriterion("sowt_custom6 >", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sowt_custom6 >=", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6LessThan(String value) {
            addCriterion("sowt_custom6 <", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6LessThanOrEqualTo(String value) {
            addCriterion("sowt_custom6 <=", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6Like(String value) {
            addCriterion("sowt_custom6 like", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6NotLike(String value) {
            addCriterion("sowt_custom6 not like", value, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6In(List<String> values) {
            addCriterion("sowt_custom6 in", values, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6NotIn(List<String> values) {
            addCriterion("sowt_custom6 not in", values, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6Between(String value1, String value2) {
            addCriterion("sowt_custom6 between", value1, value2, "sowtCustom6");
            return (Criteria) this;
        }

        public Criteria andSowtCustom6NotBetween(String value1, String value2) {
            addCriterion("sowt_custom6 not between", value1, value2, "sowtCustom6");
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