package hash_code_override_demo;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Tom");
        Employee employee1 = new Employee(1, "Tom");
        System.out.println(employee1.equals(employee));
        System.out.println(employee.hashCode() + ", "+ employee);
        System.out.println(employee1.hashCode() + ", "+ employee1);
    }
}
