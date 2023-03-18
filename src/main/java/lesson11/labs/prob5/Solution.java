package lesson11.labs.prob5;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(secondSmallest(List.of(3.6, 5.0, 1.0, 2.0, 3.11, 4.0, -5.0)));
    }

    public static <T extends Number> T secondSmallest(List<T> list) {
        if(list.isEmpty() || list.size() < 2){
            return null;
        }
        return list.stream().sorted().collect(Collectors.toList()).get(1);
    }
}
