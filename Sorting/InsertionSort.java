//Insertion Sort.

import java.util.*;
public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int j = i;

            while(j>0 && arr[j] < arr[j-1]){
                //swap arr[j], arr[j-1].
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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

        System.out.println("sorted Array :");
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){         
            System.out.print(arr[i]+" ");
        }
    }
}