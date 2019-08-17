package co.pragra.list;

import java.util.Objects;

public class Employee {
    private int empId;
    private String name;
    private double hourlyRate;


    public Employee(int empId, String name, double hourlyRate) {
        this.empId = empId;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public double getSalary() {
        return hourlyRate*21*8;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId() &&
                Double.compare(employee.hourlyRate, hourlyRate) == 0 &&
                Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getName(), hourlyRate);
    }
}
