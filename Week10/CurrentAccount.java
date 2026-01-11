package Week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String holderName, int balance) {
        super(accountNo, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        System.out.println("Current Account Interest:");
        return super.calculateInterest();
    }
    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
