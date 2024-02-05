//count the number of triplet whose sum is wqual to target sum "x"

import java.util.*;
public class arrayprob12{
    public static int tripletSum(int[] arr, int x){
        int size = arr.length;
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
            
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter" + size + "element");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("the target sum x is :");
        int x = sc.nextInt();

        System.out.println(tripletSum(arr, x));


    }
}