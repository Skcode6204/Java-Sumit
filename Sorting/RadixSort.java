/*Radix Sort :- 
 * 
 */

import java.util.*;
public class RadixSort{
    public static void displayArray(int[] arr){
        for(int val=0; val<arr.length; val++){
            System.out.println(arr[val]+" ");
        }
    }
    public static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    public static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        //frequency array.
        for(int i=0; i<arr.length; i++){
            count[(arr[i]/place)%10]++;
        }

        //make prefix sum array.
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        //traverse through back.
        for(int i=n-1; i>=0; i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all element of output to arr
        for(int i=0; i<arr.length; i++){
            arr[i] = output[i];
        }
    }

    public static void radixSort(int[] arr){
        int max = findMax(arr);
        //apply counting sort to sort elements based on place value.
        for(int place = 1; max/place > 0; place *= 10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        //int[] arr = {43, 453, 626, 894, 0, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting :");
        displayArray(arr);
        System.out.println("array after sorting :");
        radixSort(arr);
        displayArray(arr);
    } 
}