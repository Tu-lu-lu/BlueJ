package Week_7;


/**
 * Write a description of class lMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lMain
{
    public static void main(String[] args){
    Laptop l1 =new Laptop("Victus", 8, 150000);
    Laptop l2 =new Laptop("LOQ", 16, 250000);
    Laptop l3 =new Laptop("OMEN", 32, 500000);
    
    if(l1.RAM>8){
            System.out.println(l1.brand+" has more than 8GB");
    }
    if(l2.RAM>8){
            System.out.println(l2.brand+" has more than 8GB");
    }
    if(l3.RAM>8){
            System.out.println(l3.brand+" has more than 8GB");
    }
}
}