package Week9;


/**
 * Write a description of class BankMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankMain
{
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount(101, "Ram", 1000, 5);
        savings.deposit(500);

        double interest = savings.calculateInterest();
        System.out.println("Interest earned: " + interest);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        
        CurrentAccount current = new CurrentAccount(201, "Bob", 800, 300);
        current.deposit(200);
        current.withdraw(1000);

        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
