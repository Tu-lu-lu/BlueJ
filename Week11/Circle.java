package Week11;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return (22/7) * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * (22/7) * radius;
    }
    public void draw() {
        System.out.println("Circle");
    }
}
