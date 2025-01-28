 //// A private field or method cannot be accessed from outside the class.
// // To access or modify private fields, you typically use getter and setter methods.
// // It prevents unintended or unauthorized manipulation of data.

// // A public field or method can be accessed directly from outside the class.
// // Overuse of public fields can break encapsulation, so it’s good practice to use public primarily for methods, not fields.
// // Public members are accessible to all and hence should not contain sensitive data.

// // private: Not accessible in the child class.
// // protected: Accessible in the child class.
// // public: Fully accessible.

// // Same Name as the Class: A constructor must have the same name as the class.
// // No Return Type: Unlike other methods, constructors do not have a return type (not even void).
// // Called Automatically: A constructor is automatically invoked when an object is created.
// // Can Be Overloaded: You can have multiple constructors with different parameter lists

// // Enables code reuse by allowing the child class to use fields and methods of the parent class.
// // Follows an "is-a" relationship (e.g., a Dog is a type of Animal).
// // The extends keyword is used to implement inheritance.

// // Achieved using private fields and public getter and setter methods.
// // Protects the data by restricting direct access.
// // Provides controlled access to fields through methods, ensuring data integrity and security.

// // A class is a blueprint or template for creating objects.
// // In Java, a class is created using the class keyword.
// // An object is an instance of a class.
// // Objects interact with each other through methods.
// // Created using the new keyword.

// QSyntax for class
// class ClassName {
//     // Fields
//     dataType fieldName;

//     // Constructor
//     public ClassName() {
//         // Initialize fields
//     }

//     // Methods
//     returnType methodName() {
//         // Method body
//     }
// }

// // Syntax for Creating an Object:
// ClassName objectName = new ClassName();

// // Program for Class and Objects Understanding :-
// // Define the class
// class Car {
//     // Fields (attributes)
//     String brand;
//     String color;
//     int speed;

//     // Constructor
//     public Car(String brand, String color, int speed) {
//         this.brand = brand;
//         this.color = color;
//         this.speed = speed;
//     }

//     // Method (behavior)
//     void displayDetails() {
//         System.out.println("Brand: " + brand);
//         System.out.println("Color: " + color);
//         System.out.println("Speed: " + speed + " km/h");
//     }
// }

// // Main class to create and use objects
// public class Main {
//     public static void main(String[] args) {
//         // Create objects
//         Car car1 = new Car("Tesla", "Red", 200);
//         Car car2 = new Car("BMW", "Blue", 180);

//         // Call methods using objects
//         car1.displayDetails();
//         car2.displayDetails();
//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Straight amount for 40 hrs");
//         System.out.println("Half of Straight amount foreach hour exceeding 40hrs");
//         System.out.println("-------------------------------");
//         System.out.print("Enter the number of hours worked: ");
//         Scanner s = new Scanner(System.in);
//         int  hours = s.nextInt();
//         System.out.print("Enter the hourly rate: ");
//         int rate = s.nextInt();
//         int straight = 40 * rate;
//         int overtime = (hours - 40) * rate * 2;
//         int total = straight + overtime;
//         System.out.println();
//         System.out.print("Total pay: " + total);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter number 1: ");
//         int n1 = s.nextInt();
//         System.out.print("Enter number 2: ");
//         int n2 = s.nextInt();
//         int sum = bit(n1, n2);
//         System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum);
//         if((sum&1)==0){
//             System.out.println("SUm is even");
//         }
//         else{
//             System.out.println("Sum is odd");
//         }
//     }
//         // Function to add two numbers using bitwise operators
//         public static int bit(int a, int b) {
//             // Logic 
//             while (b != 0) {
//                 int carry = (a & b) << 1;
//                 a = a ^ b;
//                 b = carry;
//             }
//             return a;
//         }
//     }

// public class Main {
//     public static void main(String[] args) {
//         // a. int x = 10;
//         int x1 = 10;
//         System.out.println("Value of x1 (int): " + x1);

//         // b. double x = 12.5;
//         double x2 = 12.5;
//         int x8 = (int) x2;
//         System.out.println("Value of x2 (double): " + x2);
//         System.out.println("Value of x8 (int): " + x8); // prints integer value of 12.5

//         // c. double x = 10.5; double y = x;
//         double x3 = 10.5;
//         double y1 = x3;
//         System.out.println("Value of y1 (double): " + y1);

//         // e. int y = (int) x;
//         double x5 = 10.5;
//         int y3 = (int) x5; // Explicit casting
//         System.out.println("Value of y3 (int after casting): " + y3);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     // Function to rotate array to the left
//     public static void rotateLeft(int[] array, int steps) {
//         int n = array.length;
//         steps %= n; // Ensure steps are within bounds
//         reverse(array, 0, steps - 1);
//         reverse(array, steps, n - 1);
//         reverse(array, 0, n - 1);
//     }
//     // Function to rotate array to the right
//     public static void rotateRight(int[] array, int steps) {
//         int n = array.length;
//         steps %= n; // Ensure steps are within bounds
//         reverse(array, 0, n - steps - 1);
//         reverse(array, n - steps, n - 1);
//         reverse(array, 0, n - 1);
//     }
//     // Helper function to reverse a portion of the array
//     private static void reverse(int[] array, int start, int end) {
//         while (start < end) {
//             int temp = array[start];
//             array[start] = array[end];
//             array[end] = temp;
//             start++;
//             end--;
//         }
//     }
//     // Main method
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         // Input array size
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         int[] array = new int[size];
//         // Input array elements
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < size; i++) {
//             array[i] = scanner.nextInt();
//         }
//         // Input number of steps
//         System.out.print("Enter the number of steps to rotate: ");
//         int steps = scanner.nextInt();
//         // Input rotation direction
//         System.out.print("Enter the direction (L for Left, R for Right): ");
//         char direction = scanner.next().charAt(0);
//         // Perform rotation
//         if (direction == 'L' || direction == 'l') {
//             rotateLeft(array, steps);
//         } else if (direction == 'R' || direction == 'r') {
//             rotateRight(array, steps);
//         } else {
//             System.out.println("Invalid direction! Use 'L' for Left or 'R' for Right.");
//             scanner.close();
//             return;
//         }
//         // Display the rotated array
//         System.out.println("Rotated Array:");
//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//         scanner.close();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 3;
//         int c = (a << 2) + (b >> 2);
//         System.out.println("Value of c : " + c); // answer = 40
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         // Input the array size and elements
//         System.out.print("Enter the size of the array: ");
//         int n = s.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = s.nextInt();
//         }

//         // Input the number of steps to rotate
//         System.out.print("Enter the number of steps to rotate: ");
//         int steps = s.nextInt();

//         // Input the direction of rotation
//         System.out.print("Enter the direction (left/right): ");
//         String direction = s.next().toLowerCase();

//         // Rotate the array
//         if (direction.equals("right")) {
//             rotateRight(arr, steps);
//         } else if (direction.equals("left")) {
//             rotateLeft(arr, steps);
//         } else {
//             System.out.println("Invalid direction! Use 'left' or 'right'.");
//             s.close();
//             return;
//         }

//         // Display the rotated array
//         System.out.println("Rotated array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         s.close();
//     }

//     // Function to rotate the array to the right
//     public static void rotateRight(int[] arr, int steps) {
//         int n = arr.length;
//         steps = steps % n; // Handle steps larger than array size
//         reverse(arr, 0, n - 1);
//         reverse(arr, 0, steps - 1);
//         reverse(arr, steps, n - 1);
//     }

//     // Function to rotate the array to the left
//     public static void rotateLeft(int[] arr, int steps) {
//         int n = arr.length;
//         steps = steps % n; // Handle steps larger than array size
//         reverse(arr, 0, steps - 1);
//         reverse(arr, steps, n - 1);
//         reverse(arr, 0, n - 1);
//     }

//     // Helper function to reverse a portion of the array
//     public static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input number of products
//         System.out.print("Enter the number of products: ");
//         int n = sc.nextInt();

//         // Arrays to store product details
//         String[] productNames = new String[n];
//         double[] productPrices = new double[n];
//         int[] productQuantities = new int[n];

//         // Input product details
//         System.out.println("Enter the product details:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Product " + (i + 1) + " name: ");
//             productNames[i] = sc.next();
//             System.out.print("Product " + (i + 1) + " price: ");
//             productPrices[i] = sc.nextDouble();
//             System.out.print("Product " + (i + 1) + " quantity in stock: ");
//             productQuantities[i] = sc.nextInt();
//         }

//         double totalBill = 0;
//         boolean shopping = true;

//         // Start the shopping process
//         while (shopping) {
//             System.out.println("\nAvailable products:");
//             for (int i = 0; i < n; i++) {
//                 System.out.println((i + 1) + ". " + productNames[i] + " - ₹" + productPrices[i] + " (Stock: " + productQuantities[i] + ")");
//             }

//             // Input product choice
//             System.out.print("\nEnter the product number to purchase (or 0 to finish): ");
//             int choice = sc.nextInt();
//             if (choice == 0) {
//                 shopping = false;
//                 break;
//             }

//             // Check if the choice is valid
//             if (choice < 1 || choice > n) {
//                 System.out.println("Invalid product number. Try again.");
//                 continue;
//             }
//             int productIndex = choice - 1;

//             // Input quantity
//             System.out.print("Enter the quantity to purchase: ");
//             int quantity = sc.nextInt();

//             // Check if the quantity is available
//             if (quantity > productQuantities[productIndex]) {
//                 System.out.println("Insufficient stock for " + productNames[productIndex] + ". Available: " + productQuantities[productIndex]);
//                 continue;
//             }

//             // Update stock and calculate bill
//             productQuantities[productIndex] -= quantity;
//             double cost = quantity * productPrices[productIndex];
//             totalBill += cost;

//             System.out.println("Added " + quantity + " x " + productNames[productIndex] + " to the bill. Cost: ₹" + cost);
//         }

//         // Display the total bill
//         System.out.println("\nTotal bill: ₹" + totalBill);
//         System.out.println("Thank you for shopping!");
//         sc.close();
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("First 5 km = INR 10/km\nNext 15 km = INR 8/km\nNext 25 km = INR 5/km");
//         System.out.print("Enter the distance in km: ");
//         int distance = sc.nextInt();
//         int cost = 0;
//         if (distance <= 5) {
//             cost = distance * 10;
//         }
//         else if(distance<=20){
//             cost = 50 + (distance-5)*8;
//         }
//         else if(distance<=45){
//             cost = 50 + 80 + (distance-20)*5;
//         }
//         else{
//             cost = 50 + 80 + 125 + (distance-45)*3;
//         }
//         System.out.println("The total cost is: "+cost);
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int reg;
//         System.out.print("Enter your 9-digit registration number: ");
//         while (true) {
//             if (s.hasNextInt()) {
//                 reg = s.nextInt(); // input
//                 if (reg >= 100000000 && reg <= 999999999) {
//                     break; // Exit the loop if valid
//                 } 
//                 else {
//                     System.out.print("Invalid input.\nPlease enter a 9-digit number: ");
//                 }
//             } 
//             else {
//                 System.out.print("Invalid input. Please enter a 9-digit number: ");
//                 s.next(); // Clear invalid input
//             }
//         }
//         String number = Integer.toString(reg); // Convert to String
//         String digits = number.substring(0, 2); // Extract first 2 characters
//         System.out.println("Year of joining: " + digits);
//         s.close();
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter your year of birth: ");
//         Scanner s = new Scanner(System.in);
//         int birth = s.nextInt();
//         int retire = birth + 60;
//         System.out.println("You will retire in the year: " + retire);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     // Method to calculate factorial recursively
//     public static long factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1; 
//         }
//         return n * factorial(n - 1); // Recursive case
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number to calculate its factorial: ");
//         int number = scanner.nextInt();
//         if (number < 0) {
//             System.out.println("Factorial is not defined for negative numbers.");
//         } 
//         else {
//             long result = factorial(number);
//             System.out.println("The factorial of " + number + " is: " + result);
//         }
//         // scanner.close();
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double consumption = 0.0;

//         System.out.println("Enter the electricity consumption (in units) for 7 days:");
//         for (int i = 1; i <= 7; i++) {
//             System.out.print("Day " + i + ": ");
//             consumption += sc.nextDouble();
//         }
//         double bill;
//         int range = (int) consumption / 100; // Determine the range
//         switch (range) {
//             case 0: // 0 - 100 units
//                 bill = consumption * 7.00;
//                 break;
//             case 1: // 101 - 200 units
//                 bill = consumption * 8.00;
//                 break;
//             default: // 201 or more units
//                 bill = consumption * 10.00;
//         }
//         System.out.printf("Total electricity consumption: %.2f units\n", consumption);
//         System.out.printf("Total electricity bill: INR %.2f\n", bill);
//         sc.close();
//     }
// }

// class STUDENT{
//     String name;
//     int[] marks_array;
//     int total;
//     double average;

//     void assign(String name, int[] marks_array){
//         this.name = name;
//         this.marks_array = marks_array;
//     }
//     void compute(){
//         total =0;
//         for(int mark : marks_array){
//             total += mark;
//         }
//         average = (double)total/marks_array.length; // .length extracts the length of the array
//     }
//     void display(){
//         System.out.println("Name: "+name);
//         System.out.println("Marks: ");
//         for(int mark : marks_array){
//             System.out.println(mark);
//         }
//         System.out.println("Total: "+total);
//         System.out.println("Average: "+average);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         STUDENT student = new STUDENT(); // creating an object of the class STUDENT
//         student.assign("Tejas", new int[]{45, 67, 89, 90, 56, 78});
//         student.compute();
//     }
// }

// import java.util.*;

// // Define the EMPLOYEE class
// class EMPLOYEE {
//     // Members of the EMPLOYEE class
//     String name;
//     int id;
//     double Basic, DA, Gross_Sal, Net_Sal;

//     void read(Scanner sc) {
//         System.out.print("Enter Employee ID: ");
//         id = sc.nextInt();
//         sc.nextLine(); // newline
//         System.out.print("Enter Employee Name: ");
//         name = sc.nextLine();
//         System.out.print("Enter Basic Salary: ");
//         Basic = sc.nextDouble();
//     }

//     void compute_net_sal() {
//         DA = 0.52 * Basic; // DA is 52% of Basic
//         Gross_Sal = Basic + DA; // Gross salary
//         double IT = 0.30 * Gross_Sal; // Income Tax is 30% of Gross Salary
//         Net_Sal = Gross_Sal - IT; // Net salary
//     }

//     void display() {
//         System.out.println("Employee ID: " + id);
//         System.out.println("Employee Name: " + name);
//         System.out.println("Basic Salary: " + Basic);
//         System.out.println("DA: " + DA);
//         System.out.println("Gross Salary: " + Gross_Sal);
//         System.out.println("Net Salary: " + Net_Sal);
//         System.out.println("----------------------------");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of employees: ");
//         int n = sc.nextInt();
//         EMPLOYEE[] employees = new EMPLOYEE[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter details for Employee " + (i + 1) + ":");
//             employees[i] = new EMPLOYEE(); // Create a new EMPLOYEE object
//             employees[i].read(sc);
//             employees[i].compute_net_sal(); 
//         }
        
//         System.out.println("\nEmployee Details:");
//         for (EMPLOYEE employee : employees) {
//             employee.display();
//         }
//         sc.close();
//     }
// }

// import java.util.Random;

// // Define the Die class
// class Die {
//     // Instance variable to store the current side facing up
//     private int sideUp;

//     // Constructor to initialize the die with a default value
//     public Die() {
//         roll(); // Set an initial random value for sideUp
//     }

//     // Method to get the current side up
//     public int getSideUp() {
//         return sideUp;
//     }

//     // Method to roll the die and set a random side up (1 to 6)
//     public void roll() {
//         Random random = new Random();
//         sideUp = random.nextInt(6) + 1; // Random value between 1 and 6
//     }
// }

// // Define the DieDemo class
// public class Main {
//     public static void main(String[] args) {
//         // Create two Die objects
//         Die die1 = new Die();
//         Die die2 = new Die();

//         // Roll both dice
//         die1.roll();
//         die2.roll();

//         // Get the sides up for both dice
//         int side1 = die1.getSideUp();
//         int side2 = die2.getSideUp();

//         // Print the results and their sum
//         System.out.println("Die 1 rolled: " + side1);
//         System.out.println("Die 2 rolled: " + side2);
//         System.out.println("Sum of both dice: " + (side1 + side2));
//     }
// }

// import java.util.Scanner;
// class Mixer {
//     // Instance variable to store the elements of the array
//     int arr[];
//     // Method to accept the elements of the array in ascending order without duplicates
//     void accept() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
//         arr = new int[n];
//         System.out.println("Enter the elements in ascending order without duplicates:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//     }

//     // Method to merge the current object array elements with another object's array
//     Mixer mix(Mixer A) {
//         int i = 0, j = 0, k = 0;
//         int[] result = new int[this.arr.length + A.arr.length];

//         // Merge the two arrays in ascending order
//         while (i < this.arr.length && j < A.arr.length) {
//             if (this.arr[i] < A.arr[j]) {
//                 result[k++] = this.arr[i++];
//             } else if (this.arr[i] > A.arr[j]) {
//                 result[k++] = A.arr[j++];
//             } else { // If equal, take one and move both pointers
//                 result[k++] = this.arr[i++];
//                 j++;
//             }
//         }

//         // Copy remaining elements of this.arr
//         while (i < this.arr.length) {
//             result[k++] = this.arr[i++];
//         }

//         // Copy remaining elements of A.arr
//         while (j < A.arr.length) {
//             result[k++] = A.arr[j++];
//         }

//         // Create a new Mixer object for the result
//         Mixer resultMixer = new Mixer();
//         resultMixer.arr = new int[k];
//         System.arraycopy(result, 0, resultMixer.arr, 0, k);

//         return resultMixer;
//     }

//     // Method to display the elements of the array
//     void display() {
//         System.out.print("Array elements: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

// // Main class to test the Mixer class
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Create and accept two Mixer objects
//         System.out.println("Enter details for first Mixer:");
//         Mixer mixer1 = new Mixer();
//         mixer1.accept();

//         System.out.println("Enter details for second Mixer:");
//         Mixer mixer2 = new Mixer();
//         mixer2.accept();

//         // Merge the two Mixer objects
//         Mixer mergedMixer = mixer1.mix(mixer2);

//         // Display the merged array
//         System.out.println("Merged array in ascending order:");
//         mergedMixer.display();
//     }
// }

// class STUDENT {
//     private String name;
//     private int rollNo;
//     private float marks;

//     // Default Constructor
//     public STUDENT() {
//         name = "Unknown";
//         rollNo = 0;
//         marks = 0.0f;
//     }

//     // Parameterized Constructor
//     public STUDENT(String studentName, int studentRollNo, float studentMarks) {
//         name = studentName;
//         rollNo = studentRollNo;
//         marks = studentMarks;
//     }

//     // Display Method
//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNo);
//         System.out.println("Marks: " + marks);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Using Default Constructor
//         STUDENT student1 = new STUDENT();
//         System.out.println("Student 1 (Default Constructor):");
//         student1.display();

//         // Using Parameterized Constructor
//         STUDENT student2 = new STUDENT("Tejas", 101, 89.5f);
//         System.out.println("\nStudent 2 (Parameterized Constructor):");
//         student2.display();
//     }
// }

// class EMPLOYEE{
//     private String name;
//     int id;
//     float salary;

//     public EMPLOYEE(){
//         name = "Unknown";
//         id = 0;
//         salary = 0.0f;
//     }

//     public EMPLOYEE(String employeename, int employeeid, float employeesalary){
//         name = employeename;
//         id = employeeid;
//         salary = employeesalary;
//     }

//     // Display Method
//     public void display(){
//         System.out.println("Name: " + name);
//         System.out.println("Employee ID: " + id);
//         System.out.println("Salary: " + salary);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Here emp 1 and emp 2 are the 2 different objects of the class EMPLOYEE

//         // Using Default Constructor
//         EMPLOYEE emp1 = new EMPLOYEE();
//         System.out.println("Employee 1 (Default Constructor):");
//         emp1.display();

//         // Using Parameterized Constructor
//         EMPLOYEE emp2 = new EMPLOYEE("Tejas", 1001, 75000.5f);
//         System.out.println("\nEmployee 2 (Parameterized Constructor):");
//         emp2.display();
//     }
// }


// // rate of interest is declared as static to make it common for all instances of the class
// class BankAccount {
//     private String depositorName;
//     private int accountNumber;
//     private String accountType;
//     private float balanceAmount;
//     private static float rateOfInterest = 3.5f; // Static data member

//     // Default Constructor
//     public BankAccount() {
//         depositorName = "Unknown";
//         accountNumber = 0;
//         accountType = "Savings";
//         balanceAmount = 0.0f;
//     }

//     // Parameterized Constructor
//     public BankAccount(String name, int accNumber, String accType, float balance) {
//         depositorName = name;
//         accountNumber = accNumber;
//         accountType = accType;
//         balanceAmount = balance;
//     }

//     // Method to deposit amount
//     public void deposit(float amount) {
//         balanceAmount += amount;
//         System.out.println("Amount Deposited: " + amount);
//     }

//     // Method to withdraw amount
//     public void withdraw(float amount) {
//         if (balanceAmount - amount < 1000) { // Minimum balance check
//             System.out.println("Withdrawal denied. Minimum balance of 1000 required!");
//         } else {
//             balanceAmount -= amount;
//             System.out.println("Amount Withdrawn: " + amount);
//         }
//     }

//     // Method to display account details
//     public void display() {
//         System.out.println("Depositor Name: " + depositorName);
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Type: " + accountType);
//         System.out.println("Balance Amount: " + balanceAmount);
//     }

//     // Static method to display rate of interest
//     public static void displayRateOfInterest() {
//         System.out.println("Rate of Interest: " + rateOfInterest + "%");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Using Default Constructor
//         BankAccount account1 = new BankAccount();
//         System.out.println("Account 1 (Default Constructor):");
//         account1.display();
//         BankAccount.displayRateOfInterest();

//         // Using Parameterized Constructor
//         BankAccount account2 = new BankAccount("Tejas", 101, "Savings", 5000.0f);
//         System.out.println("\nAccount 2 (Parameterized Constructor):");
//         account2.display();
//         BankAccount.displayRateOfInterest();

//         // Depositing amount in account2
//         System.out.println("\nDepositing 2000 in Account 2:");
//         account2.deposit(2000);
//         account2.display();

//         // Withdrawing amount from account2
//         System.out.println("\nWithdrawing 4500 from Account 2:");
//         account2.withdraw(4500);
//         account2.display();

//         // Attempting to withdraw below minimum balance
//         System.out.println("\nWithdrawing 2000 from Account 2:");
//         account2.withdraw(2000);
//         account2.display();
//     }
// }

// class Student {
//     // Fields for Student class
//     private String studentName;
//     private int studentId;
//     private Subject[] subjects;
//     private int subjectCount;

//     // Constructor for Student class
//     public Student(String studentName, int studentId, int maxSubjects) {
//         this.studentName = studentName;
//         this.studentId = studentId;
//         this.subjects = new Subject[maxSubjects]; // Array for storing Subject objects
//         this.subjectCount = 0;
//     }

//     // Method to add a subject
//     public void addSubject(String subjectName, int marks) {
//         if (subjectCount < subjects.length) {
//             subjects[subjectCount++] = new Subject(subjectName, marks);
//         } else {
//             System.out.println("Cannot add more subjects, maximum limit reached.");
//         }
//     }

//     // Method to calculate total marks
//     public int calculateMarks() {
//         int total = 0;
//         for (int i = 0; i < subjectCount; i++) {
//             total += subjects[i].getMarks();
//         }
//         return total;
//     }

//     // Method to calculate average marks
//     public double calculateAverageMarks() {
//         if (subjectCount == 0) return 0;
//         return (double) calculateMarks() / subjectCount;
//     }

//     // Method to display student details
//     public void displayStudentDetails() {
//         System.out.println("Student ID: " + studentId);
//         System.out.println("Student Name: " + studentName);
//         System.out.println("Subjects:");
//         for (int i = 0; i < subjectCount; i++) {
//             subjects[i].displaySubjectDetails();
//         }
//         System.out.println("Total Marks: " + calculateMarks());
//         System.out.println("Average Marks: " + calculateAverageMarks());
//     }

//     // Inner Subject class
//     class Subject {
//         private String subjectName;
//         private int marks;

//         // Constructor for Subject class
//         public Subject(String subjectName, int marks) {
//             this.subjectName = subjectName;
//             this.marks = marks;
//         }

//         // Getter for marks
//         public int getMarks() {
//             return marks;
//         }

//         // Method to assign marks
//         public void setMarks(int marks) {
//             this.marks = marks;
//         }

//         // Method to display subject details
//         public void displaySubjectDetails() {
//             System.out.println("Subject: " + subjectName + ", Marks: " + marks);
//         }
//     }
// }

// // Example usage
// public class Main {
//     public static void main(String[] args) {
//         // Create a Student object
//         Student student = new Student("Tejas", 101, 5);

//         // Add subjects
//         student.addSubject("Mathematics", 85);
//         student.addSubject("Physics", 78);
//         student.addSubject("Chemistry", 90);

//         // Display student details
//         student.displayStudentDetails();
//     }
// }


// class Employee {
//     // Fields for Employee class
//     private String eName;
//     private double salary;
//     private Department[] departments;
//     private int departmentCount;

//     // Constructor for Employee class
//     public Employee(String eName, double salary, int maxDepartments) {
//         this.eName = eName;
//         this.salary = salary;
//         this.departments = new Department[maxDepartments]; // Array to store Department objects
//         this.departmentCount = 0;
//     }

//     // Method to add a department
//     public void addDepartment(String departmentName, String location) {
//         if (departmentCount < departments.length) {
//             departments[departmentCount++] = new Department(departmentName, location);
//         } else {
//             System.out.println("Cannot add more departments, maximum limit reached.");
//         }
//     }

//     // Method to display employee details
//     public void displayEmployeeDetails() {
//         System.out.println("Employee Name: " + eName);
//         System.out.println("Salary: $" + salary);
//         System.out.println("Departments:");
//         for (int i = 0; i < departmentCount; i++) {
//             departments[i].displayDepartmentDetails();
//         }
//     }

//     // Inner Department class
//     class Department {
//         private String departmentName;
//         private String location;

//         // Constructor for Department class
//         public Department(String departmentName, String location) {
//             this.departmentName = departmentName;
//             this.location = location;
//         }

//         // Method to set department details
//         public void setDepartmentDetails(String departmentName, String location) {
//             this.departmentName = departmentName;
//             this.location = location;
//         }

//         // Method to display department details
//         public void displayDepartmentDetails() {
//             System.out.println("Department: " + departmentName + ", Location: " + location);
//         }
//     }
// }

// // Example usage
// public class Main {
//     public static void main(String[] args) {
//         // Create an Employee object
//         Employee employee = new Employee("Tejas", 75000, 3);

//         // Add departments
//         employee.addDepartment("Human Resources", "Bangalore");
//         employee.addDepartment("Finance", "Mumbai");
//         employee.addDepartment("IT", "Hyderabad");

//         // Display employee details
//         employee.displayEmployeeDetails();
//     }
// }


// import java.util.*;

// class ShoppingCart {
//     private List<Item> items;

//     // Constructor to initialize the shopping cart
//     public ShoppingCart() {
//         items = new ArrayList<>();
//     }

//     // Method to add an item to the shopping cart
//     public void addItem(String name, int quantity, double price) {
//         items.add(new Item(name, quantity, price));
//     }

//     // Recursive method
//     // Method to calculate the total price of all items in the cart
//     public double calculate() {
//         double total = 0;
//         for (Item item : items) {
//             total += item.getPrice() * item.getQuantity();
//         }
//         return total;
//     }

//     // Method to display the shopping cart's contents
//     public void display() {
//         if (items.isEmpty()) {
//             System.out.println("Shopping cart is empty.");
//         } else {
//             System.out.println("Shopping Cart Contents:");
//             for (Item item : items) {
//                 System.out.println("Item: " + item.getName() + 
//                                    "\n Quantity: " + item.getQuantity() + 
//                                    "\n Price: $" + item.getPrice() + 
//                                    "\n Total: $" + (item.getPrice() * item.getQuantity()));
//             }
//             System.out.println("Total Price: $" + calculate());
//         }
//     }

//     // Inner class to represent an item in the shopping cart
//     class Item {
//         private String name;
//         private int quantity;
//         private double price;

//         // Constructor to initialize the item
//         public Item(String name, int quantity, double price) {
//             this.name = name;
//             this.quantity = quantity;
//             this.price = price;
//         }

//         // Getters for the item's properties
//         public String getName() {
//             return name;
//         }

//         public int getQuantity() {
//             return quantity;
//         }

//         public double getPrice() {
//             return price;
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create a ShoppingCart object
//         ShoppingCart cart = new ShoppingCart();

//         // Add items to the cart
//         cart.addItem("Laptop", 1, 1000.00);
//         cart.addItem("Headphones", 2, 50.00);
//         cart.addItem("Mouse", 1, 25.00);

//         // Display cart contents
//         cart.display();
//     }
// }


// class Weather {

//     // Static nested class Forecast
//     static class Forecast {
//         private double temperature; // in Celsius
//         private double humidity;    // in percentage

//         // Constructor to initialize temperature and humidity
//         public Forecast(double temperature, double humidity) {
//             this.temperature = temperature;
//             this.humidity = humidity;
//         }

//         // Method to predict weather condition
//         public String predictWeather() {
//             if (temperature > 30 && humidity < 50) {
//                 return "Sunny";
//             } else if (temperature > 20 && humidity > 70) {
//                 return "Rainy";
//             } else {
//                 return "Cloudy";
//             }
//         }
//     }

//     // Method to display the forecast for a city
//     public static void displayForecast(String city, double temperature, double humidity) {
//         Forecast forecast = new Forecast(temperature, humidity); // Create Forecast object
//         System.out.println("City: " + city);
//         System.out.println("Temperature: " + temperature + "°C");
//         System.out.println("Humidity: " + humidity + "%");
//         System.out.println("Predicted Weather: " + forecast.predictWeather());
//         System.out.println("--------------------------------");
//     }

//     public static void main(String[] args) {
//         // Display weather forecasts for different cities
//         displayForecast("New York", 32, 40);  // Sunny
//         displayForecast("London", 18, 80);   // Rainy
//         displayForecast("Mumbai", 25, 60);   // Cloudy
//         displayForecast("Sydney", 28, 30);   // Sunny
//     }
// }


// import java.util.Scanner;
// import java.util.Arrays;

// public class StringOperations {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String original, reversed, sorted;
//         int choice;

//         System.out.print("Enter a string: ");
//         original = scanner.nextLine();

//         do {
//             System.out.println("\nMenu:");
//             System.out.println("1. Check whether the string is a palindrome");
//             System.out.println("2. Sort the string alphabetically");
//             System.out.println("3. Reverse the string");
//             System.out.println("4. Concatenate the original string with the reversed string");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     // Check if the string is a palindrome
//                     reversed = reverseString(original);
//                     if (original.equals(reversed)) {
//                         System.out.println("The string is a palindrome.");
//                     } else {
//                         System.out.println("The string is not a palindrome.");
//                     }
//                     break;

//                 case 2:
//                     // Sort the string alphabetically
//                     sorted = sortString(original);
//                     System.out.println("String in alphabetical order: " + sorted);
//                     break;

//                 case 3:
//                     // Reverse the string
//                     reversed = reverseString(original);
//                     System.out.println("Reversed string: " + reversed);
//                     break;

//                 case 4:
//                     // Concatenate the original and reversed strings
//                     reversed = reverseString(original);
//                     System.out.println("Concatenated string: " + original + reversed);
//                     break;

//                 case 5:
//                     System.out.println("Exiting the program...");
//                     break;

//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         } while (choice != 5);

//         scanner.close();
//     }

//     // Method to reverse a string
//     public static String reverseString(String str) {
//         StringBuilder sb = new StringBuilder(str);
//         return sb.reverse().toString();
//     }

//     // Method to sort a string alphabetically
//     public static String sortString(String str) {
//         char[] chars = str.toCharArray();
//         Arrays.sort(chars);
//         return new String(chars);
//     }
// }


// import java.util.Scanner;

// class Employee {
//     private String eName;
//     private double salary;

//     // Parameterized constructor
//     public Employee(String eName, double salary) {
//         this.eName = eName;
//         this.salary = salary;
//     }

//     // Method to format the employee's name
//     public void formatEmployeeName() {
//         String[] words = eName.split(" ");
//         StringBuilder formattedName = new StringBuilder();

//         for (String word : words) {
//             formattedName.append(word.substring(0, 1).toUpperCase()) // Capitalize the first letter
//                           .append(word.substring(1).toLowerCase())  // Convert remaining letters to lowercase
//                           .append(" ");
//         }

//         eName = formattedName.toString().trim(); // Update the name and remove trailing spaces
//     }

//     // Method to generate an email address for the employee
//     public String generateEmail() {
//         String[] nameParts = eName.split(" ");
//         String email = nameParts[0].toLowerCase().charAt(0) + nameParts[nameParts.length - 1].toLowerCase() + "@example.com";
//         return email;
//     }

//     // Method to display employee details
//     public void displayEmployee() {
//         System.out.println("Employee Name: " + eName);
//         System.out.println("Salary: $" + salary);
//         System.out.println("Email: " + generateEmail());
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of employees: ");
//         int n = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         Employee[] employees = new Employee[n];

//         // Read employee details from the user
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter name of employee " + (i + 1) + ": ");
//             String name = scanner.nextLine();
//             System.out.print("Enter salary of employee " + (i + 1) + ": ");
//             double salary = scanner.nextDouble();
//             scanner.nextLine(); // Consume the newline character

//             employees[i] = new Employee(name, salary);
//         }

//         // Process and display employee details
//         System.out.println("\nFormatted Employee Details:");
//         for (Employee emp : employees) {
//             emp.formatEmployeeName(); // Format the name
//             emp.displayEmployee();   // Display details
//             System.out.println();
//         }

//         scanner.close();
//     }
// }


// import java.util.*;

// class Student {
//     private String name;
//     private int age;

//     // Constructor
//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Get the student's name
//     public String getName() {
//         return name;
//     }

//     // Extract initials from the student's name
//     public String extractInitials() {
//         StringBuilder initials = new StringBuilder();
//         String[] words = name.split(" ");
//         for (String word : words) {
//             initials.append(word.charAt(0)); // Get the first character of each word
//         }
//         return initials.toString().toUpperCase();
//     }

//     // Remove whitespace from the student's name
//     public String removeWhitespace() {
//         return name.replaceAll("\\s", "");
//     }

//     // Display student details
//     public void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read number of students
//         System.out.print("Enter the number of students: ");
//         int n = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         List<Student> students = new ArrayList<>();

//         // Read student details
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter name of student " + (i + 1) + ": ");
//             String name = scanner.nextLine();
//             System.out.print("Enter age of student " + (i + 1) + ": ");
//             int age = scanner.nextInt();
//             scanner.nextLine(); // Consume newline
//             students.add(new Student(name, age));
//         }

//         // Display details of all students
//         System.out.println("\nStudent Details:");
//         for (Student student : students) {
//             student.display();
//         }

//         // Demonstrate extractInitials and removeWhitespace
//         System.out.println("\nStudent Initials and Names Without Whitespace:");
//         for (Student student : students) {
//             System.out.println("Original Name: " + student.getName());
//             System.out.println("Initials: " + student.extractInitials());
//             System.out.println("Name Without Whitespace: " + student.removeWhitespace());
//             System.out.println();
//         }

//         // List all student names containing a particular substring
//         System.out.print("Enter substring to search for: ");
//         String substring = scanner.nextLine();
//         System.out.println("\nStudents with names containing \"" + substring + "\":");
//         for (Student student : students) {
//             if (student.getName().toLowerCase().contains(substring.toLowerCase())) {
//                 System.out.println(student.getName());
//             }
//         }

//         // Sort students alphabetically and display
//         students.sort(Comparator.comparing(Student::getName));
//         System.out.println("\nStudents Sorted Alphabetically:");
//         for (Student student : students) {
//             student.display();
//         }

//         scanner.close();
//     }
// }
