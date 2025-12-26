package Week8;


/**
 * Write a description of class bankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankAccount
{
    private int accountNumber;
    private double balance;
    private String name;
    
    public bankAccount(int accountNumber, double balance, String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
         
        
    }
    
    public boolean withdraw(double amount){
    }
}