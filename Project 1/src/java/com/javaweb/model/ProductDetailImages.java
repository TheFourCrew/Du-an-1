package com.javaweb.model;
// Generated Dec 2, 2016 10:24:32 AM by Hibernate Tools 4.3.1



/**
 * ProductDetailImages generated by hbm2java
 */
public class ProductDetailImages  implements java.io.Serializable {


     private Integer idproductDetailImages;
     private int idProduct;
     private int idDetailImage;

    public ProductDetailImages() {
    }

    public ProductDetailImages(int idProduct, int idDetailImage) {
       this.idProduct = idProduct;
       this.idDetailImage = idDetailImage;
    }
   
    public Integer getIdproductDetailImages() {
        return this.idproductDetailImages;
    }
    
    public void setIdproductDetailImages(Integer idproductDetailImages) {
        this.idproductDetailImages = idproductDetailImages;
    }
    public int getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public int getIdDetailImage() {
        return this.idDetailImage;
    }
    
    public void setIdDetailImage(int idDetailImage) {
        this.idDetailImage = idDetailImage;
    }




}


