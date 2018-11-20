package com.team.facade.pojo;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:10
 * @Description:
 * @Version: 1.0
 */
public class User {
    private int userId;
    private String userNumber;
    private String userName;
    private String phone;
    private String registerTime;
    private String email;
    private String idCard;
    private String inviterId;
    private String password;

    public User() {
    }

    public User(int userId, String userNumber, String userName, String phone, String registerTime, String email, String idCard, String inviterId, String password) {
        this.userId = userId;
        this.userNumber = userNumber;
        this.userName = userName;
        this.phone = phone;
        this.registerTime = registerTime;
        this.email = email;
        this.idCard = idCard;
        this.inviterId = inviterId;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
                '}';
    }
}
