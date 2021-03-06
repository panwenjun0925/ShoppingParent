package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:07
 * @Description:
 * @Version: 1.0
 */
public class OrderDes implements Serializable {
    private static final long serialVersionUID = 7133863547374353710L;
    private int orderDesId;     //订单详情ID
    private int goodsNum;       //商品数量
    private String orderNumber; //订单的编号
    private int orderId;        //订单的ID
    private int goodsId;        //商品ID

    public OrderDes() {
    }

    public OrderDes(int orderDesId, int goodsNum, String orderNumber, int orderId, int goodsId) {
        this.orderDesId = orderDesId;
        this.goodsNum = goodsNum;
        this.orderNumber = orderNumber;
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public int getOrderDesId() {
        return orderDesId;
    }

    public void setOrderDesId(int orderDesId) {
        this.orderDesId = orderDesId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "OrderDes{" +
                "orderDesId=" + orderDesId +
                ", goodsNum=" + goodsNum +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderId=" + orderId +
                ", goodsId=" + goodsId +
                '}';
    }
}
