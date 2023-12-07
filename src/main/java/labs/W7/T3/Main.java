package labs.W7.T3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        EmployeeManagmentSystem system = new EmployeeManagmentSystem();

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(0, "Walter White", 3583.3));
        list.add(new Employee(1, "John Coffey", 120));
        list.add(new Employee(2, "Roland Deschain", 3500));

        System.out.println(system.filterEmployeesBySalary(list, 40000));

        System.out.println(system.calculateTotalSalary(list));

        system.displayEmployeeDetails(list);
    }
}
