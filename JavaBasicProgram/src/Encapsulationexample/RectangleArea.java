package Encapsulationexample;
public class RectangleArea {
    private int length;
    private int breadth;
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void AreaCalculate()
    {
        int area=length*breadth;
        System.out.println("Area reactangle is:" +area);
    }
}

