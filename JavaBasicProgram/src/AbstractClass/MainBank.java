package AbstractClass;
abstract class TestBankFDemo
{
    public abstract void calculateEMI();
    int ROI=6;
}
class BANKICICI1 extends TestBankFDemo
{
    int Principle=30000;
    int n=12;
    public void calculateEMI()
    {
        System.out.println("...........ICICI Bank.............");
        System.out.println("Enter the principle amount is:" +Principle);
        System.out.println("Enter the rate of interest is:"+ROI);
        System.out.println("Enter the no of installment is:"+n);
        Double EMI=(Principle*ROI*Math.pow(1+ROI, n))/(Math.pow(1+ROI, n)- 0.5);
        System.out.println("EMI is:"+EMI);
    }
}
class BANKSBI1 extends TestBankFDemo
{
    int principle=50000;
    int n=15;
    public void calculateEMI()
    {
        System.out.println(" .........SBI bank..........");
        System.out.println("Enter the principle amount is:"+principle);
        System.out.println("Enter the rate of interest is:"+ROI);
        System.out.println("Enter the no of installments is:"+n);
        double EMI=(principle*ROI*Math.pow(1+ROI, n))/(Math.pow(1+ROI, n)-  1);
        System.out.println("EMI is:" +EMI);
        System.out.println("......................................");
    }
}
public class MainBank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestBankFDemo b = new BANKSBI1();
        b.calculateEMI();
        b = new BANKICICI1();
        b.calculateEMI();
    }
}


