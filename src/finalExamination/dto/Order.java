package finalExamination.dto;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Pizza> pizzaList;

    public Order() {
        this.pizzaList = new ArrayList<>();
    }

    public void addPizzaToOrder(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public List<Pizza> getPizzaList() {
        return this.pizzaList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Состав заказа:\n");
        for (int i = 0; i < pizzaList.size(); i++) {
            stringBuilder.append(pizzaList.get(i));
            if (i != (pizzaList.size()) - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
