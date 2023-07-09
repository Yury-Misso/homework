package finalExamination.api;

import finalExamination.dto.Menu;
import finalExamination.dto.Order;
import finalExamination.dto.Receipt;

public interface IPizzeria {
    Menu getMenu();

    String getIformation(Receipt receipt);

    Order getOrder(Receipt receipt);

    Receipt addOrder(Order order);

}
