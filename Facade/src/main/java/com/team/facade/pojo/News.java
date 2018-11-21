package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:04
 * @Description:
 * @Version: 1.0
 */
public class News implements Serializable {
    private static final long serialVersionUID = 6063469296969549479L;
    private Integer newId;          //新闻id
    private Integer newsType;       //新闻类型
    private String newsTitle;   //新闻标题
    private String newsDes;     //新闻描述

    public News() {
    }

    public News(Integer newId, Integer newsType, String newsTitle, String newsDes) {
        this.newId = newId;
        this.newsType = newsType;
        this.newsTitle = newsTitle;
        this.newsDes = newsDes;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Integer getNewsType() {
        return newsType;
    }

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDes() {
        return newsDes;
    }

    public void setNewsDes(String newsDes) {
        this.newsDes = newsDes;
    }

    @Override
    public String toString() {
        return "News{" +
                "newId=" + newId +
                ", newsType=" + newsType +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsDes='" + newsDes + '\'' +
                '}';
    }
}
