package hash_code_override_demo;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return employee.id == this.id && employee.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        System.out.println("calling");
        return Objects.hash(id, name);
    }
}
