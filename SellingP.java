import java.util.Scanner;

/**
 * Write a description of class SellingP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingP
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the marked price of the item: ");
        float markedPrice = scan.nextFloat();
        
        System.out.println("Enter Category(A,B,C,D,E,F)");
        char category= scan.next().charAt(0);
        
        float discountPercent=0;
        
        if(category == 'A' || category == 'a') {
            discountPercent= 0.60f;
        }
        else if(category == 'B' ||category == 'b' ) {
            discountPercent=0.40f;
        }
        else if(category == 'C' ||category == 'c' ) {
            discountPercent=0.20f;
        }
        else if(category == 'D' ||category == 'd' ) {
            discountPercent=0.10f;
        }
        else
        {
            System.out.println("Invalid Category");
        }
        
        float sellingPrice = markedPrice - (markedPrice * discountPercent);
        System.out.println(sellingPrice);
    }
}