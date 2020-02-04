package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KStoreAdjustpriecedetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KStoreAdjustpriecedetailExample() {
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

        public Criteria andApIdIsNull() {
            addCriterion("ap_id is null");
            return (Criteria) this;
        }

        public Criteria andApIdIsNotNull() {
            addCriterion("ap_id is not null");
            return (Criteria) this;
        }

        public Criteria andApIdEqualTo(Integer value) {
            addCriterion("ap_id =", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotEqualTo(Integer value) {
            addCriterion("ap_id <>", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThan(Integer value) {
            addCriterion("ap_id >", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_id >=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThan(Integer value) {
            addCriterion("ap_id <", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap_id <=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdIn(List<Integer> values) {
            addCriterion("ap_id in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotIn(List<Integer> values) {
            addCriterion("ap_id not in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdBetween(Integer value1, Integer value2) {
            addCriterion("ap_id between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_id not between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdIsNull() {
            addCriterion("apd_mm_id is null");
            return (Criteria) this;
        }

        public Criteria andApdMmIdIsNotNull() {
            addCriterion("apd_mm_id is not null");
            return (Criteria) this;
        }

        public Criteria andApdMmIdEqualTo(Date value) {
            addCriterionForJDBCDate("apd_mm_id =", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdNotEqualTo(Date value) {
            addCriterionForJDBCDate("apd_mm_id <>", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdGreaterThan(Date value) {
            addCriterionForJDBCDate("apd_mm_id >", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apd_mm_id >=", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdLessThan(Date value) {
            addCriterionForJDBCDate("apd_mm_id <", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apd_mm_id <=", value, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdIn(List<Date> values) {
            addCriterionForJDBCDate("apd_mm_id in", values, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdNotIn(List<Date> values) {
            addCriterionForJDBCDate("apd_mm_id not in", values, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apd_mm_id between", value1, value2, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdMmIdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apd_mm_id not between", value1, value2, "apdMmId");
            return (Criteria) this;
        }

        public Criteria andApdPronameIsNull() {
            addCriterion("apd_proname is null");
            return (Criteria) this;
        }

        public Criteria andApdPronameIsNotNull() {
            addCriterion("apd_proname is not null");
            return (Criteria) this;
        }

        public Criteria andApdPronameEqualTo(String value) {
            addCriterion("apd_proname =", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameNotEqualTo(String value) {
            addCriterion("apd_proname <>", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameGreaterThan(String value) {
            addCriterion("apd_proname >", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameGreaterThanOrEqualTo(String value) {
            addCriterion("apd_proname >=", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameLessThan(String value) {
            addCriterion("apd_proname <", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameLessThanOrEqualTo(String value) {
            addCriterion("apd_proname <=", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameLike(String value) {
            addCriterion("apd_proname like", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameNotLike(String value) {
            addCriterion("apd_proname not like", value, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameIn(List<String> values) {
            addCriterion("apd_proname in", values, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameNotIn(List<String> values) {
            addCriterion("apd_proname not in", values, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameBetween(String value1, String value2) {
            addCriterion("apd_proname between", value1, value2, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdPronameNotBetween(String value1, String value2) {
            addCriterion("apd_proname not between", value1, value2, "apdProname");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeIsNull() {
            addCriterion("apd_standardtype is null");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeIsNotNull() {
            addCriterion("apd_standardtype is not null");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeEqualTo(Integer value) {
            addCriterion("apd_standardtype =", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeNotEqualTo(Integer value) {
            addCriterion("apd_standardtype <>", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeGreaterThan(Integer value) {
            addCriterion("apd_standardtype >", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("apd_standardtype >=", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeLessThan(Integer value) {
            addCriterion("apd_standardtype <", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("apd_standardtype <=", value, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeIn(List<Integer> values) {
            addCriterion("apd_standardtype in", values, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeNotIn(List<Integer> values) {
            addCriterion("apd_standardtype not in", values, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeBetween(Integer value1, Integer value2) {
            addCriterion("apd_standardtype between", value1, value2, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdStandardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("apd_standardtype not between", value1, value2, "apdStandardtype");
            return (Criteria) this;
        }

        public Criteria andApdUnitIsNull() {
            addCriterion("apd_unit is null");
            return (Criteria) this;
        }

        public Criteria andApdUnitIsNotNull() {
            addCriterion("apd_unit is not null");
            return (Criteria) this;
        }

        public Criteria andApdUnitEqualTo(String value) {
            addCriterion("apd_unit =", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitNotEqualTo(String value) {
            addCriterion("apd_unit <>", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitGreaterThan(String value) {
            addCriterion("apd_unit >", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitGreaterThanOrEqualTo(String value) {
            addCriterion("apd_unit >=", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitLessThan(String value) {
            addCriterion("apd_unit <", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitLessThanOrEqualTo(String value) {
            addCriterion("apd_unit <=", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitLike(String value) {
            addCriterion("apd_unit like", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitNotLike(String value) {
            addCriterion("apd_unit not like", value, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitIn(List<String> values) {
            addCriterion("apd_unit in", values, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitNotIn(List<String> values) {
            addCriterion("apd_unit not in", values, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitBetween(String value1, String value2) {
            addCriterion("apd_unit between", value1, value2, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdUnitNotBetween(String value1, String value2) {
            addCriterion("apd_unit not between", value1, value2, "apdUnit");
            return (Criteria) this;
        }

        public Criteria andApdAmountIsNull() {
            addCriterion("apd_amount is null");
            return (Criteria) this;
        }

        public Criteria andApdAmountIsNotNull() {
            addCriterion("apd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApdAmountEqualTo(Integer value) {
            addCriterion("apd_amount =", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountNotEqualTo(Integer value) {
            addCriterion("apd_amount <>", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountGreaterThan(Integer value) {
            addCriterion("apd_amount >", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("apd_amount >=", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountLessThan(Integer value) {
            addCriterion("apd_amount <", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountLessThanOrEqualTo(Integer value) {
            addCriterion("apd_amount <=", value, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountIn(List<Integer> values) {
            addCriterion("apd_amount in", values, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountNotIn(List<Integer> values) {
            addCriterion("apd_amount not in", values, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountBetween(Integer value1, Integer value2) {
            addCriterion("apd_amount between", value1, value2, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("apd_amount not between", value1, value2, "apdAmount");
            return (Criteria) this;
        }

        public Criteria andApdMeancostIsNull() {
            addCriterion("apd_meancost is null");
            return (Criteria) this;
        }

        public Criteria andApdMeancostIsNotNull() {
            addCriterion("apd_meancost is not null");
            return (Criteria) this;
        }

        public Criteria andApdMeancostEqualTo(Double value) {
            addCriterion("apd_meancost =", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostNotEqualTo(Double value) {
            addCriterion("apd_meancost <>", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostGreaterThan(Double value) {
            addCriterion("apd_meancost >", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostGreaterThanOrEqualTo(Double value) {
            addCriterion("apd_meancost >=", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostLessThan(Double value) {
            addCriterion("apd_meancost <", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostLessThanOrEqualTo(Double value) {
            addCriterion("apd_meancost <=", value, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostIn(List<Double> values) {
            addCriterion("apd_meancost in", values, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostNotIn(List<Double> values) {
            addCriterion("apd_meancost not in", values, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostBetween(Double value1, Double value2) {
            addCriterion("apd_meancost between", value1, value2, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdMeancostNotBetween(Double value1, Double value2) {
            addCriterion("apd_meancost not between", value1, value2, "apdMeancost");
            return (Criteria) this;
        }

        public Criteria andApdPriceIsNull() {
            addCriterion("apd_price is null");
            return (Criteria) this;
        }

        public Criteria andApdPriceIsNotNull() {
            addCriterion("apd_price is not null");
            return (Criteria) this;
        }

        public Criteria andApdPriceEqualTo(Double value) {
            addCriterion("apd_price =", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceNotEqualTo(Double value) {
            addCriterion("apd_price <>", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceGreaterThan(Double value) {
            addCriterion("apd_price >", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("apd_price >=", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceLessThan(Double value) {
            addCriterion("apd_price <", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceLessThanOrEqualTo(Double value) {
            addCriterion("apd_price <=", value, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceIn(List<Double> values) {
            addCriterion("apd_price in", values, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceNotIn(List<Double> values) {
            addCriterion("apd_price not in", values, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceBetween(Double value1, Double value2) {
            addCriterion("apd_price between", value1, value2, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdPriceNotBetween(Double value1, Double value2) {
            addCriterion("apd_price not between", value1, value2, "apdPrice");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIsNull() {
            addCriterion("apd_money is null");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIsNotNull() {
            addCriterion("apd_money is not null");
            return (Criteria) this;
        }

        public Criteria andApdMoneyEqualTo(Double value) {
            addCriterion("apd_money =", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotEqualTo(Double value) {
            addCriterion("apd_money <>", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyGreaterThan(Double value) {
            addCriterion("apd_money >", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("apd_money >=", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyLessThan(Double value) {
            addCriterion("apd_money <", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyLessThanOrEqualTo(Double value) {
            addCriterion("apd_money <=", value, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyIn(List<Double> values) {
            addCriterion("apd_money in", values, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotIn(List<Double> values) {
            addCriterion("apd_money not in", values, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyBetween(Double value1, Double value2) {
            addCriterion("apd_money between", value1, value2, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdMoneyNotBetween(Double value1, Double value2) {
            addCriterion("apd_money not between", value1, value2, "apdMoney");
            return (Criteria) this;
        }

        public Criteria andApdRemarkIsNull() {
            addCriterion("apd_remark is null");
            return (Criteria) this;
        }

        public Criteria andApdRemarkIsNotNull() {
            addCriterion("apd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andApdRemarkEqualTo(String value) {
            addCriterion("apd_remark =", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkNotEqualTo(String value) {
            addCriterion("apd_remark <>", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkGreaterThan(String value) {
            addCriterion("apd_remark >", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("apd_remark >=", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkLessThan(String value) {
            addCriterion("apd_remark <", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkLessThanOrEqualTo(String value) {
            addCriterion("apd_remark <=", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkLike(String value) {
            addCriterion("apd_remark like", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkNotLike(String value) {
            addCriterion("apd_remark not like", value, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkIn(List<String> values) {
            addCriterion("apd_remark in", values, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkNotIn(List<String> values) {
            addCriterion("apd_remark not in", values, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkBetween(String value1, String value2) {
            addCriterion("apd_remark between", value1, value2, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdRemarkNotBetween(String value1, String value2) {
            addCriterion("apd_remark not between", value1, value2, "apdRemark");
            return (Criteria) this;
        }

        public Criteria andApdBy1IsNull() {
            addCriterion("apd_By1 is null");
            return (Criteria) this;
        }

        public Criteria andApdBy1IsNotNull() {
            addCriterion("apd_By1 is not null");
            return (Criteria) this;
        }

        public Criteria andApdBy1EqualTo(String value) {
            addCriterion("apd_By1 =", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1NotEqualTo(String value) {
            addCriterion("apd_By1 <>", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1GreaterThan(String value) {
            addCriterion("apd_By1 >", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1GreaterThanOrEqualTo(String value) {
            addCriterion("apd_By1 >=", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1LessThan(String value) {
            addCriterion("apd_By1 <", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1LessThanOrEqualTo(String value) {
            addCriterion("apd_By1 <=", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1Like(String value) {
            addCriterion("apd_By1 like", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1NotLike(String value) {
            addCriterion("apd_By1 not like", value, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1In(List<String> values) {
            addCriterion("apd_By1 in", values, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1NotIn(List<String> values) {
            addCriterion("apd_By1 not in", values, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1Between(String value1, String value2) {
            addCriterion("apd_By1 between", value1, value2, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy1NotBetween(String value1, String value2) {
            addCriterion("apd_By1 not between", value1, value2, "apdBy1");
            return (Criteria) this;
        }

        public Criteria andApdBy2IsNull() {
            addCriterion("apd_By2 is null");
            return (Criteria) this;
        }

        public Criteria andApdBy2IsNotNull() {
            addCriterion("apd_By2 is not null");
            return (Criteria) this;
        }

        public Criteria andApdBy2EqualTo(String value) {
            addCriterion("apd_By2 =", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2NotEqualTo(String value) {
            addCriterion("apd_By2 <>", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2GreaterThan(String value) {
            addCriterion("apd_By2 >", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2GreaterThanOrEqualTo(String value) {
            addCriterion("apd_By2 >=", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2LessThan(String value) {
            addCriterion("apd_By2 <", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2LessThanOrEqualTo(String value) {
            addCriterion("apd_By2 <=", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2Like(String value) {
            addCriterion("apd_By2 like", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2NotLike(String value) {
            addCriterion("apd_By2 not like", value, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2In(List<String> values) {
            addCriterion("apd_By2 in", values, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2NotIn(List<String> values) {
            addCriterion("apd_By2 not in", values, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2Between(String value1, String value2) {
            addCriterion("apd_By2 between", value1, value2, "apdBy2");
            return (Criteria) this;
        }

        public Criteria andApdBy2NotBetween(String value1, String value2) {
            addCriterion("apd_By2 not between", value1, value2, "apdBy2");
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