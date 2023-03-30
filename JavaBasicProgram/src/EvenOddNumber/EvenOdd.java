package EvenOddNumber;
/**
 * problem statement:
 * How to implement Even Odd number program.
 */
public class EvenOdd {
    public void display(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.display(20);
    }
}
/**
 * output:
 * Number is Even
 */
