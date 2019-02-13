package com.mt.vuedemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNull() {
            addCriterion("articleName is null");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNotNull() {
            addCriterion("articleName is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenameEqualTo(String value) {
            addCriterion("articleName =", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotEqualTo(String value) {
            addCriterion("articleName <>", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThan(String value) {
            addCriterion("articleName >", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThanOrEqualTo(String value) {
            addCriterion("articleName >=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThan(String value) {
            addCriterion("articleName <", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThanOrEqualTo(String value) {
            addCriterion("articleName <=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLike(String value) {
            addCriterion("articleName like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotLike(String value) {
            addCriterion("articleName not like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameIn(List<String> values) {
            addCriterion("articleName in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotIn(List<String> values) {
            addCriterion("articleName not in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameBetween(String value1, String value2) {
            addCriterion("articleName between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotBetween(String value1, String value2) {
            addCriterion("articleName not between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticledescIsNull() {
            addCriterion("articleDesc is null");
            return (Criteria) this;
        }

        public Criteria andArticledescIsNotNull() {
            addCriterion("articleDesc is not null");
            return (Criteria) this;
        }

        public Criteria andArticledescEqualTo(String value) {
            addCriterion("articleDesc =", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescNotEqualTo(String value) {
            addCriterion("articleDesc <>", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescGreaterThan(String value) {
            addCriterion("articleDesc >", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescGreaterThanOrEqualTo(String value) {
            addCriterion("articleDesc >=", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescLessThan(String value) {
            addCriterion("articleDesc <", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescLessThanOrEqualTo(String value) {
            addCriterion("articleDesc <=", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescLike(String value) {
            addCriterion("articleDesc like", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescNotLike(String value) {
            addCriterion("articleDesc not like", value, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescIn(List<String> values) {
            addCriterion("articleDesc in", values, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescNotIn(List<String> values) {
            addCriterion("articleDesc not in", values, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescBetween(String value1, String value2) {
            addCriterion("articleDesc between", value1, value2, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticledescNotBetween(String value1, String value2) {
            addCriterion("articleDesc not between", value1, value2, "articledesc");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIsNull() {
            addCriterion("articleAuthor is null");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIsNotNull() {
            addCriterion("articleAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andArticleauthorEqualTo(String value) {
            addCriterion("articleAuthor =", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotEqualTo(String value) {
            addCriterion("articleAuthor <>", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorGreaterThan(String value) {
            addCriterion("articleAuthor >", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorGreaterThanOrEqualTo(String value) {
            addCriterion("articleAuthor >=", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorLessThan(String value) {
            addCriterion("articleAuthor <", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorLessThanOrEqualTo(String value) {
            addCriterion("articleAuthor <=", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorLike(String value) {
            addCriterion("articleAuthor like", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotLike(String value) {
            addCriterion("articleAuthor not like", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIn(List<String> values) {
            addCriterion("articleAuthor in", values, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotIn(List<String> values) {
            addCriterion("articleAuthor not in", values, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorBetween(String value1, String value2) {
            addCriterion("articleAuthor between", value1, value2, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotBetween(String value1, String value2) {
            addCriterion("articleAuthor not between", value1, value2, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andIdtoppingIsNull() {
            addCriterion("idTopping is null");
            return (Criteria) this;
        }

        public Criteria andIdtoppingIsNotNull() {
            addCriterion("idTopping is not null");
            return (Criteria) this;
        }

        public Criteria andIdtoppingEqualTo(Integer value) {
            addCriterion("idTopping =", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingNotEqualTo(Integer value) {
            addCriterion("idTopping <>", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingGreaterThan(Integer value) {
            addCriterion("idTopping >", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingGreaterThanOrEqualTo(Integer value) {
            addCriterion("idTopping >=", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingLessThan(Integer value) {
            addCriterion("idTopping <", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingLessThanOrEqualTo(Integer value) {
            addCriterion("idTopping <=", value, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingIn(List<Integer> values) {
            addCriterion("idTopping in", values, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingNotIn(List<Integer> values) {
            addCriterion("idTopping not in", values, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingBetween(Integer value1, Integer value2) {
            addCriterion("idTopping between", value1, value2, "idtopping");
            return (Criteria) this;
        }

        public Criteria andIdtoppingNotBetween(Integer value1, Integer value2) {
            addCriterion("idTopping not between", value1, value2, "idtopping");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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