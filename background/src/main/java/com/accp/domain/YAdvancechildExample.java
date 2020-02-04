package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class YAdvancechildExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YAdvancechildExample() {
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

        public Criteria andRowsIsNull() {
            addCriterion("rows is null");
            return (Criteria) this;
        }

        public Criteria andRowsIsNotNull() {
            addCriterion("rows is not null");
            return (Criteria) this;
        }

        public Criteria andRowsEqualTo(Double value) {
            addCriterion("rows =", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsNotEqualTo(Double value) {
            addCriterion("rows <>", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsGreaterThan(Double value) {
            addCriterion("rows >", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsGreaterThanOrEqualTo(Double value) {
            addCriterion("rows >=", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsLessThan(Double value) {
            addCriterion("rows <", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsLessThanOrEqualTo(Double value) {
            addCriterion("rows <=", value, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsIn(List<Double> values) {
            addCriterion("rows in", values, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsNotIn(List<Double> values) {
            addCriterion("rows not in", values, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsBetween(Double value1, Double value2) {
            addCriterion("rows between", value1, value2, "rows");
            return (Criteria) this;
        }

        public Criteria andRowsNotBetween(Double value1, Double value2) {
            addCriterion("rows not between", value1, value2, "rows");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNull() {
            addCriterion("advance is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNotNull() {
            addCriterion("advance is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceEqualTo(Double value) {
            addCriterion("advance =", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotEqualTo(Double value) {
            addCriterion("advance <>", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThan(Double value) {
            addCriterion("advance >", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThanOrEqualTo(Double value) {
            addCriterion("advance >=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThan(Double value) {
            addCriterion("advance <", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThanOrEqualTo(Double value) {
            addCriterion("advance <=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceIn(List<Double> values) {
            addCriterion("advance in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotIn(List<Double> values) {
            addCriterion("advance not in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceBetween(Double value1, Double value2) {
            addCriterion("advance between", value1, value2, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotBetween(Double value1, Double value2) {
            addCriterion("advance not between", value1, value2, "advance");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("balance like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("balance not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIsNull() {
            addCriterion("origintype is null");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIsNotNull() {
            addCriterion("origintype is not null");
            return (Criteria) this;
        }

        public Criteria andOrigintypeEqualTo(String value) {
            addCriterion("origintype =", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotEqualTo(String value) {
            addCriterion("origintype <>", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeGreaterThan(String value) {
            addCriterion("origintype >", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeGreaterThanOrEqualTo(String value) {
            addCriterion("origintype >=", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeLessThan(String value) {
            addCriterion("origintype <", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeLessThanOrEqualTo(String value) {
            addCriterion("origintype <=", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeLike(String value) {
            addCriterion("origintype like", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotLike(String value) {
            addCriterion("origintype not like", value, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeIn(List<String> values) {
            addCriterion("origintype in", values, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotIn(List<String> values) {
            addCriterion("origintype not in", values, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeBetween(String value1, String value2) {
            addCriterion("origintype between", value1, value2, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrigintypeNotBetween(String value1, String value2) {
            addCriterion("origintype not between", value1, value2, "origintype");
            return (Criteria) this;
        }

        public Criteria andOrdidIsNull() {
            addCriterion("ordid is null");
            return (Criteria) this;
        }

        public Criteria andOrdidIsNotNull() {
            addCriterion("ordid is not null");
            return (Criteria) this;
        }

        public Criteria andOrdidEqualTo(String value) {
            addCriterion("ordid =", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotEqualTo(String value) {
            addCriterion("ordid <>", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidGreaterThan(String value) {
            addCriterion("ordid >", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidGreaterThanOrEqualTo(String value) {
            addCriterion("ordid >=", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidLessThan(String value) {
            addCriterion("ordid <", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidLessThanOrEqualTo(String value) {
            addCriterion("ordid <=", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidLike(String value) {
            addCriterion("ordid like", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotLike(String value) {
            addCriterion("ordid not like", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidIn(List<String> values) {
            addCriterion("ordid in", values, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotIn(List<String> values) {
            addCriterion("ordid not in", values, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidBetween(String value1, String value2) {
            addCriterion("ordid between", value1, value2, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotBetween(String value1, String value2) {
            addCriterion("ordid not between", value1, value2, "ordid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("remark5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("remark5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("remark5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("remark5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("remark5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("remark5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("remark5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("remark5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("remark5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("remark5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("remark5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("remark5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("remark5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("remark5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNull() {
            addCriterion("remark6 is null");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNotNull() {
            addCriterion("remark6 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark6EqualTo(String value) {
            addCriterion("remark6 =", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotEqualTo(String value) {
            addCriterion("remark6 <>", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThan(String value) {
            addCriterion("remark6 >", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThanOrEqualTo(String value) {
            addCriterion("remark6 >=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThan(String value) {
            addCriterion("remark6 <", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThanOrEqualTo(String value) {
            addCriterion("remark6 <=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Like(String value) {
            addCriterion("remark6 like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotLike(String value) {
            addCriterion("remark6 not like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6In(List<String> values) {
            addCriterion("remark6 in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotIn(List<String> values) {
            addCriterion("remark6 not in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Between(String value1, String value2) {
            addCriterion("remark6 between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotBetween(String value1, String value2) {
            addCriterion("remark6 not between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark7IsNull() {
            addCriterion("remark7 is null");
            return (Criteria) this;
        }

        public Criteria andRemark7IsNotNull() {
            addCriterion("remark7 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark7EqualTo(String value) {
            addCriterion("remark7 =", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotEqualTo(String value) {
            addCriterion("remark7 <>", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThan(String value) {
            addCriterion("remark7 >", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7GreaterThanOrEqualTo(String value) {
            addCriterion("remark7 >=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThan(String value) {
            addCriterion("remark7 <", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7LessThanOrEqualTo(String value) {
            addCriterion("remark7 <=", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Like(String value) {
            addCriterion("remark7 like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotLike(String value) {
            addCriterion("remark7 not like", value, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7In(List<String> values) {
            addCriterion("remark7 in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotIn(List<String> values) {
            addCriterion("remark7 not in", values, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7Between(String value1, String value2) {
            addCriterion("remark7 between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark7NotBetween(String value1, String value2) {
            addCriterion("remark7 not between", value1, value2, "remark7");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNull() {
            addCriterion("remark8 is null");
            return (Criteria) this;
        }

        public Criteria andRemark8IsNotNull() {
            addCriterion("remark8 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark8EqualTo(String value) {
            addCriterion("remark8 =", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotEqualTo(String value) {
            addCriterion("remark8 <>", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThan(String value) {
            addCriterion("remark8 >", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8GreaterThanOrEqualTo(String value) {
            addCriterion("remark8 >=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThan(String value) {
            addCriterion("remark8 <", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8LessThanOrEqualTo(String value) {
            addCriterion("remark8 <=", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Like(String value) {
            addCriterion("remark8 like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotLike(String value) {
            addCriterion("remark8 not like", value, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8In(List<String> values) {
            addCriterion("remark8 in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotIn(List<String> values) {
            addCriterion("remark8 not in", values, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8Between(String value1, String value2) {
            addCriterion("remark8 between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark8NotBetween(String value1, String value2) {
            addCriterion("remark8 not between", value1, value2, "remark8");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNull() {
            addCriterion("remark9 is null");
            return (Criteria) this;
        }

        public Criteria andRemark9IsNotNull() {
            addCriterion("remark9 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark9EqualTo(String value) {
            addCriterion("remark9 =", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotEqualTo(String value) {
            addCriterion("remark9 <>", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThan(String value) {
            addCriterion("remark9 >", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9GreaterThanOrEqualTo(String value) {
            addCriterion("remark9 >=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThan(String value) {
            addCriterion("remark9 <", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9LessThanOrEqualTo(String value) {
            addCriterion("remark9 <=", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Like(String value) {
            addCriterion("remark9 like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotLike(String value) {
            addCriterion("remark9 not like", value, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9In(List<String> values) {
            addCriterion("remark9 in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotIn(List<String> values) {
            addCriterion("remark9 not in", values, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9Between(String value1, String value2) {
            addCriterion("remark9 between", value1, value2, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark9NotBetween(String value1, String value2) {
            addCriterion("remark9 not between", value1, value2, "remark9");
            return (Criteria) this;
        }

        public Criteria andRemark10IsNull() {
            addCriterion("remark10 is null");
            return (Criteria) this;
        }

        public Criteria andRemark10IsNotNull() {
            addCriterion("remark10 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark10EqualTo(String value) {
            addCriterion("remark10 =", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotEqualTo(String value) {
            addCriterion("remark10 <>", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10GreaterThan(String value) {
            addCriterion("remark10 >", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10GreaterThanOrEqualTo(String value) {
            addCriterion("remark10 >=", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10LessThan(String value) {
            addCriterion("remark10 <", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10LessThanOrEqualTo(String value) {
            addCriterion("remark10 <=", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10Like(String value) {
            addCriterion("remark10 like", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotLike(String value) {
            addCriterion("remark10 not like", value, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10In(List<String> values) {
            addCriterion("remark10 in", values, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotIn(List<String> values) {
            addCriterion("remark10 not in", values, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10Between(String value1, String value2) {
            addCriterion("remark10 between", value1, value2, "remark10");
            return (Criteria) this;
        }

        public Criteria andRemark10NotBetween(String value1, String value2) {
            addCriterion("remark10 not between", value1, value2, "remark10");
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