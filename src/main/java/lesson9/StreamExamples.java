package lesson9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        exam14();
    }

    static void exam14() {
        Map<Integer, String> map = Arrays.asList(null, "one", "twos", "threes")
                .stream()
                .map(Optional::ofNullable)
                .flatMap(Optional::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toMap(String::length, s -> s));
        System.out.println(map);
    }

    static void exam13() {

        IntStream intStream = IntStream.of(1, 2, 3, 4);
        IntSummaryStatistics intSummaryStatistics = intStream.boxed()
                .collect(Collectors.summarizingInt((data) -> data * 2));
        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
    }

    static void exam12() {
        int a = 10;
        //manual
//        Integer integer = new Integer(a);
        //auto boxing
        Integer integer1 = a;

        //manual unboxing
        System.out.println(integer1.intValue());
        //auto unboxing
        System.out.println(integer1 + 10);
    }

    static void exam11() {
        Stream<String> stringStream = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        Optional<String> s = stringStream.reduce((s1, s2) -> String.format("%s %s", s1, s2));
        System.out.println(s.get());
    }

    static void exam10() {
        //Optional
        Optional<Integer> integer = Optional.empty();
        System.out.println(integer.isPresent());
        System.out.println(integer.isEmpty());
        Optional<Integer> optionalInteger = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .findAny();
//        if(optionalInteger.isPresent()){
//            System.out.println(optionalInteger.get());
//        }
        System.out.println(optionalInteger.orElseGet(StreamExamples::myFun));
    }

    static int myFun() {
        System.out.println("myFun!!!");
        return 0;
    }

    static void exam9() {
        List<Integer> integers = List.of(3, 5, 2, 3, 8);
        List<int[]> ints = integers.stream().map(int[]::new).collect(Collectors.toList());
        List<String> stringList = ints.stream().map(Arrays::toString).collect(Collectors.toList());
        System.out.println(stringList);
    }

    static void exam8() {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango");
        Stream<String> stream = fruits.stream();
        String[] s = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(s));
    }

    static void exam7() {
        List<Employee> employees = List.of(
                new Employee("Tim", 5000),
                new Employee("Joe", 5000),
                new Employee("Joe", 6000),
                new Employee("Donald", 4000),
                new Employee("Mickey", 5500)
        );
        employees.stream()
                .sorted(
                        Comparator
                                .comparing(Employee::getName)
                                .reversed()
                                .thenComparing(Employee::getSalary)
                                .reversed()
                )
                .forEach(System.out::println);

        int total = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        int min = employees.stream()
                .mapToInt(Employee::getSalary)
                .min().orElse(0);
        int max = employees.stream()
                .mapToInt(Employee::getSalary)
                .max()
                .orElse(0);
        double average = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);

    }

    static void exam6() {
        Stream.of(11, 4, 3, 6, 8, 2)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

    static void exam5() {
        List<String> names = List.of("Tom", "Jerry", "Jenny", "Jimmy", "Edgar");
        names.stream()
                .filter(s -> s.startsWith("J"))
                .filter(s -> s.length() > 3)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    static void exam1() {
        Stream<Integer> integerStream = Stream.of(2, 3, 4, 5, 6, 7, 8);
        Stream<String> stringStream = Stream.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        Stream<String> stringStream1 = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday").stream();
        Stream<int[]> integerStream1 = Stream.of(new int[]{2, 3, 4, 5, 6, 7, 8});

        System.out.println(integerStream.count());

        /**
         * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
         * 	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
         * 	at java.base/java.util.stream.ReferencePipeline.count(ReferencePipeline.java:709)
         */
        System.out.println(integerStream.count());
        System.out.println(integerStream1.count());
    }

    static void exam2() {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
//        System.out.println(intStream.max());
//        System.out.println(intStream.count());
//        System.out.println(intStream.sum());
        intStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{1, 2, 3, 4, 5, 6, 7, 8});
//        System.out.println(intStream.max());
//        System.out.println(intStream.count());
//        System.out.println(intStream.sum());
        doubleStream.forEach(System.out::println);
    }

    static void exam3() {
//        Stream.generate(Math::random)
//                .limit(5)
//                .forEach(System.out::println);

        List<Integer> integers = Stream
                .iterate(10, (i) -> i + i)
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(integers);

        List<Integer> integers1 = Stream
                .iterate(10, i -> i < 100, i -> i + i)
                .collect(Collectors.toList());
        System.out.println(integers1);

    }

    static void exam4() {
        Stream<Character> characterStream = "Welcome".chars().mapToObj(letter -> (char) letter);
        IntStream intStream = " to MPP".chars();
        Stream<Character> characterStream1 = intStream.mapToObj(letter -> (char) letter);
        Stream.concat(characterStream, characterStream1)
                .forEach(System.out::println);

    }

    static class Employee {
        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
