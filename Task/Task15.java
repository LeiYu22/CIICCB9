import java.text.DecimalFormat;

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void printDetails() {
        System.out.println("Shape Details: ");
        System.out.println("Color: " + this.color);
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shape Type: Circle");
        System.out.println("Radius: " + this.radius);
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width); 
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shape Type: Rectangle");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }
}

public class Task15 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Circle circle = new Circle("Red", 5.0);
        circle.printDetails();
        System.out.println("Area: " + df.format(circle.calculateArea()));
        System.out.println("Perimeter: " + df.format(circle.calculatePerimeter()));
        System.out.println("-------------------------");

        Rectangle rectangle = new Rectangle("Blue", 10.0, 5.0);
        rectangle.printDetails();
        System.out.println("Area: " + df.format(rectangle.calculateArea()));
        System.out.println("Perimeter: " + df.format(rectangle.calculatePerimeter()));
    }
}