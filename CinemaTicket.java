import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter age(child(10+), adult(18-59), senior(60+)): ");
       int age= scanner.nextInt();
       
       System.out.println("Enter Movie's Language(nepali, hindi, english):");
       String language= scanner.next().toLowerCase();
       
       System.out.println("Do you have  a studentID (yes/no)?");
      String student= scanner.next().toLowerCase();
       
       System.out.println("Is it a festival day (yes/no)?");
       String festival= scanner.next().toLowerCase();
       
       double basePrice=0;
       
       if(age<=17){
            basePrice = 150;
        }
        else if (age>=18 || age <=59) {
            basePrice = 250;
        } 
        else if (age>=60) {
            basePrice = 200;
        } 
        else {
            System.out.println("Invalid age category.");
        }
        
        if (language.equals("hindi")) {
            basePrice += 50;
        } 
        else if (language.equals("english")) {
            basePrice += 100;
        } 
        else {
            System.out.println("Invalid movie language.");
        }
        
     double priceAfterDiscounts = basePrice;

        if (student.equals("yes")) {
            priceAfterDiscounts *= 0.8; 
        }

        if (festival.equals("yes")) {
            priceAfterDiscounts *= 0.85;
        }

        System.out.printf("Total ticket price:", priceAfterDiscounts);
}
}