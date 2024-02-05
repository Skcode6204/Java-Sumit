//

import java.util.*;
public class BinarySearch5{
    public static int findMinimum(int[] arr){
        int n = arr.length;
        int strt = 0;
        int end = n-1;
        int ans = -1;

        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid-1;
            }else{
                strt = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("minimum element of rotated array is : "+findMinimum(arr));
    }
}