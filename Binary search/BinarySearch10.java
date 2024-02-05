//

import java.util.*;
public class BinarySearch10{
    public static int findPeakIndex(int[] arr){
        int n = arr.length;
        int strt = 0;
        int end = n-1;
        int ans = -1;

        while(strt <= end){
            int mid = strt + (end-strt)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                strt = mid + 1;    
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 4, 3, 2};
        System.out.println("The peak element is at index : " + findPeakIndex(arr));
    }
}