package thanhdo.nguyen.lesson2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

    private String name;
    private ShoppingCart cart;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Date orderDate){
        if(cart.getItems().isEmpty()){
            return;
        }
        Order order = new Order(cart.getItems(), orderDate);
        orders.add(order);
        this.cart= new ShoppingCart();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cart=" + cart +
                ", orders=" + orders +
                '}';
    }
}
