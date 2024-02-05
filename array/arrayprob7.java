//wap to find the first and last occurence of the element in the array

import java.util.*;
public class arrayprob7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int x = sc.nextInt();
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x && firstIndex == -1){
                firstIndex = i;
            }
            if(arr[i] == x && firstIndex != -1){
                lastIndex = i;
            }
        }
        System.out.println("first index found at :"+firstIndex);
        System.out.println("last index found at :"+lastIndex);
    }
}