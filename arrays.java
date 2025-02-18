// 1D array
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();  // Read the size of the array
        
        int[] arr = new int[n];  // Declare an array of size n

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  // Store input values in the array
        }

        System.out.println("Array elements are: " + Arrays.toString(arr));
    }
}


// 2D array
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows (M) and columns (N)
        System.out.print("Enter the number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n]; // Declare M×N matrix

        // Input the matrix
        System.out.println("Enter the elements of the " + m + "x" + n + " matrix:");
        for (int i = 0; i < m; i++) { // Loop for rows
            for (int j = 0; j < n; j++) { // Loop for columns
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The entered " + m + "x" + n + " matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}



// for-each loop
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();  // Read the size of the array
        
        int[] arr = new int[n];  // Declare an array of size n

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  // Store input values in the array
        }

        // Display array elements using for-each loop
        System.out.println("Array elements are: ");
        for (int num : arr) {  // Iterates over each element in the array
            System.out.print(num + " ");
        }
    }
}
