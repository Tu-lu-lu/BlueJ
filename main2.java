
/**
 * Write a description of class main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main2
{
    public static void main(String[] args){
        car c1=new car();
        c1.price=1000000;
        c1.brand="Honda";
        c1.model="Civic";
        c1.drive();
        
        System.out.println(c1.price);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        
        car c2=new car();
        c2.price=100000000;
        c2.brand="Porsche";
        c2.model="Taycan";
        c2.brake();
        
        System.out.println(c2.price);
        System.out.println(c2.brand);
        System.out.println(c2.model);
        
    }
}