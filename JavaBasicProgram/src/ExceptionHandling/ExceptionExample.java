package ExceptionHandling;
import java.util.Scanner;
import java.util.*;
public class ExceptionExample {
    public static void main(String []args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter Your Age:- \n");
        int Age=0;
        try {
            Age=num.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("Enter Your Age Only In Numbers");
        }
        try
        {
            if(Age<18)
                throw new UnderAgeException("you are under age, can’t vote");
            else
                System.out.println("Congrats! You can vote.");
        }
        catch(UnderAgeException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank You! for using our service.");
        }
    }
}
class UnderAgeException extends Exception
 {
     UnderAgeException(String s){
         super(s);
     }
 }

