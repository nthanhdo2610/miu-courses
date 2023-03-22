package practices.prob3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

// For this problem the objective is to generalize the createMap method as much as possible.
// You will want to generalize from Employee and String in the createMap method shown above to more general types.
public class Q3 {
    public static  <T extends Employee> Map<String,T> createMap(List<T> list, Function<T, String> f) {
        HashMap<String, T> h = new HashMap<>();
        for (T s: list){
            h.put(f.apply(s), s);
        }
        return h;
    }

    public static  <T extends Employee> Map<String, T> empListToMap(List<T> emps) {
        return createMap(emps, T::getName);
    }

    public static void main(String[] args) {
//        Employee names to Employee objects:
        List<Employee> list = Arrays.asList(new Employee("Joe", 50000),new Employee( "Jim", 60000));
        Map<String, Employee> map = empListToMap(list);
        System.out.println(map.get("Joe"));
        System.out.println(map.get("Jim"));
    }
}
