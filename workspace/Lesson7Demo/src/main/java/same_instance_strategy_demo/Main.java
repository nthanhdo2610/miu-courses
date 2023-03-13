package same_instance_strategy_demo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Joe");
        Student student = new Student("Joe", 1234);
        System.out.println(person.equals(student));
        System.out.println(student.equals(person));
    }
}
