package Week11;


/**
 * Write a description of class ShaMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShaMain
{
    public static void main(String[] args)
    {
        Shape s1=new Rectangle(10,10);
        s1.displayShapeInfo();

        Shape s2=new Circle(10);
        s2.displayShapeInfo();
    }
}