package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SSellCancelparticularExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SSellCancelparticularExample() {
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

        public Criteria andCpaIdIsNull() {
            addCriterion("cpa_id is null");
            return (Criteria) this;
        }

        public Criteria andCpaIdIsNotNull() {
            addCriterion("cpa_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpaIdEqualTo(Integer value) {
            addCriterion("cpa_id =", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdNotEqualTo(Integer value) {
            addCriterion("cpa_id <>", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdGreaterThan(Integer value) {
            addCriterion("cpa_id >", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpa_id >=", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdLessThan(Integer value) {
            addCriterion("cpa_id <", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cpa_id <=", value, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdIn(List<Integer> values) {
            addCriterion("cpa_id in", values, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdNotIn(List<Integer> values) {
            addCriterion("cpa_id not in", values, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdBetween(Integer value1, Integer value2) {
            addCriterion("cpa_id between", value1, value2, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCpaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cpa_id not between", value1, value2, "cpaId");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNull() {
            addCriterion("ca_id is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("ca_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(String value) {
            addCriterion("ca_id =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(String value) {
            addCriterion("ca_id <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(String value) {
            addCriterion("ca_id >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ca_id >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(String value) {
            addCriterion("ca_id <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(String value) {
            addCriterion("ca_id <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLike(String value) {
            addCriterion("ca_id like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotLike(String value) {
            addCriterion("ca_id not like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<String> values) {
            addCriterion("ca_id in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<String> values) {
            addCriterion("ca_id not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(String value1, String value2) {
            addCriterion("ca_id between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(String value1, String value2) {
            addCriterion("ca_id not between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidIsNull() {
            addCriterion("cpa_materielid is null");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidIsNotNull() {
            addCriterion("cpa_materielid is not null");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidEqualTo(String value) {
            addCriterion("cpa_materielid =", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidNotEqualTo(String value) {
            addCriterion("cpa_materielid <>", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidGreaterThan(String value) {
            addCriterion("cpa_materielid >", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_materielid >=", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidLessThan(String value) {
            addCriterion("cpa_materielid <", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidLessThanOrEqualTo(String value) {
            addCriterion("cpa_materielid <=", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidLike(String value) {
            addCriterion("cpa_materielid like", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidNotLike(String value) {
            addCriterion("cpa_materielid not like", value, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidIn(List<String> values) {
            addCriterion("cpa_materielid in", values, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidNotIn(List<String> values) {
            addCriterion("cpa_materielid not in", values, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidBetween(String value1, String value2) {
            addCriterion("cpa_materielid between", value1, value2, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielidNotBetween(String value1, String value2) {
            addCriterion("cpa_materielid not between", value1, value2, "cpaMaterielid");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameIsNull() {
            addCriterion("cpa_materielname is null");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameIsNotNull() {
            addCriterion("cpa_materielname is not null");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameEqualTo(String value) {
            addCriterion("cpa_materielname =", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameNotEqualTo(String value) {
            addCriterion("cpa_materielname <>", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameGreaterThan(String value) {
            addCriterion("cpa_materielname >", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_materielname >=", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameLessThan(String value) {
            addCriterion("cpa_materielname <", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameLessThanOrEqualTo(String value) {
            addCriterion("cpa_materielname <=", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameLike(String value) {
            addCriterion("cpa_materielname like", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameNotLike(String value) {
            addCriterion("cpa_materielname not like", value, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameIn(List<String> values) {
            addCriterion("cpa_materielname in", values, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameNotIn(List<String> values) {
            addCriterion("cpa_materielname not in", values, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameBetween(String value1, String value2) {
            addCriterion("cpa_materielname between", value1, value2, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaMaterielnameNotBetween(String value1, String value2) {
            addCriterion("cpa_materielname not between", value1, value2, "cpaMaterielname");
            return (Criteria) this;
        }

        public Criteria andCpaOrderIsNull() {
            addCriterion("cpa_order is null");
            return (Criteria) this;
        }

        public Criteria andCpaOrderIsNotNull() {
            addCriterion("cpa_order is not null");
            return (Criteria) this;
        }

        public Criteria andCpaOrderEqualTo(String value) {
            addCriterion("cpa_order =", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderNotEqualTo(String value) {
            addCriterion("cpa_order <>", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderGreaterThan(String value) {
            addCriterion("cpa_order >", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_order >=", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderLessThan(String value) {
            addCriterion("cpa_order <", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderLessThanOrEqualTo(String value) {
            addCriterion("cpa_order <=", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderLike(String value) {
            addCriterion("cpa_order like", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderNotLike(String value) {
            addCriterion("cpa_order not like", value, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderIn(List<String> values) {
            addCriterion("cpa_order in", values, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderNotIn(List<String> values) {
            addCriterion("cpa_order not in", values, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderBetween(String value1, String value2) {
            addCriterion("cpa_order between", value1, value2, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaOrderNotBetween(String value1, String value2) {
            addCriterion("cpa_order not between", value1, value2, "cpaOrder");
            return (Criteria) this;
        }

        public Criteria andCpaNumberIsNull() {
            addCriterion("cpa_number is null");
            return (Criteria) this;
        }

        public Criteria andCpaNumberIsNotNull() {
            addCriterion("cpa_number is not null");
            return (Criteria) this;
        }

        public Criteria andCpaNumberEqualTo(String value) {
            addCriterion("cpa_number =", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberNotEqualTo(String value) {
            addCriterion("cpa_number <>", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberGreaterThan(String value) {
            addCriterion("cpa_number >", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_number >=", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberLessThan(String value) {
            addCriterion("cpa_number <", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberLessThanOrEqualTo(String value) {
            addCriterion("cpa_number <=", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberLike(String value) {
            addCriterion("cpa_number like", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberNotLike(String value) {
            addCriterion("cpa_number not like", value, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberIn(List<String> values) {
            addCriterion("cpa_number in", values, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberNotIn(List<String> values) {
            addCriterion("cpa_number not in", values, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberBetween(String value1, String value2) {
            addCriterion("cpa_number between", value1, value2, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaNumberNotBetween(String value1, String value2) {
            addCriterion("cpa_number not between", value1, value2, "cpaNumber");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneIsNull() {
            addCriterion("cpa_beione is null");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneIsNotNull() {
            addCriterion("cpa_beione is not null");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneEqualTo(String value) {
            addCriterion("cpa_beione =", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneNotEqualTo(String value) {
            addCriterion("cpa_beione <>", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneGreaterThan(String value) {
            addCriterion("cpa_beione >", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_beione >=", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneLessThan(String value) {
            addCriterion("cpa_beione <", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneLessThanOrEqualTo(String value) {
            addCriterion("cpa_beione <=", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneLike(String value) {
            addCriterion("cpa_beione like", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneNotLike(String value) {
            addCriterion("cpa_beione not like", value, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneIn(List<String> values) {
            addCriterion("cpa_beione in", values, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneNotIn(List<String> values) {
            addCriterion("cpa_beione not in", values, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneBetween(String value1, String value2) {
            addCriterion("cpa_beione between", value1, value2, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeioneNotBetween(String value1, String value2) {
            addCriterion("cpa_beione not between", value1, value2, "cpaBeione");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoIsNull() {
            addCriterion("cpa_beitwo is null");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoIsNotNull() {
            addCriterion("cpa_beitwo is not null");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoEqualTo(String value) {
            addCriterion("cpa_beitwo =", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoNotEqualTo(String value) {
            addCriterion("cpa_beitwo <>", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoGreaterThan(String value) {
            addCriterion("cpa_beitwo >", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_beitwo >=", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoLessThan(String value) {
            addCriterion("cpa_beitwo <", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoLessThanOrEqualTo(String value) {
            addCriterion("cpa_beitwo <=", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoLike(String value) {
            addCriterion("cpa_beitwo like", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoNotLike(String value) {
            addCriterion("cpa_beitwo not like", value, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoIn(List<String> values) {
            addCriterion("cpa_beitwo in", values, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoNotIn(List<String> values) {
            addCriterion("cpa_beitwo not in", values, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoBetween(String value1, String value2) {
            addCriterion("cpa_beitwo between", value1, value2, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeitwoNotBetween(String value1, String value2) {
            addCriterion("cpa_beitwo not between", value1, value2, "cpaBeitwo");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeIsNull() {
            addCriterion("cpa_beithree is null");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeIsNotNull() {
            addCriterion("cpa_beithree is not null");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeEqualTo(String value) {
            addCriterion("cpa_beithree =", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeNotEqualTo(String value) {
            addCriterion("cpa_beithree <>", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeGreaterThan(String value) {
            addCriterion("cpa_beithree >", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeGreaterThanOrEqualTo(String value) {
            addCriterion("cpa_beithree >=", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeLessThan(String value) {
            addCriterion("cpa_beithree <", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeLessThanOrEqualTo(String value) {
            addCriterion("cpa_beithree <=", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeLike(String value) {
            addCriterion("cpa_beithree like", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeNotLike(String value) {
            addCriterion("cpa_beithree not like", value, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeIn(List<String> values) {
            addCriterion("cpa_beithree in", values, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeNotIn(List<String> values) {
            addCriterion("cpa_beithree not in", values, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeBetween(String value1, String value2) {
            addCriterion("cpa_beithree between", value1, value2, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaBeithreeNotBetween(String value1, String value2) {
            addCriterion("cpa_beithree not between", value1, value2, "cpaBeithree");
            return (Criteria) this;
        }

        public Criteria andCpaStateIsNull() {
            addCriterion("cpa_state is null");
            return (Criteria) this;
        }

        public Criteria andCpaStateIsNotNull() {
            addCriterion("cpa_state is not null");
            return (Criteria) this;
        }

        public Criteria andCpaStateEqualTo(Integer value) {
            addCriterion("cpa_state =", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateNotEqualTo(Integer value) {
            addCriterion("cpa_state <>", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateGreaterThan(Integer value) {
            addCriterion("cpa_state >", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpa_state >=", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateLessThan(Integer value) {
            addCriterion("cpa_state <", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateLessThanOrEqualTo(Integer value) {
            addCriterion("cpa_state <=", value, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateIn(List<Integer> values) {
            addCriterion("cpa_state in", values, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateNotIn(List<Integer> values) {
            addCriterion("cpa_state not in", values, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateBetween(Integer value1, Integer value2) {
            addCriterion("cpa_state between", value1, value2, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cpa_state not between", value1, value2, "cpaState");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostIsNull() {
            addCriterion("cpa_totalcost is null");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostIsNotNull() {
            addCriterion("cpa_totalcost is not null");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostEqualTo(Double value) {
            addCriterion("cpa_totalcost =", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostNotEqualTo(Double value) {
            addCriterion("cpa_totalcost <>", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostGreaterThan(Double value) {
            addCriterion("cpa_totalcost >", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostGreaterThanOrEqualTo(Double value) {
            addCriterion("cpa_totalcost >=", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostLessThan(Double value) {
            addCriterion("cpa_totalcost <", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostLessThanOrEqualTo(Double value) {
            addCriterion("cpa_totalcost <=", value, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostIn(List<Double> values) {
            addCriterion("cpa_totalcost in", values, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostNotIn(List<Double> values) {
            addCriterion("cpa_totalcost not in", values, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostBetween(Double value1, Double value2) {
            addCriterion("cpa_totalcost between", value1, value2, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaTotalcostNotBetween(Double value1, Double value2) {
            addCriterion("cpa_totalcost not between", value1, value2, "cpaTotalcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostIsNull() {
            addCriterion("cpa_standcost is null");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostIsNotNull() {
            addCriterion("cpa_standcost is not null");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostEqualTo(Double value) {
            addCriterion("cpa_standcost =", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostNotEqualTo(Double value) {
            addCriterion("cpa_standcost <>", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostGreaterThan(Double value) {
            addCriterion("cpa_standcost >", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostGreaterThanOrEqualTo(Double value) {
            addCriterion("cpa_standcost >=", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostLessThan(Double value) {
            addCriterion("cpa_standcost <", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostLessThanOrEqualTo(Double value) {
            addCriterion("cpa_standcost <=", value, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostIn(List<Double> values) {
            addCriterion("cpa_standcost in", values, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostNotIn(List<Double> values) {
            addCriterion("cpa_standcost not in", values, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostBetween(Double value1, Double value2) {
            addCriterion("cpa_standcost between", value1, value2, "cpaStandcost");
            return (Criteria) this;
        }

        public Criteria andCpaStandcostNotBetween(Double value1, Double value2) {
            addCriterion("cpa_standcost not between", value1, value2, "cpaStandcost");
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