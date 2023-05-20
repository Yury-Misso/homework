package home_work_2.loops;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        long a = 1L;
        long otherLong;
        long result;

        BigInteger bigInteger;


        while (true) {
            result = a;

            System.out.println("long a = 1");

            System.out.println("Введите число на которое будем умножать");
            while (true) {
                if (scaner.hasNextLong()) {
                    otherLong = scaner.nextLong();
                    scaner.nextLine();
                    break;

                } else {
                    System.out.println("Введите число на которое будем умножать");
                    scaner.nextLine();
                    continue;
                }
            }

            while (true) {
                try {
                    result = Math.multiplyExact(result, otherLong);
                } catch (Exception e) {
                    System.out.println("Число до переполнения:");
                    System.out.println(new DecimalFormat("#,###").format(result));
                    break;
                }
            }

            bigInteger = BigInteger.valueOf(result).multiply(BigInteger.valueOf(otherLong));

            System.out.println("Число после переполнения:");
            System.out.println(getNumberInFormat(bigInteger));

            System.out.println();

        }

    }

    public static String getNumberInFormat(BigInteger bigInteger) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = bigInteger.toString();
        int count = 0;
        char[] digitOfNumber = s.toCharArray();

        for (int i = digitOfNumber.length - 1; i >= 0; i--) {
            if (count < 3) {
                stringBuilder.append(digitOfNumber[i]);
                count++;
            } else {
                stringBuilder.append(" ");
                stringBuilder.append(digitOfNumber[i]);
                count = 1;
            }
        }
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
