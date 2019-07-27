package co.pragra.b14;

public class Asian implements IHuman{
    @Override
    public void eat() {
        System.out.println("Eating Noodles");
    }

    @Override
    public void speak() {
        System.out.println("Speaking Asian");
    }
}
