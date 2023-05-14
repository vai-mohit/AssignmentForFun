import java.util.Date;

class Pair{
    Object key;
    Object value;

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public void setKey(Object key)  {
        if(key instanceof String)
            this.key = key;
        else
            System.out.println("Key can only be string");
    }

    public void setValue(Object value)  {
        if(value instanceof String || value instanceof Date)
            this.value = value;
        else
            System.out.println("Key can only be string or Date");
    }
}
public class Assignment4 {
    public static void main(String[] args) {
        Pair p1 = new Pair();
        p1.setKey("1");
        p1.setValue("Hello");
        System.out.println("Key -> "+p1.getKey()+" & value -> "+p1.getValue());

        Pair p2 = new Pair();
        p2.setKey("Today is");
        p2.setValue(new Date());
        System.out.println("Key -> "+p2.getKey()+" & value -> "+p2.getValue());

        Pair p3 = new Pair();
        p3.setKey(123);
        p3.setValue(true);
        System.out.println("Key -> "+p3.getKey()+" & value -> "+p3.getValue());
    }
}
