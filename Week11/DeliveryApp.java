package Week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    //int id, double distance, String pickUp, String dropOff
    public static void main(String[] args)
    {   
        //actual run time polymorphism
        Notification delivery1= new CarDelivery(1001,10,"Chabahil","Thankot");
        //System.out.println(delivery1.calculateCharge()); //dynamic method dispatch
        delivery1.notify("Your order has been placed.");
    }
}