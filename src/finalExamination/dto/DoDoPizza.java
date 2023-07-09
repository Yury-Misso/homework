package finalExamination.dto;

import finalExamination.api.IPizzeria;

import java.util.List;
import java.util.Random;

public class DoDoPizza implements IPizzeria {
    private final Menu menu;
    private Order order;

    public DoDoPizza() {
        this.menu = new Menu();
    }

    @Override
    public Menu getMenu() {
        return this.menu;
    }

    @Override
    public String getIformation(Receipt receipt) {
        List<Pizza> pizzas = receipt.getOrder().getPizzaList();
        StringBuilder stringBuilder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            stringBuilder.append(pizza.cookPizza()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Receipt addOrder(Order order) {
        this.order = order;
        return new Receipt(new Random().nextInt(100), order);
    }

    @Override
    public Order getOrder(Receipt receipt) {
        return this.order;
    }
}
