import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        return  principalAmount * time * interestRate /100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        return (principalAmount * Math.pow(1 + (interestRate/100),time))-principalAmount;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Principal amount");
        double principalAmount = sc.nextDouble();
        System.out.println("Please enter Interest Rate");
        double interestRate = sc.nextDouble();
        System.out.println("Please enter Time");
        int time = sc.nextInt();
        System.out.println("Simple Interest for the given values is "+ new SiCi().simpleInterest(principalAmount,time,interestRate));
        System.out.println("Compound Interest for the given values is "+ new SiCi().compoundInterest(principalAmount,time,interestRate));
    }
}