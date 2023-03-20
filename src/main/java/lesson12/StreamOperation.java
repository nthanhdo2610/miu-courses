package lesson12;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperation {

    public static Function<List<String>, List<String>> fn = (list) -> list.stream().map(String::toUpperCase).collect(Collectors.toList());

    public static void main(String[] args) {
        System.out.println(StreamOperation.fn.apply(List.of("a", "b", "c")));
    }
}
