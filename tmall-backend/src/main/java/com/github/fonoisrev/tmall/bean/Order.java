package com.github.fonoisrev.tmall.bean;

import java.util.Date;

public class Order {
    
    /*唯一索引*/
    private String id;
    
    /*订单号*/
    private String orderCode;
    
    /*收货地址*/
    private String address;
    
    /*邮编*/
    private String post;
    
    private String receiver;
    
    private String mobile;
    
    private String userMessage;
    
    private Date createDate;
    
    private Date payDate;
    
    private Date deleveryDate;
    
    private Date confirmDate;
    
    private String userId;
    
    private String status;
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    
    public void setDeleveryDate(Date deleveryDate) {
        this.deleveryDate = deleveryDate;
    }
    
    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getOrderCode() {
        return orderCode;
    }
    
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPost() {
        return post;
    }
    
    public void setPost(String post) {
        this.post = post;
    }
    
    public String getReceiver() {
        return receiver;
    }
    
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getUserMessage() {
        return userMessage;
    }
    
    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
