public class Test {
    public static void main(String[] args) {
        Shape firstShape = new Shape(11.0,13.9);

        firstShape.printType();
        firstShape.setHeight(-13.9);

        firstShape.printType();


        Employee emp1  = new Employee(1, "Amit", 50);
        emp1.printDetails();


        Employee emp2 = new Employee(2,"Mahek",35);
        emp2.printDetails();

        emp2.changeHourlyRate(45);

        emp2.printDetails();


    }
}
