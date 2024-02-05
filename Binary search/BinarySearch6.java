// Return the index of the target integer in the rotated array.

import java.util.*;
public class BinarySearch6{
    public static int searchIndex(int[] arr, int x){    //here x is the target.
        int n = arr.length;
        int strt = 0;
        int end = n-1;

        while(strt <= end){
            int mid = strt + (end-strt)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < arr[end]){      // mid to end is sorted.
                if(x > arr[mid] && x <= arr[end]){
                    strt = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            else{                               // strt to mid is sorted.
                if(x >= arr[strt] && x < arr[mid]){
                    end = mid - 1;
                }else{
                    strt = mid + 1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int x = 7;
        System.out.println("requied Target "+x+" is in the index : "+searchIndex(arr, x));
    }
}