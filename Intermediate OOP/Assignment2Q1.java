class SingletonInheritanceCheck{
    public static SingletonInheritanceCheck initialization = null;

    public int value = 10;
    private SingletonInheritanceCheck(){

    }
    public static SingletonInheritanceCheck createInstance(){
        if(initialization == null)
            initialization = new SingletonInheritanceCheck();
        return  initialization;
    }
}

//class TryToExtendSingletonClass extends SingletonInheritanceCheck{
//    // This will give error as no default constructor in Singleton class, So we cannot inherit from a Singleton class
//}

public class  Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck object1 = SingletonInheritanceCheck.createInstance();
        SingletonInheritanceCheck object2 = SingletonInheritanceCheck.createInstance();
        object1.value = 12;
        System.out.println(object1.value);
        System.out.println(object2.value);


    }
}