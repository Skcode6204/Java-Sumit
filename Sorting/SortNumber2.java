/* Given an array of positive and negetive integers, segregate them in linear time and constant space.
the output should print all negetive numbers, followed by all positive numbers.
Input :- [19, -20, 7, -4, -13, 11, -5, 3]
Output :- [-20, -4, -13, -5, 7, 11, 19, 3]*/

import java.util.*;
public class SortNumber2{
    public static void printArray(int[] arr){
        for(int val = 0; val < arr.length; val++){
            System.out.print(arr[val]+" ");
        }
    }
    public static void partition(int[] arr){
        int n = arr.length;
        int l = 0, r = n-1;
        while(l < r){
            while(arr[l] < 0) l++;
            while(arr[r] >= 0) r--;
            
            if(l < r){
                //swap arr[l], arr[r].
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        System.out.println("Array after Sorting :");
        partition(arr);
        printArray(arr);
    }

}