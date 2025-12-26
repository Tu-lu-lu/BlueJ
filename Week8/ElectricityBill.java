package Week8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    
    public ElectricityBill(String consumerName,int unitsConsumed){
        this.consumerName=consumerName;
        this.unitsConsumed=unitsConsumed;
        }
        public void setConsumerName(String consumerName)
    {
        this.consumerName=consumerName;
    }
    public String getConsumerName()
    {
        return this.consumerName; 
    }
    public double calculateBill(){
        double billAmt=0;
        if(unitsConsumed<=100){
            billAmt=unitsConsumed*5;
        }else{
            billAmt=100*5+(unitsConsumed-100)*8;
        }
        return billAmt;
    }
}