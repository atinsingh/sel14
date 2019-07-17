public class Test {
    public static void main(String[] args) {
//        Shape firstShape = new Shape(11.0,13.9);
//
//        firstShape.printType();
//        firstShape.setHeight(-13.9);
//
//        firstShape.printType();
//
//
//        Employee emp1  = new Employee(1, "Amit", 50);
//        emp1.printDetails();
//
//
  //      Employee emp2 = new Employee(2,"Mahek",35);

//        emp2.printDetails();
//
//        emp2.changeHourlyRate(45);
//
//        emp2.printDetails();




        String name  = "I am very thankful for java";
        String name2  =  new String("Java");
        System.out.println(name.length());

        if(name.equals(name2)) {
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }

        if(name.contains("thankful")) {
            System.out.println("All good");
        }

        String str = "industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing";

        int count =  0;
        while(str.indexOf("a")>=0) {
            count++;
            str  = str.substring(str.indexOf("a")+1);
        }

        System.out.println(count);

       String st1 =  "atin";
       String st2 = "Atin";
        System.out.println(st1.compareTo(st2));

        byte [] arr = {100, 101, 102,103,105,106};

        String st3 = new String(arr);
        System.out.println(st3);

        st2 = "  ";
        if(st2.trim().isEmpty()) {
            System.out.println("EMPTY");
        }

        st2 = "Hello All";
        String st7 = st2.replace("Hello", "Hola");
        System.out.println(st2);
        System.out.println(st7);

        st2 = "Atin Ajay Vivek";
        String[] names = st2.split("");

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }


    }
}
