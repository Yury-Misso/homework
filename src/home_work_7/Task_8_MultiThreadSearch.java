package home_work_7;

import home_work_7.multiThreadClasses.Result;
import home_work_7.multiThreadClasses.job.NewSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_8_MultiThreadSearch {
    private static final File fileResult = new File("homework/src/home_work_7/result.txt");
    private static final AtomicBoolean atomicBooleanStop = new AtomicBoolean();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File directoryFind = null;
        File[] listFiles = null;

        SearchEngineCASE_INSENSITIVE engineCASEInsensitive
                = new SearchEngineCASE_INSENSITIVE(new RegExSearch());

        String word;

        List<Future<Result>> futuresResults
                = new ArrayList<>();

        AtomicInteger atomicInteger1 = new AtomicInteger(0);

        if (args != null && args.length > 0) {
            directoryFind = new File(args[0]);
        }

        while (true) {

            ExecutorService executorServiceNewSearch
                    = Executors.newFixedThreadPool(4);

            if (listFiles == null) {

                while (directoryFind == null || !directoryFind.exists()) {
                    System.out.println("Enter absolute path:");
                    directoryFind = new File(scanner.nextLine());
                }

                listFiles = directoryFind.listFiles(file -> file.getName().endsWith(".txt"));
            }

            System.out.println("/////////////////// - "
                    + atomicInteger1.incrementAndGet()
                    + " - ///////////////////");

            System.out.println("Enter word:");
            word = scanner.nextLine();

            if (!word.equalsIgnoreCase("q")) {
                if (listFiles != null) {
                    for (File file : listFiles) {
                        futuresResults.add(executorServiceNewSearch.submit(
                                new NewSearch(file, word, engineCASEInsensitive)));
                    }
                }
                executorServiceNewSearch.shutdown();
            } else {
                executorServiceNewSearch.shutdown();
                break;
            }

            System.out.print("In process ");
            atomicBooleanStop.set(false);
            Thread feature = new Thread(() -> {
                while (!atomicBooleanStop.get()) {
                    System.out.print("|| ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //throw new RuntimeException(e);
                    }
                }
            });
            feature.start();

            AtomicInteger atomicInteger = new AtomicInteger();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilderForFile = new StringBuilder();
            StringBuilder stringBuilderForConsole = new StringBuilder();
            futuresResults.forEach(f -> {
                try {
                    stringBuilder.append(f.get().getFile().getName())
                            .append(" : ").append(f.get().getWord())
                            .append(" : ").append(f.get().getCount()).append("\n");

                    stringBuilderForFile.append(stringBuilder);

                    stringBuilderForConsole.append(atomicInteger.incrementAndGet())
                            .append(" : ").append(stringBuilder);

                    stringBuilder.setLength(0);
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
            atomicBooleanStop.set(true);
            System.out.println();
            System.out.print(stringBuilderForConsole);
            Task_8_MultiThreadSearchWithMap.writeToFile(fileResult, stringBuilderForFile.toString());
            futuresResults.clear();
        }

    }
}
