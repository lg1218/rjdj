package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaterialTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialTypeExample() {
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

        public Criteria andMtIdIsNull() {
            addCriterion("mt_id is null");
            return (Criteria) this;
        }

        public Criteria andMtIdIsNotNull() {
            addCriterion("mt_id is not null");
            return (Criteria) this;
        }

        public Criteria andMtIdEqualTo(String value) {
            addCriterion("mt_id =", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotEqualTo(String value) {
            addCriterion("mt_id <>", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThan(String value) {
            addCriterion("mt_id >", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdGreaterThanOrEqualTo(String value) {
            addCriterion("mt_id >=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThan(String value) {
            addCriterion("mt_id <", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLessThanOrEqualTo(String value) {
            addCriterion("mt_id <=", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdLike(String value) {
            addCriterion("mt_id like", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotLike(String value) {
            addCriterion("mt_id not like", value, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdIn(List<String> values) {
            addCriterion("mt_id in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotIn(List<String> values) {
            addCriterion("mt_id not in", values, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdBetween(String value1, String value2) {
            addCriterion("mt_id between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtIdNotBetween(String value1, String value2) {
            addCriterion("mt_id not between", value1, value2, "mtId");
            return (Criteria) this;
        }

        public Criteria andMtNameIsNull() {
            addCriterion("mt_name is null");
            return (Criteria) this;
        }

        public Criteria andMtNameIsNotNull() {
            addCriterion("mt_name is not null");
            return (Criteria) this;
        }

        public Criteria andMtNameEqualTo(String value) {
            addCriterion("mt_name =", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameNotEqualTo(String value) {
            addCriterion("mt_name <>", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameGreaterThan(String value) {
            addCriterion("mt_name >", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameGreaterThanOrEqualTo(String value) {
            addCriterion("mt_name >=", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameLessThan(String value) {
            addCriterion("mt_name <", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameLessThanOrEqualTo(String value) {
            addCriterion("mt_name <=", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameLike(String value) {
            addCriterion("mt_name like", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameNotLike(String value) {
            addCriterion("mt_name not like", value, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameIn(List<String> values) {
            addCriterion("mt_name in", values, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameNotIn(List<String> values) {
            addCriterion("mt_name not in", values, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameBetween(String value1, String value2) {
            addCriterion("mt_name between", value1, value2, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtNameNotBetween(String value1, String value2) {
            addCriterion("mt_name not between", value1, value2, "mtName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameIsNull() {
            addCriterion("mt_english_name is null");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameIsNotNull() {
            addCriterion("mt_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameEqualTo(String value) {
            addCriterion("mt_english_name =", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameNotEqualTo(String value) {
            addCriterion("mt_english_name <>", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameGreaterThan(String value) {
            addCriterion("mt_english_name >", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("mt_english_name >=", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameLessThan(String value) {
            addCriterion("mt_english_name <", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("mt_english_name <=", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameLike(String value) {
            addCriterion("mt_english_name like", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameNotLike(String value) {
            addCriterion("mt_english_name not like", value, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameIn(List<String> values) {
            addCriterion("mt_english_name in", values, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameNotIn(List<String> values) {
            addCriterion("mt_english_name not in", values, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameBetween(String value1, String value2) {
            addCriterion("mt_english_name between", value1, value2, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtEnglishNameNotBetween(String value1, String value2) {
            addCriterion("mt_english_name not between", value1, value2, "mtEnglishName");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectIsNull() {
            addCriterion("mt_save_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectIsNotNull() {
            addCriterion("mt_save_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectEqualTo(String value) {
            addCriterion("mt_save_subject =", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectNotEqualTo(String value) {
            addCriterion("mt_save_subject <>", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectGreaterThan(String value) {
            addCriterion("mt_save_subject >", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_save_subject >=", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectLessThan(String value) {
            addCriterion("mt_save_subject <", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_save_subject <=", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectLike(String value) {
            addCriterion("mt_save_subject like", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectNotLike(String value) {
            addCriterion("mt_save_subject not like", value, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectIn(List<String> values) {
            addCriterion("mt_save_subject in", values, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectNotIn(List<String> values) {
            addCriterion("mt_save_subject not in", values, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectBetween(String value1, String value2) {
            addCriterion("mt_save_subject between", value1, value2, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaveSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_save_subject not between", value1, value2, "mtSaveSubject");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAIsNull() {
            addCriterion("mt_subject_a is null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAIsNotNull() {
            addCriterion("mt_subject_a is not null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAEqualTo(String value) {
            addCriterion("mt_subject_a =", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectANotEqualTo(String value) {
            addCriterion("mt_subject_a <>", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAGreaterThan(String value) {
            addCriterion("mt_subject_a >", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAGreaterThanOrEqualTo(String value) {
            addCriterion("mt_subject_a >=", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectALessThan(String value) {
            addCriterion("mt_subject_a <", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectALessThanOrEqualTo(String value) {
            addCriterion("mt_subject_a <=", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectALike(String value) {
            addCriterion("mt_subject_a like", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectANotLike(String value) {
            addCriterion("mt_subject_a not like", value, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectAIn(List<String> values) {
            addCriterion("mt_subject_a in", values, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectANotIn(List<String> values) {
            addCriterion("mt_subject_a not in", values, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectABetween(String value1, String value2) {
            addCriterion("mt_subject_a between", value1, value2, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectANotBetween(String value1, String value2) {
            addCriterion("mt_subject_a not between", value1, value2, "mtSubjectA");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBIsNull() {
            addCriterion("mt_subject_b is null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBIsNotNull() {
            addCriterion("mt_subject_b is not null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBEqualTo(String value) {
            addCriterion("mt_subject_b =", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBNotEqualTo(String value) {
            addCriterion("mt_subject_b <>", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBGreaterThan(String value) {
            addCriterion("mt_subject_b >", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBGreaterThanOrEqualTo(String value) {
            addCriterion("mt_subject_b >=", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBLessThan(String value) {
            addCriterion("mt_subject_b <", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBLessThanOrEqualTo(String value) {
            addCriterion("mt_subject_b <=", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBLike(String value) {
            addCriterion("mt_subject_b like", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBNotLike(String value) {
            addCriterion("mt_subject_b not like", value, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBIn(List<String> values) {
            addCriterion("mt_subject_b in", values, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBNotIn(List<String> values) {
            addCriterion("mt_subject_b not in", values, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBBetween(String value1, String value2) {
            addCriterion("mt_subject_b between", value1, value2, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectBNotBetween(String value1, String value2) {
            addCriterion("mt_subject_b not between", value1, value2, "mtSubjectB");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCIsNull() {
            addCriterion("mt_subject_c is null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCIsNotNull() {
            addCriterion("mt_subject_c is not null");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCEqualTo(String value) {
            addCriterion("mt_subject_c =", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCNotEqualTo(String value) {
            addCriterion("mt_subject_c <>", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCGreaterThan(String value) {
            addCriterion("mt_subject_c >", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCGreaterThanOrEqualTo(String value) {
            addCriterion("mt_subject_c >=", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCLessThan(String value) {
            addCriterion("mt_subject_c <", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCLessThanOrEqualTo(String value) {
            addCriterion("mt_subject_c <=", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCLike(String value) {
            addCriterion("mt_subject_c like", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCNotLike(String value) {
            addCriterion("mt_subject_c not like", value, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCIn(List<String> values) {
            addCriterion("mt_subject_c in", values, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCNotIn(List<String> values) {
            addCriterion("mt_subject_c not in", values, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCBetween(String value1, String value2) {
            addCriterion("mt_subject_c between", value1, value2, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSubjectCNotBetween(String value1, String value2) {
            addCriterion("mt_subject_c not between", value1, value2, "mtSubjectC");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectIsNull() {
            addCriterion("mt_salein_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectIsNotNull() {
            addCriterion("mt_salein_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectEqualTo(String value) {
            addCriterion("mt_salein_subject =", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectNotEqualTo(String value) {
            addCriterion("mt_salein_subject <>", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectGreaterThan(String value) {
            addCriterion("mt_salein_subject >", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_salein_subject >=", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectLessThan(String value) {
            addCriterion("mt_salein_subject <", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_salein_subject <=", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectLike(String value) {
            addCriterion("mt_salein_subject like", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectNotLike(String value) {
            addCriterion("mt_salein_subject not like", value, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectIn(List<String> values) {
            addCriterion("mt_salein_subject in", values, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectNotIn(List<String> values) {
            addCriterion("mt_salein_subject not in", values, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectBetween(String value1, String value2) {
            addCriterion("mt_salein_subject between", value1, value2, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSaleinSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_salein_subject not between", value1, value2, "mtSaleinSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectIsNull() {
            addCriterion("mt_salecost_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectIsNotNull() {
            addCriterion("mt_salecost_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectEqualTo(String value) {
            addCriterion("mt_salecost_subject =", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectNotEqualTo(String value) {
            addCriterion("mt_salecost_subject <>", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectGreaterThan(String value) {
            addCriterion("mt_salecost_subject >", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_salecost_subject >=", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectLessThan(String value) {
            addCriterion("mt_salecost_subject <", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_salecost_subject <=", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectLike(String value) {
            addCriterion("mt_salecost_subject like", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectNotLike(String value) {
            addCriterion("mt_salecost_subject not like", value, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectIn(List<String> values) {
            addCriterion("mt_salecost_subject in", values, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectNotIn(List<String> values) {
            addCriterion("mt_salecost_subject not in", values, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectBetween(String value1, String value2) {
            addCriterion("mt_salecost_subject between", value1, value2, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtSalecostSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_salecost_subject not between", value1, value2, "mtSalecostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectIsNull() {
            addCriterion("mt_otherin_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectIsNotNull() {
            addCriterion("mt_otherin_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectEqualTo(String value) {
            addCriterion("mt_otherin_subject =", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectNotEqualTo(String value) {
            addCriterion("mt_otherin_subject <>", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectGreaterThan(String value) {
            addCriterion("mt_otherin_subject >", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_otherin_subject >=", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectLessThan(String value) {
            addCriterion("mt_otherin_subject <", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_otherin_subject <=", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectLike(String value) {
            addCriterion("mt_otherin_subject like", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectNotLike(String value) {
            addCriterion("mt_otherin_subject not like", value, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectIn(List<String> values) {
            addCriterion("mt_otherin_subject in", values, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectNotIn(List<String> values) {
            addCriterion("mt_otherin_subject not in", values, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectBetween(String value1, String value2) {
            addCriterion("mt_otherin_subject between", value1, value2, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOtherinSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_otherin_subject not between", value1, value2, "mtOtherinSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectIsNull() {
            addCriterion("mt_othercost_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectIsNotNull() {
            addCriterion("mt_othercost_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectEqualTo(String value) {
            addCriterion("mt_othercost_subject =", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectNotEqualTo(String value) {
            addCriterion("mt_othercost_subject <>", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectGreaterThan(String value) {
            addCriterion("mt_othercost_subject >", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_othercost_subject >=", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectLessThan(String value) {
            addCriterion("mt_othercost_subject <", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_othercost_subject <=", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectLike(String value) {
            addCriterion("mt_othercost_subject like", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectNotLike(String value) {
            addCriterion("mt_othercost_subject not like", value, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectIn(List<String> values) {
            addCriterion("mt_othercost_subject in", values, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectNotIn(List<String> values) {
            addCriterion("mt_othercost_subject not in", values, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectBetween(String value1, String value2) {
            addCriterion("mt_othercost_subject between", value1, value2, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthercostSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_othercost_subject not between", value1, value2, "mtOthercostSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectIsNull() {
            addCriterion("mt_othersell_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectIsNotNull() {
            addCriterion("mt_othersell_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectEqualTo(String value) {
            addCriterion("mt_othersell_subject =", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectNotEqualTo(String value) {
            addCriterion("mt_othersell_subject <>", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectGreaterThan(String value) {
            addCriterion("mt_othersell_subject >", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_othersell_subject >=", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectLessThan(String value) {
            addCriterion("mt_othersell_subject <", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_othersell_subject <=", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectLike(String value) {
            addCriterion("mt_othersell_subject like", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectNotLike(String value) {
            addCriterion("mt_othersell_subject not like", value, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectIn(List<String> values) {
            addCriterion("mt_othersell_subject in", values, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectNotIn(List<String> values) {
            addCriterion("mt_othersell_subject not in", values, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectBetween(String value1, String value2) {
            addCriterion("mt_othersell_subject between", value1, value2, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersellSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_othersell_subject not between", value1, value2, "mtOthersellSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectIsNull() {
            addCriterion("mt_othersend_subject is null");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectIsNotNull() {
            addCriterion("mt_othersend_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectEqualTo(String value) {
            addCriterion("mt_othersend_subject =", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectNotEqualTo(String value) {
            addCriterion("mt_othersend_subject <>", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectGreaterThan(String value) {
            addCriterion("mt_othersend_subject >", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mt_othersend_subject >=", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectLessThan(String value) {
            addCriterion("mt_othersend_subject <", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectLessThanOrEqualTo(String value) {
            addCriterion("mt_othersend_subject <=", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectLike(String value) {
            addCriterion("mt_othersend_subject like", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectNotLike(String value) {
            addCriterion("mt_othersend_subject not like", value, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectIn(List<String> values) {
            addCriterion("mt_othersend_subject in", values, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectNotIn(List<String> values) {
            addCriterion("mt_othersend_subject not in", values, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectBetween(String value1, String value2) {
            addCriterion("mt_othersend_subject between", value1, value2, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtOthersendSubjectNotBetween(String value1, String value2) {
            addCriterion("mt_othersend_subject not between", value1, value2, "mtOthersendSubject");
            return (Criteria) this;
        }

        public Criteria andMtRemarkIsNull() {
            addCriterion("mt_remark is null");
            return (Criteria) this;
        }

        public Criteria andMtRemarkIsNotNull() {
            addCriterion("mt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMtRemarkEqualTo(String value) {
            addCriterion("mt_remark =", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkNotEqualTo(String value) {
            addCriterion("mt_remark <>", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkGreaterThan(String value) {
            addCriterion("mt_remark >", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mt_remark >=", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkLessThan(String value) {
            addCriterion("mt_remark <", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkLessThanOrEqualTo(String value) {
            addCriterion("mt_remark <=", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkLike(String value) {
            addCriterion("mt_remark like", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkNotLike(String value) {
            addCriterion("mt_remark not like", value, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkIn(List<String> values) {
            addCriterion("mt_remark in", values, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkNotIn(List<String> values) {
            addCriterion("mt_remark not in", values, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkBetween(String value1, String value2) {
            addCriterion("mt_remark between", value1, value2, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtRemarkNotBetween(String value1, String value2) {
            addCriterion("mt_remark not between", value1, value2, "mtRemark");
            return (Criteria) this;
        }

        public Criteria andMtAuditingIsNull() {
            addCriterion("mt_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andMtAuditingIsNotNull() {
            addCriterion("mt_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andMtAuditingEqualTo(String value) {
            addCriterion("mt_Auditing =", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingNotEqualTo(String value) {
            addCriterion("mt_Auditing <>", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingGreaterThan(String value) {
            addCriterion("mt_Auditing >", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("mt_Auditing >=", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingLessThan(String value) {
            addCriterion("mt_Auditing <", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingLessThanOrEqualTo(String value) {
            addCriterion("mt_Auditing <=", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingLike(String value) {
            addCriterion("mt_Auditing like", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingNotLike(String value) {
            addCriterion("mt_Auditing not like", value, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingIn(List<String> values) {
            addCriterion("mt_Auditing in", values, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingNotIn(List<String> values) {
            addCriterion("mt_Auditing not in", values, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingBetween(String value1, String value2) {
            addCriterion("mt_Auditing between", value1, value2, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtAuditingNotBetween(String value1, String value2) {
            addCriterion("mt_Auditing not between", value1, value2, "mtAuditing");
            return (Criteria) this;
        }

        public Criteria andMtYnIsNull() {
            addCriterion("mt_yn is null");
            return (Criteria) this;
        }

        public Criteria andMtYnIsNotNull() {
            addCriterion("mt_yn is not null");
            return (Criteria) this;
        }

        public Criteria andMtYnEqualTo(String value) {
            addCriterion("mt_yn =", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnNotEqualTo(String value) {
            addCriterion("mt_yn <>", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnGreaterThan(String value) {
            addCriterion("mt_yn >", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnGreaterThanOrEqualTo(String value) {
            addCriterion("mt_yn >=", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnLessThan(String value) {
            addCriterion("mt_yn <", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnLessThanOrEqualTo(String value) {
            addCriterion("mt_yn <=", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnLike(String value) {
            addCriterion("mt_yn like", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnNotLike(String value) {
            addCriterion("mt_yn not like", value, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnIn(List<String> values) {
            addCriterion("mt_yn in", values, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnNotIn(List<String> values) {
            addCriterion("mt_yn not in", values, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnBetween(String value1, String value2) {
            addCriterion("mt_yn between", value1, value2, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtYnNotBetween(String value1, String value2) {
            addCriterion("mt_yn not between", value1, value2, "mtYn");
            return (Criteria) this;
        }

        public Criteria andMtCustom1IsNull() {
            addCriterion("mt_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom1IsNotNull() {
            addCriterion("mt_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom1EqualTo(String value) {
            addCriterion("mt_custom1 =", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1NotEqualTo(String value) {
            addCriterion("mt_custom1 <>", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1GreaterThan(String value) {
            addCriterion("mt_custom1 >", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom1 >=", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1LessThan(String value) {
            addCriterion("mt_custom1 <", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1LessThanOrEqualTo(String value) {
            addCriterion("mt_custom1 <=", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1Like(String value) {
            addCriterion("mt_custom1 like", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1NotLike(String value) {
            addCriterion("mt_custom1 not like", value, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1In(List<String> values) {
            addCriterion("mt_custom1 in", values, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1NotIn(List<String> values) {
            addCriterion("mt_custom1 not in", values, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1Between(String value1, String value2) {
            addCriterion("mt_custom1 between", value1, value2, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom1NotBetween(String value1, String value2) {
            addCriterion("mt_custom1 not between", value1, value2, "mtCustom1");
            return (Criteria) this;
        }

        public Criteria andMtCustom2IsNull() {
            addCriterion("mt_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom2IsNotNull() {
            addCriterion("mt_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom2EqualTo(String value) {
            addCriterion("mt_custom2 =", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2NotEqualTo(String value) {
            addCriterion("mt_custom2 <>", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2GreaterThan(String value) {
            addCriterion("mt_custom2 >", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom2 >=", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2LessThan(String value) {
            addCriterion("mt_custom2 <", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2LessThanOrEqualTo(String value) {
            addCriterion("mt_custom2 <=", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2Like(String value) {
            addCriterion("mt_custom2 like", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2NotLike(String value) {
            addCriterion("mt_custom2 not like", value, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2In(List<String> values) {
            addCriterion("mt_custom2 in", values, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2NotIn(List<String> values) {
            addCriterion("mt_custom2 not in", values, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2Between(String value1, String value2) {
            addCriterion("mt_custom2 between", value1, value2, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom2NotBetween(String value1, String value2) {
            addCriterion("mt_custom2 not between", value1, value2, "mtCustom2");
            return (Criteria) this;
        }

        public Criteria andMtCustom3IsNull() {
            addCriterion("mt_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom3IsNotNull() {
            addCriterion("mt_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom3EqualTo(String value) {
            addCriterion("mt_custom3 =", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3NotEqualTo(String value) {
            addCriterion("mt_custom3 <>", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3GreaterThan(String value) {
            addCriterion("mt_custom3 >", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom3 >=", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3LessThan(String value) {
            addCriterion("mt_custom3 <", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3LessThanOrEqualTo(String value) {
            addCriterion("mt_custom3 <=", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3Like(String value) {
            addCriterion("mt_custom3 like", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3NotLike(String value) {
            addCriterion("mt_custom3 not like", value, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3In(List<String> values) {
            addCriterion("mt_custom3 in", values, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3NotIn(List<String> values) {
            addCriterion("mt_custom3 not in", values, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3Between(String value1, String value2) {
            addCriterion("mt_custom3 between", value1, value2, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom3NotBetween(String value1, String value2) {
            addCriterion("mt_custom3 not between", value1, value2, "mtCustom3");
            return (Criteria) this;
        }

        public Criteria andMtCustom4IsNull() {
            addCriterion("mt_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom4IsNotNull() {
            addCriterion("mt_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom4EqualTo(String value) {
            addCriterion("mt_custom4 =", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4NotEqualTo(String value) {
            addCriterion("mt_custom4 <>", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4GreaterThan(String value) {
            addCriterion("mt_custom4 >", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom4 >=", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4LessThan(String value) {
            addCriterion("mt_custom4 <", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4LessThanOrEqualTo(String value) {
            addCriterion("mt_custom4 <=", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4Like(String value) {
            addCriterion("mt_custom4 like", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4NotLike(String value) {
            addCriterion("mt_custom4 not like", value, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4In(List<String> values) {
            addCriterion("mt_custom4 in", values, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4NotIn(List<String> values) {
            addCriterion("mt_custom4 not in", values, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4Between(String value1, String value2) {
            addCriterion("mt_custom4 between", value1, value2, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom4NotBetween(String value1, String value2) {
            addCriterion("mt_custom4 not between", value1, value2, "mtCustom4");
            return (Criteria) this;
        }

        public Criteria andMtCustom5IsNull() {
            addCriterion("mt_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom5IsNotNull() {
            addCriterion("mt_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom5EqualTo(String value) {
            addCriterion("mt_custom5 =", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5NotEqualTo(String value) {
            addCriterion("mt_custom5 <>", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5GreaterThan(String value) {
            addCriterion("mt_custom5 >", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom5 >=", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5LessThan(String value) {
            addCriterion("mt_custom5 <", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5LessThanOrEqualTo(String value) {
            addCriterion("mt_custom5 <=", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5Like(String value) {
            addCriterion("mt_custom5 like", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5NotLike(String value) {
            addCriterion("mt_custom5 not like", value, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5In(List<String> values) {
            addCriterion("mt_custom5 in", values, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5NotIn(List<String> values) {
            addCriterion("mt_custom5 not in", values, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5Between(String value1, String value2) {
            addCriterion("mt_custom5 between", value1, value2, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom5NotBetween(String value1, String value2) {
            addCriterion("mt_custom5 not between", value1, value2, "mtCustom5");
            return (Criteria) this;
        }

        public Criteria andMtCustom6IsNull() {
            addCriterion("mt_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andMtCustom6IsNotNull() {
            addCriterion("mt_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andMtCustom6EqualTo(String value) {
            addCriterion("mt_custom6 =", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6NotEqualTo(String value) {
            addCriterion("mt_custom6 <>", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6GreaterThan(String value) {
            addCriterion("mt_custom6 >", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("mt_custom6 >=", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6LessThan(String value) {
            addCriterion("mt_custom6 <", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6LessThanOrEqualTo(String value) {
            addCriterion("mt_custom6 <=", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6Like(String value) {
            addCriterion("mt_custom6 like", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6NotLike(String value) {
            addCriterion("mt_custom6 not like", value, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6In(List<String> values) {
            addCriterion("mt_custom6 in", values, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6NotIn(List<String> values) {
            addCriterion("mt_custom6 not in", values, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6Between(String value1, String value2) {
            addCriterion("mt_custom6 between", value1, value2, "mtCustom6");
            return (Criteria) this;
        }

        public Criteria andMtCustom6NotBetween(String value1, String value2) {
            addCriterion("mt_custom6 not between", value1, value2, "mtCustom6");
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