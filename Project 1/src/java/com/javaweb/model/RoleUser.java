package com.javaweb.model;
// Generated Jan 1, 2017 11:24:49 AM by Hibernate Tools 4.3.1



/**
 * RoleUser generated by hbm2java
 */
public class RoleUser  implements java.io.Serializable {


     private Integer idroleUser;
     private String roleName;
     private String note;

    public RoleUser() {
    }

	
    public RoleUser(String roleName) {
        this.roleName = roleName;
    }
    public RoleUser(String roleName, String note) {
       this.roleName = roleName;
       this.note = note;
    }
   
    public Integer getIdroleUser() {
        return this.idroleUser;
    }
    
    public void setIdroleUser(Integer idroleUser) {
        this.idroleUser = idroleUser;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


