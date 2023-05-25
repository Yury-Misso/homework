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

                System.out.format("%d in KB %.2f%n", someBytes, convertToKB(someBytes));

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

                System.out.format("%.2f KB in Bytes %d%n", someKBytes, convertToBytes(someKBytes));

            } catch (Exception e) {
                if (someStringKBytes.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("DOUBLE");
                }
            }
        }


    }


    public static double convertToKB(int someBytes) throws Exception {
        double kBytes;
        if ((someBytes % 8 == 0) && (someBytes >= 0)) {
            kBytes = (double) someBytes / 1024;
            return kBytes;
        } else {
            throw new Exception("bytes should be >= 0 && %8=0");
        }
    }

    public static int convertToBytes(double someKBytes) throws Exception {
        int bytes;
        int countBytes;
        if (someKBytes > 0) {
            bytes = (int) (someKBytes * 1024);

            if (bytes % 8 != 0) {
                countBytes = bytes / 8;
                countBytes++;
                bytes = countBytes * 8;
            }

            return bytes;
        } else if (someKBytes == 0) {
            return 0;
        } else {
            throw new Exception("Kbytes should be >= 0");
        }
    }
}
