package practices.prob8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(primes(4).collect(Collectors.toList()));
    }

    static Stream<Integer> primes(int k){
        return Stream.iterate(1, i-> i+1).filter(i-> isPrime(i)).limit(k);
    }

    static boolean isPrime(int num){
        int candidate = (int) Math.sqrt(num);
        return IntStream.rangeClosed(2, candidate)
                .noneMatch(i-> num%i==0);
    }
}
