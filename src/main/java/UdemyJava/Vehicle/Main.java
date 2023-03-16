package UdemyJava.Vehicle;

class Car {
    private String name;
    private int cylinder;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine(){
        return "car -> startEngine()";

    }
    public String accelerate(){
        return "car -> accelerate()";

    }
    public String brake(){
        return "car -> brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car",8);

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Outlander VRW 4WD",6);

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
