package com.javaweb.model;
// Generated Dec 2, 2016 1:44:12 PM by Hibernate Tools 4.3.1



/**
 * ArticleTags generated by hbm2java
 */
public class ArticleTags  implements java.io.Serializable {


     private Integer idarticleTags;
     private int idTag;
     private int idArticle;

    public ArticleTags() {
    }

    public ArticleTags(int idTag, int idArticle) {
       this.idTag = idTag;
       this.idArticle = idArticle;
    }
   
    public Integer getIdarticleTags() {
        return this.idarticleTags;
    }
    
    public void setIdarticleTags(Integer idarticleTags) {
        this.idarticleTags = idarticleTags;
    }
    public int getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }
    public int getIdArticle() {
        return this.idArticle;
    }
    
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }




}


