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
    private int goodsId;
    private String goodsName;
    private double goodsShowPrice;
    private String goodsShowPicture;
    private int isPutaway;
    private double goodsDiscount;
    private double goodsRealPrice;
    private int goodsTotal;
    private int goodsTypeId;

    public Goods() {
    }

    public Goods(int goodsId, String goodsName, double goodsShowPrice, String goodsShowPicture, int isPutaway, double goodsDiscount, double goodsRealPrice, int goodsTotal, int goodsTypeId) {
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

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsShowPrice() {
        return goodsShowPrice;
    }

    public void setGoodsShowPrice(double goodsShowPrice) {
        this.goodsShowPrice = goodsShowPrice;
    }

    public String getGoodsShowPicture() {
        return goodsShowPicture;
    }

    public void setGoodsShowPicture(String goodsShowPicture) {
        this.goodsShowPicture = goodsShowPicture;
    }

    public int getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(int isPutaway) {
        this.isPutaway = isPutaway;
    }

    public double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public double getGoodsRealPrice() {
        return goodsRealPrice;
    }

    public void setGoodsRealPrice(double goodsRealPrice) {
        this.goodsRealPrice = goodsRealPrice;
    }

    public int getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(int goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
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
