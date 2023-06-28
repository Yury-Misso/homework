package home_work_7;

import home_work_7.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseNormalizerTest {
    private static ISearchEngine engine = new RegExSearch();
    private static SearchEngineCaseNormalizer searchEngineCaseNormalizer
            = new SearchEngineCaseNormalizer(engine);

    @Test
    public void searchTest1() {
        String text = "бабушка бабушке бабушку";
        String word = "бабушк" + "[А-я]{1}";
        int assertInt = 3;

        Assertions.assertEquals(searchEngineCaseNormalizer.search(text, word), assertInt);
    }

    @Test
    public void searchTest2() {
        String text = "бабушка бабушке бабушку бабушкам бабушкино"; //но что делать с "бабушек"?
        String word = "бабушка";
        int assertInt = 5;

        String s = "бабушка";

        Assertions.assertEquals(searchEngineCaseNormalizer.search(text, word), assertInt);
    }
}
