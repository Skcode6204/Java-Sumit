//wap tom find the Greatest Common Divisor(GCD) of given number "x" & "y" by recursion.

import java.util.*;
public class Recursion10{
    public static int GCD(int x, int y){
        //base case.
        if(y == 0) return x;

        //recursive work
        return GCD(y, x % y);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x :");
        int x = sc.nextInt();
        System.out.println("enter y :");
        int y = sc.nextInt();

        System.out.println("required gcd :"+GCD(x, y));
    }
}
    