package com.example.application;
import com.example.application.config.ApplicationConfig;


public class Main {
    static String type = "Fun";
    public static void main(String[] args) {
        System.out.println(Person.name);

        Person p1 = new Person();
        p1.getDetails("Person1");

        System.out.println(Person.name);
        Person p2 = new Person();

        p2.getDetails("Person2");

        System.out.println(Person.name);
        Main.fun();

    }

    public static void fun(){
        System.out.println("Having fun");
    }
}
