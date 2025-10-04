// Abstract class Fruit
abstract class Fruit {
    protected String color;
    protected String taste;

    // Constructor
    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Abstract method
    abstract void showDetails();
}

// Interface Edible
interface Edible {
    void nutrientsInfo();
}

// Concrete class Apple extending Fruit and implementing Edible
class Apple extends Fruit implements Edible {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    // Implementing abstract method from Fruit
    @Override
    void showDetails() {
        System.out.println("Fruit: Apple");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Variety: " + variety);
    }

    // Implementing interface method from Edible
    @Override
    public void nutrientsInfo() {
        System.out.println("Nutrients: Rich in fiber, Vitamin C, and antioxidants.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Kashmir Apple");
        apple.showDetails();
        apple.nutrientsInfo();
    }
}
