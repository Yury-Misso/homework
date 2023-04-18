package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String booleanStringWeekday = "";
        String booleanStringVacation = "";
        boolean weekday = false;
        boolean vacation = false;
        String regex = "[0-1]";

        System.out.println("1 - true : 0 - false");

        while (true) {
            System.out.println("weekday?");
            booleanStringWeekday = scanner.nextLine();

            if (booleanStringWeekday.equalsIgnoreCase("q")) {
                break;
            }

            if (booleanStringWeekday.matches(regex)) {
                if (booleanStringWeekday.equalsIgnoreCase("0")) {
                    weekday = false;
                } else if (booleanStringWeekday.equalsIgnoreCase("1")) {
                    weekday = true;
                }
            }

            System.out.println("vacation?");
            booleanStringVacation = scanner.nextLine();
            if (booleanStringVacation.matches(regex)) {
                if (booleanStringVacation.equalsIgnoreCase("0")) {
                    vacation = false;
                } else if (booleanStringVacation.equalsIgnoreCase("1")) {
                    vacation = true;
                }
            }

            if (sleepIn(weekday, vacation)) {
                System.out.println("sleep");
            } else {
                System.out.println("go work");
            }
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
