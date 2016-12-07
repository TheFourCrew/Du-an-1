package com.javaweb.model;
// Generated Dec 5, 2016 2:19:17 PM by Hibernate Tools 4.3.1



/**
 * Vendor generated by hbm2java
 */
public class Vendor  implements java.io.Serializable {


     private Integer idVendor;
     private String companyName;
     private String phoneOffice;
     private String contactName;
     private String contactJobtitle;
     private String email;
     private String website;
     private String address;
     private String city;
     private String note;

    public Vendor() {
    }

	
    public Vendor(String companyName, String phoneOffice, String contactName, String contactJobtitle, String email, String address, String city) {
        this.companyName = companyName;
        this.phoneOffice = phoneOffice;
        this.contactName = contactName;
        this.contactJobtitle = contactJobtitle;
        this.email = email;
        this.address = address;
        this.city = city;
    }
    public Vendor(String companyName, String phoneOffice, String contactName, String contactJobtitle, String email, String website, String address, String city, String note) {
       this.companyName = companyName;
       this.phoneOffice = phoneOffice;
       this.contactName = contactName;
       this.contactJobtitle = contactJobtitle;
       this.email = email;
       this.website = website;
       this.address = address;
       this.city = city;
       this.note = note;
    }
   
    public Integer getIdVendor() {
        return this.idVendor;
    }
    
    public void setIdVendor(Integer idVendor) {
        this.idVendor = idVendor;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getPhoneOffice() {
        return this.phoneOffice;
    }
    
    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactJobtitle() {
        return this.contactJobtitle;
    }
    
    public void setContactJobtitle(String contactJobtitle) {
        this.contactJobtitle = contactJobtitle;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


