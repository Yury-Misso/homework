package home_work_7;

import home_work_7.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCASE_INSENSITIVETest {
    private static ISearchEngine iSearchEngine = new RegExSearch();

    private static SearchEngineCASE_INSENSITIVE bufferedReaderCASEInsensitive
            = new SearchEngineCASE_INSENSITIVE(iSearchEngine);

    @Test
    public void searchTest1() {
        String text = "Мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -Мама: вчера мама\n" +
                "маМа, мыла раму у мамана быть рама23  мама мама? есть -Мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23 Мама-мама? есть -мама: вчера мама\n";
        String word = "Мама";
        int assertInt = 13;

        Assertions.assertEquals(bufferedReaderCASEInsensitive.search(text, word), assertInt);
    }

    @Test
    public void searchTest2() {
        String text = "Мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -Мама: вчера мама\n" +
                "маМа, мыла раму у мамана быть рама23  мама мама? есть -Мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23 Мама-мама? есть -мама: вчера мама\n";
        String word = null;
        int assertInt = -1;

        Assertions.assertEquals(bufferedReaderCASEInsensitive.search(text, word), assertInt);
    }
}
