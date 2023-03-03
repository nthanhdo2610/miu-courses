package lesson5.lab5.prob2.data;

import java.util.HashMap;

public interface Data {
	static HashMap<String, Data> dataMap = new HashMap<String, Data>() {
		{
			put("Alice", new AliceData());
			put("Joe", new JoeData());
		}
		final static long serialVersionUID = 1L;
	};
	
	HashMap<String, String> getGrades();
	HashMap<String, String> getTeacherRemarks();
}
