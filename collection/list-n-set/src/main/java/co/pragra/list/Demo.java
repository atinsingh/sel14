package co.pragra.list;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> guests = new ArrayList<>();

        if(guests.isEmpty()){
            System.out.println("Guess List is empty");
        }


        guests.add("Guest1");
        guests.add("Guest2");
        guests.add("Guest4");
        guests.add("Guest5");
        guests.add("Guest6");

        System.out.println(guests);

        for(int i =0 ; i < 1000000; i++) {
            guests.add("Guest"+i);
        }

        System.out.println("Now size of list is "+ guests.size());
        System.out.println(guests.get(72342));

        System.out.println(guests.contains("Mehak"));
        guests.clear();

        guests.add("Vivek");
        guests.add("Abc");
        guests.add("Pratima");
        guests.add("Mehak");
        guests.add("Vivek");
        guests.add("JayShree");
        guests.add("Vivek");
        System.out.println("Index of Object vivek" + guests.indexOf("Vivek"));
        System.out.println("Last Index of Object vivek" + guests.lastIndexOf("Vivek"));
        System.out.println("Now size of list is "+ guests.size());
        System.out.println(guests);
        guests.remove("Vivek");

        List<String> anotherList = Arrays.asList("John", "Jean", "Tom");
        System.out.println(guests);
        //guests.addAll(anotherList);
        guests.addAll(2, anotherList);
        List<String> removeList = Arrays.asList("JayShree","Vivek","Abc");
        System.out.println(guests);
        guests.removeAll(removeList);
        System.out.println(guests);

        for( String str : guests ) {
        }


        Iterator<String> iterator = guests.iterator();


        Set<String> addresses = new HashSet<>();
        addresses.add("Mississauga");
        addresses.add("Mississauga");
        addresses.add("Brampton");
        addresses.add("Ajax");;


        // Create class Employee
        // create List of Ermplouee
        // find a particalar employee and print details
        // add employee in batch
        // remove employee in batch
        // check if an employee exist in the system,

    }
}
