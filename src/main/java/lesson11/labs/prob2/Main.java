package lesson11.labs.prob2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group<Integer> group = new Group<>(0, List.of(-2, -1, 0, 1, 2));
        System.out.println(copyHelper(group));
    }

    public static <T> Group<T> copyHelper(Group<T> group) {
        List<T> elements = group.getElements();
        return new Group<>(group.getSpecialElement(), elements);
    }
}
