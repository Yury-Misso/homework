package home_work_6.dto;

import home_work_6.classes.Names;

import java.io.*;
import java.util.*;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "nick: " + nick + ", name: " + name + ", password: " + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!nick.equals(person.nick)) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = nick.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
