import java.util.Scanner;

/**
 * Write a description of class Que9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Que9
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num=scan.nextInt();
        int reversed=0;
        while(num>0){
            int digit= num%10;
            reversed = reversed*10+digit;
            num= num/10;
        }
        System.out.println(reversed);
    }
}