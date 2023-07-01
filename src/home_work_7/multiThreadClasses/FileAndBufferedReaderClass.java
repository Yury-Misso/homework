package home_work_7.multiThreadClasses;

import java.io.BufferedReader;
import java.io.File;

public class FileAndBufferedReaderClass {
    private final File file;
    private final BufferedReader reader;

    public FileAndBufferedReaderClass(File file, BufferedReader reader) {
        this.file = file;
        this.reader = reader;
    }

    public File getFile() {
        return file;
    }

    public BufferedReader getReader() {
        return reader;
    }
}
