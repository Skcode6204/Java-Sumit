

import java.util.*;
public class Recursion8{
    public static void printMultiple(int n, int k){
        //Base case
        if(k == 1){
            System.out.println(n);
            return;
        }
        //Recursion work
        printMultiple(n, k-1);

        //self work
        System.out.println(n*k);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        System.out.println("enter k :");
        int k = sc.nextInt();

        System.out.println("required multiple :");
        printMultiple(n, k);
    }
}