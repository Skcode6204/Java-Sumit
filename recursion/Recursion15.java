//Linear Search in Array- Print whether x exists in the array or not, by recursion.

import java.util.*;
public class Recursion15{
    public static boolean linearSearch(int[] arr, int n, int target, int idx){
        //base case
        if(idx >= n){
            return false;
        }
        //self work.
        if(arr[idx] == target){
            return true;
        }
        //recursive work
        if(linearSearch(arr, n, target, idx+1)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target :");
        int target = sc.nextInt();
        if(linearSearch(arr, n, target, idx)){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }

        linearSearch(arr, n, target, idx);
    }

}