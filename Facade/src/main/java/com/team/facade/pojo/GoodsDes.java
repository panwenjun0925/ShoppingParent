package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:00
 * @Description:
 * @Version: 1.0
 */
public class GoodsDes implements Serializable {
    private static final long serialVersionUID = 8345155532955847690L;
    private Integer goodsDesId;
    private String goodsDesPicture;
    private Double goodsWeight;
    private String goodsAttr;
    private Integer goodsId;

    public GoodsDes(){}

    public GoodsDes(Integer goodsDesId, String goodsDesPicture, Double goodsWeight, String goodsAttr, Integer goodsId) {
        this.goodsDesId = goodsDesId;
        this.goodsDesPicture = goodsDesPicture;
        this.goodsWeight = goodsWeight;
        this.goodsAttr = goodsAttr;
        this.goodsId = goodsId;
    }

    public Integer getGoodsDesId() {
        return goodsDesId;
    }

    public void setGoodsDesId(Integer goodsDesId) {
        this.goodsDesId = goodsDesId;
    }

    public String getGoodsDesPicture() {
        return goodsDesPicture;
    }

    public void setGoodsDesPicture(String goodsDesPicture) {
        this.goodsDesPicture = goodsDesPicture;
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
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
