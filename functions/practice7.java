//two num are enterd by the user, x & n. write a function to fnd the value of one number raised to the power of another

import java.util.*;
public class practice7 {
    public static void main(String args[]){
        System.out.println("enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();

        int result = 1;

        //please see that n is not too large or else result will exceed the size of int.
        for(int i=0; i<n; i++) {
            result = result*x;

        }
        System.out.println("x to the power n is :"+result);
    }
}
