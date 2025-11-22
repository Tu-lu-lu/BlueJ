
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    byte a;
    short b;
    int c;
    long d;
    float e; 
    double f;
    char g;
    boolean h;
    public static void main(String[] args){
    DefaultValues D1= new DefaultValues();
    
    System.out.println(D1.a);
    System.out.println(D1.b);
    System.out.println(D1.c);
    System.out.println(D1.d);
    System.out.println(D1.e);
    System.out.println(D1.f);
    System.out.println(D1.g);
    System.out.println(D1.h);
    
    
/*Member variables get default values automatically (0 for numbers, false for boolean, '\u0000' for char)
Local variables must be explicitly initialized before use, or you'll get a compilation error
This demonstrates an important difference in Java's memory management and safety features*/
    }
}