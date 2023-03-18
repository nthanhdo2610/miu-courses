package lesson9.labs.prob9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        printSquares(5);
    }

    public static void printSquares(int num) {
        // if num = 4, then your method would output 1, 4, 9, 16
        System.out.println(
                Stream.iterate(1,
                                i -> Math.sqrt(i) <= num,
                                i -> {
                                    int n = i + 1;
                                    while (Math.sqrt(n) % 1 != 0) {
                                        n++;
                                    }
                                    return n;
                                })
                        .collect(Collectors.toList())
        );
    }
}
