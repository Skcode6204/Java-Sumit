//Count Sort :- 2nd approach.

import java.util.*;
public class CountSort{
    public static void displayArray(int[] arr){
        for(int val = 0; val < arr.length; val++){
            System.out.println(arr[val] + " ");
        }    
    }
    public static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    } 
    public static void countSort(int[] arr){      // 2 4 2 2
        int max = findMax(arr);     //find largest element of the array
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++){
            /* 
               0 0 3 0 1        frequency array.
             * 0 1 2 3 4
             */
            count[arr[i]]++;
        }
        /*int k = 0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }    
        }*/
    } 
    
    public static void countSort2(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //make prefix sum Array.
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }

        //find the index of the each element of the original array and put it in the output array
        for(int i=n-1; i>=0; i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copy all element of output to array.
        for(int i=0; i<arr.length; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting :");
        displayArray(arr);
        System.out.println("array after sorting :");
        countSort2(arr);
        //countSort(arr);
        displayArray(arr);
    } 
}