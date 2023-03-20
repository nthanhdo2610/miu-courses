package lesson9.labs.prob11b;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {
    public static final Consumer<Stream<Employee>> prob11bSolution = (emps) ->
            System.out.println(emps
                    .filter(e-> e.getSalary() > 100000)
                    .filter(e-> e.getLastName().toUpperCase().matches("^[N-Z].*$"))
                    .sorted(Comparator.comparing(Employee::getLastName))
                    .map(e->e.getFirstName() + " " + e.getLastName())
                    .collect(Collectors.joining(", ")));
}
