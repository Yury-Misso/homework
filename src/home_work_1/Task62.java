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

            if (name.equalsIgnoreCase("����")) {
                System.out.println("������!");
                System.out.println("� ���� ��� ����� ����");
            } else if (name.equalsIgnoreCase("���������")) {
                System.out.println("� ���� ��� ����� ����");
            } else {
                System.out.println("������ ����, � �� ���?");
            }

        }
    }
}
