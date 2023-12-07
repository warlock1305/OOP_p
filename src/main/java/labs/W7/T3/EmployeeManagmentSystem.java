package labs.W7.T3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagmentSystem {

    public List<Employee> filterEmployeesBySalary(List<Employee> list, double min){
        List<Employee> result = new ArrayList<>();
        return list.stream()
                .filter(emp -> emp.salary() >= min)
                .collect(Collectors.toList());
        //.reduce((a) -> {if(a.salary() >= min) result.add(a); return a;});

    }

    public double calculateTotalSalary(List<Employee> list){
        return list.stream()
                .mapToDouble(emp -> emp.salary())
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> list){
        for(Employee emp:list){
            System.out.println(emp.to_String());
        }
    }
}
