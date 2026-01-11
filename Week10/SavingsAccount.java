package Week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String holderName, int balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        System.out.println("Savings Account Interest:");
        return super.calculateInterest()+(getBalance() * 0.04);
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
