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
    /**
     * 商品的ID
     */
    private Integer goodsId;
    /**
     * 商品的名字
     */
    private String goodsName;
    /**
     * 商品的展示价格
     */
    private Double goodsShowPrice;
    /**
     * 商品展示的图片地址
     */
    private String goodsShowPicture;
    /**
     * 是否上架
     */
    private Integer isPutaway;
    /**
     * 商品折扣力度
     */
    private Double goodsDiscount;
    /**
     * 商品最后交易价格
     */
    private Double goodsRealPrice;
    /**
     * 商品总数量
     */
    private Integer goodsTotal;

    /**
     * 商品销量
     */
    private Integer goodsSaleNum;
    /**
     * 这个商品所属的类别
     */
    private Integer goodsTypeId;
    /**
     * 这个商品所属的品牌
     */
    private Integer brandId;
    /**
     * 这个商品所属的上架时间
     */
    private String goodsShelfTime;
    /**
     * 这个商品所属的所有属性
     */
    private String goodsAttr;

    public Goods() {
    }

    public Goods(Integer goodsId, String goodsName, Double goodsShowPrice, String goodsShowPicture, Integer isPutaway, Double goodsDiscount, Double goodsRealPrice, Integer goodsTotal, Integer goodsSaleNum, Integer goodsTypeId, Integer brandId, String goodsShelfTime, String goodsAttr) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsShowPrice = goodsShowPrice;
        this.goodsShowPicture = goodsShowPicture;
        this.isPutaway = isPutaway;
        this.goodsDiscount = goodsDiscount;
        this.goodsRealPrice = goodsRealPrice;
        this.goodsTotal = goodsTotal;
        this.goodsSaleNum = goodsSaleNum;
        this.goodsTypeId = goodsTypeId;
        this.brandId = brandId;
        this.goodsShelfTime = goodsShelfTime;
        this.goodsAttr = goodsAttr;
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsShelfTime() {
        return goodsShelfTime;
    }

    public void setGoodsShelfTime(String goodsShelfTime) {
        this.goodsShelfTime = goodsShelfTime;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public Integer getGoodsSaleNum() {
        return goodsSaleNum;
    }

    public void setGoodsSaleNum(Integer goodsSaleNum) {
        this.goodsSaleNum = goodsSaleNum;
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
                ", brandId=" + brandId +
                ", goodsShelfTime='" + goodsShelfTime + '\'' +
                ", goodsAttr='" + goodsAttr + '\'' +
                '}';
    }
}
