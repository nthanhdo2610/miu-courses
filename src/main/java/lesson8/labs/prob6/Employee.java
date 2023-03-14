package lesson8.labs.prob6;

public class Employee {
    String name;
    int salary;

    public Employee() {
    }

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    @Override
    public String toString() {
        return "<" + "name: " +
                name +
                " salary: " +
                "" + salary + ">";

    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Employee e)) return false;
        return e.name.equals(name) && e.salary == salary;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

