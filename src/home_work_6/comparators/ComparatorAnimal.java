package home_work_6.comparators;

import home_work_6.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimal {

    public static int compareByAge(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }

    public static int compareByAgeAndAlias(Animal o1, Animal o2) {
        return o1.getAge() == o2.getAge()
                ? o1.getAlias().compareTo(o2.getAlias())
                : o1.getAge() - o2.getAge();
    }
}
