package Encapsulationexample;
public class RectangleDemo {
        public static void main(String[] args)
        {
            RectangleArea t=new RectangleArea();
            t.setLength(12);
            System.out.println("Length of rectangle is:" +t.getLength());
            t.setBreadth(10);
            System.out.println("Breadth of rectangle is:" +t.getBreadth());
            t.AreaCalculate();
    }
}