package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {
    private static final EasySearch EASY_SEARCH = new EasySearch();

    @Test
    public void searchTest1() {
        String text = "мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 7;

        Assertions.assertEquals(EASY_SEARCH.search(text, word), assertInt);
    }

    @Test
    public void searchTest2() {
        String text = "мама, мыла раму у мамана быть рама23  мама мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 5;

        Assertions.assertEquals(EASY_SEARCH.search(text, word), assertInt);
    }

    @Test
    public void searchTest3() {
        String text = "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 5;

        Assertions.assertEquals(EASY_SEARCH.search(text, word), assertInt);
    }

    @Test
    public void searchTest4() {
        String text = "мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23  мама мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама: вчера мама\n";
        String word = "мама";
        int assertInt = 17;

        Assertions.assertEquals(EASY_SEARCH.search(text, word), assertInt);
    }
}
