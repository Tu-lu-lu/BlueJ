import java.util.Scanner;

/**
 * Write a description of class PosNegZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PosNegZero
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Enter a number");
    int num= scan.nextInt();
    
    if (num>0){
        System.out.println("It is positive");
    }
    else if (num==0){
        System.out.println("It is 0");
    }
    else{
        System.out.println("It is negative");
    }
    }
}