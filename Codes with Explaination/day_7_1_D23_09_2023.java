//v029 Need of an Array in Java --------------------------------------------
//v030 Creation of Array in Java --------------------------------------------
public class day_7_1_D23_09_2023 {
    public static void main (String [] args){
        int i;
        int[] num = {3,7,2,4};
        //Updating Array;
        num[1] = 14;
        //For loop to print array;
        //Loop starts from 0 to array - 1;
        for (i=0;i<4;i++){
            System.out.println(num[i]);
        }
        //Dynamically allocation in array
        //int[] num1 = new int[M];
        //M is the size of array
        int[] num2 = new int[]{10, 20, 30};
        System.out.println(num2[1]);
    }
}