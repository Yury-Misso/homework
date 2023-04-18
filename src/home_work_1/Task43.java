package home_work_1;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String someIntString;
            int firstInt = 0;
            int secondInt = 0;


            System.out.println("Enter first Int");
            someIntString = scanner.nextLine();
            if (someIntString.equalsIgnoreCase("q")) {
                break;
            }
            while (true) {
                try {
                    firstInt = Integer.parseInt(someIntString);
                    break;
                } catch (Exception e) {
                    System.out.println("INTEGER");
                    someIntString = scanner.nextLine();
                    continue;
                }
            }

            if (someIntString.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Enter second Int");
            someIntString = scanner.nextLine();
            if (someIntString.equalsIgnoreCase("q")) {
                break;
            }
            while (true) {
                try {
                    secondInt = Integer.parseInt(someIntString);
                    break;
                } catch (Exception e) {
                    System.out.println("INTEGER");
                    someIntString = scanner.nextLine();
                    continue;
                }
            }

            if (someIntString.equalsIgnoreCase("q")) {
                break;
            }

            if ((firstInt % secondInt) == 0) {
                System.out.println("The first number is divided by the second number");
            } else {
                System.out.println("The first number is not divided by the second number");
            }

        }

    }

    public static boolean isInt(String intString) {
        boolean isInt = false;
        try {
            Integer.parseInt(intString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

