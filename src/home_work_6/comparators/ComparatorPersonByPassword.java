package home_work_6.comparators;

import home_work_6.dto.Person;

import java.util.Comparator;

public class ComparatorPersonByPassword implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
