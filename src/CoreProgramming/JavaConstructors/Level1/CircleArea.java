package CoreProgramming.JavaConstructors.Level1;
import java.util.Scanner;
class Circle {
    double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class CircleArea {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius (default): " + c1.radius);
        System.out.println("Area: " + c1.area());
        System.out.println();
        Circle c2 = new Circle(5);
        System.out.println("Radius (user provided): " + c2.radius);
        System.out.println("Area: " + c2.area());
    }
}

