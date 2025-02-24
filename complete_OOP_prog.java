// Explanation of Concepts Used:
// Methods:
// displayInfo() prints car details.
// toString() is overridden from Object class.

// Inheritance:
// LuxuryCar is the parent class.
// Five subclasses (Mercedes, BMW, etc.) extend it.

// Access Modifiers:
// private for ID (ensures encapsulation).
// protected for name, color, country (accessible in subclasses).
// public for constructors and methods.

// Polymorphism:
// displayInfo() is overridden in each subclass.
// The LuxuryCar[] array stores different subclass objects.


// Parent Class - LuxuryCar
class LuxuryCar {
    private int id;  // Private access modifier
    protected String name, color, country; // Protected allows subclass access

    // Constructor
    public LuxuryCar(int id, String name, String color, String country) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.country = country;
    }

    // Getter method for ID
    public int getId() {
        return id;
    }

    // Method to display information (Will be overridden in subclasses)
    public void displayInfo() {
        System.out.println("Car ID: " + id);
        System.out.println("Brand: " + name);
        System.out.println("Color: " + color);
        System.out.println("Country: " + country);
    }

    // Overriding toString() method of Object class
    @Override
    public String toString() {
        return "LuxuryCar{" + "id=" + id + ", name='" + name + "', color='" + color + "', country='" + country + "'}";
    }
}

// Child Class 1 - Mercedes
class Mercedes extends LuxuryCar {
    public Mercedes(int id, String color) {
        super(id, "Mercedes-Benz", color, "Germany");
    }

    // Overriding display method
    @Override
    public void displayInfo() {
        System.out.println("🚗 Mercedes-Benz Luxury Car Details:");
        super.displayInfo();
    }
}

// Child Class 2 - BMW
class BMW extends LuxuryCar {
    public BMW(int id, String color) {
        super(id, "BMW", color, "Germany");
    }

    @Override
    public void displayInfo() {
        System.out.println("🚙 BMW Luxury Car Details:");
        super.displayInfo();
    }
}

// Child Class 3 - Rolls Royce
class RollsRoyce extends LuxuryCar {
    public RollsRoyce(int id, String color) {
        super(id, "Rolls-Royce", color, "United Kingdom");
    }

    @Override
    public void displayInfo() {
        System.out.println("🚘 Rolls-Royce Luxury Car Details:");
        super.displayInfo();
    }
}

// Child Class 4 - Tesla
class Tesla extends LuxuryCar {
    public Tesla(int id, String color) {
        super(id, "Tesla", color, "United States");
    }

    @Override
    public void displayInfo() {
        System.out.println("⚡ Tesla Luxury Car Details:");
        super.displayInfo();
    }
}

// Child Class 5 - Ferrari
class Ferrari extends LuxuryCar {
    public Ferrari(int id, String color) {
        super(id, "Ferrari", color, "Italy");
    }

    @Override
    public void displayInfo() {
        System.out.println("🏎️ Ferrari Luxury Car Details:");
        super.displayInfo();
    }
}

// Main Class
public class LuxuryCarShowroom {
    public static void main(String[] args) {
        // Creating an array of LuxuryCar references (polymorphism)
        LuxuryCar[] cars = {
            new Mercedes(101, "Black"),
            new BMW(102, "Blue"),
            new RollsRoyce(103, "White"),
            new Tesla(104, "Red"),
            new Ferrari(105, "Yellow")
        };

        // Displaying details of all cars
        for (LuxuryCar car : cars) {
            car.displayInfo();
            System.out.println("------------------------------");
        }
    }
}
