import java.util.*;

class ComparatorId implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getId()>o2.getId())
            return 1;
        else if(o2.getId()> o1.getId())
            return -1;
        return 0;
    }
}
class ComparatorName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int temp = o1.getName().compareTo(o2.getName());
        if(temp ==0)
            return new ComparatorId().compare(o1,o2);
        else
            return temp;
    }
}

class ComparatorDepartment implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int temp = o1.getDepartment().compareTo(o2.getDepartment());
        if(temp ==0)
            return new ComparatorId().compare(o1,o2);
        else
            return temp;
    }
}

class ComparatorSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary()>o2.getSalary())
            return 1;
        else if(o2.getSalary()> o1.getSalary())
            return -1;

        return new ComparatorId().compare(o1,o2);

    }
}


class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Assignment3 {


    public static void main(String[] args) {
        Employee p1 = new Employee(1, "Mohit", "IT", 5000);
        Employee p2 = new Employee(4, "Rajat", "IT", 5000);
        Employee p3 = new Employee(2, "Yash", "IT", 5000);
        Employee p4 = new Employee(3, "Deepanshu", "Marketing", 4500);
        Employee p5 = new Employee(5, "Praveen", "Operations", 7000);
        Employee p6 = new Employee(6, "Naveen", "IT", 5200);
        Employee p7 = new Employee(7, "Pranjal", "Finance", 5900);
        Employee p8 = new Employee(8, "Nischay", "HR", 4800);
        Employee p9 = new Employee(9, "Naveen", "Operations", 6800);
        Employee p10 = new Employee(10, "Pulkit", "Marketing", 4300);
        System.out.println("Choose option -> ");
        System.out.println("1 - ID");
        System.out.println("2 - Name");
        System.out.println("3 - Department");
        System.out.println("4 - Salary");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Comparator<Employee> comparator ;
        if(choice == 1 )
             comparator = new ComparatorId();
        else if(choice == 2 )
            comparator = new ComparatorName();
        else if(choice == 3 )
            comparator = new ComparatorDepartment();
        else
            comparator = new ComparatorSalary();

        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        treeSet.add(p6);
        treeSet.add(p7);
        treeSet.add(p8);
        treeSet.add(p9);
        treeSet.add(p10);


        for(Employee p:treeSet){
            System.out.println(p);
        }

    }
}
