package com.sysu.goingpub.model;

public class Journal {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 
     */
    private String issn;

    /**
     * 
     */
    private String journal;

    /**
     * 
     */
    private String abbrName;

    /**
     * 
     */
    private String isSci;

    /**
     * 
     */
    private Double if2018;

    /**
     * 
     */
    private Double if5year;

    /**
     * 
     */
    private Double selfCiting;

    /**
     * 
     */
    private Integer hIndex;

    /**
     * 
     */
    private Double citescore;

    /**
     * 
     */
    private String division;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private String discipline;

    /**
     * 
     */
    private String istop;

    /**
     * 
     */
    private String isreview;

    /**
     * 
     */
    private String publicationCycle;

    /**
     * 
     */
    private Integer articleNoPerYear;

    /**
     * 
     */
    private Integer publicationYear;

    /**
     * 
     */
    private String region;

    /**
     * 
     */
    private String oa;

    /**
     * 
     */
    private String employment;

    /**
     * 
     */
    private String refereeing;

    /**
     * 
     */
    private Integer view;

    /**
     * 
     */
    private String url;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return ISSN 
     */
    public String getIssn() {
        return issn;
    }

    /**
     * 
     * @param issn 
     */
    public void setIssn(String issn) {
        this.issn = issn == null ? null : issn.trim();
    }

    /**
     * 
     * @return Journal 
     */
    public String getJournal() {
        return journal;
    }

    /**
     * 
     * @param journal 
     */
    public void setJournal(String journal) {
        this.journal = journal == null ? null : journal.trim();
    }

    /**
     * 
     * @return Abbr_Name 
     */
    public String getAbbrName() {
        return abbrName;
    }

    /**
     * 
     * @param abbrName 
     */
    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName == null ? null : abbrName.trim();
    }

    /**
     * 
     * @return Is_SCI 
     */
    public String getIsSci() {
        return isSci;
    }

    /**
     * 
     * @param isSci 
     */
    public void setIsSci(String isSci) {
        this.isSci = isSci == null ? null : isSci.trim();
    }

    /**
     * 
     * @return IF2018 
     */
    public Double getIf2018() {
        return if2018;
    }

    /**
     * 
     * @param if2018 
     */
    public void setIf2018(Double if2018) {
        this.if2018 = if2018;
    }

    /**
     * 
     * @return IF_5year 
     */
    public Double getIf5year() {
        return if5year;
    }

    /**
     * 
     * @param if5year 
     */
    public void setIf5year(Double if5year) {
        this.if5year = if5year;
    }

    /**
     * 
     * @return Self_citing 
     */
    public Double getSelfCiting() {
        return selfCiting;
    }

    /**
     * 
     * @param selfCiting 
     */
    public void setSelfCiting(Double selfCiting) {
        this.selfCiting = selfCiting;
    }

    /**
     * 
     * @return H_Index 
     */
    public Integer gethIndex() {
        return hIndex;
    }

    /**
     * 
     * @param hIndex 
     */
    public void sethIndex(Integer hIndex) {
        this.hIndex = hIndex;
    }

    /**
     * 
     * @return CiteScore 
     */
    public Double getCitescore() {
        return citescore;
    }

    /**
     * 
     * @param citescore 
     */
    public void setCitescore(Double citescore) {
        this.citescore = citescore;
    }

    /**
     * 
     * @return Division 
     */
    public String getDivision() {
        return division;
    }

    /**
     * 
     * @param division 
     */
    public void setDivision(String division) {
        this.division = division == null ? null : division.trim();
    }

    /**
     * 
     * @return Category 
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category 
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 
     * @return Discipline 
     */
    public String getDiscipline() {
        return discipline;
    }

    /**
     * 
     * @param discipline 
     */
    public void setDiscipline(String discipline) {
        this.discipline = discipline == null ? null : discipline.trim();
    }

    /**
     * 
     * @return IsTop 
     */
    public String getIstop() {
        return istop;
    }

    /**
     * 
     * @param istop 
     */
    public void setIstop(String istop) {
        this.istop = istop == null ? null : istop.trim();
    }

    /**
     * 
     * @return IsReview 
     */
    public String getIsreview() {
        return isreview;
    }

    /**
     * 
     * @param isreview 
     */
    public void setIsreview(String isreview) {
        this.isreview = isreview == null ? null : isreview.trim();
    }

    /**
     * 
     * @return Publication_Cycle 
     */
    public String getPublicationCycle() {
        return publicationCycle;
    }

    /**
     * 
     * @param publicationCycle 
     */
    public void setPublicationCycle(String publicationCycle) {
        this.publicationCycle = publicationCycle == null ? null : publicationCycle.trim();
    }

    /**
     * 
     * @return Article_NO_per_year 
     */
    public Integer getArticleNoPerYear() {
        return articleNoPerYear;
    }

    /**
     * 
     * @param articleNoPerYear 
     */
    public void setArticleNoPerYear(Integer articleNoPerYear) {
        this.articleNoPerYear = articleNoPerYear;
    }

    /**
     * 
     * @return Publication_year 
     */
    public Integer getPublicationYear() {
        return publicationYear;
    }

    /**
     * 
     * @param publicationYear 
     */
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * 
     * @return Region 
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region 
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 
     * @return OA 
     */
    public String getOa() {
        return oa;
    }

    /**
     * 
     * @param oa 
     */
    public void setOa(String oa) {
        this.oa = oa == null ? null : oa.trim();
    }

    /**
     * 
     * @return Employment 
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * 
     * @param employment 
     */
    public void setEmployment(String employment) {
        this.employment = employment == null ? null : employment.trim();
    }

    /**
     * 
     * @return Refereeing 
     */
    public String getRefereeing() {
        return refereeing;
    }

    /**
     * 
     * @param refereeing 
     */
    public void setRefereeing(String refereeing) {
        this.refereeing = refereeing == null ? null : refereeing.trim();
    }

    /**
     * 
     * @return View 
     */
    public Integer getView() {
        return view;
    }

    /**
     * 
     * @param view 
     */
    public void setView(Integer view) {
        this.view = view;
    }

    /**
     * 
     * @return Url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}