//wap to insert a new element in the array using java functions.

import java.util.*;
public class arrayprob30{
    public static int[] insertArray(int[] arr, int x, int p){
        int n = arr.length;
        int[] arr2 = new int[n+1];
        for(int i=0; i<n+1; i++){
            if(i < p-1){
                arr2[i] = arr[i];
            } else if(i == p-1){
                arr2[i] = x;
            }
            else{
                arr2[i] = arr[i-1];
            }
        }
        return arr2;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to insert :");
        int x = sc.nextInt();

        //position to insert;
        System.out.println("enter the position where we want to insert :");
        int pos = sc.nextInt();

        arr = insertArray(arr, x, pos);

        System.out.println("Array with "+x+" inserted at position "+pos+ ":/n"+ Arrays.toString(arr));


    }
}