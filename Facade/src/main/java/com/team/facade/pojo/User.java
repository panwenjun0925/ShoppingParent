package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:10
 * @Description:
 * @Version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2725377651954525077L;
    private Integer userId;     //用户的id
    private String userNumber;      //用户的编号
    private String userName;        //用户名
    private String phone;           //手机号码
    private String registerTime;    //注册时间
    private String email;           //电子邮件
    private String idCard;          //身份证号码
    private String inviterId;       //邀请人的id
    private String password;        //登录密码
    private String userNick;        //昵称
    private String head;            //头像

    public User() {
    }

    public User(Integer userId, String userNumber, String userName, String phone, String registerTime, String email, String idCard, String inviterId, String password, String userNick, String head) {
        this.userId = userId;
        this.userNumber = userNumber;
        this.userName = userName;
        this.phone = phone;
        this.registerTime = registerTime;
        this.email = email;
        this.idCard = idCard;
        this.inviterId = inviterId;
        this.password = password;
        this.userNick = userNick;
        this.head = head;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInviterId() {
        return inviterId;
    }

    public void setInviterId(String inviterId) {
        this.inviterId = inviterId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userNumber='" + userNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", registerTime='" + registerTime + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", inviterId='" + inviterId + '\'' +
                ", password='" + password + '\'' +
                ", userNick='" + userNick + '\'' +
                ", head='" + head + '\'' +
                '}';
    }
}
