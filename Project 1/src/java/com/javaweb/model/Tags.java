package com.javaweb.model;
// Generated Dec 9, 2016 6:54:57 PM by Hibernate Tools 4.3.1



/**
 * Tags generated by hbm2java
 */
public class Tags  implements java.io.Serializable {


     private Integer idtags;
     private String tagName;

    public Tags() {
    }

    public Tags(String tagName) {
       this.tagName = tagName;
    }
   
    public Integer getIdtags() {
        return this.idtags;
    }
    
    public void setIdtags(Integer idtags) {
        this.idtags = idtags;
    }
    public String getTagName() {
        return this.tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }




}


