package com.javaweb.model;
/**
 * ProductParameters generated by hbm2java
 */
public class ProductParameters  implements java.io.Serializable {


     private Integer idproductParameters;
     private int idProduct;
     private String model;
     private String cpu;
     private String ram;
     private String screenResolution;
     private double screenSize;
     private double weight;
     private String operatingSystem;

    public ProductParameters() {
    }

    public ProductParameters(int idProduct, String model, String cpu, String ram, String screenResolution, double screenSize, double weight, String operatingSystem) {
       this.idProduct = idProduct;
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
    public int getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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
    public double getScreenSize() {
        return this.screenSize;
    }
    
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }




}


