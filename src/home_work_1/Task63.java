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
                case "вася":
                    System.out.println("Привет!");
                    System.out.println("Я тебя так долго ждал");
                    break;
                case "анастасия":
                    System.out.println("Я тебя так долго ждал");
                    break;
                default:
                    System.out.println("Добрый день, а вы кто?");
                    break;
            }

        }
    }
}
