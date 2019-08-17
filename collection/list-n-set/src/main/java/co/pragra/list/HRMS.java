package co.pragra.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HRMS {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp = new Employee(10, "Xzy",50);
        employees.add(new Employee(1,"Atin",24));
        employees.add(new Employee(2,"Vivek",30));
        employees.add(new Employee(3,"Pratima",50));
        employees.add(new Employee(4,"JayShree",34));
        employees.add(emp);

        if(employees.remove(new Employee(1,"Atin",24))){
            System.out.println("Exists");
        }else {
            System.out.println("Not Found");
        }

        System.out.println(employees);

        employees.sort(new EmployeeComprator());
        System.out.println(employees);
    }
}
