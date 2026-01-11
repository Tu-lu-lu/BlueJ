package Week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private int basePay;
    
    public DeliveryPartner(int partnerId, String name, int basePay)
    {
        this.partnerId=partnerId;
        this.name=name;
        this.basePay=basePay;
    }
    public void setPartnerId(int newPartnerId)
    {
        this.partnerId=newPartnerId;
    }
    public int getPartnerId()
    {
        return this.partnerId;
    }
    public void setName(String newName)
    {
        this.name=newName;
    }
    public String getName()
    {
        return this.name;
    }
    public void setBasePay(int newBasePay)
    {
        this.basePay=newBasePay;
    }
    public int getBasePay()
    {
        return this.basePay;
    }
    
    public double calculatePayment()
    {
        return 10000;
    }
    
    public void displayDetails()
    {
        System.out.println("Partner ID: "+getPartnerId());
        System.out.println("Name: "+getName());
        System.out.println("Base Pay: "+getBasePay());
    }
    @Override
    public String toString(){

        return "Person details -->\n person id:"+getPartnerId()+", \nperson Name: "+ getName()+", \nBase Pay: "+ getBasePay();
    }
}