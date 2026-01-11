package Week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    public BikeDelivery(int partnerId, String name,int basePay)
    {
        super(partnerId,name,basePay);
    }
    
    @Override
    public double calculatePayment()
    {
        double basePay=super.calculatePayment();
        return basePay+ 500;
    }
    public double calculatePayment(int extraOrder)
    {
         double basePay=this.calculatePayment();
         double extraOrderBonus=50;
         double Order=basePay +(extraOrderBonus +extraOrder);
         return Order;
    }
    public void displayBikeDetails()
    {
        super.displayDetails();
        System.out.println(super.getPartnerId());
        System.out.println(super.getName());
        System.out.println(super.getBasePay());
    }
    @Override
    public String toString()
    {
        return "Person details -->\n person id:"+getPartnerId()+", \nperson Name: "+ getName()+", \nBase Pay: "+ getBasePay();
    }
}