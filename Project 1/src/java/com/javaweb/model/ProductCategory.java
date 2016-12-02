package com.javaweb.model;
// Generated Dec 2, 2016 1:44:12 PM by Hibernate Tools 4.3.1



/**
 * ProductCategory generated by hbm2java
 */
public class ProductCategory  implements java.io.Serializable {


     private Integer idproductCategory;
     private String categoryName;
     private String note;

    public ProductCategory() {
    }

	
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    public ProductCategory(String categoryName, String note) {
       this.categoryName = categoryName;
       this.note = note;
    }
   
    public Integer getIdproductCategory() {
        return this.idproductCategory;
    }
    
    public void setIdproductCategory(Integer idproductCategory) {
        this.idproductCategory = idproductCategory;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


