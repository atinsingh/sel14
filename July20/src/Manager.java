public class Manager extends Employee {

    public Manager(String name, int empId, double hourlyRate) {
        super(name, empId, hourlyRate);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println(" I am manager , please listen to me");
    }
}
