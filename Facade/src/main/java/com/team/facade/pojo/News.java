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
    private int newId;
    private int newsType;
    private String newsTitle;
    private String newsDes;

    public News() {
    }

    public News(int newId, int newsType, String newsTitle, String newsDes) {
        this.newId = newId;
        this.newsType = newsType;
        this.newsTitle = newsTitle;
        this.newsDes = newsDes;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public int getNewsType() {
        return newsType;
    }

    public void setNewsType(int newsType) {
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
