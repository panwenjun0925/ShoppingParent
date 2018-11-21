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
    private int addressId;
    private String receiver;
    private String deliveryAddress;
    private String detailedAddress;
    private String phone;
    private String tel;
    private String email;
    private String landmark;
    private String bestDeliverTime;
    private String postcode;
    private int userId;

    public Address() {
    }

    public Address(int addressId, String receiver, String deliveryAddress, String detailedAddress, String phone, String tel, String email, String landmark, String bestDeliverTime, String postcode, int userId) {
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
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
                '}';
    }
}
