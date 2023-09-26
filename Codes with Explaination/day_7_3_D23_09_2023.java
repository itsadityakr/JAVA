//v032 Jagged and 3D Array in Java --------------------------------------------
public class day_7_3_D23_09_2023 {
    // Define the main method
    public static void main(String[] args) {
        // Create a jagged array 'num' to hold integers
        int[][] num = new int[3][]; // Jagged Array

        // Initialize the sub-arrays with different lengths
        num[0] = new int[3]; // First sub-array with 3 elements
        num[1] = new int[4]; // Second sub-array with 4 elements
        num[2] = new int[2]; // Third sub-array with 2 elements

        // Fill the jagged array with random integers between 0 and 9
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        // Print the elements of the jagged array
        // In Enhanced for loop, we don't need to mention the size of the array
        for (int[] n : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println(); // Move to the next line after each sub-array
        }
        System.out.println("3D Array ____________________________________");
        // Create a 3D integer array 'array_3d' with dimensions [3][4][5]
        int[][][] array_3d = new int[3][4][5];

        // Declare variables 'x', 'y', and 'z' for array indices
        int x, y, z;

        // Use nested loops to fill the 3D array with random integers between 0 and 9
        for (x = 0; x < array_3d.length; x++) {
            for (y = 0; y < array_3d[x].length; y++) {
                for (z = 0; z < array_3d[x][y].length; z++) {
                    array_3d[x][y][z] = (int) (Math.random() * 10);
                }
            }
        }

        // Use enhanced for-each loops to print the values of the 3D array
        for (int[][] xa : array_3d) { // Iterate over the x-axis
            for (int[] ya : xa) {      // Iterate over the y-axis
                for (int za : ya) {    // Iterate over the z-axis
                    // Print the current value followed by a space
                    System.out.print(za + " ");
                }
                // Move to the next line after each 2D slice along the z-axis (y-axis)
                System.out.println();
            }
            // Separate each 2D slice along the x-axis with an empty line
            System.out.println();
        }
    }
}
