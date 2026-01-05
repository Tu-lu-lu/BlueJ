package Week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Car extends Vehicle
{
    int numberOfDoors;
    String fuelType;
    Car(int vehicleId, String brand, double basePrice,
        int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    double calculateFinalPrice() {
        double tax = super.calculateTax();
        double luxuryCharge = 0.05 * basePrice;
        return basePrice + tax + luxuryCharge;
    } Car(int vehicleId, String brand, double basePrice){
        super(vehicleId, brand, basePrice);
    }
}