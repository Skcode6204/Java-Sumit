//given a array constituting of integers. return the first value that is repeating in this array. if not any number repeating then return "0".

import java.util.*;
public class arrayprob16{
    public static int repeatingNumber(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+ " element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("repeating number in array is : "+ repeatingNumber(arr));
    }
    
}