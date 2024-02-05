

import java.util.*;
public class Recursion14{
    public static int sumOfArray(int[] arr, int idx){
        //base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        //recursion work;
        int smallAns = sumOfArray(arr, idx+1);

        //self work
        return smallAns + arr[idx];
        //int ans = smallAns + arr[idx];
        //return ans;
    }
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        //System.out.println("enter index :");
        //int idx = sc.nextInt();

        System.out.println("required sum of element of array :"+sumOfArray(arr, idx));
    }
}