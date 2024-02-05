// wap tom sort zeroes and ones in the array;

import java.util.*;
public class arrayprob24{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0,  int right = n-1;
        while(left<right){
            if(arr[left] == 0 && arr[right] == 1){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;

            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("original array :");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("sorted array :");
        printArray(arr);

       
    }
}