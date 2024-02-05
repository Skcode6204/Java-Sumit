

import java.util.*;
public class Recursion5{
    public static int sumOfDigit(int n){
        //Base Case
        if(n >= 0 && n <= 9){
            return n;
        }

        //Recursive work
        int smallAns = sumOfDigit(n/10);

        //self work
        int ans = smallAns + n%10;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();

        System.out.println("required sum of digits is :"+sumOfDigit(n));
        
    }
}