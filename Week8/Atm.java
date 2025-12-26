package Week8;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[] args){
        bankAccount b1=new bankAccount(1,2000,"Tulu");
        deposit(1000);
        withdraw(500);
    }
}