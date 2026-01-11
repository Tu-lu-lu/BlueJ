package Week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp 
{
    public static void main(String[] args){
    BikeDelivery b1=new BikeDelivery(1,"Nidoran",2000);
    System.out.println(b1);
    System.out.println(b1.calculatePayment());
    CarDelivery c1=new CarDelivery(2,"Nory",5000);
    System.out.println(c1);
    System.out.println(c1.calculatePayment(100));
}
}