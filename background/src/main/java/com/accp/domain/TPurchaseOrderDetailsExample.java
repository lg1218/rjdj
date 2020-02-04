package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPurchaseOrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPurchaseOrderDetailsExample() {
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

        public Criteria andProdidIsNull() {
            addCriterion("prodid is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("prodid is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(Date value) {
            addCriterionForJDBCDate("prodid =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(Date value) {
            addCriterionForJDBCDate("prodid <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(Date value) {
            addCriterionForJDBCDate("prodid >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prodid >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(Date value) {
            addCriterionForJDBCDate("prodid <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prodid <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<Date> values) {
            addCriterionForJDBCDate("prodid in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<Date> values) {
            addCriterionForJDBCDate("prodid not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prodid between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prodid not between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andSernoIsNull() {
            addCriterion("serno is null");
            return (Criteria) this;
        }

        public Criteria andSernoIsNotNull() {
            addCriterion("serno is not null");
            return (Criteria) this;
        }

        public Criteria andSernoEqualTo(String value) {
            addCriterion("serno =", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotEqualTo(String value) {
            addCriterion("serno <>", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThan(String value) {
            addCriterion("serno >", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoGreaterThanOrEqualTo(String value) {
            addCriterion("serno >=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThan(String value) {
            addCriterion("serno <", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLessThanOrEqualTo(String value) {
            addCriterion("serno <=", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoLike(String value) {
            addCriterion("serno like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotLike(String value) {
            addCriterion("serno not like", value, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoIn(List<String> values) {
            addCriterion("serno in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotIn(List<String> values) {
            addCriterion("serno not in", values, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoBetween(String value1, String value2) {
            addCriterion("serno between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andSernoNotBetween(String value1, String value2) {
            addCriterion("serno not between", value1, value2, "serno");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNull() {
            addCriterion("prodname is null");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNotNull() {
            addCriterion("prodname is not null");
            return (Criteria) this;
        }

        public Criteria andProdnameEqualTo(Integer value) {
            addCriterion("prodname =", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotEqualTo(Integer value) {
            addCriterion("prodname <>", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThan(Integer value) {
            addCriterion("prodname >", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodname >=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThan(Integer value) {
            addCriterion("prodname <", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThanOrEqualTo(Integer value) {
            addCriterion("prodname <=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameIn(List<Integer> values) {
            addCriterion("prodname in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotIn(List<Integer> values) {
            addCriterion("prodname not in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameBetween(Integer value1, Integer value2) {
            addCriterion("prodname between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotBetween(Integer value1, Integer value2) {
            addCriterion("prodname not between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdsizeIsNull() {
            addCriterion("prodsize is null");
            return (Criteria) this;
        }

        public Criteria andProdsizeIsNotNull() {
            addCriterion("prodsize is not null");
            return (Criteria) this;
        }

        public Criteria andProdsizeEqualTo(String value) {
            addCriterion("prodsize =", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotEqualTo(String value) {
            addCriterion("prodsize <>", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeGreaterThan(String value) {
            addCriterion("prodsize >", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeGreaterThanOrEqualTo(String value) {
            addCriterion("prodsize >=", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLessThan(String value) {
            addCriterion("prodsize <", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLessThanOrEqualTo(String value) {
            addCriterion("prodsize <=", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeLike(String value) {
            addCriterion("prodsize like", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotLike(String value) {
            addCriterion("prodsize not like", value, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeIn(List<String> values) {
            addCriterion("prodsize in", values, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotIn(List<String> values) {
            addCriterion("prodsize not in", values, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeBetween(String value1, String value2) {
            addCriterion("prodsize between", value1, value2, "prodsize");
            return (Criteria) this;
        }

        public Criteria andProdsizeNotBetween(String value1, String value2) {
            addCriterion("prodsize not between", value1, value2, "prodsize");
            return (Criteria) this;
        }

        public Criteria andSunitidIsNull() {
            addCriterion("sunitid is null");
            return (Criteria) this;
        }

        public Criteria andSunitidIsNotNull() {
            addCriterion("sunitid is not null");
            return (Criteria) this;
        }

        public Criteria andSunitidEqualTo(Integer value) {
            addCriterion("sunitid =", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotEqualTo(Integer value) {
            addCriterion("sunitid <>", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidGreaterThan(Integer value) {
            addCriterion("sunitid >", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sunitid >=", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidLessThan(Integer value) {
            addCriterion("sunitid <", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidLessThanOrEqualTo(Integer value) {
            addCriterion("sunitid <=", value, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidIn(List<Integer> values) {
            addCriterion("sunitid in", values, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotIn(List<Integer> values) {
            addCriterion("sunitid not in", values, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidBetween(Integer value1, Integer value2) {
            addCriterion("sunitid between", value1, value2, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("sunitid not between", value1, value2, "sunitid");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNull() {
            addCriterion("squantity is null");
            return (Criteria) this;
        }

        public Criteria andSquantityIsNotNull() {
            addCriterion("squantity is not null");
            return (Criteria) this;
        }

        public Criteria andSquantityEqualTo(Integer value) {
            addCriterion("squantity =", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotEqualTo(Integer value) {
            addCriterion("squantity <>", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThan(Integer value) {
            addCriterion("squantity >", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("squantity >=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThan(Integer value) {
            addCriterion("squantity <", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityLessThanOrEqualTo(Integer value) {
            addCriterion("squantity <=", value, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityIn(List<Integer> values) {
            addCriterion("squantity in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotIn(List<Integer> values) {
            addCriterion("squantity not in", values, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityBetween(Integer value1, Integer value2) {
            addCriterion("squantity between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andSquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("squantity not between", value1, value2, "squantity");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNull() {
            addCriterion("oldprice is null");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNotNull() {
            addCriterion("oldprice is not null");
            return (Criteria) this;
        }

        public Criteria andOldpriceEqualTo(Double value) {
            addCriterion("oldprice =", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotEqualTo(Double value) {
            addCriterion("oldprice <>", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThan(Double value) {
            addCriterion("oldprice >", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oldprice >=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThan(Double value) {
            addCriterion("oldprice <", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThanOrEqualTo(Double value) {
            addCriterion("oldprice <=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIn(List<Double> values) {
            addCriterion("oldprice in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotIn(List<Double> values) {
            addCriterion("oldprice not in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceBetween(Double value1, Double value2) {
            addCriterion("oldprice between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotBetween(Double value1, Double value2) {
            addCriterion("oldprice not between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("sprice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxrate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxrate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("taxrate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("taxrate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("taxrate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("taxrate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("taxrate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("taxrate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("taxrate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("taxrate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("taxrate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("taxrate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxamtIsNull() {
            addCriterion("taxamt is null");
            return (Criteria) this;
        }

        public Criteria andTaxamtIsNotNull() {
            addCriterion("taxamt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamtEqualTo(Double value) {
            addCriterion("taxamt =", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotEqualTo(Double value) {
            addCriterion("taxamt <>", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtGreaterThan(Double value) {
            addCriterion("taxamt >", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtGreaterThanOrEqualTo(Double value) {
            addCriterion("taxamt >=", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtLessThan(Double value) {
            addCriterion("taxamt <", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtLessThanOrEqualTo(Double value) {
            addCriterion("taxamt <=", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtIn(List<Double> values) {
            addCriterion("taxamt in", values, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotIn(List<Double> values) {
            addCriterion("taxamt not in", values, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtBetween(Double value1, Double value2) {
            addCriterion("taxamt between", value1, value2, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotBetween(Double value1, Double value2) {
            addCriterion("taxamt not between", value1, value2, "taxamt");
            return (Criteria) this;
        }

        public Criteria andVftotalIsNull() {
            addCriterion("vftotal is null");
            return (Criteria) this;
        }

        public Criteria andVftotalIsNotNull() {
            addCriterion("vftotal is not null");
            return (Criteria) this;
        }

        public Criteria andVftotalEqualTo(Double value) {
            addCriterion("vftotal =", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalNotEqualTo(Double value) {
            addCriterion("vftotal <>", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalGreaterThan(Double value) {
            addCriterion("vftotal >", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalGreaterThanOrEqualTo(Double value) {
            addCriterion("vftotal >=", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalLessThan(Double value) {
            addCriterion("vftotal <", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalLessThanOrEqualTo(Double value) {
            addCriterion("vftotal <=", value, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalIn(List<Double> values) {
            addCriterion("vftotal in", values, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalNotIn(List<Double> values) {
            addCriterion("vftotal not in", values, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalBetween(Double value1, Double value2) {
            addCriterion("vftotal between", value1, value2, "vftotal");
            return (Criteria) this;
        }

        public Criteria andVftotalNotBetween(Double value1, Double value2) {
            addCriterion("vftotal not between", value1, value2, "vftotal");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNull() {
            addCriterion("isgift is null");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNotNull() {
            addCriterion("isgift is not null");
            return (Criteria) this;
        }

        public Criteria andIsgiftEqualTo(Integer value) {
            addCriterion("isgift =", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotEqualTo(Integer value) {
            addCriterion("isgift <>", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThan(Integer value) {
            addCriterion("isgift >", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("isgift >=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThan(Integer value) {
            addCriterion("isgift <", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThanOrEqualTo(Integer value) {
            addCriterion("isgift <=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftIn(List<Integer> values) {
            addCriterion("isgift in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotIn(List<Integer> values) {
            addCriterion("isgift not in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftBetween(Integer value1, Integer value2) {
            addCriterion("isgift between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotBetween(Integer value1, Integer value2) {
            addCriterion("isgift not between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNull() {
            addCriterion("trantype is null");
            return (Criteria) this;
        }

        public Criteria andTrantypeIsNotNull() {
            addCriterion("trantype is not null");
            return (Criteria) this;
        }

        public Criteria andTrantypeEqualTo(String value) {
            addCriterion("trantype =", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotEqualTo(String value) {
            addCriterion("trantype <>", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThan(String value) {
            addCriterion("trantype >", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeGreaterThanOrEqualTo(String value) {
            addCriterion("trantype >=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThan(String value) {
            addCriterion("trantype <", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLessThanOrEqualTo(String value) {
            addCriterion("trantype <=", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeLike(String value) {
            addCriterion("trantype like", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotLike(String value) {
            addCriterion("trantype not like", value, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeIn(List<String> values) {
            addCriterion("trantype in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotIn(List<String> values) {
            addCriterion("trantype not in", values, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeBetween(String value1, String value2) {
            addCriterion("trantype between", value1, value2, "trantype");
            return (Criteria) this;
        }

        public Criteria andTrantypeNotBetween(String value1, String value2) {
            addCriterion("trantype not between", value1, value2, "trantype");
            return (Criteria) this;
        }

        public Criteria andFromnoIsNull() {
            addCriterion("fromno is null");
            return (Criteria) this;
        }

        public Criteria andFromnoIsNotNull() {
            addCriterion("fromno is not null");
            return (Criteria) this;
        }

        public Criteria andFromnoEqualTo(String value) {
            addCriterion("fromno =", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotEqualTo(String value) {
            addCriterion("fromno <>", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThan(String value) {
            addCriterion("fromno >", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoGreaterThanOrEqualTo(String value) {
            addCriterion("fromno >=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThan(String value) {
            addCriterion("fromno <", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLessThanOrEqualTo(String value) {
            addCriterion("fromno <=", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoLike(String value) {
            addCriterion("fromno like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotLike(String value) {
            addCriterion("fromno not like", value, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoIn(List<String> values) {
            addCriterion("fromno in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotIn(List<String> values) {
            addCriterion("fromno not in", values, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoBetween(String value1, String value2) {
            addCriterion("fromno between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andFromnoNotBetween(String value1, String value2) {
            addCriterion("fromno not between", value1, value2, "fromno");
            return (Criteria) this;
        }

        public Criteria andItemremarkIsNull() {
            addCriterion("itemremark is null");
            return (Criteria) this;
        }

        public Criteria andItemremarkIsNotNull() {
            addCriterion("itemremark is not null");
            return (Criteria) this;
        }

        public Criteria andItemremarkEqualTo(String value) {
            addCriterion("itemremark =", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotEqualTo(String value) {
            addCriterion("itemremark <>", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThan(String value) {
            addCriterion("itemremark >", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThanOrEqualTo(String value) {
            addCriterion("itemremark >=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThan(String value) {
            addCriterion("itemremark <", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThanOrEqualTo(String value) {
            addCriterion("itemremark <=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLike(String value) {
            addCriterion("itemremark like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotLike(String value) {
            addCriterion("itemremark not like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkIn(List<String> values) {
            addCriterion("itemremark in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotIn(List<String> values) {
            addCriterion("itemremark not in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkBetween(String value1, String value2) {
            addCriterion("itemremark between", value1, value2, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotBetween(String value1, String value2) {
            addCriterion("itemremark not between", value1, value2, "itemremark");
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