package home_work_1;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        int a;
        String aString;

        while (!exit.equalsIgnoreCase("q")) {
            System.out.println("Enter any Int");
            aString = scanner.nextLine();
            try {
                a = Integer.parseInt(aString);
            } catch (Exception e) {
                System.out.println("enter integer");
                continue;
            }

            if (a % 2 == 0)
                System.out.println(a + " is even number");
            else
                System.out.println(a + " is odd number");

            exit = scanner.nextLine();
        }

    }
}
