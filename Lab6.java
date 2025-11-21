import java.util.Scanner;

/**
 * Write a description of class Lab6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6
{
public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    /*
    System.out.println("Enter First number: ");
    
    int firstNum= scan.nextInt();
    
    System.out.println("Enter Second number: ");
    
    double secondNum=scan.nextDouble();
    
    scan.nextLine();
    
    System.out.println("Ask for his/her name:");
    
    String name=scan.nextLine();
    
    System.out.println("My first number is:"+ firstNum);
    System.out.println("My second number is"+ secondNum);
    System.out.println("My name is:"+ name);
    */
    
    
   
   System.out.println("Your age:");
   
   int age= scan.nextInt();
   
    String canDrive =(age >= 18)? "Driving is allowed":"Driving is not allowed" ;
    
    System.out.println(canDrive);

}
}