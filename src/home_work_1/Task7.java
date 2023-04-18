package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        String[] numbersStringArray;
        int[] numbers = new int[10];
        String regex = "[0-9]";

        String stringNumbers = "";

        while (true) {
            System.out.println("Enter 10 numbers 0-9 format: 0 1 2 3 4 5 6 7 8 9");
            stringNumbers = scanner.nextLine();

            if (stringNumbers.equalsIgnoreCase("q")) {
                break;
            }

            numbersStringArray = stringNumbers.split(" ");

            System.out.println(Arrays.toString(numbersStringArray));

            if (numbersStringArray.length == 10) {
                for (String number : numbersStringArray) {
                    if ((number.length() == 1) && (number.matches(regex))) {
                        isNumber = true;
                    } else {
                        isNumber = false;
                        break;
                    }

                }
            }
            System.out.println(isNumber);

            if (isNumber) {
                for (int i = 0; i < 10; i++) {
                    numbers[i] = Integer.parseInt(numbersStringArray[i]);
                }
                System.out.println(createPhoneNumber(numbers));
            }

        }
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("(");

        for (int i = 0; i < 3; i++) {
            stringBuilder.append(numbers[i]);
        }

        stringBuilder.append(") ");

        for (int i = 3; i < 6; i++) {
            stringBuilder.append(numbers[i]);
        }

        stringBuilder.append("-");

        for (int i = 6; i < 10; i++) {
            stringBuilder.append(numbers[i]);
        }

        return stringBuilder.toString();
    }
}
