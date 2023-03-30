package ExceptionHandling;

/**
 * problem statement:
 * write program from try with multiple catch block in java.
 */
class ArithmaticTest {
    int array[] = {10, 20, 30, 40};

    public void multipleCatchBlock(int firstNumber, int secondNumber) {
        try {
            int division = firstNumber / secondNumber;
            //java.lang.ArithmeticException here if secondNumber = 0.
            System.out.println(division);
            System.out.println("4th element of given array = " + array[3]);
            //ArrayIndexOutOfBoundsException here.
            System.out.println("5th element of given array = " + array[4]);
            //catch ArrayIndexOutOfBoundsException here.
        } catch (ArrayIndexOutOfBoundsException e) {
            //print exception.
            System.out.println(e);
        } catch (ArithmeticException e) {//catch ArithmeticException here.
            //print exception.
            System.out.println(e);
        } catch (Exception e) {//catch exception here.
            //print exception.
            System.out.println(e);
        }
        System.out.println("Remaining code after exception handling.");
    }
}

public class MultipleCatchExample {
    public static void main(String args[]) {
        ArithmaticTest arithmetic = new ArithmaticTest();
        arithmetic.multipleCatchBlock(50, 10);
    }
}
/**
 * output:
 * 5
 * 4th element of given array = 40
 * java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 * Remaining code after exception handling.
 */