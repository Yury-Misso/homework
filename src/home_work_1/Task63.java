package home_work_1;

import java.util.Scanner;

public class Task63 implements ICommunicationPrinter {
    @Override
    public String welcom(String s) {
        String response = "";
        switch (s.toLowerCase()) {
            case "вася":
                response = "Привет!\nЯ тебя так долго ждал";
                break;
            case "анастасия":
                response = "Я тебя так долго ждал";
                break;
            default:
                response = "Добрый день, а вы кто?";
                break;
        }
        return response;
    }
}
