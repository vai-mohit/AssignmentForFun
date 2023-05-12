import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    static int count =0;
    public String loginUser(String user, String pass) {
        if(user.equals(userId) && pass.equals(password)) {
            count =-1;
            return "Welcome " + user;
        }
        count++;
        if(count==3) {
            count =-1;
            return "You have entered wrong credentials 3 times\nContact Admin";
        }
        return "You have entered wrong credentials ,please enter the right credentials";
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Login inst1 = new Login();
        Scanner sc = new Scanner(System.in);
        while(inst1.count!=3 && inst1.count!=-1){
            System.out.println("Enter userId");
            String user = sc.nextLine();
            System.out.println("Enter password");
            String pass = sc.nextLine();
            System.out.println(inst1.loginUser(user,pass));
        }
    }
}


