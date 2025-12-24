package Week_7;


/**
 * Write a description of class mMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mMain
{
    public static void main(String[] args){
        Mobile m1=new Mobile("Iphone",250000);
        Mobile m2=new Mobile("NOTHING",15000);
        Mobile m3=new Mobile("Samsung",100000);
        
        m1.isAffordable();
        m2.isAffordable();
        m3.isAffordable();
    }
}