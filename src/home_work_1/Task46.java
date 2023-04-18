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

            try {
                year = Integer.parseInt(someStringYear);
            } catch (Exception e) {
                continue;
            }

            if ((year > 0) && (year < 10000)) {
                calendar.set(Calendar.YEAR, year);
                if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
                    System.out.println(year + " - is leap year");
                } else {
                    System.out.println(year + " - is not leap year");
                }
            }
        }
    }
}
