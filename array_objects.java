import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user how many students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Creating an array of Student objects
        Student students[] = new Student[n];

        // Initializing the student objects with user input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            students[i] = new Student(name, rollNo, marks);
        }

        // Displaying student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}




// STUDENT code :

import java.util.*;

class STUDENT {
    String name;
    int id;
    int[] marks;

    // Constructor
    STUDENT(String name, int id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks; // array of marks for 5 subjects
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total Marks: " + calculate());
    }

    // Calculate total marks
    int calculate() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        STUDENT[] students = new STUDENT[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline

            students[i] = new STUDENT(name, id, marks);
        }

        System.out.println("\nStudent Details:");
        for (STUDENT s : students) {
            s.display();
            System.out.println("---------------------");
        }

        sc.close();
    }
}

