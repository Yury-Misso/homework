package home_work_7.multiThreadClasses.run;

import home_work_7.api.ISearchEngine;
import home_work_7.multiThreadClasses.Result;
import home_work_7.multiThreadClasses.job.SearchWord;
import java.io.BufferedReader;
import java.io.File;
import java.util.concurrent.Callable;

public class DoSearchWord implements Callable<Result> {
    private final String word;
    private final File file;
    private final BufferedReader reader;
    private final ISearchEngine engine;

    public DoSearchWord(String word, File file
            , BufferedReader reader, ISearchEngine engine) {
        this.word = word;
        this.file = file;
        this.reader = reader;
        this.engine = engine;
    }

    @Override
    public Result call() throws Exception {
        return new Result(this.file
                , word, new SearchWord(this.reader
                , this.engine, word).search());
    }
}
