
/**
 * Write a description of class WaterLevelMoniter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMoniter
{
    public static void main(String[] args){
        int waterLevel = 950;
        System.out.println("Water Level Monitoring System");
        System.out.println("Current Water Level: " + waterLevel);
        System.out.println();
        
        String statusMessage = (waterLevel >= 1000) ? "WARNING: Water level has reached 1000L or more" : "Status: Normal";
        System.out.println(statusMessage);
    }
        
}
