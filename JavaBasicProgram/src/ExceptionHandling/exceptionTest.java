package ExceptionHandling;

/**
 * problem statement
 * Write a E-voting program to find whether user is eligible for voting or not.
 * using try catch block and finally keyword.
 */
public class exceptionTest {
    public void canVote(int age) {
        if (age < 18)
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("you are not an adult!");
            } finally {
                System.out.println("Thank You! for using our service.");
            }
        else
            System.out.println("you can vote!");
    }

    public static void main(String[] args) {
        exceptionTest exception = new exceptionTest();
        exception.canVote(20);
        exception.canVote(10);
    }
}
/**
 * output:
 * you can vote!
 * you are not an adult!
 * Thank You! for using our service.
 */