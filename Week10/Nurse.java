package Week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private int shift;
    private int extraAllowence;
    
    public Nurse(int id, String name,int shift, int extraAllowence) 
    {
        super(id,name);
        this.shift=shift;
        this.extraAllowence=extraAllowence;
    }
    
    @Override
    public double calculateSalary()
    {   
        double baseFee=super.calculateSalary();
        double normalPayment= baseFee +(shift *extraAllowence);
        return normalPayment;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+", Shift: "+ this.shift+ ", Extra Allowence: "+ this.extraAllowence;
    }
    
    public void displayNurseDetails()
    {
        super.displayDetails();
        System.out.println("Shift: "+this.shift);
        System.out.println("Extra Allowence: "+this.extraAllowence);
        System.out.println("Normal Payment for the nurse is: "+ this.calculateSalary());
    }
}