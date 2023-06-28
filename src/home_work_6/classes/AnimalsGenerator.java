package home_work_6.classes;

import home_work_6.api.Generator;
import home_work_6.dto.Animal;
import home_work_6.dto.MethodGenerate;
import home_work_6.dto.Person;

import java.util.Collection;

import static home_work_6.dto.MethodGenerate.*;
import static home_work_6.dto.MethodGenerate.RANDOM_TRUE_NAME_FROM_FILE;

public class AnimalsGenerator extends AbstractGenerator implements Generator<Animal> {

    private final String pathAliasFile = "\\homework\\src\\home_work_6\\source\\alias.txt";

    @Override
    public Animal generateElement(MethodGenerate methodGenerate) {
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
    public void fillCollection(Collection<Animal> collection, int size, MethodGenerate methodGenerate) {
        for (int i = 0; i < size; i++) {
            collection.add(generateElement(methodGenerate));
        }
    }

    private Animal createRandom() {
        int age = generateAge();
        String alias = generateNameByRandomChar(11);
        return new Animal(age, alias);
    }

    private Animal createRandomRus() {
        int age = generateAge();
        String alias = generateNameByRusChar(11);
        return new Animal(age, alias);
    }

    private Animal createRandomTrueName() {
        int age = generateAge();
        String alias = generateTrueName();
        return new Animal(age, alias);
    }

    private Animal createRandomTrueNameFromFile() {
        int age = generateAge();
        String alias = generateFromFile(pathAliasFile);
        return new Animal(age, alias);
    }

    private String generateTrueName() {
        return Alias.getRandomAlias();
    }

    private int generateAge() {
        return 1 + random.nextInt(14);
    }
}
