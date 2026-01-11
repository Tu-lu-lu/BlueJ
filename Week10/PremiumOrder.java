package Week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order
{
    public PremiumOrder(int orderId,String customerName, int amount) {
        super(orderId, customerName, amount);
    }
    @Override
    public double calculateFinalAmount() {
        double premiumCharge = 200;
        return super.calculateFinalAmount() + premiumCharge;
    }
    public double calculateFinalAmount(double discountAmount) {
        return super.calculateFinalAmount() - discountAmount;
    }
}