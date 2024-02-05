// Given a mountain array, find the peak element index of the given array, where there is no. of peak element in the mountain Array.
// I/P :- {4, 5, 8, 3}; ans    O/P :- Index 2.

import java.util.*;
public class BinarySearch11{
    public static int findPeakElement(int[] arr){
        int n = arr.length;
        int strt = 0;
        int end = n-1;

        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if((arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){       //uphill or ascending
                strt = mid+1;
            }
            else{                           //down or descending
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 3};
        System.out.println("The peak element is at index : "+findPeakElement(arr));
    }
}