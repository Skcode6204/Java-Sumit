//check if we can partioned the array into two subarrays with equal sum. more formally, check that the prefix sum
//of the part of the array is equal to the suffix sum of rest of the array.


import java.util.*;
public class arrayprob29{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static int findArraySum(int[] arr){
        int totalSum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    public static boolean makeEqualPartitionOfArray(int[] arr){
        int totalSum = findArraySum(arr);
        int n = arr.length;
        int prefsum = 0;
        for(int i=0; i<n; i++){
            arr[i] += arr[i];

            int suffixSum = totalSum - arr[i];               //here arr[i] represent prefixSum; that is (suffixSum = totalSum - prefixSum);
            if(suffixSum == arr[i]){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("equal partition possible :" +makeEqualPartitionOfArray(arr));
    }
}
