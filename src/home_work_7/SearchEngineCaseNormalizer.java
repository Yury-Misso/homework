package home_work_7;

import home_work_7.api.ISearchEngine;

import java.util.Arrays;
import java.util.List;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine iSearchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        List<String> wordEndings = Arrays.asList("ами", "ями", "ов", "ев", "ей", "ам", "ям", "ой"
                , "ою", "ею", "ом", "ем", "ах", "ях", "а", "я", "о", "е", "ы", "и", "у", "ю");
        int lengthCut = 0;

        for (String s : wordEndings) {
            if (word.endsWith(s)) {
                lengthCut = s.length();
            }
        }

        String newWord = word.substring(0, word.length() - lengthCut) + "[А-я]{0,3}";

        return iSearchEngine.search(text, newWord);
    }
}
