package com.github.fonoisrev.tmall.bean;

import java.util.Date;

public class Review {
    /*
     id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  content varchar(4000) DEFAULT NULL COMMENT '评价内容',
  user_id int(11) NOT NULL COMMENT '对应的用户id',
  product_id int(11) NOT NULL COMMENT '对应的产品id',
  createDate datetime DEFAULT NULL COMMENT '评价时间',
     */
    private  String  id;
    private  String content;
    private  String userId;
    private  String productId;
    private Date createDate;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public Date getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
