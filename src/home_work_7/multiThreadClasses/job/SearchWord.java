package home_work_7.multiThreadClasses.job;

import home_work_7.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.IOException;

public class SearchWord {
    private final BufferedReader reader;
    private final ISearchEngine engine;
    private final String word;

    public SearchWord(BufferedReader reader, ISearchEngine engine, String word) {
        this.reader = reader;
        this.engine = engine;
        this.word = word;
    }

    public long search() {
        String line;
        long count = 0;

        try (reader) {
            while ((line = this.reader.readLine()) != null) {
                count += engine.search(line, word);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
