//// Test 1
//class AbstractTest{
//   public abstract int abstractTest1();
//   // This will throw an error Abstract method in non-abstract class
//}

abstract class AbstractTest{
    public abstract int abstractTest1();
    public int print(){
        return 10;
    }
}

//Test 3
//class AbstractTest3 extends AbstractTest{
//    // This will throw the error Class 'AbstractTest3P1' must either be declared abstract or implement abstract method 'abstractTest1()' in 'AbstractTest'
//}

class AbstractTest3P1 extends AbstractTest{
    @Override
    public int abstractTest1() {
        return 0;
    }
}
//Or
abstract class AbstractTest3P2 extends AbstractTest{

}

////Test 4
//private abstract class AbstractTest4 {
//    //This will throw the error Modifier 'private' not allowed here(in abstract class)
//}

////Test 5
//final abstract class AbstractTest5 {
//    //This will throw the error Illegal combination of modifiers: 'final' and 'abstract'
//}

//Test 6
abstract class AbstractTest6{
    public int print(){
        return 10;
    }
}
public class Assignment2Q4 {
//    //Test 2
//    AbstractTest a1  = new AbstractTest() ;
//    //This will throw the error 'AbstractTest' is abstract; cannot be instantiated
}
