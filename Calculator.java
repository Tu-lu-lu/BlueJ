import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);
        
    System.out.println("Enter First number: ");
    
    int firstNum= scan.nextInt();
    
    System.out.println("Enter Second number: ");
    
    int secondNum=scan.nextInt();
    
    System.out.println("My first number is: "+ firstNum);
    System.out.println("My second number is: "+ secondNum);
    }
}