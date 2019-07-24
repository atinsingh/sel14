package com.example.application;

public class Person {
    public static final String name = "ABC";

    private String address;

    public static void display(){
        System.out.println("Displaying Person ");
    }

    public void getDetails(String name){
        System.out.println(Person.name);

    }
}
