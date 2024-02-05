

import java.util.*;
public class Recursion6{
    public static int pow(int p, int q){
        //Base work
        if(q == 0){
            return 1;
        }

        //recursive work
        int smallAns = pow(p, q-1);

        //self work
        int ans = smallAns * p;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of p :");
        int p = sc.nextInt();
        System.out.println("enter value of q :");
        int q = sc.nextInt();

        System.out.println("required power :"+pow(p, q));
    }
}