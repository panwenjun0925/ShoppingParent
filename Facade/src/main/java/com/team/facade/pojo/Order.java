package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:37
 * @Description:
 * @Version: 1.0
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -7011898217831806483L;
    private Integer orderId;    //订单的id
    private String orderNum;    //订单的编号
    private Integer orderState;     //订单的状态
    private String orderCreateTime; //订单的创建的时间
    private String orderPayTime;    //订单的支付时间
    private Integer orderPayMode;       //订单的支付方式
    private double paymentMoney;    //订单的付款金额
    private Integer deliverMode;        //配送方式
    private String orderRemark;     //订单备注
    private Integer userId;             //订单的付款人
    private Integer adressId;           //收货的地址

    public Order() {
    }

    public Order(Integer orderId, String orderNum, Integer orderState, String orderCreateTime, String orderPayTime, Integer orderPayMode, double paymentMoney, Integer deliverMode, String orderRemark, Integer userId, Integer adressId) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.orderState = orderState;
        this.orderCreateTime = orderCreateTime;
        this.orderPayTime = orderPayTime;
        this.orderPayMode = orderPayMode;
        this.paymentMoney = paymentMoney;
        this.deliverMode = deliverMode;
        this.orderRemark = orderRemark;
        this.userId = userId;
        this.adressId = adressId;
    }

    public Integer getDeliverMode() {
        return deliverMode;
    }

    public void setDeliverMode(Integer deliverMode) {
        this.deliverMode = deliverMode;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Integer getOrderPayMode() {
        return orderPayMode;
    }

    public void setOrderPayMode(Integer orderPayMode) {
        this.orderPayMode = orderPayMode;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdressId() {
        return adressId;
    }

    public void setAdressId(Integer adressId) {
        this.adressId = adressId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNum='" + orderNum + '\'' +
                ", orderState=" + orderState +
                ", orderCreateTime='" + orderCreateTime + '\'' +
                ", orderPayTime='" + orderPayTime + '\'' +
                ", orderPayMode=" + orderPayMode +
                ", paymentMoney=" + paymentMoney +
                ", userId=" + userId +
                ", adressId=" + adressId +
                '}';
    }
}
