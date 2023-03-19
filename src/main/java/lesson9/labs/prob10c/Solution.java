package lesson9.labs.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        IntStream myIntStream = IntStream.of(1,4,9,0,3,5);
        IntSummaryStatistics intSummaryStatistics = myIntStream.summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
    }
}
