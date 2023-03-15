package lesson8.labs.prob3.lambdaexamples.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionExample {
	/* As a lambda:
	 * public static void main(String[] args) { BiFunction<Integer, Integer,
	 * Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {
		class MyBiFunction implements BiFunction<Integer, Integer, Integer> {
			public Integer apply(Integer x, Integer y) {
				return 2 * x - y;
			}
		}
		MyBiFunction f = new MyBiFunction();
		System.out.println(f.apply(2, 3)); // output 1

		/**
		 * 	Consider the following lambda expression. Can this expression be correctly typed as a BiFunction?
		 * 	(See lesson8.lecture.lambdaexamples.bifunction.)  (Hint: Yes it can.)
		 * (x,y) -> {
		 * 				List<Double> list = new ArrayList<>();
		 * 				list.add(Math.pow(x,y));
		 * 				list.add(x * y);
		 * 				return list;
		 * };
		 *
		 * Demonstrate you are right by doing the following: In the  main  method of a Java class,
		 * assign this lambda expression to an appropriate BiFunction
		 * and call the apply method with arguments (2.0, 3.0),
		 * and print the result to console.
		 */
		BiFunction<Integer, Integer, List<Double>> fn = (x,y) ->{
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add((double) (x * y));
			return list;
		} ;
		System.out.println(fn.apply(2, 3)); // output [8.0, 6.0]
	}

}
