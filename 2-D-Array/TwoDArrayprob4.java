//wap to transpose a matrix by taking input from user.

import java.util.*;
public class TwoDArrayprob4{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println(); 
        }

    }

    public static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and column of matrix 1");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("enter " +totalElements+ " values");
        System.out.println("enter the matrix  values :");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        System.out.println("Input Matrix :");
        printMatrix(matrix);
        System.out.println("Transpose of Matrix");
        int[][] ans = findTranspose(matrix, r, c);
        printMatrix(ans);
    }
}