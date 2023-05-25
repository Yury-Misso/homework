package home_work_1;

import java.util.Scanner;

public class Task62 implements ICommunicationPrinter {
    @Override
    public String welcom(String s) {
        if (s.equalsIgnoreCase("Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        } else if (s.equalsIgnoreCase("Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
