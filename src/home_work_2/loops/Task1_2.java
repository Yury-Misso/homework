package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString;
        String regexDouble = "[0-9]*\\.?[0-9]*";
        String regexInt = "[0-9]*";

        while (true) {
            System.out.println("Введите целое число");

            someString = scanner.nextLine();

            if (someString.matches(regexInt)) {
                multiplyAllNumber(someString);
            } else if (someString.matches(regexDouble)) {
                System.out.println("Введено не целое число");
            } else {
                System.out.println("Введено не число");
                continue;
            }
        }
    }

    /**
     * This method returns multiply of all digits in the number
     *
     * @param s - some Stiring of numbers
     */
    public static void multiplyAllNumber(String s) {
        long result = 1;
        int number;

        for (int i = 0; i < s.length(); i++) {
            number = Integer.parseInt(String.valueOf(s.charAt(i)));
            result *= number;
            if (result >= 0) {
                if (i == (s.length() - 1)) {
                    System.out.print(number + " = " + new DecimalFormat("###,###").format(result));
                } else {
                    System.out.print(number + " * ");
                }
            } else {
                System.out.println();
                System.out.print("Вы ввели слишком длинное число");
                break;
            }
        }
        System.out.println();
    }
}
