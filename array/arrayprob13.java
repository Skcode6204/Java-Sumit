// Pattern : Array Manipulation
//find the unique number in a given array where all the elements are being repeated twice with one value being unique.

import java.util.*;
public class arrayprob13{
    public static int findUnique(int[] arr){
        int size = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;    //strike of
                    arr[j] = -1;    //strike of 

                }
            }
        }
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }

        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter" + size + "element");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the unique number in array is :");
        System.out.println(findUnique(arr));



    }
}