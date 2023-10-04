//Numeral Row Square Pattern in Java --------------------------------------------
/*
Enter Value : 5

Output :

1 1 1 1 1 
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Define a class named pattern_4
class pattern_4 {
    // Define a public method named Pattern that takes an integer 'n' as a parameter
    public void Pattern(int n) {
        // Outer loop for rows (iterates from 1 to 'n')
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns (iterates from 1 to 'n')
            for (int j = 1; j <= n; j++) {
                // Print the value of 'i' (the current row number) followed by a space
                System.out.print(i + " ");
            }
            // Move to the next line after each row to create a new row in the pattern
            System.out.println();
        }
    }
}

public class day_13_Practice_Pattern_4_D30_09_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_4 obj = new pattern_4(); // Create an instance of the pattern_3 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_3 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}