//Given Q queries, check if the given number is presentint hte array or not.

import java.util.*;
public class arrayprob22{
    public static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        System.out.println("enter "+n+ " elements");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("enter no. of queries");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("enter no. to be searched");
            int x = sc.nextInt();

            if(freq[x]>0){
                System.out.println("yess");
            }else{
                System.out.println("no");
            }
            q--;
        }
    }
}