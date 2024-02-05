//wap to sort zeroes and ones in the array;

import java.util.*;
public class arrayprob23{
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
        int zeroes = 0;
        //count of zeroes
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        //count for ones
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i] = 0;
            } else{
                arr[i] = 1;
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