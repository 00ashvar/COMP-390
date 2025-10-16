import java.util.Scanner;
public class Car {
    Driver driver;
    Rider rider;
    private int carId;
    private String make;
    private String model;
    private int year;
    private String exteriorColor;
    private String interiorColor;
    private String licensePlate;
    private double price;
    private String damages;
    private String condition;
    private boolean isAvailable;

    //Constructor
    public Car(Driver driver, Rider rider, int carId, String make, String model, int year, String exteriorColor, String interiorColor, String licensePlate, double price, String damages, String condition, boolean isAvailable)
    {
        this.driver = driver;
        this.rider = rider;
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.licensePlate = licensePlate;
        this.price = price;
        this.damages = damages;
        this.condition = condition;
        this.isAvailable = isAvailable;
    }

    //Getters
    public Driver getDriver() {
        System.out.println("Driver: " + driver);
        return driver;
    }
    public Rider getRider() {
        System.out.println( "Rider: " + rider);
        return rider;
    }
    public int getCarId() {
        System.out.println("Car ID: " + carId);
        return carId;
    }
    public String getMake() {
        System.out.println("Make: " + make);
        return make;
    }
    public String getModel() {
        System.out.println("Model: " + model);
        return model;
    }
    public int getYear() {
        System.out.println("Year: " + year);
        return year;
    }
    public String getExteriorColor() {
        System.out.println("Exterior Color: " + exteriorColor);
        return exteriorColor;
    }
    public String getInteriorColor() {
        System.out.println("Interior Color: " + interiorColor);
        return interiorColor;
    }
    public String getLicensePlate() {
        System.out.println("License Plate: " + licensePlate);
        return licensePlate;
    }
    public double getPrice() {
        System.out.println("Price: " + price);
        return price;
    }
    public String getDamages() {
        System.out.println("Damages: " + damages);
        return damages;
    }
    public String getCondition() {
        System.out.println("Condition: " + condition);
        return condition;
    }
    public boolean isAvailable() {
        System.out.println("Is Available: " + isAvailable);
        return isAvailable;
    }

    //Setters
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void setRider(Rider rider) {
        this.rider = rider;
    }
    public void setCarId(int carId) {
        this.carId = carId;
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
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDamages(String damages) {
        this.damages = damages;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


}
