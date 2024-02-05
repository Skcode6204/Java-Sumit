//wap to print the factorial of given n, by using recursion.

import java.util.*;
public class Recursion3{
    public static int factorial(int n){
        //base case
        if(n == 0){
            return 1;
        }

        //recursive work
        int smallAns = factorial(n-1);
        

        //self work.
        int ans = n * smallAns;
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();

        System.out.println("the required factorial is :"+factorial(n));
        
    }
}