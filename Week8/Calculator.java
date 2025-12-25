package Week8;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{   
    //instance method- void return type+ no params
    public void displayInfo()
    {
        System.out.println("Welcome to calculator app.");
    }
    
    
    //void return type + params
    public void add(int a, int b) //formal paramaters
    {
        System.out.println("The sum of two numbers are:" +(a+b));
    }
    
    //return type + no params
    public int getFixedNumber()
    {
        return 10;
    }
    
    //return type + params
    
    public int multiply(int a, int b)
    {
        return a*b;
    }
}