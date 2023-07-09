package finalExamination.extraClasses;

import finalExamination.dto.Pizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PizzaMakerFromFile {
    public static final String path = "homework/src/finalExamination/source/pizzas.txt";

    public static List<Pizza> getPizzas(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            String[] strings;
            List<Pizza> pizzas = new ArrayList<>();

            String title;
            String description;
            String[] ingredients;


            while ((line = reader.readLine()) != null) {
                strings = line.split(":");
                title = strings[0].trim();
                description = strings[1].trim();
                ingredients = strings[2].trim().split(",");

                pizzas.add(new Pizza(title
                        , description, ingredients));
            }

            return pizzas;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
