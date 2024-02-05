//wap to multiply two matrices in 2d array by taking input from user.

import java.util.*;
public class TwoDArrayprob3{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("invalid input - multiplication not possible");
            return;
        }

        int[][] multiply = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){

                    /*
                     * i = 1, j = 0
                     * multiply[i][j] = ith row of a * jth col of b.
                     */
                    multiply[i][j] += a[i][k] * b[k][j];
                }
                
            }
        }
        System.out.println("multiplication of two matrices");
        printMatrix(multiply);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows and columns for matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter matrix values");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter no. of rows and columns for matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("enter matrix values");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix 1");
        printMatrix(a);
        System.out.println("matrix 2");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);



    }
}

   