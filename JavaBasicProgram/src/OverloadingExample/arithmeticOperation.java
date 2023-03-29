package OverloadingExample;

public class arithmeticOperation {
    public static void display(int a, int b) {
        int c = a + b;
        System.out.println("Addition is:" + c);
    }

    public static void display(int a, int b, int c) {
        int d = a - b - c;
        System.out.println("Subtraction is :" + d);
    }

    public static void main(String[] args) {
        arithmeticOperation operation = new arithmeticOperation();
        operation.display(1, 2);
        operation.display(1, 4, 5);
    }
}