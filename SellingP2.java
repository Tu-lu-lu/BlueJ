import java.util.*;

/**
 * Write a description of class SellingP2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingP2
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the marked price of the item: ");
        float markedPrice = scan.nextFloat();
        
        System.out.println("Enter Category(A,B,C,D,E,F)");
        char category= scan.next().charAt(0);
        
        float discountPercent=0;
        
        switch(category){
        
        case 'A':
            discountPercent= 0.60f; break;
        case 'B':
            discountPercent= 0.60f; break;
        case 'C':
            discountPercent= 0.60f; break;
        case 'D':
            discountPercent= 0.60f; break;
        default:
            discountPercent=0;
            System.out.println("Invalid category entered. No discount applied.");
        }
        
        
        float sellingPrice = markedPrice - (markedPrice * discountPercent);
        System.out.println(sellingPrice);
    }
}