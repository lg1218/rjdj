package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ZoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZoneExample() {
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

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(String value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(String value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(String value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(String value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(String value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLike(String value) {
            addCriterion("zone_id like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotLike(String value) {
            addCriterion("zone_id not like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<String> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<String> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(String value1, String value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(String value1, String value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameIsNull() {
            addCriterion("zone_english_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameIsNotNull() {
            addCriterion("zone_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameEqualTo(String value) {
            addCriterion("zone_english_name =", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameNotEqualTo(String value) {
            addCriterion("zone_english_name <>", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameGreaterThan(String value) {
            addCriterion("zone_english_name >", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_english_name >=", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameLessThan(String value) {
            addCriterion("zone_english_name <", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("zone_english_name <=", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameLike(String value) {
            addCriterion("zone_english_name like", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameNotLike(String value) {
            addCriterion("zone_english_name not like", value, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameIn(List<String> values) {
            addCriterion("zone_english_name in", values, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameNotIn(List<String> values) {
            addCriterion("zone_english_name not in", values, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameBetween(String value1, String value2) {
            addCriterion("zone_english_name between", value1, value2, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneEnglishNameNotBetween(String value1, String value2) {
            addCriterion("zone_english_name not between", value1, value2, "zoneEnglishName");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkIsNull() {
            addCriterion("zone_remark is null");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkIsNotNull() {
            addCriterion("zone_remark is not null");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkEqualTo(String value) {
            addCriterion("zone_remark =", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkNotEqualTo(String value) {
            addCriterion("zone_remark <>", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkGreaterThan(String value) {
            addCriterion("zone_remark >", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("zone_remark >=", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkLessThan(String value) {
            addCriterion("zone_remark <", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkLessThanOrEqualTo(String value) {
            addCriterion("zone_remark <=", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkLike(String value) {
            addCriterion("zone_remark like", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkNotLike(String value) {
            addCriterion("zone_remark not like", value, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkIn(List<String> values) {
            addCriterion("zone_remark in", values, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkNotIn(List<String> values) {
            addCriterion("zone_remark not in", values, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkBetween(String value1, String value2) {
            addCriterion("zone_remark between", value1, value2, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneRemarkNotBetween(String value1, String value2) {
            addCriterion("zone_remark not between", value1, value2, "zoneRemark");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingIsNull() {
            addCriterion("zone_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingIsNotNull() {
            addCriterion("zone_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingEqualTo(String value) {
            addCriterion("zone_Auditing =", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingNotEqualTo(String value) {
            addCriterion("zone_Auditing <>", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingGreaterThan(String value) {
            addCriterion("zone_Auditing >", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("zone_Auditing >=", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingLessThan(String value) {
            addCriterion("zone_Auditing <", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingLessThanOrEqualTo(String value) {
            addCriterion("zone_Auditing <=", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingLike(String value) {
            addCriterion("zone_Auditing like", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingNotLike(String value) {
            addCriterion("zone_Auditing not like", value, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingIn(List<String> values) {
            addCriterion("zone_Auditing in", values, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingNotIn(List<String> values) {
            addCriterion("zone_Auditing not in", values, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingBetween(String value1, String value2) {
            addCriterion("zone_Auditing between", value1, value2, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneAuditingNotBetween(String value1, String value2) {
            addCriterion("zone_Auditing not between", value1, value2, "zoneAuditing");
            return (Criteria) this;
        }

        public Criteria andZoneYnIsNull() {
            addCriterion("zone_yn is null");
            return (Criteria) this;
        }

        public Criteria andZoneYnIsNotNull() {
            addCriterion("zone_yn is not null");
            return (Criteria) this;
        }

        public Criteria andZoneYnEqualTo(String value) {
            addCriterion("zone_yn =", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnNotEqualTo(String value) {
            addCriterion("zone_yn <>", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnGreaterThan(String value) {
            addCriterion("zone_yn >", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnGreaterThanOrEqualTo(String value) {
            addCriterion("zone_yn >=", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnLessThan(String value) {
            addCriterion("zone_yn <", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnLessThanOrEqualTo(String value) {
            addCriterion("zone_yn <=", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnLike(String value) {
            addCriterion("zone_yn like", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnNotLike(String value) {
            addCriterion("zone_yn not like", value, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnIn(List<String> values) {
            addCriterion("zone_yn in", values, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnNotIn(List<String> values) {
            addCriterion("zone_yn not in", values, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnBetween(String value1, String value2) {
            addCriterion("zone_yn between", value1, value2, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneYnNotBetween(String value1, String value2) {
            addCriterion("zone_yn not between", value1, value2, "zoneYn");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1IsNull() {
            addCriterion("zone_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1IsNotNull() {
            addCriterion("zone_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1EqualTo(String value) {
            addCriterion("zone_custom1 =", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1NotEqualTo(String value) {
            addCriterion("zone_custom1 <>", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1GreaterThan(String value) {
            addCriterion("zone_custom1 >", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom1 >=", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1LessThan(String value) {
            addCriterion("zone_custom1 <", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1LessThanOrEqualTo(String value) {
            addCriterion("zone_custom1 <=", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1Like(String value) {
            addCriterion("zone_custom1 like", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1NotLike(String value) {
            addCriterion("zone_custom1 not like", value, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1In(List<String> values) {
            addCriterion("zone_custom1 in", values, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1NotIn(List<String> values) {
            addCriterion("zone_custom1 not in", values, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1Between(String value1, String value2) {
            addCriterion("zone_custom1 between", value1, value2, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom1NotBetween(String value1, String value2) {
            addCriterion("zone_custom1 not between", value1, value2, "zoneCustom1");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2IsNull() {
            addCriterion("zone_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2IsNotNull() {
            addCriterion("zone_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2EqualTo(String value) {
            addCriterion("zone_custom2 =", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2NotEqualTo(String value) {
            addCriterion("zone_custom2 <>", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2GreaterThan(String value) {
            addCriterion("zone_custom2 >", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom2 >=", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2LessThan(String value) {
            addCriterion("zone_custom2 <", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2LessThanOrEqualTo(String value) {
            addCriterion("zone_custom2 <=", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2Like(String value) {
            addCriterion("zone_custom2 like", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2NotLike(String value) {
            addCriterion("zone_custom2 not like", value, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2In(List<String> values) {
            addCriterion("zone_custom2 in", values, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2NotIn(List<String> values) {
            addCriterion("zone_custom2 not in", values, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2Between(String value1, String value2) {
            addCriterion("zone_custom2 between", value1, value2, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom2NotBetween(String value1, String value2) {
            addCriterion("zone_custom2 not between", value1, value2, "zoneCustom2");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3IsNull() {
            addCriterion("zone_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3IsNotNull() {
            addCriterion("zone_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3EqualTo(String value) {
            addCriterion("zone_custom3 =", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3NotEqualTo(String value) {
            addCriterion("zone_custom3 <>", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3GreaterThan(String value) {
            addCriterion("zone_custom3 >", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom3 >=", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3LessThan(String value) {
            addCriterion("zone_custom3 <", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3LessThanOrEqualTo(String value) {
            addCriterion("zone_custom3 <=", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3Like(String value) {
            addCriterion("zone_custom3 like", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3NotLike(String value) {
            addCriterion("zone_custom3 not like", value, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3In(List<String> values) {
            addCriterion("zone_custom3 in", values, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3NotIn(List<String> values) {
            addCriterion("zone_custom3 not in", values, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3Between(String value1, String value2) {
            addCriterion("zone_custom3 between", value1, value2, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom3NotBetween(String value1, String value2) {
            addCriterion("zone_custom3 not between", value1, value2, "zoneCustom3");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4IsNull() {
            addCriterion("zone_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4IsNotNull() {
            addCriterion("zone_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4EqualTo(String value) {
            addCriterion("zone_custom4 =", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4NotEqualTo(String value) {
            addCriterion("zone_custom4 <>", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4GreaterThan(String value) {
            addCriterion("zone_custom4 >", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom4 >=", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4LessThan(String value) {
            addCriterion("zone_custom4 <", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4LessThanOrEqualTo(String value) {
            addCriterion("zone_custom4 <=", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4Like(String value) {
            addCriterion("zone_custom4 like", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4NotLike(String value) {
            addCriterion("zone_custom4 not like", value, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4In(List<String> values) {
            addCriterion("zone_custom4 in", values, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4NotIn(List<String> values) {
            addCriterion("zone_custom4 not in", values, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4Between(String value1, String value2) {
            addCriterion("zone_custom4 between", value1, value2, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom4NotBetween(String value1, String value2) {
            addCriterion("zone_custom4 not between", value1, value2, "zoneCustom4");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5IsNull() {
            addCriterion("zone_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5IsNotNull() {
            addCriterion("zone_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5EqualTo(String value) {
            addCriterion("zone_custom5 =", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5NotEqualTo(String value) {
            addCriterion("zone_custom5 <>", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5GreaterThan(String value) {
            addCriterion("zone_custom5 >", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom5 >=", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5LessThan(String value) {
            addCriterion("zone_custom5 <", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5LessThanOrEqualTo(String value) {
            addCriterion("zone_custom5 <=", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5Like(String value) {
            addCriterion("zone_custom5 like", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5NotLike(String value) {
            addCriterion("zone_custom5 not like", value, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5In(List<String> values) {
            addCriterion("zone_custom5 in", values, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5NotIn(List<String> values) {
            addCriterion("zone_custom5 not in", values, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5Between(String value1, String value2) {
            addCriterion("zone_custom5 between", value1, value2, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom5NotBetween(String value1, String value2) {
            addCriterion("zone_custom5 not between", value1, value2, "zoneCustom5");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6IsNull() {
            addCriterion("zone_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6IsNotNull() {
            addCriterion("zone_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6EqualTo(String value) {
            addCriterion("zone_custom6 =", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6NotEqualTo(String value) {
            addCriterion("zone_custom6 <>", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6GreaterThan(String value) {
            addCriterion("zone_custom6 >", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("zone_custom6 >=", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6LessThan(String value) {
            addCriterion("zone_custom6 <", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6LessThanOrEqualTo(String value) {
            addCriterion("zone_custom6 <=", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6Like(String value) {
            addCriterion("zone_custom6 like", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6NotLike(String value) {
            addCriterion("zone_custom6 not like", value, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6In(List<String> values) {
            addCriterion("zone_custom6 in", values, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6NotIn(List<String> values) {
            addCriterion("zone_custom6 not in", values, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6Between(String value1, String value2) {
            addCriterion("zone_custom6 between", value1, value2, "zoneCustom6");
            return (Criteria) this;
        }

        public Criteria andZoneCustom6NotBetween(String value1, String value2) {
            addCriterion("zone_custom6 not between", value1, value2, "zoneCustom6");
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