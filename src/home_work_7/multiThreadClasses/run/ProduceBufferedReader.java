package home_work_7.multiThreadClasses.run;

import home_work_7.multiThreadClasses.job.GuessEncoding;
import java.io.BufferedReader;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class ProduceBufferedReader implements Runnable {
    private final File file;
    private final ConcurrentHashMap<File, BufferedReader> fileAndBufferedReaderMap;

    public ProduceBufferedReader(File file,
                                 ConcurrentHashMap<File, BufferedReader> fileAndBufferedReaderMap) {
        this.file = file;
        this.fileAndBufferedReaderMap = fileAndBufferedReaderMap;
    }

    @Override
    public void run() {
        if (file.getName().endsWith(".txt")) {
            fileAndBufferedReaderMap.put(file,
                    GuessEncoding.getBufferedReaderWithEncoding(file));
        }
    }
}
