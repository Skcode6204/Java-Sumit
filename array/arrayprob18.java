

import java.util.*;
public class arrayprob18{
    public static void swapNumber(int a, int b){
        System.out.println("value before swapping");
        System.out.println("a :" +a);
        System.out.println("b :" +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("value after swapping");
        System.out.println("a :" +a);
        System.out.println("b :" +b);
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