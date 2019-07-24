public class Employee extends Person {

    private int empId;
    private double hourlyRate;
    private final String empType = "CONTRACTOR";

    public Employee(String name, int empId, double hourlyRate) {

        super(name);
        this.empId = empId;
        this.hourlyRate = hourlyRate;
    }

    public double getSalary(){
        return hourlyRate*21*8;
    }

    private void printSecret(){
        System.out.println();
    }

    public void likeMe(int likes){
        System.out.println("No one likes employees");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("ID -->"+ empId);
        System.out.println("Rate -->"+ hourlyRate);
    }
}
