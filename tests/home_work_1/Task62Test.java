package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Task62Test {

    private static Task62 task62;

    @BeforeAll
    public static void createFields() {
        task62 = new Task62();
    }

    @Test
    public void getResponseTest1() {

        String name = "Вася";
        String actual = "Привет!\nЯ тебя так долго ждал";
        Assertions.assertTrue(task62.welcom(name).equalsIgnoreCase(actual));
    }

    @Test
    public void getResponseTest2() {

        String name = "Анастасия";
        String actual = "Я тебя так долго ждал";
        Assertions.assertTrue(task62.welcom(name).equalsIgnoreCase(actual));
    }

    @Test
    public void getResponseTest3() {

        String name = "Юра";
        String actual = "Добрый день, а вы кто?";
        Assertions.assertTrue(task62.welcom(name).equalsIgnoreCase(actual));
    }

}
