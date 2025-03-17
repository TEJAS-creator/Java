public class StarPatterns {
    public static void main(String[] args) {
        int n = 5;

        // 1. Square Star Pattern
        System.out.println("1. Square Star Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        */

        // 2. Right-Angled Triangle Star Pattern
        System.out.println("2. Right-Angled Triangle Star Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        */

        // 3. Inverted Right-Angled Triangle Star Pattern
        System.out.println("3. Inverted Right-Angled Triangle Star Pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
        */

        // 4. Pyramid Star Pattern
        System.out.println("4. Pyramid Star Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
            *    
           ***   
          *****  
         ******* 
        *********
        */

        // 5. Inverted Pyramid Star Pattern
        System.out.println("5. Inverted Pyramid Star Pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
        *********
         ******* 
          *****  
           ***   
            *    
        */

        // 6. Diamond Star Pattern
        System.out.println("6. Diamond Star Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
            *    
           ***   
          *****  
         ******* 
        *********
         ******* 
          *****  
           ***   
            *    
        */

        // 7. Hollow Square Pattern
        System.out.println("7. Hollow Square Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
        * * * * * 
        *       * 
        *       * 
        *       * 
        * * * * * 
        */

        // 8. Hollow Pyramid Pattern
        System.out.println("8. Hollow Pyramid Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        /*
        Output:
            *    
           * *   
          *   *  
         *     * 
        *********
        */

    }
}
