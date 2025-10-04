// Abstract class Shape
abstract class Shape {
    protected double area;
    protected double perimeter;

    // Abstract methods
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

// Interface Drawable
interface Drawable {
    void draw();
}

// Circle class extending Shape and implementing Drawable
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods from Shape
    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    // Implement interface method from Drawable
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Method to display results
    public void showDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.draw();
        circle.showDetails();
    }
}
