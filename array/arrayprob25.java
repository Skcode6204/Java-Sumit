// given an array of integer "a" move all the even integer at the beginning of the array followed by all the odd integers. the relative order of odd or even integer does not matter. return any arraythat satisfies the conditions.

import java.util.*;
public class arrayprob25{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //initialize function for sorting even ands odd

    public static void sortEvenAndOddElement(int[] arr){
        int n = arr.length;
        int left = 0 ; int right = n-1;
        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){             //this is used to find odd and even
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 1){
                left++;
            }

            if(arr[right] % 2 == 0){
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
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println("original array :");
        //printArray(arr);
        sortEvenAndOddElement(arr);
        System.out.println("sorted array :");
        printArray(arr);
    }
}