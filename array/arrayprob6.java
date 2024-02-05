//find the last occurence of the element x in thgiven array

import java.util.*;
public class arrayprob6{
    static int lastOccurence(int[] arr, int x){
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i
;            }
        }
        return lastIndex;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
       
    
     System.out.println("last occurence of x:" +lastOccurence(arr, x));
    }

}
    
