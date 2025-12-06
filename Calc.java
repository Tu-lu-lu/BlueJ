
import java.util.Scanner;

/**
 * Write a description of class Calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calc
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean choice =true;
        while(true){
        System.out.println("Enter first number");
        int a =scan.nextInt();
        System.out.println("Enter second number");
        int b =scan.nextInt();
        System.out.println("Enter arithmetic operation");
        String sign=scan.next();
        
        switch(sign){
            case "+":   
                System.out.println(a+b);
                break;
            case"-":
                System.out.println(a-b);
                break;
            case"%":
                System.out.println(a%b);
                break;
            case"*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid operation");
        }
        
        System.out.println("Do you want to continue Y/N");
        String cont=scan.next();
        
        if(cont == "N"){
            choice = false;
        }
    }
    }
}