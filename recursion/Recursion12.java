//wap to print the value of element in the array using recursion.

import java.util.*;
public class Recursion12{
    public static void printArray(int[] arr, int idx){
        //base case
        if(idx == arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);

        //recursive work
        printArray(arr, idx+1);

    }
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        //System.out.println("enter index :");
        //int idx = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("required array :");
        printArray(arr, idx);
    }
}