package lesson4.lab4c;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private float commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, float commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order o){
        orders.add(o);
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    double calcGrossPay(int month, int year) {
        double sumOrder = 0;
        for (Order o : orders) {
            if (o.getOrderDate().getMonthValue() == month
                    && o.getOrderDate().getYear() == year) {
                sumOrder += o.getOrderAmount();
            }
        }
        return baseSalary + commission * sumOrder;
    }

}
