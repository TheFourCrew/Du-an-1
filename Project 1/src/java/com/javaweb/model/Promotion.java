package com.javaweb.model;
// Generated Dec 2, 2016 10:24:32 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Promotion generated by hbm2java
 */
public class Promotion  implements java.io.Serializable {


     private Integer idpromotion;
     private String description;
     private double promotionValue;
     private Date startDate;
     private Date endDate;

    public Promotion() {
    }

    public Promotion(String description, double promotionValue, Date startDate, Date endDate) {
       this.description = description;
       this.promotionValue = promotionValue;
       this.startDate = startDate;
       this.endDate = endDate;
    }
   
    public Integer getIdpromotion() {
        return this.idpromotion;
    }
    
    public void setIdpromotion(Integer idpromotion) {
        this.idpromotion = idpromotion;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPromotionValue() {
        return this.promotionValue;
    }
    
    public void setPromotionValue(double promotionValue) {
        this.promotionValue = promotionValue;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }




}


