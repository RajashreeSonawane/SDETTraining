package Encapsulationexample;

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