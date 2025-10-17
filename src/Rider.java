public class Rider extends User{

    private int riderID;

    // Constructor
    public Rider(String firstName,
                 String lastName,
                 String email,
                 String phone,
                 String status){
        super(firstName, lastName, email, phone, status);
    }

    // Getters
    public int getrId(){
        return riderID;
    }

    //Setters
    public void setdId(int riderID){
        this.riderID = riderID;
    }

}
