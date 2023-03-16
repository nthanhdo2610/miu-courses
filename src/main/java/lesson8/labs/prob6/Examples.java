package lesson8.labs.prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Examples {


    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    Function<Employee, String> fnA1 = (Employee e) -> e.getName();
    Function<Employee, String> fnA2 = Employee::getName;

    BiConsumer<Employee, String> fnB1 = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> fnB2 = Employee::setName;

    BiFunction<String, String, Integer> fnC1 = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> fnC2 = String::compareTo;

    BiFunction<Integer, Integer, Double> fnD1 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> fnD2 = Math::pow;

    Function<Apple, Double> fnE1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> fnE2 = Apple::getWeight;

    Function<String, Integer> fnF1 = (String x) -> Integer.parseInt(x);
    Function<String, Integer> fnF2 = Integer::parseInt;

    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> fnG1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> fnG2 = comp::compare;

    public void evaluator() {
        System.out.println(upper2.apply("hello"));

        Employee edgar = new Employee("Edgar", 15000);
        System.out.println("fnA2 " + fnA2.apply(edgar));
        fnB2.accept(edgar, "Edgar Nguyen");
        System.out.println("fnB2 " + edgar);

        System.out.println("fnC2 " + fnC2.apply("Edgar", "Nguyen"));
        System.out.println("fnD2 " + fnD2.apply(10, 5));
        System.out.println("fnE2 " + fnE2.apply(new Apple()));
        System.out.println("fnF2 " + fnF2.apply("15000"));
        System.out.println("fnG2 " + fnG2.apply(new Employee("Edgar", 10000), new Employee("Nguyen", 5000)));
    }

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();

    }

    static class Apple {
        double getWeight() {
            return Math.random();
        }
    }
}