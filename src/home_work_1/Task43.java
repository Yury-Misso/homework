package home_work_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstInt = 0;
        int secondInt = 0;

        while (true) {
            System.out.println("Enter first Int");
            if (scanner.hasNextInt()) {
                firstInt = scanner.nextInt();
                break;
            }
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter second Int");
            if (scanner.hasNextInt()) {
                secondInt = scanner.nextInt();
                break;
            }
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                break;
            }
        }

        if (secondInt != 0) {
            if (isDivide(firstInt, secondInt)) {
                System.out.println(firstInt + " devide by " + secondInt);
            } else {
                System.out.println(firstInt + " not devide by " + secondInt);
            }
        }

    }

    public static boolean isDivide(int a, int b) {
        if (b != 0) {
            return a % b == 0;
        } else {
            return false;
        }
    }


}

