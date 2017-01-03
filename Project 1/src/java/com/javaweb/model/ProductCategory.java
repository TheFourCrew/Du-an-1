package com.javaweb.model;
// Generated Jan 1, 2017 11:24:49 AM by Hibernate Tools 4.3.1



/**
 * ProductCategory generated by hbm2java
 */
public class ProductCategory  implements java.io.Serializable {


     private Integer idproductCategory;
     private String categoryName;
     private Integer CParent;
     private String note;

    public ProductCategory() {
    }

	
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    public ProductCategory(String categoryName, Integer CParent, String note) {
       this.categoryName = categoryName;
       this.CParent = CParent;
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
    public Integer getCParent() {
        return this.CParent;
    }
    
    public void setCParent(Integer CParent) {
        this.CParent = CParent;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


