package com.javaweb.model;
// Generated Dec 9, 2016 6:54:57 PM by Hibernate Tools 4.3.1



/**
 * ProductTags generated by hbm2java
 */
public class ProductTags  implements java.io.Serializable {


     private Integer idproductTags;
     private int idProduct;
     private int idTag;

    public ProductTags() {
    }

    public ProductTags(int idProduct, int idTag) {
       this.idProduct = idProduct;
       this.idTag = idTag;
    }
   
    public Integer getIdproductTags() {
        return this.idproductTags;
    }
    
    public void setIdproductTags(Integer idproductTags) {
        this.idproductTags = idproductTags;
    }
    public int getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public int getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }




}


