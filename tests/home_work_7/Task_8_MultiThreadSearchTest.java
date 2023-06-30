package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.multiThreadClasses.FileAndBufferedReaderClass;
import home_work_7.multiThreadClasses.Result;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Task_8_MultiThreadSearchTest {
    interface ITask_8_MultiThreadSearchTest {
        ArrayBlockingQueue<FileAndBufferedReaderClass> filesAndBufferedReaders
                = new ArrayBlockingQueue<>(7);
        File fileResult = new File("homework/src/home_work_7/result.txt");
        boolean stop = false;

        void main(String[] args);

        void searchWord(String word
                , FileAndBufferedReaderClass fileAndBufferedReaderClass
                , ExecutorService executorService
                , List<Future<Result>> futuresResults
                , ISearchEngine engine);

        void fillInQueue(File[] listFiles
                , ExecutorService executorService);
    }

    @Test
    public void mainTest1() {

    }
}
