package Week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery implements Notification
{
    private static final double PER_KM_CHARGE= 40;
    private static final double MIN_PER_KM= 5;
    public CarDelivery(int id, double distance, String pickUp, String dropOff)
    {
        super(id,distance,pickUp,dropOff);
    }
    
    @Override
    public double calculateCharge()
    {
        return super.getDistance() * PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistance() * MIN_PER_KM;
    }
    
    /*public double display(){
        return this.
    }
    */
    @Override 
    public void notify(String message){
        System.out.print(message);
    }
}