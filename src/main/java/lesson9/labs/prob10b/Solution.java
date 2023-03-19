package lesson9.labs.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
//        System.out.println(stringStream.reduce((s1, s2) -> s1 + ", " + s2).orElse(""));
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
