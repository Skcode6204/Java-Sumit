//find the third largest elemnet in array;

import java.util.*;
public class arrayprob15{
    public static int thirdLargest(int[] arr){
        if(arr.length < 3){
            System.out.println("invalid input ");
            return 0;
        }
        //find 1st largest element
        int first = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > first){
                first = arr[i];
            }
        }

         //find 2nd largest element
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
         //find 3rd largest element
        int third = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > third && arr[i] < second){
                third = arr[i];

            }
        }
        return third;
    }

    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.println("enter " + n + " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("third largest element: "+ thirdLargest(arr));
    }
}