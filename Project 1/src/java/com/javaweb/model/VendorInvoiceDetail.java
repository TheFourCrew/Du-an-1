package com.javaweb.model;
// Generated Dec 2, 2016 10:24:32 AM by Hibernate Tools 4.3.1



/**
 * VendorInvoiceDetail generated by hbm2java
 */
public class VendorInvoiceDetail  implements java.io.Serializable {


     private Integer idvendorInvoiceDetail;
     private int idProduct;
     private int idVendorInvoice;
     private int quanity;
     private double unitPrice;
     private String note;

    public VendorInvoiceDetail() {
    }

	
    public VendorInvoiceDetail(int idProduct, int idVendorInvoice, int quanity, double unitPrice) {
        this.idProduct = idProduct;
        this.idVendorInvoice = idVendorInvoice;
        this.quanity = quanity;
        this.unitPrice = unitPrice;
    }
    public VendorInvoiceDetail(int idProduct, int idVendorInvoice, int quanity, double unitPrice, String note) {
       this.idProduct = idProduct;
       this.idVendorInvoice = idVendorInvoice;
       this.quanity = quanity;
       this.unitPrice = unitPrice;
       this.note = note;
    }
   
    public Integer getIdvendorInvoiceDetail() {
        return this.idvendorInvoiceDetail;
    }
    
    public void setIdvendorInvoiceDetail(Integer idvendorInvoiceDetail) {
        this.idvendorInvoiceDetail = idvendorInvoiceDetail;
    }
    public int getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public int getIdVendorInvoice() {
        return this.idVendorInvoice;
    }
    
    public void setIdVendorInvoice(int idVendorInvoice) {
        this.idVendorInvoice = idVendorInvoice;
    }
    public int getQuanity() {
        return this.quanity;
    }
    
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    public double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


