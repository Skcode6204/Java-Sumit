//

import java.util.*;
public class SortNumber3{
    public static void printArray(int[] arr){
        for (int val : arr) { 
            System.out.print(val + " "); 
        }
    }
     public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sort012(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        //explore the unknown region.
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 2, 1, 0, 1, 2, 1, 2, 0, 1, 0, 2};
        System.out.println("Array after Sorting :");
        sort012(arr);
        printArray(arr);
    }
}