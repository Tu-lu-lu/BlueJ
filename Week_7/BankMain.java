package Week_7;


/**
 * Write a description of class BankMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankMain
{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(513,"Jeff",2500);
        BankAccount b2=new BankAccount(251,"Bob",1500);
        
        b1.withdraw();
        b2.deposit();
    }
}