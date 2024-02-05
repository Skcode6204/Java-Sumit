//take an array input size from the user initaialize the array and print maximum of the number in array

import java.util.*;
public class arrayprob3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int ans = 0;

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("max of number"+ans);
    } 
}