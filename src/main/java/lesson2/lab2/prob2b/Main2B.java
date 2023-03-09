package lesson2.lab2.prob2b;

public class Main2B {

    public static void main(String[] args) {
        Order order = OrderLine.newOrder("Sandwich", 5.00);
        order.addLine("Coffee", 3.00);
        order.addLine("Milk", 4.00);
        order.addLine("Tea", 2.00);
        System.out.println(order);
    }
}
