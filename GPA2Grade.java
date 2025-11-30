import java.util.Scanner;

/**
 * Write a description of class GPA2Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPA2Grade
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter GPA:");
        float gpa = scan.nextFloat();
        char gpagrade ='P';
        if(gpa >=1.0 || gpa<=2.0){
            gpagrade='E';
        }
        else if(gpa >=2.0 || gpa<=2.5){
            gpagrade='D';
        }
        else if(gpa >=2.6 || gpa<=3.0){
            gpagrade='C';
        }
        else if(gpa >=3.1 || gpa<=3.6){
            gpagrade='B';
        }
        if(gpa >=3.6 || gpa<=4.0){
            gpagrade='A';
        }
        else {
            System.out.println("INVALID GPA");
        }
        System.out.println(gpagrade);
    }
}