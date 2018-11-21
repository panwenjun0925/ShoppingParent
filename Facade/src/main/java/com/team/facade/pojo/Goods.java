package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:56
 * @Description:
 * @Version: 1.0
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 6244987807951023526L;
    private Integer goodsId;
    private String goodsName;
    private Double goodsShowPrice;
    private String goodsShowPicture;
    private Integer isPutaway;
    private Double goodsDiscount;
    private Double goodsRealPrice;
    private Integer goodsTotal;
    private Integer goodsTypeId;

    public Goods() {
    }

    public Goods(Integer goodsId, String goodsName, Double goodsShowPrice, String goodsShowPicture, Integer isPutaway, Double goodsDiscount, Double goodsRealPrice, Integer goodsTotal, Integer goodsTypeId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsShowPrice = goodsShowPrice;
        this.goodsShowPicture = goodsShowPicture;
        this.isPutaway = isPutaway;
        this.goodsDiscount = goodsDiscount;
        this.goodsRealPrice = goodsRealPrice;
        this.goodsTotal = goodsTotal;
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsShowPrice() {
        return goodsShowPrice;
    }

    public void setGoodsShowPrice(Double goodsShowPrice) {
        this.goodsShowPrice = goodsShowPrice;
    }

    public String getGoodsShowPicture() {
        return goodsShowPicture;
    }

    public void setGoodsShowPicture(String goodsShowPicture) {
        this.goodsShowPicture = goodsShowPicture;
    }

    public Integer getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Double getGoodsRealPrice() {
        return goodsRealPrice;
    }

    public void setGoodsRealPrice(Double goodsRealPrice) {
        this.goodsRealPrice = goodsRealPrice;
    }

    public Integer getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(Integer goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsShowPrice=" + goodsShowPrice +
                ", goodsShowPicture='" + goodsShowPicture + '\'' +
                ", isPutaway=" + isPutaway +
                ", goodsDiscount=" + goodsDiscount +
                ", goodsRealPrice=" + goodsRealPrice +
                ", goodsTotal=" + goodsTotal +
                ", goodsTypeId=" + goodsTypeId +
                '}';
    }
}
