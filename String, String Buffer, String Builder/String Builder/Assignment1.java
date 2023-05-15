public class Assignment1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str1 = "StringBuffer";
        String str2 = "is a peer class of String";
        String str3 = "that provides much of ";
        String str4 = "the functionality of strings";
        sb.append(str1).append(str2).append(str3).append(str4);
        System.out.println("The final string is -> "+sb.toString());
    }
}