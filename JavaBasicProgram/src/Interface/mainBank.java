package Interface;

/**
 * problem statement:
 * "Use interface to implement below problem
 * Write a code to calculate EMI for 2 different banks namely SBI and ICICI
 * Have 2 different classes for each bank and enforce both classes to use same method name ‘calculateEMI’
 * Create interface Banking with method ‘calculateEMI’ and variable rate of interest =6
 * Formula to calculate EMI:
 * For SBI = P*R*(1+R)N / (RN-1)
 * For ICICI = P*R*(2+R)N / (RN-0.5)
 * P= principal amount/loan amount
 * R= rate of interest
 * N= number of instalments"
 */
public class mainBank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SBI sbi = new SBI();
        sbi.calculateEMI();
        ICICI icici = new ICICI();
        icici.calculateEMI();
    }
}
/**
 * output:
 * .........SBI bank..........
 * principle amount is:30000
 * no of installments is:10
 * rate of interest is:6
 * EMI is:180000.00063722397
 * ......................................
 * ...........ICICI Bank.............
 * principle amount is:50000
 * no of installment is:15
 * rate of interest is:6
 * EMI is:300000.0000000316
 */