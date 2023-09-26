//Size of Array using Length Function in Java --------------------------------------------
public class day_7_4_D23_09_2023 {
    // Define the main method
    public static void main(String[] args) {
        // 1D Array
        int[] oneDimensionalArray = new int[5];
        int oneDSize = oneDimensionalArray.length;

        // 2D Array
        int[][] twoDimensionalArray = new int[3][4];
        int twoDRows = twoDimensionalArray.length;    // Number of rows
        int twoDColumns = twoDimensionalArray[0].length; // Number of columns

        // 3D Array
        int[][][] threeDimensionalArray = new int[2][3][2];
        int threeDSizeX = threeDimensionalArray.length;       // Size along X-axis
        int threeDSizeY = threeDimensionalArray[0].length;    // Size along Y-axis
        int threeDSizeZ = threeDimensionalArray[0][0].length; // Size along Z-axis

        // Print the sizes
        System.out.println("1D Array Size: " + oneDSize);
        System.out.println("2D Array Size (Rows x Columns): " + twoDRows + " x " + twoDColumns);
        System.out.println("3D Array Size (X x Y x Z): " + threeDSizeX + " x " + threeDSizeY + " x " + threeDSizeZ);
    }
}
