import java.lang.Math;
import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int temp = num;
        double sum = 0;
        while(temp>0){
            sum = sum + Math.pow(temp%10,3);
            temp = temp/10 ;
        }
        return sum==num;}
}
public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("The given number is"+(new ArmstrongOrNot().armstrongCheck((sc.nextInt()))?"":" Not")+" an Armstrong number");
    }
}