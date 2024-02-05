//wap to print all natural number in reverse order n to 1 using recursion.

import java.util.*;
public class Recursion2{
    public static void printDecreasing(int n){
        //base case or halting.
    if(n == 1){
        System.out.println(1);
        return;
    }

    //self work.
    System.out.println(n);

    //recursion work.

    printDecreasing(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();

        System.out.println("required reverse natural number is :");
        printDecreasing(n);
    }


    


    
}