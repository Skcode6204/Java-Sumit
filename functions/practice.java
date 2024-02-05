/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class practice
{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != c2 || r1 != r2){
            System.out.println("invalid, addition is not possible ");
            return;
        }
        int [][] sum = new int[r1][c1];
        
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum of matrix 1 & Matrix 2 :");
        printMatrix(sum);
        
    }
	public static void main(String[] args) {
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

        addMatrix(a, r1, c1, b, r2, c2);



    }
}

