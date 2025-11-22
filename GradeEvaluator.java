import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Enter Grade");
    int grade=scan.nextInt();
    
    String Grade= (grade>=40)? "Pass":"Fail";
    System.out.println("According to your grades \nyou have"+Grade);
    
    }
}