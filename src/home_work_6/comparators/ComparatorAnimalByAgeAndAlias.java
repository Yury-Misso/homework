package home_work_6.comparators;

import home_work_6.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalByAgeAndAlias implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() == o2.getAge()
                ? o1.getAlias().compareTo(o2.getAlias())
                : o1.getAge() - o2.getAge();
    }
}
