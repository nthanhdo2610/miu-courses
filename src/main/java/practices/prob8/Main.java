package practices.prob8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        List<Integer> lst = primes(4).collect(Collectors.toList());

        assertEquals(List.of(1, 2, 3, 5), lst);
        assertArrayEquals(List.of(1, 2, 3, 5).toArray(), lst.toArray());
        assert(lst.size()>5);
        System.out.println(lst);
    }

    static Stream<Integer> primes(int k) {
        return Stream.iterate(1, i -> i + 1).filter(i -> isPrime(i)).limit(k);
    }

    static boolean isPrime(int num) {
        int candidate = (int) Math.sqrt(num);
        return IntStream.rangeClosed(2, candidate)
                .noneMatch(i -> num % i == 0);
    }
}
