package prob2b;

import java.util.List;
import java.util.UUID;

public class OrderLine {
    private String name;
    private double price;

    OrderLine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Order newOrder(String productName, double productPrice) {
        OrderLine line = new OrderLine(productName, productPrice);
        return new Order(UUID.randomUUID(), List.of(line));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
