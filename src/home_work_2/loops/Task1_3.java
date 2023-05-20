package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double doubNumber;
        int powerOfNumber;
        double result;


        while (true) {
            System.out.println("Введите число");

            while (true) {
                if (scaner.hasNextDouble()) {
                    doubNumber = scaner.nextDouble();
                    scaner.nextLine();
                    break;
                } else {
                    System.out.println("Введите число");
                    scaner.nextLine();
                    continue;
                }
            }

            System.out.println("Введите степень");
            while (true) {
                if (scaner.hasNextInt()) {
                    powerOfNumber = scaner.nextInt();
                    if (powerOfNumber >= 0) {
                        scaner.nextLine();
                        break;
                    } else {
                        System.out.println("Введите степень");
                        scaner.nextLine();
                        continue;
                    }

                } else {
                    System.out.println("Введите степень");
                    scaner.nextLine();
                    continue;
                }
            }

            result = doubNumber;
            if (powerOfNumber == 0) {
                System.out.println(doubNumber + " ^ " + powerOfNumber + " = 1.00");
            } else {
                for (int i = 1; i < powerOfNumber; i++) {
                    result *= doubNumber;
                }
                System.out.print(doubNumber + " ^ " + powerOfNumber + " = ");
                System.out.println(new DecimalFormat("#,###.0##").format(result));
            }
        }


    }
}
