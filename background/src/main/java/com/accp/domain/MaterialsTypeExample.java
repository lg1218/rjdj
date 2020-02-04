package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaterialsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialsTypeExample() {
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

        public Criteria andMtEnameIsNull() {
            addCriterion("mt_ename is null");
            return (Criteria) this;
        }

        public Criteria andMtEnameIsNotNull() {
            addCriterion("mt_ename is not null");
            return (Criteria) this;
        }

        public Criteria andMtEnameEqualTo(String value) {
            addCriterion("mt_ename =", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameNotEqualTo(String value) {
            addCriterion("mt_ename <>", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameGreaterThan(String value) {
            addCriterion("mt_ename >", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameGreaterThanOrEqualTo(String value) {
            addCriterion("mt_ename >=", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameLessThan(String value) {
            addCriterion("mt_ename <", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameLessThanOrEqualTo(String value) {
            addCriterion("mt_ename <=", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameLike(String value) {
            addCriterion("mt_ename like", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameNotLike(String value) {
            addCriterion("mt_ename not like", value, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameIn(List<String> values) {
            addCriterion("mt_ename in", values, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameNotIn(List<String> values) {
            addCriterion("mt_ename not in", values, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameBetween(String value1, String value2) {
            addCriterion("mt_ename between", value1, value2, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtEnameNotBetween(String value1, String value2) {
            addCriterion("mt_ename not between", value1, value2, "mtEname");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidIsNull() {
            addCriterion("mt_hc_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidIsNotNull() {
            addCriterion("mt_hc_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidEqualTo(Integer value) {
            addCriterion("mt_hc_subjectid =", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidNotEqualTo(Integer value) {
            addCriterion("mt_hc_subjectid <>", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidGreaterThan(Integer value) {
            addCriterion("mt_hc_subjectid >", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_hc_subjectid >=", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidLessThan(Integer value) {
            addCriterion("mt_hc_subjectid <", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_hc_subjectid <=", value, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidIn(List<Integer> values) {
            addCriterion("mt_hc_subjectid in", values, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidNotIn(List<Integer> values) {
            addCriterion("mt_hc_subjectid not in", values, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_hc_subjectid between", value1, value2, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtHcSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_hc_subjectid not between", value1, value2, "mtHcSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidIsNull() {
            addCriterion("mt_xssr_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidIsNotNull() {
            addCriterion("mt_xssr_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidEqualTo(Integer value) {
            addCriterion("mt_xssr_subjectid =", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidNotEqualTo(Integer value) {
            addCriterion("mt_xssr_subjectid <>", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidGreaterThan(Integer value) {
            addCriterion("mt_xssr_subjectid >", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_xssr_subjectid >=", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidLessThan(Integer value) {
            addCriterion("mt_xssr_subjectid <", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_xssr_subjectid <=", value, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidIn(List<Integer> values) {
            addCriterion("mt_xssr_subjectid in", values, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidNotIn(List<Integer> values) {
            addCriterion("mt_xssr_subjectid not in", values, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_xssr_subjectid between", value1, value2, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtXssrSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_xssr_subjectid not between", value1, value2, "mtXssrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidIsNull() {
            addCriterion("mt_zpcb_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidIsNotNull() {
            addCriterion("mt_zpcb_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidEqualTo(Integer value) {
            addCriterion("mt_zpcb_subjectid =", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidNotEqualTo(Integer value) {
            addCriterion("mt_zpcb_subjectid <>", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidGreaterThan(Integer value) {
            addCriterion("mt_zpcb_subjectid >", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_zpcb_subjectid >=", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidLessThan(Integer value) {
            addCriterion("mt_zpcb_subjectid <", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_zpcb_subjectid <=", value, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidIn(List<Integer> values) {
            addCriterion("mt_zpcb_subjectid in", values, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidNotIn(List<Integer> values) {
            addCriterion("mt_zpcb_subjectid not in", values, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_zpcb_subjectid between", value1, value2, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpcbSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_zpcb_subjectid not between", value1, value2, "mtZpcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidIsNull() {
            addCriterion("mt_zpfy_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidIsNotNull() {
            addCriterion("mt_zpfy_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidEqualTo(Integer value) {
            addCriterion("mt_zpfy_subjectid =", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidNotEqualTo(Integer value) {
            addCriterion("mt_zpfy_subjectid <>", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidGreaterThan(Integer value) {
            addCriterion("mt_zpfy_subjectid >", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_zpfy_subjectid >=", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidLessThan(Integer value) {
            addCriterion("mt_zpfy_subjectid <", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_zpfy_subjectid <=", value, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidIn(List<Integer> values) {
            addCriterion("mt_zpfy_subjectid in", values, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidNotIn(List<Integer> values) {
            addCriterion("mt_zpfy_subjectid not in", values, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_zpfy_subjectid between", value1, value2, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtZpfySubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_zpfy_subjectid not between", value1, value2, "mtZpfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidIsNull() {
            addCriterion("mt_qtsr_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidIsNotNull() {
            addCriterion("mt_qtsr_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidEqualTo(Integer value) {
            addCriterion("mt_qtsr_subjectid =", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidNotEqualTo(Integer value) {
            addCriterion("mt_qtsr_subjectid <>", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidGreaterThan(Integer value) {
            addCriterion("mt_qtsr_subjectid >", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_qtsr_subjectid >=", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidLessThan(Integer value) {
            addCriterion("mt_qtsr_subjectid <", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_qtsr_subjectid <=", value, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidIn(List<Integer> values) {
            addCriterion("mt_qtsr_subjectid in", values, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidNotIn(List<Integer> values) {
            addCriterion("mt_qtsr_subjectid not in", values, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtsr_subjectid between", value1, value2, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtsrSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtsr_subjectid not between", value1, value2, "mtQtsrSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidIsNull() {
            addCriterion("mt_qtfy_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidIsNotNull() {
            addCriterion("mt_qtfy_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidEqualTo(Integer value) {
            addCriterion("mt_qtfy_subjectid =", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidNotEqualTo(Integer value) {
            addCriterion("mt_qtfy_subjectid <>", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidGreaterThan(Integer value) {
            addCriterion("mt_qtfy_subjectid >", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_qtfy_subjectid >=", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidLessThan(Integer value) {
            addCriterion("mt_qtfy_subjectid <", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_qtfy_subjectid <=", value, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidIn(List<Integer> values) {
            addCriterion("mt_qtfy_subjectid in", values, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidNotIn(List<Integer> values) {
            addCriterion("mt_qtfy_subjectid not in", values, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtfy_subjectid between", value1, value2, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtfySubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtfy_subjectid not between", value1, value2, "mtQtfySubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidIsNull() {
            addCriterion("mt_qtcb_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidIsNotNull() {
            addCriterion("mt_qtcb_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidEqualTo(Integer value) {
            addCriterion("mt_qtcb_subjectid =", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidNotEqualTo(Integer value) {
            addCriterion("mt_qtcb_subjectid <>", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidGreaterThan(Integer value) {
            addCriterion("mt_qtcb_subjectid >", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mt_qtcb_subjectid >=", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidLessThan(Integer value) {
            addCriterion("mt_qtcb_subjectid <", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("mt_qtcb_subjectid <=", value, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidIn(List<Integer> values) {
            addCriterion("mt_qtcb_subjectid in", values, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidNotIn(List<Integer> values) {
            addCriterion("mt_qtcb_subjectid not in", values, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtcb_subjectid between", value1, value2, "mtQtcbSubjectid");
            return (Criteria) this;
        }

        public Criteria andMtQtcbSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("mt_qtcb_subjectid not between", value1, value2, "mtQtcbSubjectid");
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

        public Criteria andBz1IsNull() {
            addCriterion("bz1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("bz1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("bz1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("bz1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("bz1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("bz1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("bz1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("bz1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("bz1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("bz1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("bz1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("bz1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("bz1 not between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz2IsNull() {
            addCriterion("bz2 is null");
            return (Criteria) this;
        }

        public Criteria andBz2IsNotNull() {
            addCriterion("bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andBz2EqualTo(String value) {
            addCriterion("bz2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(String value) {
            addCriterion("bz2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(String value) {
            addCriterion("bz2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(String value) {
            addCriterion("bz2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(String value) {
            addCriterion("bz2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(String value) {
            addCriterion("bz2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Like(String value) {
            addCriterion("bz2 like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotLike(String value) {
            addCriterion("bz2 not like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<String> values) {
            addCriterion("bz2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<String> values) {
            addCriterion("bz2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(String value1, String value2) {
            addCriterion("bz2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(String value1, String value2) {
            addCriterion("bz2 not between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("bz3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("bz3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("bz3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("bz3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("bz3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("bz3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("bz3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("bz3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("bz3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("bz3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("bz3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("bz3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("bz3 not between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz4IsNull() {
            addCriterion("bz4 is null");
            return (Criteria) this;
        }

        public Criteria andBz4IsNotNull() {
            addCriterion("bz4 is not null");
            return (Criteria) this;
        }

        public Criteria andBz4EqualTo(String value) {
            addCriterion("bz4 =", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotEqualTo(String value) {
            addCriterion("bz4 <>", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThan(String value) {
            addCriterion("bz4 >", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThanOrEqualTo(String value) {
            addCriterion("bz4 >=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThan(String value) {
            addCriterion("bz4 <", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThanOrEqualTo(String value) {
            addCriterion("bz4 <=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Like(String value) {
            addCriterion("bz4 like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotLike(String value) {
            addCriterion("bz4 not like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4In(List<String> values) {
            addCriterion("bz4 in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotIn(List<String> values) {
            addCriterion("bz4 not in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Between(String value1, String value2) {
            addCriterion("bz4 between", value1, value2, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotBetween(String value1, String value2) {
            addCriterion("bz4 not between", value1, value2, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz5IsNull() {
            addCriterion("bz5 is null");
            return (Criteria) this;
        }

        public Criteria andBz5IsNotNull() {
            addCriterion("bz5 is not null");
            return (Criteria) this;
        }

        public Criteria andBz5EqualTo(String value) {
            addCriterion("bz5 =", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotEqualTo(String value) {
            addCriterion("bz5 <>", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5GreaterThan(String value) {
            addCriterion("bz5 >", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5GreaterThanOrEqualTo(String value) {
            addCriterion("bz5 >=", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5LessThan(String value) {
            addCriterion("bz5 <", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5LessThanOrEqualTo(String value) {
            addCriterion("bz5 <=", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5Like(String value) {
            addCriterion("bz5 like", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotLike(String value) {
            addCriterion("bz5 not like", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5In(List<String> values) {
            addCriterion("bz5 in", values, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotIn(List<String> values) {
            addCriterion("bz5 not in", values, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5Between(String value1, String value2) {
            addCriterion("bz5 between", value1, value2, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotBetween(String value1, String value2) {
            addCriterion("bz5 not between", value1, value2, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz6IsNull() {
            addCriterion("bz6 is null");
            return (Criteria) this;
        }

        public Criteria andBz6IsNotNull() {
            addCriterion("bz6 is not null");
            return (Criteria) this;
        }

        public Criteria andBz6EqualTo(String value) {
            addCriterion("bz6 =", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotEqualTo(String value) {
            addCriterion("bz6 <>", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6GreaterThan(String value) {
            addCriterion("bz6 >", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6GreaterThanOrEqualTo(String value) {
            addCriterion("bz6 >=", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6LessThan(String value) {
            addCriterion("bz6 <", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6LessThanOrEqualTo(String value) {
            addCriterion("bz6 <=", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6Like(String value) {
            addCriterion("bz6 like", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotLike(String value) {
            addCriterion("bz6 not like", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6In(List<String> values) {
            addCriterion("bz6 in", values, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotIn(List<String> values) {
            addCriterion("bz6 not in", values, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6Between(String value1, String value2) {
            addCriterion("bz6 between", value1, value2, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotBetween(String value1, String value2) {
            addCriterion("bz6 not between", value1, value2, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz7IsNull() {
            addCriterion("bz7 is null");
            return (Criteria) this;
        }

        public Criteria andBz7IsNotNull() {
            addCriterion("bz7 is not null");
            return (Criteria) this;
        }

        public Criteria andBz7EqualTo(String value) {
            addCriterion("bz7 =", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotEqualTo(String value) {
            addCriterion("bz7 <>", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7GreaterThan(String value) {
            addCriterion("bz7 >", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7GreaterThanOrEqualTo(String value) {
            addCriterion("bz7 >=", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7LessThan(String value) {
            addCriterion("bz7 <", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7LessThanOrEqualTo(String value) {
            addCriterion("bz7 <=", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7Like(String value) {
            addCriterion("bz7 like", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotLike(String value) {
            addCriterion("bz7 not like", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7In(List<String> values) {
            addCriterion("bz7 in", values, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotIn(List<String> values) {
            addCriterion("bz7 not in", values, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7Between(String value1, String value2) {
            addCriterion("bz7 between", value1, value2, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotBetween(String value1, String value2) {
            addCriterion("bz7 not between", value1, value2, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz8IsNull() {
            addCriterion("bz8 is null");
            return (Criteria) this;
        }

        public Criteria andBz8IsNotNull() {
            addCriterion("bz8 is not null");
            return (Criteria) this;
        }

        public Criteria andBz8EqualTo(String value) {
            addCriterion("bz8 =", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotEqualTo(String value) {
            addCriterion("bz8 <>", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8GreaterThan(String value) {
            addCriterion("bz8 >", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8GreaterThanOrEqualTo(String value) {
            addCriterion("bz8 >=", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8LessThan(String value) {
            addCriterion("bz8 <", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8LessThanOrEqualTo(String value) {
            addCriterion("bz8 <=", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8Like(String value) {
            addCriterion("bz8 like", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotLike(String value) {
            addCriterion("bz8 not like", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8In(List<String> values) {
            addCriterion("bz8 in", values, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotIn(List<String> values) {
            addCriterion("bz8 not in", values, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8Between(String value1, String value2) {
            addCriterion("bz8 between", value1, value2, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotBetween(String value1, String value2) {
            addCriterion("bz8 not between", value1, value2, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz9IsNull() {
            addCriterion("bz9 is null");
            return (Criteria) this;
        }

        public Criteria andBz9IsNotNull() {
            addCriterion("bz9 is not null");
            return (Criteria) this;
        }

        public Criteria andBz9EqualTo(String value) {
            addCriterion("bz9 =", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotEqualTo(String value) {
            addCriterion("bz9 <>", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9GreaterThan(String value) {
            addCriterion("bz9 >", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9GreaterThanOrEqualTo(String value) {
            addCriterion("bz9 >=", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9LessThan(String value) {
            addCriterion("bz9 <", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9LessThanOrEqualTo(String value) {
            addCriterion("bz9 <=", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9Like(String value) {
            addCriterion("bz9 like", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotLike(String value) {
            addCriterion("bz9 not like", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9In(List<String> values) {
            addCriterion("bz9 in", values, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotIn(List<String> values) {
            addCriterion("bz9 not in", values, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9Between(String value1, String value2) {
            addCriterion("bz9 between", value1, value2, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotBetween(String value1, String value2) {
            addCriterion("bz9 not between", value1, value2, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz10IsNull() {
            addCriterion("bz10 is null");
            return (Criteria) this;
        }

        public Criteria andBz10IsNotNull() {
            addCriterion("bz10 is not null");
            return (Criteria) this;
        }

        public Criteria andBz10EqualTo(String value) {
            addCriterion("bz10 =", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotEqualTo(String value) {
            addCriterion("bz10 <>", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10GreaterThan(String value) {
            addCriterion("bz10 >", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10GreaterThanOrEqualTo(String value) {
            addCriterion("bz10 >=", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10LessThan(String value) {
            addCriterion("bz10 <", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10LessThanOrEqualTo(String value) {
            addCriterion("bz10 <=", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10Like(String value) {
            addCriterion("bz10 like", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotLike(String value) {
            addCriterion("bz10 not like", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10In(List<String> values) {
            addCriterion("bz10 in", values, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotIn(List<String> values) {
            addCriterion("bz10 not in", values, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10Between(String value1, String value2) {
            addCriterion("bz10 between", value1, value2, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotBetween(String value1, String value2) {
            addCriterion("bz10 not between", value1, value2, "bz10");
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