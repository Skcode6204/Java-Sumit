// Return the index of the target integer in the rotated array.

import java.util.*;
public class BinarySearch7{
    public static int searchDuplicates(int[] arr, int x){    //here x is the target.
        int n = arr.length;
        int strt = 0;
        int end = n-1;

        while(strt <= end){
            int mid = strt + (end-strt)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[strt] == arr[mid] && arr[end] == arr[mid]){
                strt++;
                end--;
            }
            else if(arr[mid] <= arr[end]){      // mid to end is sorted.
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
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 4};
        int x = 2;
        System.out.println("requied Target "+x+" is in the index : "+searchDuplicates(arr, x));
    }
}