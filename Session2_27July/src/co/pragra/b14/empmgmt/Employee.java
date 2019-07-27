package co.pragra.b14.empmgmt;

public class Employee implements IEmployee {
    private int id;
    private String name;
    private double hourlyRate;

    public Employee(int id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return this.hourlyRate*21*8;
    }

    @Override
    public void printDetail() {
        System.out.println(String.format("Employee name=%s, salary=%f , id=%d", name,getSalary(),id));
    }
}
