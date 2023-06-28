package home_work_7;

import home_work_7.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SearchEngineCASE_INSENSITIVE implements ISearchEngine {
    private ISearchEngine iSearchEngine;

    public SearchEngineCASE_INSENSITIVE(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (text == null || word == null) {
            return -1;
        }

        String line;
        long count = 0;

        try (BufferedReader bufferedReader
                     = new BufferedReader(new StringReader(text))) {
            while ((line = bufferedReader.readLine()) != null) {
                count += iSearchEngine.search(line.toLowerCase(), word.toLowerCase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return count;
    }
}
