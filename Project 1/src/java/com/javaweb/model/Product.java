package com.javaweb.model;
// Generated Dec 14, 2016 10:55:21 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer idproduct;
     private String productNumber;
     private String productName;
     private double pricePerUnit;
     private double boughtPrice;
     private int productQuantity;
     private Double discountPrice;
     private String unit;
     private String description;
     private int idproductCategory;
     private Date createdDate;
     private int creater;
     private Date dateModified;
     private String productImage;
     private String note;
     private String detailImages;

    public Product() {
    }

	
    public Product(String productNumber, String productName, double pricePerUnit, double boughtPrice, int productQuantity, String unit, String description, int idproductCategory, int creater, String productImage) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.boughtPrice = boughtPrice;
        this.productQuantity = productQuantity;
        this.unit = unit;
        this.description = description;
        this.idproductCategory = idproductCategory;
        this.creater = creater;
        this.productImage = productImage;
    }
    public Product(String productNumber, String productName, double pricePerUnit, double boughtPrice, int productQuantity, Double discountPrice, String unit, String description, int idproductCategory, Date createdDate, int creater, Date dateModified, String productImage, String note, String detailImages) {
       this.productNumber = productNumber;
       this.productName = productName;
       this.pricePerUnit = pricePerUnit;
       this.boughtPrice = boughtPrice;
       this.productQuantity = productQuantity;
       this.discountPrice = discountPrice;
       this.unit = unit;
       this.description = description;
       this.idproductCategory = idproductCategory;
       this.createdDate = createdDate;
       this.creater = creater;
       this.dateModified = dateModified;
       this.productImage = productImage;
       this.note = note;
       this.detailImages = detailImages;
    }
   
    public Integer getIdproduct() {
        return this.idproduct;
    }
    
    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }
    public String getProductNumber() {
        return this.productNumber;
    }
    
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPricePerUnit() {
        return this.pricePerUnit;
    }
    
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public double getBoughtPrice() {
        return this.boughtPrice;
    }
    
    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }
    public int getProductQuantity() {
        return this.productQuantity;
    }
    
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public Double getDiscountPrice() {
        return this.discountPrice;
    }
    
    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getIdproductCategory() {
        return this.idproductCategory;
    }
    
    public void setIdproductCategory(int idproductCategory) {
        this.idproductCategory = idproductCategory;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public int getCreater() {
        return this.creater;
    }
    
    public void setCreater(int creater) {
        this.creater = creater;
    }
    public Date getDateModified() {
        return this.dateModified;
    }
    
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    public String getProductImage() {
        return this.productImage;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public String getDetailImages() {
        return this.detailImages;
    }
    
    public void setDetailImages(String detailImages) {
        this.detailImages = detailImages;
    }




}


