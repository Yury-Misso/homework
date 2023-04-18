package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String run = "";
        String aString;
        String bString;
        int a = 0;
        int b = 0;

        while (!run.equalsIgnoreCase("q")) {
            System.out.println("enter a");
            aString = scanner.nextLine();
            try {
                a = Integer.parseInt(aString);
            } catch (Exception e) {
                System.out.println("enter integer");
                continue;
            }
            System.out.println("enter b");
            bString = scanner.nextLine();
            try {
                b = Integer.parseInt(bString);
            } catch (Exception e) {
                System.out.println("enter integer");
                continue;
            }

            binaryAnd(a, b);
            System.out.println();
            binaryOr(a, b);

            System.out.println("For exit enter Q, to continue enter any letter");
            run = scanner.nextLine();
        }
    }

    /*
    This method executes Or for integer
    45 -> 101101
    56 -> 111000
    result
    61 -> 111101
    1 or 1 -> 1
    0 or 1 -> 1
    ...
    1 or 0 -> 1
     */
    public static void binaryOr(int a, int b) {
        String or = Integer.toString(a | b);
        System.out.println("a: " + a + "\t\t     ->     \t\t" + Integer.toBinaryString(a));
        System.out.println("b: " + b + "\t\t     ->     \t\t" + Integer.toBinaryString(b));
        System.out.println("c: " + or + "\t\t binary or: \t\t" + Integer.toBinaryString(a | b));
    }

    /*
    This method executes And for integer
    45 -> 101101
    56 -> 111000
    result
    40 -> 101000
    1 or 1 -> 1
    0 or 1 -> 0
    ...
    1 or 0 -> 0
     */
    public static void binaryAnd(int a, int b) {
        String and = Integer.toString(a & b);
        System.out.println("a: " + a + "\t\t     ->     \t\t" + Integer.toBinaryString(a));
        System.out.println("b: " + b + "\t\t     ->     \t\t" + Integer.toBinaryString(b));
        System.out.println("c: " + and + "\t\t binary and: \t\t" + Integer.toBinaryString(a & b));
    }



}
