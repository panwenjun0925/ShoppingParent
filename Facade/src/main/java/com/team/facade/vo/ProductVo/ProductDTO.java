package com.team.facade.vo.ProductVo;

import com.team.facade.pojo.Goods;

import java.io.Serializable;

/**
 * @Auther: YouQi
 * @Date: 2018/11/26 20:13
 * @Description:
 * @Version: 1.0
 */
public class ProductDTO extends Goods implements Serializable {

    private String definiteAttr;
    private Integer goodsDesId;
    private String goodsDesPicture;
    private Double goodsWeight;
    private Integer goodsCount;

    public ProductDTO(){}

    public String getDefiniteAttr() {
        return definiteAttr;
    }

    public void setDefiniteAttr(String definiteAttr) {
        this.definiteAttr = definiteAttr;
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

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }
}
