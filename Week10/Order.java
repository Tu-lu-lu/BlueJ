package Week10;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderId;
    private String customerName;
    private int amount;
    
    public Order(int orderId,String customerName, int amount )
    {
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }
    
    public void setOrderId(int OrderId)
    {
        this.orderId=OrderId;
    }
    public int getOrderId()
    {
        return orderId;
    }
    
    public void setCustomerName(String CustomerName)
    {
        this.customerName=CustomerName;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    
    public void setAmount(int Amount)
    {
        this.amount=Amount;
    }
    public int getAmount()
    {
        return amount;
    }
    
    @Override
    public String toString(){

        return "\nOrder ID:"+getOrderId()+" \nCustomer Name: "+ getCustomerName()+" \nAmount: "+ getAmount();
    }
    
    public double calculateFinalAmount()
    {
        return amount;
    }
}