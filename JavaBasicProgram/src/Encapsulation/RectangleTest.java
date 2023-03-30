package Encapsulationexample;

/**
 * problem statement:
 * 1. Create class Rectangle
 * 2. Have length and breadth
 * 3. Have setter and getter for these two variables
 * 4. Calculate arear of rectangle  Implementation of Encapsulation"
 */
public class RectangleTest {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.setLength(12);
        System.out.println("Length of rectangle is:" + rectangleArea.getLength());
        rectangleArea.setBreadth(10);
        System.out.println("Breadth of rectangle is:" + rectangleArea.getBreadth());
        rectangleArea.areaCalculate();
    }
}

/**
 * output:
 * Length of rectangle is:12
 * Breadth of rectangle is:10
 * Area reactangle is:120
 */