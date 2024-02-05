//wap to transpose a matrix where we tranpose the matrix in tranpose in place and take input from user.

import java.util.*;
public class TwoDArrayprob5{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j] +" ");
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
        System.out.println("Transpose of Matrix");
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);
    }

}