//given an integer array "a" sorted in non decreasing order, return an array of the squares of each number sorted in non decreasing order.  


import java.util.*;
public class arrayprob26{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*public static void reversArray(int[] arr){
        int n = arr.length;
        int ans = 0;
        int[] ans = new int[n];
        for(int i=n-1; i<0; i--){
            System.out.println(arr[i]+" ");  
        }
        //return 0;
    }*/

    public static void sortSquare(int[] arr){
        int n = arr.length;
        int left = 0 ; int right = n-1, k=0;
        int[] ans = new int[n];
        
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println("original array :");
        //printArray(arr);
        sortSquare(arr);
        //reverse(ans);
        System.out.println("sorted array :");
        printArray(arr);
    }
}