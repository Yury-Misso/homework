package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.multiThreadClasses.FileAndBufferedReaderClass;
import home_work_7.multiThreadClasses.Result;
import home_work_7.multiThreadClasses.job.GuessEncoding;
import home_work_7.multiThreadClasses.run.DoSearchWord;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_8_MultiThreadSearch {
    private static ArrayBlockingQueue<FileAndBufferedReaderClass> filesAndBufferedReaders
            = new ArrayBlockingQueue<>(7);
    private static final File fileResult = new File("homework/src/home_work_7/result.txt");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File directoryFind = null;
        File[] listFiles = null;

        SearchEngineCASE_INSENSITIVE engineCASEInsensitive
                = new SearchEngineCASE_INSENSITIVE(new RegExSearch());

        String word;

        List<Future<Result>> futuresResults
                = Collections.synchronizedList(new ArrayList<>());

        AtomicInteger atomicInteger1 = new AtomicInteger(0);

        if (args != null && args.length > 0) {
            directoryFind = new File(args[0]);
        }

        while (true) {

            ExecutorService executorForFillInFileAndReader
                    = Executors.newFixedThreadPool(4);

            ExecutorService findWordInFile
                    = Executors.newFixedThreadPool(4);

            if (listFiles == null) {

                while (directoryFind == null || !directoryFind.exists()) {
                    System.out.println("Enter absolute path:");
                    directoryFind = new File(scanner.nextLine());
                }

                listFiles = directoryFind.listFiles();
            }

            fillInQueue(listFiles, executorForFillInFileAndReader);

            System.out.println("/////////////////// - "
                    + atomicInteger1.incrementAndGet()
                    + " - ///////////////////");

            System.out.println("Enter word:");
            word = scanner.nextLine();

            if (word.equalsIgnoreCase("q")) {
                executorForFillInFileAndReader.shutdown();
                try {
                    executorForFillInFileAndReader.awaitTermination(10, TimeUnit.MINUTES);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }

            executorForFillInFileAndReader.shutdown();

            boolean b;
            while (true) {
                b = executorForFillInFileAndReader.isTerminated()
                        && filesAndBufferedReaders.isEmpty();
                if (b) {
                    break;
                }
                try {
                    searchWord(word, filesAndBufferedReaders.take()
                            , findWordInFile, futuresResults, engineCASEInsensitive);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            findWordInFile.shutdown();
            try {
                findWordInFile.awaitTermination(10, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AtomicInteger atomicInteger = new AtomicInteger();
            StringBuilder stringBuilder = new StringBuilder();
            futuresResults.forEach(f -> {
                try {
                    stringBuilder.append(f.get().getFile().getName())
                            .append(" : ").append(f.get().getWord())
                            .append(" : ").append(f.get().getCount()).append("\n");
                    System.out.print(atomicInteger.incrementAndGet() + " : " + stringBuilder);
                    Task_8_MultiThreadSearchWithMap.writeToFile(fileResult, stringBuilder.toString());
                    stringBuilder.setLength(0);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
            futuresResults.clear();
        }

    }


    private static void searchWord(String word
            , FileAndBufferedReaderClass fileAndBufferedReaderClass
            , ExecutorService executorService
            , List<Future<Result>> futuresResults
            , ISearchEngine engine) {

        futuresResults.add(executorService.submit(
                new DoSearchWord(word, fileAndBufferedReaderClass.getFile()
                        , fileAndBufferedReaderClass.getReader()
                        , engine)
        ));
    }

    private static void fillInQueue(File[] listFiles
            , ExecutorService executorService) {

        if (listFiles != null) {
            for (File file : listFiles) {
                if ((file != null)
                        && (file.getName().endsWith(".txt"))) {
                    executorService.execute(
                            () -> {
                                try {
                                    filesAndBufferedReaders.put(
                                            new FileAndBufferedReaderClass(file
                                                    , GuessEncoding.getBufferedReaderWithEncoding(file))
                                    );
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                    );
                }
            }
        }
    }


}
