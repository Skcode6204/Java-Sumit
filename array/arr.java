//reverse the array

import java.util.*;
public class arr{
    public static void reverseArray(int[] arr, int n){
        int i = 0;
        int j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(reverseArray(arr, n));
    }
}