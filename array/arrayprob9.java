//check whether the given array is sorted or not;

import java.util.*;
public class arrayprob9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        boolean check = true;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        for(int i=1; i<arr.length; i++){
            /* i=0
             * arr[0] < arr[-1]
             */
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        System.out.println("is given array sorted :"+check);
    }
}