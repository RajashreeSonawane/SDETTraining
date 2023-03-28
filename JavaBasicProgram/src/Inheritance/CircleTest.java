package Inheritance;

public class CircleTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4, 2);
        Circle circle = new Circle(2);
        circle.CircleArea();
        cylinder.CylinderArea();
    }
}