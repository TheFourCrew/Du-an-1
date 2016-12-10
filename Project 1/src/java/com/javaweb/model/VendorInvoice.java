package com.javaweb.model;
// Generated Dec 9, 2016 6:54:57 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VendorInvoice generated by hbm2java
 */
public class VendorInvoice  implements java.io.Serializable {


     private Integer idvendorInvoice;
     private String vendorInvoiceNumber;
     private double totalPrice;
     private Date createdDate;
     private int creater;
     private int idVendor;
     private String note;

    public VendorInvoice() {
    }

	
    public VendorInvoice(String vendorInvoiceNumber, double totalPrice, Date createdDate, int creater, int idVendor) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
        this.totalPrice = totalPrice;
        this.createdDate = createdDate;
        this.creater = creater;
        this.idVendor = idVendor;
    }
    public VendorInvoice(String vendorInvoiceNumber, double totalPrice, Date createdDate, int creater, int idVendor, String note) {
       this.vendorInvoiceNumber = vendorInvoiceNumber;
       this.totalPrice = totalPrice;
       this.createdDate = createdDate;
       this.creater = creater;
       this.idVendor = idVendor;
       this.note = note;
    }
   
    public Integer getIdvendorInvoice() {
        return this.idvendorInvoice;
    }
    
    public void setIdvendorInvoice(Integer idvendorInvoice) {
        this.idvendorInvoice = idvendorInvoice;
    }
    public String getVendorInvoiceNumber() {
        return this.vendorInvoiceNumber;
    }
    
    public void setVendorInvoiceNumber(String vendorInvoiceNumber) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
    public int getIdVendor() {
        return this.idVendor;
    }
    
    public void setIdVendor(int idVendor) {
        this.idVendor = idVendor;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


