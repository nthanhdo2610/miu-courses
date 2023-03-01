package lab2.prob2b;

import java.util.List;
import java.util.UUID;

public class OrderLine {
    private String name;
    private double price;
    private Order order;

    OrderLine(String name, double price, Order order) {
        if(order == null){
            throw new RuntimeException("Invalid Order!");
        }
        this.name = name;
        this.price = price;
        this.order = order;
    }

    public static Order newOrder(String productName, double productPrice) {
        Order order = new Order(UUID.randomUUID());
        OrderLine line = new OrderLine(productName, productPrice, order);
        order.setLines(List.of(line));
        return order;
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

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
