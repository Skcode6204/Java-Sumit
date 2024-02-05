//swap the number "a" and "b" using java functions

import java.util.*;
public class arrayprob17{
    public static void swapNumber(int a, int b){
        System.out.println("values before swapping");
        System.out.println("a " +a);
        System.out.println("b " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("values after swapping");
        System.out.println("a " +a);
        System.out.println("b " +b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a :");
        int a = sc.nextInt();
        System.out.println("enter value of b :");
        int b = sc.nextInt();
        swapNumber(a, b);
    }
    
}