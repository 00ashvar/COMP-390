import java.util.Scanner;
/**
 * Car
 * version 0.1
 * 10/19/25
 * This class holds information about the car used by the driver
 */
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

    /**
     * Empty Constructor
     */
    public Car(){}

    /**
     * Constructor for the car instace
     * @param userId The user ID given by the database
     * @param make The maker of the vehicle
     * @param model The model of the vehicle
     * @param year The year of the vehicle
     * @param exteriorColor
     * @param interiorColor
     * @param interiorMaterials
     * @param price
     * @param condition The condition of the vehicle
     * @param licensePlate The licence plate assigned to the vehicle
     */
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

    /**
     * This function returns the object's car ID
     * @return The car ID
     */
    public int getCarId() {
        return carId;
    }

    /**
     * This function returns the object's user ID (Driver)
     * @return The user ID of the car
     */
    public int getUserId() {
        return userId;
    }

    /**
     * This function returns the object's maker
     * @return The car's maker
     */
    public String getMake() {
        return make;
    }

    /**
     * This function returns the object's model
     * @return The car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * This function returns the object's year
     * @return The year of the car
     */
    public int getYear() {
        return year;
    }

    /**
     * This function returns the object's external color
     * @return returns the cars internal color
     */
    public String getExteriorColor() {
        return exteriorColor;
    }

    /**
     *
     * @return
     */
    public String getInteriorColor() {
        return interiorColor;
    }

    /**
     *
     * @return
     */
    public String getInteriorMaterials() {
        return interiorMaterials;
    }

    /**
     * This function returns the object's license place
     * @return String, The assigned license place for the vehicle
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This function returns the object's monetary value
     * @return Double, The value of the car
     */
    public double getPrice() {
        return price;
    }

    /**
     * This function returns the object's
     * description of the condition of the vehicle
     * @return String description of the vehicle condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * This is not currently beinng used
     * @return
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * ALERT!! This seems like could give trouble
     * if an ID were to be changed after creation
     * and given a unique by the database
     * @param carId
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * ALERT!! This seems like could give trouble
     * if an ID were to be changed after creation
     * and given a unique by the database
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Sets the vehicle's maker
     * @param make String, Maker of the vehicle
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Sets the vehicle's model
     * @param model String, model of the vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the vehicle's year
     * @param year Integer, the year of vehicle
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * No being use. Maybe remove to minimize maintaince
     * @param exteriorColor
     */
    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    /**
     * No being use. Maybe remove to minimize maintaince
     * @param interiorColor
     */
    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    /**
     * No being use. Maybe remove to minimize maintaince
     * @param interiorMaterials
     */
    public void setInteriorMaterials(String interiorMaterials) {
        this.interiorMaterials = interiorMaterials;
    }

    /**
     * Sets the License Plate
     * @param licensePlate String, the char from the license plate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Sets the value of the vehicle
     * @param price Double, value of vehicle
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets description of the condition of the vehicle
     * @param condition String, short describe of the vehicle
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Where are we using this?
     * @param isAvailable
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
