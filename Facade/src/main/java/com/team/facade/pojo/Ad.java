package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:36
 * @Description:
 * @Version: 1.0
 */
public class Ad implements Serializable{
    private static final long serialVersionUID = 6503722364997685178L;
    private Integer adId;          //广告Id
    private String adDes;          //广告描述
    private String adPicture;      //广告图片地址
    private Integer adType;        //广告类型

    public Ad() {
    }

    public Ad(Integer adId, String adDes, String adPicture, Integer adType) {
        this.adId = adId;
        this.adDes = adDes;
        this.adPicture = adPicture;
        this.adType = adType;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdDes() {
        return adDes;
    }

    public void setAdDes(String adDes) {
        this.adDes = adDes;
    }

    public String getAdPicture() {
        return adPicture;
    }

    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "adId=" + adId +
                ", adDes='" + adDes + '\'' +
                ", adPicture='" + adPicture + '\'' +
                ", adType=" + adType +
                '}';
    }
}
