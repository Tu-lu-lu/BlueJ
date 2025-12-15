import java.util.Scanner;

/**
 * Write a description of class StudentArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentArray
{
    public static void main(String[] args){
        String[] name={"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
        
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        System.out.println(name[2]);
        
        name[4]="Tulakshya";
        System.out.println(name[4]);
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name:");
        String newname= scan.next();
        
        System.out.println("Enter the index you want to change the value to");
        int newIn= scan.nextInt();
        name[newIn]=newname;
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
}