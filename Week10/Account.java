package Week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int accountNo;
    private String holderName;
    private int balance;
    
    public Account(int accountNo, String holderName, int balance)
    {
        this.accountNo=accountNo;
        this.holderName= holderName;
        this.balance=balance;
    }
    
    public void setAccountNo(int newAccountNo)
    {
        this.accountNo=newAccountNo;
    }
    public int getAccountNo()
    {
        return this.accountNo;
    }
    
    public void setHolderName(String newHolderName)
    {
        this.holderName=newHolderName;
    }
    public String getHolderName()
    {
        return this.holderName;
    }
    public void setBalance(int newBalance)
    {
        this.balance=newBalance;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public double calculateInterest() {
        return 0;
    }

    @Override
    public String toString()
    {
    return "Account details -->\n Account No: "+getAccountNo()+",Account Holder Name: "+ getHolderName()+", Balance: "+getBalance();
    }
}