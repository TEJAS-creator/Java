// program 1
public class Student {
     String name;
     int age;

    void register(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Invalid age! Age must be between 18 and 60.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student Registered Successfully: " + name + ", Age: " + age);
    }
}

public class StudentAgeValidationDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        // Valid registration
        try {
            student1.register("Tejas", 22);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid registration
        Student student2 = new Student();
        try {
            student2.register("Ravi", 65);  // Invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Another invalid example
        Student student3 = new Student();
        try {
            student3.register("Kiran", 15);  // Invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



// program 2
public class Student {
    double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Number of subjects cannot be zero.");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}

public class MarksValidationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Valid input
        try {
            double avg = student.calculateAverage(450, 5);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid input: number of subjects is zero
        try {
            double avg = student.calculateAverage(400, 0);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Another invalid input: total marks is zero
        try {
            double avg = student.calculateAverage(0, 4);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
