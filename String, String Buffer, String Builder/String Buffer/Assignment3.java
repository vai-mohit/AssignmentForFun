public class Assignment3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = "This method returns the reversed object on which it was called";
        sb.append(str);
        sb.reverse();
        str = sb.toString();
        System.out.println("The result string is -> "+str);
    }
}
