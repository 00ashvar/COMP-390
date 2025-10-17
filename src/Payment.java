public class Payment {
    public int paymentId;
    public int tripId;
    public String paymentMethod;
    public Double amount;
    public String status;
    public String processedAt;

    // Empty Constructor
    public Payment(){}

    // Constructor
    public Payment(Integer paymentId, Integer tripId, String paymentMethod,
                   Double amount, String status, String processedAt){
        this.paymentId = paymentId;
        this.tripId = tripId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = status;
        this.processedAt = processedAt;
    }

    // Getters
    public int getPaymentId() { return paymentId; }
    public int getTripId() { return tripId; }
    public String getPaymentMethod() {return paymentMethod; }
    public Double getAmount() { return amount; }
    public String getStatus() { return status; }
    public String getProcessedAt() { return processedAt; }

    // Setters

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }
}
