// Program 1:
import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        for(int i =0;i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println("Reversed String: "+sb.toString());
    }
}


// Program 2:
import java.util.*;

class Student {
    public String name;

    Student(String name) {
        this.name = name;
    }

    // i. Extract initials
    String extractInitials() {
        StringBuilder initials = new StringBuilder();
        String[] parts = name.trim().split("\\s+");
        for (String part : parts) {
            initials.append(part.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

    // ii. Remove whitespace
    String removeWhitespace() {
        StringBuilder result = new StringBuilder();
        for (char ch : name.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        // Read student names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students.add(new Student(name));
        }

        // Display student names
        System.out.println("\nAll Student Names:");
        for (Student s : students) {
            System.out.println(s.name);
        }

        // iii. Find names containing substring
        System.out.print("\nEnter substring to search: ");
        String substring = sc.nextLine().toLowerCase();
        System.out.println("Students containing '" + substring + "':");
        for (Student s : students) {
            if (s.name.toLowerCase().contains(substring)) {
                System.out.println(s.name);
            }
        }

        // iv. Sort students alphabetically
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\nStudents sorted alphabetically:");
        for (Student s : students) {
            System.out.println(s.name);
        }

        // Demonstrate initials and whitespace removal
        System.out.println("\nInitials and Names without Whitespace:");
        for (Student s : students) {
            System.out.println("Original Name: " + s.name);
            System.out.println("Initials: " + s.extractInitials());
            System.out.println("Without Spaces: " + s.removeWhitespace());
            System.out.println();
        }
        sc.close();
    }
}
