// Encapsulation: bundling of data and methods
// Data Hiding: Restricts direct access to some details of an object, exposing only what is necessary.
// Access Modifiers: Uses private, protected, and public keywords to control access to data and methods.
// Improves Security & Maintainability
// Getters = used to get private variables
// Setters = used to modify private variables


class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    Car(String make, String model, int year) {
        this.setmake(make);
        this.setmodel(model);
        this.setyear(year);
    }

    // Getters
    public String getmake() {
        return make;
    }

    public String getmodel() {
        return model;
    }

    public int getyear() {
        return year;
    }

    // Setters
    public void setmake(String make) {
        this.make = make;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public void setyear(int year) {
        this.year = year;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M4", 2025);

        // Accessing private variables through getters
        System.out.println(c1.getmake());
        System.out.println(c1.getmodel());
        System.out.println(c1.getyear());

        // Modifying the year through setter
        c1.setyear(2006);

        // After setting the new year
        System.out.println(c1.getyear());
    }
}
