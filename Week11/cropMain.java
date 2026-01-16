package Week11;


/**
 * Write a description of class CropMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cropMain {
    public static void main(String[] args) {
        Crop[] crops = new Crop[3];

        crops[0] = new Rice(2);
        crops[1] = new Wheat(1.5);
        crops[2] = new Maize(1);

        for (Crop crop : crops) {
            crop.displayCropInfo();
            System.out.println("Estimated Yield: " + crop.calculateYield());
            System.out.println("Water Requirement: " + crop.calculateWaterRequirement());

            Transportable t1 = (Transportable) crop;
            System.out.println("Transport Method: " + t1.getTransportMethod());
            System.out.println("Transport Cost: " + t1.calculateTransportCost());
        }
    }
}
