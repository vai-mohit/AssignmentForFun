import java.util.Scanner;

class Student {
    private int subjectA,subjectB,subjectC;

    public Student(int subjectA, int subjectB, int subjectC) {
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public Student() {

    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int temp =0;
        for(Student stud : students){
          temp = temp + stud.subjectA+stud.subjectB+stud.subjectC;
        }
        return temp;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int temp =0;
        for(Student stud : students){
            temp = temp + stud.subjectA+stud.subjectB+stud.subjectC;
        }
        return temp/3;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName){
        int arr[] = new int[3];
        int temp=0;
        if(subjectName=="subjectA") {
            for (Student stud : students) {
                arr[temp] = stud.subjectA;
                temp++;
            }
        }
        else if(subjectName=="subjectB") {
            for (Student stud : students) {
                arr[temp] = stud.subjectB;
                temp++;
            }
        }
        else if(subjectName=="subjectC") {
            for (Student stud : students) {
                arr[temp] = stud.subjectC;
                temp++;
            }
        }
        return arr;
    }
    public int subjectATotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }
    public int subjectBTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }
    public int subjectCTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }

    public int subjectTotalByStudents(int[] marks){
        int temp=0;
        for(int a:marks){
            temp = temp+a;
        }
        return temp;
    }

    public double subjectAAverageByStudents(int[] marks) {
        return subjectTotalByStudents(marks)/3;
    }
    public double subjectBAverageByStudents(int[] marks) {
        return subjectTotalByStudents(marks)/3;
    }
    public double subjectCAverageByStudents(int[] marks) {
        return subjectTotalByStudents(marks)/3;
    }

}

public class Assignment1Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sol = new Student();
        System.out.println("marks of Student 1 in subjects A,B,C");
        Student student1 = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("marks of Student 2 in subjects A,B,C");
        Student student2 = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("marks of Student 3 in subjects A,B,C");
        Student student3 = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Student[] stud = new Student[3];
        stud[0] = student1;
        stud[1] = student2;
        stud[2] = student3;
        System.out.println("Total marks of all the students in all subjects "+sol.studentsTotalMarksInAllSubjects(stud));
        System.out.println("Average marks of all the students in all subjects "+sol.studentsAverageMarksInAllSubjects(stud));
        System.out.println("Total marks scored by students in subject A = "+sol.subjectATotalByStudents(sol.subjectWiseMarks(stud,"subjectA")));
        System.out.println("Average marks scored by students in subject A = "+sol.subjectAAverageByStudents(sol.subjectWiseMarks(stud,"subjectA")));
        System.out.println("Total marks scored by students in subject B = "+sol.subjectBTotalByStudents(sol.subjectWiseMarks(stud,"subjectB")));
        System.out.println("Average marks scored by students in subject B = "+sol.subjectBAverageByStudents(sol.subjectWiseMarks(stud,"subjectB")));
        System.out.println("Total marks scored by students in subject C = "+sol.subjectCTotalByStudents(sol.subjectWiseMarks(stud,"subjectC")));
        System.out.println("Average marks scored by students in subject C = "+sol.subjectCAverageByStudents(sol.subjectWiseMarks(stud,"subjectC")));

    }
}