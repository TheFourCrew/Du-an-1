package com.javaweb.model;
// Generated Dec 2, 2016 10:24:32 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Rating generated by hbm2java
 */
public class Rating  implements java.io.Serializable {


     private Integer idrating;
     private String nameUser;
     private int ratingPoint;
     private String review;
     private Date ratingDate;

    public Rating() {
    }

    public Rating(String nameUser, int ratingPoint, String review, Date ratingDate) {
       this.nameUser = nameUser;
       this.ratingPoint = ratingPoint;
       this.review = review;
       this.ratingDate = ratingDate;
    }
   
    public Integer getIdrating() {
        return this.idrating;
    }
    
    public void setIdrating(Integer idrating) {
        this.idrating = idrating;
    }
    public String getNameUser() {
        return this.nameUser;
    }
    
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public int getRatingPoint() {
        return this.ratingPoint;
    }
    
    public void setRatingPoint(int ratingPoint) {
        this.ratingPoint = ratingPoint;
    }
    public String getReview() {
        return this.review;
    }
    
    public void setReview(String review) {
        this.review = review;
    }
    public Date getRatingDate() {
        return this.ratingDate;
    }
    
    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }




}


