
/**
 * Write a description of class tut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tut
{
    public static void main(String[] args){
    
        //int age;
        //age=18;
        int number=15;
        
        //System.out.println("Welcome to Hamro Bazar");
        
        if(number % 3==0)
        {
            if(number % 5==0)
            {
                System.out.println("Divisible by both 3 and 5");
            }
            else
            {
                System.out.println("Divisible by 3 but not by 5");
            }
        }
        else if
        {
            if( number % 5==0)
            {
                System.out.println("Not divisible by 3 but divisible by 5");
            }
            else
            {
                System.out.println("Divisible by 3 but not by 5");
            }
        }
         if(number % 5 ==0)
        {
            System.out.println("Divisible by 5 but not by 3");
        }
        
        int choice =1; //[1,2,3]
        //char category='A';
        
        switch(choice)
        {
            //case 'A': discount=20;
            case 1: System.out.println("Drink: Sprite");
            case 2: System.out.println("Drink: Pepsi");
            case 3: System.out.println("Drink: Fanta");
            default: System.out.println("Not a valid choice.");
        }
        
        
        
        
        
        /*if(age > 18)
        {
        System.out.println(age);
    }
    else
    {
        System.out.println("You are less than 18");
    } */
    
    /*if(number>0)
    {
    System.out.println("Number is positive");
    }
    else if(number ==0)
    {
    System.out.println("Number is zero");
    }
    else
    {
    System.out.println("Number is negative");
    }*/
    //System.out.println("Thank You ! Happy Customer");
    }
}