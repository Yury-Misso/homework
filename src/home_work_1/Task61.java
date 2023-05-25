package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task61 implements ICommunicationPrinter {

    @Override
    public String welcom(String s) {
        if (s.equalsIgnoreCase("Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        }
        if (s.equalsIgnoreCase("Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }

}
