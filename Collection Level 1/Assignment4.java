import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Date> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Birth of date in DD/MM/YYYY ,  enter -1 to exit");
            String dateString = sc.nextLine();
            if(dateString .equals( "-1"))
            break;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            try {
                date = sdf.parse(dateString);
            } catch (ParseException e) {

            }
            arr.add(date);
            for (Date d : arr) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(d);
                int year = calendar.get(Calendar.YEAR);
                if (isLeapYear(year)) {
                    System.out.println("Your date of Birth is " + sdf.format(d) + " and it was a leap year");
                } else {
                    System.out.println("Your date of Birth is " + sdf.format(d) + " and it is not a leap year");
                }
            }
        }
    }
}

