// Hiding implementation details and showing only essential features
// Helps reduce complexity, increases reusability, and improves security

abstract class Vehicle {
    String name;
    int id;

    // Constructor
    Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (forces subclasses to implement it)
    abstract void go();  

    void display() {
        System.out.println("Vehicle Name: " + name + ", ID: " + id);
    }
}

// subclass
class Car extends Vehicle {
    // Constructor
    Car(String name, int id) {
        super(name, id);
    }

    // Implementing abstract method
    @Override
    void go() {
        System.out.println(name + " is now driving...");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle("BMW", 5); //  Error: Abstract class cannot be instantiated
        Car c1 = new Car("BMW", 5);
        c1.display();  //  Displays car details
        c1.go();       //  Calls the overridden method in Car
    }
}
