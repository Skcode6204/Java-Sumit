//Another Approach : Given two number "p" and "q", find power p^q using recursion.

import java.util.*;
public class Recursion7{
    public static int pow(int p, int q){
        //Base case
        if(q == 0){
            return 1;
        }
        //recursive work
        int smallPow = pow(p, q/2);

        //self work.
        if(q%2 == 0){
            int ans = smallPow * smallPow;
            return ans;
        }else{
            int ans = smallPow * smallPow * p;
            return ans;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p :");
        int p = sc.nextInt();
        System.out.println("enter q :");
        int q = sc.nextInt();
        
        System.out.println("required power :"+pow(p, q));
    }
}
