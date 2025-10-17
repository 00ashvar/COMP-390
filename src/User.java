public abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String status;

    // Constructor
    public User(String firstName,
                String lastName,
                String email,
                String phone,
                String status){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getStatus() { return status; }
}
