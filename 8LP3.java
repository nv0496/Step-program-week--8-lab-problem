// Abstract class Vehicle
abstract class Vehicle {
    protected int speed;
    protected String fuelType;

    // Constructor
    public Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Abstract method
    abstract void startEngine();
}

// Interface Maintainable
interface Maintainable {
    void serviceInfo();
}

// Concrete class Car extending Vehicle and implementing Maintainable
class Car extends Vehicle implements Maintainable {
    private String brand;
    private String model;

    // Constructor
    public Car(int speed, String fuelType, String brand, String model) {
        super(speed, fuelType);
        this.brand = brand;
        this.model = model;
    }

    // Implement abstract method from Vehicle
    @Override
    void startEngine() {
        System.out.println("The " + brand + " " + model + " engine starts with a smooth ignition sound!");
    }

    // Implement interface method from Maintainable
    @Override
    public void serviceInfo() {
        System.out.println("Service Info: Recommended every 6 months or 10,000 km.");
    }

    // Additional method to show vehicle details
    public void showDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car car = new Car(180, "Petrol", "Toyota", "Camry");
        car.showDetails();
        car.startEngine();
        car.serviceInfo();
    }
}
