import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class DescendingContact implements Comparator<Long>{

    @Override
    public int compare(Long o1, Long o2) {
        return o2.compareTo(o1);
    }
}
class Contact   {
    private long phoneNumber;
    private String name;
    private String email;
    public enum Gender{
        MALE,
        FEMALE,
        OTHER
    }
    private Gender gender;

    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return

                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender
                ;
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        TreeMap<Long,Contact> map = new TreeMap<>(new DescendingContact());
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose option ->");
            System.out.println("1 - Enter Phone Number and Contact Details");
            System.out.println("2 - Fetch all the keys ");
            System.out.println("3 - Fetch all the values ");
            System.out.println("4 - Print all key-value pairs");
            System.out.println("5 - Exit");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter phone number");
                long phoneNumber = sc.nextLong();
                System.out.println("Enter Name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter Email");
                String email = sc.nextLine();
                System.out.println("Enter Gender");
                Contact.Gender gender = Contact.Gender.valueOf((sc.nextLine()).toUpperCase());
                Contact contact = new Contact(phoneNumber,name,email,gender);
                map.put(phoneNumber,contact);

            }
            else if(map.size()==0 && choice != 5){
                System.out.println("Map is empty, Please add some fields");
            }
            //Solution to a -> Fetch all the keys and print them
            else if(choice ==2){
                System.out.println("Keys -> ");
                for(Map.Entry<Long,Contact> entry : map.entrySet()){
                    System.out.println(entry.getKey());
                }
            }
            //Solution to b -> Fetch all the values and print them
            else if(choice ==3){
                System.out.println("Values -> ");
                for(Map.Entry<Long,Contact> entry : map.entrySet()){
                    System.out.println(entry.getValue());
                }
            }
            //Solution to c -> Print all key-value pairs
            else if(choice ==4){
                System.out.println("Keys & Values -> ");
                for(Map.Entry<Long,Contact> entry : map.entrySet()){
                    System.out.println("Key -> "+ entry.getKey()+" Values -> "+entry.getValue());
                }
            }
            else{
                System.out.println("Thank you for using the application");
                break;
            }

        }
    }
}