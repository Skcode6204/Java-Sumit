//linear Search - return index if given target exists in the array, by recursion.

import java.util.*;
public class Recursion16{
    public static int findIndex(int[] arr, int n, int target, int idx){
        //base case.
        if(idx >= n){
            return -1;
        }
        //self work
        if (arr[idx] == target) {
            return idx;
        }
        //recursive work
        return findIndex(arr, n, target, idx+1);
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
        

        System.out.println("item found at index "+findIndex(arr, n, target, idx));
    }
}