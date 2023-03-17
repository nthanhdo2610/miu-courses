package lesson9.labs.prob4;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    static class PrimeStream {
//        final Stream<Integer> primes = Stream.iterate(1, this::nextPrime);
        private final Supplier<Stream<Integer>> iterate = () -> Stream.iterate(1, this::nextPrime);

        void printFirstNPrimes(long n) {
            iterate.get().limit(n).forEach(System.out::println);
        }

        int nextPrime(int previous) {
            int prime = previous + 1;
            while (!isPrime(prime)) {
                prime++;
            }
            return prime;
        }

        boolean isPrime(int number) {
            if (number == 1 || number == 2) {
                return true;
            }
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
