package Week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private double consultationFee;
    
    public Doctor(int id, String name, String specialization, double consultationFee)
    {
        super(id, name);
        this.specialization=specialization;
        this.consultationFee=consultationFee;
    }
    
    @Override
    public double calculateSalary()
    {
        double baseFee=super.calculateSalary();
        double normalPayment= baseFee +(consultationFee * 30);
        return normalPayment;
    }
    
    //method overloading
    public double calculateSalary(int emergencyCase)
    {
        double normalPay= this.calculateSalary();
        double perEmergencyCharge=1000;
        double emergencyBonus=emergencyCase * perEmergencyCharge;
        return normalPay+ emergencyBonus;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+", Specialization: "+ this.specialization+", consultationFee: "+ this.consultationFee ;
    }
    
    public void displayDoctorDetails()
    {
        super.displayDetails();
        //System.out.println(super.getId());
        //System.out.println(super.getName());
        System.out.println("Sepcialization: "+this.specialization);
        System.out.println("consultationFee: "+this.consultationFee);
        System.out.println("Normal Payment for the doctor is: "+ this.calculateSalary());
    }
}