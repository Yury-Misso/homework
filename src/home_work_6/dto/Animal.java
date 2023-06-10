package home_work_6.dto;

public class Animal {
    private int age;
    private String alias;

    public Animal(int age, String alias) {
        this.age = age;
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "age: " + age + ", nick: " + alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return alias.equals(animal.alias);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + alias.hashCode();
        return result;
    }
}
