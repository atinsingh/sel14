public class Student {

    private String name;
    private int studentId;
    private String province;
    private String country;

    public Student(String name, int studentId) {
        if(studentId <0 ) {
            this.studentId = 0;
        }else {
            this.studentId = studentId;
        }
        this.name = name;

    }

    public void printDetails() {
        String formattedString = String.format("Student  : { name : %s   , studentId: %d }", this.name, this.studentId);
        System.out.println(formattedString);
    }


    public static void printEmployeeDetails(Person person){
        person.printDetails();
    }


    public static void main(String[] args) {

//        Student [] students = new Student[4]; // only giving you memory
//
//        students[0] = new Student("A",1);
//
//        Student  st = new Student("ANC", 2);
//        int [][] arr  = new int[2][3];
//        arr [0][0] = 2;
//        arr [0][1] = 4;
//        arr [1][0] = 3;
//        arr [1][1] = 3;
//
//        for(int i = 0 ;  i < arr.length ; i++) {
//            for (int j = 0 ; j < arr[i].length ; j++) {
//               arr[i][j] = i+j;
//            }
//        }


        Employee emp  = new Employee("Atin",20,20);
       // emp.printDetails();

        emp.likeMe();

       // emp.printDetails();
        emp.likeMe(120);



        Person person =  new Employee("Vivek",1,20);

        Person person1 = new Person("Atin");

        Person p = new Manager("ABC",5,40);

        printEmployeeDetails(p);


    }
}
