package home_work_7.multiThreadClasses.job;

import home_work_7.api.ISearchEngine;
import home_work_7.multiThreadClasses.Result;

import java.io.BufferedReader;
import java.io.File;
import java.util.concurrent.Callable;

public class NewSearch implements Callable<Result> {
    private final File file;
    private final String word;
    private final ISearchEngine engine;

    public NewSearch(File file, String word, ISearchEngine engine) {
        this.file = file;
        this.word = word;
        this.engine = engine;
    }

    @Override
    public Result call() throws Exception {
        BufferedReader reader = GuessEncoding.getBufferedReaderWithEncoding(file);
        String text;
        int count = 0;
        while ((text = reader.readLine()) != null) {
            count += engine.search(text, word);
        }
        return new Result(file, word, count);
    }
}
