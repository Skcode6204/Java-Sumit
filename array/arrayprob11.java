//count the number of pair whose sum is equal to given value "x"
import java.util.*;
public class arrayprob11{
    public static int pairSum(int[] arr, int x){
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i + 1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter "+ n + "element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target sum x");
        int x = sc.nextInt();

        System.out.println(pairSum(arr, x));

        
    }
}