/**
 * Payment
 * version 0.1
 * 10/19/25
 * This class contains all information about payment
 */
public class Payment {
    private int paymentID;
    private int tripID;
    private String paymentMethod;
    private double amountPaid;
    private String status;
    private String paymentDate;

    /**
     * Empty Constructor
     */
    public Payment() {}

    /**
     * This is the constructor for this class
     * @param Paid Integer, representing the amount paid by the client
     * @param pMethod String, Method of payment (e.g., credit card  )
     * @param pID   Integer, The database key value tracker
     * @param pDate String, The time stamp for when payment is processed
     */
    public Payment(int pID, String pMethod, double Paid, String status, String pDate){
        this.paymentID = pID;
        this.paymentMethod = pMethod;
        this.amountPaid = Paid;
        this.status = status;
        this.paymentDate = pDate;
    }

    /**
     * Get the amount to pay
     * @return Double, formated value in currentcy
     */
    public Double getAmountPaid(){
        return amountPaid;
    }

    /**
     * Get payment method information
     * @return String, Payment info
     */
    public String getPaymentMethod(){
        return paymentMethod;
    }

    /**
     * Get the payment ID
     * @return Integer, Payment ID
     */
    public int getPaymentID(){
        return paymentID;
    }

    /**
     * Get payment date
     * @return String,  date formated YYY-MM-DD
     */
    public String getPaymentDate(){
        return paymentDate;
    }

    /**
     * Get the instance's trip ID
     * @return Integer, The ID of the trip
     */
    public int getTripID(){
        return tripID;
    }

    /**
     * Get the status of the payment being proccess
     * @return String, staust of the payment
     */
    public String getStatus(){
        return status;
    }

    /**
     * Set the status as the payment process is approve
     * @param status String, update the payment's status
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     * Set the payment ID; This function should be used by the database exclusibly
     * @param paymentID Integer, The unique identifier for Payment
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * Set the trip ID; This function should be used by the database exclusibly
     * @param tripID Integer, The unique identifier for the trip
     */
    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    /**
     * Sets the amount to be pay to the user (driver)
     * @param amountPaid Double, value of the amount to be pay
     */
    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * Sets the information of the payment method to be use
     * @param paymentMethod String, info to be user for payment proccessing
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Sets the date payment was proccess
     * @param paymentDate String, date formated YYY-MM-DD
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * TODO: Missing Application
     */
    public void processPayment(){

    }

    /**
     * TODO: Missing Application
     */
    public void verifyPayment(){

    }

    /**
     * TODO: Missing Application
     */
    public int refundPayment(Double amountPaid){
        return 0;
    }

    /**
     * Generate a formated receipt
     * @return String, a complete user-friendly formated receipt
     */
    public String generateReceipt(){
        double fare = amountPaid;
        double tax = amountPaid * 0.0625;
        double withTax = amountPaid + tax;

        return  String.format("""
            ID: %d
            
            Trip Fare---------------------$%.2f
            Tax---------------------------$%.2f
            Total-------------------------$%.2f
            
            Payment Method:
            %s
            %s
            """, tripID,
                fare,
                tax,
                withTax,
                paymentMethod.toUpperCase(),
                paymentDate);
    }
}
