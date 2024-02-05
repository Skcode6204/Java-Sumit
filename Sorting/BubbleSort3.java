/*Given an Integer Array arr, move '0's to the end of it while maintaining the relative order of the Non-Zero 
 * element. Note that you must do this in place without making a copy of array.
 * Input - 0 5 0 3 6 9,      Output - 5 3 6 9 0 0.
*/

import java.util.*;
public class BubbleSort3{
    public static void moveZero(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
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

        System.out.println("Sorted Array :");
        moveZero(arr);
        for(int i=0; i<arr.length; i++){         
            System.out.print(arr[i]+" ");  
        } 
    }
}
