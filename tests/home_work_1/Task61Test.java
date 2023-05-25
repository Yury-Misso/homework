package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Task61Test {

    private static Task61 task61;

    @BeforeAll
    public static void createFields() {
        task61 = new Task61();
    }

    @Test
    public void getResponseTest1() {

        String name = "Вася";
        String actual = "Привет!\nЯ тебя так долго ждал";
        Assertions.assertTrue(task61.welcom(name).equalsIgnoreCase(actual));
    }

    @Test
    public void getResponseTest2() {

        String name = "Анастасия";
        String actual = "Я тебя так долго ждал";
        Assertions.assertTrue(task61.welcom(name).equalsIgnoreCase(actual));
    }

    @Test
    public void getResponseTest3() {

        String name = "Юра";
        String actual = "Добрый день, а вы кто?";
        Assertions.assertTrue(task61.welcom(name).equalsIgnoreCase(actual));
    }
}
