import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+ incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int total = 0;
        for(int employeeSalaryEach : employeeSalaries){
            total = total + employeeSalaryEach;
        }
        return  total;
    }
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Labour l1 = new Labour();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(m1.getSalary(m1.salary));
        arr.add(l1.getSalary(l1.salary));
        System.out.println("Total of salary of all employees is "+ new Assignment2Q2().totalEmployeesSalary(arr));

    }
}