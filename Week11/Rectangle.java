package Week11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 *(length + breadth);
    }

    
    public void draw() {
        System.out.println("Rectangle");
    }
}
