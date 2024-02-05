//wap to find occurence of the element of any particular element "x";

import java.util.*;
public class arrayprob5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        int[] arr = new int[size];
        System.out.println("enter all the element :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the element of which you occurence want :");
        x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("number of occurence of x :"+count);
     
    }
    
}