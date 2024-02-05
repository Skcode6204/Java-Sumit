//Merge Sort.

import java.util.*;
public class MergeSort{
    public static void displayArray(int[] arr){
        for(int val = 0; val<arr.length; val++){
            System.out.println(arr[val]+" ");
        }
    }
    public static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l+1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for(i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(j=0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }

        i=0; j=0; k=l;
        
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i < n1){
            arr[k++] = left[i++];
        }

        while(j < n2){
            arr[k++] = right[j++];
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
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
        int l = 0;
        int r = n - 1;
        System.out.println("array before sorting :");
        displayArray(arr);

        mergeSort(arr, l, r);
        System.out.println("array after sorting :");
        displayArray(arr);

    }
}