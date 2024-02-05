

import java.util.*;
public class BinarySearch2{
    public static boolean recBinarySearch(int[] arr, int strt, int end, int target){
        int n = arr.length;
        //base case.
        if(strt > end) return false;
        int mid = (strt + end)/2;
        if(target == arr[mid]){
            return true;
            //System.out.println(("Target found at Index :"+mid));
            //return;
        } else if(target < arr[mid]){
            return recBinarySearch(arr, strt, mid-1, target);
        }else{
            return recBinarySearch(arr, mid+1, end, target);
        }
        //System.out.println("target not found");
        
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int target = 0;
        while(target != 10){
            System.out.printf("%d exists in arr :%b \n", target, recBinarySearch(arr, 0, arr.length-1, target));
            target++;
        }
        
    }
}