/**
 * FareCalculator
 * version 0.1
 * 10/19/25
 * FareCalculator - Handles fare calculation for trips
 * Supports standard, premium, and shared ride fare calculations
 */
public class FareCalculator{

    //standard pricing constants
    private static final double BASE_FARE = 2.50;
    private static final double PER_MILE_RATE = 1.75;
    private static final double RATE_PER_MINUTE =0.25;
    private static final double MINIMUM_FARE = 5.00;

    //premium pricing constants (luxury rides)
    private static final double PREMIUM_BASE_FARE = 5.00;
    private static final double PREMIUM_RATE_PER_MILE = 3.50;
    private static final double PREMIUM_RATE_PER_MINUTE = 0.50;

    //shared ride discount
    private static final double SHARED_RIDE_DISCOUNT = 0.75; // 25% discount

    //booking fee
    private static final double BOOKING_FEE = 1.00;

    /**
     * calculate fare for a standard ride
     * @param distanceMiles Double, Distance for the trip
     * @param durationMinutes Double, Estimated time of arrival
     * @return Double, Specific price to pay for this trip
     */
    public static double calculateStandardFare(double distanceMiles, int durationMinutes){
        validateInputs(distanceMiles, durationMinutes);

        double fare = BASE_FARE + 
                    BOOKING_FEE + 
                    (distanceMiles * PER_MILE_RATE) +
                    (durationMinutes * RATE_PER_MINUTE);

        return applyMinimumFare(roundToTwoDecimals(fare));
    }

    /**
     * Calculate fare for a premium ride
     * @param distanceMiles Double, Distance for the trip
     * @param durationMinutes Double, Estimated time of arrival
     * @return Double, Specific price to pay for this trip
     */
    public static double calculatePremiumFare(double distanceMiles, int durationMinutes){
        validateInputs(distanceMiles, durationMinutes);

        double fare = PREMIUM_BASE_FARE +
                     BOOKING_FEE +
                    (distanceMiles * PREMIUM_RATE_PER_MILE) +
                    (durationMinutes * PREMIUM_RATE_PER_MINUTE);

        return applyMinimumFare(roundToTwoDecimals(fare));
    }

    /**
     * Calculate fare for a shared ride (25% discount)
     * @param distanceMiles Double, Distance for the trip
     * @param durationMinutes Double, Estimated time of arrival
     * @return Double, Specific price to pay for this trip
     */
    public static double calculateSharedFare(double distanceMiles, int durationMinutes){

        double standardFare = calculateStandardFare(distanceMiles, durationMinutes);
        double sharedFare = standardFare * SHARED_RIDE_DISCOUNT;

        return applyMinimumFare(roundToTwoDecimals(sharedFare));

    }

    /**
     * Helper methods; round to two decimal places (for currency)
     * @param value Double,
     * @return Double, The value provide rounded to the currency format
     */
   public static double roundToTwoDecimals(double value){
        return Math.round(value * 100.0) / 100.0;
    }

    /**
     * Ensure fare meets minimum fare requirement
     * @param fare The value to be checked
     * @return Double, The minimun value for fare
     */
    public static double applyMinimumFare(double fare){
        return Math.max(fare, MINIMUM_FARE);
    }

    /**
     * Validate that inputs are non-negative
     * @param distanceMiles Double, Distance for the trip
     * @param durationMinutes Double, Estimated time of arrival
     */
    public static void validateInputs(double distanceMiles, int durationMinutes){
        if(distanceMiles < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        if(durationMinutes < 0) {
            throw new IllegalArgumentException("Duration cannot be negative.");
        }
    }
}