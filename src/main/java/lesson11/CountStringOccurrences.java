package lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CountStringOccurrences {
    public static void main(String[] args) {
//        System.out.println(countOccurrences(new String[]{"1", "2", "3", "4", "5", "1", null, null}, null));
        System.out.println(max(Arrays.asList(1,2,3,4,5, null)));
    }

    public static <T> int countOccurrences(T[] arr, T target) {
//		int count = 0;
//		if (target == null) {
//			for (T item : arr) {
//				if (item == null) {
//					count++;
//				}
//			}
//		} else {
//			for (T item : arr) {
//				if (target.equals(item)) {
//					count++;
//				}
//			}
//		}
//		return count;
        if (target == null)
            return (int) Stream.of(arr).map(Optional::ofNullable).filter(Optional::isEmpty).count();
        return (int) Stream.of(arr).map(Optional::ofNullable).filter(d -> d.isPresent() && d.get().equals(target)).count();
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty())
            return null;
        return list.stream()
                .map(Optional::ofNullable)
                .max((o1, o2) -> {
                    if (o1.isPresent() && o2.isPresent())
                        return o1.get().compareTo(o2.get());
                    return -1;
                }).get().get();
    }
}
