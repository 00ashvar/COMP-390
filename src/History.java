
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

    // Constructor
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

    // getters
    public int getHistoryID() {
        return tripID;
    }
    public int getRiderID() {
        return riderID;
    }
    public int getCarID() {
        return carID;
    }
    public String getRequestedAt() {
        return requestedAt;
    }
    public String getPickupLoc() { return pickupLoc; }
    public String getDropoffLoc() { return dropoffLoc; }
    public Double getFare() { return fare; }
    public String getStatus() { return status; }
    public int getDriverID() { return driverID; }
    public String getLicensePlateNo() { return licensePlateNo; }

    // Setters
    public void setHistoryID(int tripID) { this.tripID = tripID; }
    public void setRequestedAt(String requestedAt) { this.requestedAt = requestedAt; }
    public void setPickupLoc(String pickupLoc) { this.pickupLoc = pickupLoc; }
    public void setDropoffLoc(String dropoffLoc) { this.dropoffLoc = dropoffLoc; }
    public void setFare(Double fare) { this.fare = fare; }
    public void setStatus(String status) { this.status = status; }
    public void setLicensePlateNo(String licensePlateNo) { this.licensePlateNo = licensePlateNo; }

    // Needs validation
    public void setRiderID(Integer riderID) {
        this.riderID = riderID;
    }
    public void setCarID(Integer carID) {
        this.carID = carID;
    }
    public void setDriverID(Integer driverID) { this.driverID = driverID; }

    // check Rider id is not empty
    private String validateRiderID(String rID) {
        //TODO check length is correct
        if (rID == null || rID.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid riderID: " + rID);
        }
        return rID;
    }

    // check car id is not empty
    private String validateCarID(String cID) {
        //TODO check length is correct
        if (cID == null || cID.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid carID: " + cID);
        }
        return cID;
    }

    // check Driver id is not empty
    private String validateDriverID(String dID) {
        //TODO check length is correct
        if (dID == null || dID.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid driverID: " + dID);
        }
        return dID;
    }
}
