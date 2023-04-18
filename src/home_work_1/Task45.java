package home_work_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter string");
            String someString = scanner.nextLine();

            if (someString.equalsIgnoreCase("q")) {
                break;
            }

            char[] charArray = someString.toCharArray();

            String regex = "[A-Za-z]";


            for (char tempChar : charArray) {
                if (Character.toString(tempChar).matches(regex)) {
                    System.out.println("Is a letter");
                } else {
                    System.out.println("Is another symbol");
                }

            }
        }
    }
}
