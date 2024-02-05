//wap to initialize 2 D Array by user.


import java.util.*;
public class TwoDArrayprob1{
    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){     //for row
            for(int j=0; j<arr[i].length; j++){    //for column
                System.out.println(arr[i][j]+ " ");
            }
            //System.out.println();
            
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int r = sc.nextInt();
        System.out.println("enter the no. of columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("enter "+r*c+ " elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}