import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
class NewComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return getName().equals(other.getName());
    }
}
public class Assignment2 {
    static TreeSet<Product> treeSet = new TreeSet<>(new NewComparator());
    static ArrayList<Product> arr = new ArrayList<>();
    public static void addToSet(Product p){

        treeSet.add(p);
    }
    public static void addToList(Product p){
        if(arr.contains(p))
            return;
        arr.add(p);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Phone",10000);
        Product p2 = new Product("Laptop", 100000);
        Product p3 = new Product("Smart Phone",10000);
        Product p4 = new Product("Smart Watch",2000);
        Product p5 = new Product("Apple Phone",30000);
        Product p6 = new Product("IPad",50000);
        Product p7 = new Product("OnePlus Tablet",50000);
        Product p8 = new Product("Apple Watch",20000);
        Product p9 = new Product("Macbook",100000);
        Product p10 = new Product("Notebook",10000);
        Product duplicate = new Product("Notebook",10000);
        addToSet(p1);
        addToSet(p2);
        addToSet(p3);
        addToSet(p4);
        addToSet(p5);
        addToSet(p6);
        addToSet(p7);
        addToSet(p8);
        addToSet(p9);
        addToSet(p10);
        //duplicates not added
        addToSet(p10);
        addToSet(duplicate);
        for(Product p:treeSet){
            System.out.println(p);
        }
        //Using ArrayList
        System.out.println("In List");
        addToList(p1);
        addToList(p2);
        addToList(p3);
        addToList(p4);
        addToList(p5);
        addToList(p6);
        addToList(p7);
        addToList(p8);
        addToList(p9);
        addToList(p10);
        //duplicates not added
        addToList(p10);
        addToList(duplicate);
        for(Product p:arr){
            System.out.println(p);
        }
    }
}
