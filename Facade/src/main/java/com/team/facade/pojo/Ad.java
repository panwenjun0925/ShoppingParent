package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:36
 * @Description:
 * @Version: 1.0
 */
public class Ad implements Serializable {
    private static final long serialVersionUID = 6503722364997685178L;
    private int adId;
    private String adDes;
    private String adPicture;
    private int adType;

    public Ad() {
    }

    public Ad(int adId, String adDes, String adPicture, int adType) {
        this.adId = adId;
        this.adDes = adDes;
        this.adPicture = adPicture;
        this.adType = adType;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
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

    public int getAdType() {
        return adType;
    }

    public void setAdType(int adType) {
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
