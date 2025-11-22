
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
    //Arithmetic
    int a=10;
    int b=20;
    int sum=a+b;
    int sub=a-b;
    int mul=a*b;
    System.out.println("Sum="+sum);
    System.out.println("sub="+sub);
    System.out.println("mul="+mul);
    
    //Unary
    System.out.println(++a );
    System.out.println(a++);
    
    //Assignment
    int c=a+b;
    
    //Relational
    System.out.println(a==b);
    System.out.println(a>b);
    System.out.println(a<b);

    //Logical
     boolean ToF= (b>a) &&(b<c);
    //Ternary
     String addition =(a>b)?"True":"False";
    }
}