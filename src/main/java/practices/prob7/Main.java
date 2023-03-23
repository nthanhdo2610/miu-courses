package practices.prob7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args){
        System.out.println(calculateAverage(new ArrayList<>()));
    }


    //7.	Change the given imperative coding to functional programing.
    public static double calculateAverage(List<Employee> employeeList) {

        return helperCalculateAverage.applyAsDouble(employeeList);

//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < employeeList.size(); i++) {
//            Employee employee = employeeList.get(i);
//            sum += employee.getSalary();
//            count++;
//        }
//        return (double) sum / count;
    }

    static ToDoubleFunction<List<Employee>> helperCalculateAverage = (list)-> list.stream()
            .map(Employee::getSalary)
            .mapToInt(Integer::intValue)
            .summaryStatistics()
            .getAverage();
}
