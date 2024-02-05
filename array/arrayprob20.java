// wap to reverse an array
//confusion

import java.util.*;
public class arrayprob20{
    public static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArray(int[] arr){
        int i=0, j = arr.length;

        while(i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }

    
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        
    }
}