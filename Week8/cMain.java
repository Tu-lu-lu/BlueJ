package Week8;


/**
 * Write a description of class cMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cMain
{
    public static void main(String[] args){
        
        //invoking an instance method
        Calculator calc=new Calculator();
        calc.displayInfo(); //void + no params
        calc.add(10,20); //actual paramters
        calc.add(30,40);
        calc.add(50,60);
        
        System.out.println(calc.getFixedNumber());
        int fixNum= calc.getFixedNumber();
        
        System.out.println("The Fixed Number is: "+ fixNum);
    }
}