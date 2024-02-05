/*given an n*n or n*m matrix "a", return all elements of the matrix in Spiral order.
    
  | 1  2  3 |    the spiral order of given matrix is givwn by : 1, 2, 3, 6, 9, 8, 7, 4, 5 
  |         |       
  | 4  5  6 |
  |         |
  | 7  8  9 |

*/

import java.util.*;
public class TwoDArrayprob8{
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiralMatrix(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;
        while(totalElements < r * c){
            // topRow --> leftCol to rigthCol
        for(int j = leftCol; j <= rightCol && totalElements < r*c; j++){
            System.out.println(matrix[topRow][j]+" ");  
            totalElements++;             
        }
        topRow++;

        // rigthCol --> topRow to bottomRow
        for(int i = topRow; i <= bottomRow && totalElements < r*c; i++){
            System.out.println(matrix[i][rightCol]+" ");
            totalElements++;
        }
        rightCol--;

        //bottomRow --> rigthCol to leftCol
        for(int j = rightCol; j >= leftCol && totalElements < r*c; j--){
            System.out.println(matrix[bottomRow][j]+" ");
            totalElements++;
        }
        bottomRow--;

        //leftCol --> bottomRow to topRow
        for(int i = bottomRow; i >= topRow && totalElements < r*c; i--){
            System.out.println(matrix[i][leftCol]+" ");
            totalElements++;
        }
        leftCol++;

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

        //System.out.println("Input Matrix :");
        //printMatrix(matrix);
        System.out.println("required spiral order matrix elements :");
        spiralMatrix(matrix, r, c);

    }
}        