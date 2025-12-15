import java.util.Scanner;

/**
 * Write a description of class SimpleNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleNum
{
    public static void main(String[] args){
    int[] sub={10, 20, 30, 40, 50};
    int sum=0;
        for(int i=0;i<sub.length;i++){
            System.out.println(sub[i]);
            sum=sum+ sub[i];
        }
    System.out.println(sum);
    int avg= sum/sub.length;
    System.out.println(avg);
    
    int highest=sub[0];
    int lowest=sub[0];
        for(int i=0; i<sub.length;i++){
            if(highest<sub[i]){
                highest=sub[i];
            }
            if(lowest>sub[i]){
                lowest=sub[i];
            }
}
System.out.println("Highest is: "+highest);
System.out.println("Lowest is: "+lowest);

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a length:");
    int newSub = scan.nextInt();
    
    int[] newSubject;
    newSubject= new int[newSub];
    for(int i=0;i<newSubject.length;i++){
            System.out.println("Enter the marks");
            newSubject[i]=scan.nextInt();
        }
    for(int i=0;i<newSubject.length;i++){
        System.out.println(newSubject[i]);
    }
}
}