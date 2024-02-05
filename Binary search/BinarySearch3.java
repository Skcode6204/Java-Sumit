//Find the 1st occurence of a given element x, given that the given array is sorted. if no occurence of x is found return -1.

import java.util.*;
public class BinarySearch3{
    public static int firstOccurence(int[] arr, int x){
        int n = arr.length;
        int strt = 0;
        int end = n-1;
        int fo = -1;

        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(arr[mid] == x){
                fo = mid;
                end = mid-1;
            }else if(x < arr[mid]){
                end = mid - 1;
            }else{
                strt = mid + 1;
            }
        }
        return fo;

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 4, 5, 5, 5, 6, 4, 4, 2};
        int x = 5;
        System.out.println(x+" found 1st time in index: "+firstOccurence(arr, x));
    }

}
