package practices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main<T> {

    public static void reverse(List<?> list) {
        reversedList(list);
    }
    static <T> void reversedList(List<T> list){
        List<Object> tmp = new ArrayList<Object>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (T) tmp.get(list.size()-i-1));
        }

    }

    public static <T> T[] fun(T t) {
        T[] data = null;
        data = (T[]) Array.newInstance(t.getClass(), 5);
        return data;
    }

    public static <T> T[] toArray(Collection<T> coll) {
        T[] arr = (T[]) new Object[coll.size()]; //compiler error
        int k = 0;
        for(T element : coll)
            arr[k++] = element;
        return arr;
    }
    public static void main(String[] args) {



//        List<Integer> ints = new ArrayList<Integer>();
//        ints.add(1);
//        ints.add(2);
////assuming covariance, this step would be allowed
//        List<Number> nums = ints;
//        nums.add(3.14);
//        System.out.print(ints); //output:		[1,	2,	3.14]	– not	desirable

        IntSummaryStatistics intSummaryStatistics = Stream.of("Edgar", "Kai", "Gin", "Eugene").collect(Collectors.summarizingInt(String::length));

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());

        System.out.println(
                Stream.of("Edgar  ", "Kai ", "Gin", "Eugene")
                        .map(String::trim)
                        .collect(Collectors.joining(", "))
        );

        System.out.println(
                LongStream.of(1,2,3,4,5,6)
                        .summaryStatistics()
                        .getMax()
        );

        System.out.println(
                Stream.of("Edgar  ", "Kai ", "Gin", "Eugene")
                        .sorted(Comparator.comparing(String::length).thenComparing(String::trim))
                        .collect(Collectors.toList())
        );

        System.out.println(
                Stream.of("Edgar", "Kai", "Gin", "Eugene")
                        .sorted(Comparator.comparing(String::length).reversed())
                        .collect(Collectors.toList())
        );
        System.out.println(
                Stream.of("Edgar", "Kai", "Gin", "Eugene")
                        .sorted(Comparator.comparing(String::length))
                        .collect(Collectors.toList())
        );

        String[] arr = Stream.of("asd","qwe","zxc","123").toArray(String[]::new);
        System.out.println(Arrays.toString(arr));


        System.out.println(
                Stream.of(1,2,3,4,5)
                        .map(int[]::new)
                        .map(Arrays::toString)
                        .collect(Collectors.toList())
        );

        System.out.println(
                Stream.iterate(1,x-> x<10, x-> x+2).limit(10).collect(Collectors.toList())
        );

        System.out.println(
                Stream.of(1,2,3,4,5).skip(2).collect(Collectors.toList())
        );

        System.out.println(
                Stream.concat(characterStream("Edgar"), characterStream(" Nguyen")).collect(Collectors.toList())
        );
    }

    static Stream<Character> characterStream(String s){
       return s.chars().mapToObj(letter->(char)letter);
//        List<Character> lst = new ArrayList<>();
//        char[] chars = s.toCharArray();
//        for (char aChar : chars) {
//            lst.add(aChar);
//        }
//        return lst.stream();
    }
}
