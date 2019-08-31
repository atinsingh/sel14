import javax.lang.model.element.NestingKind;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // Map
        // where you association
        // List you can use value // Atin
        // 1 ==> Atin  // "A" ==> "Atin"
                         //'V' ==> "Vivek"
        // 2==> Vivek
        //  "Atin" ==> new Person

       Map<String, String> nameMap = new Hashtable<>();
       nameMap.put("atin", "Python");
       nameMap.put("vivek", "Java");
       nameMap.put("vivek", "C++");
       System.out.println(nameMap.get("atin"));

       Map<String, Person> map = new HashMap<>();
       map.put("TC1", new Person("Atin", 39));
       map.put("TC2", new Person("Rahul", 40));

        System.out.println(map.get("TC1").getName());
    }
}
