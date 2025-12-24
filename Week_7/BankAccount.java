package Week_7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int number;
    String name;
    int balance;
    
    public BankAccount(int Number, String Name, int balance){
        this.number=number;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(){
        int dep=balance +1000;
        System.out.println("Balance after deposit is: "+dep);
    }
    public void withdraw(){
        int wit=balance -1000;
        System.out.println("Balance after withdrawal is: "+wit);
    }
}