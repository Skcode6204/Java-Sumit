/*Given a matrix "a" of dimension N*M and 2 coordinates (l1, r1) and (l2, r2).
return the sum of the rectangle from (l1, r1) to (l2, r2)
    METHOD :- 3 - prefix sum over columns and rows both.
*/

import java.util.*;
public class TwoDArrayprob12{
    //calculate row wise and column wise sum
    //matrix[i][j] = sum of rectangle( (0,0) (i,j)).
    public static void prefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        //if  r > 0
        int c = matrix[0].length;
        //traverse horizontally to calculate the row wise prefix sum.
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                matrix[i][j] = matrix[i][j]+matrix[i][j-1];
            }
        }

        //traverse vertically to calculate the column wise prefix sum.
        for(int j=0; j<c; j++){    //fixing column
            for(int i=1; i<r; i++){      //row changes here
                matrix[i][j] = matrix[i][j] + matrix[i-1][j];
            }
        }
    }

    public static int findSumRectangle3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans=0, sum=0, up=0, left=0, leftup=0;
        prefixSumMatrix(matrix);

        sum = matrix[l2][r2];

        if(r1 >= 1){
            left = matrix[l2][r1-1];
        }
        if(l1 >= 1){
            up = matrix[l1-1][r2];
        }
        if(l1 >= 1 && r1 >= 1){
            leftup = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftup;

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter matrix values :");
        int totalElements = r*c;
        System.out.println("enter "+totalElements+" elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum " + findSumRectangle3(matrix, l1, r1, l2, r2));
    }


}