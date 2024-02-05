//wap to print fibonacci series using recursion.

import java.util.*;
public class Recursion4{
    public static int fib(int n){
        //base case.

        if(n == 0){                   //or we can write
            return 0;                 // if(n==0 || n==1){
            }                          //return n;
        }                              // }
        if(n == 1){
            return 1;
        }
        //recursive work.

        int prev = fib(n-1);
        int prevprev = fib(n-2);

        //self work.
        int ans = prev + prevprev;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(fib(i));
        }
    
        //System.out.println("required fibonacci series is :"+fib(n));
    }

}
