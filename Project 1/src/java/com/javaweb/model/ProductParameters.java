package com.javaweb.model;
// Generated Dec 1, 2016 3:28:02 PM by Hibernate Tools 4.3.1



/**
 * ProductParameters generated by hbm2java
 */
public class ProductParameters  implements java.io.Serializable {


     private Integer idproductParameters;
     private Product product;
     private String model;
     private String cpu;
     private String ram;
     private String screenResolution;
     private Double screenSize;
     private Double weight;
     private String operatingSystem;

    public ProductParameters() {
    }

	
    public ProductParameters(Product product, String model) {
        this.product = product;
        this.model = model;
    }
    public ProductParameters(Product product, String model, String cpu, String ram, String screenResolution, Double screenSize, Double weight, String operatingSystem) {
       this.product = product;
       this.model = model;
       this.cpu = cpu;
       this.ram = ram;
       this.screenResolution = screenResolution;
       this.screenSize = screenSize;
       this.weight = weight;
       this.operatingSystem = operatingSystem;
    }
   
    public Integer getIdproductParameters() {
        return this.idproductParameters;
    }
    
    public void setIdproductParameters(Integer idproductParameters) {
        this.idproductParameters = idproductParameters;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getCpu() {
        return this.cpu;
    }
    
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return this.ram;
    }
    
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getScreenResolution() {
        return this.screenResolution;
    }
    
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
    public Double getScreenSize() {
        return this.screenSize;
    }
    
    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }




}


