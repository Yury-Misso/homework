package home_work_1;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            switch (name.toLowerCase()) {
                case "вас€":
                    System.out.println("ѕривет!");
                    System.out.println("я теб€ так долго ждал");
                    break;
                case "анастаси€":
                    System.out.println("я теб€ так долго ждал");
                    break;
                default:
                    System.out.println("ƒобрый день, а вы кто?");
                    break;
            }

        }
    }
}
