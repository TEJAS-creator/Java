import java.util.Scanner;

public class TypingSpeed {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a sample text
        String sampleText = "The quick brown fox jumps over the lazy dog";

        // Display the sample text to the user
        System.out.println("Type the following sentence as fast as you can:");
        System.out.println(sampleText);

        // Capture the starting time
        long startTime = System.currentTimeMillis();

        // Get user input
        System.out.println("\nStart typing...");
        String userInput = scanner.nextLine();

        // Capture the ending time
        long endTime = System.currentTimeMillis();

        // Calculate the time taken to type the sentence
        long timeTaken = endTime - startTime; // Time in milliseconds

        // Convert time taken to seconds
        double timeInSeconds = timeTaken / 1000.0;

        // Calculate words per minute (WPM)
        int wordCount = sampleText.split(" ").length;
        double wordsPerMinute = (wordCount / timeInSeconds) * 60;

        // Display results
        System.out.println("\nTime taken: " + timeInSeconds + " seconds");
        System.out.println("Your typing speed: " + wordsPerMinute + " words per minute");

        // Check if the user typed the sentence correctly
        if (userInput.equals(sampleText)) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Oops! You made a mistake. Try again.");
        }

        scanner.close();
    }
}
