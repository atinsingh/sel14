package co.pragra.selboot;

import com.google.common.collect.Queues;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DummySelApp {
    public static void main(String ...args) {
        // write me solution which takes a employee id as input and give me
        // employee details
        // 10
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(100001, "Arjun",50000));
//        employees.add(new Employee(100301, "Enobong",70000));
//        employees.add(new Employee(100003, "Shobna",60000));
//        employees.add(new Employee(100011, "Puja",80000));
//        employees.add(new Employee(100034, "Archana",50000));
//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        while (i!=0){
//            System.out.printf("Please Key in Employee Number");
//            i = Integer.parseInt(scanner.nextLine());
//            if(i==0){
//                break;
//            }else {
//                for (Employee employee:  employees){
//                    if(i==employee.getEmployeeId()){
//                        System.out.println(employee);
//                    }
//                }
//            }
//        }


         Map<Integer, Employee> map = new HashMap<>();
         map.put(10001,new Employee(10001,"Arjun",93093));
         map.put(10011,new Employee(10011,"XXUS",29833));
         map.put(10021,new Employee(10021,"John",983898));
         map.put(10031,new Employee(10031,"Jean",897847));
         map.put(10053,new Employee(10053,"Mike",33322));
         map.putIfAbsent(10053,new Employee(10054,"Andre",3932));

         map.forEach((k,v)-> System.out.println(k+""+v));




        System.out.println(map.getOrDefault(100053, new Employee(0,"Dumy",0)));




    }



}
class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}