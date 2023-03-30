package JavaInterface;

public interface Bank {
    int roi = 6;

    void calculateEMI();
}

class ICICI implements Bank {
    int principle = 50000;
    int no_of_installment = 15;

    public void calculateEMI() {
        System.out.println("...........ICICI Bank.............");
        System.out.println(" principle amount is:" + principle);
        System.out.println("no of installment is:" + no_of_installment);
        System.out.println("rate of interest is:" + roi);
        Double EMI = (principle * roi * Math.pow(1 + roi, no_of_installment)) / (Math.pow(1 + roi, no_of_installment) - 0.5);
        System.out.println("EMI is:" + EMI);
    }
}

class SBI implements Bank {
    int principle = 30000;
    int no_of_installment = 10;

    public void calculateEMI() {
        System.out.println(" .........SBI bank..........");
        System.out.println("principle amount is:" + principle);
        System.out.println("no of installments is:" + no_of_installment);
        System.out.println("rate of interest is:" + roi);
        double EMI = (principle * roi * Math.pow(1 + roi, no_of_installment)) / (Math.pow(1 + roi, no_of_installment) - 1);
        System.out.println("EMI is:" + EMI);
        System.out.println("......................................");
    }
}



