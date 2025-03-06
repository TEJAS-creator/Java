class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class StudentArray {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];
        
        // Initializing the student objects
        students[0] = new Student("Alice", 101, 85.5);
        students[1] = new Student("Bob", 102, 90.0);
        students[2] = new Student("Charlie", 103, 78.2);
        
        // Displaying student details
        System.out.println("Student Details:");
        for (Student i : students) {
            i.display();
        }
    }
}
