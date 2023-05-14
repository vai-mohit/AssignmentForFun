import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Please Enter the numerator");
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        System.out.println("Please Enter the denominator");
        int denominator = sc.nextInt();
        try{
            System.out.println("The result of division is - "+ numerator/denominator);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator can't be 0");
            System.out.println("Message -> " + e.getMessage());
        }
    }
}