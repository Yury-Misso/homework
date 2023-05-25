package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[3];
        int count = 0;

        while (true) {
            System.out.println("Enter any Int");

            if (scanner.hasNextInt() && count < 3) {
                intArr[count] = scanner.nextInt();
                count++;
                if (count == 3) {
                    System.out.println("Average: " + getAverageValue(intArr[0], intArr[1], intArr[2]));
                    count = 0;
                }
            }

            if (scanner.nextLine().equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    public static double getAverageValue(int a, int b, int c) {
        return ((double) (a + b + c)) / 3;
    }

}

