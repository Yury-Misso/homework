package home_work_1;

import java.util.Calendar;
import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someStringYear;
        int year;
        Calendar calendar = Calendar.getInstance();

        while (true) {
            System.out.println("Enter year");
            someStringYear = scanner.nextLine();

            if (someStringYear.equalsIgnoreCase("q")) {
                break;
            }

            if (isLeapYear(someStringYear)) {
                System.out.println(someStringYear + " - is leap year");
            } else {
                System.out.println(someStringYear + " - is not leap year");
            }

        }
    }

    public static boolean isLeapYear(String s) {
        String regex = "[0-9]{1,4}";

        if (s.matches(regex)) {
            Calendar calendar = Calendar.getInstance();
            int year;
            year = Integer.parseInt(s);
            calendar.set(Calendar.YEAR, year);
            if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
