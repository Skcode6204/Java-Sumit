/*Given an integer "n", return the first n rows of Pascal's triangle.
In pascal's triangle, each number is the sum of the two numbers directly above it as shown :
             
|  1              |    |    1     |  the given pattern shows the pascal's triangle where the leftmost and rightmost are
|  1  1           |    |   1 1    |  surrounded by 1 and below number is the addition of above two number.
|  1  2  1        | or |  1 2 1   |  
|  1  3  3  1     |    | 1 3 3 1  |
|  1  4  6  4  1  |    |1 4 6 4 1 |
*/

import java.util.*;
public class TwoDArrayprob7{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();

        }
    }

    public static int[][] pascalTriangle(int n){
        int[][] ans = new int[n][];

        for(int i=0; i<n; i++){
            //ith row has i+1 columns.
            /*
             * ans[0] = new int[1].
             * ans[1] = new int[2]
             * ans[2] = new int[3]
             */

            ans[i] = new int[i+1];

            /* 1st and last element of every row is 1 */

            ans[i][0] = ans[i][i] = 1;

            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();

        int[][] ans = pascalTriangle(n);
        printMatrix(ans);

    }
}