abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File persistence called";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Database persistence called";
    }
}

class Client {

    public String persist(Persistence obj) {
        return obj.persist();
    }

}

public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence f1 = new FilePersistence();
        Persistence d1 = new DatabasePersistence();
        System.out.println(new Client().persist(f1));
        System.out.println(new Client().persist(d1));
    }
}