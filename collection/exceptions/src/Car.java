import java.util.Objects;

public class Car {

    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public static void printMe(){
        System.out.println("Printed");
    }

    public void speed(){
        System.out.println("Speed");
    }
    public void stop(){
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
