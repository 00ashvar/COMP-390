public class Driver extends User {

    private int driverID;
    private String license;
    private String dob;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    // Constructor
    public Driver(String firstName,
                  String lastName,
                  String email,
                  String phone,
                  String license,
                  String DOB,
                  String streetAddress,
                  String city,
                  String state,
                  String county,
                  String zipCode,
                  String status){

        super(firstName, lastName, email, phone, status);
        this.license = license;
        this.dob = DOB;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = county;
        this.zipCode = zipCode;
    }

    // Getters
    public int getdId(){
        return driverID;
    }
    public String getdLicense(){
        return license;
    }
    public String getDob(){
        return dob;
    }
    public String getdStreetAddress(){
        return streetAddress;
    }
    public String getdCity(){
        return city;
    }
    public String getdState(){
        return state;
    }
    public String getdCountry(){
        return country;
    }
    public String getdZipCode(){
        return zipCode;
    }

    //Setters
    public void setdId(int driverID){
        this.driverID = driverID;
    }

}
