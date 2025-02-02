import java.util.*;

class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius; // Area of circle
    }

    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth; // Area of rectangle
    }

    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Question_11 {
    public static void main(String[] args) {
        
        Circle myCircle = new Circle(5);
        Rectangle myRect = new Rectangle(10, 5);

        myCircle.displayShape(); 
        myCircle.draw(); 
        System.out.println("Area of Circle: " + myCircle.calculateArea());

        System.out.println(); 

        myRect.displayShape(); 
        myRect.draw();
        System.out.println("Area of Rectangle: " + myRect.calculateArea());
    }
}