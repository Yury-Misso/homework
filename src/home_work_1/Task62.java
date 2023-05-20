package home_work_1;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            if (name.equalsIgnoreCase("Вася")) {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
            } else if (name.equalsIgnoreCase("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }

        }
    }
}
