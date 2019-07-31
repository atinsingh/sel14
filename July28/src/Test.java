import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Test {
    private int counter ;

    public static void main(String[] args) {

        String str =  "I love java programming , its a fun";
        int index = str.indexOf("a", 12);
        System.out.println(index);
        String st2 =  str.substring(11, 16);
        System.out.println(st2);
        if(str.contains("java")) {
            System.out.println("Found hurray");
        }

        String st3 = "Atin";
        String st4  = "atin";
        int comparision = st3.compareToIgnoreCase(st4);
        System.out.println(comparision);

        String st5 =  "ATIN,VIVEK,XYZ,ABC";
        String[] split = st5.split(",");
        for (int i = 0; i< split.length ; i++) {
            System.out.println(split[i]);
        }

        StringBuffer st6 = new StringBuffer("Java");
        st6.append(" Programming");
        System.out.println(st6);



        String st7 = String.format("Dear %s, Your account %010d, your payment of $%03.2f is due on.", "Java", 123456, 30.1);
        System.out.println(st7);


    }
}