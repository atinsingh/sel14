package co.pragra.b14.empmgmt;

public class Manager implements IEmployee {
    private int id;
    private String name;
    private double hourlyRate;

    public Manager(int id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hourlyRate*21*8+ hourlyRate*21*8*10/100;
    }

    @Override
    public void printDetail() {
        System.out.println(String.format("Manager  id=%d , name = %s, salary=%f",id,name,getSalary()));
    }
}
