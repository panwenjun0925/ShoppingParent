package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:00
 * @Description:
 * @Version: 1.0
 */
public class goodsDes implements Serializable {
    private static final long serialVersionUID = 8345155532955847690L;
    private int goodsDesId;
    private String goodsDesPicture;
    private double goodsWeight;
    private String goodsAttr;
    private int goodsId;

    public goodsDes() {
    }

    public goodsDes(int goodsDesId, String goodsDesPicture, double goodsWeight, String goodsAttr, int goodsId) {
        this.goodsDesId = goodsDesId;
        this.goodsDesPicture = goodsDesPicture;
        this.goodsWeight = goodsWeight;
        this.goodsAttr = goodsAttr;
        this.goodsId = goodsId;
    }

    public int getGoodsDesId() {
        return goodsDesId;
    }

    public void setGoodsDesId(int goodsDesId) {
        this.goodsDesId = goodsDesId;
    }

    public String getGoodsDesPicture() {
        return goodsDesPicture;
    }

    public void setGoodsDesPicture(String goodsDesPicture) {
        this.goodsDesPicture = goodsDesPicture;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "goodsDes{" +
                "goodsDesId=" + goodsDesId +
                ", goodsDesPicture='" + goodsDesPicture + '\'' +
                ", goodsWeight=" + goodsWeight +
                ", goodsAttr='" + goodsAttr + '\'' +
                ", goodsId=" + goodsId +
                '}';
    }
}
