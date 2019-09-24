package com.sysu.goingpub.model;

import java.util.ArrayList;
import java.util.List;

public class JournalExample {
    /**
     * journal
     */
    protected String orderByClause;

    /**
     * journal
     */
    protected boolean distinct;

    /**
     * journal
     */
    protected List<Criteria> oredCriteria;

    /**
     * journal
     */
    protected Integer limitStart;

    /**
     * journal
     */
    protected Integer limitEnd;

    /**
     *
     * @mbg.generated
     */
    public JournalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbg.generated
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * journal null
     */
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

        public Criteria andIssnIsNull() {
            addCriterion("ISSN is null");
            return (Criteria) this;
        }

        public Criteria andIssnIsNotNull() {
            addCriterion("ISSN is not null");
            return (Criteria) this;
        }

        public Criteria andIssnEqualTo(String value) {
            addCriterion("ISSN =", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotEqualTo(String value) {
            addCriterion("ISSN <>", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThan(String value) {
            addCriterion("ISSN >", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThanOrEqualTo(String value) {
            addCriterion("ISSN >=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThan(String value) {
            addCriterion("ISSN <", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThanOrEqualTo(String value) {
            addCriterion("ISSN <=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLike(String value) {
            addCriterion("ISSN like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotLike(String value) {
            addCriterion("ISSN not like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnIn(List<String> values) {
            addCriterion("ISSN in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotIn(List<String> values) {
            addCriterion("ISSN not in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnBetween(String value1, String value2) {
            addCriterion("ISSN between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotBetween(String value1, String value2) {
            addCriterion("ISSN not between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andJournalIsNull() {
            addCriterion("Journal is null");
            return (Criteria) this;
        }

        public Criteria andJournalIsNotNull() {
            addCriterion("Journal is not null");
            return (Criteria) this;
        }

        public Criteria andJournalEqualTo(String value) {
            addCriterion("Journal =", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalNotEqualTo(String value) {
            addCriterion("Journal <>", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalGreaterThan(String value) {
            addCriterion("Journal >", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalGreaterThanOrEqualTo(String value) {
            addCriterion("Journal >=", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalLessThan(String value) {
            addCriterion("Journal <", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalLessThanOrEqualTo(String value) {
            addCriterion("Journal <=", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalLike(String value) {
            addCriterion("Journal like", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalNotLike(String value) {
            addCriterion("Journal not like", value, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalIn(List<String> values) {
            addCriterion("Journal in", values, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalNotIn(List<String> values) {
            addCriterion("Journal not in", values, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalBetween(String value1, String value2) {
            addCriterion("Journal between", value1, value2, "journal");
            return (Criteria) this;
        }

        public Criteria andJournalNotBetween(String value1, String value2) {
            addCriterion("Journal not between", value1, value2, "journal");
            return (Criteria) this;
        }

        public Criteria andAbbrNameIsNull() {
            addCriterion("Abbr_Name is null");
            return (Criteria) this;
        }

        public Criteria andAbbrNameIsNotNull() {
            addCriterion("Abbr_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrNameEqualTo(String value) {
            addCriterion("Abbr_Name =", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameNotEqualTo(String value) {
            addCriterion("Abbr_Name <>", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameGreaterThan(String value) {
            addCriterion("Abbr_Name >", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("Abbr_Name >=", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameLessThan(String value) {
            addCriterion("Abbr_Name <", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameLessThanOrEqualTo(String value) {
            addCriterion("Abbr_Name <=", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameLike(String value) {
            addCriterion("Abbr_Name like", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameNotLike(String value) {
            addCriterion("Abbr_Name not like", value, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameIn(List<String> values) {
            addCriterion("Abbr_Name in", values, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameNotIn(List<String> values) {
            addCriterion("Abbr_Name not in", values, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameBetween(String value1, String value2) {
            addCriterion("Abbr_Name between", value1, value2, "abbrName");
            return (Criteria) this;
        }

        public Criteria andAbbrNameNotBetween(String value1, String value2) {
            addCriterion("Abbr_Name not between", value1, value2, "abbrName");
            return (Criteria) this;
        }

        public Criteria andIsSciIsNull() {
            addCriterion("Is_SCI is null");
            return (Criteria) this;
        }

        public Criteria andIsSciIsNotNull() {
            addCriterion("Is_SCI is not null");
            return (Criteria) this;
        }

        public Criteria andIsSciEqualTo(String value) {
            addCriterion("Is_SCI =", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciNotEqualTo(String value) {
            addCriterion("Is_SCI <>", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciGreaterThan(String value) {
            addCriterion("Is_SCI >", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciGreaterThanOrEqualTo(String value) {
            addCriterion("Is_SCI >=", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciLessThan(String value) {
            addCriterion("Is_SCI <", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciLessThanOrEqualTo(String value) {
            addCriterion("Is_SCI <=", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciLike(String value) {
            addCriterion("Is_SCI like", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciNotLike(String value) {
            addCriterion("Is_SCI not like", value, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciIn(List<String> values) {
            addCriterion("Is_SCI in", values, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciNotIn(List<String> values) {
            addCriterion("Is_SCI not in", values, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciBetween(String value1, String value2) {
            addCriterion("Is_SCI between", value1, value2, "isSci");
            return (Criteria) this;
        }

        public Criteria andIsSciNotBetween(String value1, String value2) {
            addCriterion("Is_SCI not between", value1, value2, "isSci");
            return (Criteria) this;
        }

        public Criteria andIf2018IsNull() {
            addCriterion("IF2018 is null");
            return (Criteria) this;
        }

        public Criteria andIf2018IsNotNull() {
            addCriterion("IF2018 is not null");
            return (Criteria) this;
        }

        public Criteria andIf2018EqualTo(Double value) {
            addCriterion("IF2018 =", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018NotEqualTo(Double value) {
            addCriterion("IF2018 <>", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018GreaterThan(Double value) {
            addCriterion("IF2018 >", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018GreaterThanOrEqualTo(Double value) {
            addCriterion("IF2018 >=", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018LessThan(Double value) {
            addCriterion("IF2018 <", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018LessThanOrEqualTo(Double value) {
            addCriterion("IF2018 <=", value, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018In(List<Double> values) {
            addCriterion("IF2018 in", values, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018NotIn(List<Double> values) {
            addCriterion("IF2018 not in", values, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018Between(Double value1, Double value2) {
            addCriterion("IF2018 between", value1, value2, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf2018NotBetween(Double value1, Double value2) {
            addCriterion("IF2018 not between", value1, value2, "if2018");
            return (Criteria) this;
        }

        public Criteria andIf5yearIsNull() {
            addCriterion("IF_5year is null");
            return (Criteria) this;
        }

        public Criteria andIf5yearIsNotNull() {
            addCriterion("IF_5year is not null");
            return (Criteria) this;
        }

        public Criteria andIf5yearEqualTo(Double value) {
            addCriterion("IF_5year =", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearNotEqualTo(Double value) {
            addCriterion("IF_5year <>", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearGreaterThan(Double value) {
            addCriterion("IF_5year >", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearGreaterThanOrEqualTo(Double value) {
            addCriterion("IF_5year >=", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearLessThan(Double value) {
            addCriterion("IF_5year <", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearLessThanOrEqualTo(Double value) {
            addCriterion("IF_5year <=", value, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearIn(List<Double> values) {
            addCriterion("IF_5year in", values, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearNotIn(List<Double> values) {
            addCriterion("IF_5year not in", values, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearBetween(Double value1, Double value2) {
            addCriterion("IF_5year between", value1, value2, "if5year");
            return (Criteria) this;
        }

        public Criteria andIf5yearNotBetween(Double value1, Double value2) {
            addCriterion("IF_5year not between", value1, value2, "if5year");
            return (Criteria) this;
        }

        public Criteria andSelfCitingIsNull() {
            addCriterion("Self_citing is null");
            return (Criteria) this;
        }

        public Criteria andSelfCitingIsNotNull() {
            addCriterion("Self_citing is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCitingEqualTo(Double value) {
            addCriterion("Self_citing =", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingNotEqualTo(Double value) {
            addCriterion("Self_citing <>", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingGreaterThan(Double value) {
            addCriterion("Self_citing >", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingGreaterThanOrEqualTo(Double value) {
            addCriterion("Self_citing >=", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingLessThan(Double value) {
            addCriterion("Self_citing <", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingLessThanOrEqualTo(Double value) {
            addCriterion("Self_citing <=", value, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingIn(List<Double> values) {
            addCriterion("Self_citing in", values, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingNotIn(List<Double> values) {
            addCriterion("Self_citing not in", values, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingBetween(Double value1, Double value2) {
            addCriterion("Self_citing between", value1, value2, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andSelfCitingNotBetween(Double value1, Double value2) {
            addCriterion("Self_citing not between", value1, value2, "selfCiting");
            return (Criteria) this;
        }

        public Criteria andHIndexIsNull() {
            addCriterion("H_Index is null");
            return (Criteria) this;
        }

        public Criteria andHIndexIsNotNull() {
            addCriterion("H_Index is not null");
            return (Criteria) this;
        }

        public Criteria andHIndexEqualTo(Integer value) {
            addCriterion("H_Index =", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexNotEqualTo(Integer value) {
            addCriterion("H_Index <>", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexGreaterThan(Integer value) {
            addCriterion("H_Index >", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("H_Index >=", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexLessThan(Integer value) {
            addCriterion("H_Index <", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexLessThanOrEqualTo(Integer value) {
            addCriterion("H_Index <=", value, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexIn(List<Integer> values) {
            addCriterion("H_Index in", values, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexNotIn(List<Integer> values) {
            addCriterion("H_Index not in", values, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexBetween(Integer value1, Integer value2) {
            addCriterion("H_Index between", value1, value2, "hIndex");
            return (Criteria) this;
        }

        public Criteria andHIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("H_Index not between", value1, value2, "hIndex");
            return (Criteria) this;
        }

        public Criteria andCitescoreIsNull() {
            addCriterion("CiteScore is null");
            return (Criteria) this;
        }

        public Criteria andCitescoreIsNotNull() {
            addCriterion("CiteScore is not null");
            return (Criteria) this;
        }

        public Criteria andCitescoreEqualTo(Double value) {
            addCriterion("CiteScore =", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreNotEqualTo(Double value) {
            addCriterion("CiteScore <>", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreGreaterThan(Double value) {
            addCriterion("CiteScore >", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreGreaterThanOrEqualTo(Double value) {
            addCriterion("CiteScore >=", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreLessThan(Double value) {
            addCriterion("CiteScore <", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreLessThanOrEqualTo(Double value) {
            addCriterion("CiteScore <=", value, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreIn(List<Double> values) {
            addCriterion("CiteScore in", values, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreNotIn(List<Double> values) {
            addCriterion("CiteScore not in", values, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreBetween(Double value1, Double value2) {
            addCriterion("CiteScore between", value1, value2, "citescore");
            return (Criteria) this;
        }

        public Criteria andCitescoreNotBetween(Double value1, Double value2) {
            addCriterion("CiteScore not between", value1, value2, "citescore");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNull() {
            addCriterion("Division is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNotNull() {
            addCriterion("Division is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionEqualTo(String value) {
            addCriterion("Division =", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotEqualTo(String value) {
            addCriterion("Division <>", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThan(String value) {
            addCriterion("Division >", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("Division >=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThan(String value) {
            addCriterion("Division <", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThanOrEqualTo(String value) {
            addCriterion("Division <=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLike(String value) {
            addCriterion("Division like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotLike(String value) {
            addCriterion("Division not like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionIn(List<String> values) {
            addCriterion("Division in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotIn(List<String> values) {
            addCriterion("Division not in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionBetween(String value1, String value2) {
            addCriterion("Division between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotBetween(String value1, String value2) {
            addCriterion("Division not between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("Category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("Category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsNull() {
            addCriterion("Discipline is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineIsNotNull() {
            addCriterion("Discipline is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineEqualTo(String value) {
            addCriterion("Discipline =", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineNotEqualTo(String value) {
            addCriterion("Discipline <>", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineGreaterThan(String value) {
            addCriterion("Discipline >", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineGreaterThanOrEqualTo(String value) {
            addCriterion("Discipline >=", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineLessThan(String value) {
            addCriterion("Discipline <", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineLessThanOrEqualTo(String value) {
            addCriterion("Discipline <=", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineLike(String value) {
            addCriterion("Discipline like", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineNotLike(String value) {
            addCriterion("Discipline not like", value, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineIn(List<String> values) {
            addCriterion("Discipline in", values, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineNotIn(List<String> values) {
            addCriterion("Discipline not in", values, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineBetween(String value1, String value2) {
            addCriterion("Discipline between", value1, value2, "discipline");
            return (Criteria) this;
        }

        public Criteria andDisciplineNotBetween(String value1, String value2) {
            addCriterion("Discipline not between", value1, value2, "discipline");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("IsTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("IsTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(String value) {
            addCriterion("IsTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(String value) {
            addCriterion("IsTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(String value) {
            addCriterion("IsTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(String value) {
            addCriterion("IsTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(String value) {
            addCriterion("IsTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(String value) {
            addCriterion("IsTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLike(String value) {
            addCriterion("IsTop like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotLike(String value) {
            addCriterion("IsTop not like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<String> values) {
            addCriterion("IsTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<String> values) {
            addCriterion("IsTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(String value1, String value2) {
            addCriterion("IsTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(String value1, String value2) {
            addCriterion("IsTop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIsreviewIsNull() {
            addCriterion("IsReview is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewIsNotNull() {
            addCriterion("IsReview is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewEqualTo(String value) {
            addCriterion("IsReview =", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotEqualTo(String value) {
            addCriterion("IsReview <>", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThan(String value) {
            addCriterion("IsReview >", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThanOrEqualTo(String value) {
            addCriterion("IsReview >=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThan(String value) {
            addCriterion("IsReview <", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThanOrEqualTo(String value) {
            addCriterion("IsReview <=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLike(String value) {
            addCriterion("IsReview like", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotLike(String value) {
            addCriterion("IsReview not like", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewIn(List<String> values) {
            addCriterion("IsReview in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotIn(List<String> values) {
            addCriterion("IsReview not in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewBetween(String value1, String value2) {
            addCriterion("IsReview between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotBetween(String value1, String value2) {
            addCriterion("IsReview not between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleIsNull() {
            addCriterion("Publication_Cycle is null");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleIsNotNull() {
            addCriterion("Publication_Cycle is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleEqualTo(String value) {
            addCriterion("Publication_Cycle =", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleNotEqualTo(String value) {
            addCriterion("Publication_Cycle <>", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleGreaterThan(String value) {
            addCriterion("Publication_Cycle >", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleGreaterThanOrEqualTo(String value) {
            addCriterion("Publication_Cycle >=", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleLessThan(String value) {
            addCriterion("Publication_Cycle <", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleLessThanOrEqualTo(String value) {
            addCriterion("Publication_Cycle <=", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleLike(String value) {
            addCriterion("Publication_Cycle like", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleNotLike(String value) {
            addCriterion("Publication_Cycle not like", value, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleIn(List<String> values) {
            addCriterion("Publication_Cycle in", values, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleNotIn(List<String> values) {
            addCriterion("Publication_Cycle not in", values, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleBetween(String value1, String value2) {
            addCriterion("Publication_Cycle between", value1, value2, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andPublicationCycleNotBetween(String value1, String value2) {
            addCriterion("Publication_Cycle not between", value1, value2, "publicationCycle");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearIsNull() {
            addCriterion("Article_NO_per_year is null");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearIsNotNull() {
            addCriterion("Article_NO_per_year is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearEqualTo(Integer value) {
            addCriterion("Article_NO_per_year =", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearNotEqualTo(Integer value) {
            addCriterion("Article_NO_per_year <>", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearGreaterThan(Integer value) {
            addCriterion("Article_NO_per_year >", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Article_NO_per_year >=", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearLessThan(Integer value) {
            addCriterion("Article_NO_per_year <", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearLessThanOrEqualTo(Integer value) {
            addCriterion("Article_NO_per_year <=", value, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearIn(List<Integer> values) {
            addCriterion("Article_NO_per_year in", values, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearNotIn(List<Integer> values) {
            addCriterion("Article_NO_per_year not in", values, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearBetween(Integer value1, Integer value2) {
            addCriterion("Article_NO_per_year between", value1, value2, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andArticleNoPerYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Article_NO_per_year not between", value1, value2, "articleNoPerYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearIsNull() {
            addCriterion("Publication_year is null");
            return (Criteria) this;
        }

        public Criteria andPublicationYearIsNotNull() {
            addCriterion("Publication_year is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationYearEqualTo(Integer value) {
            addCriterion("Publication_year =", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearNotEqualTo(Integer value) {
            addCriterion("Publication_year <>", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearGreaterThan(Integer value) {
            addCriterion("Publication_year >", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Publication_year >=", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearLessThan(Integer value) {
            addCriterion("Publication_year <", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearLessThanOrEqualTo(Integer value) {
            addCriterion("Publication_year <=", value, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearIn(List<Integer> values) {
            addCriterion("Publication_year in", values, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearNotIn(List<Integer> values) {
            addCriterion("Publication_year not in", values, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearBetween(Integer value1, Integer value2) {
            addCriterion("Publication_year between", value1, value2, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andPublicationYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Publication_year not between", value1, value2, "publicationYear");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("Region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("Region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("Region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("Region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("Region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("Region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("Region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("Region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("Region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("Region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("Region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("Region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("Region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("Region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andOaIsNull() {
            addCriterion("OA is null");
            return (Criteria) this;
        }

        public Criteria andOaIsNotNull() {
            addCriterion("OA is not null");
            return (Criteria) this;
        }

        public Criteria andOaEqualTo(String value) {
            addCriterion("OA =", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotEqualTo(String value) {
            addCriterion("OA <>", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaGreaterThan(String value) {
            addCriterion("OA >", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaGreaterThanOrEqualTo(String value) {
            addCriterion("OA >=", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaLessThan(String value) {
            addCriterion("OA <", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaLessThanOrEqualTo(String value) {
            addCriterion("OA <=", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaLike(String value) {
            addCriterion("OA like", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotLike(String value) {
            addCriterion("OA not like", value, "oa");
            return (Criteria) this;
        }

        public Criteria andOaIn(List<String> values) {
            addCriterion("OA in", values, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotIn(List<String> values) {
            addCriterion("OA not in", values, "oa");
            return (Criteria) this;
        }

        public Criteria andOaBetween(String value1, String value2) {
            addCriterion("OA between", value1, value2, "oa");
            return (Criteria) this;
        }

        public Criteria andOaNotBetween(String value1, String value2) {
            addCriterion("OA not between", value1, value2, "oa");
            return (Criteria) this;
        }

        public Criteria andEmploymentIsNull() {
            addCriterion("Employment is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentIsNotNull() {
            addCriterion("Employment is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentEqualTo(String value) {
            addCriterion("Employment =", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotEqualTo(String value) {
            addCriterion("Employment <>", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentGreaterThan(String value) {
            addCriterion("Employment >", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentGreaterThanOrEqualTo(String value) {
            addCriterion("Employment >=", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentLessThan(String value) {
            addCriterion("Employment <", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentLessThanOrEqualTo(String value) {
            addCriterion("Employment <=", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentLike(String value) {
            addCriterion("Employment like", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotLike(String value) {
            addCriterion("Employment not like", value, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentIn(List<String> values) {
            addCriterion("Employment in", values, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotIn(List<String> values) {
            addCriterion("Employment not in", values, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentBetween(String value1, String value2) {
            addCriterion("Employment between", value1, value2, "employment");
            return (Criteria) this;
        }

        public Criteria andEmploymentNotBetween(String value1, String value2) {
            addCriterion("Employment not between", value1, value2, "employment");
            return (Criteria) this;
        }

        public Criteria andRefereeingIsNull() {
            addCriterion("Refereeing is null");
            return (Criteria) this;
        }

        public Criteria andRefereeingIsNotNull() {
            addCriterion("Refereeing is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeingEqualTo(String value) {
            addCriterion("Refereeing =", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingNotEqualTo(String value) {
            addCriterion("Refereeing <>", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingGreaterThan(String value) {
            addCriterion("Refereeing >", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingGreaterThanOrEqualTo(String value) {
            addCriterion("Refereeing >=", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingLessThan(String value) {
            addCriterion("Refereeing <", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingLessThanOrEqualTo(String value) {
            addCriterion("Refereeing <=", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingLike(String value) {
            addCriterion("Refereeing like", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingNotLike(String value) {
            addCriterion("Refereeing not like", value, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingIn(List<String> values) {
            addCriterion("Refereeing in", values, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingNotIn(List<String> values) {
            addCriterion("Refereeing not in", values, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingBetween(String value1, String value2) {
            addCriterion("Refereeing between", value1, value2, "refereeing");
            return (Criteria) this;
        }

        public Criteria andRefereeingNotBetween(String value1, String value2) {
            addCriterion("Refereeing not between", value1, value2, "refereeing");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("View is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("View is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("View =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("View <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("View >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("View >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("View <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("View <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("View in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("View not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("View between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("View not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("Url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("Url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("Url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("Url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("Url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("Url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("Url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("Url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("Url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("Url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("Url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("Url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("Url not between", value1, value2, "url");
            return (Criteria) this;
        }
    }

    /**
     * journal
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * journal null
     */
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