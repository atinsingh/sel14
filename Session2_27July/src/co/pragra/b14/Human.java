package co.pragra.b14;

public abstract class Human {
    public void walk() {
        System.out.println("Walking");
    }
    public void run(){
        System.out.println("Running");
    }

    public abstract void speak();
    public abstract void eat();
}
