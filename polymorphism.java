
//super refers to the superclass (vehicle)
// It is used to access members (methods, constructors) of the parent class.
// super(name) calls the constructor of vehicle and passes name as an argument.


class vehicle {
    String name;

    vehicle(String name) {
        this.name = name;
    }

    void go() {
        System.out.println(name + " is ready to go!");
    }
}

class bike extends vehicle {
    bike(String name) {
        super(name);
    }
}

class car extends vehicle {
    car(String name) {
        super(name);  // Calls the constructor of vehicle class
    }
}

class plane extends vehicle {
    plane(String name) {
        super(name);
    }
}

public class polymorphism {
    public static void main(String[] args) {

        vehicle car = new car("Car");   // A car object is referenced by a vehicle variable
        vehicle bike = new bike("Bike"); // A bike object is referenced by a vehicle variable
        vehicle plane = new plane("Plane"); // A plane object is referenced by a vehicle variable
        
        System.out.println("Print the non loop declared class-object-method stmts: ");
        car.go();  // Calls go() of vehicle, but the object is of type car
        bike.go();  // Calls go() of vehicle, but the object is of type bike
        plane.go();  // Calls go() of vehicle, but the object is of type plane

        System.out.println("\nPrint the for each loop vehicles array: ");
        // Storing them in an array of type vehicle
        vehicle[] vehicles = {car, bike, plane};

        // Using a loop to call go() on all objects
        for (vehicle v : vehicles) {
            v.go();
    }

}
}



// is not possible because :The car, bike, and plane classes inherit from vehicle, but they do not have constructors.
// car c1 = new car("");
// bike b1 = new bike("");
// plane p1 = new plane();