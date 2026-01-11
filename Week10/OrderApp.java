package Week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String[] args)
    {
        NormalOrder n1 = new NormalOrder(1, "Ram", 500);
        System.out.println("Normal Order Invoice:"+n1);
        System.out.println("Final Amount: " + n1.calculateFinalAmount());
        
        PremiumOrder p1 = new PremiumOrder(2, "Sham", 1000);
        System.out.println("Premium Order Invoice:"+p1);
        System.out.println("Final Amount: " + p1.calculateFinalAmount());
    }
}