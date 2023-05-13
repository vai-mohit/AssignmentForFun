class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "A Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "A Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "A Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
        Rectangle5 r1 = new Rectangle5();
        Line5 l1 = new Line5();
        Cube5 c1 = new Cube5();
        System.out.println("Drawing - ");
        System.out.println(r1.draw());
        System.out.println(l1.draw());
        System.out.println(c1.draw());
    }
}

