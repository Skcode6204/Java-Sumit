//wap to return the array of smallest element and largest element from the given array
import java.util.*;
public class arrayprob10{
    public static int[] smallestAndlargerstElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;

    }

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
       // System.out.println("is given array sorted :"+check);
       int[] ans = smallestAndlargerstElement(arr);
       System.out.println("smallest :"+ans[0]);
       System.out.println("largest :"+ans[1]);
    }
}