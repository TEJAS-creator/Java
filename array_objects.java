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
