package Week11;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public void displayShapeInfo() {
        System.out.println("Area is " + calculateArea());
        System.out.println("Perimeter is " + calculatePerimeter());
    }
}
