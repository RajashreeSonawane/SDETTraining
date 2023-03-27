package AbstractClass;

abstract class testBank {
    public abstract void calculateEMI();

    int roi = 6;
}

class iciciBank extends testBank {
    int principle = 30000;
    int n = 12;

    public void calculateEMI() {
        System.out.println("...........ICICI Bank.............");
        System.out.println("Enter the principle amount is:" + principle);
        System.out.println("Enter the rate of interest is:" + roi);
        System.out.println("Enter the no of installment is:" + n);
        Double EMI = (principle * roi * Math.pow(1 + roi, n)) / (Math.pow(1 + roi, n) - 0.5);
        System.out.println("EMI is:" + EMI);
    }
}

class sbiBank extends testBank {
    int principle = 50000;
    int n = 15;

    public void calculateEMI() {
        System.out.println(" .........SBI bank..........");
        System.out.println("Enter the principle amount is:" + principle);
        System.out.println("Enter the rate of interest is:" + roi);
        System.out.println("Enter the no of installments is:" + n);
        double EMI = (principle * roi * Math.pow(1 + roi, n)) / (Math.pow(1 + roi, n) - 1);
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


