package lesson4.lab4c;

public class Salaried extends Employee {
    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return salary;
    }
}
