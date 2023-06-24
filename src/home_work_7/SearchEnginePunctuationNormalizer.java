package home_work_7;

import home_work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        return this.iSearchEngine.search(text, word);
    }

    public String clearPunctuation(String text) {
        String regex = "[ !\"#$%&'()*+,\\\\./:;<=>?@\\[\\]^_`{|\n\t-]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll(" ");
        pattern = Pattern.compile(" +");
        matcher = pattern.matcher(result);
        return matcher.replaceAll(" ").strip();
    }
}
