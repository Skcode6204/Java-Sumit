//wap to rotate an array "k" times

import java.util.*;
public class arrayprob21{
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" +n+ " elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter k");
        int k = sc.nextInt();

        System.out.println("original array");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
            
        }
        int[] ans = rotateArray(arr, k);
        System.out.println("array after rotation");
        for(int i=0; i<arr.length; i++){
            System.out.println(ans[i] + " ");
            
        }

    }
}