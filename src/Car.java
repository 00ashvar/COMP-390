import java.util.Scanner;
public class Car {
    User user;
    private int carId;
    private int userId;
    private String make;
    private String model;
    private int year;
    private String exteriorColor;
    private String interiorColor;
    private String interiorMaterials;
    private String licensePlate;
    private double price;
    private String condition;
    private boolean isAvailable;

    // Empty Constructor
    public Car(){}

    //Constructor
    public Car(int userId, String make, String model, int year,
               String exteriorColor, String interiorColor, String interiorMaterials,
               double price, String condition, String licensePlate)
    {
        this.userId = userId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.interiorMaterials = interiorMaterials;
        this.licensePlate = licensePlate;
        this.price = price;
        this.condition = condition;
    }

    //Getters
    public int getCarId() {
        return carId;
    }
    public int getUserId() {
        return userId;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getExteriorColor() {
        return exteriorColor;
    }
    public String getInteriorColor() {
        return interiorColor;
    }
    public String getInteriorMaterials() {
        return interiorMaterials;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public double getPrice() {
        return price;
    }
    public String getCondition() {
        return condition;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    //Setters
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }
    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }
    public void setInteriorMaterials(String interiorMaterials) {
        this.interiorMaterials = interiorMaterials;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


}
