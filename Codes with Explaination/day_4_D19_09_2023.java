        //v018 Need For Loop in Java --------------------------------------------
        //v019 While Loop in Java --------------------------------------------
        //v020 Do While Loop in Java --------------------------------------------
        //v021 For Loop in Java --------------------------------------------
public class day_4_D19_09_2023 {
    public static void main (String [] a){
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        // In a for loop:
        // - We initialize a variable 'i' to 1 at the beginning.
        // - The loop runs as long as 'i' is less than or equal to 5.
        // - After each iteration, 'i' is incremented by 1.
        // - It prints the current iteration number.

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1; // Initialize 'j' to 1.
        while (j <= 5) { // Continue while 'j' is less than or equal to 5.
            System.out.println("Iteration " + j);
            j++; // Increment 'j' by 1 in each iteration.
        }
        // In a while loop:
        // - We initialize a variable 'j' to 1 before the loop.
        // - The loop continues while 'j' is less than or equal to 5.
        // - Inside the loop, we print the current iteration and increment 'j'.

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1; // Initialize 'k' to 1.
        do {
            System.out.println("Iteration " + k);
            k++; // Increment 'k' by 1 in each iteration.
        } while (k <= 5); // Continue while 'k' is less than or equal to 5.
        // In a do-while loop:
        // - We initialize a variable 'k' to 1 before the loop.
        // - The loop body is executed at least once.
        // - After each iteration, 'k' is incremented by 1.
        // - It continues as long as 'k' is less than or equal to 5.
        //v022 Which Loop To Use in java --------------------------------------------
        /* Use a for loop when you know the number of iterations in advance
        or need to iterate over a range of values.
        Use a while loop when you don't know the exact number of iterations and want to loop based
        on a condition.
        Use a do-while loop when you want to ensure that the loop body executes
        at least once, even if the condition is initially false. */
    }
}
