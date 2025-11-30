import java.util.Scanner;

/**
 * Write a description of class PassOrFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassOrFail
{
    public static void main(String[] args){
    Scanner scan =new Scanner(System.in);
    
    System.out.println("Enter Grade");
    int grade= scan.nextInt();
    
    if(grade>60)
    {
        System.out.println("You have passed the examination");
    }
    else
    {
        System.out.println("You have failed");
    }
    }
}