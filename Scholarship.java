import java.util.Scanner;

/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter GPA ");
        float gpa = scan.nextFloat();
        System.out.print("Enter attendence %");
        int attendence = scan.nextInt();
        System.out.print("Enter attitude score(1-10)");
        int attitude= scan.nextInt();
        
        if(gpa>=3.2||attendence>80||attitude<5 ){
            System.out.println("the student is eligible for a scholarship");
        }
        else{
            System.out.println("he student is not eligible for a scholarship");
        }
    }
}