package home_work_7;

import home_work_7.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    //TODO окончания для падежей
    @Test
    public void clearPunctuation() {
        String s = "-а, -я –, -о, -е - -ы, и, -а, -я\n" +
                "-ы, -и -а, -я -и –, -ов, ев, -ей\n" +
                "-е, -и -у, -ю -и -ам, -ям\n" +
                "-у, -ю -о, -е - –, -ы, -и, а, -я, -ей\n" +
                "-ой (-ою), ей (-ею) -ом, -ем -ю -ами, -ями\n" +
                "-е, -и -е, -и -и -ах, -ях";


        Arrays.stream(searchEnginePunctuationNormalizer.clearPunctuation(s).split(" "))
                .map(String::strip).distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
