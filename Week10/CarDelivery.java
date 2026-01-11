package Week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    public CarDelivery(int partnerId, String name,int basePay)
    {
        super(partnerId,name,basePay);
    }
    @Override
    public double calculatePayment()
    {
        double basePay=super.calculatePayment();
        return basePay+ 1000;
    }
    public double calculatePayment(int extraOrder)
    {
         double basePay=this.calculatePayment();
         double extraOrderBonus=100;
         double Order=basePay +(extraOrderBonus +extraOrder);
         return Order;
    }
    public void displayCarDetails()
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