//Given an integer array "a", return the prefix sum/running sum in the same array without creating an new array;
//what is prefix sum? 
// supppose array is : 1 2 3 4
//prefix sum array is : 1, 1+2=3, 3+3=6, 6+4=10
//prefix sum array is : 1, 3, 6, 10;

import java.util.*;
public class arrayprob27{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
        //System.out.println();
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
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        prefixSumArray(arr);
        System.out.println("required array");
        printArray(arr);
    }
}