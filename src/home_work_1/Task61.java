package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            if ((name.equalsIgnoreCase("����"))
                    || (name.equalsIgnoreCase("���������"))) {
                if (name.equalsIgnoreCase("����")) {
                    System.out.println("������!");
                    System.out.println("� ���� ��� ����� ����");
                }
                if (name.equalsIgnoreCase("���������")) {
                    System.out.println("� ���� ��� ����� ����");
                }
            } else {
                System.out.println("������ ����, � �� ���?");
            }

        }

    }
}
