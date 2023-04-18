package home_work_1;

import java.util.Scanner;

public class Task1Dub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String run = "";
        String aString;
        String bString;
        double a = 0.0d;
        double b = 0.0d;

        while (!run.equalsIgnoreCase("q")) {
            System.out.println("enter a");
            aString = scanner.nextLine();
            try {
                a = Double.parseDouble(aString);
            } catch (Exception e) {
                System.out.println("enter double");
                continue;
            }
            System.out.println("enter b");
            bString = scanner.nextLine();
            try {
                b = Double.parseDouble(bString);
            } catch (Exception e) {
                System.out.println("enter double");
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
    This method executes Or for double
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    result
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    1 or 1 -> 1
    0 or 0 -> 0
    ...
    0 or 0 -> 0
     */
    public static void binaryOr(double a, double b) {
        String aBinaryString = Long.toBinaryString(Double.doubleToRawLongBits(a));
        String bBinaryString = Long.toBinaryString(Double.doubleToRawLongBits(b));
        char[] aBinaryCharArray = aBinaryString.toCharArray();
        char[] bBinaryCharArray = bBinaryString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < aBinaryCharArray.length; i++) {
            int aInt = Integer.parseInt(String.valueOf(aBinaryCharArray[i]));
            int bInt = Integer.parseInt(String.valueOf(bBinaryCharArray[i]));

            stringBuilder.append(aInt | bInt);
        }

        double doubleValue = Double.longBitsToDouble(Long.parseLong(stringBuilder.toString(), 2));

        System.out.format("a:   %18s\t ->\t %63s\n", Double.toString(a), aBinaryString);
        System.out.format("b:   %18s\t ->\t %63s\n", Double.toString(b), bBinaryString);
        System.out.format("Or:  %18s\t ->\t %63s\n", Double.toString(doubleValue), stringBuilder.toString());
    }

    /*
    This method executes And for double
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    result
    42.5 -> 100000001000101010000000000000000000000000000000000000000000000
    1 or 1 -> 1
    0 or 0 -> 0
    ...
    0 or 0 -> 0
     */
    public static void binaryAnd(double a, double b) {
        String aBinaryString = Long.toBinaryString(Double.doubleToRawLongBits(a));
        String bBinaryString = Long.toBinaryString(Double.doubleToRawLongBits(b));
        char[] aBinaryCharArray = aBinaryString.toCharArray();
        char[] bBinaryCharArray = bBinaryString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < aBinaryCharArray.length; i++) {
            int aInt = Integer.parseInt(String.valueOf(aBinaryCharArray[i]));
            int bInt = Integer.parseInt(String.valueOf(bBinaryCharArray[i]));

            stringBuilder.append(aInt & bInt);
        }

        double doubleValue = Double.longBitsToDouble(Long.parseLong(stringBuilder.toString(), 2));

        System.out.format("a:   %18s\t ->\t %63s\n", Double.toString(a), aBinaryString);
        System.out.format("b:   %18s\t ->\t %63s\n", Double.toString(b), bBinaryString);
        System.out.format("And: %18s\t ->\t %63s\n", Double.toString(doubleValue), stringBuilder.toString());
    }
}
