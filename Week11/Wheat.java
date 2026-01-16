package Week11;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    public double calculateYield() {
        return landArea * 400;
    }

    public double calculateWaterRequirement() {
        return landArea * 600;
    }
    
    public double calculateTransportCost() {
        return landArea * 150;
    }

    public String getTransportMethod() {
        return "Pickup Van";
    }
}
