
public class History {
    private int tripID;
    private int riderID;
    private int carID;
    private String requestedAt;
    private String pickupLoc;
    private String dropoffLoc;
    private Double fare;
    private String status;
    private int driverID;
    private String licensePlateNo;

    // Empty Constructor
    public History(){}

    /**
     * Constructor for this class
     * @param riderID Integer, Unique identifier
     * @param carID Integer, Unique identifier.
     * @param requestedAt String, The time of initial request.
     * @param pickupLoc String, Address where driver picks rider.
     * @param dropoffLoc String, Address where driver drops rider.
     * @param fare Double, The calculated fare.
     * @param status String,
     * @param driverID Integer, Unique identifier.
     * @param licensePlateNo String, Unique char for the license plate.
     */
    public History(Integer riderID, Integer carID, String requestedAt,
                   String pickupLoc, String dropoffLoc, Double fare, String status,
                   Integer driverID, String licensePlateNo) {
        this.riderID = riderID;
        this.carID = carID;
        this.requestedAt = requestedAt;
        this.pickupLoc = pickupLoc;
        this.dropoffLoc = dropoffLoc;
        this.fare = fare;
        this.status = status;
        this.driverID = driverID;
        this.licensePlateNo = licensePlateNo;
    }

    /**
     * This function returns the object's trip ID
     * @return Integer, Unique Trip ID
     */
    public int getHistoryID() {return tripID;}
    /**
     * This function returns the object's rider ID
     * @return Integer, Unique rider ID
     */
    public int getRiderID() {return riderID;}
    /**
     * This function returns the object's car ID
     * @return Integer, Unique car ID
     */
    public int getCarID() {return carID;}
    /**
     * This function returns the time rider was requested
     * @return String, value of the request time
     */
    public String getRequestedAt() {return requestedAt;}
    /**
     * This function returns the location where driver meets the rider
     * @return String, A address will be return
     */
    public String getPickupLoc() { return pickupLoc; }
    /**
     * This function returns the location where the drive takes the rider
     * @return String, A address will be return
     */
    public String getDropoffLoc() { return dropoffLoc; }
    /**
     * This function returns the amount pay by the rider
     * @return Double, amount in the decimal format #.##
     */
    public Double getFare() { return fare; }
    /**
     * This function returns the status of the history object
     * @return String, The tate of the trip
     */
    public String getStatus() { return status; }
    /**
     * This function returns the object's driver ID
     * @return String, Unique driver ID
     */
    public int getDriverID() { return driverID; }
    /**
     * This function returns the object's licence Plate num
     * @return String, Unique licence plate for the car
     */
    public String getLicensePlateNo() { return licensePlateNo; }

    // Setters
    public void setHistoryID(int tripID) { this.tripID = tripID; }
    public void setRequestedAt(String requestedAt) { this.requestedAt = requestedAt; }
    public void setPickupLoc(String pickupLoc) { this.pickupLoc = pickupLoc; }
    public void setDropoffLoc(String dropoffLoc) { this.dropoffLoc = dropoffLoc; }
    public void setFare(Double fare) { this.fare = fare; }
    public void setStatus(String status) { this.status = status; }
    public void setLicensePlateNo(String licensePlateNo) { this.licensePlateNo = licensePlateNo; }
    public void setRiderID(Integer riderID) {this.riderID = validateRiderID(riderID);}
    public void setCarID(Integer carID) {this.carID = validateCarID(carID);}
    public void setDriverID(Integer driverID) { this.driverID = validateDriverID(driverID); }

    // check Rider id is not empty

    /**
     * This function validate the rider given ID and returns it back if it's valid.
     * @param rID Integer, Rider ID to be validated
     * @return Integer, Validated rider ID
     * @throws IllegalArgumentException if rider ID is invalid
     */
    private int validateRiderID(int rID) {
        // make sure it is a valid num
        if ((rID < 0)) {
            throw new IllegalArgumentException("Invalid riderID: " + rID);
        }
        return rID;
    }

    /**
     * This function validate the car given ID and returns it back if it's valid.
     * @param cID Integer, Car ID to be validated
     * @return Integer, Validated car ID
     * @throws IllegalArgumentException if car ID is invalid
     */
    private int validateCarID(int cID) {
        if ((cID < 0)) {
            throw new IllegalArgumentException("Invalid carID: " + cID);
        }
        return cID;
    }

    /**
     * This function validate the driver given ID and returns it back if it's valid.
     * @param dID Integer, Driver ID to be validated
     * @return Integer, Validated driver ID
     * @throws IllegalArgumentException if driver ID is invalid
     */
    private int validateDriverID(int dID) {
        // Validate given ID
        if ((dID < 0)) {
            throw new IllegalArgumentException("Invalid driverID: " + dID);
        }
        return dID;
    }
}
