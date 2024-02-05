//wap to reverese an array

import java.util.*;
public class arrayprob19{
    public static int reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        //traverse original array

        for(int i=n-1; i>=0; i--){
           // ans[i] = arr[i];
            System.out.println(arr[i]+"");
        }
        
        //System.out.println();
        return 0;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " +n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println("reverse array is :"+reverseArray(arr));
        reverseArray(arr);
        

    }
    
}     