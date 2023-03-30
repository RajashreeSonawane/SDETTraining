package OverridingExample;

/**
 * problem statement:
 * write program for method overriding in java
 * perform calculating EMI for bank
 */
public class iciciBank {
    int principle = 50000;
    int roi = 6;
    int no_of_installment = 15;

    public void calculateEMI() {
        System.out.println("...........ICICI Bank.............");
        System.out.println("Enter the principle amount is:" + principle);
        System.out.println("Enter the rate of interest is:" + roi);
        System.out.println("Enter the no of installment is:" + no_of_installment);
        Double EMI = (principle * roi * Math.pow(1 + roi, no_of_installment)) / (Math.pow(1 + roi, no_of_installment) - 0.5);
        System.out.println("EMI is:" + EMI);
    }
}

class Bank extends iciciBank {
    public void calculateEMI() {
        super.calculateEMI();
        System.out.println("...........Bank............");
    }
}

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.calculateEMI();
    }
}

/**
 * output:
 * ...........ICICI Bank.............
 * Enter the principle amount is:50000
 * Enter the rate of interest is:6
 * Enter the no of installment is:15
 * EMI is:300000.0000000316
 * ...........Bank............
 */