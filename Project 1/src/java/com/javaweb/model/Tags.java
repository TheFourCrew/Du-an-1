package com.javaweb.model;
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


