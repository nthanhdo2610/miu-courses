package practices.prob7;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args){

    }


    //7.	Change the given imperative coding to functional programing.
    public double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }

    ToDoubleFunction<List<Employee>> calculateAverage = (list)-> list.stream()
            .map(Employee::getSalary)
            .mapToInt(Integer::intValue)
            .summaryStatistics()
            .getAverage();
}
