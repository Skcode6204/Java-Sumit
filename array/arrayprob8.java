//wap to count the number of elememt strictly greater than x

import java.util.*;
public class arrayprob8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int x = sc.nextInt();
        int count = 0;

        System.out.println("enter all the element of array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the element of which you find greater than that");
        x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("the number greater than x is :"+count);
    }
}