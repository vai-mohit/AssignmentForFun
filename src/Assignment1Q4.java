import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
       if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60){
           return "Passed";
       }
       if((subject1Marks>60 && subject2Marks>60) ||(subject2Marks>60 && subject3Marks>60)||(subject1Marks>60 && subject3Marks>60) ){
           return "Promoted";
        }
       return "failed";
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:- ");
        String inp = sc.nextLine();
        String []inpArr = inp.split(" ");
        System.out.println(new ResultDeclaration().declareResults(Double.parseDouble(inpArr[0]),Double.parseDouble(inpArr[1]),Double.parseDouble(inpArr[2])));
    }
}