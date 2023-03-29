package AbstractClass;

/**
 * Problem statement:Write a code to calculate EMI for 2 different banks namely SBI and ICICI
 * Have 2 different classes for each bank and enforce both classes to use same method name ‘calculateEMI’
 * Create interface Banking with method ‘calculateEMI’ and variable rate of interest =6
 * Formula to calculate EMI:
 * For SBI = P*R*(1+R)N / (RN-1)
 * For ICICI = P*R*(2+R)N / (RN-0.5)
 * P= principal amount/loan amount
 * R= rate of interest
 * N= number of instalments"""
 */
abstract class testBank {
    public abstract void calculateEMI();

    int roi = 6;
}

class iciciBank extends testBank {
    int principle = 30000;
    int no_of_installment = 12;

    public void calculateEMI() {
        System.out.println("...........ICICI Bank.............");
        System.out.println("Enter the principle amount is:" + principle);
        System.out.println("Enter the rate of interest is:" + roi);
        System.out.println("Enter the no of installment is:" + no_of_installment);
        Double EMI = (principle * roi * Math.pow(1 + roi, no_of_installment)) / (Math.pow(1 + roi, no_of_installment) - 0.5);
        System.out.println("EMI is:" + EMI);
    }
}

class sbiBank extends testBank {
    int principle = 50000;
    int no_of_installment = 15;

    public void calculateEMI() {
        System.out.println(" .........SBI bank..........");
        System.out.println("Enter the principle amount is:" + principle);
        System.out.println("Enter the rate of interest is:" + roi);
        System.out.println("Enter the no of installments is:" + no_of_installment);
        double EMI = (principle * roi * Math.pow(1 + roi, no_of_installment)) / (Math.pow(1 + roi, no_of_installment) - 1);
        System.out.println("EMI is:" + EMI);
        System.out.println("......................................");
    }
}

public class mainBank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testBank bank = new sbiBank();
        bank.calculateEMI();
        bank = new iciciBank();
        bank.calculateEMI();
    }
}
/**
 * output:
 * .........SBI bank..........
 * Enter the principle amount is:50000
 * Enter the rate of interest is:6
 * Enter the no of installments is:15
 * EMI is:300000.00000006316
 * ......................................
 * ...........ICICI Bank.............
 * Enter the principle amount is:30000
 * Enter the rate of interest is:6
 * Enter the no of installment is:12
 * EMI is:180000.0000065023
 */


