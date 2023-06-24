package home_work_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        //File file = new File("src/home_work_7/source/Война и мир.txt");
        File file = new File("homework/src/home_work_7/source/Война и мир_книга.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(getWords(stringBuilder.toString()).size());

        //System.out.println(getMapWithCount(stringBuilder.toString()).size());

        //AtomicInteger i = new AtomicInteger(1);
        //getNMostFrequentWords(stringBuilder.toString())
        //        .forEach((s, integer) ->
        //                System.out.println(i.getAndIncrement() + " : " + s + " -> " + integer));

        //Set<String> stringSet = new TreeSet<>(getWords(stringBuilder.toString()));
        //stringSet.stream().filter(s -> s.matches("-+")).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static Map<String, Integer> getNMostFrequentWords(String text) {
        return getNMostFrequentWords(getWords(text).size(), text);
    }

    public static Map<String, Integer> getNMostFrequentWords(int nWords, String text) {
        if (text == null) return null;
        if ((nWords > 0) && (nWords < Integer.MAX_VALUE)) {
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(getMapWithCount(text).entrySet());
            entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

            Map<String, Integer> mapNWords = new LinkedHashMap<>();

            int count = 0;
            int limit = nWords > entryList.size() ? entryList.size() : nWords;

            for (Map.Entry<String, Integer> stringIntegerEntry : entryList) {
                mapNWords.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());

                count++;
                if (count == limit) break;
            }

            return mapNWords;
        }
        return null;
    }

    public static Map<String, Integer> getMapWithCount(String text) {
        if (text == null) return null;
        Map<String, Integer> wordsCount = new HashMap<>();
        List<String> listWords = getWords(text);

        for (String word : listWords) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }

        return wordsCount;
    }

    public static List<String> getWords(String line) {
        if (line == null) return null;
        String[] strings = line.split("");
        String regex = "[-a-zA-ZА-я0-9]";
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = new ArrayList<>();

        for (String string : strings) {
            if (string.matches(regex)) {
                if ((stringBuilder.length() == 0) && (string.matches("-"))) {
                    continue;
                }
                stringBuilder.append(string);
            } else if (stringBuilder.length() != 0) {
                stringList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        if (stringBuilder.length() != 0) {
            stringList.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }

        return stringList;
    }
}
