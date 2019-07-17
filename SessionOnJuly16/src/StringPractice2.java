import java.util.Locale;

public class StringPractice2 {

    public static void main(String[] args) {
        String str = "Atin"; // Direct
        str  = " AYZ";
        String str2  = new String("Atin"); // Constructor
        byte [] bytes = {100,101,100,102};
        String str3  = new String(bytes); // from Binary Data
        char [] chars = {'a','t','i','n'};
        String str4 = new String(chars); // Direct from chars

        float size = 2;
        String st5 = String.valueOf(size);
        int account = 1234;
        String name = "Vivek Kumar Funny Man";
        double balance = 20.123449483;

        // %s == string
        // %d == integers
        // %f == floating
        // %c  = chars

        String st8 =  String.format(Locale.FRANCE,"Dear %10s, Your account %010d has bill of $ %4.2f.\nPlease pay. Thank you",name,account,balance);

        System.out.println(st8);

        // String is immutable ..

        StringBuffer st11 =  new StringBuffer("Java Class");
        String st12 = st11.substring(2);
        st11.append(" July 16");


        System.out.println(st12);
        System.out.println(st11);

        StringBuilder st15  = new StringBuilder("Atin");
        st15.insert(st15.length(), "Singh");

        System.out.println(st15);

        // StringUtils Apache with maven


    }
}
