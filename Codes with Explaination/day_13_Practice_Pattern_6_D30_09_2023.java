//Number Changing Pyramid in Java --------------------------------------------
/*
Enter Value : 7

Output :

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28

*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Create a class named pattern_6
class pattern_6 {
    // Define a public method named "Pattern" that takes an integer input 'n'
    public void Pattern(int n) {
        // Initialize a count variable to keep track of the printed numbers
        int count = 0;
        
        // Outer loop for rows (iterates from 1 to 'n')
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns (iterates from 1 to 'i')
            for (int j = 1; j <= i; j++) {
                // Increment the count and print its value followed by a space
                count += 1;
                System.out.print(count + " ");
            }
            // Move to the next line after each row to create a new row in the pattern
            System.out.println();
        }
    }
}

public class day_13_Practice_Pattern_6_D30_09_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_6 obj = new pattern_6(); // Create an instance of the pattern_1 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_2 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}
