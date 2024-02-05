//find the target value in the 2D Array.

import java.util.*;
public class BinarySearch8{
    public static boolean searchMatrix(int[][] arr, int target){
        //no. of rows = n , no. of column = m;
        int n = arr.length;
        int m = arr[0].length;
        int strt = 0, end = n*m-1;

        while(strt <= end){
            int mid = strt + (end - strt)/2;
            int midElts = arr[mid/m][mid%m];
            if(midElts == target){
                return true;
            }
            if(target < midElts){
                end = mid - 1;
            }else{
                strt = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows :");
        int n = sc.nextInt();
        System.out.println("enter the no. of columns :");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter "+n*m+" elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter target :");
        int target = sc.nextInt();
        System.out.println("required target "+target+" is exists in array : "+searchMatrix(arr, target));
    }
}