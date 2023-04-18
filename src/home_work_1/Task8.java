package home_work_1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString;
        byte bt;

        while (true) {
            System.out.println("Enter byte");
            someString = scanner.nextLine();

            if (someString.equalsIgnoreCase("q")) {
                break;
            }

            try {
                bt = Byte.parseByte(someString);
            } catch (Exception e) {
                System.out.println("BYTE");
                continue;
            }

            System.out.println(toBinaryString(bt));

        }

    }

    public static String toBinaryString(byte number) {
        StringBuilder stringBuilder = new StringBuilder();
        byte absNumber = (byte) Math.abs( number);

        while (absNumber != 0) {
            stringBuilder.append(absNumber % 2);
            absNumber = (byte) (((int) absNumber) / 2);
        }

        while (stringBuilder.length() != 8) {
            stringBuilder.append("0");
        }

        stringBuilder.reverse();

        if (number >= 0) {
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilderMinus = new StringBuilder();
            String[] strings = stringBuilder.toString().split("");

            for (String string : strings) {
                if (string.equalsIgnoreCase("0")) {
                    stringBuilderMinus.append("1");
                }
                if (string.equalsIgnoreCase("1")) {
                    stringBuilderMinus.append("0");
                }
            }

            String[] stringsMinus = stringBuilderMinus.toString().split("");

            boolean addOne = true;

            for (int i = stringsMinus.length - 1; i >= 0; i--) {
                if (addOne) {
                    if (stringsMinus[i].equalsIgnoreCase("1")) {
                        stringsMinus[i] = "0";
                        addOne = true;
                    } else if (stringsMinus[i].equalsIgnoreCase("0")) {
                        stringsMinus[i] = "1";
                        addOne = false;
                    }
                } else {
                    if (stringsMinus[i].equalsIgnoreCase("1")) {
                        stringsMinus[i] = "1";
                        addOne = false;
                    } else if (stringsMinus[i].equalsIgnoreCase("0")) {
                        stringsMinus[i] = "0";
                        addOne = false;
                    }
                }


            }

            StringBuilder stringBuilder1 = new StringBuilder();

            for (int i = 0; i < stringsMinus.length; i++) {
                stringBuilder1.append(stringsMinus[i]);
            }

            return stringBuilder1.toString();

        }
    }
}
