public class Assignment2
{
    public static void main(String[] args) {
        String str1 = "insert text";
        String str2 = "It is used to _ at the specified index position";
        StringBuffer sb = new StringBuffer();
        sb.append(str2);
        sb.replace(str2.indexOf("_"),str2.indexOf("_")+1,str1);
        str2 = sb.toString();
        System.out.println("The new string is -> "+str2);
    }
}
