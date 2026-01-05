package Week9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    int vehicleId;
    String brand;
    double basePrice;
    
    public Vehicle(int vehicleId, String brand, double basePrice){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.basePrice=basePrice;
    }
    void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: " + basePrice);
    }
    double calculateTax() {
        return 0.10 * basePrice;
    }
    
}