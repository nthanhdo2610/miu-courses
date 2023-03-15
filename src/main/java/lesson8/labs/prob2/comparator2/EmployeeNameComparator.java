package lesson8.labs.prob2.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.trim().toUpperCase().compareTo(e2.name.trim().toUpperCase());
	}
}
