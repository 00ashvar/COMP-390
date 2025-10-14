public class Rider {

    private int riderID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    // Constructor
    public Rider(String rFirstName,
                  String rLastName,
                  String rEmail,
                  String rPhone){

        this.firstName = rFirstName;
        this.lastName = rLastName;
        this.email = rEmail;
        this.phone = rPhone;
    }

    // Getters
    public int getrId(){
        return riderID;
    }
    public String getrFirstName(){
        return firstName;
    }
    public String getrLastName(){
        return lastName;
    }
    public String getrEmail(){
        return email;
    }
    public String getrPhone(){
        return phone;
    }

    //Setters
    public void setdId(int riderID){
        this.riderID = riderID;
    }

}
