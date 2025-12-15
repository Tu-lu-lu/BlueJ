import java.util.Scanner;

/**
 * Write a description of class District here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class District
{
    public static void main(String[] args){
        String[] name={"Morang","Kathmandu","Kaski", "Sindhuli"};
        int j=1;
        for(int i=0; i<name.length;i++){
            System.out.println(j+"."+name[i]);
            j++;
        }
        
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a length:");
    int newName = input.nextInt();
    
    String[] place;
    place= new String[newName];
    for(int i=0;i<place.length;i++){
            System.out.println("Enter the name of the place");
            place[i]=input.next();
        }
    for(int i=0;i<place.length;i++){
        System.out.println(place[i]);
    }
}
}