//optimize code of the bubble sort in the case of nearly sorted array.

//Bubble Sort.

import java.util.*;
public class BubbleSort2{
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        //n-1 passes or iteration.
        for(int i=0; i<n-1; i++){
            boolean flag = false;  //has any swapping happened.
            for(int j=0; j<n-i-1; j++){
                //last i element are already at correct sorted position so no need to compare.

                if(arr[j] > arr[j+1]){
                    //swap arr[j], arr[j+1].
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;   //some swap is done.
                }
                
            }
            if(flag == false){     //have any swaps happened
                return;
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

        System.out.println("Sorted Array :");
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){         
            System.out.print(arr[i]+" ");   
        }   
    }
}