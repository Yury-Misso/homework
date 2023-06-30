package home_work_7;

import home_work_7.multiThreadClasses.Result;
import home_work_7.multiThreadClasses.run.DoSearchWord;
import home_work_7.multiThreadClasses.run.ProduceBufferedReader;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_8_MultiThreadSearchWithMap {

    private static ConcurrentHashMap<File, BufferedReader> fileAndBufferedReaderMap
            = new ConcurrentHashMap<>();

    private static List<Future<Result>> futuresResults
            = Collections.synchronizedList(new ArrayList<>());

    private static final SearchEngineCASE_INSENSITIVE engineCASEInsensitive
            = new SearchEngineCASE_INSENSITIVE(new RegExSearch());

    private static ExecutorService produceFileAndBufferedReaderExecutorService;

    private static final File fileResult = new File("homework/src/home_work_7/result.txt");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word;

        AtomicInteger atomicIntCountSearch = new AtomicInteger(0);

        String path = "";

        if (args != null && args.length > 0) {
            path = args[0];
        }

        while (true) {

            produceFileAndBufferedReaderExecutorService
                    = Executors.newFixedThreadPool(4);

            if (fileAndBufferedReaderMap.isEmpty()) {
                while (!fillInMap(path)) {
                    System.out.println("Enter path");
                    path = scanner.nextLine();
                }
            }

            System.out.println("/////////////////// - "
                    + atomicIntCountSearch.incrementAndGet()
                    + " - ///////////////////");

            System.out.println("Enter word:");
            word = scanner.nextLine();

            try {
                produceFileAndBufferedReaderExecutorService.shutdown();
                produceFileAndBufferedReaderExecutorService
                        .awaitTermination(15, TimeUnit.MINUTES);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (word.equalsIgnoreCase("q")) {
                break;
            }

            searchWord(word);

            AtomicInteger atomicInteger = new AtomicInteger();
            StringBuilder stringBuilder = new StringBuilder();
            futuresResults.forEach(f -> {
                try {
                    stringBuilder.append(f.get().getFile().getName())
                            .append(" : ").append(f.get().getWord())
                            .append(" : ").append(f.get().getCount()).append("\n");
                    System.out.print(atomicInteger.incrementAndGet() + " : " + stringBuilder);
                    writeToFile(fileResult, stringBuilder.toString());
                    stringBuilder.setLength(0);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
            futuresResults.clear();
            fileAndBufferedReaderMap.clear();
        }
    }

    public static void writeToFile(File file, String string) {
        if (file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(string);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
                writer.write(string);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void searchWord(String word) {
        ExecutorService findWordInFileExecutorService
                = Executors.newFixedThreadPool(4);

        Set<File> fileSet = new HashSet<>(fileAndBufferedReaderMap.keySet());

        for (File file : fileSet) {
            futuresResults.add(findWordInFileExecutorService.submit(
                    new DoSearchWord(word, file
                            , new BufferedReader(fileAndBufferedReaderMap.get(file))
                            , engineCASEInsensitive)));
        }

        findWordInFileExecutorService.shutdown();

        try {
            findWordInFileExecutorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean fillInMap(String path) {

        File[] listFiles;

        if (path == null) return false;
        if (fileAndBufferedReaderMap.isEmpty()) {
            listFiles = new File(path).listFiles();
        } else {
            return false;
        }

        if (listFiles != null) {
            for (File file : listFiles) {
                produceFileAndBufferedReaderExecutorService.execute(
                        new ProduceBufferedReader(file, fileAndBufferedReaderMap));
            }
        } else {
            return false;
        }

        return true;
    }


}
