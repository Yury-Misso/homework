package home_work_1;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String aString;

        while (true) {
            System.out.println("Enter any Int");
            aString = scanner.nextLine();
            if (aString.equalsIgnoreCase("q")) {
                break;
            }
            try {
                sum += Integer.parseInt(aString);
            } catch (Exception e) {
                System.out.println("enter integer");
                continue;
            }
            count++;
            if (count == 3) {
                System.out.println((double) sum / 3);
                sum = 0;
                count = 0;
            }
        }


    }

}

