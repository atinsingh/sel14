import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
      List<Car> carList = new ArrayList<>();



      carList.add( new Car("Audi"));
      //

      carList.add( new Car("Audi"));


      System.out.println(carList);
      Set<Car> carSet = new HashSet<>();

      carSet.addAll(carList);

      System.out.println(carSet);
    }
}
