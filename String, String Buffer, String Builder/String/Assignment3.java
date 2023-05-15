public class Assignment3 {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("Operation a -> "+str.toLowerCase());
        System.out.println("Operation b -> "+str.toUpperCase());
        System.out.println("Operation c -> "+str.replace("a","$"));
        System.out.println("Operation d -> "+(str.contains("collection")?"\"collection\""+" is present in the string":"'\"collection\""+"is not present in the string"));
        System.out.println("Operation e -> "+(str.equals("java string pool refers to collection of strings which are stored in heap memory")?"String matches":"String not matches"));
        System.out.println("Operation f -> "+(str.compareTo("java string pool refers to collection of strings which are stored in heap memory")==0?"String matches":"String not matches"));

}
}