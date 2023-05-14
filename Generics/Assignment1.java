import java.util.HashSet;
import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private double salary;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String displayDetails(){
        return "Employee id is - "+id+", name is - "+name+", salary is - "+salary+", department is - "+department;
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Employee> inst = new HashSet<>();
        while(true){
            System.out.println("Choose option - ");
            System.out.println("1 - Create employee");
            System.out.println("2 - View all employee details");
            System.out.println("3 - Exit ");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Enter employee id - ");
                int id = sc.nextInt();
                System.out.println("Enter employee name - ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter employee salary - ");
                double salary = sc.nextDouble();
                System.out.println("Enter department name of the employee -");
                sc.nextLine();
                String department = sc.nextLine();
                Employee emp = new Employee(id,name,salary,department);
                inst.add(emp);
            }
            else if(choice ==2){
                if(inst.size()==0)
                    System.out.println("No employee found");
                else {
                    System.out.println("Employees details are - ");
                    for(Employee emp : inst){
                        System.out.println(emp.displayDetails());
                    }
                }
            }
            else{
                System.out.println("Thank you for using the application");
                break;
            }
        }
    }
}