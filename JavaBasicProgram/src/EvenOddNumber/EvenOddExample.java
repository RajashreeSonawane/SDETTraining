package EvenOddNumber;

public class EvenOddExample {
    public void even_Odd_Number(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static void main(String[] args) {
        EvenOddExample evenOdd = new EvenOddExample();
        evenOdd.even_Odd_Number(20);
    }
}
