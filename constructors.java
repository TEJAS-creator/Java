// Theory :-
// this.name, this.ide, and this.id refer to the instance variables of the class.
// Without this, Java would assume name, ide, and id refer to the method parameters instead of the instance variables.
// A constructor is a special method in a class that is automatically called when an object of the class is created.
// It is used to initialize objects.
// No return type
// An overloaded constructor is a class constructor that has multiple definitions with different sets of parameters.
// Overloading allows creating multiple constructors in the same class, each with a different number or type of parameters 


// 1. Normal constructors 
class car{

    String name;
    String ide;
    int id;
    
    car(String name,String ide,int id){
        this.name = name;
        this.ide = ide;
        this.id = id;
    }

    // Method 
    void feature(){
        System.out.println(this.name+" is a great car"); // used to access an object attribute from within the class
    }

    void model(){
        System.out.println(this.ide+" is a great model"); // used to access an object attribute from within the class
    }
}

public class Main{
    public static void main(String[] args) {
        car c1 = new car("BMW","m4",55);  // constructor must be present in order to directly pass the value into-> (value)
        car c2 = new car("audi","m4",85); // constructor must be present in order to directly pass the value into-> (value)
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c1.id);
        System.out.println(c2.id);

        c1.feature();
        c1.model();

        c2.feature();
        c2.model();

    }
}



// 2. Overloaded constructors
class Car {
    String name;
    String ide;
    int id;

    // Constructor with all parameters
    Car(String name, String ide, int id) {
        this.name = name;
        this.ide = ide;
        this.id = id;
    }

    // Constructor with only name and ide
    Car(String name, String ide) {
        this.name = name;
        this.ide = ide;
        this.id = 0; // Default ID
    }

    // Constructor with only name
    Car(String name) {
        this.name = name;
        this.ide = "Unknown"; // Default model
        this.id = 0; // Default ID
    }

    // Default constructor
    Car() {
        this.name = "Unknown";
        this.ide = "Unknown";
        this.id = 0;
    }

    // Method to display features
    void feature() {
        System.out.println(this.name + " is a great car");
    }

    void model() {
        System.out.println(this.ide + " is a great model");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M4", 55);
        Car c2 = new Car("Audi", "M4", 85);
        Car c3 = new Car("Mercedes", "C-Class");
        Car c4 = new Car("Tesla");
        Car c5 = new Car();

        System.out.println(c1.name + " - " + c1.id);
        System.out.println(c2.name + " - " + c2.id);
        System.out.println(c3.name + " - " + c3.id);
        System.out.println(c4.name + " - " + c4.id);
        System.out.println(c5.name + " - " + c5.id);

        c1.feature();
        c1.model();
        c2.feature();
        c2.model();
        c3.feature();
        c3.model();
        c4.feature();
        c4.model();
        c5.feature();
        c5.model();
    }
}
