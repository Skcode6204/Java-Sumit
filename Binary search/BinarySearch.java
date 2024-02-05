//Binary Search
/* Given an Array and a target, find whether the given target exists in array.
 arr = [2, 4, 5, 7, 15, 20, 24, 45, 50, 77] and targer = 24. */

import java.util.*;
public class BinarySearch{
    public static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void binarySearch(int[] arr, int target){
        int n = arr.length;    //'0' based indexing.
        int strt = 0;
        int end = n-1;

        while(strt <= end){
            int mid = (strt + end)/2;
            if(target == arr[mid]){
                //return true;
                System.out.println("Target found at index: "+mid);
                return;
            } else if(target < arr[mid]){
                end = mid - 1;
            }else{
                strt = mid + 1;
            }
        }
        //return false;
        System.out.println("Target not found.");
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target :");
        int target = sc.nextInt();

        System.out.println(target+"found at index :"+linearSearch(arr, target));
        System.out.println();
        binarySearch(arr, target);
        
    }
}