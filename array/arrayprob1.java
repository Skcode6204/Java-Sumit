//calculate the sum of all the element in the given array
//input: arr[] = {1, 5, 3}
//output = 9

import java.util.*;
public class arrayprob1{
    public static void main(String args[]){
        int[] arr = {1, 5, 3};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }

}