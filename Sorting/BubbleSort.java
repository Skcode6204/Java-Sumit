//Bubble Sort.

import java.util.*;
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        //n-1 passes or iteration.
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                //last i element are already at correct sorted position so no need to compare.

                if(arr[j] > arr[j+1]){
                    //swap arr[j], arr[j+1].
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
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

        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }
       
       
    }
}