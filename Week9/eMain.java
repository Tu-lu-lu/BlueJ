package Week9;


/**
 * Write a description of class eMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eMain
{
    public static void main(String[] args) {

        PermanentEmployee pe = new PermanentEmployee(101, "Alice", 30000, 8000, 5000);

        System.out.println("Permanent Employee Details:");
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());
        System.out.println();
        ContractEmployee ce = new ContractEmployee(102, "Bob", 1000, 20);

        System.out.println("Contract Employee Details:");
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}