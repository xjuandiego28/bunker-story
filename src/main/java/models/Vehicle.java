package models;

public class Vehicle {
    private String brand;
    private String vehicleClass;
    private String code;
    private String homologationCode;
    private String reference;
    private int price;
    private int cylinderCapacity;
    private String nationality;

    public Vehicle(String brand, String vehicleClass, String code, String homologationCode, String reference, int price, int cylinderCapacity, String nationality) {
        this.brand = brand;
        this.vehicleClass = vehicleClass;
        this.code = code;
        this.homologationCode = homologationCode;
        this.reference = reference;
        this.price = price;
        this.cylinderCapacity = cylinderCapacity;
        this.nationality = nationality;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHomologationCode() {
        return homologationCode;
    }

    public void setHomologationCode(String homologationCode) {
        this.homologationCode = homologationCode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
