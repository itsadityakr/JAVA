//v031 Multi Dimensional Array in Java --------------------------------------------
// For Each loop or Enhanced for Loop in Java --------------------------------------------
public class day_7_2_D23_09_2023 {
    public static void main (String [] args){
        //2D array with 3 Rows and 4 Columns;
        int[][] array = new int[3][4];
        int i,j;
        for(i=0;i<3;i++){
            for (j=0;j<4;j++){
                /*Math.random function returns double value ranges between
                0<=n <1 it generates a value in the range [0, 1);*/
                array[i][j] = (int)(Math.random()*100);
                /*Type casting double to int first we calculate (Math.random()*100)
                then we convert double to int.*/
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        /*Enhanced for loop;
        Syntax :- for (elementType element : arrayOrCollection) {
                            Code to be executed for each element
                    }*/
        // Declare an enhanced for loop to iterate through a two-dimensional array named 'array'
        for (int[] n : array) {
        // In each iteration, 'n' represents a one-dimensional array within 'array'
        // Start a nested enhanced for loop to iterate through the elements of the one-dimensional array 'n'
            for (int m : n) {
            // In each nested iteration, 'm' represents an individual integer element within 'n'
            // Print the value of 'm' followed by a space, without a newline character
            System.out.print(m + " ");
            }
            // After the inner loop completes (all elements of 'n' have been processed),
            // print a newline character to move to the next line for the next 'n'
            System.out.println();
        }
        // The outer loop continues, moving to the next one-dimensional array within 'array'
    }
}