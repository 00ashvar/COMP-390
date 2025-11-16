/**
 * History
 * version 0.1
 * 10/19/25
 * This class holds all the information about the users (drivers) (riders)
 */
public class User {

    private int userID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String license;
    private String dob;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String role;
    private String status;

    /**
     * Empty Constructor
     */
    public User(){}

    /**
     * Constructor of this class
     * @param username String, created from full name: (firstName.initialLast)
     * @param password String, Provided password
     * @param firstName String, Provided first name
     * @param lastName String, Provided last name
     * @param email String, Provided email
     * @param phone String, Provided phone: ###-###-####
     * @param license String, Provided vehicle license plate (driver)
     * @param DOB String, Provided date of birth: YYYY-MM-DD
     * @param streetAddress String, Provided street: # streetName
     * @param city String, Provided name of the city
     * @param state String, Provided state: MA
     * @param county String, Provided country
     * @param zipCode String, Provided Zip-code: #####
     * @param role String, Provided role: Rider or Driver
     * @param status String, Assigned status: Active, ...???
     */
    public User(String username,
                  String password,
                  String firstName,
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
                  String role,
                  String status){

        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.license = license;
        this.dob = DOB;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = county;
        this.zipCode = zipCode;
        this.role = role;
        this.status = status;
    }

    /**
     * Get the ID of a User class instance
     * @return Integer, The number ID
     */
    public int getId(){
        return userID;
    }

    /**
     * Get a user's username
     * @return String, The username of the user clas instance
     */
    public String getUsername(){
        return username;
    }

    /**
     * Get a user's password
     * @return String, Password given by user
     */
    public String getPassword(){
        return password;
    }

    /**
     * Get first name of a User class instance
     * @return String, first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Get last name of a User class instance
     * @return String, last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Get the email of a User class instance
     * @return String, email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Get the phone number of a User class instance
     * @return
     */
    public String getPhone(){
        return phone;
    }

    /**
     * Get the license plate of the car belonging
     * to the user class instance
     * @return String, Letter and numbers reprenceting the license plate
     */
    public String getLicense(){
        return license;
    }

    /**
     * Get the date of birth of a User class instance
     * @return String, date of birth: YYYY-MM-DD
     */
    public String getDob(){
        return dob;
    }

    /**
     * Get the street address of a User class instance
     * @return String, street address: # streetName
     */
    public String getStreetAddress(){
        return streetAddress;
    }

    /**
     * Get the name of the city of a User class instance
     * @return String, Name of a city
     */
    public String getCity(){
        return city;
    }

    /**
     * Get the state of the user class instance
     * @return String, State name: MA
     */
    public String getState(){
        return state;
    }

    /**
     * Get the country of a User class instance
     * @return String, the name of the country
     */
    public String getCountry(){
        return country;
    }

    /**
     * Get the zip-code of a User class instance
     * @return String, the numerical sequence of the zip-code
     */
    public String getZipCode(){
        return zipCode;
    }

    /**
     * Get the role of a User class instance. Two roles:
     * Driver or Rider
     * @return String, the chosen role: Driver or Rider
     */
    public String getRole() { return role; }

    /**
     * Get the status of a user's account
     * @return String, of the current status of the account
     */
    public String getStatus() { return status; }

    /**
     * Set unique User class instance identifier;
     * ATTENTION: Should be reserve for database usage
     * Could create conflicts with ID assigment
     * @param userID Integer, new ID to be assigned
     */
    public void setId(int userID){
        this.userID = userID;
    }

    /**
     * Set the username of a User class instance
     * @param username String, New name to be assigned
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Set password to a User class instance
     * @param password String, new password to be assigned
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Set first name to a User class instance
     * @param firstName String, new first name to be assigned
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Set last name to a User class instance
     * @param lastName String, new last name to be assigned
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Set email to a User class instance
     * @param email String, new email to be assigned
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Set the phone number of a User class instance
     * @param phone String, new phone number: ###-###-####
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Set the car's license plate of a User class instance
     * @param license String, new license plate
     */
    public void setLicense(String license){
        this.license = license;
    }

    /**
     * Set date  of birth of a User class instance
     * @param dob String, new date: YYYY-MM-DD
     */
    public void setDob(String dob){
        this.dob = dob;
    }

    /**
     * Set a street address of a User class instance
     * @param streetAddress String, new street address: # streetName
     */
    public void setStreetAddress(String streetAddress){ this.streetAddress = streetAddress; }

    /**
     * Set a city of a User class instance
     * @param city String, new city name
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Set a state of a User class instance
     * @param state String, new state initials: MA
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * Set a country for a User class instance
     * @param country String, new country name
     */
    public void setCountry(String country){
        this.country = country;
    }

    /**
     * Set zip-code of a User class instance
     * @param zipCode String, new zip-code sequence
     */
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    /**
     * Set a role (Rider or Driver) to a User class instance
     * @param role String, new role selection: Driver or Rider
     */
    public void setRole(String role) { this.role = role; }

    /**
     * Set the status of a User class instance
     * @param status String, new status name: Active, ...??
     */
    public void setStatus(String status) { this.status = status; }

    /**
     * Call to check a user class instance
     * @return String, the information on the
     * database about current User class
     */
    @Override
    public String toString() {
        return "User { " +
                "ID: " + userID + "\n" +
                "Name: " + getFirstName() + " " + getLastName()+ "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone #: " + getPhone() + "\n" +
                "License #: " + getLicense() + "\n" +
                "DOB: " + getDob() + "\n" +
                "Address: " + getStreetAddress() + " " + getCity() + ", " +
                getState() + " " + getZipCode() + " " + getCountry()+ "\n" +
                "Status: " + getStatus() + " }";
    }

}
