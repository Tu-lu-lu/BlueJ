package Week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
   public Employee(double basicSalary){
       this.basicSalary=basicSalary;
   }
   public void setbasicSalary(double basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    public double getbasicSalary()
    {
        return this.basicSalary; 
    }
   public double calculateGrossSalary()
    {
       System.out.println("Basic Salary is: "+basicSalary);
       double bonus=0.2*basicSalary;
       System.out.println("Gross Salary after 20% bonus is: "+bonus);
       return this.basicSalary;
    }
}