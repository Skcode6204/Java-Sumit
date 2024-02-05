/*Given a matrix "a" of dimension N*M and 2 coordinates (l1, r1) and (l2, r2).
return the sum of the rectangle from (l1, r1) to (l2, r2).
    METHOD :- 1 - Brute Force Technique.
*/

import java.util.*;
public class TwoDArrayprob10{
    public static int findSumRectangle(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j]; 
            }
        }
        return sum;
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

        System.out.println("Rectangle Sum " + findSumRectangle(matrix, l1, r1, l2, r2));
    }
}