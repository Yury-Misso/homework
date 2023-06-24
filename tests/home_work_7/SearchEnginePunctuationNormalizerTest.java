package home_work_7;

import home_work_7.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {
    private static ISearchEngine iSearchEngine
            = new RegExSearch();
    private static SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer
            = new SearchEnginePunctuationNormalizer(iSearchEngine);

    @Test
    public void clearPunctuationTest1() {
        String text = "мама, мыла раму у мамана быть мама-мама рама23 мама- мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23  мама мама? есть -мама: вчера мама\n" +
                "мама, мыла раму у мамана быть рама23 мама-мама? есть -мама: вчера мама\n";

        String result = searchEnginePunctuationNormalizer.clearPunctuation(text);
        String expectedText = "мама мыла раму у мамана быть мама мама рама23 мама мама есть мама вчера мама мама мыла раму у мамана быть рама23 мама мама есть мама вчера мама мама мыла раму у мамана быть рама23 мама мама есть мама вчера мама";
        Assertions.assertEquals(expectedText, result);
    }
}
