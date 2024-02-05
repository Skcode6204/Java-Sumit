//wap to print all natural number from 1 to n using recursion.

import java.util.*;
public class Recursion1{
    public static void printIncreasing(int n){
        //base case or halting
        
        if(n == 1){
            System.out.println(1);
            return;
        }

        printIncreasing(n-1);

        System.out.println(n);    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();

        System.out.println("required natural number is :");
        printIncreasing(n);
    }
}