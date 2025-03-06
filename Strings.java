public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = "Manipal Institute of Technology";
        
        // 1. Basic Methods
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Equals 'Manipal': " + str.equals("Manipal"));
        System.out.println("Equals Ignore Case 'manipal institute of technology': " + str.equalsIgnoreCase("manipal institute of technology"));
        System.out.println("CompareTo 'Manipal': " + str.compareTo("Manipal"));
        System.out.println("CompareToIgnoreCase 'manipal institute of technology': " + str.compareToIgnoreCase("manipal institute of technology"));
        
        // 2. Substring and Modification
        System.out.println("Substring from index 8: " + str.substring(8));
        System.out.println("Substring (8, 18): " + str.substring(8, 18));
        System.out.println("Concatenation: " + str.concat(", Karnataka"));
        System.out.println("Replace 'Technology' with 'Engineering': " + str.replace("Technology", "Engineering"));
        System.out.println("Replace all 'i' with 'I': " + str.replaceAll("i", "I"));
        System.out.println("Replace first 'i' with 'I': " + str.replaceFirst("i", "I"));
        System.out.println("Trim: '" + str.trim() + "'");
        
        // 3. Searching in Strings
        System.out.println("Index of 'Institute': " + str.indexOf("Institute"));
        System.out.println("Index of 'i' from index 10: " + str.indexOf('i', 10));
        System.out.println("Last Index of 'i': " + str.lastIndexOf('i'));
        System.out.println("Contains 'Technology': " + str.contains("Technology"));
        System.out.println("Starts with 'Manipal': " + str.startsWith("Manipal"));
        System.out.println("Ends with 'Technology': " + str.endsWith("Technology"));
        
        // 4. Case Conversion
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("To Lower Case: " + str.toLowerCase());
        
        // 5. Splitting and Joining
        String[] words = str.split(" ");
        System.out.println("Splitting words:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Joining words with '-': " + String.join("-", words));
        
        // 6. Character Extraction
        char[] charArray = str.toCharArray();
        System.out.println("Characters in the string:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        // 7. Get Bytes
        byte[] byteArray = str.getBytes();
        System.out.println("Byte array representation:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
