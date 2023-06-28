package home_work_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {
    private static final RegExSearch REG_EX_SEARCH = new RegExSearch();

    @Test
    public void searchTest1() {
        String text = "мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 5;

        Assertions.assertEquals(REG_EX_SEARCH.search(text, word), assertInt);
    }
    @Test
    public void searchTest2() {
        String text = "мама, мыла раму у мамана быть рама23  мама мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 5;

        Assertions.assertEquals(REG_EX_SEARCH.search(text, word), assertInt);
    }
    @Test
    public void searchTest3() {
        String text = "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама: вчера мама";
        String word = "мама";
        int assertInt = 3;

        Assertions.assertEquals(REG_EX_SEARCH.search(text, word), assertInt);
    }
    @Test
    public void searchTest4() {
        String text = "мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23  мама мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама: вчера мама\n";
        String word = "мама";
        int assertInt = 13;

        Assertions.assertEquals(REG_EX_SEARCH.search(text, word), assertInt);
    }
}
