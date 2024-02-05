//given an array of integer of size n, answer "q" queries where you need to print the sum of values in a given range of indices
//from l to r(both included).

import java.util.*;
public class arrayprob28{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        arr[0] = arr[0];
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=1; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        int[] prefsum = prefixSumArray(arr) ;

        System.out.println("enter number of queries :");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("enter range :");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = arr[r] - arr[l-1];

            System.out.println("sum " +ans);
        }
    }
}