package home_work_6.comparators;

import home_work_6.dto.Person;

import java.util.Comparator;

public class ComparatorPerson {
    public static int compareByPassword(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }

    public static int compareByPasswordAndNick(Person o1, Person o2) {
        return o1.getPassword().length() == o2.getPassword().length()
                ? o1.getNick().compareTo(o2.getNick())
                : o1.getPassword().length() - o2.getPassword().length();
    }
}
