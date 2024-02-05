//

import java.util.*;
public class BinarySearch9{
    public static boolean searchIn2DArray(int[][] arr, int target){
        //no of rows = n ; no. of column = m;
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = m-1;
        while (i < n && j >= 0) {
            if (arr[i][j] == target) return true;

            if(target > arr[i][j]){
                i++;    //move down 
            }else{
                j--;    //move left;
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
        System.out.println("required target "+target+" is exists in array : "+searchIn2DArray(arr, target));
    }
}