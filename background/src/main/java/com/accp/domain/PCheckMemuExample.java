package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PCheckMemuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PCheckMemuExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMeBillnoIsNull() {
            addCriterion("me_billno is null");
            return (Criteria) this;
        }

        public Criteria andMeBillnoIsNotNull() {
            addCriterion("me_billno is not null");
            return (Criteria) this;
        }

        public Criteria andMeBillnoEqualTo(String value) {
            addCriterion("me_billno =", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotEqualTo(String value) {
            addCriterion("me_billno <>", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoGreaterThan(String value) {
            addCriterion("me_billno >", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("me_billno >=", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLessThan(String value) {
            addCriterion("me_billno <", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLessThanOrEqualTo(String value) {
            addCriterion("me_billno <=", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLike(String value) {
            addCriterion("me_billno like", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotLike(String value) {
            addCriterion("me_billno not like", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoIn(List<String> values) {
            addCriterion("me_billno in", values, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotIn(List<String> values) {
            addCriterion("me_billno not in", values, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoBetween(String value1, String value2) {
            addCriterion("me_billno between", value1, value2, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotBetween(String value1, String value2) {
            addCriterion("me_billno not between", value1, value2, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateIsNull() {
            addCriterion("me_adjustdate is null");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateIsNotNull() {
            addCriterion("me_adjustdate is not null");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateEqualTo(Date value) {
            addCriterionForJDBCDate("me_adjustdate =", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("me_adjustdate <>", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateGreaterThan(Date value) {
            addCriterionForJDBCDate("me_adjustdate >", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("me_adjustdate >=", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateLessThan(Date value) {
            addCriterionForJDBCDate("me_adjustdate <", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("me_adjustdate <=", value, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateIn(List<Date> values) {
            addCriterionForJDBCDate("me_adjustdate in", values, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("me_adjustdate not in", values, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("me_adjustdate between", value1, value2, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeAdjustdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("me_adjustdate not between", value1, value2, "meAdjustdate");
            return (Criteria) this;
        }

        public Criteria andMeWareidIsNull() {
            addCriterion("me_wareid is null");
            return (Criteria) this;
        }

        public Criteria andMeWareidIsNotNull() {
            addCriterion("me_wareid is not null");
            return (Criteria) this;
        }

        public Criteria andMeWareidEqualTo(Integer value) {
            addCriterion("me_wareid =", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidNotEqualTo(Integer value) {
            addCriterion("me_wareid <>", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidGreaterThan(Integer value) {
            addCriterion("me_wareid >", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_wareid >=", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidLessThan(Integer value) {
            addCriterion("me_wareid <", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidLessThanOrEqualTo(Integer value) {
            addCriterion("me_wareid <=", value, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidIn(List<Integer> values) {
            addCriterion("me_wareid in", values, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidNotIn(List<Integer> values) {
            addCriterion("me_wareid not in", values, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidBetween(Integer value1, Integer value2) {
            addCriterion("me_wareid between", value1, value2, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeWareidNotBetween(Integer value1, Integer value2) {
            addCriterion("me_wareid not between", value1, value2, "meWareid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidIsNull() {
            addCriterion("me_salesid is null");
            return (Criteria) this;
        }

        public Criteria andMeSalesidIsNotNull() {
            addCriterion("me_salesid is not null");
            return (Criteria) this;
        }

        public Criteria andMeSalesidEqualTo(Integer value) {
            addCriterion("me_salesid =", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidNotEqualTo(Integer value) {
            addCriterion("me_salesid <>", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidGreaterThan(Integer value) {
            addCriterion("me_salesid >", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_salesid >=", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidLessThan(Integer value) {
            addCriterion("me_salesid <", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidLessThanOrEqualTo(Integer value) {
            addCriterion("me_salesid <=", value, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidIn(List<Integer> values) {
            addCriterion("me_salesid in", values, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidNotIn(List<Integer> values) {
            addCriterion("me_salesid not in", values, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidBetween(Integer value1, Integer value2) {
            addCriterion("me_salesid between", value1, value2, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeSalesidNotBetween(Integer value1, Integer value2) {
            addCriterion("me_salesid not between", value1, value2, "meSalesid");
            return (Criteria) this;
        }

        public Criteria andMeMakerIsNull() {
            addCriterion("me_maker is null");
            return (Criteria) this;
        }

        public Criteria andMeMakerIsNotNull() {
            addCriterion("me_maker is not null");
            return (Criteria) this;
        }

        public Criteria andMeMakerEqualTo(String value) {
            addCriterion("me_maker =", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerNotEqualTo(String value) {
            addCriterion("me_maker <>", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerGreaterThan(String value) {
            addCriterion("me_maker >", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerGreaterThanOrEqualTo(String value) {
            addCriterion("me_maker >=", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerLessThan(String value) {
            addCriterion("me_maker <", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerLessThanOrEqualTo(String value) {
            addCriterion("me_maker <=", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerLike(String value) {
            addCriterion("me_maker like", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerNotLike(String value) {
            addCriterion("me_maker not like", value, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerIn(List<String> values) {
            addCriterion("me_maker in", values, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerNotIn(List<String> values) {
            addCriterion("me_maker not in", values, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerBetween(String value1, String value2) {
            addCriterion("me_maker between", value1, value2, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeMakerNotBetween(String value1, String value2) {
            addCriterion("me_maker not between", value1, value2, "meMaker");
            return (Criteria) this;
        }

        public Criteria andMeDepartidIsNull() {
            addCriterion("me_departid is null");
            return (Criteria) this;
        }

        public Criteria andMeDepartidIsNotNull() {
            addCriterion("me_departid is not null");
            return (Criteria) this;
        }

        public Criteria andMeDepartidEqualTo(String value) {
            addCriterion("me_departid =", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidNotEqualTo(String value) {
            addCriterion("me_departid <>", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidGreaterThan(String value) {
            addCriterion("me_departid >", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidGreaterThanOrEqualTo(String value) {
            addCriterion("me_departid >=", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidLessThan(String value) {
            addCriterion("me_departid <", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidLessThanOrEqualTo(String value) {
            addCriterion("me_departid <=", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidLike(String value) {
            addCriterion("me_departid like", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidNotLike(String value) {
            addCriterion("me_departid not like", value, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidIn(List<String> values) {
            addCriterion("me_departid in", values, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidNotIn(List<String> values) {
            addCriterion("me_departid not in", values, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidBetween(String value1, String value2) {
            addCriterion("me_departid between", value1, value2, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMeDepartidNotBetween(String value1, String value2) {
            addCriterion("me_departid not between", value1, value2, "meDepartid");
            return (Criteria) this;
        }

        public Criteria andMePermitterIsNull() {
            addCriterion("me_permitter is null");
            return (Criteria) this;
        }

        public Criteria andMePermitterIsNotNull() {
            addCriterion("me_permitter is not null");
            return (Criteria) this;
        }

        public Criteria andMePermitterEqualTo(String value) {
            addCriterion("me_permitter =", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterNotEqualTo(String value) {
            addCriterion("me_permitter <>", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterGreaterThan(String value) {
            addCriterion("me_permitter >", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterGreaterThanOrEqualTo(String value) {
            addCriterion("me_permitter >=", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterLessThan(String value) {
            addCriterion("me_permitter <", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterLessThanOrEqualTo(String value) {
            addCriterion("me_permitter <=", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterLike(String value) {
            addCriterion("me_permitter like", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterNotLike(String value) {
            addCriterion("me_permitter not like", value, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterIn(List<String> values) {
            addCriterion("me_permitter in", values, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterNotIn(List<String> values) {
            addCriterion("me_permitter not in", values, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterBetween(String value1, String value2) {
            addCriterion("me_permitter between", value1, value2, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMePermitterNotBetween(String value1, String value2) {
            addCriterion("me_permitter not between", value1, value2, "mePermitter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterIsNull() {
            addCriterion("me_zerofilter is null");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterIsNotNull() {
            addCriterion("me_zerofilter is not null");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterEqualTo(Integer value) {
            addCriterion("me_zerofilter =", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterNotEqualTo(Integer value) {
            addCriterion("me_zerofilter <>", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterGreaterThan(Integer value) {
            addCriterion("me_zerofilter >", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_zerofilter >=", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterLessThan(Integer value) {
            addCriterion("me_zerofilter <", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterLessThanOrEqualTo(Integer value) {
            addCriterion("me_zerofilter <=", value, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterIn(List<Integer> values) {
            addCriterion("me_zerofilter in", values, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterNotIn(List<Integer> values) {
            addCriterion("me_zerofilter not in", values, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterBetween(Integer value1, Integer value2) {
            addCriterion("me_zerofilter between", value1, value2, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andMeZerofilterNotBetween(Integer value1, Integer value2) {
            addCriterion("me_zerofilter not between", value1, value2, "meZerofilter");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNull() {
            addCriterion("byzd1 is null");
            return (Criteria) this;
        }

        public Criteria andByzd1IsNotNull() {
            addCriterion("byzd1 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd1EqualTo(String value) {
            addCriterion("byzd1 =", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotEqualTo(String value) {
            addCriterion("byzd1 <>", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThan(String value) {
            addCriterion("byzd1 >", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("byzd1 >=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThan(String value) {
            addCriterion("byzd1 <", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1LessThanOrEqualTo(String value) {
            addCriterion("byzd1 <=", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Like(String value) {
            addCriterion("byzd1 like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotLike(String value) {
            addCriterion("byzd1 not like", value, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1In(List<String> values) {
            addCriterion("byzd1 in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotIn(List<String> values) {
            addCriterion("byzd1 not in", values, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1Between(String value1, String value2) {
            addCriterion("byzd1 between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd1NotBetween(String value1, String value2) {
            addCriterion("byzd1 not between", value1, value2, "byzd1");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNull() {
            addCriterion("byzd2 is null");
            return (Criteria) this;
        }

        public Criteria andByzd2IsNotNull() {
            addCriterion("byzd2 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd2EqualTo(String value) {
            addCriterion("byzd2 =", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotEqualTo(String value) {
            addCriterion("byzd2 <>", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThan(String value) {
            addCriterion("byzd2 >", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("byzd2 >=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThan(String value) {
            addCriterion("byzd2 <", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2LessThanOrEqualTo(String value) {
            addCriterion("byzd2 <=", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Like(String value) {
            addCriterion("byzd2 like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotLike(String value) {
            addCriterion("byzd2 not like", value, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2In(List<String> values) {
            addCriterion("byzd2 in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotIn(List<String> values) {
            addCriterion("byzd2 not in", values, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2Between(String value1, String value2) {
            addCriterion("byzd2 between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd2NotBetween(String value1, String value2) {
            addCriterion("byzd2 not between", value1, value2, "byzd2");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNull() {
            addCriterion("byzd3 is null");
            return (Criteria) this;
        }

        public Criteria andByzd3IsNotNull() {
            addCriterion("byzd3 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd3EqualTo(String value) {
            addCriterion("byzd3 =", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotEqualTo(String value) {
            addCriterion("byzd3 <>", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThan(String value) {
            addCriterion("byzd3 >", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3GreaterThanOrEqualTo(String value) {
            addCriterion("byzd3 >=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThan(String value) {
            addCriterion("byzd3 <", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3LessThanOrEqualTo(String value) {
            addCriterion("byzd3 <=", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3Like(String value) {
            addCriterion("byzd3 like", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotLike(String value) {
            addCriterion("byzd3 not like", value, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3In(List<String> values) {
            addCriterion("byzd3 in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotIn(List<String> values) {
            addCriterion("byzd3 not in", values, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3Between(String value1, String value2) {
            addCriterion("byzd3 between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd3NotBetween(String value1, String value2) {
            addCriterion("byzd3 not between", value1, value2, "byzd3");
            return (Criteria) this;
        }

        public Criteria andByzd4IsNull() {
            addCriterion("byzd4 is null");
            return (Criteria) this;
        }

        public Criteria andByzd4IsNotNull() {
            addCriterion("byzd4 is not null");
            return (Criteria) this;
        }

        public Criteria andByzd4EqualTo(String value) {
            addCriterion("byzd4 =", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotEqualTo(String value) {
            addCriterion("byzd4 <>", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4GreaterThan(String value) {
            addCriterion("byzd4 >", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4GreaterThanOrEqualTo(String value) {
            addCriterion("byzd4 >=", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4LessThan(String value) {
            addCriterion("byzd4 <", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4LessThanOrEqualTo(String value) {
            addCriterion("byzd4 <=", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4Like(String value) {
            addCriterion("byzd4 like", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotLike(String value) {
            addCriterion("byzd4 not like", value, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4In(List<String> values) {
            addCriterion("byzd4 in", values, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotIn(List<String> values) {
            addCriterion("byzd4 not in", values, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4Between(String value1, String value2) {
            addCriterion("byzd4 between", value1, value2, "byzd4");
            return (Criteria) this;
        }

        public Criteria andByzd4NotBetween(String value1, String value2) {
            addCriterion("byzd4 not between", value1, value2, "byzd4");
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