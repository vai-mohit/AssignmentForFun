import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class Assignment2 {
    public static void main(String[] args) {
        Random number = new Random();
        HashMap<Integer,Double> map = new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(number.nextInt(),number.nextDouble());
        }
        for (Entry<Integer,Double> entry : map.entrySet()){
            System.out.println("Key -> "+entry.getKey()+" & value -> "+entry.getValue());
        }
    }

}
