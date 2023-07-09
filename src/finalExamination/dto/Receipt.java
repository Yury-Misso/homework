package finalExamination.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
    private final int numbre;
    private final Date date;
    private final Order order;

    public Receipt(int numbre, Order order) {
        this.numbre = numbre;
        this.order = order;
        this.date = new Date();
    }

    public Order getOrder() {
        return this.order;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("HH:mm:ss");
        return "Заказ номер " + numbre +
                "\n принят в " + simpleDateFormat.format(date);
    }
}
