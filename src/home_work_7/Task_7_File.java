package home_work_7;

import home_work_7.api.ISearchEngine;
import home_work_7.multiThreadClasses.job.GuessEncoding;

import java.io.*;
import java.util.Scanner;

public class Task_7_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directoryFind = null;
        File fileForFind = null;
        String word = "";
        ISearchEngine engine = new SearchEngineCASE_INSENSITIVE(new RegExSearch());
        StringBuilder stringBuilder = new StringBuilder();
        String result;

        while (directoryFind == null || !directoryFind.exists()) {
            System.out.println("directory");
            directoryFind = new File(scanner.nextLine());
        }

        File[] listFiles = directoryFind.listFiles();

        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                }
            }
        }

        while (!(fileForFind != null && fileForFind.getName().equalsIgnoreCase("q"))) {

            System.out.println("file name");
            fileForFind = new File(directoryFind.getAbsolutePath() + "/" + scanner.nextLine());

            if (fileForFind.exists()) {

                while (true) {

                    System.out.println("word?");
                    word = scanner.nextLine();

                    if (word.equalsIgnoreCase("q")) break;

                    long count = 0;

                    try (BufferedReader reader = GuessEncoding.getBufferedReaderWithEncoding(fileForFind)) {

                        String line;

                        while ((line = reader.readLine()) != null) {
                            count += engine.search(line, word);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    result = fileForFind.getName() + " : "
                            + word + " : " + count;

                    System.out.println(result);

                    stringBuilder.append(result).append("\n");

                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("homework/src/home_work_7/result.txt"))) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
