//take an array input size from user initialize the array and print their sum using java code  

import java.util.*;
public class arrayprob2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        
        int[] arr = new int[size];
        int sum = 0;

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}