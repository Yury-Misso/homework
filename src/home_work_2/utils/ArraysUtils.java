package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        int size;

        while (true) {
            size = getNumber("Введите размер массива");
            if (size > 0) {
                break;
            } else {
                continue;
            }
        }

        int[] newIntArray = new int[size];

        for (int i = 0; i < size; i++) {
            newIntArray[i] = getNumber("Введите элемент массива");
        }

        return newIntArray;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] someIntArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            someIntArray[i] = random.nextInt(maxValueExclusion);
        }

        return someIntArray;
    }


    /**
     * This method returns a number of Long type entered into the console
     *
     * @param inquiryText - the message that will be displayed in the console
     * @return - a number of Long type
     */
    private static int getNumber(String inquiryText) {
        Scanner scanner = new Scanner(System.in);
        int someInt;


        System.out.println(inquiryText);
        while (true) {
            if (scanner.hasNextInt()) {
                someInt = scanner.nextInt();
                break;

            } else {
                System.out.println(inquiryText);
                scanner.nextLine();
                continue;
            }
        }

        return someInt;
    }
}
