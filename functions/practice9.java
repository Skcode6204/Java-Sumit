//write a program to print fibonacci series of n terms where n is input by user

import java.util.*;
public class practice9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a+" ");

        if(n>1) {
            //find nth term
            for(int i=2; i<=n; i++){
                System.out.println(b+" ");

                //swapping the num
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}