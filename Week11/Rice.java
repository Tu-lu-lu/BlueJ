package Week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    public double calculateYield() {
        return landArea * 500;
    }

    public double calculateWaterRequirement() {
        return landArea * 1000;
    }

    public double calculateTransportCost() {
        return landArea * 200;
    }

    public String getTransportMethod() {
        return "Tractor / Mini Truck (Rural Roads)";
    }
}
