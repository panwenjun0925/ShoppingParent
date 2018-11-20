package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:51
 * @Description:
 * @Version: 1.0
 */
public class Express{
    private int expressId;
    private String expressName;
    private String orderDescribe;
    private double charge;
    private double freeAllowances;
    private double quotationCost;

    public Express() {
    }

    public Express(int expressId, String expressName, String orderDescribe, double charge, double freeAllowances, double quotationCost) {
        this.expressId = expressId;
        this.expressName = expressName;
        this.orderDescribe = orderDescribe;
        this.charge = charge;
        this.freeAllowances = freeAllowances;
        this.quotationCost = quotationCost;
    }

    public int getExpressId() {
        return expressId;
    }

    public void setExpressId(int expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getFreeAllowances() {
        return freeAllowances;
    }

    public void setFreeAllowances(double freeAllowances) {
        this.freeAllowances = freeAllowances;
    }

    public double getQuotationCost() {
        return quotationCost;
    }

    public void setQuotationCost(double quotationCost) {
        this.quotationCost = quotationCost;
    }

    @Override
    public String toString() {
        return "Express{" +
                "expressId=" + expressId +
                ", expressName='" + expressName + '\'' +
                ", orderDescribe='" + orderDescribe + '\'' +
                ", charge=" + charge +
                ", freeAllowances=" + freeAllowances +
                ", quotationCost=" + quotationCost +
                '}';
    }
}
