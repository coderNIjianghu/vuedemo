package com.mt.vuedemo.bean;

import java.util.Date;

public class Article {
    private Integer id;

    private String articlename;

    private String articledesc;

    private String articleauthor;

    private Integer idtopping;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename == null ? null : articlename.trim();
    }

    public String getArticledesc() {
        return articledesc;
    }

    public void setArticledesc(String articledesc) {
        this.articledesc = articledesc == null ? null : articledesc.trim();
    }

    public String getArticleauthor() {
        return articleauthor;
    }

    public void setArticleauthor(String articleauthor) {
        this.articleauthor = articleauthor == null ? null : articleauthor.trim();
    }

    public Integer getIdtopping() {
        return idtopping;
    }

    public void setIdtopping(Integer idtopping) {
        this.idtopping = idtopping;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}