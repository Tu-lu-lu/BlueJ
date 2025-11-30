import java.util.Scanner;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();
        
    if(number % 3==0)
        {
            if(number % 5==0)
            {
                System.out.println("Divisible by both 3 and 5");
            }
            else
            {
                System.out.println("Divisible by 3 but not by 5");
            }
        }
    else if( number % 5==0)
            {
                if(number % 3==0){
                System.out.println("Divisible by 3 but divisible by 5");
            }
        
            else
            {
                System.out.println("Divisible by 5 but not by 3");
            }
        }
    }
}