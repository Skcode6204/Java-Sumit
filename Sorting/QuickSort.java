//Quick Sort.

import java.util.*;
public class QuickSort{
    public static void displayArray(int[] arr){
        int n = arr.length;
        for(int val=0; val<n; val++){
            System.out.println(arr[val]+" ");
        }
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int strt, int end){
        int pivot = arr[strt];
        int count = 0;
        for(int i=strt+1; i<=end; i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = strt + count;
        swap(arr, strt, pivotIdx);
        int i = strt; int j = end;

        //elements lesser or equal to left of pivotIdx, greater --> right side of pivot;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void quickSort(int[] arr, int strt, int end){
        if(strt >= end) return;
        int pi = partition(arr, strt, end);
        quickSort(arr, strt, pi-1);
        quickSort(arr, pi+1, end);
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
        int strt = 0;
        int end = n - 1;
        System.out.println("array before sorting :");
        displayArray(arr);

        quickSort(arr, strt, end);
        System.out.println("Array after sorting :");
        displayArray(arr);
    }
    
}