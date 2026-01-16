package Week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer", landArea);
    }

    public double calculateYield() {
        return landArea * 300;
    }

    public double calculateWaterRequirement() {
        return landArea * 400; // low water
    }

    public double calculateTransportCost() {
        return landArea * 100;
    }

    public String getTransportMethod() {
        return "Mule / Local Carrier (Remote Villages)";
    }
}
