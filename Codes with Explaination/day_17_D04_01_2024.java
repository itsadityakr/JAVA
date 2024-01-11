import java.util.Scanner;

public class day_17_D04_01_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and Columns :-");
        int r = sc.nextInt(),c = sc.nextInt();
        int array[][] = new int[r][c];
        System.out.println("Enter Elements :-");
        //Take input
        int i,j;
        for(i=0;i<r;i++){
            for (j=0;j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.println("'"+array[i][j]+"'"+" at Row Number = "+i+" at Column Number = "+j);
            }
        }
        System.out.println("Enter a number to find :-");
        int element = sc.nextInt();
        for(i=0;i<r;i++){
            for (j=0;j<c;j++){
                if (array[i][j]==element){
                    System.out.println("'"+element+"'"+" found at Row Number = "+i+" at Column Number = "+j);
                }
            }
        }
    }
}
