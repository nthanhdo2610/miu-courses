package lesson7.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(MyClass.INSTANCE);
		
	}
	
	public static String toUpper(String s) {
		return s.toUpperCase();
	}
	
	//implement a Consumer
	enum MyClass implements Consumer<String>{

		INSTANCE;

		@Override
		public void accept(String s) {
			System.out.println(toUpper(s));
		}

	}
	
}