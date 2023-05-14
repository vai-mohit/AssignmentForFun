import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String s){
        super(s);
    }
}
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String s){
        super(s);
    }
}
class SavingAccount{
    private double balance;
    private long id;

    public SavingAccount(double balance, long id) {
        this.balance = balance;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if(amount<0)
            throw new IllegalBankTransactionException("Amount can't be negative");
        else if(balance==0 || amount>balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        else{
            balance = balance - amount;
            return balance;
        }

    }
    public double deposit(double amount){
        balance = balance+amount;
        return balance;

    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Id");
        long id = sc.nextLong();
        System.out.println("Please enter Balance");
        double balance = sc.nextDouble();
        SavingAccount s1 = new SavingAccount(balance,id);
        while(true) {
            System.out.println("Choose the option - ");
            System.out.println("1 - Deposit Money");
            System.out.println("2 - Withdraw Money");
            System.out.println("3 - Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the money");
                balance = s1.deposit(sc.nextDouble());
                System.out.println("Added Money Successfully, Balance left -> "+ balance);
            } else if(choice == 2) {
                try {
                    System.out.println("Enter the amount");
                    balance = s1.withdraw(sc.nextDouble());
                    System.out.println("Money Withdraw Successfully, Balance left -> "+ balance);
                } catch (IllegalBankTransactionException | InsufficientBalanceException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else{
                System.out.println("Have a nice day");
                break;
            }
        }
    }

}
