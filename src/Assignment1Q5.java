import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc>=0 && ctc<=180000)
            return 0;
        if(ctc>=180001 && ctc<=300000)
            return ctc * 0.1;
        if(ctc<=300001 && ctc<=500000)
            return ctc *0.2;
        return ctc * 0.3;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your CTC");
        System.out.println("Tax payable is "+new TaxAmount().calculateTaxAmount(sc.nextInt()));
    }
}