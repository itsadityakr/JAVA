//Inverted Triangle Star Pattern in Java --------------------------------------------
/*
Enter Value : 6

Output :

* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Create a class named pattern_1
class pattern_1 {
    // Define a public method named "pattern" that takes an integer input
    public void pattern(int input) {
        int i, j, k; // Declare integer variables i, j, and k
        System.out.println("\nOutput : \n"); // Print a message indicating the output will follow

        // Start a for loop with i starting at 0 and ending when i is less than the input
        // The outermost loop manages the rows of the inverted triangle pattern.
        // It starts with 'i' at 0 and continues while 'i' is less than the 'input' value,
        // which represents the number of rows to print.
        // Each iteration of this loop corresponds to a new row in the inverted triangle pattern.
        for (i = 0; i < input; i++) {
            // Print spaces
            for (j = 0; j < i; j++) {
                System.out.print(" "); // Print a space
            }
            // Print asterisks
            for (k = i; k < input; k++) {
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(" "); // Move to the next line after each row is printed
        }

    }
}

// Create a public class named day_10_Practice_Pattern_D28_09_2023
public class day_11_Practice_Pattern_1_D28_09_2023 {
    // Define the main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_1 obj = new pattern_1(); // Create an instance of the pattern_1 class
        obj.pattern(input); // Call the "pattern" method of the pattern_1 object with the user's input
        sc.close(); // Closes the scanner class so that resources can't get leaked
    }
}
