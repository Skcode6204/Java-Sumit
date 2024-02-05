

import java.util.*;
public class Recursion13{
    public static int maxInArray(int[] arr, int idx){
        //Base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        //recursive work
        int smallAns = maxInArray(arr, idx+1);

        //self work
        return Math.max(smallAns, arr[idx]); 
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

        System.out.println("required maximum element in array :"+maxInArray(arr, idx));
    }
}