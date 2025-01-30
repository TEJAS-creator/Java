// input in java
// Scanner sc = new Scanner(System.in);
// int variable = sc.nextInt();






// methods in java
public class Example {
    // A function that returns the sum of two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }
}

returnType functionName(parameters) {
    // Function body
    return value; // (if returnType is not void)
}


// classes and objects in java
// Defining a class
class Car {
    // Attributes (data members)
    String brand;
    int speed;

    // Method (function)
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class to create objects
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Assigning values to object properties
        myCar.brand = "Tesla";
        myCar.speed = 150;

        // Calling a method on the object
        myCar.displayInfo();
    }
}


// default constructor
class Car {
    String brand;
    
    // Default Constructor
    Car() {
        brand = "Tesla";
        System.out.println("Constructor is called!");
    }

    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Constructor is called automatically
        myCar.displayBrand();
    }
}


// parameterized constructor
class ClassName {
    // Constructor with parameters
    ClassName(dataType param1, dataType param2) {
        // Initialization code
    }
}

class Car {
    String brand;
    int speed;

    // Parameterized Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", 200); // Passing values to constructor
        myCar.displayInfo();
    }
}


// constructor overloading 
class Car {
    String brand;
    int speed;

    // Default Constructor
    Car() {
        brand = "Unknown";
        speed = 0;
    }

    // Parameterized Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor
        Car car2 = new Car("Audi", 220); // Calls parameterized constructor

        car1.displayInfo();
        car2.displayInfo();
    }
}


// Single inheritance
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method from Dog class
    }
}


// single level inheritance
class Parent { }
class Child extends Parent { }

// multi level inheritance
class GrandParent { }
class Parent extends GrandParent { }
class Child extends Parent { }

// hierarchial level inheritance
class Parent { }
class Child1 extends Parent { }
class Child2 extends Parent { }


// polymorphism
class ClassName {
    // Method with one parameter
    void methodName(int a) { }

    // Overloaded method with two parameters
    void methodName(int a, int b) { }
}


// method overloading
class MathOperations {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum (2 numbers): " + math.add(5, 10));
        System.out.println("Sum (3 numbers): " + math.add(5, 10, 15));
    }
}


// method overriding
class Parent {
    void show() { }
}

class Child extends Parent {
    @Override
    void show() { }
}


// example
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls Dog's method (Runtime Polymorphism)
    }
}


// access modifiers in java
// private
class Example {
    private int data = 10; // Private variable

    private void showData() { // Private method
        System.out.println("Data: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        // obj.data = 20;  ❌ Error (Cannot access private variable)
        // obj.showData(); ❌ Error (Cannot access private method)
    }
}

// public
class Example {
    public int data = 10; // Public variable

    public void showData() { // Public method
        System.out.println("Data: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.data = 20; // ✅ Accessible
        obj.showData(); // ✅ Accessible
    }
}


// protected
class Parent {
    protected int data = 10; // Protected variable

    protected void showData() { // Protected method
        System.out.println("Data: " + data);
    }
}

class Child extends Parent {
    void accessParentData() {
        System.out.println("Accessing from Child: " + data); // ✅ Accessible
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.accessParentData(); // ✅ Accessible
        // obj.showData(); ✅ Accessible
    }
}


// default
class Example {
    int data = 10; // Default variable (no modifier)

    void showData() { // Default method (no modifier)
        System.out.println("Data: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.data = 20; // ✅ Accessible within the same package
        obj.showData(); // ✅ Accessible within the same package
    }
}


