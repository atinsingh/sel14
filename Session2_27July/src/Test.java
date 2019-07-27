import co.pragra.b14.*;
import co.pragra.b14.co.pragra.b14.db.DataBaseManager;
import co.pragra.b14.empmgmt.EmployManager;
import co.pragra.b14.empmgmt.Employee;
import co.pragra.b14.empmgmt.IEmployee;
import co.pragra.b14.empmgmt.Manager;

public class Test {
    private static int conunter = 0;
    private int instanceCount = 0;

    public static void main(String[] args) {
        IEmployee employee = new Employee(1, "Atin", 40);
        IEmployee employee1 = new Manager(2, "Vivek", 50);
        EmployManager.getEmployeeDetails(employee);
        EmployManager.getEmployeeDetails(employee1);

    }

    public void incrementCounters(){
        this.instanceCount++;
        Test.conunter++;
    }

    public void printCounter(){
        System.out.println("Static" + conunter);
        System.out.println("NOn Static" + instanceCount);
    }


}