package home_work_7;

import home_work_7.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        String regex = "[ !\"#$%&'()*+,\\\\./:;<=>?@\\[\\]^_`{|\n\t]+";
        String[] words = text.split(regex);

        String patternRegex = "(" + word + "-{3,}" + word + ")|(^-?"
                + word + "-?$)|(^" + word + "-{3,})|(-{3,}" + word + "$)";
        Pattern pattern = Pattern.compile(patternRegex);
        Matcher matcher;

        int counter = 0;
        for (String s : words) {
            matcher = pattern.matcher(s);
            while (matcher.find()) {
                counter++;
            }
        }
        return counter;
    }
}
