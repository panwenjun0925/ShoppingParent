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
    private int orderId;    //订单的id
    private String orderNum;    //订单的编号
    private int orderState;     //订单的状态
    private String orderCreateTime; //订单的创建的时间
    private String orderPayTime;    //订单的支付时间
    private int orderPayMode;       //订单的支付方式
    private double paymentMoney;    //订单的付款金额
    private int userId;             //订单的付款人
    private int adressId;           //收货的地址

    public Order() {
    }

    public Order(int orderId, String orderNum, int orderState, String orderCreateTime, String orderPayTime, int orderPayMode, double paymentMoney, int userId, int adressId) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.orderState = orderState;
        this.orderCreateTime = orderCreateTime;
        this.orderPayTime = orderPayTime;
        this.orderPayMode = orderPayMode;
        this.paymentMoney = paymentMoney;
        this.userId = userId;
        this.adressId = adressId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
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

    public int getOrderPayMode() {
        return orderPayMode;
    }

    public void setOrderPayMode(int orderPayMode) {
        this.orderPayMode = orderPayMode;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
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
