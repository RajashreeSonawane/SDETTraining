package Inheritance;

public class Circle {
    int radius;
    float PI = 3.14f;

    Circle(int r) {
        radius = r;
    }

    public void CircleArea() {
        float area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int h, int r) {
        super(r);
        height = h;
    }

    public void CylinderArea() {
        float carea = ((2 * PI * radius * height) + (2 * PI * radius * radius));
        System.out.println("Area of Cylinder: " + carea);
    }
}