//wap to rotate the matrix in 90 degree and take input from user.

import java.util.*;
public class TwoDArrayprob6{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeInPlace(int[][] matrix, int r, int c){
        
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        

    }

    public static void reverseArray(int[] arr){
        int i=0; int j = arr.length;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }



    public static void findRotate(int[][] matrix, int n){
        //transpose
        transposeInPlace(matrix, n, n);

        //reverse each row of transpose matrix;
        for(int i=0; i<n; i++){
            reverseArray(matrix[i]);
        }

        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("enter "+totalElements+" elements");
        System.out.println("enter matrix values :");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix :");
        printMatrix(matrix);

        findRotate(matrix, r);

        System.out.println("Rotation of matrix :");
        printMatrix(matrix);

    }
}