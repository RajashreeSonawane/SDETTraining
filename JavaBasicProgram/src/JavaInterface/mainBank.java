package JavaInterface;

public class mainBank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SBI sbi = new SBI();
        sbi.calculateEMI();
        ICICI icici = new ICICI();
        icici.calculateEMI();
    }
}
