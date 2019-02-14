package com.mt.vuedemo.bean;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Article {
    private Integer id;
    @NotNull(message = "文章 姓名不能为空")
    private String articlename;

    private String articledesc;
    @NotNull(message = "文章 作者不能为空")
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