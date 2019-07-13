public class Employee {

    private int empId;
    private String name;
    private double horlyRate;


    public Employee(int empId, String name, double horlyRate) {
        this.empId = empId;
        this.name = name;
        this.horlyRate = horlyRate;
    }


    public double calculateNReturnSalary(){
        return this.horlyRate*21*8;
    }

    public void changeHourlyRate(double horlyRate){
        this.horlyRate = horlyRate;
    }

    public void printDetails() {
        System.out.println("Employee Id "+  this.empId);
        System.out.println("Employee Name "+  this.name);
        System.out.println("Employee hourlyRate "+  this.horlyRate);
        System.out.println("Employee salary "+  this.calculateNReturnSalary());
    }
}
