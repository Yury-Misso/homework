package home_work_1;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Task41 task41 = new Task41();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter any Int");

            if (scanner.hasNextInt()) {
                System.out.println(task41.isEven(scanner.nextInt()));
            }
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                break;
            }
        }

    }

    public boolean isEven(int i) {
        if (i % 2 == 0)
            return true;
        else
            return false;
    }
}
