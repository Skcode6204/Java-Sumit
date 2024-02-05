//enter 3 num from the user and make a functions to print their average

import java.util.*;
public class practice1 {
    public static int calculateAverage(int a, int b, int c) {
        int average = (a+b+c)/2;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = calculateAverage(a, b, c);
        System.out.println("average of 3 number is :"+average);

    }
    
}