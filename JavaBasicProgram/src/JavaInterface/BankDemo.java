package JavaInterface;

public interface BankDemo {
    int ROI = 6;

    void calculateEMI();
}

class ICICI1 implements BankDemo {
    int principle = 50000;
    int n = 15;

    public void calculateEMI() {
        System.out.println("...........ICICI Bank.............");
        System.out.println(" principle amount is:" + principle);
        System.out.println("no of installment is:" + n);
        System.out.println("rate of interest is:" + ROI);
        Double EMI = (principle * ROI * Math.pow(1 + ROI, n)) / (Math.pow(1 + ROI, n) - 0.5);
        System.out.println("EMI is:" + EMI);
    }
}

class SBI1 implements BankDemo {
    int principle = 30000;
    int n = 10;

    public void calculateEMI() {
        System.out.println(" .........SBI bank..........");
        System.out.println("principle amount is:" + principle);
        System.out.println("no of installments is:" + n);
        System.out.println("rate of interest is:" + ROI);
        double EMI = (principle * ROI * Math.pow(1 + ROI, n)) / (Math.pow(1 + ROI, n) - 1);
        System.out.println("EMI is:" + EMI);
        System.out.println("......................................");
    }
}



