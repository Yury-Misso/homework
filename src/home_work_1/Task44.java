package home_work_1;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someStringBytes;
        String someStringKBytes;
        int someBytes;
        double someKBytes;

        while (true) {
            System.out.println("Enter bytes");
            someStringBytes = scanner.nextLine();
            try {
                someBytes = Integer.parseInt(someStringBytes);
                if ((someBytes % 8 == 0) && (someBytes >= 0)) {
                    double kBytes = (double) someBytes / 1024;
                    System.out.format("%d in KB %.2f%n", someBytes, kBytes);
                }
            } catch (Exception e) {
                if (someStringBytes.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("INTEGER");
                }
            }
        }

        while (true) {
            System.out.println("Enter KBytes");
            someStringKBytes = scanner.nextLine();
            try {
                someKBytes = Double.parseDouble(someStringKBytes);
                if (someKBytes >= 0) {
                    int Bytes = (int) (someKBytes * 1024);
                    int countBytes = Bytes / 8 + 1;
                    Bytes = countBytes * 8;
                    System.out.format("%.2f KB in Bytes %d%n", someKBytes, Bytes);
                }
            } catch (Exception e) {
                if (someStringKBytes.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("DOUBLE");
                }
            }
        }


    }
}
