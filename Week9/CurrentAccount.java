package Week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CurrentAccount extends BankAccount {
    double overdraftLimit;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal not allowed. Overdraft limit exceeded.");
            return false;
        }
    }
}
