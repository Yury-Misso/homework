package finalExamination;

import finalExamination.api.IPizzeria;
import finalExamination.dto.DoDoPizza;
import finalExamination.dto.Order;
import finalExamination.dto.Pizza;
import finalExamination.dto.Receipt;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        IPizzeria doDoPizza = new DoDoPizza();
        Scanner scanner = new Scanner(System.in);
        String numberOfPizzaForReceiptLine;
        String[] numberOfPizzaForReceiptStr;
        Order order;
        List<Pizza> pizzas = doDoPizza.getMenu().getListPizzas();
        int numberOfPizza;

        while (true) {
            numberOfPizza = 0;
            for (Pizza pizza : pizzas) {
                numberOfPizza++;
                System.out.println("# " + numberOfPizza + " " + pizza);
            }
            System.out.println();
            System.out.println("Выберите номер пиццы которую хотите");
            System.out.println("если несколько, то через запятую");
            numberOfPizzaForReceiptLine = scanner.nextLine();
            numberOfPizzaForReceiptStr = numberOfPizzaForReceiptLine.split("[ ,]");
            order = new Order();
            System.out.println();

            for (String s : numberOfPizzaForReceiptStr) {
                int number = Integer.parseInt(s);
                Pizza pizza = pizzas.get(number - 1);
                order.addPizzaToOrder(pizza);
            }

            Receipt receipt = doDoPizza.addOrder(order);
            System.out.println(receipt);
            System.out.println("Заказ готовится...");
            System.out.println(doDoPizza.getIformation(receipt));
            System.out.println(receipt);
            System.out.println("ГОТОВ");

            System.out.println(doDoPizza.getOrder(receipt));
            System.out.println("For exit enter 'q'");
            if (scanner.nextLine().equalsIgnoreCase("q"))
                break;
        }


    }
}
