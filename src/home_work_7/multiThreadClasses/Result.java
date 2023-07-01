package home_work_7.multiThreadClasses;

import java.io.File;

public class Result {
    private final File file;
    private final String word;
    private final long count;

    public Result(File file, String word, long count) {
        this.file = file;
        this.word = word;
        this.count = count;
    }

    public File getFile() {
        return file;
    }

    public String getWord() {
        return word;
    }

    public long getCount() {
        return count;
    }
}
