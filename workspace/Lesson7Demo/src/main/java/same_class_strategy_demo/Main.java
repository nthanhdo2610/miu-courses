package same_class_strategy_demo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Joe");
        Person person1 = new Person("Joe");
        Student student = new Student("Joe", 1234);
        Student student1 = new Student("Joe", 1234);
        System.out.println(person.equals(student));
        System.out.println(student.equals(student1));
        System.out.println(student.equals(person));
    }
}
