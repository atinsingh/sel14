package co.pragra.app;

public class Calculator{

    static class A {
        int i = 10;
    }
    static class B extends A {
        int i = 20;
    }

    public static void main(String[] args) {
        A ob = new B();
        System.out.println( ob.i);
    }
}