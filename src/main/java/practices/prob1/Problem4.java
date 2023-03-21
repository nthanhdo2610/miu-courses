package practices.prob1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem4 {
	//IMPLEMENT - you must use the reduce operation on Streams
	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {
//		return stream.collect(ArrayList::new, List::addAll, List::addAll);
		return stream.reduce(new ArrayList<>(), (l1, l2)-> new ArrayList<>(Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList())));
	}
	
	public static void testCombine() {
		ArrayList<ArrayList<String>> mainList = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("hello");add("there");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("goodbye");add("there");
			}
		};
		mainList.add(list1);
		mainList.add(list2);
		System.out.println(combine(mainList.stream()));
	}
	public static void main(String[] args) {
		testCombine();
	}
}
