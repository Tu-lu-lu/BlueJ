package Week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(101, "Nori", 10000);
        CurrentAccount c1 = new CurrentAccount(201, "Norgyatttttttttttttttttttttt", 15000);
        System.out.println(s1);
        System.out.println(c1);
    }
}
