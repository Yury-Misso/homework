package finalExamination.dto;

import finalExamination.extraClasses.PizzaMakerFromFile;

import java.io.File;
import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;

    public Menu() {
        pizzas = PizzaMakerFromFile.getPizzas(new File(PizzaMakerFromFile.path));
    }

    public List<Pizza> getListPizzas() {
        return this.pizzas;
    }
}
