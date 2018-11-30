package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 22:43
 * @Description:
 * @Version: 1.0
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 2149226404561917959L;
    private Integer addressId; //地址的id
    private String receiver;   //收货人名字
    private String deliveryAddress; //配送地址
    private String detailedAddress; //详细地址
    private String phone; //手机号码
    private String tel; //座机号码
    private String email;   //电子邮件
    private String landmark;    //标志性建筑
    private String bestDeliverTime; //最佳送货时间
    private String postcode;    //邮政编码
    private Integer userId;     //用户的id
    private Integer isDefault;  //是否默认地址

    public Address() {
    }

    public Address(Integer addressId, String receiver, String deliveryAddress, String detailedAddress, String phone, String tel, String email, String landmark, String bestDeliverTime, String postcode, Integer userId, Integer isDefault) {
        this.addressId = addressId;
        this.receiver = receiver;
        this.deliveryAddress = deliveryAddress;
        this.detailedAddress = detailedAddress;
        this.phone = phone;
        this.tel = tel;
        this.email = email;
        this.landmark = landmark;
        this.bestDeliverTime = bestDeliverTime;
        this.postcode = postcode;
        this.userId = userId;
        this.isDefault = isDefault;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getBestDeliverTime() {
        return bestDeliverTime;
    }

    public void setBestDeliverTime(String bestDeliverTime) {
        this.bestDeliverTime = bestDeliverTime;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", receiver='" + receiver + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", landmark='" + landmark + '\'' +
                ", bestDeliverTime='" + bestDeliverTime + '\'' +
                ", postcode='" + postcode + '\'' +
                ", userId=" + userId +
                ", isDefault=" + isDefault +
                '}';
    }
}
