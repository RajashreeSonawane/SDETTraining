package Inheritance;

/**
 * problem statement:
 * "Create a parent class named Circle and its child class named Cylinder and print their areas.
 * parent class have variables declared for PI(π)=3.4 and radius only.
 * Its radius value should be initialised by constructor only.
 * Include method getCircleArea() to return area of circle.
 * area of circle = πr2
 * child class have variable declared for height only.
 * Its height and radius value should be initialised by constructor only.
 * Include method getCylinderArea() to return area of cylinder.
 * area of cylinder =2 πrh+2 πr2 "
 */
public class CircleTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4, 2);
        Circle circle = new Circle(2);
        circle.CircleArea();
        cylinder.CylinderArea();
    }
}

/**
 * output:
 * Area of circle: 12.56
 * Area of Cylinder: 75.36
 */