package home_work_6.classes;

import home_work_6.api.Generator;
import home_work_6.dto.MethodGenerate;
import home_work_6.dto.Person;

import java.util.Collection;


import static home_work_6.dto.MethodGenerate.*;

public class PersonGenerator extends AbstractGenerator implements Generator<Person> {

    private final String pathNamesFile = "\\homework\\src\\home_work_6\\source\\names.txt";
    private final String pathNicksFile = "\\homework\\src\\home_work_6\\source\\nicks.txt";

    @Override
    public Person generateElement(MethodGenerate methodGenerate) {
        if (methodGenerate.equals(RANDOM)) {
            return createRandom();
        } else if (methodGenerate.equals(RANDOM_RUS)) {
            return createRandomRus();
        } else if (methodGenerate.equals(RANDOM_TRUE_NAME)) {
            return createRandomTrueName();
        } else if (methodGenerate.equals(RANDOM_TRUE_NAME_FROM_FILE)) {
            return createRandomTrueNameFromFile();
        }
        return null;
    }

    @Override
    public void fillCollection(Collection<Person> collection, int size, MethodGenerate methodGenerate) {
        for (int i = 0; i < size; i++) {
            collection.add(generateElement(methodGenerate));
        }
    }

    private Person createRandom() {
        String nick = generateNameByRandomChar(5);
        String password = generatePassword();
        String name = generateNameByRandomChar(10);
        return new Person(nick, password, name);
    }

    private Person createRandomRus() {
        String nick = generateRandomStringEng(7);
        String password = generatePassword();
        String name = generateNameByRusChar(10);
        return new Person(nick, password, name);
    }

    private Person createRandomTrueName() {
        String nick = generateFromFile(this.pathNicksFile);
        String password = generatePassword();
        String name = generateTrueName();
        return new Person(nick, password, name);
    }

    private Person createRandomTrueNameFromFile() {
        String nick = generateFromFile(this.pathNicksFile);
        String password = generatePassword();
        String name = generateFromFile(this.pathNamesFile);
        return new Person(nick, password, name);
    }

    private String generateTrueName() {
        return Names.getRandomName();
    }
}
