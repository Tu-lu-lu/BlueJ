import java.util.Scanner;

/**
 * Write a description of class Que8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Que8
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num =scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
}
}