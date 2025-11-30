import java.util.Scanner;

/**
 * Write a description of class divisible2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible2
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Enter a number");
    int num= scan.nextInt();
    
    if (num % 3==0 & num % 5==0){
     System.out.println("Divisible by both 3 and 5");  
    }
    else
    {
        System.out.println("Not divisible by both");
    }
}
}