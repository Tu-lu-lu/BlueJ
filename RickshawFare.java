import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
        
        Scanner scanner= new Scanner(System.in);
        
        //fare components
        final double BASE_FARE = 50.0;
        final double PER_KM_CHARGE = 20.0;
        final double PER_MINUTE_CHARGE = 2.0;
        final double LOCAL_DISCOUNT_PERCENT = 10.0;
        final double NIGHT_DISCOUNT_PERCENT = 20.0;
        final double LONG_DISTANCE = 10.0;
        
        //inputs
        System.out.print("Enter distance (in km): ");
        double distance = scanner.nextDouble();
        
        System.out.print("Enter time (in minutes): ");
        int time = scanner.nextInt();
        
        System.out.print("Is the customer a local? (true/false): ");
        boolean isLocal = scanner.nextBoolean();
        
        System.out.print("Is it night-time travel? (true/false): ");
        boolean isNight = scanner.nextBoolean();
        
        //base fare
        double totalFare = BASE_FARE + (distance * PER_KM_CHARGE) + (time * PER_MINUTE_CHARGE);
        
        //local discount for long distances using ternary operator
        totalFare = (isLocal && distance >= LONG_DISTANCE) 
                    ? totalFare - (totalFare * LOCAL_DISCOUNT_PERCENT / 100) 
                    : totalFare;
        
        //night discount using ternary operator
        totalFare = isNight 
                    ? totalFare + (totalFare * NIGHT_DISCOUNT_PERCENT / 100) 
                    : totalFare;
        
        //final fare in Nepali format
        System.out.println("\n--- Fare Breakdown ---");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + time + " minutes");
        System.out.println("Local Customer: " + (isLocal ? "Yes" : "No"));
        System.out.println("Night Travel: " + (isNight ? "Yes" : "No"));
        System.out.println("----------------------");
        System.out.printf("Total Fare: Rs. %.0f\n", totalFare);
        
    
    }
}