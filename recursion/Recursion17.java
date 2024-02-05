//wap to find all indices of target element in the array using recursion.

import java.util.*;
public class Recursion17{
    public static void findAllIndices(int[] arr, int n, int target, int idx){
        //base case.
        if (idx >= n) return ;

        //self work
        if(arr[idx] == target){
            System.out.println(idx);
        }

        //recursive call
        findAllIndices(arr, n, target, idx + 1);

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
        

        System.out.println("item found at indices ");
        findAllIndices(arr, n, target, idx);
    }
} 