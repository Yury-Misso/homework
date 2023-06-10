package home_work_6;

import home_work_6.api.Generator;
import home_work_6.classes.AnimalsGenerator;
import home_work_6.classes.PersonGenerator;
import home_work_6.classes.Printer;
import home_work_6.comparators.ComparatorAnimalByAge;
import home_work_6.comparators.ComparatorPersonByPassword;
import home_work_6.comparators.ComparatorPersonByPasswordAndNick;
import home_work_6.dto.Animal;
import home_work_6.classes.ConsoleColors;
import home_work_6.dto.MethodGenerate;
import home_work_6.dto.Person;

import java.util.*;

public class Worker {
    public static void main(String[] args) {
        int time = 0;
        Printer printer = new Printer();
        Generator<Person> personGenerator = new PersonGenerator();
        Generator<Animal> animalGenerator = new AnimalsGenerator();

        List<Person> personListLinkL = new LinkedList<>();
        List<Person> personListArrL = new ArrayList<>();
        Set<Person> personSetHash = new HashSet<>();
        Set<Person> personSetTree = new TreeSet<>(new ComparatorPersonByPassword());

        List<Animal> animalListLinkL = new LinkedList<>();
        List<Animal> animalListArrL = new LinkedList<>();
        Set<Animal> animalSetHash = new HashSet<>();
        Set<Animal> animalSetTree = new TreeSet<>(new ComparatorAnimalByAge());

        System.out.println("P E R S O N s");

        time = fillCollection(personListLinkL, 10_000, personGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = fillCollection(personListArrL, 10_000, personGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        time = fillCollection(personSetHash, 10_000, personGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to HashSet ", time, time + " ms", ConsoleColors.RED, ConsoleColors.RED_BACKGROUND);

        time = fillCollection(personSetTree, 10_000, personGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to TreeSet ", time, time + " ms", ConsoleColors.GREEN, ConsoleColors.GREEN_BACKGROUND);

        printer.printTable();

        System.out.println();
        System.out.println("A N I M A L s");

        time = fillCollection(animalListLinkL, 10_000, animalGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = fillCollection(animalListArrL, 10_000, animalGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        time = fillCollection(animalSetHash, 10_000, animalGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to HashSet ", time, time + " ms", ConsoleColors.RED, ConsoleColors.RED_BACKGROUND);

        time = fillCollection(animalSetTree, 10_000, animalGenerator, MethodGenerate.RANDOM_TRUE_NAME);
        printer.addLine("Operation add to TreeSet ", time, time + " ms", ConsoleColors.GREEN, ConsoleColors.GREEN_BACKGROUND);

        printer.printTable();

        System.out.println();
        System.out.println("P E R S O N s");

        time = sortCollection(personListLinkL, new ComparatorPersonByPasswordAndNick());
        printer.addLine("Operation sort in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = sortCollection(personListArrL, new ComparatorPersonByPasswordAndNick());
        printer.addLine("Operation sort in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        printer.printTable();
        System.out.println();
        System.out.println("A N I M A L s");
        time = mySortCollection(personListLinkL, new ComparatorPersonByPassword());
        printer.addLine("Operation my sort in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = mySortCollection(personListArrL, new ComparatorPersonByPassword());
        printer.addLine("Operation my sort in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);
        printer.printTable();

        System.out.println();
        System.out.println("P E R S O N s");

        time = iterationByCollection(personListLinkL);
        printer.addLine("Operation iteration in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = iterationByCollection(personListArrL);
        printer.addLine("Operation iteration in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        printer.printTable();
        System.out.println();
        System.out.println("A N I M A L s");
        time = iterationByCollection(personListLinkL);
        printer.addLine("Operation iteration in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = iterationByCollection(personListArrL);
        printer.addLine("Operation iteration in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);
        printer.printTable();

        System.out.println();
        System.out.println("P E R S O N s");

        time = iterationByCollectionFORE(personListLinkL);
        printer.addLine("Operation iteration FORE in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = iterationByCollectionFORE(personListArrL);
        printer.addLine("Operation iteration FORE in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        printer.printTable();
        System.out.println();
        System.out.println("A N I M A L s");
        time = iterationByCollectionFORE(personListLinkL);
        printer.addLine("Operation iteration FORE in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = iterationByCollectionFORE(personListArrL);
        printer.addLine("Operation iteration FORE in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);
        printer.printTable();

        System.out.println();
        System.out.println("P E R S O N s");

        time = removeElementsCollection(personListLinkL);
        printer.addLine("Operation remove from LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = removeElementsCollection(personListArrL);
        printer.addLine("Operation remove from ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);

        printer.printTable();
        System.out.println();
        System.out.println("A N I M A L s");
        time = removeElementsCollectionFORE(personListLinkL);
        printer.addLine("Operation remove FORE in LinkedList ", time, time + " ms", ConsoleColors.BLUE, ConsoleColors.BLUE_BACKGROUND);

        time = removeElementsCollectionFORE(personListArrL);
        printer.addLine("Operation remove FORE in ArrayList ", time, time + " ms", ConsoleColors.PURPLE, ConsoleColors.PURPLE_BACKGROUND);
        printer.printTable();

    }

    public static <T> int fillCollection(Collection<T> collection, int size, Generator<T> generator, MethodGenerate methodGenerate) {
        long start = System.currentTimeMillis();
        generator.fillCollection(collection, size, methodGenerate);
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int sortCollection(List<T> list, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        list.sort(comparator);
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int mySortCollection(List<T> list, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        T temp = null;
        boolean didSwap = true;
        int left = 0;
        int right = list.size();
        while (didSwap) {
            didSwap = false;
            for (int i = left; i < right - 1; i++) {
                if ((comparator.compare(list.get(i), list.get(i + 1))) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    didSwap = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if ((comparator.compare(list.get(i - 1), list.get(i))) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, temp);
                    didSwap = true;
                }
            }
            left++;
        }
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int iterationByCollection(List<T> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int iterationByCollectionFORE(List<T> list) {
        long start = System.currentTimeMillis();
        int i = 0;
        for (T element : list) {
            i++;
        }
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int removeElementsCollection(List<T> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(0);
        }
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }

    public static <T> int removeElementsCollectionFORE(List<T> list) {
        long start = System.currentTimeMillis();
        int i = 0;
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list.remove(0);
        }
        long stop = System.currentTimeMillis();
        return (int) (stop - start);
    }


}
