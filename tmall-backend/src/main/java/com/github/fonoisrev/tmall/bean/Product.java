package com.github.fonoisrev.tmall.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
/*
id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
name varchar(255) NOT NULL COMMENT '产品的名称',
sub_title varchar(255) DEFAULT NULL COMMENT '小标题',
price float DEFAULT NULL COMMENT '价格',
sale int(11) DEFAULT NULL COMMENT '销量',
stock int(11) DEFAULT NULL COMMENT '库存',
category_id int(11) DEFAULT NULL COMMENT '对应的分类id',
*/
    @Id
    @GeneratedValue
    private int id;
    
    private String name;
    
    private String subTitle;
    
    private float price;
    
    private int sale;
    
    private int stock;
    
    private String categoryId;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSubTitle() {
        return subTitle;
    }
    
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public int getSale() {
        return sale;
    }
    
    public void setSale(int sale) {
        this.sale = sale;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getCategoryId() {
        return categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
