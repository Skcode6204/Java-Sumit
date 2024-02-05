//Array Manipulation
//find the second largest element in the given array;


import java.util.*;

public class arrayprob14{
    public static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;

    }
    public static int findSecondMax(int[] arr){
        int mx = findMax(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " element ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("second maximum element: "+ findSecondMax(arr));
    }
}