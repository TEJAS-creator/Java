// Inheritance =  one class (child/subclass) inherits the properties and behaviors (methods) of another class (parent/superclass).
// Multi-Level Inheritance = child(Base class) -> parent(Intermediate class) -> grandparent(Derived class) (child inherits parent and parent inherits grandparent)


// 1. Inheritance 
class animal{
    boolean isAlive;

    // Constructor
    animal(){
        isAlive=true;
    }

    void eat(){
        System.out.println("They eat grass");
    }

    void display(){
        System.out.println("We are herbivorous animals");
    }
}

class dog extends animal{
    // boolean isAlive;
    // dog(){
    //     isAlive=true;
    // }
    // void eat1(){
    //     System.out.println("They eat bone");    
    // }
}

class cat extends animal{

}

public class inheritance{
    public static void main(String[] args) {
        dog d1 = new dog(); // creating an object 
        cat c1= new cat();  // creating an object
        animal a1 = new animal();  // creating an object

        System.out.println(d1.isAlive);
        System.out.println(c1.isAlive);

        d1.eat();
        c1.eat();
        a1.eat();

        d1.display();
        c1.display();
        a1.display();

    }
}



// 2. Multi-Level Inheritance 
// Base Class (Parent)
class Plants {
    String name;

    // Constructor
    Plants(String name) {
        this.name = name;
    }

    void feature() {
        System.out.println("Plants are green in color.");
        System.out.println("They give oxygen by taking carbon dioxide.");
    }

    void importance() {
        System.out.println(this.name + " is a plant.");
    }
}

// Intermediate Class (Child of Plants, Parent of Rose)
class FloweringPlants extends Plants {
    boolean hasFlowers;

    // Constructor
    FloweringPlants(String name,boolean hasFlowers) {
        super(name); // Calls the constructor of the parent class (Plants)
        this.hasFlowers = hasFlowers;
    }

    void flowerInfo() {
        if (hasFlowers) {
            System.out.println(name + " is a flowering plant.");
        } else {
            System.out.println(name + " is a non-flowering plant.");
        }
    }
}

// Derived Class (Child of FloweringPlants)
class Rose extends FloweringPlants {
    String color;

    // Constructor
    Rose(String name, boolean hasFlowers, String color) {
        super(name,hasFlowers); // Calls the constructor of FloweringPlants
        this.color = color;
    }

    void roseDetails() {
        System.out.println(name + " is a " + color + " coloured plant.");
    }
}

// Main Class
public class inheritance {
    public static void main(String[] args) {
        Rose rose1 = new Rose("Rose",true, "Red");
        
        // Accessing methods from all three levels
        rose1.feature();         // From Plants
        rose1.importance();      // From Plants
        rose1.flowerInfo();      // From FloweringPlants
        rose1.roseDetails();     // From Rose
    }
}

// Example 3
// Since car extends vehicle, it must explicitly call the superclass constructor (super(...))

class Vehicle {
    String name;
    int id;

    Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Vehicle Name: " + name + ", ID: " + id);
    }
}

class Car extends Vehicle {
    Car(String name, int id) {
        super(name, id); // Calls the constructor of Vehicle
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", 5);
        v1.display();  // Correct method call

        Car c1 = new Car("Audi", 10);
        c1.display();  // Inherited method
    }
}

