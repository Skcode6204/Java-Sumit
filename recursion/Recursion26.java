//print the sum of all the subset

import java.util.*;
public class Recursion26{
    public static void subsetSum(int[] arr, int n, int idx, int sum){
        //base case.
        if(idx >= n){
            System.out.print(sum+" ");
            return;
        }
        //recursion & self work.
        //current idx + Sum
        subsetSum(arr, n, idx+1, sum);
        //current idx
        subsetSum(arr, n, idx+1, sum + arr[idx]);

    }
    public static void main(String[] args) {
        int sum = 0;
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for (int i=0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("required subset sum is :");
        subsetSum(arr, n, idx, sum);
        
    }
}