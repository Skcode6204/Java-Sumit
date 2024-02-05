// write a program and take a input from user and check whether given no is even or odd

import java.util.*;
public class ifelse2 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

        //conditions

        if(a % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");

        }
    }

}