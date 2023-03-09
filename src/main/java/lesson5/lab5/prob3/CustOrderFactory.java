package lesson5.lab5.prob3;

import java.time.LocalDate;

final public class CustOrderFactory {

    public CustOrderFactory() {
    }

    public static Customer creteNewCustomer(String custName) {
        return new Customer(custName);
    }

    public static Order creteNewOrder(Customer cust, LocalDate orderDate) {
        if (cust == null) {
            throw new RuntimeException("Invalid Customer!");
        }
        return Order.newOrder(cust, orderDate);
    }

}
