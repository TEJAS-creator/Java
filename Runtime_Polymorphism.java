// RunTime polymorphism - The method to be executed is determined at runtime based on the actual object being referenced,
// rather than the reference type.

import java.util.Scanner;

// Base class (parent)
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Dog)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class (Cat)
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Dog, 2 for Cat:");
        int choice = scanner.nextInt();
        
        Animal animal; // Reference of base class
        
        if (choice == 1) {
            animal = new Dog(); // Dog object
        } else if (choice == 2) {
            animal = new Cat(); // Cat object
        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }
        
        animal.makeSound(); // Calls overridden method
        scanner.close();
    }
}
